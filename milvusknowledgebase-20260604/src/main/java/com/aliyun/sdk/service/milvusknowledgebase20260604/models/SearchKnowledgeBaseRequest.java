// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604.models;

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
 * {@link SearchKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>SearchKnowledgeBaseRequest</p>
 */
public class SearchKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("documentIds")
    private java.util.List<String> documentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableKnowledgeGraph")
    private Boolean enableKnowledgeGraph;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evidencePageToken")
    private String evidencePageToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image")
    private Image image;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeWiki")
    private Boolean includeWiki;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerankModelId")
    private Long rerankModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerankModelName")
    private String rerankModelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("retrievalConfig")
    private RetrievalConfig retrievalConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagFilter")
    private TagFilter tagFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private SearchKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.documentIds = builder.documentIds;
        this.enableKnowledgeGraph = builder.enableKnowledgeGraph;
        this.evidencePageToken = builder.evidencePageToken;
        this.image = builder.image;
        this.includeWiki = builder.includeWiki;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.rerankModelId = builder.rerankModelId;
        this.rerankModelName = builder.rerankModelName;
        this.retrievalConfig = builder.retrievalConfig;
        this.tagFilter = builder.tagFilter;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return documentIds
     */
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * @return enableKnowledgeGraph
     */
    public Boolean getEnableKnowledgeGraph() {
        return this.enableKnowledgeGraph;
    }

    /**
     * @return evidencePageToken
     */
    public String getEvidencePageToken() {
        return this.evidencePageToken;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return includeWiki
     */
    public Boolean getIncludeWiki() {
        return this.includeWiki;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rerankModelId
     */
    public Long getRerankModelId() {
        return this.rerankModelId;
    }

    /**
     * @return rerankModelName
     */
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    /**
     * @return retrievalConfig
     */
    public RetrievalConfig getRetrievalConfig() {
        return this.retrievalConfig;
    }

    /**
     * @return tagFilter
     */
    public TagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<SearchKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private java.util.List<String> documentIds; 
        private Boolean enableKnowledgeGraph; 
        private String evidencePageToken; 
        private Image image; 
        private Boolean includeWiki; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private Long rerankModelId; 
        private String rerankModelName; 
        private RetrievalConfig retrievalConfig; 
        private TagFilter tagFilter; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(SearchKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.documentIds = request.documentIds;
            this.enableKnowledgeGraph = request.enableKnowledgeGraph;
            this.evidencePageToken = request.evidencePageToken;
            this.image = request.image;
            this.includeWiki = request.includeWiki;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.rerankModelId = request.rerankModelId;
            this.rerankModelName = request.rerankModelName;
            this.retrievalConfig = request.retrievalConfig;
            this.tagFilter = request.tagFilter;
            this.version = request.version;
        } 

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kd-620ad908ec651</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The list of document IDs.</p>
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            this.putBodyParameter("documentIds", documentIds);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable the knowledge graph.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableKnowledgeGraph(Boolean enableKnowledgeGraph) {
            this.putBodyParameter("enableKnowledgeGraph", enableKnowledgeGraph);
            this.enableKnowledgeGraph = enableKnowledgeGraph;
            return this;
        }

        /**
         * <p>Optional. This parameter is returned conditionally and can be passed only when includeWiki is set to true. Omit this parameter for the first evidence page. For subsequent pages, pass the evidenceNextToken from the previous page as is. The candidate pool, subject, parameters, and page size are fixed and expire after 5 minutes without renewal. If the token expires, a 409 error is returned and no automatic re-search is performed. The pageNumber parameter only controls the legacy results. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:4096}.</p>
         * 
         * <strong>example:</strong>
         * <p>example-opaque-next-token</p>
         */
        public Builder evidencePageToken(String evidencePageToken) {
            this.putBodyParameter("evidencePageToken", evidencePageToken);
            this.evidencePageToken = evidencePageToken;
            return this;
        }

        /**
         * <p>The image search input.</p>
         */
        public Builder image(Image image) {
            this.putBodyParameter("image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>Optional. This parameter is returned conditionally and is added for compatibility. Default value: false. If set to true, the unified evidenceResults are additionally returned, and Wiki content is not disguised as original text. Constraints: {&quot;default&quot;:false}.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeWiki(Boolean includeWiki) {
            this.putBodyParameter("includeWiki", includeWiki);
            this.includeWiki = includeWiki;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search query.</p>
         * 
         * <strong>example:</strong>
         * <p>What is the tax amount on the invoice?</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The ID of the rerank model.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder rerankModelId(Long rerankModelId) {
            this.putBodyParameter("rerankModelId", rerankModelId);
            this.rerankModelId = rerankModelId;
            return this;
        }

        /**
         * <p>The name of the rerank model activated for the tenant. If both rerankModelId and this parameter are specified, this parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        public Builder rerankModelName(String rerankModelName) {
            this.putBodyParameter("rerankModelName", rerankModelName);
            this.rerankModelName = rerankModelName;
            return this;
        }

        /**
         * <p>The retrieval configuration.</p>
         */
        public Builder retrievalConfig(RetrievalConfig retrievalConfig) {
            this.putBodyParameter("retrievalConfig", retrievalConfig);
            this.retrievalConfig = retrievalConfig;
            return this;
        }

        /**
         * <p>The tag filter.</p>
         */
        public Builder tagFilter(TagFilter tagFilter) {
            this.putBodyParameter("tagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        /**
         * <p>The version of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public SearchKnowledgeBaseRequest build() {
            return new SearchKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseRequest</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("base64")
        private String base64;

        @com.aliyun.core.annotation.NameInMap("objectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Image(Builder builder) {
            this.base64 = builder.base64;
            this.objectKey = builder.objectKey;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return base64
         */
        public String getBase64() {
            return this.base64;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String base64; 
            private String objectKey; 
            private String url; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.base64 = model.base64;
                this.objectKey = model.objectKey;
                this.url = model.url;
            } 

            /**
             * <p>The Base64-encoded image.</p>
             * 
             * <strong>example:</strong>
             * <p>data:image/png;base64,iVBORw0KGgoAAA...</p>
             */
            public Builder base64(String base64) {
                this.base64 = base64;
                return this;
            }

            /**
             * <p>The object key of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>uploaded/invoice.png</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/invoice.png">https://example.com/invoice.png</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseRequest</p>
     */
    public static class RetrievalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("candidateCount")
        private Integer candidateCount;

        @com.aliyun.core.annotation.NameInMap("enableQueryExpansion")
        private Boolean enableQueryExpansion;

        @com.aliyun.core.annotation.NameInMap("minScore")
        private Float minScore;

        @com.aliyun.core.annotation.NameInMap("semanticWeight")
        private Float semanticWeight;

        @com.aliyun.core.annotation.NameInMap("translationLanguages")
        private java.util.List<String> translationLanguages;

        private RetrievalConfig(Builder builder) {
            this.candidateCount = builder.candidateCount;
            this.enableQueryExpansion = builder.enableQueryExpansion;
            this.minScore = builder.minScore;
            this.semanticWeight = builder.semanticWeight;
            this.translationLanguages = builder.translationLanguages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrievalConfig create() {
            return builder().build();
        }

        /**
         * @return candidateCount
         */
        public Integer getCandidateCount() {
            return this.candidateCount;
        }

        /**
         * @return enableQueryExpansion
         */
        public Boolean getEnableQueryExpansion() {
            return this.enableQueryExpansion;
        }

        /**
         * @return minScore
         */
        public Float getMinScore() {
            return this.minScore;
        }

        /**
         * @return semanticWeight
         */
        public Float getSemanticWeight() {
            return this.semanticWeight;
        }

        /**
         * @return translationLanguages
         */
        public java.util.List<String> getTranslationLanguages() {
            return this.translationLanguages;
        }

        public static final class Builder {
            private Integer candidateCount; 
            private Boolean enableQueryExpansion; 
            private Float minScore; 
            private Float semanticWeight; 
            private java.util.List<String> translationLanguages; 

            private Builder() {
            } 

            private Builder(RetrievalConfig model) {
                this.candidateCount = model.candidateCount;
                this.enableQueryExpansion = model.enableQueryExpansion;
                this.minScore = model.minScore;
                this.semanticWeight = model.semanticWeight;
                this.translationLanguages = model.translationLanguages;
            } 

            /**
             * <p>The number of recalled candidates.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder candidateCount(Integer candidateCount) {
                this.candidateCount = candidateCount;
                return this;
            }

            /**
             * <p>Specifies whether to enable query expansion.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableQueryExpansion(Boolean enableQueryExpansion) {
                this.enableQueryExpansion = enableQueryExpansion;
                return this;
            }

            /**
             * <p>The minimum relevance score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder minScore(Float minScore) {
                this.minScore = minScore;
                return this;
            }

            /**
             * <p>The weight of semantic relevance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder semanticWeight(Float semanticWeight) {
                this.semanticWeight = semanticWeight;
                return this;
            }

            /**
             * <p>The list of translation languages.</p>
             */
            public Builder translationLanguages(java.util.List<String> translationLanguages) {
                this.translationLanguages = translationLanguages;
                return this;
            }

            public RetrievalConfig build() {
                return new RetrievalConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String op; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.field = model.field;
                this.op = model.op;
                this.value = model.value;
            } 

            /**
             * <p>The tag field.</p>
             * 
             * <strong>example:</strong>
             * <p>category</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>invoice</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("relation")
        private String relation;

        private TagFilter(Builder builder) {
            this.conditions = builder.conditions;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String relation; 

            private Builder() {
            } 

            private Builder(TagFilter model) {
                this.conditions = model.conditions;
                this.relation = model.relation;
            } 

            /**
             * <p>The list of tag conditions.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The logical relation between conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>or</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
