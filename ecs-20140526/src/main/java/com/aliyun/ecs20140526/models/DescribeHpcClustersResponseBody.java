// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHpcClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHpcClustersResponseBody</p>
 */
public class DescribeHpcClustersResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("HpcClusters")
    private HpcClusters hpcClusters;

    private DescribeHpcClustersResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.hpcClusters = builder.hpcClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHpcClustersResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return hpcClusters
     */
    public HpcClusters getHpcClusters() {
        return this.hpcClusters;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private HpcClusters hpcClusters; 

        /**
         * The number of entries to return on each page.
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
         * The page number of the HPC cluster list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of HPC clusters.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Returns the HPC cluster information in an array of HpcCluster.
         */
        public Builder hpcClusters(HpcClusters hpcClusters) {
            this.hpcClusters = hpcClusters;
            return this;
        }

        public DescribeHpcClustersResponseBody build() {
            return new DescribeHpcClustersResponseBody(this);
        } 

    } 

    public static class HpcCluster extends TeaModel {
        @NameInMap("HpcClusterId")
        private String hpcClusterId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Description")
        private String description;

        private HpcCluster(Builder builder) {
            this.hpcClusterId = builder.hpcClusterId;
            this.name = builder.name;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HpcCluster create() {
            return builder().build();
        }

        /**
         * @return hpcClusterId
         */
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String hpcClusterId; 
            private String name; 
            private String description; 

            /**
             * The ID of the HPC cluster.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * HPC the name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * HPC clusters description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public HpcCluster build() {
                return new HpcCluster(this);
            } 

        } 

    }
    public static class HpcClusters extends TeaModel {
        @NameInMap("HpcCluster")
        private java.util.List < HpcCluster> hpcCluster;

        private HpcClusters(Builder builder) {
            this.hpcCluster = builder.hpcCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HpcClusters create() {
            return builder().build();
        }

        /**
         * @return hpcCluster
         */
        public java.util.List < HpcCluster> getHpcCluster() {
            return this.hpcCluster;
        }

        public static final class Builder {
            private java.util.List < HpcCluster> hpcCluster; 

            /**
             * HpcCluster.
             */
            public Builder hpcCluster(java.util.List < HpcCluster> hpcCluster) {
                this.hpcCluster = hpcCluster;
                return this;
            }

            public HpcClusters build() {
                return new HpcClusters(this);
            } 

        } 

    }
}
