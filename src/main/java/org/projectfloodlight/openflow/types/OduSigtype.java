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

import com.google.common.hash.PrimitiveSink;
import com.google.common.primitives.Shorts;

/**
 * ODU-SIGTYPE field representation
 */
public class OduSigtype implements OFValueType<OduSigtype> {

    static final short MAX_SIGTYPE = 0xFF;
    static final int LENGTH = 1;

    private final short sigtype;

    static final short NUM_OFPODUT_ODU0        = 0x0a;
    static final short NUM_OFPODUT_ODU1        = 0x01;
    static final short NUM_OFPODUT_ODU2        = 0x02;
    static final short NUM_OFPODUT_ODU3        = 0x03;
    static final short NUM_OFPODUT_ODU4        = 0x04;
    static final short NUM_OFPODUT_ODU2E       = 0x0b;
    static final short NUM_OFPODUT_ODUfCBR     = 0x14;
    static final short NUM_OFPODUT_ODUfGFPfHAO = 0x15;
    static final short NUM_OFPODUT_ODUfGFPf    = 0x16;

    public static final OduSigtype OFPODUT_ODU0        = new OduSigtype(NUM_OFPODUT_ODU0);
    public static final OduSigtype OFPODUT_ODU1        = new OduSigtype(NUM_OFPODUT_ODU1);
    public static final OduSigtype OFPODUT_ODU2        = new OduSigtype(NUM_OFPODUT_ODU2);
    public static final OduSigtype OFPODUT_ODU3        = new OduSigtype(NUM_OFPODUT_ODU3);
    public static final OduSigtype OFPODUT_ODU4        = new OduSigtype(NUM_OFPODUT_ODU4);
    public static final OduSigtype OFPODUT_ODU2E       = new OduSigtype(NUM_OFPODUT_ODU2E);
    public static final OduSigtype OFPODUT_ODUfCBR     = new OduSigtype(NUM_OFPODUT_ODUfCBR);
    public static final OduSigtype OFPODUT_ODUfGFPfHAO = new OduSigtype(NUM_OFPODUT_ODUfGFPfHAO);
    public static final OduSigtype OFPODUT_ODUfGFPf    = new OduSigtype(NUM_OFPODUT_ODUfGFPf);

    public static final OduSigtype NONE = OFPODUT_ODU1;

    public static final OduSigtype NO_MASK = OFPODUT_ODU1;
    public static final OduSigtype FULL_MASK = new OduSigtype((short)0x0000);

    private OduSigtype(short sigtype) {
        this.sigtype = sigtype;
    }


    @Override
    public int getLength() {
        return LENGTH;
    }

    public static OduSigtype of(short sigtype) {
        switch (sigtype) {
            case NUM_OFPODUT_ODU0:
                return OFPODUT_ODU0;
            case NUM_OFPODUT_ODU1:
                return OFPODUT_ODU1;
            case NUM_OFPODUT_ODU2:
                return OFPODUT_ODU2;
            case NUM_OFPODUT_ODU3:
                return OFPODUT_ODU3;
            case NUM_OFPODUT_ODU4:
                return OFPODUT_ODU4;
            case NUM_OFPODUT_ODU2E:
                return OFPODUT_ODU2E;
            case NUM_OFPODUT_ODUfCBR:
                return OFPODUT_ODUfCBR;
            case NUM_OFPODUT_ODUfGFPfHAO:
                return OFPODUT_ODUfGFPfHAO;
            case NUM_OFPODUT_ODUfGFPf:
                return OFPODUT_ODUfGFPf;
            default:
                if (sigtype >= MAX_SIGTYPE) {
                    throw new IllegalArgumentException("Illegal ODU-signal-type number: "
                            + sigtype);
                } else {
                    return new OduSigtype(sigtype);
                }
        }
    }

    @Override
    public String toString() {
        return Integer.toHexString(sigtype);
    }

    public void writeByte(ChannelBuffer c) {
        c.writeByte(this.sigtype);
    }

    public static OduSigtype readByte(ChannelBuffer c) {
        return OduSigtype.of(c.readUnsignedByte());
    }

    @Override
    public OduSigtype applyMask(OduSigtype mask) {
        return OduSigtype.of((short)(this.sigtype & mask.sigtype));
    }

    public short getOduSigtypeNumber() {
        return sigtype;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OduSigtype))
            return false;
        OduSigtype o = (OduSigtype)obj;
        if (o.sigtype != this.sigtype)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + sigtype;
        return result;
    }


    @Override
    public int compareTo(OduSigtype o) {
        return Shorts.compare(sigtype, o.sigtype);
    }


    @Override
    public void putTo(PrimitiveSink sink) {
        sink.putShort(sigtype);
    }

}