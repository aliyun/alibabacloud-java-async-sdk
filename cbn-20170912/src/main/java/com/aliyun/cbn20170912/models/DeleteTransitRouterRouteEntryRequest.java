// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTransitRouterRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteTransitRouterRouteEntryRequest</p>
 */
public class DeleteTransitRouterRouteEntryRequest extends Request {
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
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    private String transitRouterRouteEntryDestinationCidrBlock;

    @Query
    @NameInMap("TransitRouterRouteEntryId")
    private String transitRouterRouteEntryId;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopId")
    private String transitRouterRouteEntryNextHopId;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopType")
    private String transitRouterRouteEntryNextHopType;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;


    private DeleteTransitRouterRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
        this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
        this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
        this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTransitRouterRouteEntryRequest create() {
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
     * @return transitRouterRouteEntryDestinationCidrBlock
     */
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    /**
     * @return transitRouterRouteEntryId
     */
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    /**
     * @return transitRouterRouteEntryNextHopId
     */
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    /**
     * @return transitRouterRouteEntryNextHopType
     */
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private String transitRouterRouteEntryId; 
        private String transitRouterRouteEntryNextHopId; 
        private String transitRouterRouteEntryNextHopType; 
        private String transitRouterRouteTableId; 

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
         * <p>TransitRouterRouteEntryDestinationCidrBlock.</p>
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
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
         * <p>TransitRouterRouteEntryNextHopId.</p>
         */
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }

        /**
         * <p>TransitRouterRouteEntryNextHopType.</p>
         */
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableId.</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        public DeleteTransitRouterRouteEntryRequest build() {
            return new DeleteTransitRouterRouteEntryRequest(this);
        } 

    } 

}
