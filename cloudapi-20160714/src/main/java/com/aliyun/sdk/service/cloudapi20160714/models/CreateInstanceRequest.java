// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Tag> tag;

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
    private java.util.List < ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup;

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
    public java.util.List < Tag> getTag() {
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
    public java.util.List < ZoneVSwitchSecurityGroup> getZoneVSwitchSecurityGroup() {
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
        private java.util.List < Tag> tag; 
        private String token; 
        private String userVpcId; 
        private String zoneId; 
        private java.util.List < ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup; 

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
         * Whether to automatically pay when renewing. Value:
         * <p>
         * 
         * - True: Automatic payment. Please ensure that your account has sufficient balance.
         * - False: Console manual payment. The specific operation is to log in to the console, select Expenses in the upper right corner, enter the Expense Center, and find the target order in Order Management to make payment.
         * 
         * Default value: False.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The billing method of the instance. Valid values: PostPaid (pay-as-you-go) and PrePaid (subscription).
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The subscription duration of the instance.
         * <p>
         * 
         * *   Valid values if PricingCycle is set to **Month**: **1** to **9**
         * *   Valid values if PricingCycle is set to **Year**: **1** to **3**
         * 
         * >  This parameter is available and required only if the ChargeType parameter is set to **PrePaid**.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The HTTPS policy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.putQueryParameter("HttpsPolicy", httpsPolicy);
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * The CIDR block of the VPC integration instance.
         * <p>
         * 
         * *   192.168.0.0/16
         * *   172.16.0.0/12
         * 
         * **
         * 
         * **Warning** The VPC integration instance is connected to the specified CIDR block. Plan your CIDR block carefully to prevent overlaps with the private IP addresses of cloud services.
         * 
         * >  This parameter is in invitational preview and not available for public use.
         */
        public Builder instanceCidr(String instanceCidr) {
            this.putQueryParameter("InstanceCidr", instanceCidr);
            this.instanceCidr = instanceCidr;
            return this;
        }

        /**
         * Instance Name
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Instance specifications
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * The type of the dedicated instance. Valid values:
         * <p>
         * 
         * *   vpc_connect: a VPC integration instance
         * *   normal: a conventional dedicated instance
         * 
         * >  This parameter is in invitational preview and not available for public use.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The unit of the subscription duration of the subscription instance. Valid values:
         * <p>
         * 
         * *   **year**
         * *   **month**
         * 
         * >  This parameter is available and required only if the ChargeType parameter is set to PrePaid.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The tags that you want to add to the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Passwords are used to prevent duplicate requests from being submitted, please do not reuse them.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The ID of the user\"s VPC to be connected by the VPC integration instance.
         * <p>
         * 
         * >  This parameter is in invitational preview and not available for public use.
         */
        public Builder userVpcId(String userVpcId) {
            this.putQueryParameter("UserVpcId", userVpcId);
            this.userVpcId = userVpcId;
            return this;
        }

        /**
         * The zone in which you want to create the instance. This parameter is required for a conventional dedicated instance and optional for a virtual private cloud (VPC) integration instance.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The network information when the instance is a VPC integration instance, such as the zone, vSwitch, and security group.
         * <p>
         * 
         * >  This parameter is in invitational preview and not available for public use.
         */
        public Builder zoneVSwitchSecurityGroup(java.util.List < ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroup) {
            this.putQueryParameter("ZoneVSwitchSecurityGroup", zoneVSwitchSecurityGroup);
            this.zoneVSwitchSecurityGroup = zoneVSwitchSecurityGroup;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
             * The IPv4 CIDR block for the vSwitch.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The ID of the security group. Services in the same security group can access each other.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID.
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
