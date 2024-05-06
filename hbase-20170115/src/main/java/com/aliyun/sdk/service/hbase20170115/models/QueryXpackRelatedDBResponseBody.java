// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryXpackRelatedDBResponseBody} extends {@link TeaModel}
 *
 * <p>QueryXpackRelatedDBResponseBody</p>
 */
public class QueryXpackRelatedDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterList")
    private ClusterList clusterList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryXpackRelatedDBResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryXpackRelatedDBResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterList
     */
    public ClusterList getClusterList() {
        return this.clusterList;
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
        private ClusterList clusterList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterList.
         */
        public Builder clusterList(ClusterList clusterList) {
            this.clusterList = clusterList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryXpackRelatedDBResponseBody build() {
            return new QueryXpackRelatedDBResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("IsRelated")
        private Boolean isRelated;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.isRelated = builder.isRelated;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return isRelated
         */
        public Boolean getIsRelated() {
            return this.isRelated;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String DBType; 
            private String DBVersion; 
            private Boolean isRelated; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * IsRelated.
             */
            public Builder isRelated(Boolean isRelated) {
                this.isRelated = isRelated;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cluster")
        private java.util.List < Cluster> cluster;

        private ClusterList(Builder builder) {
            this.cluster = builder.cluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public java.util.List < Cluster> getCluster() {
            return this.cluster;
        }

        public static final class Builder {
            private java.util.List < Cluster> cluster; 

            /**
             * Cluster.
             */
            public Builder cluster(java.util.List < Cluster> cluster) {
                this.cluster = cluster;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
}
