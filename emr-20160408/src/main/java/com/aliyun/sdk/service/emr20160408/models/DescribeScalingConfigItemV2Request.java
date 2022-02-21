// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingConfigItemV2Request} extends {@link RequestModel}
 *
 * <p>DescribeScalingConfigItemV2Request</p>
 */
public class DescribeScalingConfigItemV2Request extends Request {
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
    @NameInMap("ScalingConfigItemId")
    @Validation(required = true)
    private String scalingConfigItemId;

    @Query
    @NameInMap("ScalingGroupBizId")
    @Validation(required = true)
    private String scalingGroupBizId;

    private DescribeScalingConfigItemV2Request(Builder builder) {
        super(builder);
        this.configItemType = builder.configItemType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingConfigItemId = builder.scalingConfigItemId;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingConfigItemV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return scalingConfigItemId
     */
    public String getScalingConfigItemId() {
        return this.scalingConfigItemId;
    }

    /**
     * @return scalingGroupBizId
     */
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingConfigItemV2Request, Builder> {
        private String configItemType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingConfigItemId; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingConfigItemV2Request response) {
            super(response);
            this.configItemType = response.configItemType;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingConfigItemId = response.scalingConfigItemId;
            this.scalingGroupBizId = response.scalingGroupBizId;
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
         * ScalingConfigItemId.
         */
        public Builder scalingConfigItemId(String scalingConfigItemId) {
            this.putQueryParameter("ScalingConfigItemId", scalingConfigItemId);
            this.scalingConfigItemId = scalingConfigItemId;
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
        public DescribeScalingConfigItemV2Request build() {
            return new DescribeScalingConfigItemV2Request(this);
        } 

    } 

}
