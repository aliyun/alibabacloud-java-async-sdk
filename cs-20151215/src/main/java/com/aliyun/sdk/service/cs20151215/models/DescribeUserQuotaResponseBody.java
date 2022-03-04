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

    @NameInMap("node_quota")
    private Long nodeQuota;

    private DescribeUserQuotaResponseBody(Builder builder) {
        this.amkClusterQuota = builder.amkClusterQuota;
        this.askClusterQuota = builder.askClusterQuota;
        this.clusterNodepoolQuota = builder.clusterNodepoolQuota;
        this.clusterQuota = builder.clusterQuota;
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
        private Long nodeQuota; 

        /**
         * The quota of managed clusters. Default value: 20. If the default value is exceeded, you need to [open a ticket](https://selfservice.console.aliyun.com/ticket/category/cs/today) to apply for scale-out.
         */
        public Builder amkClusterQuota(Long amkClusterQuota) {
            this.amkClusterQuota = amkClusterQuota;
            return this;
        }

        /**
         * Serverless cluster quota. Default value: 20. If the default value is exceeded, you need to [open a ticket](https://selfservice.console.aliyun.com/ticket/category/cs/today) to apply for scale-out.
         */
        public Builder askClusterQuota(Long askClusterQuota) {
            this.askClusterQuota = askClusterQuota;
            return this;
        }

        /**
         * The quota of a single cluster node pool. Default value: 20. If the default value is exceeded, you need to [open a ticket](https://selfservice.console.aliyun.com/ticket/category/cs/today) to apply for scale-out.
         */
        public Builder clusterNodepoolQuota(Long clusterNodepoolQuota) {
            this.clusterNodepoolQuota = clusterNodepoolQuota;
            return this;
        }

        /**
         * The total number of clusters per account. Default value: 50. If the default value is exceeded, you need to [open a ticket](https://selfservice.console.aliyun.com/ticket/category/cs/today) to apply for scale-out.
         */
        public Builder clusterQuota(Long clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }

        /**
         * The number of nodes in a cluster. Default value: 100. If the default value is exceeded, you need to [open a ticket](https://selfservice.console.aliyun.com/ticket/category/cs/today) to apply for scale-out.
         */
        public Builder nodeQuota(Long nodeQuota) {
            this.nodeQuota = nodeQuota;
            return this;
        }

        public DescribeUserQuotaResponseBody build() {
            return new DescribeUserQuotaResponseBody(this);
        } 

    } 

}
