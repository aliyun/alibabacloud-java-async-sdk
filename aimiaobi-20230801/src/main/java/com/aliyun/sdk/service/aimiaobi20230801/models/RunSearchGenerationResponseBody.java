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
 * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunSearchGenerationResponseBody</p>
 */
public class RunSearchGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunSearchGenerationResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunSearchGenerationResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchGenerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunSearchGenerationResponseBodyHeader getHeader() {
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
        private RunSearchGenerationResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunSearchGenerationResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * Header.
         */
        public Builder header(RunSearchGenerationResponseBodyHeader header) {
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

        public RunSearchGenerationResponseBody build() {
            return new RunSearchGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class RunSearchGenerationResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("OriginSessionId")
        private String originSessionId;

        @com.aliyun.core.annotation.NameInMap("ResponseTime")
        private Long responseTime;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunSearchGenerationResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.eventInfo = builder.eventInfo;
            this.originSessionId = builder.originSessionId;
            this.responseTime = builder.responseTime;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunSearchGenerationResponseBodyHeader create() {
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
         * @return originSessionId
         */
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        /**
         * @return responseTime
         */
        public Long getResponseTime() {
            return this.responseTime;
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
            private String originSessionId; 
            private Long responseTime; 
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunSearchGenerationResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.eventInfo = model.eventInfo;
                this.originSessionId = model.originSessionId;
                this.responseTime = model.responseTime;
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
             * EventInfo.
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
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
             * ResponseTime.
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
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

            public RunSearchGenerationResponseBodyHeader build() {
                return new RunSearchGenerationResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Article extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Article(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Article create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Article model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public Article build() {
                return new Article(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(ClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ClipInfos build() {
                return new ClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class SearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private Article article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<ClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private String traceabilityId;

        private SearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.traceabilityId = builder.traceabilityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public Article getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<ClipInfos> getClipInfos() {
            return this.clipInfos;
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
         * @return traceabilityId
         */
        public String getTraceabilityId() {
            return this.traceabilityId;
        }

        public static final class Builder {
            private Article article; 
            private java.util.List<ClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 
            private String traceabilityId; 

            private Builder() {
            } 

            private Builder(SearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.traceabilityId = model.traceabilityId;
            } 

            /**
             * Article.
             */
            public Builder article(Article article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<ClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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
             * TraceabilityId.
             */
            public Builder traceabilityId(String traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            public SearchResult build() {
                return new SearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class AudioSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<SearchResult> searchResult;

        private AudioSearchResult(Builder builder) {
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioSearchResult create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<SearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private java.util.List<SearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(AudioSearchResult model) {
                this.searchResult = model.searchResult;
            } 

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<SearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public AudioSearchResult build() {
                return new AudioSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class SearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(SearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public SearchResultArticle build() {
                return new SearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class SearchResultClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SearchResultClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResultClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(SearchResultClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SearchResultClipInfos build() {
                return new SearchResultClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class AudioSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private SearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<SearchResultClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private AudioSearchResultSearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioSearchResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public SearchResultArticle getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<SearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
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

        public static final class Builder {
            private SearchResultArticle article; 
            private java.util.List<SearchResultClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(AudioSearchResultSearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
            } 

            /**
             * Article.
             */
            public Builder article(SearchResultArticle article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<SearchResultClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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

            public AudioSearchResultSearchResult build() {
                return new AudioSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ClusterTopicsAudioSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private AudioSearchResultSearchResult searchResult;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private ClusterTopicsAudioSearchResult(Builder builder) {
            this.current = builder.current;
            this.searchResult = builder.searchResult;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTopicsAudioSearchResult create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchResult
         */
        public AudioSearchResultSearchResult getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private AudioSearchResultSearchResult searchResult; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(ClusterTopicsAudioSearchResult model) {
                this.current = model.current;
                this.searchResult = model.searchResult;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(AudioSearchResultSearchResult searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public ClusterTopicsAudioSearchResult build() {
                return new ClusterTopicsAudioSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ImageSearchResultSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ImageSearchResultSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSearchResultSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageSearchResultSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public ImageSearchResultSearchResultArticle build() {
                return new ImageSearchResultSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ImageSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private ImageSearchResultSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private ImageSearchResultSearchResult(Builder builder) {
            this.article = builder.article;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSearchResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public ImageSearchResultSearchResultArticle getArticle() {
            return this.article;
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

        public static final class Builder {
            private ImageSearchResultSearchResultArticle article; 
            private String fileUrl; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(ImageSearchResultSearchResult model) {
                this.article = model.article;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
            } 

            /**
             * Article.
             */
            public Builder article(ImageSearchResultSearchResultArticle article) {
                this.article = article;
                return this;
            }

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

            public ImageSearchResultSearchResult build() {
                return new ImageSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ImageSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<ImageSearchResultSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private ImageSearchResult(Builder builder) {
            this.current = builder.current;
            this.searchResult = builder.searchResult;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSearchResult create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchResult
         */
        public java.util.List<ImageSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List<ImageSearchResultSearchResult> searchResult; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(ImageSearchResult model) {
                this.current = model.current;
                this.searchResult = model.searchResult;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<ImageSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public ImageSearchResult build() {
                return new ImageSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MultimodalMedias model) {
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

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
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("MultimodalMedias")
        private java.util.List<MultimodalMedias> multimodalMedias;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TextSearchResultSearchResult(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.multimodalMedias = builder.multimodalMedias;
            this.pubTime = builder.pubTime;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextSearchResultSearchResult create() {
            return builder().build();
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
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
            private String docId; 
            private String docUuid; 
            private java.util.List<MultimodalMedias> multimodalMedias; 
            private String pubTime; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(TextSearchResultSearchResult model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.multimodalMedias = model.multimodalMedias;
                this.pubTime = model.pubTime;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
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

            public TextSearchResultSearchResult build() {
                return new TextSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<TextSearchResultSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private TextSearchResult(Builder builder) {
            this.current = builder.current;
            this.searchResult = builder.searchResult;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextSearchResult create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchResult
         */
        public java.util.List<TextSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List<TextSearchResultSearchResult> searchResult; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(TextSearchResult model) {
                this.current = model.current;
                this.searchResult = model.searchResult;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<TextSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public TextSearchResult build() {
                return new TextSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class VideoSearchResultSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private VideoSearchResultSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSearchResultSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(VideoSearchResultSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public VideoSearchResultSearchResultArticle build() {
                return new VideoSearchResultSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class VideoSearchResultSearchResultClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private VideoSearchResultSearchResultClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSearchResultSearchResultClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(VideoSearchResultSearchResultClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VideoSearchResultSearchResultClipInfos build() {
                return new VideoSearchResultSearchResultClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class VideoSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private VideoSearchResultSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<VideoSearchResultSearchResultClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private VideoSearchResultSearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSearchResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public VideoSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<VideoSearchResultSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
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

        public static final class Builder {
            private VideoSearchResultSearchResultArticle article; 
            private java.util.List<VideoSearchResultSearchResultClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(VideoSearchResultSearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
            } 

            /**
             * Article.
             */
            public Builder article(VideoSearchResultSearchResultArticle article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<VideoSearchResultSearchResultClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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

            public VideoSearchResultSearchResult build() {
                return new VideoSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class VideoSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<VideoSearchResultSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private VideoSearchResult(Builder builder) {
            this.current = builder.current;
            this.searchResult = builder.searchResult;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSearchResult create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchResult
         */
        public java.util.List<VideoSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List<VideoSearchResultSearchResult> searchResult; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(VideoSearchResult model) {
                this.current = model.current;
                this.searchResult = model.searchResult;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<VideoSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public VideoSearchResult build() {
                return new VideoSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ClusterTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSearchResult")
        private ClusterTopicsAudioSearchResult audioSearchResult;

        @com.aliyun.core.annotation.NameInMap("ImageSearchResult")
        private ImageSearchResult imageSearchResult;

        @com.aliyun.core.annotation.NameInMap("TextSearchResult")
        private TextSearchResult textSearchResult;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VideoSearchResult")
        private VideoSearchResult videoSearchResult;

        private ClusterTopics(Builder builder) {
            this.audioSearchResult = builder.audioSearchResult;
            this.imageSearchResult = builder.imageSearchResult;
            this.textSearchResult = builder.textSearchResult;
            this.topic = builder.topic;
            this.videoSearchResult = builder.videoSearchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTopics create() {
            return builder().build();
        }

        /**
         * @return audioSearchResult
         */
        public ClusterTopicsAudioSearchResult getAudioSearchResult() {
            return this.audioSearchResult;
        }

        /**
         * @return imageSearchResult
         */
        public ImageSearchResult getImageSearchResult() {
            return this.imageSearchResult;
        }

        /**
         * @return textSearchResult
         */
        public TextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return videoSearchResult
         */
        public VideoSearchResult getVideoSearchResult() {
            return this.videoSearchResult;
        }

        public static final class Builder {
            private ClusterTopicsAudioSearchResult audioSearchResult; 
            private ImageSearchResult imageSearchResult; 
            private TextSearchResult textSearchResult; 
            private String topic; 
            private VideoSearchResult videoSearchResult; 

            private Builder() {
            } 

            private Builder(ClusterTopics model) {
                this.audioSearchResult = model.audioSearchResult;
                this.imageSearchResult = model.imageSearchResult;
                this.textSearchResult = model.textSearchResult;
                this.topic = model.topic;
                this.videoSearchResult = model.videoSearchResult;
            } 

            /**
             * AudioSearchResult.
             */
            public Builder audioSearchResult(ClusterTopicsAudioSearchResult audioSearchResult) {
                this.audioSearchResult = audioSearchResult;
                return this;
            }

            /**
             * ImageSearchResult.
             */
            public Builder imageSearchResult(ImageSearchResult imageSearchResult) {
                this.imageSearchResult = imageSearchResult;
                return this;
            }

            /**
             * TextSearchResult.
             */
            public Builder textSearchResult(TextSearchResult textSearchResult) {
                this.textSearchResult = textSearchResult;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * VideoSearchResult.
             */
            public Builder videoSearchResult(VideoSearchResult videoSearchResult) {
                this.videoSearchResult = videoSearchResult;
                return this;
            }

            public ClusterTopics build() {
                return new ClusterTopics(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ClusterTopicResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterTopics")
        private java.util.List<ClusterTopics> clusterTopics;

        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        private ClusterTopicResult(Builder builder) {
            this.clusterTopics = builder.clusterTopics;
            this.generateFinished = builder.generateFinished;
            this.textGenerate = builder.textGenerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTopicResult create() {
            return builder().build();
        }

        /**
         * @return clusterTopics
         */
        public java.util.List<ClusterTopics> getClusterTopics() {
            return this.clusterTopics;
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public static final class Builder {
            private java.util.List<ClusterTopics> clusterTopics; 
            private Boolean generateFinished; 
            private String textGenerate; 

            private Builder() {
            } 

            private Builder(ClusterTopicResult model) {
                this.clusterTopics = model.clusterTopics;
                this.generateFinished = model.generateFinished;
                this.textGenerate = model.textGenerate;
            } 

            /**
             * ClusterTopics.
             */
            public Builder clusterTopics(java.util.List<ClusterTopics> clusterTopics) {
                this.clusterTopics = clusterTopics;
                return this;
            }

            /**
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            public ClusterTopicResult build() {
                return new ClusterTopicResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class SearchResultMultimodalMedias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private SearchResultMultimodalMedias(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResultMultimodalMedias create() {
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

            private Builder() {
            } 

            private Builder(SearchResultMultimodalMedias model) {
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

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

            public SearchResultMultimodalMedias build() {
                return new SearchResultMultimodalMedias(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalMediaListArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private MultimodalMediaListArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMediaListArticle create() {
            return builder().build();
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(MultimodalMediaListArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.title = model.title;
                this.url = model.url;
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

            public MultimodalMediaListArticle build() {
                return new MultimodalMediaListArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private MultimodalMediaListArticle article;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MultimodalMediaList(Builder builder) {
            this.article = builder.article;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public MultimodalMediaListArticle getArticle() {
            return this.article;
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
            private MultimodalMediaListArticle article; 
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(MultimodalMediaList model) {
                this.article = model.article;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * Article.
             */
            public Builder article(MultimodalMediaListArticle article) {
                this.article = article;
                return this;
            }

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

            public MultimodalMediaList build() {
                return new MultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextGenerateMultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("MultimodalMediaList")
        private java.util.List<MultimodalMediaList> multimodalMediaList;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Integer start;

        private TextGenerateMultimodalMediaList(Builder builder) {
            this.docUuid = builder.docUuid;
            this.end = builder.end;
            this.multimodalMediaList = builder.multimodalMediaList;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextGenerateMultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return multimodalMediaList
         */
        public java.util.List<MultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        public static final class Builder {
            private String docUuid; 
            private Integer end; 
            private java.util.List<MultimodalMediaList> multimodalMediaList; 
            private Integer start; 

            private Builder() {
            } 

            private Builder(TextGenerateMultimodalMediaList model) {
                this.docUuid = model.docUuid;
                this.end = model.end;
                this.multimodalMediaList = model.multimodalMediaList;
                this.start = model.start;
            } 

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * MultimodalMediaList.
             */
            public Builder multimodalMediaList(java.util.List<MultimodalMediaList> multimodalMediaList) {
                this.multimodalMediaList = multimodalMediaList;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            public TextGenerateMultimodalMediaList build() {
                return new TextGenerateMultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ExcerptResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunks")
        private java.util.List<String> chunks;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Excerpt")
        private String excerpt;

        @com.aliyun.core.annotation.NameInMap("MultimodalMedias")
        private java.util.List<SearchResultMultimodalMedias> multimodalMedias;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TextGenerateMultimodalMediaList")
        private java.util.List<TextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private Integer traceabilityId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ExcerptResultSearchResult(Builder builder) {
            this.chunks = builder.chunks;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.excerpt = builder.excerpt;
            this.multimodalMedias = builder.multimodalMedias;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.select = builder.select;
            this.summary = builder.summary;
            this.textGenerateMultimodalMediaList = builder.textGenerateMultimodalMediaList;
            this.title = builder.title;
            this.traceabilityId = builder.traceabilityId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcerptResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<String> getChunks() {
            return this.chunks;
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
         * @return excerpt
         */
        public String getExcerpt() {
            return this.excerpt;
        }

        /**
         * @return multimodalMedias
         */
        public java.util.List<SearchResultMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
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
        public Float getScore() {
            return this.score;
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
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
         * @return textGenerateMultimodalMediaList
         */
        public java.util.List<TextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return traceabilityId
         */
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<String> chunks; 
            private String content; 
            private String docId; 
            private String docUuid; 
            private String excerpt; 
            private java.util.List<SearchResultMultimodalMedias> multimodalMedias; 
            private String pubTime; 
            private Float score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private Boolean select; 
            private String summary; 
            private java.util.List<TextGenerateMultimodalMediaList> textGenerateMultimodalMediaList; 
            private String title; 
            private Integer traceabilityId; 
            private String url; 

            private Builder() {
            } 

            private Builder(ExcerptResultSearchResult model) {
                this.chunks = model.chunks;
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.excerpt = model.excerpt;
                this.multimodalMedias = model.multimodalMedias;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.select = model.select;
                this.summary = model.summary;
                this.textGenerateMultimodalMediaList = model.textGenerateMultimodalMediaList;
                this.title = model.title;
                this.traceabilityId = model.traceabilityId;
                this.url = model.url;
            } 

            /**
             * Chunks.
             */
            public Builder chunks(java.util.List<String> chunks) {
                this.chunks = chunks;
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
             * Excerpt.
             */
            public Builder excerpt(String excerpt) {
                this.excerpt = excerpt;
                return this;
            }

            /**
             * MultimodalMedias.
             */
            public Builder multimodalMedias(java.util.List<SearchResultMultimodalMedias> multimodalMedias) {
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
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
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
             * TextGenerateMultimodalMediaList.
             */
            public Builder textGenerateMultimodalMediaList(java.util.List<TextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
                this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
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
             * TraceabilityId.
             */
            public Builder traceabilityId(Integer traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ExcerptResultSearchResult build() {
                return new ExcerptResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ExcerptResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("GenerateLevel")
        private String generateLevel;

        @com.aliyun.core.annotation.NameInMap("ReasonTextGenerate")
        private String reasonTextGenerate;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<ExcerptResultSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        private ExcerptResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.generateLevel = builder.generateLevel;
            this.reasonTextGenerate = builder.reasonTextGenerate;
            this.searchResult = builder.searchResult;
            this.textGenerate = builder.textGenerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcerptResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return generateLevel
         */
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        /**
         * @return reasonTextGenerate
         */
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        /**
         * @return searchResult
         */
        public java.util.List<ExcerptResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String generateLevel; 
            private String reasonTextGenerate; 
            private java.util.List<ExcerptResultSearchResult> searchResult; 
            private String textGenerate; 

            private Builder() {
            } 

            private Builder(ExcerptResult model) {
                this.generateFinished = model.generateFinished;
                this.generateLevel = model.generateLevel;
                this.reasonTextGenerate = model.reasonTextGenerate;
                this.searchResult = model.searchResult;
                this.textGenerate = model.textGenerate;
            } 

            /**
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * GenerateLevel.
             */
            public Builder generateLevel(String generateLevel) {
                this.generateLevel = generateLevel;
                return this;
            }

            /**
             * ReasonTextGenerate.
             */
            public Builder reasonTextGenerate(String reasonTextGenerate) {
                this.reasonTextGenerate = reasonTextGenerate;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<ExcerptResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            public ExcerptResult build() {
                return new ExcerptResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentImageSearchResultSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private GeneratedContentImageSearchResultSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentImageSearchResultSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(GeneratedContentImageSearchResultSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public GeneratedContentImageSearchResultSearchResultArticle build() {
                return new GeneratedContentImageSearchResultSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentImageSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private GeneratedContentImageSearchResultSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private String traceabilityId;

        private GeneratedContentImageSearchResultSearchResult(Builder builder) {
            this.article = builder.article;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.traceabilityId = builder.traceabilityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentImageSearchResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public GeneratedContentImageSearchResultSearchResultArticle getArticle() {
            return this.article;
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
         * @return traceabilityId
         */
        public String getTraceabilityId() {
            return this.traceabilityId;
        }

        public static final class Builder {
            private GeneratedContentImageSearchResultSearchResultArticle article; 
            private String fileUrl; 
            private String mediaId; 
            private String traceabilityId; 

            private Builder() {
            } 

            private Builder(GeneratedContentImageSearchResultSearchResult model) {
                this.article = model.article;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.traceabilityId = model.traceabilityId;
            } 

            /**
             * Article.
             */
            public Builder article(GeneratedContentImageSearchResultSearchResultArticle article) {
                this.article = article;
                return this;
            }

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
             * TraceabilityId.
             */
            public Builder traceabilityId(String traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            public GeneratedContentImageSearchResultSearchResult build() {
                return new GeneratedContentImageSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentImageSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<GeneratedContentImageSearchResultSearchResult> searchResult;

        private GeneratedContentImageSearchResult(Builder builder) {
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentImageSearchResult create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<GeneratedContentImageSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private java.util.List<GeneratedContentImageSearchResultSearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(GeneratedContentImageSearchResult model) {
                this.searchResult = model.searchResult;
            } 

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<GeneratedContentImageSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public GeneratedContentImageSearchResult build() {
                return new GeneratedContentImageSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class NewsElementArticleListArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private NewsElementArticleListArticle(Builder builder) {
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.select = builder.select;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsElementArticleListArticle create() {
            return builder().build();
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
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
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
            private String docId; 
            private String docUuid; 
            private String pubTime; 
            private Float score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private Boolean select; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(NewsElementArticleListArticle model) {
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.select = model.select;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
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

            public NewsElementArticleListArticle build() {
                return new NewsElementArticleListArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CauseList")
        private java.util.List<String> causeList;

        @com.aliyun.core.annotation.NameInMap("ProcessList")
        private java.util.List<String> processList;

        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List<String> resultList;

        private Event(Builder builder) {
            this.causeList = builder.causeList;
            this.processList = builder.processList;
            this.resultList = builder.resultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return causeList
         */
        public java.util.List<String> getCauseList() {
            return this.causeList;
        }

        /**
         * @return processList
         */
        public java.util.List<String> getProcessList() {
            return this.processList;
        }

        /**
         * @return resultList
         */
        public java.util.List<String> getResultList() {
            return this.resultList;
        }

        public static final class Builder {
            private java.util.List<String> causeList; 
            private java.util.List<String> processList; 
            private java.util.List<String> resultList; 

            private Builder() {
            } 

            private Builder(Event model) {
                this.causeList = model.causeList;
                this.processList = model.processList;
                this.resultList = model.resultList;
            } 

            /**
             * CauseList.
             */
            public Builder causeList(java.util.List<String> causeList) {
                this.causeList = causeList;
                return this;
            }

            /**
             * ProcessList.
             */
            public Builder processList(java.util.List<String> processList) {
                this.processList = processList;
                return this;
            }

            /**
             * ResultList.
             */
            public Builder resultList(java.util.List<String> resultList) {
                this.resultList = resultList;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class NewsElementList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private Event event;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("People")
        private String people;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private NewsElementList(Builder builder) {
            this.event = builder.event;
            this.location = builder.location;
            this.people = builder.people;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsElementList create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public Event getEvent() {
            return this.event;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return people
         */
        public String getPeople() {
            return this.people;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Event event; 
            private String location; 
            private String people; 
            private String time; 

            private Builder() {
            } 

            private Builder(NewsElementList model) {
                this.event = model.event;
                this.location = model.location;
                this.people = model.people;
                this.time = model.time;
            } 

            /**
             * Event.
             */
            public Builder event(Event event) {
                this.event = event;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * People.
             */
            public Builder people(String people) {
                this.people = people;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public NewsElementList build() {
                return new NewsElementList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class NewsElementArticleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private NewsElementArticleListArticle article;

        @com.aliyun.core.annotation.NameInMap("NewsElementList")
        private java.util.List<NewsElementList> newsElementList;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        private NewsElementArticleList(Builder builder) {
            this.article = builder.article;
            this.newsElementList = builder.newsElementList;
            this.textGenerate = builder.textGenerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsElementArticleList create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public NewsElementArticleListArticle getArticle() {
            return this.article;
        }

        /**
         * @return newsElementList
         */
        public java.util.List<NewsElementList> getNewsElementList() {
            return this.newsElementList;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public static final class Builder {
            private NewsElementArticleListArticle article; 
            private java.util.List<NewsElementList> newsElementList; 
            private String textGenerate; 

            private Builder() {
            } 

            private Builder(NewsElementArticleList model) {
                this.article = model.article;
                this.newsElementList = model.newsElementList;
                this.textGenerate = model.textGenerate;
            } 

            /**
             * Article.
             */
            public Builder article(NewsElementArticleListArticle article) {
                this.article = article;
                return this;
            }

            /**
             * NewsElementList.
             */
            public Builder newsElementList(java.util.List<NewsElementList> newsElementList) {
                this.newsElementList = newsElementList;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            public NewsElementArticleList build() {
                return new NewsElementArticleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class NewsElementResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("NewsElementArticleList")
        private java.util.List<NewsElementArticleList> newsElementArticleList;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        private NewsElementResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.newsElementArticleList = builder.newsElementArticleList;
            this.textGenerate = builder.textGenerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsElementResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return newsElementArticleList
         */
        public java.util.List<NewsElementArticleList> getNewsElementArticleList() {
            return this.newsElementArticleList;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private java.util.List<NewsElementArticleList> newsElementArticleList; 
            private String textGenerate; 

            private Builder() {
            } 

            private Builder(NewsElementResult model) {
                this.generateFinished = model.generateFinished;
                this.newsElementArticleList = model.newsElementArticleList;
                this.textGenerate = model.textGenerate;
            } 

            /**
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * NewsElementArticleList.
             */
            public Builder newsElementArticleList(java.util.List<NewsElementArticleList> newsElementArticleList) {
                this.newsElementArticleList = newsElementArticleList;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            public NewsElementResult build() {
                return new NewsElementResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GenerateCoordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private Integer z;

        private GenerateCoordinate(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenerateCoordinate create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public Integer getZ() {
            return this.z;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 
            private Integer z; 

            private Builder() {
            } 

            private Builder(GenerateCoordinate model) {
                this.x = model.x;
                this.y = model.y;
                this.z = model.z;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(Integer z) {
                this.z = z;
                return this;
            }

            public GenerateCoordinate build() {
                return new GenerateCoordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class NewsCoordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private Integer z;

        private NewsCoordinate(Builder builder) {
            this.mediaType = builder.mediaType;
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewsCoordinate create() {
            return builder().build();
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public Integer getZ() {
            return this.z;
        }

        public static final class Builder {
            private String mediaType; 
            private Integer x; 
            private Integer y; 
            private Integer z; 

            private Builder() {
            } 

            private Builder(NewsCoordinate model) {
                this.mediaType = model.mediaType;
                this.x = model.x;
                this.y = model.y;
                this.z = model.z;
            } 

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(Integer z) {
                this.z = z;
                return this;
            }

            public NewsCoordinate build() {
                return new NewsCoordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Coordinates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateCoordinate")
        private GenerateCoordinate generateCoordinate;

        @com.aliyun.core.annotation.NameInMap("NewsCoordinate")
        private NewsCoordinate newsCoordinate;

        private Coordinates(Builder builder) {
            this.generateCoordinate = builder.generateCoordinate;
            this.newsCoordinate = builder.newsCoordinate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coordinates create() {
            return builder().build();
        }

        /**
         * @return generateCoordinate
         */
        public GenerateCoordinate getGenerateCoordinate() {
            return this.generateCoordinate;
        }

        /**
         * @return newsCoordinate
         */
        public NewsCoordinate getNewsCoordinate() {
            return this.newsCoordinate;
        }

        public static final class Builder {
            private GenerateCoordinate generateCoordinate; 
            private NewsCoordinate newsCoordinate; 

            private Builder() {
            } 

            private Builder(Coordinates model) {
                this.generateCoordinate = model.generateCoordinate;
                this.newsCoordinate = model.newsCoordinate;
            } 

            /**
             * GenerateCoordinate.
             */
            public Builder generateCoordinate(GenerateCoordinate generateCoordinate) {
                this.generateCoordinate = generateCoordinate;
                return this;
            }

            /**
             * NewsCoordinate.
             */
            public Builder newsCoordinate(NewsCoordinate newsCoordinate) {
                this.newsCoordinate = newsCoordinate;
                return this;
            }

            public Coordinates build() {
                return new Coordinates(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GenerateTraceability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coordinates")
        private java.util.List<Coordinates> coordinates;

        @com.aliyun.core.annotation.NameInMap("Duplicate")
        private Double duplicate;

        private GenerateTraceability(Builder builder) {
            this.coordinates = builder.coordinates;
            this.duplicate = builder.duplicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenerateTraceability create() {
            return builder().build();
        }

        /**
         * @return coordinates
         */
        public java.util.List<Coordinates> getCoordinates() {
            return this.coordinates;
        }

        /**
         * @return duplicate
         */
        public Double getDuplicate() {
            return this.duplicate;
        }

        public static final class Builder {
            private java.util.List<Coordinates> coordinates; 
            private Double duplicate; 

            private Builder() {
            } 

            private Builder(GenerateTraceability model) {
                this.coordinates = model.coordinates;
                this.duplicate = model.duplicate;
            } 

            /**
             * Coordinates.
             */
            public Builder coordinates(java.util.List<Coordinates> coordinates) {
                this.coordinates = coordinates;
                return this;
            }

            /**
             * Duplicate.
             */
            public Builder duplicate(Double duplicate) {
                this.duplicate = duplicate;
                return this;
            }

            public GenerateTraceability build() {
                return new GenerateTraceability(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalSearchResultListSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private MultimodalSearchResultListSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalSearchResultListSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(MultimodalSearchResultListSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public MultimodalSearchResultListSearchResultArticle build() {
                return new MultimodalSearchResultListSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalSearchResultListSearchResultClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MultimodalSearchResultListSearchResultClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalSearchResultListSearchResultClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(MultimodalSearchResultListSearchResultClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MultimodalSearchResultListSearchResultClipInfos build() {
                return new MultimodalSearchResultListSearchResultClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalSearchResultListSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private MultimodalSearchResultListSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<MultimodalSearchResultListSearchResultClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MultimodalSearchResultListSearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalSearchResultListSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public MultimodalSearchResultListSearchResultArticle getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<MultimodalSearchResultListSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
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
            private MultimodalSearchResultListSearchResultArticle article; 
            private java.util.List<MultimodalSearchResultListSearchResultClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(MultimodalSearchResultListSearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * Article.
             */
            public Builder article(MultimodalSearchResultListSearchResultArticle article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<MultimodalSearchResultListSearchResultClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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

            public MultimodalSearchResultListSearchResult build() {
                return new MultimodalSearchResultListSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MultimodalSearchResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchQuery")
        private String searchQuery;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<MultimodalSearchResultListSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("SearchType")
        private String searchType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("TimelineDateStr")
        private String timelineDateStr;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private MultimodalSearchResultList(Builder builder) {
            this.current = builder.current;
            this.searchQuery = builder.searchQuery;
            this.searchResult = builder.searchResult;
            this.searchType = builder.searchType;
            this.size = builder.size;
            this.timelineDateStr = builder.timelineDateStr;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalSearchResultList create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchQuery
         */
        public String getSearchQuery() {
            return this.searchQuery;
        }

        /**
         * @return searchResult
         */
        public java.util.List<MultimodalSearchResultListSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return searchType
         */
        public String getSearchType() {
            return this.searchType;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return timelineDateStr
         */
        public String getTimelineDateStr() {
            return this.timelineDateStr;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private String searchQuery; 
            private java.util.List<MultimodalSearchResultListSearchResult> searchResult; 
            private String searchType; 
            private Integer size; 
            private String timelineDateStr; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(MultimodalSearchResultList model) {
                this.current = model.current;
                this.searchQuery = model.searchQuery;
                this.searchResult = model.searchResult;
                this.searchType = model.searchType;
                this.size = model.size;
                this.timelineDateStr = model.timelineDateStr;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
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
             * SearchResult.
             */
            public Builder searchResult(java.util.List<MultimodalSearchResultListSearchResult> searchResult) {
                this.searchResult = searchResult;
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
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * TimelineDateStr.
             */
            public Builder timelineDateStr(String timelineDateStr) {
                this.timelineDateStr = timelineDateStr;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public MultimodalSearchResultList build() {
                return new MultimodalSearchResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class ReferenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunks")
        private java.util.List<String> chunks;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private Integer traceabilityId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ReferenceList(Builder builder) {
            this.chunks = builder.chunks;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.select = builder.select;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.traceabilityId = builder.traceabilityId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceList create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<String> getChunks() {
            return this.chunks;
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
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        /**
         * @return select
         */
        public Boolean getSelect() {
            return this.select;
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
         * @return traceabilityId
         */
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<String> chunks; 
            private String content; 
            private String docId; 
            private String docUuid; 
            private String pubTime; 
            private Float score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private Boolean select; 
            private String source; 
            private String summary; 
            private String title; 
            private Integer traceabilityId; 
            private String url; 

            private Builder() {
            } 

            private Builder(ReferenceList model) {
                this.chunks = model.chunks;
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.select = model.select;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.traceabilityId = model.traceabilityId;
                this.url = model.url;
            } 

            /**
             * Chunks.
             */
            public Builder chunks(java.util.List<String> chunks) {
                this.chunks = chunks;
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
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
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
             * TraceabilityId.
             */
            public Builder traceabilityId(Integer traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ReferenceList build() {
                return new ReferenceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextGenerateMultimodalMediaListMultimodalMediaListArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TextGenerateMultimodalMediaListMultimodalMediaListArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextGenerateMultimodalMediaListMultimodalMediaListArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(TextGenerateMultimodalMediaListMultimodalMediaListArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public TextGenerateMultimodalMediaListMultimodalMediaListArticle build() {
                return new TextGenerateMultimodalMediaListMultimodalMediaListArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextGenerateMultimodalMediaListMultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private TextGenerateMultimodalMediaListMultimodalMediaListArticle article;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private TextGenerateMultimodalMediaListMultimodalMediaList(Builder builder) {
            this.article = builder.article;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextGenerateMultimodalMediaListMultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public TextGenerateMultimodalMediaListMultimodalMediaListArticle getArticle() {
            return this.article;
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
            private TextGenerateMultimodalMediaListMultimodalMediaListArticle article; 
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(TextGenerateMultimodalMediaListMultimodalMediaList model) {
                this.article = model.article;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * Article.
             */
            public Builder article(TextGenerateMultimodalMediaListMultimodalMediaListArticle article) {
                this.article = article;
                return this;
            }

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

            public TextGenerateMultimodalMediaListMultimodalMediaList build() {
                return new TextGenerateMultimodalMediaListMultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextGenerateResultTextGenerateMultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("MultimodalMediaList")
        private java.util.List<TextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Integer start;

        private TextGenerateResultTextGenerateMultimodalMediaList(Builder builder) {
            this.end = builder.end;
            this.multimodalMediaList = builder.multimodalMediaList;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextGenerateResultTextGenerateMultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return multimodalMediaList
         */
        public java.util.List<TextGenerateMultimodalMediaListMultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        public static final class Builder {
            private Integer end; 
            private java.util.List<TextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList; 
            private Integer start; 

            private Builder() {
            } 

            private Builder(TextGenerateResultTextGenerateMultimodalMediaList model) {
                this.end = model.end;
                this.multimodalMediaList = model.multimodalMediaList;
                this.start = model.start;
            } 

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * MultimodalMediaList.
             */
            public Builder multimodalMediaList(java.util.List<TextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList) {
                this.multimodalMediaList = multimodalMediaList;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            public TextGenerateResultTextGenerateMultimodalMediaList build() {
                return new TextGenerateResultTextGenerateMultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TextGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("GenerateLevel")
        private String generateLevel;

        @com.aliyun.core.annotation.NameInMap("GenerateTraceability")
        private GenerateTraceability generateTraceability;

        @com.aliyun.core.annotation.NameInMap("MultimodalSearchResultList")
        private java.util.List<MultimodalSearchResultList> multimodalSearchResultList;

        @com.aliyun.core.annotation.NameInMap("ReasonTextGenerate")
        private String reasonTextGenerate;

        @com.aliyun.core.annotation.NameInMap("ReferenceList")
        private java.util.List<ReferenceList> referenceList;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        @com.aliyun.core.annotation.NameInMap("TextGenerateMultimodalMediaList")
        private java.util.List<TextGenerateResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        private TextGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.generateLevel = builder.generateLevel;
            this.generateTraceability = builder.generateTraceability;
            this.multimodalSearchResultList = builder.multimodalSearchResultList;
            this.reasonTextGenerate = builder.reasonTextGenerate;
            this.referenceList = builder.referenceList;
            this.textGenerate = builder.textGenerate;
            this.textGenerateMultimodalMediaList = builder.textGenerateMultimodalMediaList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextGenerateResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return generateLevel
         */
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        /**
         * @return generateTraceability
         */
        public GenerateTraceability getGenerateTraceability() {
            return this.generateTraceability;
        }

        /**
         * @return multimodalSearchResultList
         */
        public java.util.List<MultimodalSearchResultList> getMultimodalSearchResultList() {
            return this.multimodalSearchResultList;
        }

        /**
         * @return reasonTextGenerate
         */
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        /**
         * @return referenceList
         */
        public java.util.List<ReferenceList> getReferenceList() {
            return this.referenceList;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        /**
         * @return textGenerateMultimodalMediaList
         */
        public java.util.List<TextGenerateResultTextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String generateLevel; 
            private GenerateTraceability generateTraceability; 
            private java.util.List<MultimodalSearchResultList> multimodalSearchResultList; 
            private String reasonTextGenerate; 
            private java.util.List<ReferenceList> referenceList; 
            private String textGenerate; 
            private java.util.List<TextGenerateResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList; 

            private Builder() {
            } 

            private Builder(TextGenerateResult model) {
                this.generateFinished = model.generateFinished;
                this.generateLevel = model.generateLevel;
                this.generateTraceability = model.generateTraceability;
                this.multimodalSearchResultList = model.multimodalSearchResultList;
                this.reasonTextGenerate = model.reasonTextGenerate;
                this.referenceList = model.referenceList;
                this.textGenerate = model.textGenerate;
                this.textGenerateMultimodalMediaList = model.textGenerateMultimodalMediaList;
            } 

            /**
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * GenerateLevel.
             */
            public Builder generateLevel(String generateLevel) {
                this.generateLevel = generateLevel;
                return this;
            }

            /**
             * GenerateTraceability.
             */
            public Builder generateTraceability(GenerateTraceability generateTraceability) {
                this.generateTraceability = generateTraceability;
                return this;
            }

            /**
             * MultimodalSearchResultList.
             */
            public Builder multimodalSearchResultList(java.util.List<MultimodalSearchResultList> multimodalSearchResultList) {
                this.multimodalSearchResultList = multimodalSearchResultList;
                return this;
            }

            /**
             * ReasonTextGenerate.
             */
            public Builder reasonTextGenerate(String reasonTextGenerate) {
                this.reasonTextGenerate = reasonTextGenerate;
                return this;
            }

            /**
             * ReferenceList.
             */
            public Builder referenceList(java.util.List<ReferenceList> referenceList) {
                this.referenceList = referenceList;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            /**
             * TextGenerateMultimodalMediaList.
             */
            public Builder textGenerateMultimodalMediaList(java.util.List<TextGenerateResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
                this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
                return this;
            }

            public TextGenerateResult build() {
                return new TextGenerateResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentTextSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private String traceabilityId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private GeneratedContentTextSearchResultSearchResult(Builder builder) {
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.summary = builder.summary;
            this.title = builder.title;
            this.traceabilityId = builder.traceabilityId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentTextSearchResultSearchResult create() {
            return builder().build();
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
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
         * @return traceabilityId
         */
        public String getTraceabilityId() {
            return this.traceabilityId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String docId; 
            private String docUuid; 
            private String pubTime; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private String summary; 
            private String title; 
            private String traceabilityId; 
            private String url; 

            private Builder() {
            } 

            private Builder(GeneratedContentTextSearchResultSearchResult model) {
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.pubTime = model.pubTime;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.summary = model.summary;
                this.title = model.title;
                this.traceabilityId = model.traceabilityId;
                this.url = model.url;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
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
             * TraceabilityId.
             */
            public Builder traceabilityId(String traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public GeneratedContentTextSearchResultSearchResult build() {
                return new GeneratedContentTextSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentTextSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<GeneratedContentTextSearchResultSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private GeneratedContentTextSearchResult(Builder builder) {
            this.current = builder.current;
            this.searchResult = builder.searchResult;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentTextSearchResult create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return searchResult
         */
        public java.util.List<GeneratedContentTextSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List<GeneratedContentTextSearchResultSearchResult> searchResult; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(GeneratedContentTextSearchResult model) {
                this.current = model.current;
                this.searchResult = model.searchResult;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<GeneratedContentTextSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public GeneratedContentTextSearchResult build() {
                return new GeneratedContentTextSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class CoordinatesGenerateCoordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private Integer z;

        private CoordinatesGenerateCoordinate(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinatesGenerateCoordinate create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public Integer getZ() {
            return this.z;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 
            private Integer z; 

            private Builder() {
            } 

            private Builder(CoordinatesGenerateCoordinate model) {
                this.x = model.x;
                this.y = model.y;
                this.z = model.z;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(Integer z) {
                this.z = z;
                return this;
            }

            public CoordinatesGenerateCoordinate build() {
                return new CoordinatesGenerateCoordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class CoordinatesNewsCoordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private Integer z;

        private CoordinatesNewsCoordinate(Builder builder) {
            this.mediaType = builder.mediaType;
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinatesNewsCoordinate create() {
            return builder().build();
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public Integer getZ() {
            return this.z;
        }

        public static final class Builder {
            private String mediaType; 
            private Integer x; 
            private Integer y; 
            private Integer z; 

            private Builder() {
            } 

            private Builder(CoordinatesNewsCoordinate model) {
                this.mediaType = model.mediaType;
                this.x = model.x;
                this.y = model.y;
                this.z = model.z;
            } 

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(Integer z) {
                this.z = z;
                return this;
            }

            public CoordinatesNewsCoordinate build() {
                return new CoordinatesNewsCoordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GenerateTraceabilityCoordinates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateCoordinate")
        private CoordinatesGenerateCoordinate generateCoordinate;

        @com.aliyun.core.annotation.NameInMap("NewsCoordinate")
        private CoordinatesNewsCoordinate newsCoordinate;

        private GenerateTraceabilityCoordinates(Builder builder) {
            this.generateCoordinate = builder.generateCoordinate;
            this.newsCoordinate = builder.newsCoordinate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenerateTraceabilityCoordinates create() {
            return builder().build();
        }

        /**
         * @return generateCoordinate
         */
        public CoordinatesGenerateCoordinate getGenerateCoordinate() {
            return this.generateCoordinate;
        }

        /**
         * @return newsCoordinate
         */
        public CoordinatesNewsCoordinate getNewsCoordinate() {
            return this.newsCoordinate;
        }

        public static final class Builder {
            private CoordinatesGenerateCoordinate generateCoordinate; 
            private CoordinatesNewsCoordinate newsCoordinate; 

            private Builder() {
            } 

            private Builder(GenerateTraceabilityCoordinates model) {
                this.generateCoordinate = model.generateCoordinate;
                this.newsCoordinate = model.newsCoordinate;
            } 

            /**
             * GenerateCoordinate.
             */
            public Builder generateCoordinate(CoordinatesGenerateCoordinate generateCoordinate) {
                this.generateCoordinate = generateCoordinate;
                return this;
            }

            /**
             * NewsCoordinate.
             */
            public Builder newsCoordinate(CoordinatesNewsCoordinate newsCoordinate) {
                this.newsCoordinate = newsCoordinate;
                return this;
            }

            public GenerateTraceabilityCoordinates build() {
                return new GenerateTraceabilityCoordinates(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultGenerateTraceability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coordinates")
        private java.util.List<GenerateTraceabilityCoordinates> coordinates;

        @com.aliyun.core.annotation.NameInMap("Duplicate")
        private Double duplicate;

        private TimelineResultGenerateTraceability(Builder builder) {
            this.coordinates = builder.coordinates;
            this.duplicate = builder.duplicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultGenerateTraceability create() {
            return builder().build();
        }

        /**
         * @return coordinates
         */
        public java.util.List<GenerateTraceabilityCoordinates> getCoordinates() {
            return this.coordinates;
        }

        /**
         * @return duplicate
         */
        public Double getDuplicate() {
            return this.duplicate;
        }

        public static final class Builder {
            private java.util.List<GenerateTraceabilityCoordinates> coordinates; 
            private Double duplicate; 

            private Builder() {
            } 

            private Builder(TimelineResultGenerateTraceability model) {
                this.coordinates = model.coordinates;
                this.duplicate = model.duplicate;
            } 

            /**
             * Coordinates.
             */
            public Builder coordinates(java.util.List<GenerateTraceabilityCoordinates> coordinates) {
                this.coordinates = coordinates;
                return this;
            }

            /**
             * Duplicate.
             */
            public Builder duplicate(Double duplicate) {
                this.duplicate = duplicate;
                return this;
            }

            public TimelineResultGenerateTraceability build() {
                return new TimelineResultGenerateTraceability(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultMultimodalSearchResultListSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TimelineResultMultimodalSearchResultListSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultMultimodalSearchResultListSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(TimelineResultMultimodalSearchResultListSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public TimelineResultMultimodalSearchResultListSearchResultArticle build() {
                return new TimelineResultMultimodalSearchResultListSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultMultimodalSearchResultListSearchResultClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TimelineResultMultimodalSearchResultListSearchResultClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultMultimodalSearchResultListSearchResultClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(TimelineResultMultimodalSearchResultListSearchResultClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TimelineResultMultimodalSearchResultListSearchResultClipInfos build() {
                return new TimelineResultMultimodalSearchResultListSearchResultClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultMultimodalSearchResultListSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private TimelineResultMultimodalSearchResultListSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<TimelineResultMultimodalSearchResultListSearchResultClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private TimelineResultMultimodalSearchResultListSearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultMultimodalSearchResultListSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public TimelineResultMultimodalSearchResultListSearchResultArticle getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<TimelineResultMultimodalSearchResultListSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
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
            private TimelineResultMultimodalSearchResultListSearchResultArticle article; 
            private java.util.List<TimelineResultMultimodalSearchResultListSearchResultClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(TimelineResultMultimodalSearchResultListSearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * Article.
             */
            public Builder article(TimelineResultMultimodalSearchResultListSearchResultArticle article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<TimelineResultMultimodalSearchResultListSearchResultClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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

            public TimelineResultMultimodalSearchResultListSearchResult build() {
                return new TimelineResultMultimodalSearchResultListSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultMultimodalSearchResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<TimelineResultMultimodalSearchResultListSearchResult> searchResult;

        @com.aliyun.core.annotation.NameInMap("TimelineDateStr")
        private String timelineDateStr;

        private TimelineResultMultimodalSearchResultList(Builder builder) {
            this.searchResult = builder.searchResult;
            this.timelineDateStr = builder.timelineDateStr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultMultimodalSearchResultList create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<TimelineResultMultimodalSearchResultListSearchResult> getSearchResult() {
            return this.searchResult;
        }

        /**
         * @return timelineDateStr
         */
        public String getTimelineDateStr() {
            return this.timelineDateStr;
        }

        public static final class Builder {
            private java.util.List<TimelineResultMultimodalSearchResultListSearchResult> searchResult; 
            private String timelineDateStr; 

            private Builder() {
            } 

            private Builder(TimelineResultMultimodalSearchResultList model) {
                this.searchResult = model.searchResult;
                this.timelineDateStr = model.timelineDateStr;
            } 

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<TimelineResultMultimodalSearchResultListSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            /**
             * TimelineDateStr.
             */
            public Builder timelineDateStr(String timelineDateStr) {
                this.timelineDateStr = timelineDateStr;
                return this;
            }

            public TimelineResultMultimodalSearchResultList build() {
                return new TimelineResultMultimodalSearchResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultReferenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunks")
        private java.util.List<String> chunks;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private Integer traceabilityId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TimelineResultReferenceList(Builder builder) {
            this.chunks = builder.chunks;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.select = builder.select;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.traceabilityId = builder.traceabilityId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultReferenceList create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<String> getChunks() {
            return this.chunks;
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
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
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
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        /**
         * @return select
         */
        public Boolean getSelect() {
            return this.select;
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
         * @return traceabilityId
         */
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<String> chunks; 
            private String content; 
            private String docId; 
            private String docUuid; 
            private String pubTime; 
            private Float score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private Boolean select; 
            private String source; 
            private String summary; 
            private String title; 
            private Integer traceabilityId; 
            private String url; 

            private Builder() {
            } 

            private Builder(TimelineResultReferenceList model) {
                this.chunks = model.chunks;
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.select = model.select;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.traceabilityId = model.traceabilityId;
                this.url = model.url;
            } 

            /**
             * Chunks.
             */
            public Builder chunks(java.util.List<String> chunks) {
                this.chunks = chunks;
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
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
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
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
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
             * TraceabilityId.
             */
            public Builder traceabilityId(Integer traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TimelineResultReferenceList build() {
                return new TimelineResultReferenceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle build() {
                return new TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList(Builder builder) {
            this.article = builder.article;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle getArticle() {
            return this.article;
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
            private TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article; 
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList model) {
                this.article = model.article;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * Article.
             */
            public Builder article(TimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article) {
                this.article = article;
                return this;
            }

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

            public TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList build() {
                return new TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResultTextGenerateMultimodalMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("MultimodalMediaList")
        private java.util.List<TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Integer start;

        private TimelineResultTextGenerateMultimodalMediaList(Builder builder) {
            this.end = builder.end;
            this.multimodalMediaList = builder.multimodalMediaList;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResultTextGenerateMultimodalMediaList create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return multimodalMediaList
         */
        public java.util.List<TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        public static final class Builder {
            private Integer end; 
            private java.util.List<TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList; 
            private Integer start; 

            private Builder() {
            } 

            private Builder(TimelineResultTextGenerateMultimodalMediaList model) {
                this.end = model.end;
                this.multimodalMediaList = model.multimodalMediaList;
                this.start = model.start;
            } 

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * MultimodalMediaList.
             */
            public Builder multimodalMediaList(java.util.List<TimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList) {
                this.multimodalMediaList = multimodalMediaList;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            public TimelineResultTextGenerateMultimodalMediaList build() {
                return new TimelineResultTextGenerateMultimodalMediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TimelineResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("GenerateTraceability")
        private TimelineResultGenerateTraceability generateTraceability;

        @com.aliyun.core.annotation.NameInMap("MultimodalSearchResultList")
        private java.util.List<TimelineResultMultimodalSearchResultList> multimodalSearchResultList;

        @com.aliyun.core.annotation.NameInMap("ReasonTextGenerate")
        private String reasonTextGenerate;

        @com.aliyun.core.annotation.NameInMap("ReferenceList")
        private java.util.List<TimelineResultReferenceList> referenceList;

        @com.aliyun.core.annotation.NameInMap("TextGenerate")
        private String textGenerate;

        @com.aliyun.core.annotation.NameInMap("TextGenerateMultimodalMediaList")
        private java.util.List<TimelineResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        private TimelineResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.generateTraceability = builder.generateTraceability;
            this.multimodalSearchResultList = builder.multimodalSearchResultList;
            this.reasonTextGenerate = builder.reasonTextGenerate;
            this.referenceList = builder.referenceList;
            this.textGenerate = builder.textGenerate;
            this.textGenerateMultimodalMediaList = builder.textGenerateMultimodalMediaList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return generateTraceability
         */
        public TimelineResultGenerateTraceability getGenerateTraceability() {
            return this.generateTraceability;
        }

        /**
         * @return multimodalSearchResultList
         */
        public java.util.List<TimelineResultMultimodalSearchResultList> getMultimodalSearchResultList() {
            return this.multimodalSearchResultList;
        }

        /**
         * @return reasonTextGenerate
         */
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        /**
         * @return referenceList
         */
        public java.util.List<TimelineResultReferenceList> getReferenceList() {
            return this.referenceList;
        }

        /**
         * @return textGenerate
         */
        public String getTextGenerate() {
            return this.textGenerate;
        }

        /**
         * @return textGenerateMultimodalMediaList
         */
        public java.util.List<TimelineResultTextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private TimelineResultGenerateTraceability generateTraceability; 
            private java.util.List<TimelineResultMultimodalSearchResultList> multimodalSearchResultList; 
            private String reasonTextGenerate; 
            private java.util.List<TimelineResultReferenceList> referenceList; 
            private String textGenerate; 
            private java.util.List<TimelineResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList; 

            private Builder() {
            } 

            private Builder(TimelineResult model) {
                this.generateFinished = model.generateFinished;
                this.generateTraceability = model.generateTraceability;
                this.multimodalSearchResultList = model.multimodalSearchResultList;
                this.reasonTextGenerate = model.reasonTextGenerate;
                this.referenceList = model.referenceList;
                this.textGenerate = model.textGenerate;
                this.textGenerateMultimodalMediaList = model.textGenerateMultimodalMediaList;
            } 

            /**
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * GenerateTraceability.
             */
            public Builder generateTraceability(TimelineResultGenerateTraceability generateTraceability) {
                this.generateTraceability = generateTraceability;
                return this;
            }

            /**
             * MultimodalSearchResultList.
             */
            public Builder multimodalSearchResultList(java.util.List<TimelineResultMultimodalSearchResultList> multimodalSearchResultList) {
                this.multimodalSearchResultList = multimodalSearchResultList;
                return this;
            }

            /**
             * ReasonTextGenerate.
             */
            public Builder reasonTextGenerate(String reasonTextGenerate) {
                this.reasonTextGenerate = reasonTextGenerate;
                return this;
            }

            /**
             * ReferenceList.
             */
            public Builder referenceList(java.util.List<TimelineResultReferenceList> referenceList) {
                this.referenceList = referenceList;
                return this;
            }

            /**
             * TextGenerate.
             */
            public Builder textGenerate(String textGenerate) {
                this.textGenerate = textGenerate;
                return this;
            }

            /**
             * TextGenerateMultimodalMediaList.
             */
            public Builder textGenerateMultimodalMediaList(java.util.List<TimelineResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
                this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
                return this;
            }

            public TimelineResult build() {
                return new TimelineResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentVideoSearchResultSearchResultArticle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private GeneratedContentVideoSearchResultSearchResultArticle(Builder builder) {
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.searchSourceName = builder.searchSourceName;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentVideoSearchResultSearchResultArticle create() {
            return builder().build();
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
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
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
            private String docId; 
            private String docUuid; 
            private String searchSourceName; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(GeneratedContentVideoSearchResultSearchResultArticle model) {
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.searchSourceName = model.searchSourceName;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public GeneratedContentVideoSearchResultSearchResultArticle build() {
                return new GeneratedContentVideoSearchResultSearchResultArticle(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentVideoSearchResultSearchResultClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GeneratedContentVideoSearchResultSearchResultClipInfos(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.text = builder.text;
            this.to = builder.to;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentVideoSearchResultSearchResultClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private String text; 
            private Double to; 
            private String type; 

            private Builder() {
            } 

            private Builder(GeneratedContentVideoSearchResultSearchResultClipInfos model) {
                this.from = model.from;
                this.score = model.score;
                this.text = model.text;
                this.to = model.to;
                this.type = model.type;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
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
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GeneratedContentVideoSearchResultSearchResultClipInfos build() {
                return new GeneratedContentVideoSearchResultSearchResultClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentVideoSearchResultSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Article")
        private GeneratedContentVideoSearchResultSearchResultArticle article;

        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<GeneratedContentVideoSearchResultSearchResultClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("TraceabilityId")
        private String traceabilityId;

        private GeneratedContentVideoSearchResultSearchResult(Builder builder) {
            this.article = builder.article;
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.traceabilityId = builder.traceabilityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentVideoSearchResultSearchResult create() {
            return builder().build();
        }

        /**
         * @return article
         */
        public GeneratedContentVideoSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        /**
         * @return clipInfos
         */
        public java.util.List<GeneratedContentVideoSearchResultSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
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
         * @return traceabilityId
         */
        public String getTraceabilityId() {
            return this.traceabilityId;
        }

        public static final class Builder {
            private GeneratedContentVideoSearchResultSearchResultArticle article; 
            private java.util.List<GeneratedContentVideoSearchResultSearchResultClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaId; 
            private String traceabilityId; 

            private Builder() {
            } 

            private Builder(GeneratedContentVideoSearchResultSearchResult model) {
                this.article = model.article;
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.traceabilityId = model.traceabilityId;
            } 

            /**
             * Article.
             */
            public Builder article(GeneratedContentVideoSearchResultSearchResultArticle article) {
                this.article = article;
                return this;
            }

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<GeneratedContentVideoSearchResultSearchResultClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

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
             * TraceabilityId.
             */
            public Builder traceabilityId(String traceabilityId) {
                this.traceabilityId = traceabilityId;
                return this;
            }

            public GeneratedContentVideoSearchResultSearchResult build() {
                return new GeneratedContentVideoSearchResultSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContentVideoSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<GeneratedContentVideoSearchResultSearchResult> searchResult;

        private GeneratedContentVideoSearchResult(Builder builder) {
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContentVideoSearchResult create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<GeneratedContentVideoSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private java.util.List<GeneratedContentVideoSearchResultSearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(GeneratedContentVideoSearchResult model) {
                this.searchResult = model.searchResult;
            } 

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<GeneratedContentVideoSearchResultSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public GeneratedContentVideoSearchResult build() {
                return new GeneratedContentVideoSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class GeneratedContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSearchResult")
        private AudioSearchResult audioSearchResult;

        @com.aliyun.core.annotation.NameInMap("ClusterTopicResult")
        private ClusterTopicResult clusterTopicResult;

        @com.aliyun.core.annotation.NameInMap("ExcerptResult")
        private ExcerptResult excerptResult;

        @com.aliyun.core.annotation.NameInMap("ImageSearchResult")
        private GeneratedContentImageSearchResult imageSearchResult;

        @com.aliyun.core.annotation.NameInMap("NewsElementResult")
        private NewsElementResult newsElementResult;

        @com.aliyun.core.annotation.NameInMap("TextGenerateResult")
        private TextGenerateResult textGenerateResult;

        @com.aliyun.core.annotation.NameInMap("TextSearchResult")
        private GeneratedContentTextSearchResult textSearchResult;

        @com.aliyun.core.annotation.NameInMap("TimelineResult")
        private TimelineResult timelineResult;

        @com.aliyun.core.annotation.NameInMap("VideoSearchResult")
        private GeneratedContentVideoSearchResult videoSearchResult;

        private GeneratedContent(Builder builder) {
            this.audioSearchResult = builder.audioSearchResult;
            this.clusterTopicResult = builder.clusterTopicResult;
            this.excerptResult = builder.excerptResult;
            this.imageSearchResult = builder.imageSearchResult;
            this.newsElementResult = builder.newsElementResult;
            this.textGenerateResult = builder.textGenerateResult;
            this.textSearchResult = builder.textSearchResult;
            this.timelineResult = builder.timelineResult;
            this.videoSearchResult = builder.videoSearchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedContent create() {
            return builder().build();
        }

        /**
         * @return audioSearchResult
         */
        public AudioSearchResult getAudioSearchResult() {
            return this.audioSearchResult;
        }

        /**
         * @return clusterTopicResult
         */
        public ClusterTopicResult getClusterTopicResult() {
            return this.clusterTopicResult;
        }

        /**
         * @return excerptResult
         */
        public ExcerptResult getExcerptResult() {
            return this.excerptResult;
        }

        /**
         * @return imageSearchResult
         */
        public GeneratedContentImageSearchResult getImageSearchResult() {
            return this.imageSearchResult;
        }

        /**
         * @return newsElementResult
         */
        public NewsElementResult getNewsElementResult() {
            return this.newsElementResult;
        }

        /**
         * @return textGenerateResult
         */
        public TextGenerateResult getTextGenerateResult() {
            return this.textGenerateResult;
        }

        /**
         * @return textSearchResult
         */
        public GeneratedContentTextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

        /**
         * @return timelineResult
         */
        public TimelineResult getTimelineResult() {
            return this.timelineResult;
        }

        /**
         * @return videoSearchResult
         */
        public GeneratedContentVideoSearchResult getVideoSearchResult() {
            return this.videoSearchResult;
        }

        public static final class Builder {
            private AudioSearchResult audioSearchResult; 
            private ClusterTopicResult clusterTopicResult; 
            private ExcerptResult excerptResult; 
            private GeneratedContentImageSearchResult imageSearchResult; 
            private NewsElementResult newsElementResult; 
            private TextGenerateResult textGenerateResult; 
            private GeneratedContentTextSearchResult textSearchResult; 
            private TimelineResult timelineResult; 
            private GeneratedContentVideoSearchResult videoSearchResult; 

            private Builder() {
            } 

            private Builder(GeneratedContent model) {
                this.audioSearchResult = model.audioSearchResult;
                this.clusterTopicResult = model.clusterTopicResult;
                this.excerptResult = model.excerptResult;
                this.imageSearchResult = model.imageSearchResult;
                this.newsElementResult = model.newsElementResult;
                this.textGenerateResult = model.textGenerateResult;
                this.textSearchResult = model.textSearchResult;
                this.timelineResult = model.timelineResult;
                this.videoSearchResult = model.videoSearchResult;
            } 

            /**
             * AudioSearchResult.
             */
            public Builder audioSearchResult(AudioSearchResult audioSearchResult) {
                this.audioSearchResult = audioSearchResult;
                return this;
            }

            /**
             * ClusterTopicResult.
             */
            public Builder clusterTopicResult(ClusterTopicResult clusterTopicResult) {
                this.clusterTopicResult = clusterTopicResult;
                return this;
            }

            /**
             * ExcerptResult.
             */
            public Builder excerptResult(ExcerptResult excerptResult) {
                this.excerptResult = excerptResult;
                return this;
            }

            /**
             * ImageSearchResult.
             */
            public Builder imageSearchResult(GeneratedContentImageSearchResult imageSearchResult) {
                this.imageSearchResult = imageSearchResult;
                return this;
            }

            /**
             * NewsElementResult.
             */
            public Builder newsElementResult(NewsElementResult newsElementResult) {
                this.newsElementResult = newsElementResult;
                return this;
            }

            /**
             * TextGenerateResult.
             */
            public Builder textGenerateResult(TextGenerateResult textGenerateResult) {
                this.textGenerateResult = textGenerateResult;
                return this;
            }

            /**
             * TextSearchResult.
             */
            public Builder textSearchResult(GeneratedContentTextSearchResult textSearchResult) {
                this.textSearchResult = textSearchResult;
                return this;
            }

            /**
             * TimelineResult.
             */
            public Builder timelineResult(TimelineResult timelineResult) {
                this.timelineResult = timelineResult;
                return this;
            }

            /**
             * VideoSearchResult.
             */
            public Builder videoSearchResult(GeneratedContentVideoSearchResult videoSearchResult) {
                this.videoSearchResult = videoSearchResult;
                return this;
            }

            public GeneratedContent build() {
                return new GeneratedContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class TokenCalculate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstTokenTime")
        private Float firstTokenTime;

        @com.aliyun.core.annotation.NameInMap("OutputAvgTime")
        private Float outputAvgTime;

        @com.aliyun.core.annotation.NameInMap("SearchTime")
        private Float searchTime;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Float time;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        private TokenCalculate(Builder builder) {
            this.firstTokenTime = builder.firstTokenTime;
            this.outputAvgTime = builder.outputAvgTime;
            this.searchTime = builder.searchTime;
            this.time = builder.time;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenCalculate create() {
            return builder().build();
        }

        /**
         * @return firstTokenTime
         */
        public Float getFirstTokenTime() {
            return this.firstTokenTime;
        }

        /**
         * @return outputAvgTime
         */
        public Float getOutputAvgTime() {
            return this.outputAvgTime;
        }

        /**
         * @return searchTime
         */
        public Float getSearchTime() {
            return this.searchTime;
        }

        /**
         * @return time
         */
        public Float getTime() {
            return this.time;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Float firstTokenTime; 
            private Float outputAvgTime; 
            private Float searchTime; 
            private Float time; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(TokenCalculate model) {
                this.firstTokenTime = model.firstTokenTime;
                this.outputAvgTime = model.outputAvgTime;
                this.searchTime = model.searchTime;
                this.time = model.time;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * FirstTokenTime.
             */
            public Builder firstTokenTime(Float firstTokenTime) {
                this.firstTokenTime = firstTokenTime;
                return this;
            }

            /**
             * OutputAvgTime.
             */
            public Builder outputAvgTime(Float outputAvgTime) {
                this.outputAvgTime = outputAvgTime;
                return this;
            }

            /**
             * SearchTime.
             */
            public Builder searchTime(Float searchTime) {
                this.searchTime = searchTime;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Float time) {
                this.time = time;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public TokenCalculate build() {
                return new TokenCalculate(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class BizContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AskUser")
        private String askUser;

        @com.aliyun.core.annotation.NameInMap("AskUserKeywords")
        private java.util.List<String> askUserKeywords;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("GeneratedContent")
        private GeneratedContent generatedContent;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("NextStep")
        private String nextStep;

        @com.aliyun.core.annotation.NameInMap("RecommendSearchQueryList")
        private java.util.List<String> recommendSearchQueryList;

        @com.aliyun.core.annotation.NameInMap("SearchKeywords")
        private java.util.List<String> searchKeywords;

        @com.aliyun.core.annotation.NameInMap("SearchQueryList")
        private java.util.List<String> searchQueryList;

        @com.aliyun.core.annotation.NameInMap("SupplementDataType")
        private String supplementDataType;

        @com.aliyun.core.annotation.NameInMap("SupplementEnable")
        private Boolean supplementEnable;

        @com.aliyun.core.annotation.NameInMap("TokenCalculate")
        private TokenCalculate tokenCalculate;

        private BizContext(Builder builder) {
            this.askUser = builder.askUser;
            this.askUserKeywords = builder.askUserKeywords;
            this.currentStep = builder.currentStep;
            this.generatedContent = builder.generatedContent;
            this.modelId = builder.modelId;
            this.nextStep = builder.nextStep;
            this.recommendSearchQueryList = builder.recommendSearchQueryList;
            this.searchKeywords = builder.searchKeywords;
            this.searchQueryList = builder.searchQueryList;
            this.supplementDataType = builder.supplementDataType;
            this.supplementEnable = builder.supplementEnable;
            this.tokenCalculate = builder.tokenCalculate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizContext create() {
            return builder().build();
        }

        /**
         * @return askUser
         */
        public String getAskUser() {
            return this.askUser;
        }

        /**
         * @return askUserKeywords
         */
        public java.util.List<String> getAskUserKeywords() {
            return this.askUserKeywords;
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return generatedContent
         */
        public GeneratedContent getGeneratedContent() {
            return this.generatedContent;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return nextStep
         */
        public String getNextStep() {
            return this.nextStep;
        }

        /**
         * @return recommendSearchQueryList
         */
        public java.util.List<String> getRecommendSearchQueryList() {
            return this.recommendSearchQueryList;
        }

        /**
         * @return searchKeywords
         */
        public java.util.List<String> getSearchKeywords() {
            return this.searchKeywords;
        }

        /**
         * @return searchQueryList
         */
        public java.util.List<String> getSearchQueryList() {
            return this.searchQueryList;
        }

        /**
         * @return supplementDataType
         */
        public String getSupplementDataType() {
            return this.supplementDataType;
        }

        /**
         * @return supplementEnable
         */
        public Boolean getSupplementEnable() {
            return this.supplementEnable;
        }

        /**
         * @return tokenCalculate
         */
        public TokenCalculate getTokenCalculate() {
            return this.tokenCalculate;
        }

        public static final class Builder {
            private String askUser; 
            private java.util.List<String> askUserKeywords; 
            private String currentStep; 
            private GeneratedContent generatedContent; 
            private String modelId; 
            private String nextStep; 
            private java.util.List<String> recommendSearchQueryList; 
            private java.util.List<String> searchKeywords; 
            private java.util.List<String> searchQueryList; 
            private String supplementDataType; 
            private Boolean supplementEnable; 
            private TokenCalculate tokenCalculate; 

            private Builder() {
            } 

            private Builder(BizContext model) {
                this.askUser = model.askUser;
                this.askUserKeywords = model.askUserKeywords;
                this.currentStep = model.currentStep;
                this.generatedContent = model.generatedContent;
                this.modelId = model.modelId;
                this.nextStep = model.nextStep;
                this.recommendSearchQueryList = model.recommendSearchQueryList;
                this.searchKeywords = model.searchKeywords;
                this.searchQueryList = model.searchQueryList;
                this.supplementDataType = model.supplementDataType;
                this.supplementEnable = model.supplementEnable;
                this.tokenCalculate = model.tokenCalculate;
            } 

            /**
             * AskUser.
             */
            public Builder askUser(String askUser) {
                this.askUser = askUser;
                return this;
            }

            /**
             * AskUserKeywords.
             */
            public Builder askUserKeywords(java.util.List<String> askUserKeywords) {
                this.askUserKeywords = askUserKeywords;
                return this;
            }

            /**
             * CurrentStep.
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * GeneratedContent.
             */
            public Builder generatedContent(GeneratedContent generatedContent) {
                this.generatedContent = generatedContent;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * NextStep.
             */
            public Builder nextStep(String nextStep) {
                this.nextStep = nextStep;
                return this;
            }

            /**
             * RecommendSearchQueryList.
             */
            public Builder recommendSearchQueryList(java.util.List<String> recommendSearchQueryList) {
                this.recommendSearchQueryList = recommendSearchQueryList;
                return this;
            }

            /**
             * SearchKeywords.
             */
            public Builder searchKeywords(java.util.List<String> searchKeywords) {
                this.searchKeywords = searchKeywords;
                return this;
            }

            /**
             * SearchQueryList.
             */
            public Builder searchQueryList(java.util.List<String> searchQueryList) {
                this.searchQueryList = searchQueryList;
                return this;
            }

            /**
             * SupplementDataType.
             */
            public Builder supplementDataType(String supplementDataType) {
                this.supplementDataType = supplementDataType;
                return this;
            }

            /**
             * SupplementEnable.
             */
            public Builder supplementEnable(Boolean supplementEnable) {
                this.supplementEnable = supplementEnable;
                return this;
            }

            /**
             * TokenCalculate.
             */
            public Builder tokenCalculate(TokenCalculate tokenCalculate) {
                this.tokenCalculate = tokenCalculate;
                return this;
            }

            public BizContext build() {
                return new BizContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class AgentContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizContext")
        private BizContext bizContext;

        private AgentContext(Builder builder) {
            this.bizContext = builder.bizContext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentContext create() {
            return builder().build();
        }

        /**
         * @return bizContext
         */
        public BizContext getBizContext() {
            return this.bizContext;
        }

        public static final class Builder {
            private BizContext bizContext; 

            private Builder() {
            } 

            private Builder(AgentContext model) {
                this.bizContext = model.bizContext;
            } 

            /**
             * BizContext.
             */
            public Builder bizContext(BizContext bizContext) {
                this.bizContext = bizContext;
                return this;
            }

            public AgentContext build() {
                return new AgentContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Audios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private Audios(Builder builder) {
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audios create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private String mediaId; 

            private Builder() {
            } 

            private Builder(Audios model) {
                this.mediaId = model.mediaId;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public Audios build() {
                return new Audios(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private Images(Builder builder) {
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private String mediaId; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.mediaId = model.mediaId;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        private Texts(Builder builder) {
            this.docUuid = builder.docUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Texts create() {
            return builder().build();
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        public static final class Builder {
            private String docUuid; 

            private Builder() {
            } 

            private Builder(Texts model) {
                this.docUuid = model.docUuid;
            } 

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            public Texts build() {
                return new Texts(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Videos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private Videos(Builder builder) {
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Videos create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private String mediaId; 

            private Builder() {
            } 

            private Builder(Videos model) {
                this.mediaId = model.mediaId;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public Videos build() {
                return new Videos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class MessagesSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audios")
        private java.util.List<Audios> audios;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("MultimodalSearchQuery")
        private String multimodalSearchQuery;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<Texts> texts;

        @com.aliyun.core.annotation.NameInMap("Videos")
        private java.util.List<Videos> videos;

        private MessagesSearchResult(Builder builder) {
            this.audios = builder.audios;
            this.images = builder.images;
            this.multimodalSearchQuery = builder.multimodalSearchQuery;
            this.texts = builder.texts;
            this.videos = builder.videos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessagesSearchResult create() {
            return builder().build();
        }

        /**
         * @return audios
         */
        public java.util.List<Audios> getAudios() {
            return this.audios;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return multimodalSearchQuery
         */
        public String getMultimodalSearchQuery() {
            return this.multimodalSearchQuery;
        }

        /**
         * @return texts
         */
        public java.util.List<Texts> getTexts() {
            return this.texts;
        }

        /**
         * @return videos
         */
        public java.util.List<Videos> getVideos() {
            return this.videos;
        }

        public static final class Builder {
            private java.util.List<Audios> audios; 
            private java.util.List<Images> images; 
            private String multimodalSearchQuery; 
            private java.util.List<Texts> texts; 
            private java.util.List<Videos> videos; 

            private Builder() {
            } 

            private Builder(MessagesSearchResult model) {
                this.audios = model.audios;
                this.images = model.images;
                this.multimodalSearchQuery = model.multimodalSearchQuery;
                this.texts = model.texts;
                this.videos = model.videos;
            } 

            /**
             * Audios.
             */
            public Builder audios(java.util.List<Audios> audios) {
                this.audios = audios;
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
             * MultimodalSearchQuery.
             */
            public Builder multimodalSearchQuery(String multimodalSearchQuery) {
                this.multimodalSearchQuery = multimodalSearchQuery;
                return this;
            }

            /**
             * Texts.
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * Videos.
             */
            public Builder videos(java.util.List<Videos> videos) {
                this.videos = videos;
                return this;
            }

            public MessagesSearchResult build() {
                return new MessagesSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clarifications")
        private Boolean clarifications;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GenerateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NodeCode")
        private String nodeCode;

        @com.aliyun.core.annotation.NameInMap("SearchQueries")
        private java.util.List<String> searchQueries;

        @com.aliyun.core.annotation.NameInMap("SearchQuery")
        private String searchQuery;

        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<MessagesSearchResult> searchResult;

        private Messages(Builder builder) {
            this.clarifications = builder.clarifications;
            this.content = builder.content;
            this.generateFinished = builder.generateFinished;
            this.id = builder.id;
            this.nodeCode = builder.nodeCode;
            this.searchQueries = builder.searchQueries;
            this.searchQuery = builder.searchQuery;
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return clarifications
         */
        public Boolean getClarifications() {
            return this.clarifications;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nodeCode
         */
        public String getNodeCode() {
            return this.nodeCode;
        }

        /**
         * @return searchQueries
         */
        public java.util.List<String> getSearchQueries() {
            return this.searchQueries;
        }

        /**
         * @return searchQuery
         */
        public String getSearchQuery() {
            return this.searchQuery;
        }

        /**
         * @return searchResult
         */
        public java.util.List<MessagesSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private Boolean clarifications; 
            private String content; 
            private Boolean generateFinished; 
            private String id; 
            private String nodeCode; 
            private java.util.List<String> searchQueries; 
            private String searchQuery; 
            private java.util.List<MessagesSearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.clarifications = model.clarifications;
                this.content = model.content;
                this.generateFinished = model.generateFinished;
                this.id = model.id;
                this.nodeCode = model.nodeCode;
                this.searchQueries = model.searchQueries;
                this.searchQuery = model.searchQuery;
                this.searchResult = model.searchResult;
            } 

            /**
             * Clarifications.
             */
            public Builder clarifications(Boolean clarifications) {
                this.clarifications = clarifications;
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
             * GenerateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NodeCode.
             */
            public Builder nodeCode(String nodeCode) {
                this.nodeCode = nodeCode;
                return this;
            }

            /**
             * SearchQueries.
             */
            public Builder searchQueries(java.util.List<String> searchQueries) {
                this.searchQueries = searchQueries;
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
             * SearchResult.
             */
            public Builder searchResult(java.util.List<MessagesSearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentContext")
        private AgentContext agentContext;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        private Output(Builder builder) {
            this.agentContext = builder.agentContext;
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return agentContext
         */
        public AgentContext getAgentContext() {
            return this.agentContext;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private AgentContext agentContext; 
            private java.util.List<Messages> messages; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.agentContext = model.agentContext;
                this.messages = model.messages;
            } 

            /**
             * AgentContext.
             */
            public Builder agentContext(AgentContext agentContext) {
                this.agentContext = agentContext;
                return this;
            }

            /**
             * Messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
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
     * {@link RunSearchGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationResponseBody</p>
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
