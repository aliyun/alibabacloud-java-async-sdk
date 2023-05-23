// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WithdrawPublishedRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>WithdrawPublishedRouteEntriesRequest</p>
 */
public class WithdrawPublishedRouteEntriesRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("ChildInstanceId")
    @Validation(required = true)
    private String childInstanceId;

    @Query
    @NameInMap("ChildInstanceRegionId")
    @Validation(required = true)
    private String childInstanceRegionId;

    @Query
    @NameInMap("ChildInstanceRouteTableId")
    @Validation(required = true)
    private String childInstanceRouteTableId;

    @Query
    @NameInMap("ChildInstanceType")
    @Validation(required = true)
    private String childInstanceType;

    @Query
    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    private String destinationCidrBlock;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private WithdrawPublishedRouteEntriesRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
        this.childInstanceType = builder.childInstanceType;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawPublishedRouteEntriesRequest create() {
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
     * @return childInstanceRouteTableId
     */
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
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

    public static final class Builder extends Request.Builder<WithdrawPublishedRouteEntriesRequest, Builder> {
        private String cenId; 
        private String childInstanceId; 
        private String childInstanceRegionId; 
        private String childInstanceRouteTableId; 
        private String childInstanceType; 
        private String destinationCidrBlock; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(WithdrawPublishedRouteEntriesRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.childInstanceId = request.childInstanceId;
            this.childInstanceRegionId = request.childInstanceRegionId;
            this.childInstanceRouteTableId = request.childInstanceRouteTableId;
            this.childInstanceType = request.childInstanceType;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * ChildInstanceRouteTableId.
         */
        public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
            this.putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
            this.childInstanceRouteTableId = childInstanceRouteTableId;
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
        public WithdrawPublishedRouteEntriesRequest build() {
            return new WithdrawPublishedRouteEntriesRequest(this);
        } 

    } 

}
