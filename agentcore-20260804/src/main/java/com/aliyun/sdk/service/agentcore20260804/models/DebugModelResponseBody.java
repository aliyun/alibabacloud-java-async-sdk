// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DebugModelResponseBody} extends {@link TeaModel}
 *
 * <p>DebugModelResponseBody</p>
 */
public class DebugModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DebugModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugModelResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DebugModelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
        public Builder data(Data data) {
            this.data = data;
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

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DebugModelResponseBody build() {
            return new DebugModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DebugModelResponseBody} extends {@link TeaModel}
     *
     * <p>DebugModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("debugSuccess")
        private Boolean debugSuccess;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("latencyMs")
        private Long latencyMs;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.connectionId = builder.connectionId;
            this.debugSuccess = builder.debugSuccess;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.inputTokens = builder.inputTokens;
            this.latencyMs = builder.latencyMs;
            this.modelId = builder.modelId;
            this.outputTokens = builder.outputTokens;
            this.response = builder.response;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return debugSuccess
         */
        public Boolean getDebugSuccess() {
            return this.debugSuccess;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return latencyMs
         */
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return response
         */
        public String getResponse() {
            return this.response;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String connectionId; 
            private Boolean debugSuccess; 
            private String errorCode; 
            private String errorMessage; 
            private Long inputTokens; 
            private Long latencyMs; 
            private String modelId; 
            private Long outputTokens; 
            private String response; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectionId = model.connectionId;
                this.debugSuccess = model.debugSuccess;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.inputTokens = model.inputTokens;
                this.latencyMs = model.latencyMs;
                this.modelId = model.modelId;
                this.outputTokens = model.outputTokens;
                this.response = model.response;
                this.status = model.status;
            } 

            /**
             * connectionId.
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * debugSuccess.
             */
            public Builder debugSuccess(Boolean debugSuccess) {
                this.debugSuccess = debugSuccess;
                return this;
            }

            /**
             * <p>调试失败时的错误码。取值：MODEL_CONNECTION_NOT_READY（模型连接尚未发布就绪）、MODEL_CONNECTION_TEST_FAILED（平台调用网关失败）、UPSTREAM_MODEL_NOT_FOUND（模型服务商侧不存在该模型）、UPSTREAM_UNAUTHORIZED（模型服务商拒绝所配置的凭证）、UPSTREAM_RATE_LIMITED（模型服务商限流）、UPSTREAM_SERVER_ERROR（模型服务商服务端错误）、UPSTREAM_HTTP_ERROR（模型服务商返回其它非成功状态）、UPSTREAM_EMPTY_RESPONSE（模型服务商返回空响应）、UPSTREAM_INVALID_RESPONSE（模型服务商响应格式非法）、UPSTREAM_MODEL_ERROR（模型服务商拒绝本次请求）、MODEL_RESPONSE_INVALID（响应解析失败）。</p>
             * 
             * <strong>example:</strong>
             * <p>UPSTREAM_MODEL_ERROR</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>调试失败时的错误描述，为固定脱敏文案，不透传模型服务商的原始错误详情。</p>
             * 
             * <strong>example:</strong>
             * <p>The model endpoint rejected the debug request.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * latencyMs.
             */
            public Builder latencyMs(Long latencyMs) {
                this.latencyMs = latencyMs;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * response.
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * <p>调试结果状态。取值：NORMAL（正常）、ABNORMAL（异常）。</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
