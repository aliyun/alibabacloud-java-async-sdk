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
 * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveKnowledgePointsResponseBody</p>
 */
public class RetrieveKnowledgePointsResponseBody extends TeaModel {
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

    private RetrieveKnowledgePointsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgePointsResponseBody create() {
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

        private Builder(RetrieveKnowledgePointsResponseBody model) {
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
         * <p>The knowledge point summaries, relationship paths, ambiguity candidates, and warnings for the current search.</p>
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
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
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

        public RetrieveKnowledgePointsResponseBody build() {
            return new RetrieveKnowledgePointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Candidates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Candidates(Builder builder) {
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Candidates create() {
            return builder().build();
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String knowledgeBaseId; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Candidates model) {
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.title = model.title;
                this.type = model.type;
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
             * <p>The display title of the current knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Candidates build() {
                return new Candidates(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Ambiguities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Candidates")
        private java.util.List<Candidates> candidates;

        @com.aliyun.core.annotation.NameInMap("Mention")
        private String mention;

        private Ambiguities(Builder builder) {
            this.candidates = builder.candidates;
            this.mention = builder.mention;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ambiguities create() {
            return builder().build();
        }

        /**
         * @return candidates
         */
        public java.util.List<Candidates> getCandidates() {
            return this.candidates;
        }

        /**
         * @return mention
         */
        public String getMention() {
            return this.mention;
        }

        public static final class Builder {
            private java.util.List<Candidates> candidates; 
            private String mention; 

            private Builder() {
            } 

            private Builder(Ambiguities model) {
                this.candidates = model.candidates;
                this.mention = model.mention;
            } 

            /**
             * <p>The candidate graph nodes when ambiguity exists. Each candidate carries the KnowledgeBaseId, Type, and Id for reading details, which does not indicate that the user has confirmed the selection.</p>
             */
            public Builder candidates(java.util.List<Candidates> candidates) {
                this.candidates = candidates;
                return this;
            }

            /**
             * <p>The name or description of the object whose referent is not yet determined in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder mention(String mention) {
                this.mention = mention;
                return this;
            }

            public Ambiguities build() {
                return new Ambiguities(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromId")
        private String fromId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("ToId")
        private String toId;

        private Edges(Builder builder) {
            this.fromId = builder.fromId;
            this.relationType = builder.relationType;
            this.toId = builder.toId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return fromId
         */
        public String getFromId() {
            return this.fromId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return toId
         */
        public String getToId() {
            return this.toId;
        }

        public static final class Builder {
            private String fromId; 
            private String relationType; 
            private String toId; 

            private Builder() {
            } 

            private Builder(Edges model) {
                this.fromId = model.fromId;
                this.relationType = model.relationType;
                this.toId = model.toId;
            } 

            /**
             * <p>The Id of the start node in the Nodes array of the same path.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder fromId(String fromId) {
                this.fromId = fromId;
                return this;
            }

            /**
             * <p>The public relationship type directed from the start node to the end node. For example, CALCULATED_FROM indicates that the start node is calculated based on the end node. You cannot infer the complete formula based solely on the relationship type.</p>
             * 
             * <strong>example:</strong>
             * <p>CALCULATED_FROM</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The Id of the end node in the Nodes array of the same path.</p>
             * 
             * <strong>example:</strong>
             * <p>node-orders</p>
             */
            public Builder toId(String toId) {
                this.toId = toId;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Nodes(Builder builder) {
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String knowledgeBaseId; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.title = model.title;
                this.type = model.type;
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
             * <p>The display title of the current knowledge point.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
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
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List<Edges> edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private Paths(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List<Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Edges> edges; 
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.edges = model.edges;
                this.nodes = model.nodes;
            } 

            /**
             * <p>The directed relationships that connect the nodes in the Nodes array of the current path.</p>
             */
            public Builder edges(java.util.List<Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The graph nodes in the relationship path. You can read the details of each node by using its KnowledgeBaseId, Type, and Id.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
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
             * <p>The temporary HTTPS download URL of the original file. The URL is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward the URL publicly or store it for a long time.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the download URL. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1794376800000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The full file name of the original document used for building. This is not the name of the current knowledge point segment.</p>
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
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Results(Builder builder) {
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.sources = builder.sources;
            this.summary = builder.summary;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
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
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String knowledgeBaseId; 
            private java.util.List<Sources> sources; 
            private String summary; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.sources = model.sources;
                this.summary = model.summary;
                this.title = model.title;
                this.type = model.type;
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
             * <p>The download information of the uploaded original documents explicitly associated with the current content. This parameter is omitted if no reliable source is available or if the caller lacks read permissions for the original files. The ability to retrieve knowledge points does not imply the permission to download the complete original files.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The readable summary of the knowledge point. The summary is not guaranteed to contain the complete content. To obtain details, call GetKnowledgePoint.</p>
             * 
             * <strong>example:</strong>
             * <p>The sales revenue metric and its associated order table</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
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

            /**
             * <p>The read category of the knowledge point. GRAPH indicates a local graph, WIKI indicates a topic page, and KNOWLEDGE_CONTENT indicates knowledge content.</p>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
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
             * <p>The truncation or degradation warning code. For example, CONTENT_TRUNCATED indicates that the content is truncated, and SOURCE_UNAVAILABLE indicates that the original file download is temporarily unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTENT_TRUNCATED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The sanitized readable description of the current warning. Use Code for programmatic judgment instead of relying on the text.</p>
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
     * {@link RetrieveKnowledgePointsResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ambiguities")
        private java.util.List<Ambiguities> ambiguities;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<Paths> paths;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("Warnings")
        private java.util.List<Warnings> warnings;

        private Data(Builder builder) {
            this.ambiguities = builder.ambiguities;
            this.paths = builder.paths;
            this.results = builder.results;
            this.warnings = builder.warnings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ambiguities
         */
        public java.util.List<Ambiguities> getAmbiguities() {
            return this.ambiguities;
        }

        /**
         * @return paths
         */
        public java.util.List<Paths> getPaths() {
            return this.paths;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return warnings
         */
        public java.util.List<Warnings> getWarnings() {
            return this.warnings;
        }

        public static final class Builder {
            private java.util.List<Ambiguities> ambiguities; 
            private java.util.List<Paths> paths; 
            private java.util.List<Results> results; 
            private java.util.List<Warnings> warnings; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ambiguities = model.ambiguities;
                this.paths = model.paths;
                this.results = model.results;
                this.warnings = model.warnings;
            } 

            /**
             * <p>The ambiguity descriptions and candidate objects returned when the target is not yet confirmed.</p>
             */
            public Builder ambiguities(java.util.List<Ambiguities> ambiguities) {
                this.ambiguities = ambiguities;
                return this;
            }

            /**
             * <p>The relationship paths matched by the search. Path indexes do not correspond to indexes in the Results array. The paths may cover only a subset of relationships.</p>
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>Knowledge point summaries ranked by relevance across all knowledge bases. The total number of results does not exceed MaxResults. Results can include GRAPH, WIKI, and KNOWLEDGE_CONTENT.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The truncation, scope limitation, or degradation warnings for the current call. Use Code for programmatic judgment. Message is for reading purposes only.</p>
             */
            public Builder warnings(java.util.List<Warnings> warnings) {
                this.warnings = warnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
