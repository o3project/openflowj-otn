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

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

/**
 * OXM ODU-SIGTYPE field representation(OpenFlow1.3)
 */
class OFOxmOduSigtypeVer13 implements OFOxmOduSigtype {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmOduSigtypeVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 5;

        private final static OduSigtype DEFAULT_VALUE = OduSigtype.NONE;

    // OF message fields
    private final OduSigtype value;
//
    // Immutable default instance
    final static OFOxmOduSigtypeVer13 DEFAULT = new OFOxmOduSigtypeVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmOduSigtypeVer13(OduSigtype value) {
        if(value == null) {
            throw new NullPointerException("OFOxmOduSigtypeVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0xffff0401L;
    }

    @Override
    public OduSigtype getValue() {
        return value;
    }

    @Override
    public MatchField<OduSigtype> getMatchField() {
        return MatchField.ODU_SIGTYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OduSigtype> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OduSigtype getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmOduSigtype.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmOduSigtype.Builder {
        final OFOxmOduSigtypeVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OduSigtype value;

        BuilderWithParent(OFOxmOduSigtypeVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0xffff0401L;
    }

    @Override
    public OduSigtype getValue() {
        return value;
    }

    @Override
    public OFOxmOduSigtype.Builder setValue(OduSigtype value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OduSigtype> getMatchField() {
        return MatchField.ODU_SIGTYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OduSigtype> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OduSigtype getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmOduSigtype build() {
                OduSigtype value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmOduSigtypeVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmOduSigtype.Builder {
        // OF message fields
        private boolean valueSet;
        private OduSigtype value;

    @Override
    public long getTypeLen() {
        return 0xffff0401L;
    }

    @Override
    public OduSigtype getValue() {
        return value;
    }

    @Override
    public OFOxmOduSigtype.Builder setValue(OduSigtype value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OduSigtype> getMatchField() {
        return MatchField.ODU_SIGTYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OduSigtype> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OduSigtype getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmOduSigtype build() {
            OduSigtype value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmOduSigtypeVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmOduSigtype> {
        @Override
        public OFOxmOduSigtype readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0xffff0401L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0xffff0401)
                throw new OFParseError("Wrong typeLen: Expected=0xffff0401L(0xffff0401L), got="+typeLen);

            // Experimenter
            bb.skipBytes(4);

            OduSigtype value = OduSigtype.readByte(bb);

            OFOxmOduSigtypeVer13 oxmIpProtoVer13 = new OFOxmOduSigtypeVer13(
                    value
                    );

            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpProtoVer13);
            return oxmIpProtoVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmOduSigtypeVer13Funnel FUNNEL = new OFOxmOduSigtypeVer13Funnel();
    static class OFOxmOduSigtypeVer13Funnel implements Funnel<OFOxmOduSigtypeVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmOduSigtypeVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0xffff0401L
            sink.putInt((int) 0xffff0401);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmOduSigtypeVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmOduSigtypeVer13 message) {
            // fixed value property typeLen = 0xffff0401L
            bb.writeInt((int) 0xffff0401);
            message.value.writeByte(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmOduSigtypeVer13(");
        b.append("value=").append(value);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFOxmOduSigtypeVer13 other = (OFOxmOduSigtypeVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
