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
 * {@link HotNewsRecommendResponseBody} extends {@link TeaModel}
 *
 * <p>HotNewsRecommendResponseBody</p>
 */
public class HotNewsRecommendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private HotNewsRecommendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotNewsRecommendResponseBody create() {
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
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(HotNewsRecommendResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
            this.data = data;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public HotNewsRecommendResponseBody build() {
            return new HotNewsRecommendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotNewsRecommendResponseBody} extends {@link TeaModel}
     *
     * <p>HotNewsRecommendResponseBody</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("imageUrls")
        private java.util.List<String> imageUrls;

        @com.aliyun.core.annotation.NameInMap("pubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("searchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private News(Builder builder) {
            this.content = builder.content;
            this.imageUrls = builder.imageUrls;
            this.pubTime = builder.pubTime;
            this.searchSource = builder.searchSource;
            this.source = builder.source;
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
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return imageUrls
         */
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return searchSource
         */
        public String getSearchSource() {
            return this.searchSource;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
            private java.util.List<String> imageUrls; 
            private String pubTime; 
            private String searchSource; 
            private String source; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(News model) {
                this.content = model.content;
                this.imageUrls = model.imageUrls;
                this.pubTime = model.pubTime;
                this.searchSource = model.searchSource;
                this.source = model.source;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * imageUrls.
             */
            public Builder imageUrls(java.util.List<String> imageUrls) {
                this.imageUrls = imageUrls;
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
             * searchSource.
             */
            public Builder searchSource(String searchSource) {
                this.searchSource = searchSource;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
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

            public News build() {
                return new News(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotNewsRecommendResponseBody} extends {@link TeaModel}
     *
     * <p>HotNewsRecommendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("news")
        private java.util.List<News> news;

        private Data(Builder builder) {
            this.news = builder.news;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return news
         */
        public java.util.List<News> getNews() {
            return this.news;
        }

        public static final class Builder {
            private java.util.List<News> news; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.news = model.news;
            } 

            /**
             * news.
             */
            public Builder news(java.util.List<News> news) {
                this.news = news;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
