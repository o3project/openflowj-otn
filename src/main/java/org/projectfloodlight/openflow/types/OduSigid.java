/* 
* Copyright 2015 FUJITSU LIMITED. 
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
*   http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
*/

package org.projectfloodlight.openflow.types;

import org.jboss.netty.buffer.ChannelBuffer;
import org.projectfloodlight.openflow.util.HexString;

import com.google.common.hash.PrimitiveSink;
import com.google.common.primitives.Longs;

/**
 * ODU-SIGID field representation
 */
public class OduSigid implements OFValueType<OduSigid> {

    static final long MAX_SIGID = 0xFFFFFFFFFFL;
    static final int LENGTH = 5;

    private final long rawValue;
    private final short tpn;
    private final short tslen;
    private final short tsmap;

    public static final OduSigid NONE = OduSigid.of(0x0L);

    private OduSigid(long raw) {
        this.rawValue = raw;
        this.tpn   = (short) ((rawValue & 0xFFF0000000L) >> 7 * 4);
        this.tslen = (short) ((rawValue & 0x00000FFF00 ) >> 2 * 4);
        this.tsmap = (short)  (rawValue & 0x00000000FF );
    }

    @Override
    public int getLength() {
        return LENGTH;
    }

    public static OduSigid of(long raw) {
        if (raw >= MAX_SIGID) {
            throw new IllegalArgumentException("Illegal ODU-signal-id value: " + raw);
        } else {
            return new OduSigid(raw);
        }
    }

    @Override
    public String toString() {
        return HexString.toHexString(rawValue, 5);
    }

    public void write5Byte(ChannelBuffer c) {
        c.writeInt((int) (this.rawValue >> 8));
        c.writeByte((int) (this.rawValue & 0xFF));
    }

    public static OduSigid read5Byte(ChannelBuffer c) {
    	long raw = c.readUnsignedInt() << 8 | c.readUnsignedByte() & 0xFF;
        return OduSigid.of(raw);
    }

    @Override
    public OduSigid applyMask(OduSigid mask) {
        return OduSigid.of(this.rawValue & mask.rawValue);
    }

    public long getLong() {
        return rawValue;
    }

    public short getTpn() {
      return tpn;
    }

    public short getTslen() {
      return tslen;
    }

    public short getTsmap() {
      return tsmap;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OduSigid))
            return false;
        OduSigid o = (OduSigid)obj;
        if (o.rawValue != this.rawValue)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (int) (rawValue ^ (rawValue >>> 32));
      return result;
    }

    @Override
    public int compareTo(OduSigid o) {
        return Longs.compare(rawValue, o.rawValue);
    }


    @Override
    public void putTo(PrimitiveSink sink) {
    	sink.putInt((int) (this.rawValue >> 8));
    	sink.putByte((byte) (this.rawValue & 0xFF));
    }

}