// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link GetDatabaseSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseSchemaResponseBody</p>
 */
public class GetDatabaseSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private GetDatabaseSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseSchemaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public GetDatabaseSchemaResponseBody build() {
            return new GetDatabaseSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDatabaseSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseSchemaResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("fieldTypeDetail")
        private java.util.Map<String, ?> fieldTypeDetail;

        @com.aliyun.core.annotation.NameInMap("indexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("indexType")
        private String indexType;

        private Result(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldType = builder.fieldType;
            this.fieldTypeDetail = builder.fieldTypeDetail;
            this.indexName = builder.indexName;
            this.indexType = builder.indexType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return fieldTypeDetail
         */
        public java.util.Map<String, ?> getFieldTypeDetail() {
            return this.fieldTypeDetail;
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

        public static final class Builder {
            private String fieldName; 
            private String fieldType; 
            private java.util.Map<String, ?> fieldTypeDetail; 
            private String indexName; 
            private String indexType; 

            /**
             * fieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * fieldTypeDetail.
             */
            public Builder fieldTypeDetail(java.util.Map<String, ?> fieldTypeDetail) {
                this.fieldTypeDetail = fieldTypeDetail;
                return this;
            }

            /**
             * indexName.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * indexType.
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
