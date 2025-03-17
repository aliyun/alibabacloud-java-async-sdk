// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotTopicSummariesResponseBody</p>
 */
public class ListHotTopicSummariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListHotTopicSummariesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotTopicSummariesResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHotTopicSummariesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHotTopicSummariesResponseBody build() {
            return new ListHotTopicSummariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotTopicSummariesResponseBody</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Comments(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(Comments model) {
                this.text = model.text;
            } 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotTopicSummariesResponseBody</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comments")
        private java.util.List<Comments> comments;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("pubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private News(Builder builder) {
            this.comments = builder.comments;
            this.content = builder.content;
            this.pubTime = builder.pubTime;
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
         * @return comments
         */
        public java.util.List<Comments> getComments() {
            return this.comments;
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
            private java.util.List<Comments> comments; 
            private String content; 
            private String pubTime; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(News model) {
                this.comments = model.comments;
                this.content = model.content;
                this.pubTime = model.pubTime;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * comments.
             */
            public Builder comments(java.util.List<Comments> comments) {
                this.comments = comments;
                return this;
            }

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
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>url</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
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
     * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotTopicSummariesResponseBody</p>
     */
    public static class Summaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Summaries(Builder builder) {
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summaries create() {
            return builder().build();
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

        public static final class Builder {
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Summaries model) {
                this.summary = model.summary;
                this.title = model.title;
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

            public Summaries build() {
                return new Summaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotTopicSummariesResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summaries")
        private java.util.List<Summaries> summaries;

        private Summary(Builder builder) {
            this.summaries = builder.summaries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return summaries
         */
        public java.util.List<Summaries> getSummaries() {
            return this.summaries;
        }

        public static final class Builder {
            private java.util.List<Summaries> summaries; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.summaries = model.summaries;
            } 

            /**
             * summaries.
             */
            public Builder summaries(java.util.List<Summaries> summaries) {
                this.summaries = summaries;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotTopicSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotTopicSummariesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("hotTopic")
        private String hotTopic;

        @com.aliyun.core.annotation.NameInMap("hotTopicVersion")
        private String hotTopicVersion;

        @com.aliyun.core.annotation.NameInMap("hotValue")
        private Double hotValue;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("news")
        private java.util.List<News> news;

        @com.aliyun.core.annotation.NameInMap("summary")
        private Summary summary;

        @com.aliyun.core.annotation.NameInMap("textSummary")
        private String textSummary;

        private Data(Builder builder) {
            this.category = builder.category;
            this.hotTopic = builder.hotTopic;
            this.hotTopicVersion = builder.hotTopicVersion;
            this.hotValue = builder.hotValue;
            this.id = builder.id;
            this.news = builder.news;
            this.summary = builder.summary;
            this.textSummary = builder.textSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return news
         */
        public java.util.List<News> getNews() {
            return this.news;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        /**
         * @return textSummary
         */
        public String getTextSummary() {
            return this.textSummary;
        }

        public static final class Builder {
            private String category; 
            private String hotTopic; 
            private String hotTopicVersion; 
            private Double hotValue; 
            private String id; 
            private java.util.List<News> news; 
            private Summary summary; 
            private String textSummary; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.category = model.category;
                this.hotTopic = model.hotTopic;
                this.hotTopicVersion = model.hotTopicVersion;
                this.hotValue = model.hotValue;
                this.id = model.id;
                this.news = model.news;
                this.summary = model.summary;
                this.textSummary = model.textSummary;
            } 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * news.
             */
            public Builder news(java.util.List<News> news) {
                this.news = news;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            /**
             * textSummary.
             */
            public Builder textSummary(String textSummary) {
                this.textSummary = textSummary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
