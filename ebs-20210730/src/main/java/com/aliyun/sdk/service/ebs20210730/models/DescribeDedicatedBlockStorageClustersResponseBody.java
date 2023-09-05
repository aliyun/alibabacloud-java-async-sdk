// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedBlockStorageClustersResponseBody</p>
 */
public class DescribeDedicatedBlockStorageClustersResponseBody extends TeaModel {
    @NameInMap("DedicatedBlockStorageClusters")
    private java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDedicatedBlockStorageClustersResponseBody(Builder builder) {
        this.dedicatedBlockStorageClusters = builder.dedicatedBlockStorageClusters;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedBlockStorageClusters
     */
    public java.util.List < DedicatedBlockStorageClusters> getDedicatedBlockStorageClusters() {
        return this.dedicatedBlockStorageClusters;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Details about the dedicated block storage clusters.
         */
        public Builder dedicatedBlockStorageClusters(java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters) {
            this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
            return this;
        }

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedBlockStorageClustersResponseBody build() {
            return new DescribeDedicatedBlockStorageClustersResponseBody(this);
        } 

    } 

    public static class DedicatedBlockStorageClusterCapacity extends TeaModel {
        @NameInMap("AvailableCapacity")
        private Long availableCapacity;

        @NameInMap("AvailableDeviceCapacity")
        private Long availableDeviceCapacity;

        @NameInMap("AvailableSpaceCapacity")
        private Double availableSpaceCapacity;

        @NameInMap("ClusterAvailableCapacity")
        private Long clusterAvailableCapacity;

        @NameInMap("ClusterDeliveryCapacity")
        private Long clusterDeliveryCapacity;

        @NameInMap("DeliveryCapacity")
        private Long deliveryCapacity;

        @NameInMap("TotalCapacity")
        private Long totalCapacity;

        @NameInMap("TotalDeviceCapacity")
        private Long totalDeviceCapacity;

        @NameInMap("TotalSpaceCapacity")
        private Long totalSpaceCapacity;

        @NameInMap("UsedCapacity")
        private Long usedCapacity;

        @NameInMap("UsedDeviceCapacity")
        private Long usedDeviceCapacity;

        @NameInMap("UsedSpaceCapacity")
        private Double usedSpaceCapacity;

        private DedicatedBlockStorageClusterCapacity(Builder builder) {
            this.availableCapacity = builder.availableCapacity;
            this.availableDeviceCapacity = builder.availableDeviceCapacity;
            this.availableSpaceCapacity = builder.availableSpaceCapacity;
            this.clusterAvailableCapacity = builder.clusterAvailableCapacity;
            this.clusterDeliveryCapacity = builder.clusterDeliveryCapacity;
            this.deliveryCapacity = builder.deliveryCapacity;
            this.totalCapacity = builder.totalCapacity;
            this.totalDeviceCapacity = builder.totalDeviceCapacity;
            this.totalSpaceCapacity = builder.totalSpaceCapacity;
            this.usedCapacity = builder.usedCapacity;
            this.usedDeviceCapacity = builder.usedDeviceCapacity;
            this.usedSpaceCapacity = builder.usedSpaceCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageClusterCapacity create() {
            return builder().build();
        }

        /**
         * @return availableCapacity
         */
        public Long getAvailableCapacity() {
            return this.availableCapacity;
        }

        /**
         * @return availableDeviceCapacity
         */
        public Long getAvailableDeviceCapacity() {
            return this.availableDeviceCapacity;
        }

        /**
         * @return availableSpaceCapacity
         */
        public Double getAvailableSpaceCapacity() {
            return this.availableSpaceCapacity;
        }

        /**
         * @return clusterAvailableCapacity
         */
        public Long getClusterAvailableCapacity() {
            return this.clusterAvailableCapacity;
        }

        /**
         * @return clusterDeliveryCapacity
         */
        public Long getClusterDeliveryCapacity() {
            return this.clusterDeliveryCapacity;
        }

        /**
         * @return deliveryCapacity
         */
        public Long getDeliveryCapacity() {
            return this.deliveryCapacity;
        }

        /**
         * @return totalCapacity
         */
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return totalDeviceCapacity
         */
        public Long getTotalDeviceCapacity() {
            return this.totalDeviceCapacity;
        }

        /**
         * @return totalSpaceCapacity
         */
        public Long getTotalSpaceCapacity() {
            return this.totalSpaceCapacity;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedDeviceCapacity
         */
        public Long getUsedDeviceCapacity() {
            return this.usedDeviceCapacity;
        }

        /**
         * @return usedSpaceCapacity
         */
        public Double getUsedSpaceCapacity() {
            return this.usedSpaceCapacity;
        }

        public static final class Builder {
            private Long availableCapacity; 
            private Long availableDeviceCapacity; 
            private Double availableSpaceCapacity; 
            private Long clusterAvailableCapacity; 
            private Long clusterDeliveryCapacity; 
            private Long deliveryCapacity; 
            private Long totalCapacity; 
            private Long totalDeviceCapacity; 
            private Long totalSpaceCapacity; 
            private Long usedCapacity; 
            private Long usedDeviceCapacity; 
            private Double usedSpaceCapacity; 

            /**
             * The available capacity of the dedicated block storage cluster. Unit: GiB.
             */
            public Builder availableCapacity(Long availableCapacity) {
                this.availableCapacity = availableCapacity;
                return this;
            }

            /**
             * AvailableDeviceCapacity.
             */
            public Builder availableDeviceCapacity(Long availableDeviceCapacity) {
                this.availableDeviceCapacity = availableDeviceCapacity;
                return this;
            }

            /**
             * AvailableSpaceCapacity.
             */
            public Builder availableSpaceCapacity(Double availableSpaceCapacity) {
                this.availableSpaceCapacity = availableSpaceCapacity;
                return this;
            }

            /**
             * ClusterAvailableCapacity.
             */
            public Builder clusterAvailableCapacity(Long clusterAvailableCapacity) {
                this.clusterAvailableCapacity = clusterAvailableCapacity;
                return this;
            }

            /**
             * ClusterDeliveryCapacity.
             */
            public Builder clusterDeliveryCapacity(Long clusterDeliveryCapacity) {
                this.clusterDeliveryCapacity = clusterDeliveryCapacity;
                return this;
            }

            /**
             * DeliveryCapacity.
             */
            public Builder deliveryCapacity(Long deliveryCapacity) {
                this.deliveryCapacity = deliveryCapacity;
                return this;
            }

            /**
             * The total capacity of the dedicated block storage cluster. Unit: GiB.
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * TotalDeviceCapacity.
             */
            public Builder totalDeviceCapacity(Long totalDeviceCapacity) {
                this.totalDeviceCapacity = totalDeviceCapacity;
                return this;
            }

            /**
             * TotalSpaceCapacity.
             */
            public Builder totalSpaceCapacity(Long totalSpaceCapacity) {
                this.totalSpaceCapacity = totalSpaceCapacity;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedDeviceCapacity.
             */
            public Builder usedDeviceCapacity(Long usedDeviceCapacity) {
                this.usedDeviceCapacity = usedDeviceCapacity;
                return this;
            }

            /**
             * UsedSpaceCapacity.
             */
            public Builder usedSpaceCapacity(Double usedSpaceCapacity) {
                this.usedSpaceCapacity = usedSpaceCapacity;
                return this;
            }

            public DedicatedBlockStorageClusterCapacity build() {
                return new DedicatedBlockStorageClusterCapacity(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DedicatedBlockStorageClusters extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("Category")
        private String category;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DedicatedBlockStorageClusterCapacity")
        private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity;

        @NameInMap("DedicatedBlockStorageClusterId")
        private String dedicatedBlockStorageClusterId;

        @NameInMap("DedicatedBlockStorageClusterName")
        private String dedicatedBlockStorageClusterName;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnableThinProvision")
        private Boolean enableThinProvision;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SizeOverSoldRatio")
        private Double sizeOverSoldRatio;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageDomain")
        private String storageDomain;

        @NameInMap("SupportedCategory")
        private String supportedCategory;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private DedicatedBlockStorageClusters(Builder builder) {
            this.aliUid = builder.aliUid;
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.dedicatedBlockStorageClusterCapacity = builder.dedicatedBlockStorageClusterCapacity;
            this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
            this.dedicatedBlockStorageClusterName = builder.dedicatedBlockStorageClusterName;
            this.description = builder.description;
            this.enableThinProvision = builder.enableThinProvision;
            this.expiredTime = builder.expiredTime;
            this.performanceLevel = builder.performanceLevel;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.sizeOverSoldRatio = builder.sizeOverSoldRatio;
            this.status = builder.status;
            this.storageDomain = builder.storageDomain;
            this.supportedCategory = builder.supportedCategory;
            this.tags = builder.tags;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageClusters create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dedicatedBlockStorageClusterCapacity
         */
        public DedicatedBlockStorageClusterCapacity getDedicatedBlockStorageClusterCapacity() {
            return this.dedicatedBlockStorageClusterCapacity;
        }

        /**
         * @return dedicatedBlockStorageClusterId
         */
        public String getDedicatedBlockStorageClusterId() {
            return this.dedicatedBlockStorageClusterId;
        }

        /**
         * @return dedicatedBlockStorageClusterName
         */
        public String getDedicatedBlockStorageClusterName() {
            return this.dedicatedBlockStorageClusterName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableThinProvision
         */
        public Boolean getEnableThinProvision() {
            return this.enableThinProvision;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
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
         * @return sizeOverSoldRatio
         */
        public Double getSizeOverSoldRatio() {
            return this.sizeOverSoldRatio;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageDomain
         */
        public String getStorageDomain() {
            return this.storageDomain;
        }

        /**
         * @return supportedCategory
         */
        public String getSupportedCategory() {
            return this.supportedCategory;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String aliUid; 
            private String category; 
            private String createTime; 
            private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity; 
            private String dedicatedBlockStorageClusterId; 
            private String dedicatedBlockStorageClusterName; 
            private String description; 
            private Boolean enableThinProvision; 
            private String expiredTime; 
            private String performanceLevel; 
            private String regionId; 
            private String resourceGroupId; 
            private Double sizeOverSoldRatio; 
            private String status; 
            private String storageDomain; 
            private String supportedCategory; 
            private java.util.List < Tags> tags; 
            private String type; 
            private String zoneId; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The category of disks that can be created in the dedicated block storage cluster.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the dedicated block storage cluster was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Details about the storage capacity of the dedicated block storage cluster.
             */
            public Builder dedicatedBlockStorageClusterCapacity(DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
                this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
                return this;
            }

            /**
             * The ID of the dedicated block storage cluster.
             */
            public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
                this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
                return this;
            }

            /**
             * The name of the dedicated block storage cluster.
             */
            public Builder dedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
                this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
                return this;
            }

            /**
             * The description of the dedicated block storage cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableThinProvision.
             */
            public Builder enableThinProvision(Boolean enableThinProvision) {
                this.enableThinProvision = enableThinProvision;
                return this;
            }

            /**
             * The time when the dedicated block storage cluster expires. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The performance level of disks. Valid values:
             * <p>
             * 
             * *   PL0
             * *   PL1
             * *   PL2
             * *   PL3
             * 
             * >  This parameter is valid only when SupportedCategory is set to cloud_essd.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The region ID of the dedicated block storage cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SizeOverSoldRatio.
             */
            public Builder sizeOverSoldRatio(Double sizeOverSoldRatio) {
                this.sizeOverSoldRatio = sizeOverSoldRatio;
                return this;
            }

            /**
             * The state of the dedicated block storage cluster. Valid values:
             * <p>
             * 
             * *   Preparing: The cluster is pending delivery.
             * *   Running: The cluster is running.
             * *   Expired: The cluster has expired.
             * *   Offline: The cluster is offline.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageDomain.
             */
            public Builder storageDomain(String storageDomain) {
                this.storageDomain = storageDomain;
                return this;
            }

            /**
             * This parameter is not supported.
             */
            public Builder supportedCategory(String supportedCategory) {
                this.supportedCategory = supportedCategory;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the dedicated block storage cluster. Valid values:
             * <p>
             * 
             * *   Standard: a standard dedicated block storage cluster. ESSDs at performance level 0 (PL0 ESSDs) can be created in standard dedicated block storage clusters.
             * *   Premium: a performance dedicated block storage cluster. ESSDs at performance level 1 (PL1 ESSDs) can be created in performance dedicated block storage clusters.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The zone ID of the dedicated block storage cluster.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DedicatedBlockStorageClusters build() {
                return new DedicatedBlockStorageClusters(this);
            } 

        } 

    }
}
