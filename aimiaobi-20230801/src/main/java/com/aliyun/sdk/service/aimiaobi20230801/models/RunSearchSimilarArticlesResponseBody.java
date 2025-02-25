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
 * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
 *
 * <p>RunSearchSimilarArticlesResponseBody</p>
 */
public class RunSearchSimilarArticlesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunSearchSimilarArticlesResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunSearchSimilarArticlesResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchSimilarArticlesResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public RunSearchSimilarArticlesResponseBodyHeader getHeader() {
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
        private RunSearchSimilarArticlesResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        /**
         * Header.
         */
        public Builder header(RunSearchSimilarArticlesResponseBodyHeader header) {
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

        public RunSearchSimilarArticlesResponseBody build() {
            return new RunSearchSimilarArticlesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesResponseBody</p>
     */
    public static class RunSearchSimilarArticlesResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private RunSearchSimilarArticlesResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunSearchSimilarArticlesResponseBodyHeader create() {
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

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String sessionId; 
            private String taskId; 

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

            public RunSearchSimilarArticlesResponseBodyHeader build() {
                return new RunSearchSimilarArticlesResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.searchSourceName = builder.searchSourceName;
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
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docUuid; 
            private String pubTime; 
            private String searchSourceName; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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
     * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<Articles> articles;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Output(Builder builder) {
            this.articles = builder.articles;
            this.text = builder.text;
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
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Articles> articles; 
            private String text; 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesResponseBody</p>
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
     * {@link RunSearchSimilarArticlesResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesResponseBody</p>
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
