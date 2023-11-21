// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateYouhuiForOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateYouhuiForOrderRequest</p>
 */
public class CreateYouhuiForOrderRequest extends Request {
    @Query
    @NameInMap("ActivityId")
    @Validation(required = true)
    private Long activityId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PromotionId")
    @Validation(required = true)
    private Long promotionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private CreateYouhuiForOrderRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.ownerId = builder.ownerId;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYouhuiForOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return promotionId
     */
    public Long getPromotionId() {
        return this.promotionId;
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateYouhuiForOrderRequest, Builder> {
        private Long activityId; 
        private String ownerId; 
        private Long promotionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateYouhuiForOrderRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.ownerId = request.ownerId;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ticket ID.
         */
        public Builder activityId(Long activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The promotion ID. You can call the GetResourcePrice operation to query the promotion ID.
         */
        public Builder promotionId(Long promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateYouhuiForOrderRequest build() {
            return new CreateYouhuiForOrderRequest(this);
        } 

    } 

}
