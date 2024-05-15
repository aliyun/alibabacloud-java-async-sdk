// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallListResponseBody</p>
 */
public class DescribeVpcFirewallListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcFirewalls")
    private java.util.List < VpcFirewalls> vpcFirewalls;

    private DescribeVpcFirewallListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcFirewalls = builder.vpcFirewalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcFirewalls
     */
    public java.util.List < VpcFirewalls> getVpcFirewalls() {
        return this.vpcFirewalls;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VpcFirewalls> vpcFirewalls; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of VPC firewalls.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array that consists of the details about the VPC firewall.
         */
        public Builder vpcFirewalls(java.util.List < VpcFirewalls> vpcFirewalls) {
            this.vpcFirewalls = vpcFirewalls;
            return this;
        }

        public DescribeVpcFirewallListResponseBody build() {
            return new DescribeVpcFirewallListResponseBody(this);
        } 

    } 

    public static class IpsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicRules")
        private Integer basicRules;

        @com.aliyun.core.annotation.NameInMap("EnableAllPatch")
        private Integer enableAllPatch;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private Integer runMode;

        private IpsConfig(Builder builder) {
            this.basicRules = builder.basicRules;
            this.enableAllPatch = builder.enableAllPatch;
            this.runMode = builder.runMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpsConfig create() {
            return builder().build();
        }

        /**
         * @return basicRules
         */
        public Integer getBasicRules() {
            return this.basicRules;
        }

        /**
         * @return enableAllPatch
         */
        public Integer getEnableAllPatch() {
            return this.enableAllPatch;
        }

        /**
         * @return runMode
         */
        public Integer getRunMode() {
            return this.runMode;
        }

        public static final class Builder {
            private Integer basicRules; 
            private Integer enableAllPatch; 
            private Integer runMode; 

            /**
             * Indicates whether basic protection is enabled. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder basicRules(Integer basicRules) {
                this.basicRules = basicRules;
                return this;
            }

            /**
             * Indicates whether virtual patching is enabled. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder enableAllPatch(Integer enableAllPatch) {
                this.enableAllPatch = enableAllPatch;
                return this;
            }

            /**
             * The mode of the IPS. Valid values:
             * <p>
             * 
             * *   **1**: block mode
             * *   **0**: monitor mode
             */
            public Builder runMode(Integer runMode) {
                this.runMode = runMode;
                return this;
            }

            public IpsConfig build() {
                return new IpsConfig(this);
            } 

        } 

    }
    public static class RouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        private RouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopInstanceId = builder.nextHopInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopInstanceId; 

            /**
             * The destination CIDR block of the local VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the local VPC.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            public RouteEntryList build() {
                return new RouteEntryList(this);
            } 

        } 

    }
    public static class VpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List < RouteEntryList> routeEntryList;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        private VpcCidrTableList(Builder builder) {
            this.routeEntryList = builder.routeEntryList;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcCidrTableList create() {
            return builder().build();
        }

        /**
         * @return routeEntryList
         */
        public java.util.List < RouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < RouteEntryList> routeEntryList; 
            private String routeTableId; 

            /**
             * An array that consists of the route entries of the local VPC.
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The ID of the route table for the local VPC.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public VpcCidrTableList build() {
                return new VpcCidrTableList(this);
            } 

        } 

    }
    public static class LocalVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationStatus")
        private String authorizationStatus;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List < VpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private LocalVpc(Builder builder) {
            this.authorizationStatus = builder.authorizationStatus;
            this.ownerId = builder.ownerId;
            this.regionNo = builder.regionNo;
            this.vpcCidrTableList = builder.vpcCidrTableList;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalVpc create() {
            return builder().build();
        }

        /**
         * @return authorizationStatus
         */
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcCidrTableList
         */
        public java.util.List < VpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String authorizationStatus; 
            private Long ownerId; 
            private String regionNo; 
            private java.util.List < VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * Indicates whether Cloud Firewall is authorized to access the local VPC. The value is fixed as authorized, which indicates that Cloud Firewall is authorized to access the local VPC.
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account to which the local VPC belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The region ID of the local VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * An array that consists of the CIDR blocks of the local VPC.
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the local VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the local VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public LocalVpc build() {
                return new LocalVpc(this);
            } 

        } 

    }
    public static class VpcCidrTableListRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        private VpcCidrTableListRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopInstanceId = builder.nextHopInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcCidrTableListRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopInstanceId; 

            /**
             * The destination CIDR block of the peer VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the peer VPC.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            public VpcCidrTableListRouteEntryList build() {
                return new VpcCidrTableListRouteEntryList(this);
            } 

        } 

    }
    public static class PeerVpcVpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List < VpcCidrTableListRouteEntryList> routeEntryList;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        private PeerVpcVpcCidrTableList(Builder builder) {
            this.routeEntryList = builder.routeEntryList;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpcVpcCidrTableList create() {
            return builder().build();
        }

        /**
         * @return routeEntryList
         */
        public java.util.List < VpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < VpcCidrTableListRouteEntryList> routeEntryList; 
            private String routeTableId; 

            /**
             * An array that consists of the route entries of the peer VPC.
             */
            public Builder routeEntryList(java.util.List < VpcCidrTableListRouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The ID of the route table for the peer VPC.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public PeerVpcVpcCidrTableList build() {
                return new PeerVpcVpcCidrTableList(this);
            } 

        } 

    }
    public static class PeerVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationStatus")
        private String authorizationStatus;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private PeerVpc(Builder builder) {
            this.authorizationStatus = builder.authorizationStatus;
            this.ownerId = builder.ownerId;
            this.regionNo = builder.regionNo;
            this.vpcCidrTableList = builder.vpcCidrTableList;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpc create() {
            return builder().build();
        }

        /**
         * @return authorizationStatus
         */
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcCidrTableList
         */
        public java.util.List < PeerVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String authorizationStatus; 
            private Long ownerId; 
            private String regionNo; 
            private java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * Indicates whether Cloud Firewall is authorized to access the peer VPC. The value is fixed as **authorized**, which indicates that Cloud Firewall is authorized to access the peer VPC.
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account to which the peer VPC belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The region ID of the peer VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * An array that consists of the CIDR blocks of the peer VPC.
             */
            public Builder vpcCidrTableList(java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the peer VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the peer VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public PeerVpc build() {
                return new PeerVpc(this);
            } 

        } 

    }
    public static class VpcFirewalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("ConnectSubType")
        private String connectSubType;

        @com.aliyun.core.annotation.NameInMap("ConnectType")
        private String connectType;

        @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
        private String firewallSwitchStatus;

        @com.aliyun.core.annotation.NameInMap("IpsConfig")
        private IpsConfig ipsConfig;

        @com.aliyun.core.annotation.NameInMap("LocalVpc")
        private LocalVpc localVpc;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("PeerVpc")
        private PeerVpc peerVpc;

        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private String regionStatus;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VpcFirewalls(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.connectSubType = builder.connectSubType;
            this.connectType = builder.connectType;
            this.firewallSwitchStatus = builder.firewallSwitchStatus;
            this.ipsConfig = builder.ipsConfig;
            this.localVpc = builder.localVpc;
            this.memberUid = builder.memberUid;
            this.peerVpc = builder.peerVpc;
            this.regionStatus = builder.regionStatus;
            this.resultCode = builder.resultCode;
            this.vpcFirewallId = builder.vpcFirewallId;
            this.vpcFirewallName = builder.vpcFirewallName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcFirewalls create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return connectSubType
         */
        public String getConnectSubType() {
            return this.connectSubType;
        }

        /**
         * @return connectType
         */
        public String getConnectType() {
            return this.connectType;
        }

        /**
         * @return firewallSwitchStatus
         */
        public String getFirewallSwitchStatus() {
            return this.firewallSwitchStatus;
        }

        /**
         * @return ipsConfig
         */
        public IpsConfig getIpsConfig() {
            return this.ipsConfig;
        }

        /**
         * @return localVpc
         */
        public LocalVpc getLocalVpc() {
            return this.localVpc;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return peerVpc
         */
        public PeerVpc getPeerVpc() {
            return this.peerVpc;
        }

        /**
         * @return regionStatus
         */
        public String getRegionStatus() {
            return this.regionStatus;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return vpcFirewallId
         */
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        /**
         * @return vpcFirewallName
         */
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String connectSubType; 
            private String connectType; 
            private String firewallSwitchStatus; 
            private IpsConfig ipsConfig; 
            private LocalVpc localVpc; 
            private String memberUid; 
            private PeerVpc peerVpc; 
            private String regionStatus; 
            private String resultCode; 
            private String vpcFirewallId; 
            private String vpcFirewallName; 

            /**
             * The bandwidth of the Express Connect circuit. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The sub-type of the connection. Valid values:
             * <p>
             * 
             * *   **vpc2vpc**: Express Connect connection
             * *   **vpcpeer**: peer connection
             */
            public Builder connectSubType(String connectSubType) {
                this.connectSubType = connectSubType;
                return this;
            }

            /**
             * The connection type of the VPC firewall. The value is fixed as **expressconnect**, which indicates an Express Connect connection.
             */
            public Builder connectType(String connectType) {
                this.connectType = connectType;
                return this;
            }

            /**
             * The status of the VPC firewall. Valid values:
             * <p>
             * 
             * *   **opened**: The VPC firewall is enabled.
             * *   **closed**: The VPC firewall is disabled.
             * *   **notconfigured**: The VPC firewall is not configured.
             */
            public Builder firewallSwitchStatus(String firewallSwitchStatus) {
                this.firewallSwitchStatus = firewallSwitchStatus;
                return this;
            }

            /**
             * The information about the intrusion prevention system (IPS) configuration.
             */
            public Builder ipsConfig(IpsConfig ipsConfig) {
                this.ipsConfig = ipsConfig;
                return this;
            }

            /**
             * The details about the local VPC.
             */
            public Builder localVpc(LocalVpc localVpc) {
                this.localVpc = localVpc;
                return this;
            }

            /**
             * The UID of the member that is managed by your Alibaba Cloud account.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The details about the peer VPC.
             */
            public Builder peerVpc(PeerVpc peerVpc) {
                this.peerVpc = peerVpc;
                return this;
            }

            /**
             * Indicates whether you can create a VPC firewall in a specified region. Valid values:
             * <p>
             * 
             * *   **enable**: yes
             * *   **disable**: no
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            /**
             * The result code of the operation that creates the VPC firewall. Valid values:
             * <p>
             * 
             * *   **Unauthorized**: Cloud Firewall is not authorized to access a VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
             * *   **RegionDisable**: VPC Firewall is not supported in the region of a VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
             * *   **Empty string**: You can create a VPC firewall for the network instance.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * The instance ID of the VPC firewall.
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * The instance name of the VPC firewall.
             */
            public Builder vpcFirewallName(String vpcFirewallName) {
                this.vpcFirewallName = vpcFirewallName;
                return this;
            }

            public VpcFirewalls build() {
                return new VpcFirewalls(this);
            } 

        } 

    }
}
