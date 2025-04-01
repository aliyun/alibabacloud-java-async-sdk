// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogicInstanceTopologyResponseBody</p>
 */
public class DescribeLogicInstanceTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RedisProxyList")
    private RedisProxyList redisProxyList;

    @com.aliyun.core.annotation.NameInMap("RedisShardList")
    private RedisShardList redisShardList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogicInstanceTopologyResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.redisProxyList = builder.redisProxyList;
        this.redisShardList = builder.redisShardList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogicInstanceTopologyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return redisProxyList
     */
    public RedisProxyList getRedisProxyList() {
        return this.redisProxyList;
    }

    /**
     * @return redisShardList
     */
    public RedisShardList getRedisShardList() {
        return this.redisShardList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private RedisProxyList redisProxyList; 
        private RedisShardList redisShardList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogicInstanceTopologyResponseBody model) {
            this.instanceId = model.instanceId;
            this.redisProxyList = model.redisProxyList;
            this.redisShardList = model.redisShardList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The detailed proxy information, including information about proxy nodes.</p>
         */
        public Builder redisProxyList(RedisProxyList redisProxyList) {
            this.redisProxyList = redisProxyList;
            return this;
        }

        /**
         * <p>Details of data shards, which includes node information such as NodeInfo.</p>
         */
        public Builder redisShardList(RedisShardList redisShardList) {
            this.redisShardList = redisShardList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>794120D1-E0CF-4713-BAE4-EBAEA04506AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogicInstanceTopologyResponseBody build() {
            return new DescribeLogicInstanceTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogicInstanceTopologyResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private NodeInfo(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.connection = builder.connection;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private String bandwidth; 
            private String capacity; 
            private String connection; 
            private String nodeId; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.bandwidth = model.bandwidth;
                this.capacity = model.capacity;
                this.connection = model.connection;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>The bandwidth throttling of the node. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The storage capacity of the node. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>5120</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>320000</p>
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp10noxlhcoim2****-proxy-3#542****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>proxy</strong>: proxy node</li>
             * <li><strong>db</strong>: data node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>proxy</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogicInstanceTopologyResponseBody</p>
     */
    public static class RedisProxyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<NodeInfo> nodeInfo;

        private RedisProxyList(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedisProxyList create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List<NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List<NodeInfo> nodeInfo; 

            private Builder() {
            } 

            private Builder(RedisProxyList model) {
                this.nodeInfo = model.nodeInfo;
            } 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public RedisProxyList build() {
                return new RedisProxyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogicInstanceTopologyResponseBody</p>
     */
    public static class RedisShardListNodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("SubInstanceType")
        private String subInstanceType;

        private RedisShardListNodeInfo(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.connection = builder.connection;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.subInstanceType = builder.subInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedisShardListNodeInfo create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return subInstanceType
         */
        public String getSubInstanceType() {
            return this.subInstanceType;
        }

        public static final class Builder {
            private String bandwidth; 
            private String capacity; 
            private String connection; 
            private String nodeId; 
            private String nodeType; 
            private String subInstanceType; 

            private Builder() {
            } 

            private Builder(RedisShardListNodeInfo model) {
                this.bandwidth = model.bandwidth;
                this.capacity = model.capacity;
                this.connection = model.connection;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.subInstanceType = model.subInstanceType;
            } 

            /**
             * <p>The bandwidth throttling of the node. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The storage capacity of the node. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp10noxlhcoim2****-db-0#688****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>proxy</strong>: proxy node</li>
             * <li><strong>db</strong>: data node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>子实例类型，返回值：</p>
             * <ul>
             * <li><strong>master</strong>：主节点类型。</li>
             * <li><strong>readonly</strong>：只读实例类型。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder subInstanceType(String subInstanceType) {
                this.subInstanceType = subInstanceType;
                return this;
            }

            public RedisShardListNodeInfo build() {
                return new RedisShardListNodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogicInstanceTopologyResponseBody</p>
     */
    public static class RedisShardList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<RedisShardListNodeInfo> nodeInfo;

        private RedisShardList(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedisShardList create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List<RedisShardListNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List<RedisShardListNodeInfo> nodeInfo; 

            private Builder() {
            } 

            private Builder(RedisShardList model) {
                this.nodeInfo = model.nodeInfo;
            } 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<RedisShardListNodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public RedisShardList build() {
                return new RedisShardList(this);
            } 

        } 

    }
}
