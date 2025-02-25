// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddResolverEndpointRequest} extends {@link RequestModel}
 *
 * <p>AddResolverEndpointRequest</p>
 */
public class AddResolverEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IpConfig> ipConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcRegionId;

    private AddResolverEndpointRequest(Builder builder) {
        super(builder);
        this.ipConfig = builder.ipConfig;
        this.lang = builder.lang;
        this.name = builder.name;
        this.securityGroupId = builder.securityGroupId;
        this.vpcId = builder.vpcId;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResolverEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipConfig
     */
    public java.util.List < IpConfig> getIpConfig() {
        return this.ipConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<AddResolverEndpointRequest, Builder> {
        private java.util.List < IpConfig> ipConfig; 
        private String lang; 
        private String name; 
        private String securityGroupId; 
        private String vpcId; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(AddResolverEndpointRequest request) {
            super(request);
            this.ipConfig = request.ipConfig;
            this.lang = request.lang;
            this.name = request.name;
            this.securityGroupId = request.securityGroupId;
            this.vpcId = request.vpcId;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * <p>The source IP addresses of outbound traffic. You must add two to six source IP addresses.</p>
         * <blockquote>
         * <p> You must add at least two source IP addresses for outbound traffic to ensure high availability. We recommend that you add two IP addresses that reside in different zones. You can add up to six source IP addresses.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder ipConfig(java.util.List < IpConfig> ipConfig) {
            this.putQueryParameter("IpConfig", ipConfig);
            this.ipConfig = ipConfig;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The endpoint name. The name can be up to 20 characters in length. If the upper limit is exceeded, an error message is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-test-name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the security group. The security group rules are applied to the outbound VPC.</p>
         * <blockquote>
         * <p> After you create the outbound endpoint, you cannot change the value of SecurityGroupId. This prevents the forwarding of DNS requests from being interrupted due to misoperations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kqlqlqjqqkq</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The outbound VPC ID. All outbound Domain Name System (DNS) requests of the resolver are forwarded by this VPC.</p>
         * <blockquote>
         * <p> After you create the outbound endpoint, you cannot change the value of VpcId. This prevents the forwarding of DNS requests from being interrupted due to misoperations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-129343jslslsks</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The region ID of the outbound virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public AddResolverEndpointRequest build() {
            return new AddResolverEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddResolverEndpointRequest} extends {@link TeaModel}
     *
     * <p>AddResolverEndpointRequest</p>
     */
    public static class IpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String azId;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        private IpConfig(Builder builder) {
            this.azId = builder.azId;
            this.cidrBlock = builder.cidrBlock;
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfig create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String azId; 
            private String cidrBlock; 
            private String ip; 
            private String vSwitchId; 

            /**
             * <p>The ID of the zone to which the vSwitch belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The source IP address of outbound traffic. The IP address must be within the specified CIDR block. If you leave this parameter empty, the system automatically allocates an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.xx.xx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sjqkql</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public IpConfig build() {
                return new IpConfig(this);
            } 

        } 

    }
}
