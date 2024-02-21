// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunScalingActionV2Request} extends {@link RequestModel}
 *
 * <p>RunScalingActionV2Request</p>
 */
public class RunScalingActionV2Request extends Request {
    @Query
    @NameInMap("ActionParam")
    private String actionParam;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingActionType")
    @Validation(required = true)
    private String scalingActionType;

    @Query
    @NameInMap("ScalingGroupBizId")
    @Validation(required = true)
    private String scalingGroupBizId;

    private RunScalingActionV2Request(Builder builder) {
        super(builder);
        this.actionParam = builder.actionParam;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingActionType = builder.scalingActionType;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunScalingActionV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionParam
     */
    public String getActionParam() {
        return this.actionParam;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingActionType
     */
    public String getScalingActionType() {
        return this.scalingActionType;
    }

    /**
     * @return scalingGroupBizId
     */
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public static final class Builder extends Request.Builder<RunScalingActionV2Request, Builder> {
        private String actionParam; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingActionType; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(RunScalingActionV2Request request) {
            super(request);
            this.actionParam = request.actionParam;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingActionType = request.scalingActionType;
            this.scalingGroupBizId = request.scalingGroupBizId;
        } 

        /**
         * ActionParam.
         */
        public Builder actionParam(String actionParam) {
            this.putQueryParameter("ActionParam", actionParam);
            this.actionParam = actionParam;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * ScalingActionType.
         */
        public Builder scalingActionType(String scalingActionType) {
            this.putQueryParameter("ScalingActionType", scalingActionType);
            this.scalingActionType = scalingActionType;
            return this;
        }

        /**
         * ScalingGroupBizId.
         */
        public Builder scalingGroupBizId(String scalingGroupBizId) {
            this.putQueryParameter("ScalingGroupBizId", scalingGroupBizId);
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }

        @Override
        public RunScalingActionV2Request build() {
            return new RunScalingActionV2Request(this);
        } 

    } 

}
