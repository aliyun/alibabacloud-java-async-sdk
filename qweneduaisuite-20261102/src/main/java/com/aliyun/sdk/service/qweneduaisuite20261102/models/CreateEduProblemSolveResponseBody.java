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

    private CreateEduProblemSolveResponseBody(Builder builder) {
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

    public static CreateEduProblemSolveResponseBody create() {
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

        private Builder(CreateEduProblemSolveResponseBody model) {
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
         * <p>The API data identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>change_batch</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Specifies whether this is the final full snapshot. The value is fixed to true in the complete event.</p>
         */
        public Builder finished(Boolean finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>The current list of complete question results.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The actual response message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Echo request ID echoed from echo request.</p>
         * 
         * <strong>example:</strong>
         * <p>098E23F7-A74C-5584-87A1-39734D5B83CE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the question resolution result. Valid values:</p>
         * <ul>
         * <li>single: Single question.</li>
         * <li>multiple: Multiple questions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>Specifies whether the error is retryable. Default value: true.</p>
         */
        public Builder retryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }

        /**
         * <p>The token usage. Only the complete event carries the final value. The message event does not return this field.</p>
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
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
             * <p>The current thinking content.</p>
             * 
             * <strong>example:</strong>
             * <p>8ci7nsj9WPYXvQb9MJfA</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The thinking status. Valid values:</p>
             * <ul>
             * <li>processing: Processing.</li>
             * <li>complete: Complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
             * <p>The complete Markdown content of the question resolution, including the deduction process and the final result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The URL of the unique image for the current question. The URL may be time-sensitive. If the question is not associated with an image resource and no request URL is available for fallback, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.jpg">https://xxx.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The question identifier. The value is the question title, such as Question 1. The server does not return a separate title field. If the downstream service does not provide a question title, which is always the case for single-question scenarios, titles such as Question 1 and Question 2 are generated in the order of the questions.</p>
             * 
             * <strong>example:</strong>
             * <p>50a10e43a33e36179e355556d319ebd5</p>
             */
            public Builder questionId(String questionId) {
                this.questionId = questionId;
                return this;
            }

            /**
             * <p>The current question status. Valid values:</p>
             * <ul>
             * <li>processing: Processing.</li>
             * <li>complete: Complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The thinking process. This field is returned only when result_type is single, and is not returned for multiple questions.</p>
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
             * <p>The number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder completionTokens(Integer completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * <p>The number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
}
