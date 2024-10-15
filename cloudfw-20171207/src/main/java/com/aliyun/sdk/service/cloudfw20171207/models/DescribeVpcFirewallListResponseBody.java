// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
        public Builder vpcFirewalls(java.util.List < VpcFirewalls> vpcFirewalls) {
            this.vpcFirewalls = vpcFirewalls;
            return this;
        }

        public DescribeVpcFirewallListResponseBody build() {
            return new DescribeVpcFirewallListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
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
             * <li><strong>1</strong>: loose</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: strict</li>
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
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
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

            /**
             * <p>The destination CIDR block of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the local VPC.</p>
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
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>An array that consists of the route entries of the local VPC.</p>
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The ID of the route table for the local VPC.</p>
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
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>Indicates whether Cloud Firewall is authorized to access the local VPC. The value is fixed as authorized, which indicates that Cloud Firewall is authorized to access the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>authorized</p>
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the local VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>158039427902****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>An array that consists of the CIDR blocks of the local VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbwbo90rq0anm6t****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the local VPC.</p>
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
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>The destination CIDR block of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>An array that consists of the route entries of the peer VPC.</p>
             */
            public Builder routeEntryList(java.util.List < VpcCidrTableListRouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The ID of the route table for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-1256</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>Indicates whether Cloud Firewall is authorized to access the peer VPC. The value is fixed as <strong>authorized</strong>, which indicates that Cloud Firewall is authorized to access the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>authorized</p>
             */
            public Builder authorizationStatus(String authorizationStatus) {
                this.authorizationStatus = authorizationStatus;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the peer VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>158039427902****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>An array that consists of the CIDR blocks of the peer VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbwbo90rq0anm6t****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Test VPC 2</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallListResponseBody</p>
     */
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
             * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The sub-type of the connection. Valid values:</p>
             * <ul>
             * <li><strong>vpc2vpc</strong>: Express Connect connection</li>
             * <li><strong>vpcpeer</strong>: peer connection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpcpeer</p>
             */
            public Builder connectSubType(String connectSubType) {
                this.connectSubType = connectSubType;
                return this;
            }

            /**
             * <p>The connection type of the VPC firewall. The value is fixed as <strong>expressconnect</strong>, which indicates an Express Connect connection.</p>
             * 
             * <strong>example:</strong>
             * <p>expressconnect</p>
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
             * <p>The details about the local VPC.</p>
             */
            public Builder localVpc(LocalVpc localVpc) {
                this.localVpc = localVpc;
                return this;
            }

            /**
             * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The details about the peer VPC.</p>
             */
            public Builder peerVpc(PeerVpc peerVpc) {
                this.peerVpc = peerVpc;
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
             * <li><strong>Unauthorized</strong>: Cloud Firewall is not authorized to access a VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
             * <li><strong>RegionDisable</strong>: VPC Firewall is not supported in the region of a VPC for which the VPC firewall is created, and the VPC firewall cannot be created.</li>
             * <li><strong>Empty string</strong>: You can create a VPC firewall for the network instance.</li>
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
