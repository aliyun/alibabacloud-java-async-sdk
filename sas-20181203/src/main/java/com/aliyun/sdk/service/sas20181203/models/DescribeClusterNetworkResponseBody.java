// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNetworkResponseBody</p>
 */
public class DescribeClusterNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterNetwork")
    private ClusterNetwork clusterNetwork;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterNetworkResponseBody(Builder builder) {
        this.clusterNetwork = builder.clusterNetwork;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterNetwork
     */
    public ClusterNetwork getClusterNetwork() {
        return this.clusterNetwork;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterNetwork clusterNetwork; 
        private String requestId; 

        /**
         * <p>Information about the network topology edge in the cluster.</p>
         */
        public Builder clusterNetwork(ClusterNetwork clusterNetwork) {
            this.clusterNetwork = clusterNetwork;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterNetworkResponseBody build() {
            return new DescribeClusterNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetworkResponseBody</p>
     */
    public static class Edge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstNodeId")
        private String dstNodeId;

        @com.aliyun.core.annotation.NameInMap("DstNodeType")
        private String dstNodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("SrcNodeId")
        private String srcNodeId;

        @com.aliyun.core.annotation.NameInMap("SrcNodeType")
        private String srcNodeType;

        private Edge(Builder builder) {
            this.dstNodeId = builder.dstNodeId;
            this.dstNodeType = builder.dstNodeType;
            this.id = builder.id;
            this.port = builder.port;
            this.srcNodeId = builder.srcNodeId;
            this.srcNodeType = builder.srcNodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edge create() {
            return builder().build();
        }

        /**
         * @return dstNodeId
         */
        public String getDstNodeId() {
            return this.dstNodeId;
        }

        /**
         * @return dstNodeType
         */
        public String getDstNodeType() {
            return this.dstNodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return srcNodeId
         */
        public String getSrcNodeId() {
            return this.srcNodeId;
        }

        /**
         * @return srcNodeType
         */
        public String getSrcNodeType() {
            return this.srcNodeType;
        }

        public static final class Builder {
            private String dstNodeId; 
            private String dstNodeType; 
            private String id; 
            private String port; 
            private String srcNodeId; 
            private String srcNodeType; 

            /**
             * <p>The ID of the destination node.</p>
             * 
             * <strong>example:</strong>
             * <p>cfb41a869c71e4678a97021582dd8****</p>
             */
            public Builder dstNodeId(String dstNodeId) {
                this.dstNodeId = dstNodeId;
                return this;
            }

            /**
             * <p>The type of the destination node. Valid values:</p>
             * <ul>
             * <li>Set the value to <strong>cluster</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder dstNodeType(String dstNodeType) {
                this.dstNodeType = dstNodeType;
                return this;
            }

            /**
             * <p>The ID of the topology edge.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The port number of the topology edge.</p>
             * 
             * <strong>example:</strong>
             * <p>6164</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the source node.</p>
             * 
             * <strong>example:</strong>
             * <p>cfb41a869c71e4678a97021582dd8****</p>
             */
            public Builder srcNodeId(String srcNodeId) {
                this.srcNodeId = srcNodeId;
                return this;
            }

            /**
             * <p>The type of the source node. Valid values:</p>
             * <ul>
             * <li><strong>cluster</strong>: a cluster.</li>
             * <li><strong>internet</strong>: a network node outside the cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder srcNodeType(String srcNodeType) {
                this.srcNodeType = srcNodeType;
                return this;
            }

            public Edge build() {
                return new Edge(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetworkResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnnfSwitch")
        private Integer cnnfSwitch;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InterceptionType")
        private Integer interceptionType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetTopoSwitch")
        private String netTopoSwitch;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Node(Builder builder) {
            this.cnnfSwitch = builder.cnnfSwitch;
            this.id = builder.id;
            this.interceptionType = builder.interceptionType;
            this.name = builder.name;
            this.netTopoSwitch = builder.netTopoSwitch;
            this.riskLevel = builder.riskLevel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return cnnfSwitch
         */
        public Integer getCnnfSwitch() {
            return this.cnnfSwitch;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return interceptionType
         */
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netTopoSwitch
         */
        public String getNetTopoSwitch() {
            return this.netTopoSwitch;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cnnfSwitch; 
            private String id; 
            private Integer interceptionType; 
            private String name; 
            private String netTopoSwitch; 
            private String riskLevel; 
            private String type; 

            /**
             * <p>The status of the microsegmentation switch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: off.</li>
             * <li><strong>1</strong>: on.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cnnfSwitch(Integer cnnfSwitch) {
                this.cnnfSwitch = cnnfSwitch;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cfeb7a9f99ce740e98c5595d0fe37****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: classic network.</li>
             * <li><strong>1</strong>: virtual private cloud (VPC).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interceptionType(Integer interceptionType) {
                this.interceptionType = interceptionType;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>testwww</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the network topology switch. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong></li>
             * <li><strong>OFF</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder netTopoSwitch(String netTopoSwitch) {
                this.netTopoSwitch = netTopoSwitch;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: high.</li>
             * <li><strong>2</strong>: medium.</li>
             * <li><strong>1</strong>: low.</li>
             * <li><strong>0</strong>: secure.</li>
             * <li><strong>-1</strong>: unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>cluster</strong>: a cluster.</li>
             * <li><strong>internet</strong>: a network node outside the cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetworkResponseBody</p>
     */
    public static class ClusterNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edge")
        private java.util.List < Edge> edge;

        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List < Node> node;

        private ClusterNetwork(Builder builder) {
            this.edge = builder.edge;
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterNetwork create() {
            return builder().build();
        }

        /**
         * @return edge
         */
        public java.util.List < Edge> getEdge() {
            return this.edge;
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Edge> edge; 
            private java.util.List < Node> node; 

            /**
             * <p>An array that consists of information about the topology edge.</p>
             */
            public Builder edge(java.util.List < Edge> edge) {
                this.edge = edge;
                return this;
            }

            /**
             * <p>An array that consists of information about the node.</p>
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public ClusterNetwork build() {
                return new ClusterNetwork(this);
            } 

        } 

    }
}
