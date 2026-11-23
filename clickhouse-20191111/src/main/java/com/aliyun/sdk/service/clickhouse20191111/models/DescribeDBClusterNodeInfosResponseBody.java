// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeDBClusterNodeInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNodeInfosResponseBody</p>
 */
public class DescribeDBClusterNodeInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeInfos")
    private java.util.List<NodeInfos> nodeInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNodeCount")
    private Integer totalNodeCount;

    @com.aliyun.core.annotation.NameInMap("ZkNodeInfos")
    private java.util.List<ZkNodeInfos> zkNodeInfos;

    private DescribeDBClusterNodeInfosResponseBody(Builder builder) {
        this.nodeInfos = builder.nodeInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNodeCount = builder.totalNodeCount;
        this.zkNodeInfos = builder.zkNodeInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterNodeInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeInfos
     */
    public java.util.List<NodeInfos> getNodeInfos() {
        return this.nodeInfos;
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
     * @return totalNodeCount
     */
    public Integer getTotalNodeCount() {
        return this.totalNodeCount;
    }

    /**
     * @return zkNodeInfos
     */
    public java.util.List<ZkNodeInfos> getZkNodeInfos() {
        return this.zkNodeInfos;
    }

    public static final class Builder {
        private java.util.List<NodeInfos> nodeInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNodeCount; 
        private java.util.List<ZkNodeInfos> zkNodeInfos; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterNodeInfosResponseBody model) {
            this.nodeInfos = model.nodeInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNodeCount = model.totalNodeCount;
            this.zkNodeInfos = model.zkNodeInfos;
        } 

        /**
         * <p>The ApsaraDB for ClickHouse node information.</p>
         */
        public Builder nodeInfos(java.util.List<NodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>746CD303-0B82-5E8D-886D-93A9FAF3A876</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNodeCount(Integer totalNodeCount) {
            this.totalNodeCount = totalNodeCount;
            return this;
        }

        /**
         * <p>The ZooKeeper node information.</p>
         */
        public Builder zkNodeInfos(java.util.List<ZkNodeInfos> zkNodeInfos) {
            this.zkNodeInfos = zkNodeInfos;
            return this;
        }

        public DescribeDBClusterNodeInfosResponseBody build() {
            return new DescribeDBClusterNodeInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterNodeInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNodeInfosResponseBody</p>
     */
    public static class NodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailoverTesting")
        private Boolean failoverTesting;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ReplicaId")
        private String replicaId;

        @com.aliyun.core.annotation.NameInMap("ShardId")
        private String shardId;

        private NodeInfos(Builder builder) {
            this.failoverTesting = builder.failoverTesting;
            this.nodeIp = builder.nodeIp;
            this.nodeName = builder.nodeName;
            this.replicaId = builder.replicaId;
            this.shardId = builder.shardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfos create() {
            return builder().build();
        }

        /**
         * @return failoverTesting
         */
        public Boolean getFailoverTesting() {
            return this.failoverTesting;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return replicaId
         */
        public String getReplicaId() {
            return this.replicaId;
        }

        /**
         * @return shardId
         */
        public String getShardId() {
            return this.shardId;
        }

        public static final class Builder {
            private Boolean failoverTesting; 
            private String nodeIp; 
            private String nodeName; 
            private String replicaId; 
            private String shardId; 

            private Builder() {
            } 

            private Builder(NodeInfos model) {
                this.failoverTesting = model.failoverTesting;
                this.nodeIp = model.nodeIp;
                this.nodeName = model.nodeName;
                this.replicaId = model.replicaId;
                this.shardId = model.shardId;
            } 

            /**
             * <p>Indicates whether a disaster recovery drill is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder failoverTesting(Boolean failoverTesting) {
                this.failoverTesting = failoverTesting;
                return this;
            }

            /**
             * <p>The node IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.168.0.1</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>ck-bp108z124a8****</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replicaId(String replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * <p>The shard ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder shardId(String shardId) {
                this.shardId = shardId;
                return this;
            }

            public NodeInfos build() {
                return new NodeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNodeInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNodeInfosResponseBody</p>
     */
    public static class ZkNodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailoverTesting")
        private Boolean failoverTesting;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ReplicaId")
        private String replicaId;

        private ZkNodeInfos(Builder builder) {
            this.failoverTesting = builder.failoverTesting;
            this.nodeName = builder.nodeName;
            this.replicaId = builder.replicaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZkNodeInfos create() {
            return builder().build();
        }

        /**
         * @return failoverTesting
         */
        public Boolean getFailoverTesting() {
            return this.failoverTesting;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return replicaId
         */
        public String getReplicaId() {
            return this.replicaId;
        }

        public static final class Builder {
            private Boolean failoverTesting; 
            private String nodeName; 
            private String replicaId; 

            private Builder() {
            } 

            private Builder(ZkNodeInfos model) {
                this.failoverTesting = model.failoverTesting;
                this.nodeName = model.nodeName;
                this.replicaId = model.replicaId;
            } 

            /**
             * <p>Indicates whether a disaster recovery drill is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder failoverTesting(Boolean failoverTesting) {
                this.failoverTesting = failoverTesting;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>ck-bp108z124a8****</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ZooKeeper node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replicaId(String replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            public ZkNodeInfos build() {
                return new ZkNodeInfos(this);
            } 

        } 

    }
}
