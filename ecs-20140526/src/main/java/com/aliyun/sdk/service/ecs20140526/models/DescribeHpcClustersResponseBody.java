// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("HpcClusters")
    private HpcClusters hpcClusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHpcClustersResponseBody(Builder builder) {
        this.hpcClusters = builder.hpcClusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHpcClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return hpcClusters
     */
    public HpcClusters getHpcClusters() {
        return this.hpcClusters;
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
        private HpcClusters hpcClusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The name of the HPC cluster.
         */
        public Builder hpcClusters(HpcClusters hpcClusters) {
            this.hpcClusters = hpcClusters;
            return this;
        }

        /**
         * Details about the HPC clusters. The value is an array that consists of the information of each HPC cluster.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of HPC clusters.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the HPC cluster.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHpcClustersResponseBody build() {
            return new DescribeHpcClustersResponseBody(this);
        } 

    } 

    public static class HpcCluster extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("HpcClusterId")
        private String hpcClusterId;

        @NameInMap("Name")
        private String name;

        private HpcCluster(Builder builder) {
            this.description = builder.description;
            this.hpcClusterId = builder.hpcClusterId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HpcCluster create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        public static final class Builder {
            private String description; 
            private String hpcClusterId; 
            private String name; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The description of the HPC cluster.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
