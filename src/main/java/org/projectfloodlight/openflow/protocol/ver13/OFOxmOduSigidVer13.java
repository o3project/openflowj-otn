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
 * OXM ODU-SIGID field representation(OpenFlow1.3)
 */
class OFOxmOduSigidVer13 implements OFOxmOduSigid {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmOduSigidVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 9;

        private final static OduSigid DEFAULT_VALUE = OduSigid.NONE;

    // OF message fields
    private final OduSigid value;
//
    // Immutable default instance
    final static OFOxmOduSigidVer13 DEFAULT = new OFOxmOduSigidVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmOduSigidVer13(OduSigid value) {
        if(value == null) {
            throw new NullPointerException("OFOxmOduSigidVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0xffff0605L;
    }

    @Override
    public OduSigid getValue() {
        return value;
    }

    @Override
    public MatchField<OduSigid> getMatchField() {
        return MatchField.ODU_SIGID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OduSigid> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OduSigid getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmOduSigid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmOduSigid.Builder {
        final OFOxmOduSigidVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OduSigid value;

        BuilderWithParent(OFOxmOduSigidVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0xffff0605L;
    }

    @Override
    public OduSigid getValue() {
        return value;
    }

    @Override
    public OFOxmOduSigid.Builder setValue(OduSigid value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OduSigid> getMatchField() {
        return MatchField.ODU_SIGID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OduSigid> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OduSigid getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmOduSigid build() {
                OduSigid value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmOduSigidVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmOduSigid.Builder {
        // OF message fields
        private boolean valueSet;
        private OduSigid value;

    @Override
    public long getTypeLen() {
        return 0xffff0605L;
    }

    @Override
    public OduSigid getValue() {
        return value;
    }

    @Override
    public OFOxmOduSigid.Builder setValue(OduSigid value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OduSigid> getMatchField() {
        return MatchField.ODU_SIGID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OduSigid> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OduSigid getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmOduSigid build() {
            OduSigid value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmOduSigidVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmOduSigid> {
        @Override
        public OFOxmOduSigid readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0xffff0605L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0xffff0605)
                throw new OFParseError("Wrong typeLen: Expected=0xffff0605L(0xffff0605L), got="+typeLen);

            // Experimenter
            bb.skipBytes(4);

            OduSigid value = OduSigid.read5Byte(bb);

            OFOxmOduSigidVer13 oxmOduSigidVer13 = new OFOxmOduSigidVer13(
                    value
                    );

            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmOduSigidVer13);
            return oxmOduSigidVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmOduSigidVer13Funnel FUNNEL = new OFOxmOduSigidVer13Funnel();
    static class OFOxmOduSigidVer13Funnel implements Funnel<OFOxmOduSigidVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmOduSigidVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0xffff0605L
            sink.putInt((int) 0xffff0605);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmOduSigidVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmOduSigidVer13 message) {
            // fixed value property typeLen = 0xffff0605L
            bb.writeInt((int) 0xffff0605);
            message.value.write5Byte(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmOduSigidVer13(");
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
        OFOxmOduSigidVer13 other = (OFOxmOduSigidVer13) obj;

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
