// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RunChatResultGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunChatResultGenerationResponseBody</p>
 */
public class RunChatResultGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("choices")
    private java.util.List<Choices> choices;

    @com.aliyun.core.annotation.NameInMap("created")
    private Long created;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Integer totalTokens;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private RunChatResultGenerationResponseBody(Builder builder) {
        this.choices = builder.choices;
        this.created = builder.created;
        this.id = builder.id;
        this.modelId = builder.modelId;
        this.requestId = builder.requestId;
        this.time = builder.time;
        this.totalTokens = builder.totalTokens;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunChatResultGenerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getCreated() {
        return this.created;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private java.util.List<Choices> choices; 
        private Long created; 
        private String id; 
        private String modelId; 
        private String requestId; 
        private String time; 
        private Integer totalTokens; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(RunChatResultGenerationResponseBody model) {
            this.choices = model.choices;
            this.created = model.created;
            this.id = model.id;
            this.modelId = model.modelId;
            this.requestId = model.requestId;
            this.time = model.time;
            this.totalTokens = model.totalTokens;
            this.usage = model.usage;
        } 

        /**
         * choices.
         */
        public Builder choices(java.util.List<Choices> choices) {
            this.choices = choices;
            return this;
        }

        /**
         * created.
         */
        public Builder created(Long created) {
            this.created = created;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * totalTokens.
         */
        public Builder totalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public RunChatResultGenerationResponseBody build() {
            return new RunChatResultGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunChatResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<java.util.Map<String, ?>> toolCalls;

        private Message(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.toolCalls = builder.toolCalls;
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
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<java.util.Map<String, ?>> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private String content; 
            private String role; 
            private java.util.List<java.util.Map<String, ?>> toolCalls; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.role = model.role;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * toolCalls.
             */
            public Builder toolCalls(java.util.List<java.util.Map<String, ?>> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunChatResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
            this.index = builder.index;
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
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private Integer index; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.index = model.index;
                this.message = model.message;
            } 

            /**
             * finishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * message.
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
     * {@link RunChatResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageCount")
        private Integer imageCount;

        @com.aliyun.core.annotation.NameInMap("imageTokens")
        private Integer imageTokens;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Integer totalTokens;

        private Usage(Builder builder) {
            this.imageCount = builder.imageCount;
            this.imageTokens = builder.imageTokens;
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
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return imageTokens
         */
        public Integer getImageTokens() {
            return this.imageTokens;
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Integer imageCount; 
            private Integer imageTokens; 
            private Integer inputTokens; 
            private Integer outputTokens; 
            private Integer totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.imageCount = model.imageCount;
                this.imageTokens = model.imageTokens;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * imageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * imageTokens.
             */
            public Builder imageTokens(Integer imageTokens) {
                this.imageTokens = imageTokens;
                return this;
            }

            /**
             * inputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Integer totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
