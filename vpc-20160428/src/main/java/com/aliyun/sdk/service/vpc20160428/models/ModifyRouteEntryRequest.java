// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouteEntryRequest</p>
 */
public class ModifyRouteEntryRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("NewNextHopId")
    private String newNextHopId;

    @Query
    @NameInMap("NewNextHopType")
    private String newNextHopType;

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

    @Query
    @NameInMap("RouteEntryId")
    @Validation(required = true)
    private String routeEntryId;

    @Query
    @NameInMap("RouteEntryName")
    private String routeEntryName;

    private ModifyRouteEntryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.newNextHopId = builder.newNextHopId;
        this.newNextHopType = builder.newNextHopType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryId = builder.routeEntryId;
        this.routeEntryName = builder.routeEntryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouteEntryRequest create() {
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
     * @return newNextHopId
     */
    public String getNewNextHopId() {
        return this.newNextHopId;
    }

    /**
     * @return newNextHopType
     */
    public String getNewNextHopType() {
        return this.newNextHopType;
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public static final class Builder extends Request.Builder<ModifyRouteEntryRequest, Builder> {
        private String description; 
        private String newNextHopId; 
        private String newNextHopType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryId; 
        private String routeEntryName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouteEntryRequest request) {
            super(request);
            this.description = request.description;
            this.newNextHopId = request.newNextHopId;
            this.newNextHopType = request.newNextHopType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryId = request.routeEntryId;
            this.routeEntryName = request.routeEntryName;
        } 

        /**
         * The description of the route entry.
         * <p>
         * 
         * The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the new next hop instance.
         */
        public Builder newNextHopId(String newNextHopId) {
            this.putQueryParameter("NewNextHopId", newNextHopId);
            this.newNextHopId = newNextHopId;
            return this;
        }

        /**
         * The new next hop type of the route.
         */
        public Builder newNextHopType(String newNextHopType) {
            this.putQueryParameter("NewNextHopType", newNextHopType);
            this.newNextHopType = newNextHopType;
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
         * The ID of the region to which the route belongs.
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

        /**
         * The ID of the custom route entry.
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * The name of the route entry.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        @Override
        public ModifyRouteEntryRequest build() {
            return new ModifyRouteEntryRequest(this);
        } 

    } 

}
