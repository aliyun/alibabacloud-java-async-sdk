// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingConfigItemV2Request} extends {@link RequestModel}
 *
 * <p>ModifyScalingConfigItemV2Request</p>
 */
public class ModifyScalingConfigItemV2Request extends Request {
    @Query
    @NameInMap("ConfigItemBizId")
    @Validation(required = true)
    private String configItemBizId;

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

    private ModifyScalingConfigItemV2Request(Builder builder) {
        super(builder);
        this.configItemBizId = builder.configItemBizId;
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

    public static ModifyScalingConfigItemV2Request create() {
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

    public static final class Builder extends Request.Builder<ModifyScalingConfigItemV2Request, Builder> {
        private String configItemBizId; 
        private String configItemInformation; 
        private String configItemType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingConfigItemV2Request request) {
            super(request);
            this.configItemBizId = request.configItemBizId;
            this.configItemInformation = request.configItemInformation;
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
        public ModifyScalingConfigItemV2Request build() {
            return new ModifyScalingConfigItemV2Request(this);
        } 

    } 

}
