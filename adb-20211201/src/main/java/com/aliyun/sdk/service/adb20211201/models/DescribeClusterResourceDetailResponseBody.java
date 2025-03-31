// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeClusterResourceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourceDetailResponseBody</p>
 */
public class DescribeClusterResourceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClusterResourceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried resource usage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResourceDetailResponseBody build() {
            return new DescribeClusterResourceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourceDetailResponseBody</p>
     */
    public static class ResourceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clusterMode;

        @com.aliyun.core.annotation.NameInMap("ClusterSizeResource")
        private String clusterSizeResource;

        @com.aliyun.core.annotation.NameInMap("EnableSpot")
        private Boolean enableSpot;

        @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
        private Integer maxClusterCount;

        @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @com.aliyun.core.annotation.NameInMap("MinClusterCount")
        private Integer minClusterCount;

        @com.aliyun.core.annotation.NameInMap("MinComputeResource")
        private String minComputeResource;

        @com.aliyun.core.annotation.NameInMap("PoolId")
        private Long poolId;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("PoolType")
        private String poolType;

        @com.aliyun.core.annotation.NameInMap("PoolUsers")
        private String poolUsers;

        @com.aliyun.core.annotation.NameInMap("RunningClusterCount")
        private Integer runningClusterCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceGroupList(Builder builder) {
            this.clusterMode = builder.clusterMode;
            this.clusterSizeResource = builder.clusterSizeResource;
            this.enableSpot = builder.enableSpot;
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
         * @return enableSpot
         */
        public Boolean getEnableSpot() {
            return this.enableSpot;
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
            private Boolean enableSpot; 
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

            private Builder() {
            } 

            private Builder(ResourceGroupList model) {
                this.clusterMode = model.clusterMode;
                this.clusterSizeResource = model.clusterSizeResource;
                this.enableSpot = model.enableSpot;
                this.maxClusterCount = model.maxClusterCount;
                this.maxComputeResource = model.maxComputeResource;
                this.minClusterCount = model.minClusterCount;
                this.minComputeResource = model.minComputeResource;
                this.poolId = model.poolId;
                this.poolName = model.poolName;
                this.poolType = model.poolType;
                this.poolUsers = model.poolUsers;
                this.runningClusterCount = model.runningClusterCount;
                this.status = model.status;
            } 

            /**
             * <p>A reserved parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clusterSizeResource(String clusterSizeResource) {
                this.clusterSizeResource = clusterSizeResource;
                return this;
            }

            /**
             * <p>Indicates whether the preemptible instance feature is enabled for the resource group. After the preemptible instance feature is enabled, you are charged for resources at a lower unit price but the resources are probably released. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <p>The True value is returned only for job resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSpot(Boolean enableSpot) {
                this.enableSpot = enableSpot;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxClusterCount(Integer maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * <p>The maximum amount of reserved computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>128ACU</p>
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minClusterCount(Integer minClusterCount) {
                this.minClusterCount = minClusterCount;
                return this;
            }

            /**
             * <p>The minimum amount of reserved computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder poolId(Long poolId) {
                this.poolId = poolId;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>testadb</p>
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * <p>The type of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>interactive</p>
             */
            public Builder poolType(String poolType) {
                this.poolType = poolType;
                return this;
            }

            /**
             * <p>The user of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder poolUsers(String poolUsers) {
                this.poolUsers = poolUsers;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder runningClusterCount(Integer runningClusterCount) {
                this.runningClusterCount = runningClusterCount;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>deleting</strong></li>
             * <li><strong>scaling</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
    /**
     * 
     * {@link DescribeClusterResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourceDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("FreeComputeResource")
        private String freeComputeResource;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
        private java.util.List<ResourceGroupList> resourceGroupList;

        @com.aliyun.core.annotation.NameInMap("StorageResource")
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
        public java.util.List<ResourceGroupList> getResourceGroupList() {
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
            private java.util.List<ResourceGroupList> resourceGroupList; 
            private String storageResource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.computeResource = model.computeResource;
                this.DBClusterId = model.DBClusterId;
                this.freeComputeResource = model.freeComputeResource;
                this.resourceGroupList = model.resourceGroupList;
                this.storageResource = model.storageResource;
            } 

            /**
             * <p>The amount of reserved computing resources. Unit: AnalyticDB compute units (ACUs). Valid values: 0 to 4096. The value must be in increments of 16 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-adbxxxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The amount of idle reserved computing resources. Unit: ACUs. Valid values: 0 to 4096. The value must be in increments of 16 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>0ACU</p>
             */
            public Builder freeComputeResource(String freeComputeResource) {
                this.freeComputeResource = freeComputeResource;
                return this;
            }

            /**
             * <p>The resource groups.</p>
             */
            public Builder resourceGroupList(java.util.List<ResourceGroupList> resourceGroupList) {
                this.resourceGroupList = resourceGroupList;
                return this;
            }

            /**
             * <p>The amount of reserved storage resources. Unit: ACUs. Valid values: 0 to 2064. The value must be in increments of 24 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>24ACU</p>
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
