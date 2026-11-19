// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261105.models;

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
 * {@link OpenServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenServiceResponseBody</p>
 */
public class OpenServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("error")
    private Error error;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("spInstanceId")
    private String spInstanceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private OpenServiceResponseBody(Builder builder) {
        this.error = builder.error;
        this.orderId = builder.orderId;
        this.spInstanceId = builder.spInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return error
     */
    public Error getError() {
        return this.error;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return spInstanceId
     */
    public String getSpInstanceId() {
        return this.spInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Error error; 
        private String orderId; 
        private String spInstanceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(OpenServiceResponseBody model) {
            this.error = model.error;
            this.orderId = model.orderId;
            this.spInstanceId = model.spInstanceId;
            this.status = model.status;
        } 

        /**
         * <p>The details of a non-2xx error response, which are mutually exclusive with the status, orderId, and spInstanceId of a normal response.</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The order ID associated with the service activation process. Returned when an order exists.</p>
         * 
         * <strong>example:</strong>
         * <p>order-example-001</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The service instance ID returned after successful activation and settlement.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-example-001</p>
         */
        public Builder spInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }

        /**
         * <p>The test or activation result. TEST_OK indicates that the call validation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public OpenServiceResponseBody build() {
            return new OpenServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OpenServiceResponseBody} extends {@link TeaModel}
     *
     * <p>OpenServiceResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        @com.aliyun.core.annotation.NameInMap("request_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String requestId;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
            private String message; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The error code recognizable by programs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_REQUEST</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error description.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>invalid request</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The correlation ID of the current call.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>open-service-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
}
