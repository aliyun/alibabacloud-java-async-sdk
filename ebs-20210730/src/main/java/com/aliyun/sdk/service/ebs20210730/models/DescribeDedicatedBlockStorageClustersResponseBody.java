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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedBlockStorageClustersResponseBody(Builder builder) {
        this.dedicatedBlockStorageClusters = builder.dedicatedBlockStorageClusters;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters; 
        private String nextToken; 
        private String requestId; 

        /**
         * 由一个或多个集群组成的数组
         */
        public Builder dedicatedBlockStorageClusters(java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters) {
            this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
            return this;
        }

        /**
         * 本次调用返回的查询凭证值
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RrequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedBlockStorageClustersResponseBody build() {
            return new DescribeDedicatedBlockStorageClustersResponseBody(this);
        } 

    } 

    public static class DedicatedBlockStorageClusterCapacity extends TeaModel {
        @NameInMap("AvailableCapacity")
        private Long availableCapacity;

        @NameInMap("DeliveryCapacity")
        private Long deliveryCapacity;

        @NameInMap("TotalCapacity")
        private Long totalCapacity;

        @NameInMap("UsedCapacity")
        private Long usedCapacity;

        private DedicatedBlockStorageClusterCapacity(Builder builder) {
            this.availableCapacity = builder.availableCapacity;
            this.deliveryCapacity = builder.deliveryCapacity;
            this.totalCapacity = builder.totalCapacity;
            this.usedCapacity = builder.usedCapacity;
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
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Long availableCapacity; 
            private Long deliveryCapacity; 
            private Long totalCapacity; 
            private Long usedCapacity; 

            /**
             * 当前集群的可用容量，单位为GB
             */
            public Builder availableCapacity(Long availableCapacity) {
                this.availableCapacity = availableCapacity;
                return this;
            }

            /**
             * 待交付容量，单位为GB。
             */
            public Builder deliveryCapacity(Long deliveryCapacity) {
                this.deliveryCapacity = deliveryCapacity;
                return this;
            }

            /**
             * 当前集群总容量，单位为GB
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * 当前集群的已使用（已创盘）容量，单位为GB
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public DedicatedBlockStorageClusterCapacity build() {
                return new DedicatedBlockStorageClusterCapacity(this);
            } 

        } 

    }
    public static class DedicatedBlockStorageClusters extends TeaModel {
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

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportedCategory")
        private String supportedCategory;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private DedicatedBlockStorageClusters(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.dedicatedBlockStorageClusterCapacity = builder.dedicatedBlockStorageClusterCapacity;
            this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
            this.dedicatedBlockStorageClusterName = builder.dedicatedBlockStorageClusterName;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.performanceLevel = builder.performanceLevel;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.supportedCategory = builder.supportedCategory;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportedCategory
         */
        public String getSupportedCategory() {
            return this.supportedCategory;
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
            private String category; 
            private String createTime; 
            private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity; 
            private String dedicatedBlockStorageClusterId; 
            private String dedicatedBlockStorageClusterName; 
            private String description; 
            private String expiredTime; 
            private String performanceLevel; 
            private String regionId; 
            private String status; 
            private String supportedCategory; 
            private String type; 
            private String zoneId; 

            /**
             * 云盘类型，暂时只会返回cloud_essd
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 专属块存储集群创建时间的时间戳，单位为秒
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 专属块存储集群存储容量，单位为GB
             */
            public Builder dedicatedBlockStorageClusterCapacity(DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
                this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
                return this;
            }

            /**
             * 专属块存储集群id
             */
            public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
                this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
                return this;
            }

            /**
             * 专属块存储集群名称
             */
            public Builder dedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
                this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
                return this;
            }

            /**
             * 专属块存储集群描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 专属块存储集群到期时间的时间戳，单位为秒
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * 云盘性能等级，可能值：
             * <p>
             * PL0 
             * PL1 
             * PL2 
             * PL3
             * 仅在SupportedCategory = cloud_essd有效
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 专属块存储集群所在地域id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 专属块存储集群的状态。可能值：
             * <p>
             * Preparing：待交付
             * Running：运行中
             * Expired：集群到期
             * Offline：下线
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 支持的云盘类型（新版），与ECS的云盘类型项对应
             */
            public Builder supportedCategory(String supportedCategory) {
                this.supportedCategory = supportedCategory;
                return this;
            }

            /**
             * 专属块存储集群性能类型。可能值：
             * <p>
             * Standard：基础型。该类型的专属块存储集群中可创建ESSD PL0云盘。
             * Premium：性能型。该类型的专属块存储集群中可创建ESSD PL1云盘。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 专属块存储集群可用区id
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
