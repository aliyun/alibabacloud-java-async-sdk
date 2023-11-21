// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNatGatewayAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatGatewayAttributeRequest</p>
 */
public class ModifyNatGatewayAttributeRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EipBindMode")
    private String eipBindMode;

    @Query
    @NameInMap("IcmpReplyEnabled")
    private Boolean icmpReplyEnabled;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyNatGatewayAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eipBindMode = builder.eipBindMode;
        this.icmpReplyEnabled = builder.icmpReplyEnabled;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatGatewayAttributeRequest create() {
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
     * @return eipBindMode
     */
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    /**
     * @return icmpReplyEnabled
     */
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public static final class Builder extends Request.Builder<ModifyNatGatewayAttributeRequest, Builder> {
        private String description; 
        private String eipBindMode; 
        private Boolean icmpReplyEnabled; 
        private String name; 
        private String natGatewayId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatGatewayAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.eipBindMode = request.eipBindMode;
            this.icmpReplyEnabled = request.icmpReplyEnabled;
            this.name = request.name;
            this.natGatewayId = request.natGatewayId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The description of the NAT gateway.
         * <p>
         * 
         * The description must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The mode in which the NAT gateway is associated with an elastic IP address (EIP). You can leave this parameter empty. If you want to specify a value for this parameter, set the value to **NAT**, which indicates that the NAT gateway is associated with the EIP in NAT mode.
         * <p>
         * 
         * **
         * 
         * **Description**
         * 
         * *   If EipBindMode is set to MULTI_BINDED when the NAT gateway is created, you can change the value of this parameter from **MULTI_BINDED** to **NAT**. If EipBindMode is set to NAT when the NAT gateway is created, you cannot change the value of this parameter from **NAT** to **MULTI_BINDED**. For more information about **MULTI_BINDED**, see [CreateNatGateway](~~120219~~).
         * 
         * *   When the mode in which the NAT gateway is associated with an EIP is being changed, a transient connection that lasts a few seconds may occur. If the number of EIPs with which the NAT gateway is associated increases, the transient connection lasts longer. You can change the mode only for a NAT gateway that is associated with up to five EIPs. We recommend that you change the mode during off-peak hours.
         * *   After the mode is changed to **NAT**, the Internet NAT gateway is compatible with the IPv4 gateway. However, if you associate an EIP with the NAT gateway, the EIP occupies one private IP address on the vSwitch of the NAT gateway. Make sure that the vSwitch has sufficient private IP addresses. Otherwise, the EIP fails to be associated with the NAT gateway.
         */
        public Builder eipBindMode(String eipBindMode) {
            this.putQueryParameter("EipBindMode", eipBindMode);
            this.eipBindMode = eipBindMode;
            return this;
        }

        /**
         * Specifies whether to enable the Internet Control Message Protocol (ICMP) non-retrieval feature. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         */
        public Builder icmpReplyEnabled(Boolean icmpReplyEnabled) {
            this.putQueryParameter("IcmpReplyEnabled", icmpReplyEnabled);
            this.icmpReplyEnabled = icmpReplyEnabled;
            return this;
        }

        /**
         * The name of the NAT gateway.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
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
         * The region ID of the NAT gateway.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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

        @Override
        public ModifyNatGatewayAttributeRequest build() {
            return new ModifyNatGatewayAttributeRequest(this);
        } 

    } 

}
