// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVSwitchAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVSwitchAttributeRequest</p>
 */
public class ModifyVSwitchAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIPv6")
    private Boolean enableIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private Integer ipv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIpv6CidrBlock")
    private String vpcIpv6CidrBlock;

    private ModifyVSwitchAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enableIPv6 = builder.enableIPv6;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchName = builder.vSwitchName;
        this.vpcIpv6CidrBlock = builder.vpcIpv6CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVSwitchAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableIPv6
     */
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    /**
     * @return ipv6CidrBlock
     */
    public Integer getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    /**
     * @return vpcIpv6CidrBlock
     */
    public String getVpcIpv6CidrBlock() {
        return this.vpcIpv6CidrBlock;
    }

    public static final class Builder extends Request.Builder<ModifyVSwitchAttributeRequest, Builder> {
        private String description; 
        private Boolean enableIPv6; 
        private Integer ipv6CidrBlock; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String vSwitchName; 
        private String vpcIpv6CidrBlock; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVSwitchAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.enableIPv6 = request.enableIPv6;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchName = request.vSwitchName;
            this.vpcIpv6CidrBlock = request.vpcIpv6CidrBlock;
        } 

        /**
         * The new description for the vSwitch.
         * <p>
         * 
         * The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable the IPv6 feature for the vSwitch. Valid values:
         * <p>
         * 
         * *   **true**: enables the IPv6 feature.
         * *   **false**: disables the IPv6 feature. This is the default value.
         */
        public Builder enableIPv6(Boolean enableIPv6) {
            this.putQueryParameter("EnableIPv6", enableIPv6);
            this.enableIPv6 = enableIPv6;
            return this;
        }

        /**
         * The last eight bits of the IPv6 CIDR block of the vSwitch. Valid values: **0** to **255**.
         * <p>
         * 
         * You can set this parameter only when the IPv6 feature is enabled for the virtual private cloud (VPC) to which the vSwitch belongs.
         */
        public Builder ipv6CidrBlock(Integer ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
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
         * The ID of the region where the vSwitch is deployed. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The new name for the vSwitch.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        /**
         * The IPv6 CIDR block of the VPC to which the vSwitch belongs.
         * <p>
         * 
         * You can set this parameter only when the IPv6 feature is enabled for the VPC.
         */
        public Builder vpcIpv6CidrBlock(String vpcIpv6CidrBlock) {
            this.putQueryParameter("VpcIpv6CidrBlock", vpcIpv6CidrBlock);
            this.vpcIpv6CidrBlock = vpcIpv6CidrBlock;
            return this;
        }

        @Override
        public ModifyVSwitchAttributeRequest build() {
            return new ModifyVSwitchAttributeRequest(this);
        } 

    } 

}
