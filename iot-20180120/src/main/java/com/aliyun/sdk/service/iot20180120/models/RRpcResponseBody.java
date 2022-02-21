// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RRpcResponseBody} extends {@link TeaModel}
 *
 * <p>RRpcResponseBody</p>
 */
public class RRpcResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("MessageId")
    private Long messageId;

    @NameInMap("PayloadBase64Byte")
    private String payloadBase64Byte;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RrpcCode")
    private String rrpcCode;

    @NameInMap("Success")
    private Boolean success;

    private RRpcResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.messageId = builder.messageId;
        this.payloadBase64Byte = builder.payloadBase64Byte;
        this.requestId = builder.requestId;
        this.rrpcCode = builder.rrpcCode;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RRpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return messageId
     */
    public Long getMessageId() {
        return this.messageId;
    }

    /**
     * @return payloadBase64Byte
     */
    public String getPayloadBase64Byte() {
        return this.payloadBase64Byte;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rrpcCode
     */
    public String getRrpcCode() {
        return this.rrpcCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Long messageId; 
        private String payloadBase64Byte; 
        private String requestId; 
        private String rrpcCode; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * PayloadBase64Byte.
         */
        public Builder payloadBase64Byte(String payloadBase64Byte) {
            this.payloadBase64Byte = payloadBase64Byte;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RrpcCode.
         */
        public Builder rrpcCode(String rrpcCode) {
            this.rrpcCode = rrpcCode;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RRpcResponseBody build() {
            return new RRpcResponseBody(this);
        } 

    } 

}
