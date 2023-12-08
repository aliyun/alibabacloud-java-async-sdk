// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourceDetailResponseBody</p>
 */
public class DescribeClusterResourceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterResourceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResourceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResourceDetailResponseBody build() {
            return new DescribeClusterResourceDetailResponseBody(this);
        } 

    } 

    public static class ResourceGroupList extends TeaModel {
        @NameInMap("ClusterMode")
        @Validation(required = true)
        private String clusterMode;

        @NameInMap("ClusterSizeResource")
        private String clusterSizeResource;

        @NameInMap("MaxClusterCount")
        private Integer maxClusterCount;

        @NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @NameInMap("MinClusterCount")
        private Integer minClusterCount;

        @NameInMap("MinComputeResource")
        private String minComputeResource;

        @NameInMap("PoolId")
        private Long poolId;

        @NameInMap("PoolName")
        private String poolName;

        @NameInMap("PoolType")
        private String poolType;

        @NameInMap("PoolUsers")
        private String poolUsers;

        @NameInMap("RunningClusterCount")
        private Integer runningClusterCount;

        @NameInMap("Status")
        private String status;

        private ResourceGroupList(Builder builder) {
            this.clusterMode = builder.clusterMode;
            this.clusterSizeResource = builder.clusterSizeResource;
            this.maxClusterCount = builder.maxClusterCount;
            this.maxComputeResource = builder.maxComputeResource;
            this.minClusterCount = builder.minClusterCount;
            this.minComputeResource = builder.minComputeResource;
            this.poolId = builder.poolId;
            this.poolName = builder.poolName;
            this.poolType = builder.poolType;
            this.poolUsers = builder.poolUsers;
            this.runningClusterCount = builder.runningClusterCount;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupList create() {
            return builder().build();
        }

        /**
         * @return clusterMode
         */
        public String getClusterMode() {
            return this.clusterMode;
        }

        /**
         * @return clusterSizeResource
         */
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        /**
         * @return maxClusterCount
         */
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        /**
         * @return maxComputeResource
         */
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        /**
         * @return minClusterCount
         */
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        /**
         * @return minComputeResource
         */
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        /**
         * @return poolId
         */
        public Long getPoolId() {
            return this.poolId;
        }

        /**
         * @return poolName
         */
        public String getPoolName() {
            return this.poolName;
        }

        /**
         * @return poolType
         */
        public String getPoolType() {
            return this.poolType;
        }

        /**
         * @return poolUsers
         */
        public String getPoolUsers() {
            return this.poolUsers;
        }

        /**
         * @return runningClusterCount
         */
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterMode; 
            private String clusterSizeResource; 
            private Integer maxClusterCount; 
            private String maxComputeResource; 
            private Integer minClusterCount; 
            private String minComputeResource; 
            private Long poolId; 
            private String poolName; 
            private String poolType; 
            private String poolUsers; 
            private Integer runningClusterCount; 
            private String status; 

            /**
             * ClusterMode.
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * ClusterSizeResource.
             */
            public Builder clusterSizeResource(String clusterSizeResource) {
                this.clusterSizeResource = clusterSizeResource;
                return this;
            }

            /**
             * MaxClusterCount.
             */
            public Builder maxClusterCount(Integer maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * MaxComputeResource.
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * MinClusterCount.
             */
            public Builder minClusterCount(Integer minClusterCount) {
                this.minClusterCount = minClusterCount;
                return this;
            }

            /**
             * MinComputeResource.
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            /**
             * PoolId.
             */
            public Builder poolId(Long poolId) {
                this.poolId = poolId;
                return this;
            }

            /**
             * PoolName.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * PoolType.
             */
            public Builder poolType(String poolType) {
                this.poolType = poolType;
                return this;
            }

            /**
             * PoolUsers.
             */
            public Builder poolUsers(String poolUsers) {
                this.poolUsers = poolUsers;
                return this;
            }

            /**
             * RunningClusterCount.
             */
            public Builder runningClusterCount(Integer runningClusterCount) {
                this.runningClusterCount = runningClusterCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceGroupList build() {
                return new ResourceGroupList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ComputeResource")
        private String computeResource;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("FreeComputeResource")
        private String freeComputeResource;

        @NameInMap("ResourceGroupList")
        private java.util.List < ResourceGroupList> resourceGroupList;

        @NameInMap("StorageResource")
        private String storageResource;

        private Data(Builder builder) {
            this.computeResource = builder.computeResource;
            this.DBClusterId = builder.DBClusterId;
            this.freeComputeResource = builder.freeComputeResource;
            this.resourceGroupList = builder.resourceGroupList;
            this.storageResource = builder.storageResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return freeComputeResource
         */
        public String getFreeComputeResource() {
            return this.freeComputeResource;
        }

        /**
         * @return resourceGroupList
         */
        public java.util.List < ResourceGroupList> getResourceGroupList() {
            return this.resourceGroupList;
        }

        /**
         * @return storageResource
         */
        public String getStorageResource() {
            return this.storageResource;
        }

        public static final class Builder {
            private String computeResource; 
            private String DBClusterId; 
            private String freeComputeResource; 
            private java.util.List < ResourceGroupList> resourceGroupList; 
            private String storageResource; 

            /**
             * ComputeResource.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * FreeComputeResource.
             */
            public Builder freeComputeResource(String freeComputeResource) {
                this.freeComputeResource = freeComputeResource;
                return this;
            }

            /**
             * ResourceGroupList.
             */
            public Builder resourceGroupList(java.util.List < ResourceGroupList> resourceGroupList) {
                this.resourceGroupList = resourceGroupList;
                return this;
            }

            /**
             * StorageResource.
             */
            public Builder storageResource(String storageResource) {
                this.storageResource = storageResource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
