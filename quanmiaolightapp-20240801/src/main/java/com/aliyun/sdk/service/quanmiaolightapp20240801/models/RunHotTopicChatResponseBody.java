// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
 *
 * <p>RunHotTopicChatResponseBody</p>
 */
public class RunHotTopicChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private RunHotTopicChatResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RunHotTopicChatResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunHotTopicChatResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public RunHotTopicChatResponseBodyHeader getHeader() {
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
        private RunHotTopicChatResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        /**
         * header.
         */
        public Builder header(RunHotTopicChatResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunHotTopicChatResponseBody build() {
            return new RunHotTopicChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class RunHotTopicChatResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("eventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private RunHotTopicChatResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.eventInfo = builder.eventInfo;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunHotTopicChatResponseBodyHeader create() {
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
         * @return eventInfo
         */
        public String getEventInfo() {
            return this.eventInfo;
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
            private String eventInfo; 
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * eventInfo.
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
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
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunHotTopicChatResponseBodyHeader build() {
                return new RunHotTopicChatResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("pubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("searchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Articles(Builder builder) {
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSourceName = builder.searchSourceName;
            this.select = builder.select;
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
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        /**
         * @return select
         */
        public Boolean getSelect() {
            return this.select;
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
            private String content; 
            private String pubTime; 
            private Double score; 
            private String searchSourceName; 
            private Boolean select; 
            private String summary; 
            private String title; 
            private String url; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * pubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * searchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
                return this;
            }

            /**
             * select.
             */
            public Builder select(Boolean select) {
                this.select = select;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
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
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Images(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private News(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static News create() {
            return builder().build();
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
            private String title; 
            private String url; 

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public News build() {
                return new News(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class HotTopicSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customHotValue")
        private Double customHotValue;

        @com.aliyun.core.annotation.NameInMap("customTextSummary")
        private String customTextSummary;

        @com.aliyun.core.annotation.NameInMap("hotTopic")
        private String hotTopic;

        @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
        private String hotTopicVersion;

        @com.aliyun.core.annotation.NameInMap("hotValue")
        private Double hotValue;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List < Images> images;

        @com.aliyun.core.annotation.NameInMap("news")
        private java.util.List < News> news;

        @com.aliyun.core.annotation.NameInMap("textSummary")
        private String textSummary;

        private HotTopicSummaries(Builder builder) {
            this.customHotValue = builder.customHotValue;
            this.customTextSummary = builder.customTextSummary;
            this.hotTopic = builder.hotTopic;
            this.hotTopicVersion = builder.hotTopicVersion;
            this.hotValue = builder.hotValue;
            this.images = builder.images;
            this.news = builder.news;
            this.textSummary = builder.textSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotTopicSummaries create() {
            return builder().build();
        }

        /**
         * @return customHotValue
         */
        public Double getCustomHotValue() {
            return this.customHotValue;
        }

        /**
         * @return customTextSummary
         */
        public String getCustomTextSummary() {
            return this.customTextSummary;
        }

        /**
         * @return hotTopic
         */
        public String getHotTopic() {
            return this.hotTopic;
        }

        /**
         * @return hotTopicVersion
         */
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        /**
         * @return hotValue
         */
        public Double getHotValue() {
            return this.hotValue;
        }

        /**
         * @return images
         */
        public java.util.List < Images> getImages() {
            return this.images;
        }

        /**
         * @return news
         */
        public java.util.List < News> getNews() {
            return this.news;
        }

        /**
         * @return textSummary
         */
        public String getTextSummary() {
            return this.textSummary;
        }

        public static final class Builder {
            private Double customHotValue; 
            private String customTextSummary; 
            private String hotTopic; 
            private String hotTopicVersion; 
            private Double hotValue; 
            private java.util.List < Images> images; 
            private java.util.List < News> news; 
            private String textSummary; 

            /**
             * customHotValue.
             */
            public Builder customHotValue(Double customHotValue) {
                this.customHotValue = customHotValue;
                return this;
            }

            /**
             * customTextSummary.
             */
            public Builder customTextSummary(String customTextSummary) {
                this.customTextSummary = customTextSummary;
                return this;
            }

            /**
             * hotTopic.
             */
            public Builder hotTopic(String hotTopic) {
                this.hotTopic = hotTopic;
                return this;
            }

            /**
             * hotTopicVersion.
             */
            public Builder hotTopicVersion(String hotTopicVersion) {
                this.hotTopicVersion = hotTopicVersion;
                return this;
            }

            /**
             * hotValue.
             */
            public Builder hotValue(Double hotValue) {
                this.hotValue = hotValue;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List < Images> images) {
                this.images = images;
                return this;
            }

            /**
             * news.
             */
            public Builder news(java.util.List < News> news) {
                this.news = news;
                return this;
            }

            /**
             * textSummary.
             */
            public Builder textSummary(String textSummary) {
                this.textSummary = textSummary;
                return this;
            }

            public HotTopicSummaries build() {
                return new HotTopicSummaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class MultimodalMedias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("mediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("sortScore")
        private Double sortScore;

        private MultimodalMedias(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaType = builder.mediaType;
            this.sortScore = builder.sortScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMedias create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return sortScore
         */
        public Double getSortScore() {
            return this.sortScore;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaType; 
            private Double sortScore; 

            /**
             * fileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * mediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * sortScore.
             */
            public Builder sortScore(Double sortScore) {
                this.sortScore = sortScore;
                return this;
            }

            public MultimodalMedias build() {
                return new MultimodalMedias(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("articles")
        private java.util.List < Articles> articles;

        @com.aliyun.core.annotation.NameInMap("hotTopicSummaries")
        private java.util.List < HotTopicSummaries> hotTopicSummaries;

        @com.aliyun.core.annotation.NameInMap("multimodalMedias")
        private java.util.List < MultimodalMedias> multimodalMedias;

        @com.aliyun.core.annotation.NameInMap("recommendQueries")
        private java.util.List < String > recommendQueries;

        @com.aliyun.core.annotation.NameInMap("searchQuery")
        private String searchQuery;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Output(Builder builder) {
            this.articles = builder.articles;
            this.hotTopicSummaries = builder.hotTopicSummaries;
            this.multimodalMedias = builder.multimodalMedias;
            this.recommendQueries = builder.recommendQueries;
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
        public java.util.List < Articles> getArticles() {
            return this.articles;
        }

        /**
         * @return hotTopicSummaries
         */
        public java.util.List < HotTopicSummaries> getHotTopicSummaries() {
            return this.hotTopicSummaries;
        }

        /**
         * @return multimodalMedias
         */
        public java.util.List < MultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        /**
         * @return recommendQueries
         */
        public java.util.List < String > getRecommendQueries() {
            return this.recommendQueries;
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
            private java.util.List < Articles> articles; 
            private java.util.List < HotTopicSummaries> hotTopicSummaries; 
            private java.util.List < MultimodalMedias> multimodalMedias; 
            private java.util.List < String > recommendQueries; 
            private String searchQuery; 
            private String text; 

            /**
             * articles.
             */
            public Builder articles(java.util.List < Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * hotTopicSummaries.
             */
            public Builder hotTopicSummaries(java.util.List < HotTopicSummaries> hotTopicSummaries) {
                this.hotTopicSummaries = hotTopicSummaries;
                return this;
            }

            /**
             * multimodalMedias.
             */
            public Builder multimodalMedias(java.util.List < MultimodalMedias> multimodalMedias) {
                this.multimodalMedias = multimodalMedias;
                return this;
            }

            /**
             * recommendQueries.
             */
            public Builder recommendQueries(java.util.List < String > recommendQueries) {
                this.recommendQueries = recommendQueries;
                return this;
            }

            /**
             * searchQuery.
             */
            public Builder searchQuery(String searchQuery) {
                this.searchQuery = searchQuery;
                return this;
            }

            /**
             * text.
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
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
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
    /**
     * 
     * {@link RunHotTopicChatResponseBody} extends {@link TeaModel}
     *
     * <p>RunHotTopicChatResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("usage")
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
             * output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * usage.
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
