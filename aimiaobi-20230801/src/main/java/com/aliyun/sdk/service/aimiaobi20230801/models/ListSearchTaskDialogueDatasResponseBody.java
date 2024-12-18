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
 * {@link ListSearchTaskDialogueDatasResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchTaskDialogueDatasResponseBody</p>
 */
public class ListSearchTaskDialogueDatasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Articles")
    private java.util.List<Articles> articles;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RealtimeSearch")
    private Boolean realtimeSearch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchType")
    private String searchType;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Videos")
    private java.util.List<Videos> videos;

    private ListSearchTaskDialogueDatasResponseBody(Builder builder) {
        this.articles = builder.articles;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.images = builder.images;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.realtimeSearch = builder.realtimeSearch;
        this.requestId = builder.requestId;
        this.searchType = builder.searchType;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.videos = builder.videos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchTaskDialogueDatasResponseBody create() {
        return builder().build();
    }

    /**
     * @return articles
     */
    public java.util.List<Articles> getArticles() {
        return this.articles;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
        return this.images;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return realtimeSearch
     */
    public Boolean getRealtimeSearch() {
        return this.realtimeSearch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
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

    /**
     * @return videos
     */
    public java.util.List<Videos> getVideos() {
        return this.videos;
    }

    public static final class Builder {
        private java.util.List<Articles> articles; 
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Images> images; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean realtimeSearch; 
        private String requestId; 
        private String searchType; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List<Videos> videos; 

        /**
         * Articles.
         */
        public Builder articles(java.util.List<Articles> articles) {
            this.articles = articles;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Images.
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RealtimeSearch.
         */
        public Builder realtimeSearch(Boolean realtimeSearch) {
            this.realtimeSearch = realtimeSearch;
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
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.searchType = searchType;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Videos.
         */
        public Builder videos(java.util.List<Videos> videos) {
            this.videos = videos;
            return this;
        }

        public ListSearchTaskDialogueDatasResponseBody build() {
            return new ListSearchTaskDialogueDatasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchTaskDialogueDatasResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialogueDatasResponseBody</p>
     */
    public static class MultimodalMedias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MultimodalMedias(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public MultimodalMedias build() {
                return new MultimodalMedias(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchTaskDialogueDatasResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialogueDatasResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("CategoryUuid")
        private String categoryUuid;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("MultimodalMedias")
        private java.util.List<MultimodalMedias> multimodalMedias;

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
            this.categoryUuid = builder.categoryUuid;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docType = builder.docType;
            this.docUuid = builder.docUuid;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.multimodalMedias = builder.multimodalMedias;
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
         * @return categoryUuid
         */
        public String getCategoryUuid() {
            return this.categoryUuid;
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
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return multimodalMedias
         */
        public java.util.List<MultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
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
            private String categoryUuid; 
            private String content; 
            private String docId; 
            private String docType; 
            private String docUuid; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private java.util.List<MultimodalMedias> multimodalMedias; 
            private String pubTime; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * CategoryUuid.
             */
            public Builder categoryUuid(String categoryUuid) {
                this.categoryUuid = categoryUuid;
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
             * DocType.
             */
            public Builder docType(String docType) {
                this.docType = docType;
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
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * MultimodalMedias.
             */
            public Builder multimodalMedias(java.util.List<MultimodalMedias> multimodalMedias) {
                this.multimodalMedias = multimodalMedias;
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
     * {@link ListSearchTaskDialogueDatasResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialogueDatasResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private Images(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchTaskDialogueDatasResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialogueDatasResponseBody</p>
     */
    public static class Videos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private Videos(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Videos create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public Videos build() {
                return new Videos(this);
            } 

        } 

    }
}
