// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHBaseHaDBResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHBaseHaDBResponseBody</p>
 */
public class QueryHBaseHaDBResponseBody extends TeaModel {
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

    private QueryHBaseHaDBResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHBaseHaDBResponseBody create() {
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

        public QueryHBaseHaDBResponseBody build() {
            return new QueryHBaseHaDBResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveName")
        private String activeName;

        @com.aliyun.core.annotation.NameInMap("BdsName")
        private String bdsName;

        @com.aliyun.core.annotation.NameInMap("HaName")
        private String haName;

        @com.aliyun.core.annotation.NameInMap("StandbyName")
        private String standbyName;

        private Cluster(Builder builder) {
            this.activeName = builder.activeName;
            this.bdsName = builder.bdsName;
            this.haName = builder.haName;
            this.standbyName = builder.standbyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return activeName
         */
        public String getActiveName() {
            return this.activeName;
        }

        /**
         * @return bdsName
         */
        public String getBdsName() {
            return this.bdsName;
        }

        /**
         * @return haName
         */
        public String getHaName() {
            return this.haName;
        }

        /**
         * @return standbyName
         */
        public String getStandbyName() {
            return this.standbyName;
        }

        public static final class Builder {
            private String activeName; 
            private String bdsName; 
            private String haName; 
            private String standbyName; 

            /**
             * ActiveName.
             */
            public Builder activeName(String activeName) {
                this.activeName = activeName;
                return this;
            }

            /**
             * BdsName.
             */
            public Builder bdsName(String bdsName) {
                this.bdsName = bdsName;
                return this;
            }

            /**
             * HaName.
             */
            public Builder haName(String haName) {
                this.haName = haName;
                return this;
            }

            /**
             * StandbyName.
             */
            public Builder standbyName(String standbyName) {
                this.standbyName = standbyName;
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
