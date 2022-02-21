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
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest response) {
            super(response);
            this.address = response.address;
            this.addressIPVersion = response.addressIPVersion;
            this.addressType = response.addressType;
            this.autoPay = response.autoPay;
            this.bandwidth = response.bandwidth;
            this.clientToken = response.clientToken;
            this.deleteProtection = response.deleteProtection;
            this.duration = response.duration;
            this.internetChargeType = response.internetChargeType;
            this.loadBalancerName = response.loadBalancerName;
            this.loadBalancerSpec = response.loadBalancerSpec;
            this.masterZoneId = response.masterZoneId;
            this.modificationProtectionReason = response.modificationProtectionReason;
            this.modificationProtectionStatus = response.modificationProtectionStatus;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.pricingCycle = response.pricingCycle;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.slaveZoneId = response.slaveZoneId;
            this.vSwitchId = response.vSwitchId;
            this.vpcId = response.vpcId;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeleteProtection.
         */
        public Builder deleteProtection(String deleteProtection) {
            this.putQueryParameter("DeleteProtection", deleteProtection);
            this.deleteProtection = deleteProtection;
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
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * LoadBalancerName.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * LoadBalancerSpec.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * MasterZoneId.
         */
        public Builder masterZoneId(String masterZoneId) {
            this.putQueryParameter("MasterZoneId", masterZoneId);
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * ModificationProtectionReason.
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.putQueryParameter("ModificationProtectionReason", modificationProtectionReason);
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * ModificationProtectionStatus.
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
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
         * SlaveZoneId.
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.putQueryParameter("SlaveZoneId", slaveZoneId);
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
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

}
