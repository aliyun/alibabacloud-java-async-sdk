// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
 *
 * <p>QueryKnowledgeBasesContentResponseBody</p>
 */
public class QueryKnowledgeBasesContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
    private String embeddingTokens;

    @com.aliyun.core.annotation.NameInMap("Entities")
    private Entities entities;

    @com.aliyun.core.annotation.NameInMap("Matches")
    private Matches matches;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Relations")
    private Relations relations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Usage usage;

    private QueryKnowledgeBasesContentResponseBody(Builder builder) {
        this.embeddingTokens = builder.embeddingTokens;
        this.entities = builder.entities;
        this.matches = builder.matches;
        this.message = builder.message;
        this.relations = builder.relations;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryKnowledgeBasesContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return embeddingTokens
     */
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    /**
     * @return entities
     */
    public Entities getEntities() {
        return this.entities;
    }

    /**
     * @return matches
     */
    public Matches getMatches() {
        return this.matches;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return relations
     */
    public Relations getRelations() {
        return this.relations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String embeddingTokens; 
        private Entities entities; 
        private Matches matches; 
        private String message; 
        private Relations relations; 
        private String requestId; 
        private String status; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(QueryKnowledgeBasesContentResponseBody model) {
            this.embeddingTokens = model.embeddingTokens;
            this.entities = model.entities;
            this.matches = model.matches;
            this.message = model.message;
            this.relations = model.relations;
            this.requestId = model.requestId;
            this.status = model.status;
            this.usage = model.usage;
        } 

        /**
         * <p>The number of tokens that are used during vectorization.</p>
         * <blockquote>
         * <p> A token is the minimum unit for segmenting text. A token can be a word, phrase, punctuation, or character.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder embeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }

        /**
         * <p>The details of the entity.</p>
         */
        public Builder entities(Entities entities) {
            this.entities = entities;
            return this;
        }

        /**
         * <p>A single data record.</p>
         */
        public Builder matches(Matches matches) {
            this.matches = matches;
            return this;
        }

        /**
         * <p>The returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The details of the relationship edge.</p>
         */
        public Builder relations(Relations relations) {
            this.relations = relations;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>.</li>
         * <li><strong>fail</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of tokens that are consumed by this query.</p>
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public QueryKnowledgeBasesContentResponseBody build() {
            return new QueryKnowledgeBasesContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class EntitiesEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Entity")
        private String entity;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EntitiesEntities(Builder builder) {
            this.description = builder.description;
            this.entity = builder.entity;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntitiesEntities create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entity
         */
        public String getEntity() {
            return this.entity;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String entity; 
            private String fileName; 
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(EntitiesEntities model) {
                this.description = model.description;
                this.entity = model.entity;
                this.fileName = model.fileName;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The entity description.</p>
             * 
             * <strong>example:</strong>
             * <p>A former advisor at DeepMind.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>Dr. Wang</p>
             */
            public Builder entity(String entity) {
                this.entity = entity;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>my_doc.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The entity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The entity type.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EntitiesEntities build() {
                return new EntitiesEntities(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entities")
        private java.util.List<EntitiesEntities> entities;

        private Entities(Builder builder) {
            this.entities = builder.entities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return entities
         */
        public java.util.List<EntitiesEntities> getEntities() {
            return this.entities;
        }

        public static final class Builder {
            private java.util.List<EntitiesEntities> entities; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.entities = model.entities;
            } 

            /**
             * entities.
             */
            public Builder entities(java.util.List<EntitiesEntities> entities) {
                this.entities = entities;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class MatchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LoaderMetadata")
        private String loaderMetadata;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("RerankScore")
        private Double rerankScore;

        @com.aliyun.core.annotation.NameInMap("RetrievalSource")
        private Integer retrievalSource;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        private MatchList(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.fileURL = builder.fileURL;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
            this.rerankScore = builder.rerankScore;
            this.retrievalSource = builder.retrievalSource;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return loaderMetadata
         */
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return rerankScore
         */
        public Double getRerankScore() {
            return this.rerankScore;
        }

        /**
         * @return retrievalSource
         */
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String fileURL; 
            private String id; 
            private String loaderMetadata; 
            private java.util.Map<String, String> metadata; 
            private Double rerankScore; 
            private Integer retrievalSource; 
            private Double score; 

            private Builder() {
            } 

            private Builder(MatchList model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.fileURL = model.fileURL;
                this.id = model.id;
                this.loaderMetadata = model.loaderMetadata;
                this.metadata = model.metadata;
                this.rerankScore = model.rerankScore;
                this.retrievalSource = model.retrievalSource;
                this.score = model.score;
            } 

            /**
             * <p>The content of the text.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>my_doc.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The public network URL of the image result. By default, the URL is valid for 2 hours.</p>
             * <p>You can use the UrlExpiration parameter to specify a validity period.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx-cn-beijing.aliyuncs.com/image/test.png">https://xxx-cn-beijing.aliyuncs.com/image/test.png</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The unique ID of the vector data.</p>
             * 
             * <strong>example:</strong>
             * <p>doca-1234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Document loader metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;page_pos&quot;: 1}</p>
             */
            public Builder loaderMetadata(String loaderMetadata) {
                this.loaderMetadata = loaderMetadata;
                return this;
            }

            /**
             * <p>The metadata map.</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The rerank score.</p>
             * 
             * <strong>example:</strong>
             * <p>6.2345</p>
             */
            public Builder rerankScore(Double rerankScore) {
                this.rerankScore = rerankScore;
                return this;
            }

            /**
             * <p>The source of the retrieval results. 1 indicates vector retrieval, 2 indicates full-text retrieval, and 3 indicates dual-path retrieval.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retrievalSource(Integer retrievalSource) {
                this.retrievalSource = retrievalSource;
                return this;
            }

            /**
             * <p>The similarity score of the data. It is related to the algorithm (l2, ip, or cosine) that is specified when you create an index.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12345</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public MatchList build() {
                return new MatchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class Matches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchList")
        private java.util.List<MatchList> matchList;

        private Matches(Builder builder) {
            this.matchList = builder.matchList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matches create() {
            return builder().build();
        }

        /**
         * @return matchList
         */
        public java.util.List<MatchList> getMatchList() {
            return this.matchList;
        }

        public static final class Builder {
            private java.util.List<MatchList> matchList; 

            private Builder() {
            } 

            private Builder(Matches model) {
                this.matchList = model.matchList;
            } 

            /**
             * MatchList.
             */
            public Builder matchList(java.util.List<MatchList> matchList) {
                this.matchList = matchList;
                return this;
            }

            public Matches build() {
                return new Matches(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class RelationsRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SourceEntity")
        private String sourceEntity;

        @com.aliyun.core.annotation.NameInMap("TargetEntity")
        private String targetEntity;

        private RelationsRelations(Builder builder) {
            this.description = builder.description;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.sourceEntity = builder.sourceEntity;
            this.targetEntity = builder.targetEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationsRelations create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return sourceEntity
         */
        public String getSourceEntity() {
            return this.sourceEntity;
        }

        /**
         * @return targetEntity
         */
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public static final class Builder {
            private String description; 
            private String fileName; 
            private String id; 
            private String sourceEntity; 
            private String targetEntity; 

            private Builder() {
            } 

            private Builder(RelationsRelations model) {
                this.description = model.description;
                this.fileName = model.fileName;
                this.id = model.id;
                this.sourceEntity = model.sourceEntity;
                this.targetEntity = model.targetEntity;
            } 

            /**
             * <p>The description of the relationship edge.</p>
             * 
             * <strong>example:</strong>
             * <p>Dr. Wang previously served as an advisor at DeepMind.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>my_doc.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The ID of the link.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The source entity.</p>
             */
            public Builder sourceEntity(String sourceEntity) {
                this.sourceEntity = sourceEntity;
                return this;
            }

            /**
             * <p>The destination entity.</p>
             * 
             * <strong>example:</strong>
             * <p>Dr. Wang</p>
             */
            public Builder targetEntity(String targetEntity) {
                this.targetEntity = targetEntity;
                return this;
            }

            public RelationsRelations build() {
                return new RelationsRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class Relations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("relations")
        private java.util.List<RelationsRelations> relations;

        private Relations(Builder builder) {
            this.relations = builder.relations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relations create() {
            return builder().build();
        }

        /**
         * @return relations
         */
        public java.util.List<RelationsRelations> getRelations() {
            return this.relations;
        }

        public static final class Builder {
            private java.util.List<RelationsRelations> relations; 

            private Builder() {
            } 

            private Builder(Relations model) {
                this.relations = model.relations;
            } 

            /**
             * relations.
             */
            public Builder relations(java.util.List<RelationsRelations> relations) {
                this.relations = relations;
                return this;
            }

            public Relations build() {
                return new Relations(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryKnowledgeBasesContentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbeddingEntries")
        private String embeddingEntries;

        @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
        private String embeddingTokens;

        private Usage(Builder builder) {
            this.embeddingEntries = builder.embeddingEntries;
            this.embeddingTokens = builder.embeddingTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return embeddingEntries
         */
        public String getEmbeddingEntries() {
            return this.embeddingEntries;
        }

        /**
         * @return embeddingTokens
         */
        public String getEmbeddingTokens() {
            return this.embeddingTokens;
        }

        public static final class Builder {
            private String embeddingEntries; 
            private String embeddingTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.embeddingEntries = model.embeddingEntries;
                this.embeddingTokens = model.embeddingTokens;
            } 

            /**
             * <p>The number of entries that are used during vectorization.</p>
             * <blockquote>
             * <p> An entry refers to a single unit of vectorization processing. Processing one text input counts as 1 entry, while processing one image counts as 2 entries.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder embeddingEntries(String embeddingEntries) {
                this.embeddingEntries = embeddingEntries;
                return this;
            }

            /**
             * <p>The number of tokens that are used for vectorization.</p>
             * <blockquote>
             * <p> A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>475</p>
             */
            public Builder embeddingTokens(String embeddingTokens) {
                this.embeddingTokens = embeddingTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
