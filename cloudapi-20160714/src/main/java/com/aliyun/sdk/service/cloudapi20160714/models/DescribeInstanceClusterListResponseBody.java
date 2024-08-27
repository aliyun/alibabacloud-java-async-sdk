// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceClusterListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceClusterListResponseBody</p>
 */
public class DescribeInstanceClusterListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceClusters")
    private InstanceClusters instanceClusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceClusterListResponseBody(Builder builder) {
        this.instanceClusters = builder.instanceClusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceClusterListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceClusters
     */
    public InstanceClusters getInstanceClusters() {
        return this.instanceClusters;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceClusters instanceClusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceClusters.
         */
        public Builder instanceClusters(InstanceClusters instanceClusters) {
            this.instanceClusters = instanceClusters;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceClusterListResponseBody build() {
            return new DescribeInstanceClusterListResponseBody(this);
        } 

    } 

    public static class InstanceCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterId")
        private String instanceClusterId;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterName")
        private String instanceClusterName;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterStatus")
        private String instanceClusterStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterType")
        private String instanceClusterType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private InstanceCluster(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.instanceClusterId = builder.instanceClusterId;
            this.instanceClusterName = builder.instanceClusterName;
            this.instanceClusterStatus = builder.instanceClusterStatus;
            this.instanceClusterType = builder.instanceClusterType;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCluster create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceClusterId
         */
        public String getInstanceClusterId() {
            return this.instanceClusterId;
        }

        /**
         * @return instanceClusterName
         */
        public String getInstanceClusterName() {
            return this.instanceClusterName;
        }

        /**
         * @return instanceClusterStatus
         */
        public String getInstanceClusterStatus() {
            return this.instanceClusterStatus;
        }

        /**
         * @return instanceClusterType
         */
        public String getInstanceClusterType() {
            return this.instanceClusterType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String instanceClusterId; 
            private String instanceClusterName; 
            private String instanceClusterStatus; 
            private String instanceClusterType; 
            private String modifiedTime; 
            private String regionId; 

            /**
             * The time when the cluster was created. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The cluster description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder instanceClusterId(String instanceClusterId) {
                this.instanceClusterId = instanceClusterId;
                return this;
            }

            /**
             * The cluster name.
             */
            public Builder instanceClusterName(String instanceClusterName) {
                this.instanceClusterName = instanceClusterName;
                return this;
            }

            /**
             * The cluster status.
             */
            public Builder instanceClusterStatus(String instanceClusterStatus) {
                this.instanceClusterStatus = instanceClusterStatus;
                return this;
            }

            /**
             * The cluster type.
             */
            public Builder instanceClusterType(String instanceClusterType) {
                this.instanceClusterType = instanceClusterType;
                return this;
            }

            /**
             * The time when the cluster was last modified. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public InstanceCluster build() {
                return new InstanceCluster(this);
            } 

        } 

    }
    public static class InstanceClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCluster")
        private java.util.List < InstanceCluster> instanceCluster;

        private InstanceClusters(Builder builder) {
            this.instanceCluster = builder.instanceCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceClusters create() {
            return builder().build();
        }

        /**
         * @return instanceCluster
         */
        public java.util.List < InstanceCluster> getInstanceCluster() {
            return this.instanceCluster;
        }

        public static final class Builder {
            private java.util.List < InstanceCluster> instanceCluster; 

            /**
             * InstanceCluster.
             */
            public Builder instanceCluster(java.util.List < InstanceCluster> instanceCluster) {
                this.instanceCluster = instanceCluster;
                return this;
            }

            public InstanceClusters build() {
                return new InstanceClusters(this);
            } 

        } 

    }
}
