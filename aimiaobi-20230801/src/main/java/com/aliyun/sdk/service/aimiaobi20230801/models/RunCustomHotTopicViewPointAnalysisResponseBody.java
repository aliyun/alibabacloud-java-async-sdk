// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
 */
public class RunCustomHotTopicViewPointAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunCustomHotTopicViewPointAnalysisResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunCustomHotTopicViewPointAnalysisResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCustomHotTopicViewPointAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunCustomHotTopicViewPointAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RunCustomHotTopicViewPointAnalysisResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunCustomHotTopicViewPointAnalysisResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * Header.
         */
        public Builder header(RunCustomHotTopicViewPointAnalysisResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBody build() {
            return new RunCustomHotTopicViewPointAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
     */
    public static class RunCustomHotTopicViewPointAnalysisResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("OriginSessionId")
        private String originSessionId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunCustomHotTopicViewPointAnalysisResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.originSessionId = builder.originSessionId;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunCustomHotTopicViewPointAnalysisResponseBodyHeader create() {
            return builder().build();
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
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return originSessionId
         */
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String originSessionId; 
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunCustomHotTopicViewPointAnalysisResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.originSessionId = model.originSessionId;
                this.sessionId = model.sessionId;
                this.taskId = model.taskId;
                this.traceId = model.traceId;
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
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * OriginSessionId.
             */
            public Builder originSessionId(String originSessionId) {
                this.originSessionId = originSessionId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunCustomHotTopicViewPointAnalysisResponseBodyHeader build() {
                return new RunCustomHotTopicViewPointAnalysisResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.author = builder.author;
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Articles create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String author; 
            private String content; 
            private String pubTime; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Articles model) {
                this.author = model.author;
                this.content = model.content;
                this.pubTime = model.pubTime;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Articles build() {
                return new Articles(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<Articles> articles;

        @com.aliyun.core.annotation.NameInMap("AskUser")
        private java.util.List<String> askUser;

        @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("CustomViewPointId")
        private String customViewPointId;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private String topicId;

        private Output(Builder builder) {
            this.articles = builder.articles;
            this.askUser = builder.askUser;
            this.asyncTaskId = builder.asyncTaskId;
            this.attitude = builder.attitude;
            this.customViewPointId = builder.customViewPointId;
            this.text = builder.text;
            this.topicId = builder.topicId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return articles
         */
        public java.util.List<Articles> getArticles() {
            return this.articles;
        }

        /**
         * @return askUser
         */
        public java.util.List<String> getAskUser() {
            return this.askUser;
        }

        /**
         * @return asyncTaskId
         */
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return customViewPointId
         */
        public String getCustomViewPointId() {
            return this.customViewPointId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return topicId
         */
        public String getTopicId() {
            return this.topicId;
        }

        public static final class Builder {
            private java.util.List<Articles> articles; 
            private java.util.List<String> askUser; 
            private String asyncTaskId; 
            private String attitude; 
            private String customViewPointId; 
            private String text; 
            private String topicId; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.articles = model.articles;
                this.askUser = model.askUser;
                this.asyncTaskId = model.asyncTaskId;
                this.attitude = model.attitude;
                this.customViewPointId = model.customViewPointId;
                this.text = model.text;
                this.topicId = model.topicId;
            } 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * AskUser.
             */
            public Builder askUser(java.util.List<String> askUser) {
                this.askUser = askUser;
                return this;
            }

            /**
             * AsyncTaskId.
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * CustomViewPointId.
             */
            public Builder customViewPointId(String customViewPointId) {
                this.customViewPointId = customViewPointId;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(String topicId) {
                this.topicId = topicId;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
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
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
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
    /**
     * 
     * {@link RunCustomHotTopicViewPointAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunCustomHotTopicViewPointAnalysisResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Payload(Builder builder) {
            this.output = builder.output;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Output output; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.output = model.output;
                this.usage = model.usage;
            } 

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
