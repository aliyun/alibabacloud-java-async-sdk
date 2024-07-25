// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHttpApiOperationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHttpApiOperationResponseBody</p>
 */
public class CreateHttpApiOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateHttpApiOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpApiOperationResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHttpApiOperationResponseBody build() {
            return new CreateHttpApiOperationResponseBody(this);
        } 

    } 

    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        private Operations(Builder builder) {
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private String operationId; 

            /**
             * operationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operations")
        private java.util.List < Operations> operations;

        private Data(Builder builder) {
            this.operations = builder.operations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return operations
         */
        public java.util.List < Operations> getOperations() {
            return this.operations;
        }

        public static final class Builder {
            private java.util.List < Operations> operations; 

            /**
             * operations.
             */
            public Builder operations(java.util.List < Operations> operations) {
                this.operations = operations;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
