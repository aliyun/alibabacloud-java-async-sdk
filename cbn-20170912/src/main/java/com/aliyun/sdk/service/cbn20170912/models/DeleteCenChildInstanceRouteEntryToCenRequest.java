// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenChildInstanceRouteEntryToCenRequest} extends {@link RequestModel}
 *
 * <p>DeleteCenChildInstanceRouteEntryToCenRequest</p>
 */
public class DeleteCenChildInstanceRouteEntryToCenRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("ChildInstanceAliUid")
    private Long childInstanceAliUid;

    @Query
    @NameInMap("ChildInstanceId")
    @Validation(required = true)
    private String childInstanceId;

    @Query
    @NameInMap("ChildInstanceRegionId")
    @Validation(required = true)
    private String childInstanceRegionId;

    @Query
    @NameInMap("ChildInstanceType")
    @Validation(required = true)
    private String childInstanceType;

    @Query
    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    private String destinationCidrBlock;

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
    @NameInMap("RouteTableId")
    @Validation(required = true)
    private String routeTableId;

    private DeleteCenChildInstanceRouteEntryToCenRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.childInstanceAliUid = builder.childInstanceAliUid;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceType = builder.childInstanceType;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCenChildInstanceRouteEntryToCenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceAliUid
     */
    public Long getChildInstanceAliUid() {
        return this.childInstanceAliUid;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
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
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder extends Request.Builder<DeleteCenChildInstanceRouteEntryToCenRequest, Builder> {
        private String cenId; 
        private Long childInstanceAliUid; 
        private String childInstanceId; 
        private String childInstanceRegionId; 
        private String childInstanceType; 
        private String destinationCidrBlock; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCenChildInstanceRouteEntryToCenRequest response) {
            super(response);
            this.cenId = response.cenId;
            this.childInstanceAliUid = response.childInstanceAliUid;
            this.childInstanceId = response.childInstanceId;
            this.childInstanceRegionId = response.childInstanceRegionId;
            this.childInstanceType = response.childInstanceType;
            this.destinationCidrBlock = response.destinationCidrBlock;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.routeTableId = response.routeTableId;
        } 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * ChildInstanceAliUid.
         */
        public Builder childInstanceAliUid(Long childInstanceAliUid) {
            this.putQueryParameter("ChildInstanceAliUid", childInstanceAliUid);
            this.childInstanceAliUid = childInstanceAliUid;
            return this;
        }

        /**
         * ChildInstanceId.
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * ChildInstanceRegionId.
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * ChildInstanceType.
         */
        public Builder childInstanceType(String childInstanceType) {
            this.putQueryParameter("ChildInstanceType", childInstanceType);
            this.childInstanceType = childInstanceType;
            return this;
        }

        /**
         * DestinationCidrBlock.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
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
         * RouteTableId.
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public DeleteCenChildInstanceRouteEntryToCenRequest build() {
            return new DeleteCenChildInstanceRouteEntryToCenRequest(this);
        } 

    } 

}
