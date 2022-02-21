// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddScalingConfigItemV2Request} extends {@link RequestModel}
 *
 * <p>AddScalingConfigItemV2Request</p>
 */
public class AddScalingConfigItemV2Request extends Request {
    @Query
    @NameInMap("ConfigItemInformation")
    @Validation(required = true)
    private String configItemInformation;

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

    private AddScalingConfigItemV2Request(Builder builder) {
        super(builder);
        this.configItemInformation = builder.configItemInformation;
        this.configItemType = builder.configItemType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddScalingConfigItemV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configItemInformation
     */
    public String getConfigItemInformation() {
        return this.configItemInformation;
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

    public static final class Builder extends Request.Builder<AddScalingConfigItemV2Request, Builder> {
        private String configItemInformation; 
        private String configItemType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(AddScalingConfigItemV2Request response) {
            super(response);
            this.configItemInformation = response.configItemInformation;
            this.configItemType = response.configItemType;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingGroupBizId = response.scalingGroupBizId;
        } 

        /**
         * ConfigItemInformation.
         */
        public Builder configItemInformation(String configItemInformation) {
            this.putQueryParameter("ConfigItemInformation", configItemInformation);
            this.configItemInformation = configItemInformation;
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
        public AddScalingConfigItemV2Request build() {
            return new AddScalingConfigItemV2Request(this);
        } 

    } 

}
