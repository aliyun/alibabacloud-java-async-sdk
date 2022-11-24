// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserQuotaResponseBody</p>
 */
public class DescribeUserQuotaResponseBody extends TeaModel {
    @NameInMap("amk_cluster_quota")
    private Long amkClusterQuota;

    @NameInMap("ask_cluster_quota")
    private Long askClusterQuota;

    @NameInMap("cluster_nodepool_quota")
    private Long clusterNodepoolQuota;

    @NameInMap("cluster_quota")
    private Long clusterQuota;

    @NameInMap("edge_improved_nodepool_quota")
    private EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    @NameInMap("node_quota")
    private Long nodeQuota;

    private DescribeUserQuotaResponseBody(Builder builder) {
        this.amkClusterQuota = builder.amkClusterQuota;
        this.askClusterQuota = builder.askClusterQuota;
        this.clusterNodepoolQuota = builder.clusterNodepoolQuota;
        this.clusterQuota = builder.clusterQuota;
        this.edgeImprovedNodepoolQuota = builder.edgeImprovedNodepoolQuota;
        this.nodeQuota = builder.nodeQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return amkClusterQuota
     */
    public Long getAmkClusterQuota() {
        return this.amkClusterQuota;
    }

    /**
     * @return askClusterQuota
     */
    public Long getAskClusterQuota() {
        return this.askClusterQuota;
    }

    /**
     * @return clusterNodepoolQuota
     */
    public Long getClusterNodepoolQuota() {
        return this.clusterNodepoolQuota;
    }

    /**
     * @return clusterQuota
     */
    public Long getClusterQuota() {
        return this.clusterQuota;
    }

    /**
     * @return edgeImprovedNodepoolQuota
     */
    public EdgeImprovedNodepoolQuota getEdgeImprovedNodepoolQuota() {
        return this.edgeImprovedNodepoolQuota;
    }

    /**
     * @return nodeQuota
     */
    public Long getNodeQuota() {
        return this.nodeQuota;
    }

    public static final class Builder {
        private Long amkClusterQuota; 
        private Long askClusterQuota; 
        private Long clusterNodepoolQuota; 
        private Long clusterQuota; 
        private EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota; 
        private Long nodeQuota; 

        /**
         * 托管版集群配额。
         */
        public Builder amkClusterQuota(Long amkClusterQuota) {
            this.amkClusterQuota = amkClusterQuota;
            return this;
        }

        /**
         * Serverless集群配额。
         */
        public Builder askClusterQuota(Long askClusterQuota) {
            this.askClusterQuota = askClusterQuota;
            return this;
        }

        /**
         * 集群节点池配额。
         */
        public Builder clusterNodepoolQuota(Long clusterNodepoolQuota) {
            this.clusterNodepoolQuota = clusterNodepoolQuota;
            return this;
        }

        /**
         * 专有版集群托管版集群的总配额。
         */
        public Builder clusterQuota(Long clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }

        /**
         * 边缘增强型节点池quota
         */
        public Builder edgeImprovedNodepoolQuota(EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota) {
            this.edgeImprovedNodepoolQuota = edgeImprovedNodepoolQuota;
            return this;
        }

        /**
         * 单集群的节点配额。
         */
        public Builder nodeQuota(Long nodeQuota) {
            this.nodeQuota = nodeQuota;
            return this;
        }

        public DescribeUserQuotaResponseBody build() {
            return new DescribeUserQuotaResponseBody(this);
        } 

    } 

    public static class EdgeImprovedNodepoolQuota extends TeaModel {
        @NameInMap("bandwidth")
        private Integer bandwidth;

        @NameInMap("count")
        private Integer count;

        @NameInMap("period")
        private Integer period;

        private EdgeImprovedNodepoolQuota(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.count = builder.count;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeImprovedNodepoolQuota create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer count; 
            private Integer period; 

            /**
             * 每个边缘增强型节点池允许的最大带宽，单位Mbps
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * 每个账号下允许创建的边缘增强型节点池数量。
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * 每个边缘增强型节点池最大购买时长，单位月。由于边缘增强型节点池为按量付费，用户暂时无需关注该字段。
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            public EdgeImprovedNodepoolQuota build() {
                return new EdgeImprovedNodepoolQuota(this);
            } 

        } 

    }
}
