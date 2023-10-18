// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2ListResponseBody</p>
 */
public class DescribeTrFirewallsV2ListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("VpcTrFirewalls")
    private java.util.List < VpcTrFirewalls> vpcTrFirewalls;

    private DescribeTrFirewallsV2ListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcTrFirewalls = builder.vpcTrFirewalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2ListResponseBody create() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcTrFirewalls
     */
    public java.util.List < VpcTrFirewalls> getVpcTrFirewalls() {
        return this.vpcTrFirewalls;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List < VpcTrFirewalls> vpcTrFirewalls; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The VPC firewalls.
         */
        public Builder vpcTrFirewalls(java.util.List < VpcTrFirewalls> vpcTrFirewalls) {
            this.vpcTrFirewalls = vpcTrFirewalls;
            return this;
        }

        public DescribeTrFirewallsV2ListResponseBody build() {
            return new DescribeTrFirewallsV2ListResponseBody(this);
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
    public static class ProtectedResource extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("PeerTrList")
        private java.util.List < String > peerTrList;

        @NameInMap("VbrList")
        private java.util.List < String > vbrList;

        @NameInMap("VpcList")
        private java.util.List < String > vpcList;

        @NameInMap("VpnList")
        private java.util.List < String > vpnList;

        private ProtectedResource(Builder builder) {
            this.count = builder.count;
            this.peerTrList = builder.peerTrList;
            this.vbrList = builder.vbrList;
            this.vpcList = builder.vpcList;
            this.vpnList = builder.vpnList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectedResource create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return peerTrList
         */
        public java.util.List < String > getPeerTrList() {
            return this.peerTrList;
        }

        /**
         * @return vbrList
         */
        public java.util.List < String > getVbrList() {
            return this.vbrList;
        }

        /**
         * @return vpcList
         */
        public java.util.List < String > getVpcList() {
            return this.vpcList;
        }

        /**
         * @return vpnList
         */
        public java.util.List < String > getVpnList() {
            return this.vpnList;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < String > peerTrList; 
            private java.util.List < String > vbrList; 
            private java.util.List < String > vpcList; 
            private java.util.List < String > vpnList; 

            /**
             * The number of protected resources.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The protected peer transit routers.
             */
            public Builder peerTrList(java.util.List < String > peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * The protected virtual border routers (VBRs).
             */
            public Builder vbrList(java.util.List < String > vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * The protected VPCs.
             */
            public Builder vpcList(java.util.List < String > vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * The protected VPN gateways.
             */
            public Builder vpnList(java.util.List < String > vpnList) {
                this.vpnList = vpnList;
                return this;
            }

            public ProtectedResource build() {
                return new ProtectedResource(this);
            } 

        } 

    }
    public static class UnprotectedResource extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("PeerTrList")
        private java.util.List < String > peerTrList;

        @NameInMap("VbrList")
        private java.util.List < String > vbrList;

        @NameInMap("VpcList")
        private java.util.List < String > vpcList;

        @NameInMap("VpnList")
        private java.util.List < String > vpnList;

        private UnprotectedResource(Builder builder) {
            this.count = builder.count;
            this.peerTrList = builder.peerTrList;
            this.vbrList = builder.vbrList;
            this.vpcList = builder.vpcList;
            this.vpnList = builder.vpnList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnprotectedResource create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return peerTrList
         */
        public java.util.List < String > getPeerTrList() {
            return this.peerTrList;
        }

        /**
         * @return vbrList
         */
        public java.util.List < String > getVbrList() {
            return this.vbrList;
        }

        /**
         * @return vpcList
         */
        public java.util.List < String > getVpcList() {
            return this.vpcList;
        }

        /**
         * @return vpnList
         */
        public java.util.List < String > getVpnList() {
            return this.vpnList;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < String > peerTrList; 
            private java.util.List < String > vbrList; 
            private java.util.List < String > vpcList; 
            private java.util.List < String > vpnList; 

            /**
             * The number of unprotected resources.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The unprotected peer transit routers.
             */
            public Builder peerTrList(java.util.List < String > peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * The unprotected VBRs.
             */
            public Builder vbrList(java.util.List < String > vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * The unprotected VPCs.
             */
            public Builder vpcList(java.util.List < String > vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * The unprotected VPN gateways.
             */
            public Builder vpnList(java.util.List < String > vpnList) {
                this.vpnList = vpnList;
                return this;
            }

            public UnprotectedResource build() {
                return new UnprotectedResource(this);
            } 

        } 

    }
    public static class VpcTrFirewalls extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CenName")
        private String cenName;

        @NameInMap("FirewallId")
        private String firewallId;

        @NameInMap("FirewallSwitchStatus")
        private String firewallSwitchStatus;

        @NameInMap("IpsConfig")
        private IpsConfig ipsConfig;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("PrecheckStatus")
        private String precheckStatus;

        @NameInMap("ProtectedResource")
        private ProtectedResource protectedResource;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RegionStatus")
        private String regionStatus;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("RouteMode")
        private String routeMode;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("UnprotectedResource")
        private UnprotectedResource unprotectedResource;

        @NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VpcTrFirewalls(Builder builder) {
            this.cenId = builder.cenId;
            this.cenName = builder.cenName;
            this.firewallId = builder.firewallId;
            this.firewallSwitchStatus = builder.firewallSwitchStatus;
            this.ipsConfig = builder.ipsConfig;
            this.ownerId = builder.ownerId;
            this.precheckStatus = builder.precheckStatus;
            this.protectedResource = builder.protectedResource;
            this.regionNo = builder.regionNo;
            this.regionStatus = builder.regionStatus;
            this.resultCode = builder.resultCode;
            this.routeMode = builder.routeMode;
            this.transitRouterId = builder.transitRouterId;
            this.unprotectedResource = builder.unprotectedResource;
            this.vpcFirewallName = builder.vpcFirewallName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcTrFirewalls create() {
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
         * @return firewallId
         */
        public String getFirewallId() {
            return this.firewallId;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return precheckStatus
         */
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return protectedResource
         */
        public ProtectedResource getProtectedResource() {
            return this.protectedResource;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
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
         * @return routeMode
         */
        public String getRouteMode() {
            return this.routeMode;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return unprotectedResource
         */
        public UnprotectedResource getUnprotectedResource() {
            return this.unprotectedResource;
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
            private String firewallId; 
            private String firewallSwitchStatus; 
            private IpsConfig ipsConfig; 
            private Long ownerId; 
            private String precheckStatus; 
            private ProtectedResource protectedResource; 
            private String regionNo; 
            private String regionStatus; 
            private String resultCode; 
            private String routeMode; 
            private String transitRouterId; 
            private UnprotectedResource unprotectedResource; 
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
             * The instance ID of the VPC firewall.
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * The status of the VPC firewall. Valid values:
             * <p>
             * 
             * *   **opened**: The VPC firewall is enabled.
             * *   **closed**: The VPC firewall is disabled.
             * *   **notconfigured**: The VPC firewall is not created.
             * *   **configured**: The VPC firewall is created but is not enabled.
             * *   **creating**: The VPC firewall is being created.
             * *   **opening**: The VPC firewall is being enabled.
             * *   **deleting**: The VPC firewall is being deleted.
             * 
             * >  If you do not specify this parameter, VPC firewalls in all states are queried.
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
             * The ID of the Alibaba Cloud account to which the VPC belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Indicates whether the VPC firewall can be automatically enabled. Valid values:
             * <p>
             * 
             * *   **passed**: yes
             * *   **failed**: no
             * *   **unknown**
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The protected resources.
             */
            public Builder protectedResource(ProtectedResource protectedResource) {
                this.protectedResource = protectedResource;
                return this;
            }

            /**
             * The region ID of the transit router.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
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
             * *   **RegionDisable**: VPC Firewall is not supported in the region of the network instance. You cannot create a VPC firewall for the network instance.
             * *   **Empty string**: You can create a VPC firewall for the network instance.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * The routing mode of the VPC firewall. Valid values:
             * <p>
             * 
             * *   **managed**: automatic mode
             * *   **manual**: manual mode
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * The ID of the transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The unprotected resources.
             */
            public Builder unprotectedResource(UnprotectedResource unprotectedResource) {
                this.unprotectedResource = unprotectedResource;
                return this;
            }

            /**
             * The instance name of the VPC firewall.
             */
            public Builder vpcFirewallName(String vpcFirewallName) {
                this.vpcFirewallName = vpcFirewallName;
                return this;
            }

            public VpcTrFirewalls build() {
                return new VpcTrFirewalls(this);
            } 

        } 

    }
}
