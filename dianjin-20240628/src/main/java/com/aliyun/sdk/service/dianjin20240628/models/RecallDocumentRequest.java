// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RecallDocumentRequest} extends {@link RequestModel}
 *
 * <p>RecallDocumentRequest</p>
 */
public class RecallDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rearrangement")
    private Boolean rearrangement;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    private RecallDocumentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.filters = builder.filters;
        this.query = builder.query;
        this.rearrangement = builder.rearrangement;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecallDocumentRequest create() {
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
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rearrangement
     */
    public Boolean getRearrangement() {
        return this.rearrangement;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<RecallDocumentRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Filters> filters; 
        private String query; 
        private Boolean rearrangement; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(RecallDocumentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.filters = request.filters;
            this.query = request.query;
            this.rearrangement = request.rearrangement;
            this.topK = request.topK;
        } 

        /**
         * <p>Path parameter, workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Metadata filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putBodyParameter("filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>Text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>欧洲杯历史上有哪些球队因为球员的适应新文化而受益</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Enable parent-child document chunk retrieval.</p>
         * <ul>
         * <li>Parent-child document chunks: During document parsing, a complete semantic block, such as a paragraph or a section, might split into multiple document chunks. This depends on your chunking strategy. When you enable parent-child document retrieval, the system attempts to complete the semantic block of the retrieved document chunk. This makes the corpus more semantically complete when constructing prompts, improving answer completeness and accuracy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rearrangement(Boolean rearrangement) {
            this.putBodyParameter("rearrangement", rearrangement);
            this.rearrangement = rearrangement;
            return this;
        }

        /**
         * <p>The number of document chunks to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public RecallDocumentRequest build() {
            return new RecallDocumentRequest(this);
        } 

    } 

    /**
     * 
     * {@link RecallDocumentRequest} extends {@link TeaModel}
     *
     * <p>RecallDocumentRequest</p>
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

            private Builder() {
            } 

            private Builder(And model) {
                this.boost = model.boost;
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>Keyword weight.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder boost(Float boost) {
                this.boost = boost;
                return this;
            }

            /**
             * <p>The key of the metadata in the document library.</p>
             * 
             * <strong>example:</strong>
             * <p>docType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The relationship between the value stored in the document library metadata key and the value you enter.</p>
             * <ul>
             * <li><p>eq: The value stored in the document library metadata key equals the value you enter.</p>
             * </li>
             * <li><p>lte: The value stored in the document library metadata key is less than or equal to the value you enter.</p>
             * </li>
             * <li><p>gte: The value stored in the document library metadata key is greater than or equal to the value you enter.</p>
             * </li>
             * <li><p>lt: The value stored in the document library metadata key is less than the value you enter.</p>
             * </li>
             * <li><p>gt: The value stored in the document library metadata key is greater than the value you enter.</p>
             * </li>
             * <li><p>contains: The list of values stored in the document library metadata key contains the value you enter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value of the metadata you enter.</p>
             * 
             * <strong>example:</strong>
             * <p>策略报告</p>
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
     * {@link RecallDocumentRequest} extends {@link TeaModel}
     *
     * <p>RecallDocumentRequest</p>
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

            private Builder() {
            } 

            private Builder(Or model) {
                this.boost = model.boost;
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>Keyword weight.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder boost(Float boost) {
                this.boost = boost;
                return this;
            }

            /**
             * <p>The key of the metadata in the document library.</p>
             * 
             * <strong>example:</strong>
             * <p>researcher</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The relationship between the value stored in the document library metadata key and the value you enter.</p>
             * <ul>
             * <li><p>eq: The value stored in the document library metadata key equals the value you enter.</p>
             * </li>
             * <li><p>lte: The value stored in the document library metadata key is less than or equal to the value you enter.</p>
             * </li>
             * <li><p>gte: The value stored in the document library metadata key is greater than or equal to the value you enter.</p>
             * </li>
             * <li><p>lt: The value stored in the document library metadata key is less than the value you enter.</p>
             * </li>
             * <li><p>gt: The value stored in the document library metadata key is greater than the value you enter.</p>
             * </li>
             * <li><p>contains: The list of values stored in the document library metadata key contains the value you enter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value of the metadata you enter.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
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
     * {@link RecallDocumentRequest} extends {@link TeaModel}
     *
     * <p>RecallDocumentRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("and")
        private java.util.List<And> and;

        @com.aliyun.core.annotation.NameInMap("chunkType")
        private String chunkType;

        @com.aliyun.core.annotation.NameInMap("docIdList")
        private java.util.List<String> docIdList;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("or")
        private java.util.List<Or> or;

        @com.aliyun.core.annotation.NameInMap("status")
        private java.util.List<String> status;

        private Filters(Builder builder) {
            this.and = builder.and;
            this.chunkType = builder.chunkType;
            this.docIdList = builder.docIdList;
            this.libraryId = builder.libraryId;
            this.or = builder.or;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return and
         */
        public java.util.List<And> getAnd() {
            return this.and;
        }

        /**
         * @return chunkType
         */
        public String getChunkType() {
            return this.chunkType;
        }

        /**
         * @return docIdList
         */
        public java.util.List<String> getDocIdList() {
            return this.docIdList;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return or
         */
        public java.util.List<Or> getOr() {
            return this.or;
        }

        /**
         * @return status
         */
        public java.util.List<String> getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<And> and; 
            private String chunkType; 
            private java.util.List<String> docIdList; 
            private String libraryId; 
            private java.util.List<Or> or; 
            private java.util.List<String> status; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.and = model.and;
                this.chunkType = model.chunkType;
                this.docIdList = model.docIdList;
                this.libraryId = model.libraryId;
                this.or = model.or;
                this.status = model.status;
            } 

            /**
             * <p>AND expression, used to filter documents/document chunks.</p>
             */
            public Builder and(java.util.List<And> and) {
                this.and = and;
                return this;
            }

            /**
             * <p>Document chunk type, used to filter document chunks, such as: Text, Graph, Table, FAQ.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder chunkType(String chunkType) {
                this.chunkType = chunkType;
                return this;
            }

            /**
             * <p>Document ID list, used to filter documents/document chunks.</p>
             */
            public Builder docIdList(java.util.List<String> docIdList) {
                this.docIdList = docIdList;
                return this;
            }

            /**
             * <p>Document library ID, used to filter documents/document chunks.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sdbjhvs</p>
             */
            public Builder libraryId(String libraryId) {
                this.libraryId = libraryId;
                return this;
            }

            /**
             * <p>OR expression, used to filter documents/document chunks.</p>
             */
            public Builder or(java.util.List<Or> or) {
                this.or = or;
                return this;
            }

            /**
             * <p>Document status list, used to filter documents.</p>
             */
            public Builder status(java.util.List<String> status) {
                this.status = status;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
