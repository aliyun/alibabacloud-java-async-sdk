// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGWSClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGWSClustersResponseBody</p>
 */
public class DescribeGWSClustersResponseBody extends TeaModel {
    @NameInMap("CallerType")
    private String callerType;

    @NameInMap("Clusters")
    private Clusters clusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGWSClustersResponseBody(Builder builder) {
        this.callerType = builder.callerType;
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGWSClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return callerType
     */
    public String getCallerType() {
        return this.callerType;
    }

    /**
     * @return clusters
     */
    public Clusters getClusters() {
        return this.clusters;
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
        private String callerType; 
        private Clusters clusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The type of the account. Valid values:
         * <p>
         * 
         * *   sub: a RAM user.
         * *   parent: an Alibaba Cloud account.
         */
        public Builder callerType(String callerType) {
            this.callerType = callerType;
            return this;
        }

        /**
         * The information of the visualization services.
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
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
         * The number of entries returned on the current page.
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGWSClustersResponseBody build() {
            return new DescribeGWSClustersResponseBody(this);
        } 

    } 

    public static class ClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private ClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.instanceCount = builder.instanceCount;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String createTime; 
            private Integer instanceCount; 
            private String status; 
            private String vpcId; 

            /**
             * The ID of the visualization service.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the visualization service was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of visualization instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The status of the visualization services. Valid values:
             * <p>
             * 
             * *   creating: The service is being created.
             * *   starting: The service is being started.
             * *   running: The service is running.
             * *   deleted: The service is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @NameInMap("ClusterInfo")
        private java.util.List < ClusterInfo> clusterInfo;

        private Clusters(Builder builder) {
            this.clusterInfo = builder.clusterInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterInfo
         */
        public java.util.List < ClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

        public static final class Builder {
            private java.util.List < ClusterInfo> clusterInfo; 

            /**
             * ClusterInfo.
             */
            public Builder clusterInfo(java.util.List < ClusterInfo> clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
