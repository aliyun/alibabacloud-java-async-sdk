// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeHpcClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHpcClustersResponseBody</p>
 */
public class DescribeHpcClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HpcClusters")
    private HpcClusters hpcClusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHpcClustersResponseBody model) {
            this.hpcClusters = model.hpcClusters;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The name of the HPC cluster.</p>
         */
        public Builder hpcClusters(HpcClusters hpcClusters) {
            this.hpcClusters = hpcClusters;
            return this;
        }

        /**
         * <p>Details about the HPC clusters. The value is an array that consists of the information of each HPC cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of HPC clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the HPC cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHpcClustersResponseBody build() {
            return new DescribeHpcClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHpcClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHpcClustersResponseBody</p>
     */
    public static class HpcCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HpcClusterId")
        private String hpcClusterId;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(HpcCluster model) {
                this.description = model.description;
                this.hpcClusterId = model.hpcClusterId;
                this.name = model.name;
            } 

            /**
             * <p>The description of the HPC cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The description of the HPC cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>hpc-bp1a5zr3u7nq9cx****</p>
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * <p>The name of the HPC cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
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
    /**
     * 
     * {@link DescribeHpcClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHpcClustersResponseBody</p>
     */
    public static class HpcClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HpcCluster")
        private java.util.List<HpcCluster> hpcCluster;

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
        public java.util.List<HpcCluster> getHpcCluster() {
            return this.hpcCluster;
        }

        public static final class Builder {
            private java.util.List<HpcCluster> hpcCluster; 

            private Builder() {
            } 

            private Builder(HpcClusters model) {
                this.hpcCluster = model.hpcCluster;
            } 

            /**
             * HpcCluster.
             */
            public Builder hpcCluster(java.util.List<HpcCluster> hpcCluster) {
                this.hpcCluster = hpcCluster;
                return this;
            }

            public HpcClusters build() {
                return new HpcClusters(this);
            } 

        } 

    }
}
