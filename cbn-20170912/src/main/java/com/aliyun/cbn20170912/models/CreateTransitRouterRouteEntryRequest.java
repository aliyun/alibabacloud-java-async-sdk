// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateTransitRouterRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterRouteEntryRequest</p>
 */
public class CreateTransitRouterRouteEntryRequest extends Request {
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
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    private String transitRouterRouteEntryDestinationCidrBlock;

    @Query
    @NameInMap("TransitRouterRouteEntryName")
    private String transitRouterRouteEntryName;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopId")
    private String transitRouterRouteEntryNextHopId;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopType")
    private String transitRouterRouteEntryNextHopType;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;


    private CreateTransitRouterRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteEntryDescription = builder.transitRouterRouteEntryDescription;
        this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
        this.transitRouterRouteEntryName = builder.transitRouterRouteEntryName;
        this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
        this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteEntryRequest create() {
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
     * @return transitRouterRouteEntryDestinationCidrBlock
     */
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    /**
     * @return transitRouterRouteEntryName
     */
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
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
        private String transitRouterRouteEntryDescription; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private String transitRouterRouteEntryName; 
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
         * <p>TransitRouterRouteEntryDescription.</p>
         */
        public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.putQueryParameter("TransitRouterRouteEntryDescription", transitRouterRouteEntryDescription);
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
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
         * <p>TransitRouterRouteEntryName.</p>
         */
        public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.putQueryParameter("TransitRouterRouteEntryName", transitRouterRouteEntryName);
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
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

        public CreateTransitRouterRouteEntryRequest build() {
            return new CreateTransitRouterRouteEntryRequest(this);
        } 

    } 

}
