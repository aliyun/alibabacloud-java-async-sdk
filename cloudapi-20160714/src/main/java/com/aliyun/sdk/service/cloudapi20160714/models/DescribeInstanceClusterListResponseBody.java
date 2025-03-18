// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceClusterListResponseBody model) {
            this.instanceClusters = model.instanceClusters;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The instance cluster list.</p>
         */
        public Builder instanceClusters(InstanceClusters instanceClusters) {
            this.instanceClusters = instanceClusters;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceClusterListResponseBody build() {
            return new DescribeInstanceClusterListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceClusterListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceClusterListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InstanceCluster model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.instanceClusterId = model.instanceClusterId;
                this.instanceClusterName = model.instanceClusterName;
                this.instanceClusterStatus = model.instanceClusterStatus;
                this.instanceClusterType = model.instanceClusterType;
                this.modifiedTime = model.modifiedTime;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The time when the cluster was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-14T17:46:59+08:00</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The cluster description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test TrafficControl</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-cluster-hz-xxxxxxxxxxxx</p>
             */
            public Builder instanceClusterId(String instanceClusterId) {
                this.instanceClusterId = instanceClusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cluster</p>
             */
            public Builder instanceClusterName(String instanceClusterName) {
                this.instanceClusterName = instanceClusterName;
                return this;
            }

            /**
             * <p>The cluster status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder instanceClusterStatus(String instanceClusterStatus) {
                this.instanceClusterStatus = instanceClusterStatus;
                return this;
            }

            /**
             * <p>The cluster type.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder instanceClusterType(String instanceClusterType) {
                this.instanceClusterType = instanceClusterType;
                return this;
            }

            /**
             * <p>The time when the cluster was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-12T10:11:08+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
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
    /**
     * 
     * {@link DescribeInstanceClusterListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceClusterListResponseBody</p>
     */
    public static class InstanceClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCluster")
        private java.util.List<InstanceCluster> instanceCluster;

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
        public java.util.List<InstanceCluster> getInstanceCluster() {
            return this.instanceCluster;
        }

        public static final class Builder {
            private java.util.List<InstanceCluster> instanceCluster; 

            private Builder() {
            } 

            private Builder(InstanceClusters model) {
                this.instanceCluster = model.instanceCluster;
            } 

            /**
             * InstanceCluster.
             */
            public Builder instanceCluster(java.util.List<InstanceCluster> instanceCluster) {
                this.instanceCluster = instanceCluster;
                return this;
            }

            public InstanceClusters build() {
                return new InstanceClusters(this);
            } 

        } 

    }
}
