// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatFirewallListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallListResponseBody</p>
 */
public class DescribeNatFirewallListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatFirewallList")
    private java.util.List < NatFirewallList> natFirewallList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatFirewallListResponseBody(Builder builder) {
        this.natFirewallList = builder.natFirewallList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallListResponseBody create() {
        return builder().build();
    }

    /**
     * @return natFirewallList
     */
    public java.util.List < NatFirewallList> getNatFirewallList() {
        return this.natFirewallList;
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

    public static final class Builder {
        private java.util.List < NatFirewallList> natFirewallList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The NAT firewalls.
         */
        public Builder natFirewallList(java.util.List < NatFirewallList> natFirewallList) {
            this.natFirewallList = natFirewallList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of NAT firewalls.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatFirewallListResponseBody build() {
            return new DescribeNatFirewallListResponseBody(this);
        } 

    } 

    public static class NatRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        private NatRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopId; 
            private String nextHopType; 
            private String routeTableId; 

            /**
             * The destination CIDR block of the default route.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The next hop of the original NAT gateway.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * The network type of the next hop. The value is fixed as NatGateway.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The route table to which the default route of the NAT gateway belongs.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public NatRouteEntryList build() {
                return new NatRouteEntryList(this);
            } 

        } 

    }
    public static class NatFirewallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ErrorDetail")
        private String errorDetail;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("NatRouteEntryList")
        private java.util.List < NatRouteEntryList> natRouteEntryList;

        @com.aliyun.core.annotation.NameInMap("ProxyId")
        private String proxyId;

        @com.aliyun.core.annotation.NameInMap("ProxyName")
        private String proxyName;

        @com.aliyun.core.annotation.NameInMap("ProxyStatus")
        private String proxyStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StrictMode")
        private Integer strictMode;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private NatFirewallList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.errorDetail = builder.errorDetail;
            this.memberUid = builder.memberUid;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.natRouteEntryList = builder.natRouteEntryList;
            this.proxyId = builder.proxyId;
            this.proxyName = builder.proxyName;
            this.proxyStatus = builder.proxyStatus;
            this.regionId = builder.regionId;
            this.strictMode = builder.strictMode;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatFirewallList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return errorDetail
         */
        public String getErrorDetail() {
            return this.errorDetail;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return natRouteEntryList
         */
        public java.util.List < NatRouteEntryList> getNatRouteEntryList() {
            return this.natRouteEntryList;
        }

        /**
         * @return proxyId
         */
        public String getProxyId() {
            return this.proxyId;
        }

        /**
         * @return proxyName
         */
        public String getProxyName() {
            return this.proxyName;
        }

        /**
         * @return proxyStatus
         */
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return strictMode
         */
        public Integer getStrictMode() {
            return this.strictMode;
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
            private Long aliUid; 
            private String errorDetail; 
            private Long memberUid; 
            private String natGatewayId; 
            private String natGatewayName; 
            private java.util.List < NatRouteEntryList> natRouteEntryList; 
            private String proxyId; 
            private String proxyName; 
            private String proxyStatus; 
            private String regionId; 
            private Integer strictMode; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The UID of the Alibaba Cloud account.
             * <p>
             * 
             * >  The value of this parameter indicates the management account to which the member is added.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The cause of the error.
             */
            public Builder errorDetail(String errorDetail) {
                this.errorDetail = errorDetail;
                return this;
            }

            /**
             * The UID of the member in Cloud Firewall.
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The ID of the NAT gateway.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * The name of the NAT gateway.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * The default route entries of the NAT gateway.
             */
            public Builder natRouteEntryList(java.util.List < NatRouteEntryList> natRouteEntryList) {
                this.natRouteEntryList = natRouteEntryList;
                return this;
            }

            /**
             * The ID of the NAT firewall.
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * The name of the NAT firewall.
             */
            public Builder proxyName(String proxyName) {
                this.proxyName = proxyName;
                return this;
            }

            /**
             * The status of the NAT firewall. Valid values:
             * <p>
             * 
             * *   configuring
             * *   deleting
             * *   normal
             * *   abnormal
             * *   opening
             * *   closing
             * *   closed
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * The region ID of your Cloud Firewall.
             * <p>
             * 
             * >  For more information about the supported regions of Cloud Firewall, see [Supported regions](~~195657~~).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the strict mode is enabled. Valid values: 1, which specifies yes, and 0, which specifies no.
             */
            public Builder strictMode(Integer strictMode) {
                this.strictMode = strictMode;
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

            public NatFirewallList build() {
                return new NatFirewallList(this);
            } 

        } 

    }
}
