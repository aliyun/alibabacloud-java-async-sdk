// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFilterDocumentListRequest} extends {@link RequestModel}
 *
 * <p>GetFilterDocumentListRequest</p>
 */
public class GetFilterDocumentListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("and")
    private java.util.List < And> and;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docIdList")
    private java.util.List < String > docIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("or")
    private java.util.List < Or> or;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private java.util.List < String > status;

    private GetFilterDocumentListRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.and = builder.and;
        this.docIdList = builder.docIdList;
        this.libraryId = builder.libraryId;
        this.or = builder.or;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFilterDocumentListRequest create() {
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
     * @return and
     */
    public java.util.List < And> getAnd() {
        return this.and;
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetFilterDocumentListRequest, Builder> {
        private String workspaceId; 
        private java.util.List < And> and; 
        private java.util.List < String > docIdList; 
        private String libraryId; 
        private java.util.List < Or> or; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(GetFilterDocumentListRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.and = request.and;
            this.docIdList = request.docIdList;
            this.libraryId = request.libraryId;
            this.or = request.or;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.status = request.status;
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
         * and.
         */
        public Builder and(java.util.List < And> and) {
            this.putBodyParameter("and", and);
            this.and = and;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cjshcxxxx</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * or.
         */
        public Builder or(java.util.List < Or> or) {
            this.putBodyParameter("or", or);
            this.or = or;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(java.util.List < String > status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetFilterDocumentListRequest build() {
            return new GetFilterDocumentListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetFilterDocumentListRequest} extends {@link TeaModel}
     *
     * <p>GetFilterDocumentListRequest</p>
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
     * {@link GetFilterDocumentListRequest} extends {@link TeaModel}
     *
     * <p>GetFilterDocumentListRequest</p>
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
}
