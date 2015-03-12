package org.projectfloodlight.openflow.protocol.match;

// MUST BE ORDERED BY THE ORDER OF OF SPEC!!!
public enum MatchFields {
    IN_PORT,
    IN_PHY_PORT,
    METADATA,
    ETH_DST,
    ETH_SRC,
    ETH_TYPE,
    VLAN_VID,
    VLAN_PCP,
    IP_DSCP,
    IP_ECN,
    IP_PROTO,
    IPV4_SRC,
    IPV4_DST,
    TCP_SRC,
    TCP_DST,
    UDP_SRC,
    UDP_DST,
    SCTP_SRC,
    SCTP_DST,
    ICMPV4_TYPE,
    ICMPV4_CODE,
    ARP_OP,
    ARP_SPA,
    ARP_TPA,
    ARP_SHA,
    ARP_THA,
    IPV6_SRC,
    IPV6_DST,
    IPV6_FLABEL,
    ICMPV6_TYPE,
    ICMPV6_CODE,
    IPV6_ND_TARGET,
    IPV6_ND_SLL,
    IPV6_ND_TLL,
    MPLS_LABEL,
    MPLS_TC,
    MPLS_BOS,
    TUNNEL_ID,
    IPV6_EXTHDR,
    PBB_UCA,
    TUNNEL_IPV4_SRC,
    TUNNEL_IPV4_DST,
    BSN_IN_PORTS_128,
    BSN_LAG_ID,
    BSN_VRF,
    BSN_GLOBAL_VRF_ALLOWED,
    BSN_L3_INTERFACE_CLASS_ID,
    BSN_L3_SRC_CLASS_ID,
    BSN_L3_DST_CLASS_ID,
    BSN_EGR_PORT_GROUP_ID,
    BSN_UDF0,
    BSN_UDF1,
    BSN_UDF2,
    BSN_UDF3,
    BSN_UDF4,
    BSN_UDF5,
    BSN_UDF6,
    BSN_UDF7,
    BSN_TCP_FLAGS,
    BSN_VLAN_XLATE_PORT_GROUP_ID,
    BSN_L2_CACHE_HIT,
    /* -------------------------- Fujitsu code start -------------------------- */
    /* Add Optical(OTN) parameters */
    ODU_SIGTYPE,
    ODU_SIGID,
    /* -------------------------- Fujitsu code end ---------------------------- */
}