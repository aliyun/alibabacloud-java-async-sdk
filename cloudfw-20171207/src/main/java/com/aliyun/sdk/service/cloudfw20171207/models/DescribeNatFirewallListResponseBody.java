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
         * NatFirewallList.
         */
        public Builder natFirewallList(java.util.List < NatFirewallList> natFirewallList) {
            this.natFirewallList = natFirewallList;
            return this;
        }

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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatFirewallListResponseBody build() {
            return new DescribeNatFirewallListResponseBody(this);
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
            private String proxyId; 
            private String proxyName; 
            private String proxyStatus; 
            private String regionId; 
            private Integer strictMode; 
            private String vpcId; 
            private String vpcName; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ErrorDetail.
             */
            public Builder errorDetail(String errorDetail) {
                this.errorDetail = errorDetail;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatGatewayName.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * ProxyId.
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * ProxyName.
             */
            public Builder proxyName(String proxyName) {
                this.proxyName = proxyName;
                return this;
            }

            /**
             * ProxyStatus.
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StrictMode.
             */
            public Builder strictMode(Integer strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
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
