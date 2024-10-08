// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunLibraryChatGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunLibraryChatGenerationRequest</p>
 */
public class RunLibraryChatGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docIdList")
    private java.util.List < String > docIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableFollowUp")
    private Boolean enableFollowUp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableMultiQuery")
    private Boolean enableMultiQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableOpenQa")
    private Boolean enableOpenQa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("followUpLlm")
    private String followUpLlm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("llmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String llmType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("multiQueryLlm")
    private String multiQueryLlm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryCriteria")
    private QueryCriteria queryCriteria;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerankType")
    private String rerankType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subQueryList")
    private java.util.List < String > subQueryList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textSearchParameter")
    private TextSearchParameter textSearchParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vectorSearchParameter")
    private VectorSearchParameter vectorSearchParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("withDocumentReference")
    private Boolean withDocumentReference;

    private RunLibraryChatGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.docIdList = builder.docIdList;
        this.enableFollowUp = builder.enableFollowUp;
        this.enableMultiQuery = builder.enableMultiQuery;
        this.enableOpenQa = builder.enableOpenQa;
        this.followUpLlm = builder.followUpLlm;
        this.libraryId = builder.libraryId;
        this.llmType = builder.llmType;
        this.multiQueryLlm = builder.multiQueryLlm;
        this.query = builder.query;
        this.queryCriteria = builder.queryCriteria;
        this.rerankType = builder.rerankType;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.subQueryList = builder.subQueryList;
        this.textSearchParameter = builder.textSearchParameter;
        this.topK = builder.topK;
        this.vectorSearchParameter = builder.vectorSearchParameter;
        this.withDocumentReference = builder.withDocumentReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLibraryChatGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return docIdList
     */
    public java.util.List < String > getDocIdList() {
        return this.docIdList;
    }

    /**
     * @return enableFollowUp
     */
    public Boolean getEnableFollowUp() {
        return this.enableFollowUp;
    }

    /**
     * @return enableMultiQuery
     */
    public Boolean getEnableMultiQuery() {
        return this.enableMultiQuery;
    }

    /**
     * @return enableOpenQa
     */
    public Boolean getEnableOpenQa() {
        return this.enableOpenQa;
    }

    /**
     * @return followUpLlm
     */
    public String getFollowUpLlm() {
        return this.followUpLlm;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return llmType
     */
    public String getLlmType() {
        return this.llmType;
    }

    /**
     * @return multiQueryLlm
     */
    public String getMultiQueryLlm() {
        return this.multiQueryLlm;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryCriteria
     */
    public QueryCriteria getQueryCriteria() {
        return this.queryCriteria;
    }

    /**
     * @return rerankType
     */
    public String getRerankType() {
        return this.rerankType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return subQueryList
     */
    public java.util.List < String > getSubQueryList() {
        return this.subQueryList;
    }

    /**
     * @return textSearchParameter
     */
    public TextSearchParameter getTextSearchParameter() {
        return this.textSearchParameter;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return vectorSearchParameter
     */
    public VectorSearchParameter getVectorSearchParameter() {
        return this.vectorSearchParameter;
    }

    /**
     * @return withDocumentReference
     */
    public Boolean getWithDocumentReference() {
        return this.withDocumentReference;
    }

    public static final class Builder extends Request.Builder<RunLibraryChatGenerationRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > docIdList; 
        private Boolean enableFollowUp; 
        private Boolean enableMultiQuery; 
        private Boolean enableOpenQa; 
        private String followUpLlm; 
        private String libraryId; 
        private String llmType; 
        private String multiQueryLlm; 
        private String query; 
        private QueryCriteria queryCriteria; 
        private String rerankType; 
        private String sessionId; 
        private Boolean stream; 
        private java.util.List < String > subQueryList; 
        private TextSearchParameter textSearchParameter; 
        private Integer topK; 
        private VectorSearchParameter vectorSearchParameter; 
        private Boolean withDocumentReference; 

        private Builder() {
            super();
        } 

        private Builder(RunLibraryChatGenerationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.docIdList = request.docIdList;
            this.enableFollowUp = request.enableFollowUp;
            this.enableMultiQuery = request.enableMultiQuery;
            this.enableOpenQa = request.enableOpenQa;
            this.followUpLlm = request.followUpLlm;
            this.libraryId = request.libraryId;
            this.llmType = request.llmType;
            this.multiQueryLlm = request.multiQueryLlm;
            this.query = request.query;
            this.queryCriteria = request.queryCriteria;
            this.rerankType = request.rerankType;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.subQueryList = request.subQueryList;
            this.textSearchParameter = request.textSearchParameter;
            this.topK = request.topK;
            this.vectorSearchParameter = request.vectorSearchParameter;
            this.withDocumentReference = request.withDocumentReference;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * docIdList.
         */
        public Builder docIdList(java.util.List < String > docIdList) {
            this.putBodyParameter("docIdList", docIdList);
            this.docIdList = docIdList;
            return this;
        }

        /**
         * enableFollowUp.
         */
        public Builder enableFollowUp(Boolean enableFollowUp) {
            this.putBodyParameter("enableFollowUp", enableFollowUp);
            this.enableFollowUp = enableFollowUp;
            return this;
        }

        /**
         * enableMultiQuery.
         */
        public Builder enableMultiQuery(Boolean enableMultiQuery) {
            this.putBodyParameter("enableMultiQuery", enableMultiQuery);
            this.enableMultiQuery = enableMultiQuery;
            return this;
        }

        /**
         * enableOpenQa.
         */
        public Builder enableOpenQa(Boolean enableOpenQa) {
            this.putBodyParameter("enableOpenQa", enableOpenQa);
            this.enableOpenQa = enableOpenQa;
            return this;
        }

        /**
         * followUpLlm.
         */
        public Builder followUpLlm(String followUpLlm) {
            this.putBodyParameter("followUpLlm", followUpLlm);
            this.followUpLlm = followUpLlm;
            return this;
        }

        /**
         * libraryId.
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * llmType.
         */
        public Builder llmType(String llmType) {
            this.putBodyParameter("llmType", llmType);
            this.llmType = llmType;
            return this;
        }

        /**
         * multiQueryLlm.
         */
        public Builder multiQueryLlm(String multiQueryLlm) {
            this.putBodyParameter("multiQueryLlm", multiQueryLlm);
            this.multiQueryLlm = multiQueryLlm;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * queryCriteria.
         */
        public Builder queryCriteria(QueryCriteria queryCriteria) {
            this.putBodyParameter("queryCriteria", queryCriteria);
            this.queryCriteria = queryCriteria;
            return this;
        }

        /**
         * rerankType.
         */
        public Builder rerankType(String rerankType) {
            this.putBodyParameter("rerankType", rerankType);
            this.rerankType = rerankType;
            return this;
        }

        /**
         * <p>sessionId</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * subQueryList.
         */
        public Builder subQueryList(java.util.List < String > subQueryList) {
            this.putBodyParameter("subQueryList", subQueryList);
            this.subQueryList = subQueryList;
            return this;
        }

        /**
         * textSearchParameter.
         */
        public Builder textSearchParameter(TextSearchParameter textSearchParameter) {
            this.putBodyParameter("textSearchParameter", textSearchParameter);
            this.textSearchParameter = textSearchParameter;
            return this;
        }

        /**
         * topK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * vectorSearchParameter.
         */
        public Builder vectorSearchParameter(VectorSearchParameter vectorSearchParameter) {
            this.putBodyParameter("vectorSearchParameter", vectorSearchParameter);
            this.vectorSearchParameter = vectorSearchParameter;
            return this;
        }

        /**
         * withDocumentReference.
         */
        public Builder withDocumentReference(Boolean withDocumentReference) {
            this.putBodyParameter("withDocumentReference", withDocumentReference);
            this.withDocumentReference = withDocumentReference;
            return this;
        }

        @Override
        public RunLibraryChatGenerationRequest build() {
            return new RunLibraryChatGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunLibraryChatGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunLibraryChatGenerationRequest</p>
     */
    public static class And extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boost")
        private Float boost;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private And(Builder builder) {
            this.boost = builder.boost;
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static And create() {
            return builder().build();
        }

        /**
         * @return boost
         */
        public Float getBoost() {
            return this.boost;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float boost; 
            private String key; 
            private String operator; 
            private String value; 

            /**
             * boost.
             */
            public Builder boost(Float boost) {
                this.boost = boost;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public And build() {
                return new And(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunLibraryChatGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunLibraryChatGenerationRequest</p>
     */
    public static class Or extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boost")
        private Float boost;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Or(Builder builder) {
            this.boost = builder.boost;
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Or create() {
            return builder().build();
        }

        /**
         * @return boost
         */
        public Float getBoost() {
            return this.boost;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float boost; 
            private String key; 
            private String operator; 
            private String value; 

            /**
             * boost.
             */
            public Builder boost(Float boost) {
                this.boost = boost;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Or build() {
                return new Or(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunLibraryChatGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunLibraryChatGenerationRequest</p>
     */
    public static class QueryCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("and")
        private java.util.List < And> and;

        @com.aliyun.core.annotation.NameInMap("or")
        private java.util.List < Or> or;

        private QueryCriteria(Builder builder) {
            this.and = builder.and;
            this.or = builder.or;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryCriteria create() {
            return builder().build();
        }

        /**
         * @return and
         */
        public java.util.List < And> getAnd() {
            return this.and;
        }

        /**
         * @return or
         */
        public java.util.List < Or> getOr() {
            return this.or;
        }

        public static final class Builder {
            private java.util.List < And> and; 
            private java.util.List < Or> or; 

            /**
             * and.
             */
            public Builder and(java.util.List < And> and) {
                this.and = and;
                return this;
            }

            /**
             * or.
             */
            public Builder or(java.util.List < Or> or) {
                this.or = or;
                return this;
            }

            public QueryCriteria build() {
                return new QueryCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunLibraryChatGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunLibraryChatGenerationRequest</p>
     */
    public static class TextSearchParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("searchAnalyzerType")
        private String searchAnalyzerType;

        private TextSearchParameter(Builder builder) {
            this.limit = builder.limit;
            this.searchAnalyzerType = builder.searchAnalyzerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextSearchParameter create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return searchAnalyzerType
         */
        public String getSearchAnalyzerType() {
            return this.searchAnalyzerType;
        }

        public static final class Builder {
            private Integer limit; 
            private String searchAnalyzerType; 

            /**
             * limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * searchAnalyzerType.
             */
            public Builder searchAnalyzerType(String searchAnalyzerType) {
                this.searchAnalyzerType = searchAnalyzerType;
                return this;
            }

            public TextSearchParameter build() {
                return new TextSearchParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunLibraryChatGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunLibraryChatGenerationRequest</p>
     */
    public static class VectorSearchParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limit")
        private Integer limit;

        private VectorSearchParameter(Builder builder) {
            this.limit = builder.limit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorSearchParameter create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        public static final class Builder {
            private Integer limit; 

            /**
             * limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            public VectorSearchParameter build() {
                return new VectorSearchParameter(this);
            } 

        } 

    }
}
