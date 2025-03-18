// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserQuotaResponseBody</p>
 */
public class DescribeUserQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amk_cluster_quota")
    private Long amkClusterQuota;

    @com.aliyun.core.annotation.NameInMap("ask_cluster_quota")
    private Long askClusterQuota;

    @com.aliyun.core.annotation.NameInMap("cluster_nodepool_quota")
    private Long clusterNodepoolQuota;

    @com.aliyun.core.annotation.NameInMap("cluster_quota")
    private Long clusterQuota;

    @com.aliyun.core.annotation.NameInMap("edge_improved_nodepool_quota")
    private EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    @com.aliyun.core.annotation.NameInMap("node_quota")
    private Long nodeQuota;

    @com.aliyun.core.annotation.NameInMap("quotas")
    private java.util.Map<String, QuotasValue> quotas;

    private DescribeUserQuotaResponseBody(Builder builder) {
        this.amkClusterQuota = builder.amkClusterQuota;
        this.askClusterQuota = builder.askClusterQuota;
        this.clusterNodepoolQuota = builder.clusterNodepoolQuota;
        this.clusterQuota = builder.clusterQuota;
        this.edgeImprovedNodepoolQuota = builder.edgeImprovedNodepoolQuota;
        this.nodeQuota = builder.nodeQuota;
        this.quotas = builder.quotas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return quotas
     */
    public java.util.Map<String, QuotasValue> getQuotas() {
        return this.quotas;
    }

    public static final class Builder {
        private Long amkClusterQuota; 
        private Long askClusterQuota; 
        private Long clusterNodepoolQuota; 
        private Long clusterQuota; 
        private EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota; 
        private Long nodeQuota; 
        private java.util.Map<String, QuotasValue> quotas; 

        private Builder() {
        } 

        private Builder(DescribeUserQuotaResponseBody model) {
            this.amkClusterQuota = model.amkClusterQuota;
            this.askClusterQuota = model.askClusterQuota;
            this.clusterNodepoolQuota = model.clusterNodepoolQuota;
            this.clusterQuota = model.clusterQuota;
            this.edgeImprovedNodepoolQuota = model.edgeImprovedNodepoolQuota;
            this.nodeQuota = model.nodeQuota;
            this.quotas = model.quotas;
        } 

        /**
         * <p>The quota of Container Service for Kubernetes (ACK) managed clusters. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder amkClusterQuota(Long amkClusterQuota) {
            this.amkClusterQuota = amkClusterQuota;
            return this;
        }

        /**
         * <p>The quota of ACK Serverless clusters. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder askClusterQuota(Long askClusterQuota) {
            this.askClusterQuota = askClusterQuota;
            return this;
        }

        /**
         * <p>The quota of node pools in an ACK cluster. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder clusterNodepoolQuota(Long clusterNodepoolQuota) {
            this.clusterNodepoolQuota = clusterNodepoolQuota;
            return this;
        }

        /**
         * <p>The quota of clusters that belong to an Alibaba Cloud account. Default value: 50. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder clusterQuota(Long clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }

        /**
         * <p>This parameter is discontinued.</p>
         * <p>The quotas of enhanced edge node pools.</p>
         */
        public Builder edgeImprovedNodepoolQuota(EdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota) {
            this.edgeImprovedNodepoolQuota = edgeImprovedNodepoolQuota;
            return this;
        }

        /**
         * <p>The quota of nodes in an ACK cluster. Default value: 100. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder nodeQuota(Long nodeQuota) {
            this.nodeQuota = nodeQuota;
            return this;
        }

        /**
         * <p>Information about the new quota.</p>
         */
        public Builder quotas(java.util.Map<String, QuotasValue> quotas) {
            this.quotas = quotas;
            return this;
        }

        public DescribeUserQuotaResponseBody build() {
            return new DescribeUserQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserQuotaResponseBody</p>
     */
    public static class EdgeImprovedNodepoolQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("period")
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

            private Builder() {
            } 

            private Builder(EdgeImprovedNodepoolQuota model) {
                this.bandwidth = model.bandwidth;
                this.count = model.count;
                this.period = model.period;
            } 

            /**
             * <p>This parameter is discontinued.</p>
             * <p>The maximum bandwidth of each enhanced edge node pool. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>This parameter is discontinued.</p>
             * <p>The maximum number of enhanced edge node pools that you can create within an Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>This parameter is discontinued.</p>
             * <p>The maximum subscription duration of an enhanced edge node pool. Unit: months.</p>
             * <blockquote>
             * <p> You are charged for enhanced edge node pools based on the pay-as-you-go billing method. Therefore, you can ignore this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
