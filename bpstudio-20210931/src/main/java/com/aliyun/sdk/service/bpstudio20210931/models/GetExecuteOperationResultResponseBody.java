// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link GetExecuteOperationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetExecuteOperationResultResponseBody</p>
 */
public class GetExecuteOperationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetExecuteOperationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecuteOperationResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetExecuteOperationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code. A value of 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed result of the queried operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExecuteOperationResultResponseBody build() {
            return new GetExecuteOperationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExecuteOperationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetExecuteOperationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.arguments = builder.arguments;
            this.message = builder.message;
            this.operationId = builder.operationId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String arguments; 
            private String message; 
            private String operationId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.arguments = model.arguments;
                this.message = model.message;
                this.operationId = model.operationId;
                this.status = model.status;
            } 

            /**
             * <p>The output of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>“ ”</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>op_xxxxxxxx</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The status of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
