// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @Query
    @NameInMap("AddressType")
    private String addressType;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 5000, minimum = 1)
    private Integer bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeleteProtection")
    private String deleteProtection;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @Query
    @NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @Query
    @NameInMap("MasterZoneId")
    private String masterZoneId;

    @Query
    @NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @Query
    @NameInMap("ModificationProtectionStatus")
    private String modificationProtectionStatus;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SlaveZoneId")
    private String slaveZoneId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.addressType = builder.addressType;
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.deleteProtection = builder.deleteProtection;
        this.duration = builder.duration;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.masterZoneId = builder.masterZoneId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.slaveZoneId = builder.slaveZoneId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteProtection
     */
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    /**
     * @return modificationProtectionReason
     */
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    /**
     * @return modificationProtectionStatus
     */
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return slaveZoneId
     */
    public String getSlaveZoneId() {
        return this.slaveZoneId;
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String address; 
        private String addressIPVersion; 
        private String addressType; 
        private Boolean autoPay; 
        private Integer bandwidth; 
        private String clientToken; 
        private String deleteProtection; 
        private Integer duration; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String masterZoneId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String pricingCycle; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String slaveZoneId; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.address = request.address;
            this.addressIPVersion = request.addressIPVersion;
            this.addressType = request.addressType;
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.deleteProtection = request.deleteProtection;
            this.duration = request.duration;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.masterZoneId = request.masterZoneId;
            this.modificationProtectionReason = request.modificationProtectionReason;
            this.modificationProtectionStatus = request.modificationProtectionStatus;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.slaveZoneId = request.slaveZoneId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The private IP address of the CLB instance. The private IP address must belong to the destination CIDR block of the vSwitch.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The IP version that is used by the CLB instance. Valid values: **ipv4** and **ipv6**.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * The network type of the CLB instance. Valid values:
         * <p>
         * 
         * *   **internet**: After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.
         * *   **intranet**: After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over the internal networks.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * Specifies whether to automatically pay for the subscription Internet-facing CLB instance. Valid values:
         * <p>
         * 
         * *   **true**: automatically pays for the CLB instance. After you call this operation, the system automatically completes the payment and creates the CLB instance.
         * *   **false** (default): After you call the operation, the order is created but the payment is not completed. You can view the pending order in the console. The CLB instance will not be created until you complete the payment.
         * 
         * >  This parameter is supported only by subscription instances created on the Alibaba Cloud China site.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The maximum bandwidth of the listener. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **1** to **5120**. For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * 
         * >  If you do not specify this parameter, the system uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection for the CLB instance. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder deleteProtection(String deleteProtection) {
            this.putQueryParameter("DeleteProtection", deleteProtection);
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * The subscription duration of the Internet-facing CLB instance. Valid values:
         * <p>
         * 
         * *   If **PricingCycle** is set to **month**, the valid values are **1 to 9**.
         * *   If **PricingCycle** is set to **year**, the valid values are **1 to 5**.
         * 
         * >  This parameter is supported only by subscription instances created on the Alibaba Cloud China site.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The metering method of the CLB instance. Valid values:
         * <p>
         * 
         * *   **PayBySpec** (default)
         * *   **PayByCLCU**
         * 
         * >  This parameter is supported only by instances created on the Alibaba Cloud China site and only when **PayType** is set to **PayOnDemand**.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the Internet-facing CLB instance. Valid values:
         * <p>
         * 
         * *   **paybytraffic** (default)
         * 
         * > If you set the value to **paybytraffic**, you do not need to specify **Bandwidth**. Even if you specify **Bandwidth**, the value does not take effect.
         * 
         * *   **paybybandwidth**: pay-by-bandwidth
         * 
         * >  If you set **PayType** to **PayOnDemand** and set **InstanceChargeType** to **PayByCLCU**, you must set InternetChargeType to **paybytraffic**.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The CLB instance name.
         * <p>
         * 
         * The name must be 1 to 80 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
         * 
         * If you do not specify this parameter, the system automatically assigns a name to the CLB instance.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * The specification of the CLB instance. Valid values:
         * <p>
         * 
         * *   **slb.s1.small**
         * 
         * *   **slb.s2.small**
         * 
         * *   **slb.s2.medium**
         * 
         * *   **slb.s3.small**
         * 
         * *   **slb.s3.medium**
         * 
         * *   **slb.s3.large**
         * 
         *     **
         * 
         *     **Note** If you do not specify this parameter, a shared-resource CLB instance is created. Shared-resource CLB instances are no longer available for purchase. Therefore, you must specify this parameter.
         * 
         * If **InstanceChargeType** is set to **PayByCLCU**, this parameter is invalid and you do not need to specify this parameter.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * The ID of the primary zone to which the CLB instance belongs.
         * <p>
         * 
         * You can call the [DescribeZone](~~DescribeZone~~) operation to query the primary and secondary zones in the region where you want to create the CLB instance.
         */
        public Builder masterZoneId(String masterZoneId) {
            this.putQueryParameter("MasterZoneId", masterZoneId);
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * The reason for enabling the configuration read-only mode. The reason must be 1 to 80 characters in length. It must start with a letter and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
         * <p>
         * 
         * >  This parameter takes effect only when **ModificationProtectionStatus** is set to **ConsoleProtection**.
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.putQueryParameter("ModificationProtectionReason", modificationProtectionReason);
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * Specifies whether to enable the configuration read-only mode. Valid values:
         * <p>
         * 
         * *   **NonProtection**: disables the configuration read-only mode. After you disable the configuration read-only mode, the value of **ModificationProtectionReason** is cleared.
         * *   **ConsoleProtection**: enables the configuration read-only mode.
         * 
         * >  If you set this parameter to **ConsoleProtection**, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.putQueryParameter("ModificationProtectionStatus", modificationProtectionStatus);
            this.modificationProtectionStatus = modificationProtectionStatus;
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
         * The billing method of the CLB instance. Set the value to
         * <p>
         * 
         * **PayOnDemand**, which specifies the pay-as-you-go billing method.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The billing cycle of the subscription Internet-facing CLB instance. Valid values:
         * <p>
         * 
         * *   **month**
         * *   **year**
         * 
         * >  This parameter is supported only by subscription instances created on the Alibaba Cloud China site.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The region ID of the CLB instance.
         * <p>
         * 
         * You can call the [DescribeRegions](~~DescribeRegions~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the secondary zone to which the CLB instance belongs.
         * <p>
         * 
         * You can call the [DescribeZone](~~DescribeZone~~) operation to query the primary and secondary zones in the region where you want to create the CLB instance.
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.putQueryParameter("SlaveZoneId", slaveZoneId);
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch to which the CLB instance belongs.
         * <p>
         * 
         * If you want to deploy the CLB instance in a VPC, this parameter is required. If this parameter is specified, **AddessType** is set to **intranet** by default.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the CLB instance belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
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
             * The tag key of the bastion host. Valid values of N: **1 to 20**. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be at most 64 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. Valid values of N: **1 to 20**. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag value cannot contain `http://` or `https://`.
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
