// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2ListResponseBody</p>
 */
public class DescribeTrFirewallsV2ListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcTrFirewalls")
    private java.util.List<VpcTrFirewalls> vpcTrFirewalls;

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
    public java.util.List<VpcTrFirewalls> getVpcTrFirewalls() {
        return this.vpcTrFirewalls;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List<VpcTrFirewalls> vpcTrFirewalls; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1471E2EC-F706-5F11-A79B-BD583ACB8297</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the VPC firewalls.</p>
         */
        public Builder vpcTrFirewalls(java.util.List<VpcTrFirewalls> vpcTrFirewalls) {
            this.vpcTrFirewalls = vpcTrFirewalls;
            return this;
        }

        public DescribeTrFirewallsV2ListResponseBody build() {
            return new DescribeTrFirewallsV2ListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2ListResponseBody</p>
     */
    public static class IpsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicRules")
        private Integer basicRules;

        @com.aliyun.core.annotation.NameInMap("EnableAllPatch")
        private Integer enableAllPatch;

        @com.aliyun.core.annotation.NameInMap("RuleClass")
        private Integer ruleClass;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private Integer runMode;

        private IpsConfig(Builder builder) {
            this.basicRules = builder.basicRules;
            this.enableAllPatch = builder.enableAllPatch;
            this.ruleClass = builder.ruleClass;
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
         * @return ruleClass
         */
        public Integer getRuleClass() {
            return this.ruleClass;
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
            private Integer ruleClass; 
            private Integer runMode; 

            /**
             * <p>Indicates whether basic protection is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder basicRules(Integer basicRules) {
                this.basicRules = basicRules;
                return this;
            }

            /**
             * <p>Indicates whether virtual patching is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableAllPatch(Integer enableAllPatch) {
                this.enableAllPatch = enableAllPatch;
                return this;
            }

            /**
             * <p>The level of the rule group for the IPS. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: loose.</li>
             * <li><strong>2</strong>: medium.</li>
             * <li><strong>3</strong>: strict.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ruleClass(Integer ruleClass) {
                this.ruleClass = ruleClass;
                return this;
            }

            /**
             * <p>The mode of the IPS. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: block mode</li>
             * <li><strong>0</strong>: monitor mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2ListResponseBody</p>
     */
    public static class ProtectedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("EcrList")
        private java.util.List<String> ecrList;

        @com.aliyun.core.annotation.NameInMap("PeerTrList")
        private java.util.List<String> peerTrList;

        @com.aliyun.core.annotation.NameInMap("VbrList")
        private java.util.List<String> vbrList;

        @com.aliyun.core.annotation.NameInMap("VpcList")
        private java.util.List<String> vpcList;

        @com.aliyun.core.annotation.NameInMap("VpnList")
        private java.util.List<String> vpnList;

        private ProtectedResource(Builder builder) {
            this.count = builder.count;
            this.ecrList = builder.ecrList;
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
         * @return ecrList
         */
        public java.util.List<String> getEcrList() {
            return this.ecrList;
        }

        /**
         * @return peerTrList
         */
        public java.util.List<String> getPeerTrList() {
            return this.peerTrList;
        }

        /**
         * @return vbrList
         */
        public java.util.List<String> getVbrList() {
            return this.vbrList;
        }

        /**
         * @return vpcList
         */
        public java.util.List<String> getVpcList() {
            return this.vpcList;
        }

        /**
         * @return vpnList
         */
        public java.util.List<String> getVpnList() {
            return this.vpnList;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<String> ecrList; 
            private java.util.List<String> peerTrList; 
            private java.util.List<String> vbrList; 
            private java.util.List<String> vpcList; 
            private java.util.List<String> vpnList; 

            /**
             * <p>The number of protected resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The protected express connect routers.</p>
             */
            public Builder ecrList(java.util.List<String> ecrList) {
                this.ecrList = ecrList;
                return this;
            }

            /**
             * <p>The protected peer transit routers.</p>
             */
            public Builder peerTrList(java.util.List<String> peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * <p>The protected virtual border routers (VBRs).</p>
             */
            public Builder vbrList(java.util.List<String> vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * <p>The protected VPCs.</p>
             */
            public Builder vpcList(java.util.List<String> vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * <p>The protected VPN gateways.</p>
             */
            public Builder vpnList(java.util.List<String> vpnList) {
                this.vpnList = vpnList;
                return this;
            }

            public ProtectedResource build() {
                return new ProtectedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2ListResponseBody</p>
     */
    public static class UnprotectedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("EcrList")
        private java.util.List<String> ecrList;

        @com.aliyun.core.annotation.NameInMap("PeerTrList")
        private java.util.List<String> peerTrList;

        @com.aliyun.core.annotation.NameInMap("VbrList")
        private java.util.List<String> vbrList;

        @com.aliyun.core.annotation.NameInMap("VpcList")
        private java.util.List<String> vpcList;

        @com.aliyun.core.annotation.NameInMap("VpnList")
        private java.util.List<String> vpnList;

        private UnprotectedResource(Builder builder) {
            this.count = builder.count;
            this.ecrList = builder.ecrList;
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
         * @return ecrList
         */
        public java.util.List<String> getEcrList() {
            return this.ecrList;
        }

        /**
         * @return peerTrList
         */
        public java.util.List<String> getPeerTrList() {
            return this.peerTrList;
        }

        /**
         * @return vbrList
         */
        public java.util.List<String> getVbrList() {
            return this.vbrList;
        }

        /**
         * @return vpcList
         */
        public java.util.List<String> getVpcList() {
            return this.vpcList;
        }

        /**
         * @return vpnList
         */
        public java.util.List<String> getVpnList() {
            return this.vpnList;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<String> ecrList; 
            private java.util.List<String> peerTrList; 
            private java.util.List<String> vbrList; 
            private java.util.List<String> vpcList; 
            private java.util.List<String> vpnList; 

            /**
             * <p>The number of unprotected resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The unprotected express connect routers.</p>
             */
            public Builder ecrList(java.util.List<String> ecrList) {
                this.ecrList = ecrList;
                return this;
            }

            /**
             * <p>The unprotected peer transit routers.</p>
             */
            public Builder peerTrList(java.util.List<String> peerTrList) {
                this.peerTrList = peerTrList;
                return this;
            }

            /**
             * <p>The unprotected VBRs.</p>
             */
            public Builder vbrList(java.util.List<String> vbrList) {
                this.vbrList = vbrList;
                return this;
            }

            /**
             * <p>The unprotected VPCs.</p>
             */
            public Builder vpcList(java.util.List<String> vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            /**
             * <p>The unprotected VPN gateways.</p>
             */
            public Builder vpnList(java.util.List<String> vpnList) {
                this.vpnList = vpnList;
                return this;
            }

            public UnprotectedResource build() {
                return new UnprotectedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrFirewallsV2ListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallsV2ListResponseBody</p>
     */
    public static class VpcTrFirewalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenName")
        private String cenName;

        @com.aliyun.core.annotation.NameInMap("CloudFirewallVpcOrderType")
        private String cloudFirewallVpcOrderType;

        @com.aliyun.core.annotation.NameInMap("FirewallId")
        private String firewallId;

        @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
        private String firewallSwitchStatus;

        @com.aliyun.core.annotation.NameInMap("IpsConfig")
        private IpsConfig ipsConfig;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private String precheckStatus;

        @com.aliyun.core.annotation.NameInMap("ProtectedResource")
        private ProtectedResource protectedResource;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private String regionStatus;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("RouteMode")
        private String routeMode;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("UnprotectedResource")
        private UnprotectedResource unprotectedResource;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VpcTrFirewalls(Builder builder) {
            this.cenId = builder.cenId;
            this.cenName = builder.cenName;
            this.cloudFirewallVpcOrderType = builder.cloudFirewallVpcOrderType;
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
         * @return cloudFirewallVpcOrderType
         */
        public String getCloudFirewallVpcOrderType() {
            return this.cloudFirewallVpcOrderType;
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
            private String cloudFirewallVpcOrderType; 
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
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-03f8s0z052ka3v****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The name of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen_swas</p>
             */
            public Builder cenName(String cenName) {
                this.cenName = cenName;
                return this;
            }

            /**
             * <p>The party responsible for the TR fees generated by the VPC firewall. Values:</p>
             * <ul>
             * <li><strong>PayByCloudFirewall</strong>: Fees are borne by the Cloud Firewall.</li>
             * <li><strong>PayByCenOwner</strong>: Fees are borne by the account to which the CEN instance belongs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByCenOwner</p>
             */
            public Builder cloudFirewallVpcOrderType(String cloudFirewallVpcOrderType) {
                this.cloudFirewallVpcOrderType = cloudFirewallVpcOrderType;
                return this;
            }

            /**
             * <p>The instance ID of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-tr-99bc4f0fc88b4d00****</p>
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * <p>The status of the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
             * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
             * <li><strong>notconfigured</strong>: The VPC firewall is not created.</li>
             * <li><strong>configured</strong>: The VPC firewall is created but is not enabled.</li>
             * <li><strong>creating</strong>: The VPC firewall is being created.</li>
             * <li><strong>opening</strong>: The VPC firewall is being enabled.</li>
             * <li><strong>deleting</strong>: The VPC firewall is being deleted.</li>
             * </ul>
             * <blockquote>
             * <p> If you do not specify this parameter, VPC firewalls in all states are queried.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>opened</p>
             */
            public Builder firewallSwitchStatus(String firewallSwitchStatus) {
                this.firewallSwitchStatus = firewallSwitchStatus;
                return this;
            }

            /**
             * <p>The intrusion prevention system (IPS) configurations.</p>
             */
            public Builder ipsConfig(IpsConfig ipsConfig) {
                this.ipsConfig = ipsConfig;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>171761785151****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Indicates whether the VPC firewall can be automatically enabled. Valid values:</p>
             * <ul>
             * <li><strong>passed</strong>: yes</li>
             * <li><strong>failed</strong>: no</li>
             * <li><strong>unknown</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>passed</p>
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The protected resources.</p>
             */
            public Builder protectedResource(ProtectedResource protectedResource) {
                this.protectedResource = protectedResource;
                return this;
            }

            /**
             * <p>The region ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>Indicates whether you can create a VPC firewall in a specified region. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: yes</li>
             * <li><strong>disable</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            /**
             * <p>The result code of the operation that creates the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>RegionDisable</strong>: VPC Firewall is not supported in the region of the network instance. You cannot create a VPC firewall for the network instance.</li>
             * <li><strong>Empty string</strong>: You can create a VPC firewall for the network instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RegionDisable</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The routing mode of the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>managed</strong>: automatic mode</li>
             * <li><strong>manual</strong>: manual mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>managed</p>
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-2vcmhjs88nil55fvu****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The unprotected resources.</p>
             */
            public Builder unprotectedResource(UnprotectedResource unprotectedResource) {
                this.unprotectedResource = unprotectedResource;
                return this;
            }

            /**
             * <p>The instance name of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
