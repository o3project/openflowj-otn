// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

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
import com.google.common.collect.ImmutableSet;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFGetConfigReplyVer13 implements OFGetConfigReply {
    private static final Logger logger = LoggerFactory.getLogger(OFGetConfigReplyVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFConfigFlags> DEFAULT_FLAGS = ImmutableSet.<OFConfigFlags>of();
        private final static int DEFAULT_MISS_SEND_LEN = 0x0;

    // OF message fields
    private final long xid;
    private final Set<OFConfigFlags> flags;
    private final int missSendLen;
//
    // Immutable default instance
    final static OFGetConfigReplyVer13 DEFAULT = new OFGetConfigReplyVer13(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_MISS_SEND_LEN
    );

    // package private constructor - used by readers, builders, and factory
    OFGetConfigReplyVer13(long xid, Set<OFConfigFlags> flags, int missSendLen) {
        if(flags == null) {
            throw new NullPointerException("OFGetConfigReplyVer13: property flags cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.missSendLen = missSendLen;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public Set<OFConfigFlags> getFlags() {
        return flags;
    }

    @Override
    public int getMissSendLen() {
        return missSendLen;
    }



    public OFGetConfigReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGetConfigReply.Builder {
        final OFGetConfigReplyVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFConfigFlags> flags;
        private boolean missSendLenSet;
        private int missSendLen;

        BuilderWithParent(OFGetConfigReplyVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGetConfigReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public Set<OFConfigFlags> getFlags() {
        return flags;
    }

    @Override
    public OFGetConfigReply.Builder setFlags(Set<OFConfigFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public int getMissSendLen() {
        return missSendLen;
    }

    @Override
    public OFGetConfigReply.Builder setMissSendLen(int missSendLen) {
        this.missSendLen = missSendLen;
        this.missSendLenSet = true;
        return this;
    }


        @Override
        public OFGetConfigReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFConfigFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                int missSendLen = this.missSendLenSet ? this.missSendLen : parentMessage.missSendLen;

                //
                return new OFGetConfigReplyVer13(
                    xid,
                    flags,
                    missSendLen
                );
        }

    }

    static class Builder implements OFGetConfigReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFConfigFlags> flags;
        private boolean missSendLenSet;
        private int missSendLen;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGetConfigReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public Set<OFConfigFlags> getFlags() {
        return flags;
    }

    @Override
    public OFGetConfigReply.Builder setFlags(Set<OFConfigFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public int getMissSendLen() {
        return missSendLen;
    }

    @Override
    public OFGetConfigReply.Builder setMissSendLen(int missSendLen) {
        this.missSendLen = missSendLen;
        this.missSendLenSet = true;
        return this;
    }
//
        @Override
        public OFGetConfigReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFConfigFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            int missSendLen = this.missSendLenSet ? this.missSendLen : DEFAULT_MISS_SEND_LEN;


            return new OFGetConfigReplyVer13(
                    xid,
                    flags,
                    missSendLen
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFGetConfigReply> {
        @Override
        public OFGetConfigReply readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 8
            byte type = bb.readByte();
            if(type != (byte) 0x8)
                throw new OFParseError("Wrong type: Expected=OFType.GET_CONFIG_REPLY(8), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 12)
                throw new OFParseError("Wrong length: Expected=12(12), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            Set<OFConfigFlags> flags = OFConfigFlagsSerializerVer13.readFrom(bb);
            int missSendLen = U16.f(bb.readShort());

            OFGetConfigReplyVer13 getConfigReplyVer13 = new OFGetConfigReplyVer13(
                    xid,
                      flags,
                      missSendLen
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", getConfigReplyVer13);
            return getConfigReplyVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGetConfigReplyVer13Funnel FUNNEL = new OFGetConfigReplyVer13Funnel();
    static class OFGetConfigReplyVer13Funnel implements Funnel<OFGetConfigReplyVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGetConfigReplyVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 8
            sink.putByte((byte) 0x8);
            // fixed value property length = 12
            sink.putShort((short) 0xc);
            sink.putLong(message.xid);
            OFConfigFlagsSerializerVer13.putTo(message.flags, sink);
            sink.putInt(message.missSendLen);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGetConfigReplyVer13> {
        @Override
        public void write(ChannelBuffer bb, OFGetConfigReplyVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 8
            bb.writeByte((byte) 0x8);
            // fixed value property length = 12
            bb.writeShort((short) 0xc);
            bb.writeInt(U32.t(message.xid));
            OFConfigFlagsSerializerVer13.writeTo(bb, message.flags);
            bb.writeShort(U16.t(message.missSendLen));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGetConfigReplyVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("missSendLen=").append(missSendLen);
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
        OFGetConfigReplyVer13 other = (OFGetConfigReplyVer13) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if( missSendLen != other.missSendLen)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + missSendLen;
        return result;
    }

}