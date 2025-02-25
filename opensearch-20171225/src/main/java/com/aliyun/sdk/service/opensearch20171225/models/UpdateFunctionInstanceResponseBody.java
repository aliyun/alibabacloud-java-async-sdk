// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFunctionInstanceResponseBody</p>
 */
public class UpdateFunctionInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("Latency")
    private Long latency;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateFunctionInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return latency
     */
    public Long getLatency() {
        return this.latency;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The time consumed for the request, in milliseconds.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The status of the request. Valid values:
         * <p>
         * 
         * *       OK: The request was successful.
         * *       FAIL: The request failed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateFunctionInstanceResponseBody build() {
            return new UpdateFunctionInstanceResponseBody(this);
        } 

    } 

}
