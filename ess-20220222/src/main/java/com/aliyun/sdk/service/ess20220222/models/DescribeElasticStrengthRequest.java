// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    @com.aliyun.core.annotation.NameInMap("DataDiskCategories")
    private java.util.List<String> dataDiskCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

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
    private java.util.List<String> scalingGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
    private java.util.List<String> systemDiskCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    private DescribeElasticStrengthRequest(Builder builder) {
        super(builder);
        this.dataDiskCategories = builder.dataDiskCategories;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.instanceTypes = builder.instanceTypes;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.priorityStrategy = builder.priorityStrategy;
        this.regionId = builder.regionId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingGroupIds = builder.scalingGroupIds;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategories = builder.systemDiskCategories;
        this.vSwitchIds = builder.vSwitchIds;
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
     * @return dataDiskCategories
     */
    public java.util.List<String> getDataDiskCategories() {
        return this.dataDiskCategories;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
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
    public java.util.List<String> getScalingGroupIds() {
        return this.scalingGroupIds;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDiskCategories
     */
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<DescribeElasticStrengthRequest, Builder> {
        private java.util.List<String> dataDiskCategories; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private java.util.List<String> instanceTypes; 
        private Integer ipv6AddressCount; 
        private String priorityStrategy; 
        private String regionId; 
        private String scalingGroupId; 
        private java.util.List<String> scalingGroupIds; 
        private String spotStrategy; 
        private java.util.List<String> systemDiskCategories; 
        private java.util.List<String> vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticStrengthRequest request) {
            super(request);
            this.dataDiskCategories = request.dataDiskCategories;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.instanceTypes = request.instanceTypes;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.priorityStrategy = request.priorityStrategy;
            this.regionId = request.regionId;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingGroupIds = request.scalingGroupIds;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskCategories = request.systemDiskCategories;
            this.vSwitchIds = request.vSwitchIds;
        } 

        /**
         * <p>A list of data disk categories used to evaluate elastic strength. If a category is incompatible, the response identifies the specific mismatched category.</p>
         * <blockquote>
         * <p>You can specify this parameter if <code>ScalingGroupId</code> is not specified.</p>
         * </blockquote>
         */
        public Builder dataDiskCategories(java.util.List<String> dataDiskCategories) {
            this.putQueryParameter("DataDiskCategories", dataDiskCategories);
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }

        /**
         * <p>The name of the image family. You can set this parameter to use the latest available image from the specified image family to create instances. If you specify ImageId, this parameter is ignored.</p>
         * <blockquote>
         * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CentOS7</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The ID of the image used to create instances.</p>
         * <blockquote>
         * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis****.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the image. The name must be unique within a region. If you specify <code>ImageId</code>, this parameter is ignored.</p>
         * <p>You cannot use this parameter to specify a Marketplace image.</p>
         * <blockquote>
         * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ubuntu_18_04_x64_20G_alibase_20231225.vhd</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>A list of ECS instance types. If specified, this parameter overrides the instance types in the scaling configuration.</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses to be configured for each instance. The elastic strength is lowered for instance types that do not support the specified number of IPv6 addresses.</p>
         * <blockquote>
         * <p>You can specify this parameter if <code>ScalingGroupId</code> is not specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * <blockquote>
         * <p>Warning: This parameter is deprecated. Use <code>SpotStrategy</code> instead.
         * The spot strategy for pay-as-you-go instances. If specified, this parameter overrides the spot strategy in the scaling configuration. Valid values:</p>
         * </blockquote>
         * <ul>
         * <li><p><code>NoSpot</code>: A regular pay-as-you-go instance.</p>
         * </li>
         * <li><p><code>SpotWithPriceLimit</code>: A spot instance with a specified maximum price.</p>
         * </li>
         * <li><p><code>SpotAsPriceGo</code>: A spot instance where the system automatically bids at the current market price.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>NoSpot</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * <p>The ID of the region where the scaling group is located.</p>
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
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The IDs of one or more scaling groups to query in a batch operation.</p>
         */
        public Builder scalingGroupIds(java.util.List<String> scalingGroupIds) {
            this.putQueryParameter("ScalingGroupIds", scalingGroupIds);
            this.scalingGroupIds = scalingGroupIds;
            return this;
        }

        /**
         * <p>The spot strategy for instances. Valid values:</p>
         * <ul>
         * <li><p><code>NoSpot</code>: A regular pay-as-you-go instance.</p>
         * </li>
         * <li><p><code>SpotWithPriceLimit</code>: A spot instance with a specified maximum price.</p>
         * </li>
         * <li><p><code>SpotAsPriceGo</code>: A spot instance where the system automatically bids at the current market price.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>NoSpot</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>A list of system disk categories. If specified, this parameter overrides the system disk categories in the scaling configuration. Valid values:</p>
         * <ul>
         * <li><p><code>cloud</code>: Basic Cloud Disk.</p>
         * </li>
         * <li><p><code>cloud_efficiency</code>: Ultra Cloud Disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required if <code>ScalingGroupId</code> is not specified.</p>
         * </blockquote>
         */
        public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * <p>A list of VSwitch IDs.</p>
         * <blockquote>
         * <p>This parameter is required if <code>ScalingGroupId</code> is not specified.</p>
         * </blockquote>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public DescribeElasticStrengthRequest build() {
            return new DescribeElasticStrengthRequest(this);
        } 

    } 

}
