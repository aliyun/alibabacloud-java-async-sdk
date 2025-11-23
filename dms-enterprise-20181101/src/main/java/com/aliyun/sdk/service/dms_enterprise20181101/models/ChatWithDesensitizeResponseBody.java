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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * RequestId.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ReasoningContent.
             */
            public Builder reasoningContent(String reasoningContent) {
                this.reasoningContent = reasoningContent;
                return this;
            }

            /**
             * Role.
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

        @com.aliyun.core.annotation.NameInMap("Message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
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
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.message = model.message;
            } 

            /**
             * FinishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * Message.
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

        @com.aliyun.core.annotation.NameInMap("PromptTokens")
        private String promptTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private String totalTokens;

        private Usage(Builder builder) {
            this.completionTokens = builder.completionTokens;
            this.promptTokens = builder.promptTokens;
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
         * @return promptTokens
         */
        public String getPromptTokens() {
            return this.promptTokens;
        }

        /**
         * @return totalTokens
         */
        public String getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private String completionTokens; 
            private String promptTokens; 
            private String totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.completionTokens = model.completionTokens;
                this.promptTokens = model.promptTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * CompletionTokens.
             */
            public Builder completionTokens(String completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * PromptTokens.
             */
            public Builder promptTokens(String promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            /**
             * TotalTokens.
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

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Data(Builder builder) {
            this.choices = builder.choices;
            this.created = builder.created;
            this.model = builder.model;
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
         * @return model
         */
        public String getModel() {
            return this.model;
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
            private String model; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.choices = model.choices;
                this.created = model.created;
                this.model = model.model;
                this.usage = model.usage;
            } 

            /**
             * Choices.
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Usage.
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
