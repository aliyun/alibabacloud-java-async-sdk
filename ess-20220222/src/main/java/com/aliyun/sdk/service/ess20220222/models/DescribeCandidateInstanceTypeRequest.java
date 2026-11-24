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
 * {@link DescribeCandidateInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeCandidateInstanceTypeRequest</p>
 */
public class DescribeCandidateInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowCrossAz")
    private Boolean allowCrossAz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowDifferentGeneration")
    private Boolean allowDifferentGeneration;

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
    @com.aliyun.core.annotation.NameInMap("MaxPrice")
    private Float maxPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
    private java.util.List<String> systemDiskCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private DescribeCandidateInstanceTypeRequest(Builder builder) {
        super(builder);
        this.allowCrossAz = builder.allowCrossAz;
        this.allowDifferentGeneration = builder.allowDifferentGeneration;
        this.dataDiskCategories = builder.dataDiskCategories;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.instanceTypes = builder.instanceTypes;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.maxPrice = builder.maxPrice;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategories = builder.systemDiskCategories;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCandidateInstanceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowCrossAz
     */
    public Boolean getAllowCrossAz() {
        return this.allowCrossAz;
    }

    /**
     * @return allowDifferentGeneration
     */
    public Boolean getAllowDifferentGeneration() {
        return this.allowDifferentGeneration;
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
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<DescribeCandidateInstanceTypeRequest, Builder> {
        private Boolean allowCrossAz; 
        private Boolean allowDifferentGeneration; 
        private java.util.List<String> dataDiskCategories; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private java.util.List<String> instanceTypes; 
        private Integer ipv6AddressCount; 
        private Float maxPrice; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spotStrategy; 
        private java.util.List<String> systemDiskCategories; 
        private java.util.List<String> zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCandidateInstanceTypeRequest request) {
            super(request);
            this.allowCrossAz = request.allowCrossAz;
            this.allowDifferentGeneration = request.allowDifferentGeneration;
            this.dataDiskCategories = request.dataDiskCategories;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.instanceTypes = request.instanceTypes;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.maxPrice = request.maxPrice;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskCategories = request.systemDiskCategories;
            this.zoneIds = request.zoneIds;
        } 

        /**
         * <p>Specifies whether to include vSwitches from other availability zones as candidates.</p>
         * <blockquote>
         * <p>The instance types remain unchanged. Only new availability zones are added as candidates. If a scaling group fails to scale out in all selected availability zones due to issues such as insufficient inventory, Auto Scaling automatically adds a vSwitch in a new availability zone to the scaling group based on this setting.
         * For example, if a scaling group is configured for the cn-hangzhou-h and cn-hangzhou-g availability zones and a scale-out fails in both zones, Auto Scaling may create a vSwitch in the cn-hangzhou-k availability zone and add it to the scaling group based on real-time inventory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowCrossAz(Boolean allowCrossAz) {
            this.putQueryParameter("AllowCrossAz", allowCrossAz);
            this.allowCrossAz = allowCrossAz;
            return this;
        }

        /**
         * <p>Specifies whether to include instance types from other generations as candidates.</p>
         * <ul>
         * <li>For example, if the current instance type is ecs.c7.large, you can set this parameter to true to include instance types such as ecs.c6.large and ecs.c8.large in the list of candidates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowDifferentGeneration(Boolean allowDifferentGeneration) {
            this.putQueryParameter("AllowDifferentGeneration", allowDifferentGeneration);
            this.allowDifferentGeneration = allowDifferentGeneration;
            return this;
        }

        /**
         * <p>The data disk categories, ordered by priority from high to low. If Auto Scaling cannot create a data disk by using a higher-priority category, it tries the next one in the list.</p>
         */
        public Builder dataDiskCategories(java.util.List<String> dataDiskCategories) {
            this.putQueryParameter("DataDiskCategories", dataDiskCategories);
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }

        /**
         * <p>The name of the image family. When specified, the latest image in this family is used to create instances. This parameter cannot be used with ImageId.</p>
         * <blockquote>
         * <p>If you do not specify the scaling group ID, you must specify at least one of ImageId, ImageName, and ImageFamily.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The ID of the image used to create instances.</p>
         * <blockquote>
         * <p>If the specified image contains both a system disk and data disks, any existing data disk information in the scaling configuration is cleared.</p>
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
         * <p>The name of the image. The name must be unique within a region. You cannot use this parameter to specify an image from Alibaba Cloud Marketplace.</p>
         * <blockquote>
         * <p>This parameter is an alternative to the <code>ImageId</code> parameter. If you specify <code>ImageId</code>, <code>ImageName</code> is ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_20140703.vhd</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The specified ECS instance types.</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses.</p>
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
         * <p>The maximum price for a candidate instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
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
         * <p>The ID of the region where the scaling group is located.</p>
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

        /**
         * <p>The bidding strategy for pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: a standard pay-as-you-go instance.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: a spot instance with a user-defined maximum price.</p>
         * </li>
         * <li><p>SpotAsPriceGo: a spot instance where the system automatically bids at the market price.</p>
         * </li>
         * </ul>
         * <p>Default value: NoSpot.</p>
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
         * <p>The system disk categories, ordered by priority from high to low. If Auto Scaling cannot create a system disk by using a higher-priority category, it tries the next one in the list.</p>
         */
        public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * <p>The specified availability zones.</p>
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.putQueryParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public DescribeCandidateInstanceTypeRequest build() {
            return new DescribeCandidateInstanceTypeRequest(this);
        } 

    } 

}
