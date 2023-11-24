// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteApplicationResponseBody</p>
 */
public class DeleteApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DeleteApplicationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Indicates whether the application is deleted. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the change order that is used to query the task execution status.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The request is successful.
         * *   **3xx**: A redirection message is returned.
         * *   **4xx**: The request is invalid.
         * *   **5xx**: A server error occurred.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The trace ID that is used to query details of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request is successful, **success** is returned.
         * *   If an error occurred, the error code is returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DeleteApplicationResponseBody build() {
            return new DeleteApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        private Data(Builder builder) {
            this.changeOrderId = builder.changeOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public static final class Builder {
            private String changeOrderId; 

            /**
             * The error code that is returned if the request fails.
             * <p>
             * 
             * *   If the request is successful, this parameter is not returned.****
             * *   This parameter is returned only if the request failed.**** For more information about the values of this parameter, see the "**Error codes**" section of this topic.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
