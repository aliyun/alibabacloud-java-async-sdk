// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Operation information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHttpApiOperationResponseBody build() {
            return new CreateHttpApiOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateHttpApiOperationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHttpApiOperationResponseBody</p>
     */
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
             * <p>Operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>op-xxx</p>
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
    /**
     * 
     * {@link CreateHttpApiOperationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHttpApiOperationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operations")
        private java.util.List<Operations> operations;

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
        public java.util.List<Operations> getOperations() {
            return this.operations;
        }

        public static final class Builder {
            private java.util.List<Operations> operations; 

            /**
             * <p>Operation information.</p>
             */
            public Builder operations(java.util.List<Operations> operations) {
                this.operations = operations;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
