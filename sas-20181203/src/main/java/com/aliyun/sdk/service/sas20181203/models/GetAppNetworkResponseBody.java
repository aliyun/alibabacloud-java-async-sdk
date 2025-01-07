// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppNetworkResponseBody</p>
 */
public class GetAppNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppNetwork")
    private AppNetwork appNetwork;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppNetworkResponseBody(Builder builder) {
        this.appNetwork = builder.appNetwork;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return appNetwork
     */
    public AppNetwork getAppNetwork() {
        return this.appNetwork;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppNetwork appNetwork; 
        private String requestId; 

        /**
         * <p>The information about the application network topology.</p>
         */
        public Builder appNetwork(AppNetwork appNetwork) {
            this.appNetwork = appNetwork;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7D46EDB0-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppNetworkResponseBody build() {
            return new GetAppNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppNetworkResponseBody</p>
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
             * <p>102</p>
             */
            public Builder dstNodeId(String dstNodeId) {
                this.dstNodeId = dstNodeId;
                return this;
            }

            /**
             * <p>The type of the destination node. Valid values:</p>
             * <ul>
             * <li><strong>app</strong>: an application</li>
             * <li><strong>internet</strong>: a network node in another cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder dstNodeType(String dstNodeType) {
                this.dstNodeType = dstNodeType;
                return this;
            }

            /**
             * <p>The ID of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>3534</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of the destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the source node.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder srcNodeId(String srcNodeId) {
                this.srcNodeId = srcNodeId;
                return this;
            }

            /**
             * <p>The type of the source node. Valid values:</p>
             * <ul>
             * <li><strong>app</strong>: an application</li>
             * <li><strong>internet</strong>: a network node in another cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
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
     * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppNetworkResponseBody</p>
     */
    public static class Namespace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Namespace(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespace create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the custom namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Namespace build() {
                return new Namespace(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppNetworkResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerIds")
        private java.util.List<String> containerIds;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Node(Builder builder) {
            this.containerIds = builder.containerIds;
            this.id = builder.id;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
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
         * @return containerIds
         */
        public java.util.List<String> getContainerIds() {
            return this.containerIds;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
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
            private java.util.List<String> containerIds; 
            private String id; 
            private String name; 
            private String namespaceId; 
            private String riskLevel; 
            private String type; 

            /**
             * <p>The list of the container IDs.</p>
             */
            public Builder containerIds(java.util.List<String> containerIds) {
                this.containerIds = containerIds;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1274</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: high</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>1</strong>: low</li>
             * <li><strong>0</strong>: warning</li>
             * <li><strong>-1</strong>: unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>app</strong>: an application</li>
             * <li><strong>internet</strong>: a network node in another cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
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
     * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppNetworkResponseBody</p>
     */
    public static class AppNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edge")
        private java.util.List<Edge> edge;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private java.util.List<Namespace> namespace;

        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List<Node> node;

        private AppNetwork(Builder builder) {
            this.edge = builder.edge;
            this.namespace = builder.namespace;
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppNetwork create() {
            return builder().build();
        }

        /**
         * @return edge
         */
        public java.util.List<Edge> getEdge() {
            return this.edge;
        }

        /**
         * @return namespace
         */
        public java.util.List<Namespace> getNamespace() {
            return this.namespace;
        }

        /**
         * @return node
         */
        public java.util.List<Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List<Edge> edge; 
            private java.util.List<Namespace> namespace; 
            private java.util.List<Node> node; 

            /**
             * <p>The information about the topology edge.</p>
             */
            public Builder edge(java.util.List<Edge> edge) {
                this.edge = edge;
                return this;
            }

            /**
             * <p>The namespace.</p>
             */
            public Builder namespace(java.util.List<Namespace> namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The information about the application node.</p>
             */
            public Builder node(java.util.List<Node> node) {
                this.node = node;
                return this;
            }

            public AppNetwork build() {
                return new AppNetwork(this);
            } 

        } 

    }
}
