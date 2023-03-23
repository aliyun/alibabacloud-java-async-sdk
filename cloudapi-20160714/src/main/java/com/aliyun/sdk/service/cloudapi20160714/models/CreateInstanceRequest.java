// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @Query
    @NameInMap("InstanceCidr")
    private String instanceCidr;

    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("InstanceSpec")
    @Validation(required = true)
    private String instanceSpec;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Query
    @NameInMap("UserVpcId")
    private String userVpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ZoneVSwitchSecurityGroup")
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
         * Specifies whether payment is automatically made during renewal. Valid values:
         * <p>
         * 
         * *   **True**: Automatic payment is enabled. Make sure that your Alibaba Cloud account has adequate balance.
         * *   **False**: Automatic payment is disabled. You have to manually pay in the console. Log on to the console. In the upper-right corner, choose **Expenses > User Center**. In the left-side navigation pane, click **Orders**. On the page that appears, find your order and complete the payment.
         * 
         * Default value: **False**.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The billing method of the instance.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Duration.
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
         * InstanceCidr.
         */
        public Builder instanceCidr(String instanceCidr) {
            this.putQueryParameter("InstanceCidr", instanceCidr);
            this.instanceCidr = instanceCidr;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The specifications of the instance.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The password.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * UserVpcId.
         */
        public Builder userVpcId(String userVpcId) {
            this.putQueryParameter("UserVpcId", userVpcId);
            this.userVpcId = userVpcId;
            return this;
        }

        /**
         * The zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneVSwitchSecurityGroup.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
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
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone.
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
