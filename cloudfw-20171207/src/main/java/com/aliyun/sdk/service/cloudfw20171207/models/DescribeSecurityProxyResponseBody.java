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
 * {@link DescribeSecurityProxyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityProxyResponseBody</p>
 */
public class DescribeSecurityProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProxyList")
    private java.util.List<ProxyList> proxyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecurityProxyResponseBody(Builder builder) {
        this.proxyList = builder.proxyList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityProxyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyList
     */
    public java.util.List<ProxyList> getProxyList() {
        return this.proxyList;
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
        private java.util.List<ProxyList> proxyList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSecurityProxyResponseBody model) {
            this.proxyList = model.proxyList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of NAT firewalls.</p>
         */
        public Builder proxyList(java.util.List<ProxyList> proxyList) {
            this.proxyList = proxyList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityProxyResponseBody build() {
            return new DescribeSecurityProxyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityProxyResponseBody</p>
     */
    public static class ProxyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("ProxyId")
        private String proxyId;

        @com.aliyun.core.annotation.NameInMap("ProxyName")
        private String proxyName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("SnatIpList")
        private java.util.List<String> snatIpList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrictMode")
        private Integer strictMode;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private ProxyList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.detail = builder.detail;
            this.memberUid = builder.memberUid;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.proxyId = builder.proxyId;
            this.proxyName = builder.proxyName;
            this.regionNo = builder.regionNo;
            this.snatIpList = builder.snatIpList;
            this.status = builder.status;
            this.strictMode = builder.strictMode;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyList create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
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
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return snatIpList
         */
        public java.util.List<String> getSnatIpList() {
            return this.snatIpList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strictMode
         */
        public Integer getStrictMode() {
            return this.strictMode;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String cidrBlock; 
            private String detail; 
            private String memberUid; 
            private String natGatewayId; 
            private String natGatewayName; 
            private String proxyId; 
            private String proxyName; 
            private String regionNo; 
            private java.util.List<String> snatIpList; 
            private String status; 
            private Integer strictMode; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(ProxyList model) {
                this.cidrBlock = model.cidrBlock;
                this.detail = model.detail;
                this.memberUid = model.memberUid;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.proxyId = model.proxyId;
                this.proxyName = model.proxyName;
                this.regionNo = model.regionNo;
                this.snatIpList = model.snatIpList;
                this.status = model.status;
                this.strictMode = model.strictMode;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The IPv4 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The error details.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The UID of the Cloud Firewall member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>1797733170015112</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-2zex8sf4s5vus8rq3rjqo</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The name of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-slb-eip-waf</p>
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * <p>The ID of the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy-nat4921f192b6cf438d93f8</p>
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * <p>The name of the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>nat-idmp-fir</p>
             */
            public Builder proxyName(String proxyName) {
                this.proxyName = proxyName;
                return this;
            }

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The list of SNAT IP addresses.</p>
             */
            public Builder snatIpList(java.util.List<String> snatIpList) {
                this.snatIpList = snatIpList;
                return this;
            }

            /**
             * <p>The status of Cloud Firewall. Valid values:</p>
             * <ul>
             * <li><strong>configuring</strong>: Being created.</li>
             * <li><strong>deleting</strong>: Being deleted.</li>
             * <li><strong>normal</strong>: Normal.</li>
             * <li><strong>abnormal</strong>: Abnormal.</li>
             * <li><strong>opening</strong>: Being enabled.</li>
             * <li><strong>closing</strong>: Being disabled.</li>
             * <li><strong>closed</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether strict mode is enabled. Valid values:</p>
             * <ul>
             * <li>1: Strict mode is enabled.</li>
             * <li>0: Strict mode is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder strictMode(Integer strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the Cloud Firewall interface belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-5gu2qqfmjmwl8ktzgfekl</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC-connected instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9xn35tq33hunzvpu0se</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1kw9igsq0yyzeanqamx</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public ProxyList build() {
                return new ProxyList(this);
            } 

        } 

    }
}
