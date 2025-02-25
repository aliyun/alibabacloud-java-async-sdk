// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunInstancesRequest</p>
 */
public class RunInstancesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EipBandwidth")
    private Integer eipBandwidth;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Resolution")
    private String resolution;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.eipBandwidth = builder.eipBandwidth;
        this.imageId = builder.imageId;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.keyPairName = builder.keyPairName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resolution = builder.resolution;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.securityGroupId = builder.securityGroupId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eipBandwidth
     */
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private String sourceRegionId; 
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String chargeType; 
        private String clientToken; 
        private String description; 
        private Integer eipBandwidth; 
        private String imageId; 
        private String instanceName; 
        private String instanceType; 
        private String keyPairName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long period; 
        private String periodUnit; 
        private String privateIpAddress; 
        private String regionId; 
        private String resolution; 
        private String resourceOwnerAccount; 
        private String securityGroupId; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.eipBandwidth = request.eipBandwidth;
            this.imageId = request.imageId;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.keyPairName = request.keyPairName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resolution = request.resolution;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.securityGroupId = request.securityGroupId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The number of ECS instances that you want to create. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Specifies whether to enable the auto-payment feature. Default value: true.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable the auto-renewal feature. This parameter takes effect only if you set InstanceChargeType to PrePaid. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The billing method of the ECP instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription
         * *   PostPaid (default): pay-as-you-go
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the ECP instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The bandwidth of the elastic IP address (EIP). Valid values: 1 to 200. If you specify this parameter, an ECP instance that uses an EIP with specified bandwidth is automatically created and associated with the ECP instance. If the ECP instance is released, the EIP is also released.
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the ECP instance. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). The default value of this parameter is the value of the InstanceId parameter.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The specifications of the ECP instance.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The name of the key pair that you want to use to connect to the instance. You can call the ImportKeyPair operation to import a key pair for cloud phones.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The subscription duration. Default value: 1.
         * <p>
         * 
         * *   Valid values if you set PeriodUnit to Month: 1, 2, 3, and 6.
         * *   Valid values if you set PeriodUnit to Year: 1, 2, 3, 4, and 5.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   Year
         * *   Month (default)
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The private IP address of the cloud phone. When you configure a private IP address for an ECP instance, you must select an idle CIDR block from the CIDR blocks of the vSwitch (VSwitchId). When you specify this parameter, take note of the following items: After you specify the PrivateIpAddress parameter, you must set Amount to 1, which indicates that a cloud phone with a specific private IP address is created.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resolution that you want to select for the ECP instance. You can query the resolutions that are supported by the current instance by calling the DescribeInstanceTypes operation and select an appropriate resolution.
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the security group that the ECP instance uses. The security group is the same as that of the Elastic Compute Service (ECS) instance that you use.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The tags of the ECP instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
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
             * The tag key of the ECP instance. Valid values of N: 1 to 20.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the ECP instance. Valid values of N: 1 to 20.
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
}
