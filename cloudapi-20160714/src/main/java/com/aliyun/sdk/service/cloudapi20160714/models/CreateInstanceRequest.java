// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCidr")
    private String instanceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserVpcId")
    private String userVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneVSwitchSecurityGroup")
    private java.util.List<ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.duration = builder.duration;
        this.httpsPolicy = builder.httpsPolicy;
        this.instanceCidr = builder.instanceCidr;
        this.instanceName = builder.instanceName;
        this.instanceSpec = builder.instanceSpec;
        this.instanceType = builder.instanceType;
        this.pricingCycle = builder.pricingCycle;
        this.tag = builder.tag;
        this.token = builder.token;
        this.userVpcId = builder.userVpcId;
        this.zoneId = builder.zoneId;
        this.zoneVSwitchSecurityGroup = builder.zoneVSwitchSecurityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return httpsPolicy
     */
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    /**
     * @return instanceCidr
     */
    public String getInstanceCidr() {
        return this.instanceCidr;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userVpcId
     */
    public String getUserVpcId() {
        return this.userVpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneVSwitchSecurityGroup
     */
    public java.util.List<ZoneVSwitchSecurityGroup> getZoneVSwitchSecurityGroup() {
        return this.zoneVSwitchSecurityGroup;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private Integer duration; 
        private String httpsPolicy; 
        private String instanceCidr; 
        private String instanceName; 
        private String instanceSpec; 
        private String instanceType; 
        private String pricingCycle; 
        private java.util.List<Tag> tag; 
        private String token; 
        private String userVpcId; 
        private String zoneId; 
        private java.util.List<ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.duration = request.duration;
            this.httpsPolicy = request.httpsPolicy;
            this.instanceCidr = request.instanceCidr;
            this.instanceName = request.instanceName;
            this.instanceSpec = request.instanceSpec;
            this.instanceType = request.instanceType;
            this.pricingCycle = request.pricingCycle;
            this.tag = request.tag;
            this.token = request.token;
            this.userVpcId = request.userVpcId;
            this.zoneId = request.zoneId;
            this.zoneVSwitchSecurityGroup = request.zoneVSwitchSecurityGroup;
        } 

        /**
         * <p>Whether to automatically pay when renewing. Value:</p>
         * <ul>
         * <li>True: Automatic payment. Please ensure that your account has sufficient balance.</li>
         * <li>False: Console manual payment. The specific operation is to log in to the console, select Expenses in the upper right corner, enter the Expense Center, and find the target order in Order Management to make payment.</li>
         * </ul>
         * <p>Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values: PostPaid (pay-as-you-go) and PrePaid (subscription).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid
         * PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The subscription duration of the instance.</p>
         * <ul>
         * <li>If PricingCycle is set to <strong>Month</strong>, set this parameter to an integer ranges from <strong>1</strong> to <strong>9</strong>.</li>
         * <li>If PricingCycle is set to <strong>Year</strong>, set this parameter to an integer ranges from <strong>1</strong> to <strong>3</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is valid and required only if the ChargeType parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The HTTPS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS2_TLS1_2</p>
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.putQueryParameter("HttpsPolicy", httpsPolicy);
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * <p>The CIDR block of the VPC integration instance.</p>
         * <ul>
         * <li>192.168.0.0/16</li>
         * <li>172.16.0.0/12</li>
         * </ul>
         * <p>**</p>
         * <p><strong>Warning</strong> The VPC integration instance is connected to the specified CIDR block. Plan your CIDR block carefully to prevent overlaps with the private IP addresses of cloud services.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        public Builder instanceCidr(String instanceCidr) {
            this.putQueryParameter("InstanceCidr", instanceCidr);
            this.instanceCidr = instanceCidr;
            return this;
        }

        /**
         * <p>Instance Name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ApigatewayInstance</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Instance specifications</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.s1.small</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>The type of the dedicated instance. Valid values:</p>
         * <ul>
         * <li>vpc_connect: a VPC integration instance</li>
         * <li>normal: a conventional dedicated instance</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is in invitational preview and not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc_connect</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>year</strong></li>
         * <li><strong>month</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the ChargeType parameter is set to Prepaid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The tags that you want to add to the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Passwords are used to prevent duplicate requests from being submitted, please do not reuse them.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c20d86c4-1eb3-4d0b-afe9-c586df1e2136</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The ID of the user&quot;s VPC to be connected by the VPC integration instance.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5eo7khlb4h4f8y9egsdg</p>
         */
        public Builder userVpcId(String userVpcId) {
            this.putQueryParameter("UserVpcId", userVpcId);
            this.userVpcId = userVpcId;
            return this;
        }

        /**
         * <p>The zone in which you want to create the instance. This parameter is required for a conventional dedicated instance and optional for a virtual private cloud (VPC) integration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-MAZ3(c,e)</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The network information when the instance is a VPC integration instance, such as the zone, vSwitch, and security group.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and not available for public use.</p>
         * </blockquote>
         */
        public Builder zoneVSwitchSecurityGroup(java.util.List<ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup) {
            this.putQueryParameter("ZoneVSwitchSecurityGroup", zoneVSwitchSecurityGroup);
            this.zoneVSwitchSecurityGroup = zoneVSwitchSecurityGroup;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class ZoneVSwitchSecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneVSwitchSecurityGroup(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneVSwitchSecurityGroup create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * <p>The IPv4 CIDR block for the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.9.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The ID of the security group. Services in the same security group can access each other.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze2ql9nozv8q7kmlt6e</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0xi349n11cxogmvm866tb</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-c</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneVSwitchSecurityGroup build() {
                return new ZoneVSwitchSecurityGroup(this);
            } 

        } 

    }
}
