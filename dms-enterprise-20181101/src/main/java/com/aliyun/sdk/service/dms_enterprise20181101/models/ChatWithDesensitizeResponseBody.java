// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ChatWithDesensitizeResponseBody} extends {@link TeaModel}
 *
 * <p>ChatWithDesensitizeResponseBody</p>
 */
public class ChatWithDesensitizeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ChatWithDesensitizeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatWithDesensitizeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ChatWithDesensitizeResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChatWithDesensitizeResponseBody build() {
            return new ChatWithDesensitizeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatWithDesensitizeResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithDesensitizeResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ReasoningContent")
        private String reasoningContent;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Message(Builder builder) {
            this.content = builder.content;
            this.reasoningContent = builder.reasoningContent;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return reasoningContent
         */
        public String getReasoningContent() {
            return this.reasoningContent;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String reasoningContent; 
            private String role; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.reasoningContent = model.reasoningContent;
                this.role = model.role;
            } 

            /**
             * <p>The content of the model&quot;s response.</p>
             * 
             * <strong>example:</strong>
             * <p>你好呀！</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The internal reasoning content of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>嗯，用户发了个“你好”，看起来是想打招呼...</p>
             */
            public Builder reasoningContent(String reasoningContent) {
                this.reasoningContent = reasoningContent;
                return this;
            }

            /**
             * <p>Message role.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithDesensitizeResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithDesensitizeResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("Logprobs")
        private java.util.Map<String, ?> logprobs;

        @com.aliyun.core.annotation.NameInMap("Message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
            this.logprobs = builder.logprobs;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return logprobs
         */
        public java.util.Map<String, ?> getLogprobs() {
            return this.logprobs;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private java.util.Map<String, ?> logprobs; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.logprobs = model.logprobs;
                this.message = model.message;
            } 

            /**
             * <p>Finish reason: ● stop: The model reached a natural stop point or a specified stop sequence. ● length: Generation ended because the maximum number of tokens was reached. ● tool_calls: The model stopped because it needs to call a tool to proceed.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>Token probability information of model output.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder logprobs(java.util.Map<String, ?> logprobs) {
                this.logprobs = logprobs;
                return this;
            }

            /**
             * <p>The message body output by the model.</p>
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithDesensitizeResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithDesensitizeResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletionTokens")
        private String completionTokens;

        @com.aliyun.core.annotation.NameInMap("CompletionTokensDetails")
        private java.util.Map<String, String> completionTokensDetails;

        @com.aliyun.core.annotation.NameInMap("PromptTokens")
        private String promptTokens;

        @com.aliyun.core.annotation.NameInMap("PromptTokensDetails")
        private java.util.Map<String, String> promptTokensDetails;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private String totalTokens;

        private Usage(Builder builder) {
            this.completionTokens = builder.completionTokens;
            this.completionTokensDetails = builder.completionTokensDetails;
            this.promptTokens = builder.promptTokens;
            this.promptTokensDetails = builder.promptTokensDetails;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return completionTokens
         */
        public String getCompletionTokens() {
            return this.completionTokens;
        }

        /**
         * @return completionTokensDetails
         */
        public java.util.Map<String, String> getCompletionTokensDetails() {
            return this.completionTokensDetails;
        }

        /**
         * @return promptTokens
         */
        public String getPromptTokens() {
            return this.promptTokens;
        }

        /**
         * @return promptTokensDetails
         */
        public java.util.Map<String, String> getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        /**
         * @return totalTokens
         */
        public String getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private String completionTokens; 
            private java.util.Map<String, String> completionTokensDetails; 
            private String promptTokens; 
            private java.util.Map<String, String> promptTokensDetails; 
            private String totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.completionTokens = model.completionTokens;
                this.completionTokensDetails = model.completionTokensDetails;
                this.promptTokens = model.promptTokens;
                this.promptTokensDetails = model.promptTokensDetails;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>The number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder completionTokens(String completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * <p>Fine-grained classification of output tokens when using the Qwen-VL model.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder completionTokensDetails(java.util.Map<String, String> completionTokensDetails) {
                this.completionTokensDetails = completionTokensDetails;
                return this;
            }

            /**
             * <p>The number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder promptTokens(String promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            /**
             * <p>Fine-grained classification of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder promptTokensDetails(java.util.Map<String, String> promptTokensDetails) {
                this.promptTokensDetails = promptTokensDetails;
                return this;
            }

            /**
             * <p>The total number of tokens consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder totalTokens(String totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithDesensitizeResponseBody} extends {@link TeaModel}
     *
     * <p>ChatWithDesensitizeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Choices")
        private java.util.List<Choices> choices;

        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Data(Builder builder) {
            this.choices = builder.choices;
            this.created = builder.created;
            this.message = builder.message;
            this.model = builder.model;
            this.statusCode = builder.statusCode;
            this.type = builder.type;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return choices
         */
        public java.util.List<Choices> getChoices() {
            return this.choices;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Choices> choices; 
            private String created; 
            private String message; 
            private String model; 
            private String statusCode; 
            private String type; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.choices = model.choices;
                this.created = model.created;
                this.message = model.message;
                this.model = model.model;
                this.statusCode = model.statusCode;
                this.type = model.type;
                this.usage = model.usage;
            } 

            /**
             * <p>The candidate array for model-generated content.</p>
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            /**
             * <p>The Unix timestamp (in seconds) when the request was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1763710100</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Error message, provided when StatusCode is not 200.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The model used for this request.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Error code, 200 for normal calls, others for exceptions.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>Error type.</p>
             * 
             * <strong>example:</strong>
             * <p>invalid_request_error</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The token consumption information of this request.</p>
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
