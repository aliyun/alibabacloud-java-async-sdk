// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeElasticStrengthRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticStrengthRequest</p>
 */
public class DescribeElasticStrengthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupIds")
    private java.util.List < String > scalingGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
    private java.util.List < String > systemDiskCategories;

    private DescribeElasticStrengthRequest(Builder builder) {
        super(builder);
        this.instanceTypes = builder.instanceTypes;
        this.priorityStrategy = builder.priorityStrategy;
        this.regionId = builder.regionId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingGroupIds = builder.scalingGroupIds;
        this.systemDiskCategories = builder.systemDiskCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticStrengthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scalingGroupIds
     */
    public java.util.List < String > getScalingGroupIds() {
        return this.scalingGroupIds;
    }

    /**
     * @return systemDiskCategories
     */
    public java.util.List < String > getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public static final class Builder extends Request.Builder<DescribeElasticStrengthRequest, Builder> {
        private java.util.List < String > instanceTypes; 
        private String priorityStrategy; 
        private String regionId; 
        private String scalingGroupId; 
        private java.util.List < String > scalingGroupIds; 
        private java.util.List < String > systemDiskCategories; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticStrengthRequest request) {
            super(request);
            this.instanceTypes = request.instanceTypes;
            this.priorityStrategy = request.priorityStrategy;
            this.regionId = request.regionId;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingGroupIds = request.scalingGroupIds;
            this.systemDiskCategories = request.systemDiskCategories;
        } 

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * PriorityStrategy.
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingGroupIds.
         */
        public Builder scalingGroupIds(java.util.List < String > scalingGroupIds) {
            this.putQueryParameter("ScalingGroupIds", scalingGroupIds);
            this.scalingGroupIds = scalingGroupIds;
            return this;
        }

        /**
         * SystemDiskCategories.
         */
        public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        @Override
        public DescribeElasticStrengthRequest build() {
            return new DescribeElasticStrengthRequest(this);
        } 

    } 

}
