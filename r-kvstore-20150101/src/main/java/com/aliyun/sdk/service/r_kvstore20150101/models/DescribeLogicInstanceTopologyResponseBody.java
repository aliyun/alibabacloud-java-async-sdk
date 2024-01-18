// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogicInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogicInstanceTopologyResponseBody</p>
 */
public class DescribeLogicInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RedisProxyList")
    private RedisProxyList redisProxyList;

    @NameInMap("RedisShardList")
    private RedisShardList redisShardList;

    @NameInMap("RequestId")
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

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The information about proxy nodes.
         */
        public Builder redisProxyList(RedisProxyList redisProxyList) {
            this.redisProxyList = redisProxyList;
            return this;
        }

        /**
         * Details of data shards, including node information such as NodeInfo.
         */
        public Builder redisShardList(RedisShardList redisShardList) {
            this.redisShardList = redisShardList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogicInstanceTopologyResponseBody build() {
            return new DescribeLogicInstanceTopologyResponseBody(this);
        } 

    } 

    public static class NodeInfo extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("Connection")
        private String connection;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeType")
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

            /**
             * The maximum bandwidth of the node. Unit: Mbit/s.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The storage capacity of the node. Unit: MB.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The maximum number of connections.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **db**: a data node.
             * *   **normal**: a management node, which can be a proxy node or a Configserver node. For specific instances, the return value of this parameter is proxy or cs, instead of normal.
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
    public static class RedisProxyList extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < NodeInfo> nodeInfo;

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
        public java.util.List < NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < NodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public RedisProxyList build() {
                return new RedisProxyList(this);
            } 

        } 

    }
    public static class RedisShardListNodeInfo extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("Connection")
        private String connection;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("SubInstanceType")
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

            /**
             * The maximum bandwidth of the node. Unit: Mbit/s.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The storage capacity of the node. Unit: MB.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The maximum number of connections.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **proxy**: proxy node
             * *   **db**: data node
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The type of the child instance. Valid values:
             * <p>
             * 
             * *   **master**: master node
             * *   **readonly**: read-only instance
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
    public static class RedisShardList extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < RedisShardListNodeInfo> nodeInfo;

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
        public java.util.List < RedisShardListNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < RedisShardListNodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < RedisShardListNodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public RedisShardList build() {
                return new RedisShardList(this);
            } 

        } 

    }
}
