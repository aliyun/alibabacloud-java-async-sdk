// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("DedicatedBlockStorageClusters")
    private DedicatedBlockStorageClusters dedicatedBlockStorageClusters;

    private DescribeDedicatedBlockStorageClustersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.dedicatedBlockStorageClusters = builder.dedicatedBlockStorageClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClustersResponseBody create() {
        return builder().build();
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

    /**
     * @return dedicatedBlockStorageClusters
     */
    public DedicatedBlockStorageClusters getDedicatedBlockStorageClusters() {
        return this.dedicatedBlockStorageClusters;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private DedicatedBlockStorageClusters dedicatedBlockStorageClusters; 

        /**
         * The query credential value returned by this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * An array consisting of one or more exclusive block storage clusters.
         */
        public Builder dedicatedBlockStorageClusters(DedicatedBlockStorageClusters dedicatedBlockStorageClusters) {
            this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
            return this;
        }

        public DescribeDedicatedBlockStorageClustersResponseBody build() {
            return new DescribeDedicatedBlockStorageClustersResponseBody(this);
        } 

    } 

    public static class DedicatedBlockStorageClusterCapacity extends TeaModel {
        @NameInMap("TotalCapacity")
        private Long totalCapacity;

        @NameInMap("AvailableCapacity")
        private Long availableCapacity;

        private DedicatedBlockStorageClusterCapacity(Builder builder) {
            this.totalCapacity = builder.totalCapacity;
            this.availableCapacity = builder.availableCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageClusterCapacity create() {
            return builder().build();
        }

        /**
         * @return totalCapacity
         */
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return availableCapacity
         */
        public Long getAvailableCapacity() {
            return this.availableCapacity;
        }

        public static final class Builder {
            private Long totalCapacity; 
            private Long availableCapacity; 

            /**
             * The total capacity of the current cluster. Unit: GiB.
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * The available capacity of the current cluster. Unit: GiB.
             */
            public Builder availableCapacity(Long availableCapacity) {
                this.availableCapacity = availableCapacity;
                return this;
            }

            public DedicatedBlockStorageClusterCapacity build() {
                return new DedicatedBlockStorageClusterCapacity(this);
            } 

        } 

    }
    public static class DedicatedBlockStorageCluster extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Category")
        private String category;

        @NameInMap("DedicatedBlockStorageClusterName")
        private String dedicatedBlockStorageClusterName;

        @NameInMap("DedicatedBlockStorageClusterId")
        private String dedicatedBlockStorageClusterId;

        @NameInMap("DedicatedBlockStorageClusterCapacity")
        private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity;

        private DedicatedBlockStorageCluster(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.createTime = builder.createTime;
            this.zoneId = builder.zoneId;
            this.category = builder.category;
            this.dedicatedBlockStorageClusterName = builder.dedicatedBlockStorageClusterName;
            this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
            this.dedicatedBlockStorageClusterCapacity = builder.dedicatedBlockStorageClusterCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageCluster create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return dedicatedBlockStorageClusterName
         */
        public String getDedicatedBlockStorageClusterName() {
            return this.dedicatedBlockStorageClusterName;
        }

        /**
         * @return dedicatedBlockStorageClusterId
         */
        public String getDedicatedBlockStorageClusterId() {
            return this.dedicatedBlockStorageClusterId;
        }

        /**
         * @return dedicatedBlockStorageClusterCapacity
         */
        public DedicatedBlockStorageClusterCapacity getDedicatedBlockStorageClusterCapacity() {
            return this.dedicatedBlockStorageClusterCapacity;
        }

        public static final class Builder {
            private String status; 
            private String type; 
            private String description; 
            private String expiredTime; 
            private String createTime; 
            private String zoneId; 
            private String category; 
            private String dedicatedBlockStorageClusterName; 
            private String dedicatedBlockStorageClusterId; 
            private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity; 

            /**
             * The status of the dedicated block storage cluster. Possible values:
             * <p>
             * 
             * -Preparing: to be delivered
             * 
             * -Running: Running
             * 
             * -Expired: the cluster expires.
             * 
             * -Offline: unpublish
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The performance type of the dedicated block storage cluster. Possible values:
             * <p>
             * 
             * -Standard: Basic. ESSD PL0 disks can be created in exclusive block storage clusters of this type.
             * -Premium: performance type. ESSD PL1 cloud disks can be created in exclusive block storage clusters of this type.
             */
            public Builder type(String type) {
                this.type = type;
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
             * The expiration time of the dedicated block storage cluster.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The time when the dedicated block storage cluster was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the zone to which the cluster belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The type of cloud disk that can be created in the exclusive block storage cluster.
             */
            public Builder category(String category) {
                this.category = category;
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
             * The ID of the dedicated block storage cluster.
             */
            public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
                this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
                return this;
            }

            /**
             * The storage capacity of the exclusive block storage cluster.
             */
            public Builder dedicatedBlockStorageClusterCapacity(DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
                this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
                return this;
            }

            public DedicatedBlockStorageCluster build() {
                return new DedicatedBlockStorageCluster(this);
            } 

        } 

    }
    public static class DedicatedBlockStorageClusters extends TeaModel {
        @NameInMap("DedicatedBlockStorageCluster")
        private java.util.List < DedicatedBlockStorageCluster> dedicatedBlockStorageCluster;

        private DedicatedBlockStorageClusters(Builder builder) {
            this.dedicatedBlockStorageCluster = builder.dedicatedBlockStorageCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageClusters create() {
            return builder().build();
        }

        /**
         * @return dedicatedBlockStorageCluster
         */
        public java.util.List < DedicatedBlockStorageCluster> getDedicatedBlockStorageCluster() {
            return this.dedicatedBlockStorageCluster;
        }

        public static final class Builder {
            private java.util.List < DedicatedBlockStorageCluster> dedicatedBlockStorageCluster; 

            /**
             * DedicatedBlockStorageCluster.
             */
            public Builder dedicatedBlockStorageCluster(java.util.List < DedicatedBlockStorageCluster> dedicatedBlockStorageCluster) {
                this.dedicatedBlockStorageCluster = dedicatedBlockStorageCluster;
                return this;
            }

            public DedicatedBlockStorageClusters build() {
                return new DedicatedBlockStorageClusters(this);
            } 

        } 

    }
}
