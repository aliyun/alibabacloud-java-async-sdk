// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>StopApplicationResponseBody</p>
 */
public class StopApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private StopApplicationResponseBody(Builder builder) {
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

    public static StopApplicationResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   If the request is successful, this parameter is not returned.****
         * *   This parameter is returned only if the request failed.**** For more information, see **Error codes** in this topic.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the specified application is stopped. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the trace. It can be used to query the details of a request.
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
         * The ID of the change order.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public StopApplicationResponseBody build() {
            return new StopApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
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
             * The HTTP status code. Valid values:
             * <p>
             * 
             * *   **2xx**: indicates that the request was successful.
             * *   **3xx**: indicates that the request was redirected.
             * *   **4xx**: indicates that the request was invalid.
             * *   **5xx**: indicates that a server error occurred.
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
