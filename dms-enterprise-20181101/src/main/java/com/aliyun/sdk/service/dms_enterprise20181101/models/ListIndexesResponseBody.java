// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexesResponseBody</p>
 */
public class ListIndexesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IndexList")
    private IndexList indexList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of indexes.
         */
        public Builder indexList(IndexList indexList) {
            this.indexList = indexList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListIndexesResponseBody build() {
            return new ListIndexesResponseBody(this);
        } 

    } 

    public static class Index extends TeaModel {
        @NameInMap("IndexComment")
        private String indexComment;

        @NameInMap("IndexId")
        private String indexId;

        @NameInMap("IndexName")
        private String indexName;

        @NameInMap("IndexType")
        private String indexType;

        @NameInMap("TableId")
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

            /**
             * The description of the index.
             */
            public Builder indexComment(String indexComment) {
                this.indexComment = indexComment;
                return this;
            }

            /**
             * The ID of the index.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * The type of the index. Valid values:
             * <p>
             * 
             * *   Primary
             * *   Unique
             * *   Normal
             * *   FullText
             * *   Spatial
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * The ID of the table.
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
    public static class IndexList extends TeaModel {
        @NameInMap("Index")
        private java.util.List < Index> index;

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
        public java.util.List < Index> getIndex() {
            return this.index;
        }

        public static final class Builder {
            private java.util.List < Index> index; 

            /**
             * Index.
             */
            public Builder index(java.util.List < Index> index) {
                this.index = index;
                return this;
            }

            public IndexList build() {
                return new IndexList(this);
            } 

        } 

    }
}
