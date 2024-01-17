// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotNewsWithTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotNewsWithTypeResponseBody</p>
 */
public class ListHotNewsWithTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListHotNewsWithTypeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotNewsWithTypeResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHotNewsWithTypeResponseBody build() {
            return new ListHotNewsWithTypeResponseBody(this);
        } 

    } 

    public static class News extends TeaModel {
        @NameInMap("Author")
        private String author;

        @NameInMap("Content")
        private String content;

        @NameInMap("DocUuid")
        private String docUuid;

        @NameInMap("ImageUrls")
        private java.util.List < String > imageUrls;

        @NameInMap("PubTime")
        private String pubTime;

        @NameInMap("SearchSource")
        private String searchSource;

        @NameInMap("SearchSourceName")
        private String searchSourceName;

        @NameInMap("Source")
        private String source;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Title")
        private String title;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Url")
        private String url;

        private News(Builder builder) {
            this.author = builder.author;
            this.content = builder.content;
            this.docUuid = builder.docUuid;
            this.imageUrls = builder.imageUrls;
            this.pubTime = builder.pubTime;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.source = builder.source;
            this.summary = builder.summary;
            this.tag = builder.tag;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static News create() {
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
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return imageUrls
         */
        public java.util.List < String > getImageUrls() {
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
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
            private String docUuid; 
            private java.util.List < String > imageUrls; 
            private String pubTime; 
            private String searchSource; 
            private String searchSourceName; 
            private String source; 
            private String summary; 
            private String tag; 
            private String title; 
            private String updateTime; 
            private String url; 

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
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * ImageUrls.
             */
            public Builder imageUrls(java.util.List < String > imageUrls) {
                this.imageUrls = imageUrls;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
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
    public static class Data extends TeaModel {
        @NameInMap("News")
        private java.util.List < News> news;

        @NameInMap("NewsType")
        private String newsType;

        @NameInMap("NewsTypeName")
        private String newsTypeName;

        @NameInMap("TotalPages")
        private Integer totalPages;

        private Data(Builder builder) {
            this.news = builder.news;
            this.newsType = builder.newsType;
            this.newsTypeName = builder.newsTypeName;
            this.totalPages = builder.totalPages;
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
        public java.util.List < News> getNews() {
            return this.news;
        }

        /**
         * @return newsType
         */
        public String getNewsType() {
            return this.newsType;
        }

        /**
         * @return newsTypeName
         */
        public String getNewsTypeName() {
            return this.newsTypeName;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List < News> news; 
            private String newsType; 
            private String newsTypeName; 
            private Integer totalPages; 

            /**
             * News.
             */
            public Builder news(java.util.List < News> news) {
                this.news = news;
                return this;
            }

            /**
             * NewsType.
             */
            public Builder newsType(String newsType) {
                this.newsType = newsType;
                return this;
            }

            /**
             * NewsTypeName.
             */
            public Builder newsTypeName(String newsTypeName) {
                this.newsTypeName = newsTypeName;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
