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
         * AllowCrossAz.
         */
        public Builder allowCrossAz(Boolean allowCrossAz) {
            this.putQueryParameter("AllowCrossAz", allowCrossAz);
            this.allowCrossAz = allowCrossAz;
            return this;
        }

        /**
         * AllowDifferentGeneration.
         */
        public Builder allowDifferentGeneration(Boolean allowDifferentGeneration) {
            this.putQueryParameter("AllowDifferentGeneration", allowDifferentGeneration);
            this.allowDifferentGeneration = allowDifferentGeneration;
            return this;
        }

        /**
         * DataDiskCategories.
         */
        public Builder dataDiskCategories(java.util.List<String> dataDiskCategories) {
            this.putQueryParameter("DataDiskCategories", dataDiskCategories);
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }

        /**
         * ImageFamily.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Ipv6AddressCount.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * MaxPrice.
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
         * RegionId.
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
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SystemDiskCategories.
         */
        public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * ZoneIds.
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
