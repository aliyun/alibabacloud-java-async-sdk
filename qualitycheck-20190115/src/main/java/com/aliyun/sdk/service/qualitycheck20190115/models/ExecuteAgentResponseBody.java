// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ExecuteAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteAgentResponseBody</p>
 */
public class ExecuteAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecuteAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAgentResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The caller can use this field to determine whether the request was successful. Valid values: <strong>true</strong>: The request was successful. <strong>false/null</strong>: The request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecuteAgentResponseBody build() {
            return new ExecuteAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("LlmRequestId")
        private String llmRequestId;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("TyxmPlusCount")
        private String tyxmPlusCount;

        @com.aliyun.core.annotation.NameInMap("TyxmTurboCount")
        private String tyxmTurboCount;

        private Data(Builder builder) {
            this.finishReason = builder.finishReason;
            this.inputTokens = builder.inputTokens;
            this.llmRequestId = builder.llmRequestId;
            this.outputTokens = builder.outputTokens;
            this.text = builder.text;
            this.totalTokens = builder.totalTokens;
            this.tyxmPlusCount = builder.tyxmPlusCount;
            this.tyxmTurboCount = builder.tyxmTurboCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return llmRequestId
         */
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return tyxmPlusCount
         */
        public String getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        /**
         * @return tyxmTurboCount
         */
        public String getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

        public static final class Builder {
            private String finishReason; 
            private Long inputTokens; 
            private String llmRequestId; 
            private Long outputTokens; 
            private String text; 
            private Long totalTokens; 
            private String tyxmPlusCount; 
            private String tyxmTurboCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.finishReason = model.finishReason;
                this.inputTokens = model.inputTokens;
                this.llmRequestId = model.llmRequestId;
                this.outputTokens = model.outputTokens;
                this.text = model.text;
                this.totalTokens = model.totalTokens;
                this.tyxmPlusCount = model.tyxmPlusCount;
                this.tyxmTurboCount = model.tyxmTurboCount;
            } 

            /**
             * <p>If streaming output is used, this value is null during generation. When generation is complete, the value is stop if the generation ended due to a stop token.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>The number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The request ID returned by the large language model service.</p>
             * 
             * <strong>example:</strong>
             * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
             */
            public Builder llmRequestId(String llmRequestId) {
                this.llmRequestId = llmRequestId;
                return this;
            }

            /**
             * <p>The number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The result returned by the large language model.</p>
             * 
             * <strong>example:</strong>
             * <p>这段对话似乎是客服与客户之间关于一个服务或产品的讨论，但具体内容难以明确理解，因为对话中的言语比较零散和抽象。</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * <p>The number of times the plus model was used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tyxmPlusCount(String tyxmPlusCount) {
                this.tyxmPlusCount = tyxmPlusCount;
                return this;
            }

            /**
             * <p>The number of times the turbo model was used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tyxmTurboCount(String tyxmTurboCount) {
                this.tyxmTurboCount = tyxmTurboCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
