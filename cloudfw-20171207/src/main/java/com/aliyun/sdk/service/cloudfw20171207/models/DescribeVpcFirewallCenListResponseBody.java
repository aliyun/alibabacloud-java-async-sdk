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
 * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenListResponseBody</p>
 */
public class DescribeVpcFirewallCenListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcFirewalls")
    private java.util.List<VpcFirewalls> vpcFirewalls;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VpcFirewalls> getVpcFirewalls() {
        return this.vpcFirewalls;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VpcFirewalls> vpcFirewalls; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallCenListResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcFirewalls = model.vpcFirewalls;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6-0DE4-4797-A1E8-00090125k8g2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the VPC firewalls.</p>
         */
        public Builder vpcFirewalls(java.util.List<VpcFirewalls> vpcFirewalls) {
            this.vpcFirewalls = vpcFirewalls;
            return this;
        }

        public DescribeVpcFirewallCenListResponseBody build() {
            return new DescribeVpcFirewallCenListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
     */
    public static class AclConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StrictMode")
        private Integer strictMode;

        private AclConfig(Builder builder) {
            this.strictMode = builder.strictMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclConfig create() {
            return builder().build();
        }

        /**
         * @return strictMode
         */
        public Integer getStrictMode() {
            return this.strictMode;
        }

        public static final class Builder {
            private Integer strictMode; 

            private Builder() {
            } 

            private Builder(AclConfig model) {
                this.strictMode = model.strictMode;
            } 

            /**
             * StrictMode.
             */
            public Builder strictMode(Integer strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            public AclConfig build() {
                return new AclConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(IpsConfig model) {
                this.basicRules = model.basicRules;
                this.enableAllPatch = model.enableAllPatch;
                this.ruleClass = model.ruleClass;
                this.runMode = model.runMode;
            } 

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
             * <p>1</p>
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
             * <p>0</p>
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
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RouteEntryList model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHopInstanceId = model.nextHopInstanceId;
            } 

            /**
             * <p>The destination CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
     */
    public static class VpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List<RouteEntryList> routeEntryList;

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
        public java.util.List<RouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List<RouteEntryList> routeEntryList; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(VpcCidrTableList model) {
                this.routeEntryList = model.routeEntryList;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>An array that consists of the route entries for the VPC.</p>
             */
            public Builder routeEntryList(java.util.List<RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The route table ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-1234</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
     */
    public static class LocalVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationStatus")
        private String authorizationStatus;

        @com.aliyun.core.annotation.NameInMap("DefendCidrList")
        private java.util.List<String> defendCidrList;

        @com.aliyun.core.annotation.NameInMap("ManualVSwitchId")
        private String manualVSwitchId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceType")
        private String networkInstanceType;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RouteMode")
        private String routeMode;

        @com.aliyun.core.annotation.NameInMap("SupportManualMode")
        private String supportManualMode;

        @com.aliyun.core.annotation.NameInMap("TransitRouterType")
        private String transitRouterType;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List<VpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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
        public java.util.List<String> getDefendCidrList() {
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
        public java.util.List<VpcCidrTableList> getVpcCidrTableList() {
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
            private java.util.List<String> defendCidrList; 
            private String manualVSwitchId; 
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String networkInstanceType; 
            private Long ownerId; 
            private String regionNo; 
            private String routeMode; 
            private String supportManualMode; 
            private String transitRouterType; 
            private java.util.List<VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(LocalVpc model) {
                this.authorizationStatus = model.authorizationStatus;
                this.defendCidrList = model.defendCidrList;
                this.manualVSwitchId = model.manualVSwitchId;
                this.networkInstanceId = model.networkInstanceId;
                this.networkInstanceName = model.networkInstanceName;
                this.networkInstanceType = model.networkInstanceType;
                this.ownerId = model.ownerId;
                this.regionNo = model.regionNo;
                this.routeMode = model.routeMode;
                this.supportManualMode = model.supportManualMode;
                this.transitRouterType = model.transitRouterType;
                this.vpcCidrTableList = model.vpcCidrTableList;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>Indicates whether the VPC is granted the required permissions. The value is fixed as <strong>authorized</strong>, which indicates that the VPC is granted the required permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>authorized</p>
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * <p>An array consisting of the CIDR blocks that are protected by the VPC firewall.</p>
             */
            public Builder defendCidrList(java.util.List<String> defendCidrList) {
                this.defendCidrList = defendCidrList;
                return this;
            }

            /**
             * <p>The ID of the specified vSwitch when the routing mode is manual.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-zeq4o875u****</p>
             */
            public Builder manualVSwitchId(String manualVSwitchId) {
                this.manualVSwitchId = manualVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zefk9fbn8j7v585g****</p>
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * <p>The name of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test VPC</p>
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * <p>The type of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>CCN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkInstanceType(String networkInstanceType) {
                this.networkInstanceType = networkInstanceType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>158039427902****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The routing mode of the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong>: automatic mode</li>
             * <li><strong>manual</strong>: manual mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * <p>Indicates whether the manual routing mode is supported. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder supportManualMode(String supportManualMode) {
                this.supportManualMode = supportManualMode;
                return this;
            }

            /**
             * <p>The edition of the CEN transit router. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: Basic Edition transit router</li>
             * <li><strong>Enterprise</strong>: Enterprise Edition transit router</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder transitRouterType(String transitRouterType) {
                this.transitRouterType = transitRouterType;
                return this;
            }

            /**
             * <p>An array that consists of the CIDR blocks of the VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List<VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbwbo90rq0anm6t****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Test instance</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallCenListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenListResponseBody</p>
     */
    public static class VpcFirewalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclConfig")
        private AclConfig aclConfig;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenName")
        private String cenName;

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

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private String precheckStatus;

        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private String regionStatus;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VpcFirewalls(Builder builder) {
            this.aclConfig = builder.aclConfig;
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
         * @return aclConfig
         */
        public AclConfig getAclConfig() {
            return this.aclConfig;
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
            private AclConfig aclConfig; 
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

            private Builder() {
            } 

            private Builder(VpcFirewalls model) {
                this.aclConfig = model.aclConfig;
                this.cenId = model.cenId;
                this.cenName = model.cenName;
                this.connectType = model.connectType;
                this.firewallSwitchStatus = model.firewallSwitchStatus;
                this.ipsConfig = model.ipsConfig;
                this.localVpc = model.localVpc;
                this.memberUid = model.memberUid;
                this.precheckStatus = model.precheckStatus;
                this.regionStatus = model.regionStatus;
                this.resultCode = model.resultCode;
                this.vpcFirewallId = model.vpcFirewallId;
                this.vpcFirewallName = model.vpcFirewallName;
            } 

            /**
             * AclConfig.
             */
            public Builder aclConfig(AclConfig aclConfig) {
                this.aclConfig = aclConfig;
                return this;
            }

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-x5jayxou71ad73****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The name of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test CEN instance</p>
             */
            public Builder cenName(String cenName) {
                this.cenName = cenName;
                return this;
            }

            /**
             * <p>The connection type of the VPC firewall. The value is fixed as cen, which indicates a CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen</p>
             */
            public Builder connectType(String connectType) {
                this.connectType = connectType;
                return this;
            }

            /**
             * <p>The status of the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
             * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
             * <li><strong>notconfigured</strong>: The VPC firewall is not configured.</li>
             * </ul>
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
             * <p>The details about the VPC.</p>
             */
            public Builder localVpc(LocalVpc localVpc) {
                this.localVpc = localVpc;
                return this;
            }

            /**
             * <p>The UID of the member that is manged by your Alibaba Cloud account. The member is also an Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>Indicates whether the VPC firewall can be automatically enabled to protect VPC traffic based on route learning. Valid values:</p>
             * <ul>
             * <li><strong>passed</strong>: The VPC firewall can be automatically enabled.</li>
             * <li><strong>failed</strong>: The VPC firewall cannot be automatically enabled.</li>
             * <li><strong>unknown</strong>: The VPC firewall is in an unknown state.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
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
             * <li><strong>Unauthorized</strong>: Cloud Firewall is not authorized to access the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
             * <li><strong>RegionDisable</strong>: VPC Firewall is not supported in the region of the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
             * <li><strong>OpsDisable</strong>: You are not allowed to create the VPC firewall.</li>
             * <li><strong>VbrNotSupport</strong>: The VPC firewall cannot be created for a VBR that is attached to the CEN instance.</li>
             * <li>Empty string: You can create a VPC firewall for the network instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unauthorized</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The instance ID of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-m5e7dbc4y****</p>
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * <p>The instance name of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>Test firewall</p>
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
