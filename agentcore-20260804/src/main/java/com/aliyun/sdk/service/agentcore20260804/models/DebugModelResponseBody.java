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
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The model debugging result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request processing result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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
             * <p>The model connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>Indicates whether the model debugging was successful.</p>
             */
            public Builder debugSuccess(Boolean debugSuccess) {
                this.debugSuccess = debugSuccess;
                return this;
            }

            /**
             * <p>The error code returned when debugging fails.</p>
             * 
             * <strong>example:</strong>
             * <p>UPSTREAM_MODEL_ERROR</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when debugging fails.</p>
             * 
             * <strong>example:</strong>
             * <p>The model endpoint rejected the debug request.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The number of input tokens consumed by this model debugging request.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The time consumed by this model debugging call, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder latencyMs(Long latencyMs) {
                this.latencyMs = latencyMs;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>model-1</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The number of output tokens consumed by this model debugging response.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The text response returned by the model when debugging succeeds. This value is empty when debugging fails.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * <p>The debug result status.</p>
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
