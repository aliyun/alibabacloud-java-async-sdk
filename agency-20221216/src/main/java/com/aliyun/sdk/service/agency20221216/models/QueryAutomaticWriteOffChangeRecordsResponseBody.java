// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link QueryAutomaticWriteOffChangeRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAutomaticWriteOffChangeRecordsResponseBody</p>
 */
public class QueryAutomaticWriteOffChangeRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAutomaticWriteOffChangeRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAutomaticWriteOffChangeRecordsResponseBody create() {
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
    public java.util.List<Data> getData() {
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAutomaticWriteOffChangeRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code of the response. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of query results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8cd24f2917797624314748873d0096</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAutomaticWriteOffChangeRecordsResponseBody build() {
            return new QueryAutomaticWriteOffChangeRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAutomaticWriteOffChangeRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAutomaticWriteOffChangeRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeContent")
        private String changeContent;

        @com.aliyun.core.annotation.NameInMap("OperateId")
        private String operateId;

        @com.aliyun.core.annotation.NameInMap("OperateSource")
        private String operateSource;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        private Data(Builder builder) {
            this.changeContent = builder.changeContent;
            this.operateId = builder.operateId;
            this.operateSource = builder.operateSource;
            this.operationTime = builder.operationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeContent
         */
        public String getChangeContent() {
            return this.changeContent;
        }

        /**
         * @return operateId
         */
        public String getOperateId() {
            return this.operateId;
        }

        /**
         * @return operateSource
         */
        public String getOperateSource() {
            return this.operateSource;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        public static final class Builder {
            private String changeContent; 
            private String operateId; 
            private String operateSource; 
            private String operationTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeContent = model.changeContent;
                this.operateId = model.operateId;
                this.operateSource = model.operateSource;
                this.operationTime = model.operationTime;
            } 

            /**
             * <p>The content of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable automatic write-off and select 500 USD</p>
             */
            public Builder changeContent(String changeContent) {
                this.changeContent = changeContent;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>12312312</p>
             */
            public Builder operateId(String operateId) {
                this.operateId = operateId;
                return this;
            }

            /**
             * <p>The description of the operation source.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder operateSource(String operateSource) {
                this.operateSource = operateSource;
                return this;
            }

            /**
             * <p>The time of the operation. Format: YYYY-MM-DD HH:mm:ss UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-15 10:34:36 UTC+8</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
