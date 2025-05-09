// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListIndexesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexesResponseBody</p>
 */
public class ListIndexesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("IndexList")
    private IndexList indexList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListIndexesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.indexList = builder.indexList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return indexList
     */
    public IndexList getIndexList() {
        return this.indexList;
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
        private String errorCode; 
        private String errorMessage; 
        private IndexList indexList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListIndexesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.indexList = model.indexList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of indexes.</p>
         */
        public Builder indexList(IndexList indexList) {
            this.indexList = indexList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1F4DE2F1-5B47-462A-A973-E02EB7AF386B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListIndexesResponseBody build() {
            return new ListIndexesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndexesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexesResponseBody</p>
     */
    public static class Index extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexComment")
        private String indexComment;

        @com.aliyun.core.annotation.NameInMap("IndexId")
        private String indexId;

        @com.aliyun.core.annotation.NameInMap("IndexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        private String indexType;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        private Index(Builder builder) {
            this.indexComment = builder.indexComment;
            this.indexId = builder.indexId;
            this.indexName = builder.indexName;
            this.indexType = builder.indexType;
            this.tableId = builder.tableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Index create() {
            return builder().build();
        }

        /**
         * @return indexComment
         */
        public String getIndexComment() {
            return this.indexComment;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return indexType
         */
        public String getIndexType() {
            return this.indexType;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        public static final class Builder {
            private String indexComment; 
            private String indexId; 
            private String indexName; 
            private String indexType; 
            private String tableId; 

            private Builder() {
            } 

            private Builder(Index model) {
                this.indexComment = model.indexComment;
                this.indexId = model.indexId;
                this.indexName = model.indexName;
                this.indexType = model.indexType;
                this.tableId = model.tableId;
            } 

            /**
             * <p>The description of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder indexComment(String indexComment) {
                this.indexComment = indexComment;
                return this;
            }

            /**
             * <p>The ID of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * <p>The name of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>idx_test</p>
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * <p>The type of the index. Valid values:</p>
             * <ul>
             * <li>Primary</li>
             * <li>Unique</li>
             * <li>Normal</li>
             * <li>FullText</li>
             * <li>Spatial</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            public Index build() {
                return new Index(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndexesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexesResponseBody</p>
     */
    public static class IndexList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private java.util.List<Index> index;

        private IndexList(Builder builder) {
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexList create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public java.util.List<Index> getIndex() {
            return this.index;
        }

        public static final class Builder {
            private java.util.List<Index> index; 

            private Builder() {
            } 

            private Builder(IndexList model) {
                this.index = model.index;
            } 

            /**
             * Index.
             */
            public Builder index(java.util.List<Index> index) {
                this.index = index;
                return this;
            }

            public IndexList build() {
                return new IndexList(this);
            } 

        } 

    }
}
