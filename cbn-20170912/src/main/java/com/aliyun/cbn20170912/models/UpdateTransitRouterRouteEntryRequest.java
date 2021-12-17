// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateTransitRouterRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterRouteEntryRequest</p>
 */
public class UpdateTransitRouterRouteEntryRequest extends Request {
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
    @NameInMap("TransitRouterRouteEntryDescription")
    private String transitRouterRouteEntryDescription;

    @Query
    @NameInMap("TransitRouterRouteEntryId")
    private String transitRouterRouteEntryId;

    @Query
    @NameInMap("TransitRouterRouteEntryName")
    private String transitRouterRouteEntryName;


    private UpdateTransitRouterRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteEntryDescription = builder.transitRouterRouteEntryDescription;
        this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
        this.transitRouterRouteEntryName = builder.transitRouterRouteEntryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterRouteEntryRequest create() {
        return builder().build();
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
     * @return transitRouterRouteEntryDescription
     */
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    /**
     * @return transitRouterRouteEntryId
     */
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    /**
     * @return transitRouterRouteEntryName
     */
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteEntryDescription; 
        private String transitRouterRouteEntryId; 
        private String transitRouterRouteEntryName; 

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>DryRun.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>TransitRouterRouteEntryDescription.</p>
         */
        public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.putQueryParameter("TransitRouterRouteEntryDescription", transitRouterRouteEntryDescription);
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            return this;
        }

        /**
         * <p>TransitRouterRouteEntryId.</p>
         */
        public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.putQueryParameter("TransitRouterRouteEntryId", transitRouterRouteEntryId);
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }

        /**
         * <p>TransitRouterRouteEntryName.</p>
         */
        public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.putQueryParameter("TransitRouterRouteEntryName", transitRouterRouteEntryName);
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
            return this;
        }

        public UpdateTransitRouterRouteEntryRequest build() {
            return new UpdateTransitRouterRouteEntryRequest(this);
        } 

    } 

}
