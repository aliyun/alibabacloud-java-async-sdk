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
 * {@link GenerateTraceability} extends {@link TeaModel}
 *
 * <p>GenerateTraceability</p>
 */
public class GenerateTraceability extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("News")
    private java.util.List<News> news;

    private GenerateTraceability(Builder builder) {
        this.news = builder.news;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTraceability create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(GenerateTraceability model) {
            this.news = model.news;
        } 

        /**
         * News.
         */
        public Builder news(java.util.List<News> news) {
            this.news = news;
            return this;
        }

        public GenerateTraceability build() {
            return new GenerateTraceability(this);
        } 

    } 

    /**
     * 
     * {@link GenerateTraceability} extends {@link TeaModel}
     *
     * <p>GenerateTraceability</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private News(Builder builder) {
            this.index = builder.index;
            this.pubTime = builder.pubTime;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
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
         * @return index
         */
        public Integer getIndex() {
            return this.index;
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private Integer index; 
            private String pubTime; 
            private String searchSource; 
            private String searchSourceName; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(News model) {
                this.index = model.index;
                this.pubTime = model.pubTime;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * SearchSource.
             */
            public Builder searchSource(String searchSource) {
                this.searchSource = searchSource;
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

            public News build() {
                return new News(this);
            } 

        } 

    }
}
