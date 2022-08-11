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

}
