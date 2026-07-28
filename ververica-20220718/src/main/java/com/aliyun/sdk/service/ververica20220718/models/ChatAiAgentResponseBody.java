// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ChatAiAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ChatAiAgentResponseBody</p>
 */
public class ChatAiAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completed")
    private Boolean completed;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("errorType")
    private String errorType;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("input")
    private Object input;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("toolCallId")
    private String toolCallId;

    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private ChatAiAgentResponseBody(Builder builder) {
        this.completed = builder.completed;
        this.displayName = builder.displayName;
        this.errorMessage = builder.errorMessage;
        this.errorType = builder.errorType;
        this.event = builder.event;
        this.input = builder.input;
        this.items = builder.items;
        this.message = builder.message;
        this.sessionId = builder.sessionId;
        this.success = builder.success;
        this.text = builder.text;
        this.toolCallId = builder.toolCallId;
        this.toolName = builder.toolName;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatAiAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completed
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return input
     */
    public Object getInput() {
        return this.input;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return toolCallId
     */
    public String getToolCallId() {
        return this.toolCallId;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Boolean completed; 
        private String displayName; 
        private String errorMessage; 
        private String errorType; 
        private String event; 
        private Object input; 
        private java.util.List<Items> items; 
        private String message; 
        private String sessionId; 
        private String success; 
        private String text; 
        private String toolCallId; 
        private String toolName; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(ChatAiAgentResponseBody model) {
            this.completed = model.completed;
            this.displayName = model.displayName;
            this.errorMessage = model.errorMessage;
            this.errorType = model.errorType;
            this.event = model.event;
            this.input = model.input;
            this.items = model.items;
            this.message = model.message;
            this.sessionId = model.sessionId;
            this.success = model.success;
            this.text = model.text;
            this.toolCallId = model.toolCallId;
            this.toolName = model.toolName;
            this.usage = model.usage;
        } 

        /**
         * completed.
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * errorType.
         */
        public Builder errorType(String errorType) {
            this.errorType = errorType;
            return this;
        }

        /**
         * event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * input.
         */
        public Builder input(Object input) {
            this.input = input;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * toolCallId.
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }

        /**
         * toolName.
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public ChatAiAgentResponseBody build() {
            return new ChatAiAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatAiAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ChatAiAgentResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private Object args;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("hitlId")
        private String hitlId;

        @com.aliyun.core.annotation.NameInMap("toolName")
        private String toolName;

        private Items(Builder builder) {
            this.args = builder.args;
            this.displayName = builder.displayName;
            this.hitlId = builder.hitlId;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public Object getArgs() {
            return this.args;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hitlId
         */
        public String getHitlId() {
            return this.hitlId;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private Object args; 
            private String displayName; 
            private String hitlId; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.args = model.args;
                this.displayName = model.displayName;
                this.hitlId = model.hitlId;
                this.toolName = model.toolName;
            } 

            /**
             * args.
             */
            public Builder args(Object args) {
                this.args = args;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * hitlId.
             */
            public Builder hitlId(String hitlId) {
                this.hitlId = hitlId;
                return this;
            }

            /**
             * toolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatAiAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ChatAiAgentResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
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
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
