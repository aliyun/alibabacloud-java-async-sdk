// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterRouteTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterRouteTableRequest</p>
 */
public class UpdateTransitRouterRouteTableRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransitRouterRouteTableDescription")
    private String transitRouterRouteTableDescription;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    @Validation(required = true)
    private String transitRouterRouteTableId;

    @Query
    @NameInMap("TransitRouterRouteTableName")
    private String transitRouterRouteTableName;

    private UpdateTransitRouterRouteTableRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteTableDescription = builder.transitRouterRouteTableDescription;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        this.transitRouterRouteTableName = builder.transitRouterRouteTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterRouteTableRequest create() {
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
     * @return transitRouterRouteTableDescription
     */
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    /**
     * @return transitRouterRouteTableName
     */
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static final class Builder extends Request.Builder<UpdateTransitRouterRouteTableRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteTableDescription; 
        private String transitRouterRouteTableId; 
        private String transitRouterRouteTableName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterRouteTableRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.transitRouterRouteTableDescription = response.transitRouterRouteTableDescription;
            this.transitRouterRouteTableId = response.transitRouterRouteTableId;
            this.transitRouterRouteTableName = response.transitRouterRouteTableName;
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
         * TransitRouterRouteTableDescription.
         */
        public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            this.putQueryParameter("TransitRouterRouteTableDescription", transitRouterRouteTableDescription);
            this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }

        /**
         * TransitRouterRouteTableId.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * TransitRouterRouteTableName.
         */
        public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
            this.putQueryParameter("TransitRouterRouteTableName", transitRouterRouteTableName);
            this.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }

        @Override
        public UpdateTransitRouterRouteTableRequest build() {
            return new UpdateTransitRouterRouteTableRequest(this);
        } 

    } 

}
