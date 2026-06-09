// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edututor20250707.models;

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
 * {@link AnswerSSEResponseBody} extends {@link TeaModel}
 *
 * <p>AnswerSSEResponseBody</p>
 */
public class AnswerSSEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("finish_reason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("input_tokens")
    private Integer inputTokens;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("output_tokens")
    private Integer outputTokens;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AnswerSSEResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.finishReason = builder.finishReason;
        this.httpStatusCode = builder.httpStatusCode;
        this.inputTokens = builder.inputTokens;
        this.message = builder.message;
        this.outputTokens = builder.outputTokens;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnswerSSEResponseBody create() {
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
    public String getData() {
        return this.data;
    }

    /**
     * @return finishReason
     */
    public String getFinishReason() {
        return this.finishReason;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return this.outputTokens;
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String finishReason; 
        private Integer httpStatusCode; 
        private Integer inputTokens; 
        private String message; 
        private Integer outputTokens; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AnswerSSEResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.finishReason = model.finishReason;
            this.httpStatusCode = model.httpStatusCode;
            this.inputTokens = model.inputTokens;
            this.message = model.message;
            this.outputTokens = model.outputTokens;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * finish_reason.
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * input_tokens.
         */
        public Builder inputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
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
         * output_tokens.
         */
        public Builder outputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AnswerSSEResponseBody build() {
            return new AnswerSSEResponseBody(this);
        } 

    } 

}
