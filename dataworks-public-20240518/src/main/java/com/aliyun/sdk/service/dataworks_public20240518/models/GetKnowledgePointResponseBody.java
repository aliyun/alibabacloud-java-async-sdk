// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgePointResponseBody</p>
 */
public class GetKnowledgePointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKnowledgePointResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgePointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKnowledgePointResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The typed details of a single knowledge point. Only the item corresponding to the Type value is returned among Graph, Wiki, and KnowledgeContent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKnowledgePointResponseBody build() {
            return new GetKnowledgePointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class JoinKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromField")
        private String fromField;

        @com.aliyun.core.annotation.NameInMap("ToField")
        private String toField;

        private JoinKeys(Builder builder) {
            this.fromField = builder.fromField;
            this.toField = builder.toField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinKeys create() {
            return builder().build();
        }

        /**
         * @return fromField
         */
        public String getFromField() {
            return this.fromField;
        }

        /**
         * @return toField
         */
        public String getToField() {
            return this.toField;
        }

        public static final class Builder {
            private String fromField; 
            private String toField; 

            private Builder() {
            } 

            private Builder(JoinKeys model) {
                this.fromField = model.fromField;
                this.toField = model.toField;
            } 

            /**
             * <p>The name of the association field for the node corresponding to FromNodeId.</p>
             * 
             * <strong>example:</strong>
             * <p>customer_id</p>
             */
            public Builder fromField(String fromField) {
                this.fromField = fromField;
                return this;
            }

            /**
             * <p>The name of the association field for the node corresponding to ToNodeId.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder toField(String toField) {
                this.toField = toField;
                return this;
            }

            public JoinKeys build() {
                return new JoinKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Join extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cardinality")
        private String cardinality;

        @com.aliyun.core.annotation.NameInMap("JoinKeys")
        private java.util.List<JoinKeys> joinKeys;

        private Join(Builder builder) {
            this.cardinality = builder.cardinality;
            this.joinKeys = builder.joinKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Join create() {
            return builder().build();
        }

        /**
         * @return cardinality
         */
        public String getCardinality() {
            return this.cardinality;
        }

        /**
         * @return joinKeys
         */
        public java.util.List<JoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public static final class Builder {
            private String cardinality; 
            private java.util.List<JoinKeys> joinKeys; 

            private Builder() {
            } 

            private Builder(Join model) {
                this.cardinality = model.cardinality;
                this.joinKeys = model.joinKeys;
            } 

            /**
             * <p>The association cardinality from the start node to the end node. Valid values: ONE_TO_ONE, ONE_TO_MANY, MANY_TO_ONE, and MANY_TO_MANY. This parameter is returned when the cardinality is reliable.</p>
             * 
             * <strong>example:</strong>
             * <p>MANY_TO_ONE</p>
             */
            public Builder cardinality(String cardinality) {
                this.cardinality = cardinality;
                return this;
            }

            /**
             * <p>The equivalent association field pairing for the nodes at both ends. Composite keys are returned in full.</p>
             */
            public Builder joinKeys(java.util.List<JoinKeys> joinKeys) {
                this.joinKeys = joinKeys;
                return this;
            }

            public Join build() {
                return new Join(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EdgeId")
        private String edgeId;

        @com.aliyun.core.annotation.NameInMap("FromNodeId")
        private String fromNodeId;

        @com.aliyun.core.annotation.NameInMap("Join")
        private Join join;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("ToNodeId")
        private String toNodeId;

        private Edges(Builder builder) {
            this.description = builder.description;
            this.edgeId = builder.edgeId;
            this.fromNodeId = builder.fromNodeId;
            this.join = builder.join;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.relationType = builder.relationType;
            this.toNodeId = builder.toNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return edgeId
         */
        public String getEdgeId() {
            return this.edgeId;
        }

        /**
         * @return fromNodeId
         */
        public String getFromNodeId() {
            return this.fromNodeId;
        }

        /**
         * @return join
         */
        public Join getJoin() {
            return this.join;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return toNodeId
         */
        public String getToNodeId() {
            return this.toNodeId;
        }

        public static final class Builder {
            private String description; 
            private String edgeId; 
            private String fromNodeId; 
            private Join join; 
            private String knowledgeBaseId; 
            private String relationType; 
            private String toNodeId; 

            private Builder() {
            } 

            private Builder(Edges model) {
                this.description = model.description;
                this.edgeId = model.edgeId;
                this.fromNodeId = model.fromNodeId;
                this.join = model.join;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.relationType = model.relationType;
                this.toNodeId = model.toNodeId;
            } 

            /**
             * <p>The readable supplementary description of the current node or relationship. This parameter is omitted when no reliable content is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue is calculated based on the actual paid amount of orders</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the relationship in the current knowledge base graph.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-sales-orders</p>
             */
            public Builder edgeId(String edgeId) {
                this.edgeId = edgeId;
                return this;
            }

            /**
             * <p>The NodeId of the start node of the relationship. The start node must exist in the Graph.Nodes of the same page.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder fromNodeId(String fromNodeId) {
                this.fromNodeId = fromNodeId;
                return this;
            }

            /**
             * <p>The typed field association information for verified relationships. This parameter is omitted when no reliable and complete field pairing is available.</p>
             */
            public Builder join(Join join) {
                this.join = join;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The public relationship type from the start node to the end node. For example, CALCULATED_FROM indicates that the start node is calculated based on the end node. You cannot infer the complete formula based solely on the type.</p>
             * 
             * <strong>example:</strong>
             * <p>CALCULATED_FROM</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The NodeId of the end node of the relationship. The end node must exist in the Graph.Nodes of the same page.</p>
             * 
             * <strong>example:</strong>
             * <p>node-orders</p>
             */
            public Builder toNodeId(String toNodeId) {
                this.toNodeId = toNodeId;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliases")
        private java.util.List<String> aliases;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Nodes(Builder builder) {
            this.aliases = builder.aliases;
            this.definition = builder.definition;
            this.description = builder.description;
            this.entityId = builder.entityId;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return aliases
         */
        public java.util.List<String> getAliases() {
            return this.aliases;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> aliases; 
            private String definition; 
            private String description; 
            private String entityId; 
            private String knowledgeBaseId; 
            private String name; 
            private String nodeId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.aliases = model.aliases;
                this.definition = model.definition;
                this.description = model.description;
                this.entityId = model.entityId;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.type = model.type;
            } 

            /**
             * <p>The list of reliable aliases for the node. This parameter is omitted when no aliases are available.</p>
             */
            public Builder aliases(java.util.List<String> aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * <p>The reliable business definition of the graph node. This parameter is omitted when no public definition is available.</p>
             * 
             * <strong>example:</strong>
             * <p>The sum of the actual paid amounts of paid orders</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The readable supplementary description of the current node or relationship. This parameter is omitted when no reliable content is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue is calculated based on the actual paid amount of orders</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The asset ID in DataWorks Data Map that can be reliably located. This is not the NodeId of the graph node. This parameter is omitted when no unique and reliable asset mapping is available.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::sales:public:orders</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The display name of the graph node.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the node in the current knowledge base graph. You can use this value as the Id parameter when Type is set to GRAPH to read the local graph of this node.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The business category of the graph node, such as TABLE for a data table. This is not the read category of the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Graph extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List<Edges> edges;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("RootNodeId")
        private String rootNodeId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Graph(Builder builder) {
            this.edges = builder.edges;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.nodes = builder.nodes;
            this.rootNodeId = builder.rootNodeId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Graph create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List<Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return rootNodeId
         */
        public String getRootNodeId() {
            return this.rootNodeId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<Edges> edges; 
            private String knowledgeBaseId; 
            private java.util.List<Nodes> nodes; 
            private String rootNodeId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Graph model) {
                this.edges = model.edges;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.nodes = model.nodes;
                this.rootNodeId = model.rootNodeId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The visible one-hop adjacency relationships on the current page. At least one end of each edge is the RootNodeId, and both ends are in the Nodes of the current page.</p>
             */
            public Builder edges(java.util.List<Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>All visible endpoints involved by the entry node and the relationships on the current page, deduplicated by NodeId. Subsequent pages still include the entry node.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The ID of the entry node for the current local graph, which is the same as the requested Id.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder rootNodeId(String rootNodeId) {
                this.rootNodeId = rootNodeId;
                return this;
            }

            /**
             * <p>The time when the current graph was last published. This parameter is returned when the time is reliable.</p>
             * 
             * <strong>example:</strong>
             * <p>1794373200000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Graph build() {
                return new Graph(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        private Sources(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.expirationTime = builder.expirationTime;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long expirationTime; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.downloadUrl = model.downloadUrl;
                this.expirationTime = model.expirationTime;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The temporary HTTPS download URL of the original file, which is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward this URL publicly or store it for a long time.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the download URL, in UNIX milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1794376800000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The full file name of the original document used for building. This is not the name of the current knowledge point fragment.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales_policy.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class KnowledgeContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private KnowledgeContent(Builder builder) {
            this.content = builder.content;
            this.sources = builder.sources;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeContent create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<Sources> sources; 
            private String title; 

            private Builder() {
            } 

            private Builder(KnowledgeContent model) {
                this.content = model.content;
                this.sources = model.sources;
                this.title = model.title;
            } 

            /**
             * <p>The currently public Markdown body. The knowledge content may be a document fragment or a readable projection of structured knowledge, and is not guaranteed to be the full text of the original file.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue is aggregated based on the actual paid amount of paid orders</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The download information of the uploaded original document explicitly associated with the current content. This parameter is omitted when no reliable source is available or when you do not have read permissions for the original file. The ability to retrieve a knowledge point does not imply the ability to download the complete original file.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The display title of the current knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public KnowledgeContent build() {
                return new KnowledgeContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Warnings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Warnings(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warnings create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Warnings model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The truncation or degradation prompt code. For example, CONTENT_TRUNCATED indicates that the content is truncated, and SOURCE_UNAVAILABLE indicates that the original file download is temporarily unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTENT_TRUNCATED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The sanitized and readable description of the current prompt. Use Code for programmatic judgment instead of relying on the text.</p>
             * 
             * <strong>example:</strong>
             * <p>Some content exceeds the length limit and has been truncated</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Warnings build() {
                return new Warnings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class WikiSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        private WikiSources(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.expirationTime = builder.expirationTime;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WikiSources create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long expirationTime; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(WikiSources model) {
                this.downloadUrl = model.downloadUrl;
                this.expirationTime = model.expirationTime;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The temporary HTTPS download URL of the original file, which is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward this URL publicly or store it for a long time.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the download URL, in UNIX milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1794376800000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The full file name of the original document used for building. This is not the name of the current knowledge point fragment.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales_policy.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public WikiSources build() {
                return new WikiSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Wiki extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<WikiSources> sources;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Wiki(Builder builder) {
            this.content = builder.content;
            this.sources = builder.sources;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Wiki create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sources
         */
        public java.util.List<WikiSources> getSources() {
            return this.sources;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<WikiSources> sources; 
            private String title; 

            private Builder() {
            } 

            private Builder(Wiki model) {
                this.content = model.content;
                this.sources = model.sources;
                this.title = model.title;
            } 

            /**
             * <p>The currently public Markdown body. The knowledge content may be a document fragment or a readable projection of structured knowledge, and is not guaranteed to be the full text of the original file.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue is aggregated based on the actual paid amount of paid orders</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The download information of the uploaded original document explicitly associated with the current content. This parameter is omitted when no reliable source is available or when you do not have read permissions for the original file. The ability to retrieve a knowledge point does not imply the ability to download the complete original file.</p>
             */
            public Builder sources(java.util.List<WikiSources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The display title of the current knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Wiki build() {
                return new Wiki(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgePointResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgePointResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Graph")
        private Graph graph;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeContent")
        private KnowledgeContent knowledgeContent;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Warnings")
        private java.util.List<Warnings> warnings;

        @com.aliyun.core.annotation.NameInMap("Wiki")
        private Wiki wiki;

        private Data(Builder builder) {
            this.graph = builder.graph;
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.knowledgeContent = builder.knowledgeContent;
            this.nextToken = builder.nextToken;
            this.type = builder.type;
            this.warnings = builder.warnings;
            this.wiki = builder.wiki;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return graph
         */
        public Graph getGraph() {
            return this.graph;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return knowledgeContent
         */
        public KnowledgeContent getKnowledgeContent() {
            return this.knowledgeContent;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return warnings
         */
        public java.util.List<Warnings> getWarnings() {
            return this.warnings;
        }

        /**
         * @return wiki
         */
        public Wiki getWiki() {
            return this.wiki;
        }

        public static final class Builder {
            private Graph graph; 
            private String id; 
            private String knowledgeBaseId; 
            private KnowledgeContent knowledgeContent; 
            private String nextToken; 
            private String type; 
            private java.util.List<Warnings> warnings; 
            private Wiki wiki; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.graph = model.graph;
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.knowledgeContent = model.knowledgeContent;
                this.nextToken = model.nextToken;
                this.type = model.type;
                this.warnings = model.warnings;
                this.wiki = model.wiki;
            } 

            /**
             * <p>The one-hop local graph with the requested Id as the entry point. This parameter is returned only when Type is set to GRAPH. It includes the entry point, the relationships on the current page, and their visible endpoints.</p>
             */
            public Builder graph(Graph graph) {
                this.graph = graph;
                return this;
            }

            /**
             * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The title, Markdown body, and optional sources of the knowledge content. This parameter is returned only when Type is set to KNOWLEDGE_CONTENT.</p>
             */
            public Builder knowledgeContent(KnowledgeContent knowledgeContent) {
                this.knowledgeContent = knowledgeContent;
                return this;
            }

            /**
             * <p>The pagination cursor. Do not specify this parameter when you request the first page. For subsequent pages, use the NextToken value returned in the previous response. An empty response indicates that no more pages are available. If the current page is empty but the cursor is not empty, continue pagination. This parameter is used only when Type is set to GRAPH. You must keep the same knowledge base, entry point, and MaxResults values.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJvZmZzZXQiOjIwfQ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The read category of the knowledge point. Valid values: GRAPH for local graphs, WIKI for topic pages, and KNOWLEDGE_CONTENT for knowledge content.</p>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The truncation, scope limitation, or degradation prompts for the current call. Use Code for programmatic judgment. Message is for reading purposes only.</p>
             */
            public Builder warnings(java.util.List<Warnings> warnings) {
                this.warnings = warnings;
                return this;
            }

            /**
             * <p>The title, Markdown body, and optional sources of the topic page. This parameter is returned only when Type is set to WIKI.</p>
             */
            public Builder wiki(Wiki wiki) {
                this.wiki = wiki;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
