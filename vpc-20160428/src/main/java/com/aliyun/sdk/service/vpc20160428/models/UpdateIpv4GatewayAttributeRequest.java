// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpv4GatewayAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpv4GatewayAttributeRequest</p>
 */
public class UpdateIpv4GatewayAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Ipv4GatewayDescription")
    private String ipv4GatewayDescription;

    @Query
    @NameInMap("Ipv4GatewayId")
    @Validation(required = true)
    private String ipv4GatewayId;

    @Query
    @NameInMap("Ipv4GatewayName")
    private String ipv4GatewayName;

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

    private UpdateIpv4GatewayAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipv4GatewayDescription = builder.ipv4GatewayDescription;
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.ipv4GatewayName = builder.ipv4GatewayName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpv4GatewayAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipv4GatewayDescription
     */
    public String getIpv4GatewayDescription() {
        return this.ipv4GatewayDescription;
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    /**
     * @return ipv4GatewayName
     */
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
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

    public static final class Builder extends Request.Builder<UpdateIpv4GatewayAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipv4GatewayDescription; 
        private String ipv4GatewayId; 
        private String ipv4GatewayName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpv4GatewayAttributeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.ipv4GatewayDescription = response.ipv4GatewayDescription;
            this.ipv4GatewayId = response.ipv4GatewayId;
            this.ipv4GatewayName = response.ipv4GatewayName;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Ipv4GatewayDescription.
         */
        public Builder ipv4GatewayDescription(String ipv4GatewayDescription) {
            this.putQueryParameter("Ipv4GatewayDescription", ipv4GatewayDescription);
            this.ipv4GatewayDescription = ipv4GatewayDescription;
            return this;
        }

        /**
         * Ipv4GatewayId.
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.putQueryParameter("Ipv4GatewayId", ipv4GatewayId);
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * Ipv4GatewayName.
         */
        public Builder ipv4GatewayName(String ipv4GatewayName) {
            this.putQueryParameter("Ipv4GatewayName", ipv4GatewayName);
            this.ipv4GatewayName = ipv4GatewayName;
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
         * RegionId.
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
        public UpdateIpv4GatewayAttributeRequest build() {
            return new UpdateIpv4GatewayAttributeRequest(this);
        } 

    } 

}
