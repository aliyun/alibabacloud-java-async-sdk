// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
    private java.util.List < Filters> filters;

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
    public java.util.List < Filters> getFilters() {
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
        private java.util.List < Filters> filters; 
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
         * filters.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putBodyParameter("filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * rearrangement.
         */
        public Builder rearrangement(Boolean rearrangement) {
            this.putBodyParameter("rearrangement", rearrangement);
            this.rearrangement = rearrangement;
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
     * {@link RecallDocumentRequest} extends {@link TeaModel}
     *
     * <p>RecallDocumentRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("and")
        private java.util.List < And> and;

        @com.aliyun.core.annotation.NameInMap("chunkType")
        private String chunkType;

        @com.aliyun.core.annotation.NameInMap("docIdList")
        private java.util.List < String > docIdList;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("or")
        private java.util.List < Or> or;

        @com.aliyun.core.annotation.NameInMap("status")
        private java.util.List < String > status;

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
        public java.util.List < And> getAnd() {
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
        public java.util.List < String > getDocIdList() {
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
        public java.util.List < Or> getOr() {
            return this.or;
        }

        /**
         * @return status
         */
        public java.util.List < String > getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < And> and; 
            private String chunkType; 
            private java.util.List < String > docIdList; 
            private String libraryId; 
            private java.util.List < Or> or; 
            private java.util.List < String > status; 

            /**
             * and.
             */
            public Builder and(java.util.List < And> and) {
                this.and = and;
                return this;
            }

            /**
             * chunkType.
             */
            public Builder chunkType(String chunkType) {
                this.chunkType = chunkType;
                return this;
            }

            /**
             * docIdList.
             */
            public Builder docIdList(java.util.List < String > docIdList) {
                this.docIdList = docIdList;
                return this;
            }

            /**
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
             * or.
             */
            public Builder or(java.util.List < Or> or) {
                this.or = or;
                return this;
            }

            /**
             * status.
             */
            public Builder status(java.util.List < String > status) {
                this.status = status;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
