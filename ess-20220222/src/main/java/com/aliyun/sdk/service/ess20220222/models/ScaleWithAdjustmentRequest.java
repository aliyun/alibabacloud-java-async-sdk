// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleWithAdjustmentRequest} extends {@link RequestModel}
 *
 * <p>ScaleWithAdjustmentRequest</p>
 */
public class ScaleWithAdjustmentRequest extends Request {
    @Query
    @NameInMap("AdjustmentType")
    @Validation(required = true)
    private String adjustmentType;

    @Query
    @NameInMap("AdjustmentValue")
    @Validation(required = true, maximum = 2147483647)
    private Integer adjustmentValue;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MinAdjustmentMagnitude")
    private Integer minAdjustmentMagnitude;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("SyncActivity")
    private Boolean syncActivity;

    private ScaleWithAdjustmentRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.clientToken = builder.clientToken;
        this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.syncActivity = builder.syncActivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleWithAdjustmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return minAdjustmentMagnitude
     */
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return syncActivity
     */
    public Boolean getSyncActivity() {
        return this.syncActivity;
    }

    public static final class Builder extends Request.Builder<ScaleWithAdjustmentRequest, Builder> {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private String clientToken; 
        private Integer minAdjustmentMagnitude; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private Boolean syncActivity; 

        private Builder() {
            super();
        } 

        private Builder(ScaleWithAdjustmentRequest request) {
            super(request);
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.clientToken = request.clientToken;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.syncActivity = request.syncActivity;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * Scales instances in a scaling group based on the specified scaling policy.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the scaling group.
         */
        public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude);
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
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
         * The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the `AdjustmentType` parameter to `PercentChangeInCapacity`.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScaleWithAdjustment
         */
        public Builder syncActivity(Boolean syncActivity) {
            this.putQueryParameter("SyncActivity", syncActivity);
            this.syncActivity = syncActivity;
            return this;
        }

        @Override
        public ScaleWithAdjustmentRequest build() {
            return new ScaleWithAdjustmentRequest(this);
        } 

    } 

}
