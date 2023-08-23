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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpcTrFirewalls.
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
             * BasicRules.
             */
            public Builder basicRules(Integer basicRules) {
                this.basicRules = basicRules;
                return this;
            }

            /**
             * EnableAllPatch.
             */
            public Builder enableAllPatch(Integer enableAllPatch) {
                this.enableAllPatch = enableAllPatch;
                return this;
            }

            /**
             * RunMode.
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * PeerTrList.
             */
            public Builder peerTrList(java.util.List < String > peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * VbrList.
             */
            public Builder vbrList(java.util.List < String > vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * VpcList.
             */
            public Builder vpcList(java.util.List < String > vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * VpnList.
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * PeerTrList.
             */
            public Builder peerTrList(java.util.List < String > peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * VbrList.
             */
            public Builder vbrList(java.util.List < String > vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * VpcList.
             */
            public Builder vpcList(java.util.List < String > vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * VpnList.
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
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CenName.
             */
            public Builder cenName(String cenName) {
                this.cenName = cenName;
                return this;
            }

            /**
             * FirewallId.
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * FirewallSwitchStatus.
             */
            public Builder firewallSwitchStatus(String firewallSwitchStatus) {
                this.firewallSwitchStatus = firewallSwitchStatus;
                return this;
            }

            /**
             * IpsConfig.
             */
            public Builder ipsConfig(IpsConfig ipsConfig) {
                this.ipsConfig = ipsConfig;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * PrecheckStatus.
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * ProtectedResource.
             */
            public Builder protectedResource(ProtectedResource protectedResource) {
                this.protectedResource = protectedResource;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * RegionStatus.
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * RouteMode.
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * UnprotectedResource.
             */
            public Builder unprotectedResource(UnprotectedResource unprotectedResource) {
                this.unprotectedResource = unprotectedResource;
                return this;
            }

            /**
             * VpcFirewallName.
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
