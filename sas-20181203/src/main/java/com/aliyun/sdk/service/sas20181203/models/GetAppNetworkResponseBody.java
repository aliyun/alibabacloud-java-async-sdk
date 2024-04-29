// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The information about the application network topology.
         */
        public Builder appNetwork(AppNetwork appNetwork) {
            this.appNetwork = appNetwork;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppNetworkResponseBody build() {
            return new GetAppNetworkResponseBody(this);
        } 

    } 

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
             * The ID of the destination node.
             */
            public Builder dstNodeId(String dstNodeId) {
                this.dstNodeId = dstNodeId;
                return this;
            }

            /**
             * The type of the destination node. Valid values:
             * <p>
             * 
             * *   **app**: an application
             * *   **internet**: a network node in another cluster
             */
            public Builder dstNodeType(String dstNodeType) {
                this.dstNodeType = dstNodeType;
                return this;
            }

            /**
             * The ID of the edge.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The number of the destination port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the source node.
             */
            public Builder srcNodeId(String srcNodeId) {
                this.srcNodeId = srcNodeId;
                return this;
            }

            /**
             * The type of the source node. Valid values:
             * <p>
             * 
             * *   **app**: an application
             * *   **internet**: a network node in another cluster
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
             * The ID of the namespace.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the custom namespace.
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
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerIds")
        private java.util.List < String > containerIds;

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
        public java.util.List < String > getContainerIds() {
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
            private java.util.List < String > containerIds; 
            private String id; 
            private String name; 
            private String namespaceId; 
            private String riskLevel; 
            private String type; 

            /**
             * The list of the container IDs.
             */
            public Builder containerIds(java.util.List < String > containerIds) {
                this.containerIds = containerIds;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **3**: high
             * *   **2**: medium
             * *   **1**: low
             * *   **0**: warning
             * *   **-1**: unknown
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **app**: an application
             * *   **internet**: a network node in another cluster
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
    public static class AppNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edge")
        private java.util.List < Edge> edge;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private java.util.List < Namespace> namespace;

        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List < Node> node;

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
        public java.util.List < Edge> getEdge() {
            return this.edge;
        }

        /**
         * @return namespace
         */
        public java.util.List < Namespace> getNamespace() {
            return this.namespace;
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Edge> edge; 
            private java.util.List < Namespace> namespace; 
            private java.util.List < Node> node; 

            /**
             * The information about the topology edge.
             */
            public Builder edge(java.util.List < Edge> edge) {
                this.edge = edge;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(java.util.List < Namespace> namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The information about the application node.
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public AppNetwork build() {
                return new AppNetwork(this);
            } 

        } 

    }
}
