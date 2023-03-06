// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
    @Validation(required = true)
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

    public static final class Builder extends Request.Builder<UpdateTransitRouterRouteEntryRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteEntryDescription; 
        private String transitRouterRouteEntryId; 
        private String transitRouterRouteEntryName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterRouteEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterRouteEntryDescription = request.transitRouterRouteEntryDescription;
            this.transitRouterRouteEntryId = request.transitRouterRouteEntryId;
            this.transitRouterRouteEntryName = request.transitRouterRouteEntryName;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a precheck to check information such as the permissions and instance status. Valid values:
         * <p>
         * 
         * *   **false** (default): sends the request. If the request passes the precheck, the name and description of the route are modified.
         * *   **true**: prechecks the request but does not modify the name or description of the transit router. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
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
         * The new description of the route.
         * <p>
         * 
         * The description must be 2 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -. You can also leave the description empty.
         */
        public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.putQueryParameter("TransitRouterRouteEntryDescription", transitRouterRouteEntryDescription);
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            return this;
        }

        /**
         * The ID of the route entry.
         */
        public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.putQueryParameter("TransitRouterRouteEntryId", transitRouterRouteEntryId);
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }

        /**
         * The new name of the route.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -. You can also leave the name empty.
         */
        public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.putQueryParameter("TransitRouterRouteEntryName", transitRouterRouteEntryName);
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
            return this;
        }

        @Override
        public UpdateTransitRouterRouteEntryRequest build() {
            return new UpdateTransitRouterRouteEntryRequest(this);
        } 

    } 

}
