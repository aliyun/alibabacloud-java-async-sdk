// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveScalingConfigItemV2Request} extends {@link RequestModel}
 *
 * <p>RemoveScalingConfigItemV2Request</p>
 */
public class RemoveScalingConfigItemV2Request extends Request {
    @Query
    @NameInMap("ConfigItemBizId")
    @Validation(required = true)
    private String configItemBizId;

    @Query
    @NameInMap("ConfigItemType")
    @Validation(required = true)
    private String configItemType;

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
    @NameInMap("ScalingGroupBizId")
    @Validation(required = true)
    private String scalingGroupBizId;

    private RemoveScalingConfigItemV2Request(Builder builder) {
        super(builder);
        this.configItemBizId = builder.configItemBizId;
        this.configItemType = builder.configItemType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveScalingConfigItemV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configItemBizId
     */
    public String getConfigItemBizId() {
        return this.configItemBizId;
    }

    /**
     * @return configItemType
     */
    public String getConfigItemType() {
        return this.configItemType;
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
     * @return scalingGroupBizId
     */
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public static final class Builder extends Request.Builder<RemoveScalingConfigItemV2Request, Builder> {
        private String configItemBizId; 
        private String configItemType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveScalingConfigItemV2Request request) {
            super(request);
            this.configItemBizId = request.configItemBizId;
            this.configItemType = request.configItemType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupBizId = request.scalingGroupBizId;
        } 

        /**
         * ConfigItemBizId.
         */
        public Builder configItemBizId(String configItemBizId) {
            this.putQueryParameter("ConfigItemBizId", configItemBizId);
            this.configItemBizId = configItemBizId;
            return this;
        }

        /**
         * ConfigItemType.
         */
        public Builder configItemType(String configItemType) {
            this.putQueryParameter("ConfigItemType", configItemType);
            this.configItemType = configItemType;
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
         * ScalingGroupBizId.
         */
        public Builder scalingGroupBizId(String scalingGroupBizId) {
            this.putQueryParameter("ScalingGroupBizId", scalingGroupBizId);
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }

        @Override
        public RemoveScalingConfigItemV2Request build() {
            return new RemoveScalingConfigItemV2Request(this);
        } 

    } 

}
