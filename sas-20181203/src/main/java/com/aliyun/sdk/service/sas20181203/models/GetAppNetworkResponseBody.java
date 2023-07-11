// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppNetworkResponseBody</p>
 */
public class GetAppNetworkResponseBody extends TeaModel {
    @NameInMap("AppNetwork")
    private AppNetwork appNetwork;

    @NameInMap("RequestId")
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
         * AppNetwork.
         */
        public Builder appNetwork(AppNetwork appNetwork) {
            this.appNetwork = appNetwork;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DstNodeId")
        private String dstNodeId;

        @NameInMap("DstNodeType")
        private String dstNodeType;

        @NameInMap("Id")
        private String id;

        @NameInMap("Port")
        private String port;

        @NameInMap("SrcNodeId")
        private String srcNodeId;

        @NameInMap("SrcNodeType")
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
             * DstNodeId.
             */
            public Builder dstNodeId(String dstNodeId) {
                this.dstNodeId = dstNodeId;
                return this;
            }

            /**
             * DstNodeType.
             */
            public Builder dstNodeType(String dstNodeType) {
                this.dstNodeType = dstNodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * SrcNodeId.
             */
            public Builder srcNodeId(String srcNodeId) {
                this.srcNodeId = srcNodeId;
                return this;
            }

            /**
             * SrcNodeType.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
        @NameInMap("ContainerIds")
        private java.util.List < String > containerIds;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("Type")
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
             * ContainerIds.
             */
            public Builder containerIds(java.util.List < String > containerIds) {
                this.containerIds = containerIds;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Edge")
        private java.util.List < Edge> edge;

        @NameInMap("Namespace")
        private java.util.List < Namespace> namespace;

        @NameInMap("Node")
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
             * Edge.
             */
            public Builder edge(java.util.List < Edge> edge) {
                this.edge = edge;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(java.util.List < Namespace> namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Node.
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
