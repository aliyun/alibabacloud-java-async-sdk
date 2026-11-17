// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link CreateEduProblemSolveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEduProblemSolveResponseBody</p>
 */
public class CreateEduProblemSolveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    private CreateEduProblemSolveResponseBody(Builder builder) {
        this.data = builder.data;
        this.event = builder.event;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEduProblemSolveResponseBody create() {
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
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    public static final class Builder {
        private Data data; 
        private String event; 

        private Builder() {
        } 

        private Builder(CreateEduProblemSolveResponseBody model) {
            this.data = model.data;
            this.event = model.event;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        public CreateEduProblemSolveResponseBody build() {
            return new CreateEduProblemSolveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEduProblemSolveResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveResponseBody</p>
     */
    public static class Thinking extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Thinking(Builder builder) {
            this.content = builder.content;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thinking create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String content; 
            private String status; 

            private Builder() {
            } 

            private Builder(Thinking model) {
                this.content = model.content;
                this.status = model.status;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Thinking build() {
                return new Thinking(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEduProblemSolveResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("questionId")
        private String questionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("thinking")
        private Thinking thinking;

        private Items(Builder builder) {
            this.content = builder.content;
            this.imageUrl = builder.imageUrl;
            this.questionId = builder.questionId;
            this.status = builder.status;
            this.thinking = builder.thinking;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return questionId
         */
        public String getQuestionId() {
            return this.questionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return thinking
         */
        public Thinking getThinking() {
            return this.thinking;
        }

        public static final class Builder {
            private String content; 
            private String imageUrl; 
            private String questionId; 
            private String status; 
            private Thinking thinking; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.content = model.content;
                this.imageUrl = model.imageUrl;
                this.questionId = model.questionId;
                this.status = model.status;
                this.thinking = model.thinking;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * imageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * questionId.
             */
            public Builder questionId(String questionId) {
                this.questionId = questionId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * thinking.
             */
            public Builder thinking(Thinking thinking) {
                this.thinking = thinking;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEduProblemSolveResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completionTokens")
        private Integer completionTokens;

        @com.aliyun.core.annotation.NameInMap("promptTokens")
        private Integer promptTokens;

        private Usage(Builder builder) {
            this.completionTokens = builder.completionTokens;
            this.promptTokens = builder.promptTokens;
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
        public Integer getCompletionTokens() {
            return this.completionTokens;
        }

        /**
         * @return promptTokens
         */
        public Integer getPromptTokens() {
            return this.promptTokens;
        }

        public static final class Builder {
            private Integer completionTokens; 
            private Integer promptTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.completionTokens = model.completionTokens;
                this.promptTokens = model.promptTokens;
            } 

            /**
             * completionTokens.
             */
            public Builder completionTokens(Integer completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * promptTokens.
             */
            public Builder promptTokens(Integer promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEduProblemSolveResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEduProblemSolveResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("resultType")
        private String resultType;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Data(Builder builder) {
            this.code = builder.code;
            this.finished = builder.finished;
            this.items = builder.items;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.resultType = builder.resultType;
            this.retryable = builder.retryable;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String code; 
            private Boolean finished; 
            private java.util.List<Items> items; 
            private String message; 
            private String requestId; 
            private String resultType; 
            private Boolean retryable; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.finished = model.finished;
                this.items = model.items;
                this.message = model.message;
                this.requestId = model.requestId;
                this.resultType = model.resultType;
                this.retryable = model.retryable;
                this.usage = model.usage;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
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
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * resultType.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            /**
             * retryable.
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * usage.
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
