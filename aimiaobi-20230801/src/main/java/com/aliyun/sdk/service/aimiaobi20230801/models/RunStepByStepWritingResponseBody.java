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
 * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
 *
 * <p>RunStepByStepWritingResponseBody</p>
 */
public class RunStepByStepWritingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunStepByStepWritingResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunStepByStepWritingResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunStepByStepWritingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunStepByStepWritingResponseBodyHeader getHeader() {
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
        private RunStepByStepWritingResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunStepByStepWritingResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * Header.
         */
        public Builder header(RunStepByStepWritingResponseBodyHeader header) {
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

        public RunStepByStepWritingResponseBody build() {
            return new RunStepByStepWritingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
     */
    public static class RunStepByStepWritingResponseBodyHeader extends TeaModel {
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

        private RunStepByStepWritingResponseBodyHeader(Builder builder) {
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

        public static RunStepByStepWritingResponseBodyHeader create() {
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

            private Builder(RunStepByStepWritingResponseBodyHeader model) {
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

            public RunStepByStepWritingResponseBodyHeader build() {
                return new RunStepByStepWritingResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.author = builder.author;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.mediaUrl = builder.mediaUrl;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.summary = builder.summary;
            this.tag = builder.tag;
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
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
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
         * @return tag
         */
        public String getTag() {
            return this.tag;
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
            private String docId; 
            private String docUuid; 
            private String mediaUrl; 
            private String pubTime; 
            private String source; 
            private String summary; 
            private String tag; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Articles model) {
                this.author = model.author;
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.mediaUrl = model.mediaUrl;
                this.pubTime = model.pubTime;
                this.source = model.source;
                this.summary = model.summary;
                this.tag = model.tag;
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
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
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
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
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
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
     */
    public static class ExtraOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summarization")
        private java.util.List<String> summarization;

        private ExtraOutput(Builder builder) {
            this.summarization = builder.summarization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraOutput create() {
            return builder().build();
        }

        /**
         * @return summarization
         */
        public java.util.List<String> getSummarization() {
            return this.summarization;
        }

        public static final class Builder {
            private java.util.List<String> summarization; 

            private Builder() {
            } 

            private Builder(ExtraOutput model) {
                this.summarization = model.summarization;
            } 

            /**
             * summarization.
             */
            public Builder summarization(java.util.List<String> summarization) {
                this.summarization = summarization;
                return this;
            }

            public ExtraOutput build() {
                return new ExtraOutput(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<Articles> articles;

        @com.aliyun.core.annotation.NameInMap("ExtraOutput")
        private ExtraOutput extraOutput;

        @com.aliyun.core.annotation.NameInMap("MiniDoc")
        private java.util.List<String> miniDoc;

        @com.aliyun.core.annotation.NameInMap("SearchQuery")
        private String searchQuery;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Output(Builder builder) {
            this.articles = builder.articles;
            this.extraOutput = builder.extraOutput;
            this.miniDoc = builder.miniDoc;
            this.searchQuery = builder.searchQuery;
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
         * @return extraOutput
         */
        public ExtraOutput getExtraOutput() {
            return this.extraOutput;
        }

        /**
         * @return miniDoc
         */
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        /**
         * @return searchQuery
         */
        public String getSearchQuery() {
            return this.searchQuery;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Articles> articles; 
            private ExtraOutput extraOutput; 
            private java.util.List<String> miniDoc; 
            private String searchQuery; 
            private String text; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.articles = model.articles;
                this.extraOutput = model.extraOutput;
                this.miniDoc = model.miniDoc;
                this.searchQuery = model.searchQuery;
                this.text = model.text;
            } 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * ExtraOutput.
             */
            public Builder extraOutput(ExtraOutput extraOutput) {
                this.extraOutput = extraOutput;
                return this;
            }

            /**
             * MiniDoc.
             */
            public Builder miniDoc(java.util.List<String> miniDoc) {
                this.miniDoc = miniDoc;
                return this;
            }

            /**
             * SearchQuery.
             */
            public Builder searchQuery(String searchQuery) {
                this.searchQuery = searchQuery;
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
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
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
     * {@link RunStepByStepWritingResponseBody} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingResponseBody</p>
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
