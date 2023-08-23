// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenListResponseBody</p>
 */
public class DescribeVpcFirewallCenListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpcFirewalls")
    private java.util.List < VpcFirewalls> vpcFirewalls;

    private DescribeVpcFirewallCenListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcFirewalls = builder.vpcFirewalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenListResponseBody create() {
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

        public DescribeVpcFirewallCenListResponseBody build() {
            return new DescribeVpcFirewallCenListResponseBody(this);
        } 

    } 

    public static class IpsConfig extends TeaModel {
        @NameInMap("BasicRules")
        private Integer basicRules;

        @NameInMap("EnableAllPatch")
        private Integer enableAllPatch;

        @NameInMap("RunMode")
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
        @NameInMap("DestinationCidr")
        private String destinationCidr;

        @NameInMap("NextHopInstanceId")
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
             * The destination CIDR block of the VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the VPC.
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
        @NameInMap("RouteEntryList")
        private java.util.List < RouteEntryList> routeEntryList;

        @NameInMap("RouteTableId")
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
             * An array that consists of the route entries for the VPC.
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The route table ID of the VPC.
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
        @NameInMap("AuthorizationStatus")
        private String authorizationStatus;

        @NameInMap("DefendCidrList")
        private java.util.List < String > defendCidrList;

        @NameInMap("ManualVSwitchId")
        private String manualVSwitchId;

        @NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @NameInMap("NetworkInstanceType")
        private String networkInstanceType;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RouteMode")
        private String routeMode;

        @NameInMap("SupportManualMode")
        private String supportManualMode;

        @NameInMap("TransitRouterType")
        private String transitRouterType;

        @NameInMap("VpcCidrTableList")
        private java.util.List < VpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private LocalVpc(Builder builder) {
            this.authorizationStatus = builder.authorizationStatus;
            this.defendCidrList = builder.defendCidrList;
            this.manualVSwitchId = builder.manualVSwitchId;
            this.networkInstanceId = builder.networkInstanceId;
            this.networkInstanceName = builder.networkInstanceName;
            this.networkInstanceType = builder.networkInstanceType;
            this.ownerId = builder.ownerId;
            this.regionNo = builder.regionNo;
            this.routeMode = builder.routeMode;
            this.supportManualMode = builder.supportManualMode;
            this.transitRouterType = builder.transitRouterType;
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
         * @return defendCidrList
         */
        public java.util.List < String > getDefendCidrList() {
            return this.defendCidrList;
        }

        /**
         * @return manualVSwitchId
         */
        public String getManualVSwitchId() {
            return this.manualVSwitchId;
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return networkInstanceName
         */
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        /**
         * @return networkInstanceType
         */
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
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
         * @return routeMode
         */
        public String getRouteMode() {
            return this.routeMode;
        }

        /**
         * @return supportManualMode
         */
        public String getSupportManualMode() {
            return this.supportManualMode;
        }

        /**
         * @return transitRouterType
         */
        public String getTransitRouterType() {
            return this.transitRouterType;
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
            private java.util.List < String > defendCidrList; 
            private String manualVSwitchId; 
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String networkInstanceType; 
            private Long ownerId; 
            private String regionNo; 
            private String routeMode; 
            private String supportManualMode; 
            private String transitRouterType; 
            private java.util.List < VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * Indicates whether the VPC is granted the required permissions. The value is fixed as **authorized**, which indicates that the VPC is granted the required permissions.
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * An array consisting of the CIDR blocks that are protected by the VPC firewall.
             */
            public Builder defendCidrList(java.util.List < String > defendCidrList) {
                this.defendCidrList = defendCidrList;
                return this;
            }

            /**
             * The ID of the specified vSwitch when the routing mode is manual.
             */
            public Builder manualVSwitchId(String manualVSwitchId) {
                this.manualVSwitchId = manualVSwitchId;
                return this;
            }

            /**
             * The ID of the network instance.
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * The name of the network instance.
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * The type of the network instance. Valid values:
             * <p>
             * 
             * *   **VPC**
             * *   **VBR**
             * *   **CCN**
             */
            public Builder networkInstanceType(String networkInstanceType) {
                this.networkInstanceType = networkInstanceType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the VPC belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The region ID of the VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The routing mode of the VPC firewall. Valid values:
             * <p>
             * 
             * *   **auto**: automatic mode
             * *   **manual**: manual mode
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * Indicates whether the manual routing mode is supported. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder supportManualMode(String supportManualMode) {
                this.supportManualMode = supportManualMode;
                return this;
            }

            /**
             * The edition of the CEN transit router. Valid values:
             * <p>
             * 
             * *   **Basic**: Basic Edition transit router
             * *   **Enterprise**: Enterprise Edition transit router
             */
            public Builder transitRouterType(String transitRouterType) {
                this.transitRouterType = transitRouterType;
                return this;
            }

            /**
             * An array that consists of the CIDR blocks of the VPC.
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
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
    public static class VpcFirewalls extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CenName")
        private String cenName;

        @NameInMap("ConnectType")
        private String connectType;

        @NameInMap("FirewallSwitchStatus")
        private String firewallSwitchStatus;

        @NameInMap("IpsConfig")
        private IpsConfig ipsConfig;

        @NameInMap("LocalVpc")
        private LocalVpc localVpc;

        @NameInMap("MemberUid")
        private String memberUid;

        @NameInMap("PrecheckStatus")
        private String precheckStatus;

        @NameInMap("RegionStatus")
        private String regionStatus;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VpcFirewalls(Builder builder) {
            this.cenId = builder.cenId;
            this.cenName = builder.cenName;
            this.connectType = builder.connectType;
            this.firewallSwitchStatus = builder.firewallSwitchStatus;
            this.ipsConfig = builder.ipsConfig;
            this.localVpc = builder.localVpc;
            this.memberUid = builder.memberUid;
            this.precheckStatus = builder.precheckStatus;
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
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenName
         */
        public String getCenName() {
            return this.cenName;
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
         * @return precheckStatus
         */
        public String getPrecheckStatus() {
            return this.precheckStatus;
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
            private String cenId; 
            private String cenName; 
            private String connectType; 
            private String firewallSwitchStatus; 
            private IpsConfig ipsConfig; 
            private LocalVpc localVpc; 
            private String memberUid; 
            private String precheckStatus; 
            private String regionStatus; 
            private String resultCode; 
            private String vpcFirewallId; 
            private String vpcFirewallName; 

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The name of the CEN instance.
             */
            public Builder cenName(String cenName) {
                this.cenName = cenName;
                return this;
            }

            /**
             * The connection type of the VPC firewall. The value is fixed as cen, which indicates a CEN instance.
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
             * The details about the VPC.
             */
            public Builder localVpc(LocalVpc localVpc) {
                this.localVpc = localVpc;
                return this;
            }

            /**
             * The UID of the member that is manged by your Alibaba Cloud account. The member is also an Alibaba Cloud account.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * Indicates whether the VPC firewall can be automatically enabled to protect VPC traffic based on route learning. Valid values:
             * <p>
             * 
             * *   **passed**: The VPC firewall can be automatically enabled.
             * *   **failed**: The VPC firewall cannot be automatically enabled.
             * *   **unknown**: The VPC firewall is in an unknown state.
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
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
             * *   **Unauthorized**: Cloud Firewall is not authorized to access the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
             * *   **RegionDisable**: VPC Firewall is not supported in the region of the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
             * *   **OpsDisable**: You are not allowed to create the VPC firewall.
             * *   **VbrNotSupport**: The VPC firewall cannot be created for a VBR that is attached to the CEN instance.
             * *   Empty string: You can create a VPC firewall for the network instance.
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
