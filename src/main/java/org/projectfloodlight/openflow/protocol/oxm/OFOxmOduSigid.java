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

package org.projectfloodlight.openflow.protocol.oxm;

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
import org.jboss.netty.buffer.ChannelBuffer;

/**
 * OXM ODU-SIGID field representation
 */
public interface OFOxmOduSigid extends OFObject, OFOxm<OduSigid> {
    long getTypeLen();
    OduSigid getValue();
    MatchField<OduSigid> getMatchField();
    boolean isMasked();
    OFOxm<OduSigid> getCanonical();
    OduSigid getMask();
    OFVersion getVersion();


    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFOxm.Builder<OduSigid> {
        OFOxmOduSigid build();
        long getTypeLen();
        OduSigid getValue();
        Builder setValue(OduSigid value);
        MatchField<OduSigid> getMatchField();
        boolean isMasked();
        OFOxm<OduSigid> getCanonical();
        OduSigid getMask();
        OFVersion getVersion();
    }
}
