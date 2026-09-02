// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604.models;

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
 * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchKnowledgeBaseResponseBody</p>
 */
public class SearchKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("queryLabels")
    private java.util.List<String> queryLabels;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private SearchKnowledgeBaseResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryLabels = builder.queryLabels;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return queryLabels
     */
    public java.util.List<String> getQueryLabels() {
        return this.queryLabels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> queryLabels; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(SearchKnowledgeBaseResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.queryLabels = model.queryLabels;
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * accessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * queryLabels.
         */
        public Builder queryLabels(java.util.List<String> queryLabels) {
            this.queryLabels = queryLabels;
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
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchKnowledgeBaseResponseBody build() {
            return new SearchKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Images(Builder builder) {
            this.imageId = builder.imageId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String imageId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.imageId = model.imageId;
                this.url = model.url;
            } 

            /**
             * imageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>签名 URL 可能过期，客户端不应持久化。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/signed-image">https://example.com/signed-image</a></p>
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
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Locations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bottom")
        private Integer bottom;

        @com.aliyun.core.annotation.NameInMap("left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("right")
        private Integer right;

        @com.aliyun.core.annotation.NameInMap("top")
        private Integer top;

        private Locations(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.pageNumber = builder.pageNumber;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Locations create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Integer getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return right
         */
        public Integer getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        public static final class Builder {
            private Integer bottom; 
            private Integer left; 
            private Integer pageNumber; 
            private Integer right; 
            private Integer top; 

            private Builder() {
            } 

            private Builder(Locations model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.pageNumber = model.pageNumber;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * bottom.
             */
            public Builder bottom(Integer bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * right.
             */
            public Builder right(Integer right) {
                this.right = right;
                return this;
            }

            /**
             * top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            public Locations build() {
                return new Locations(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class MediaTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endMs")
        private Long endMs;

        @com.aliyun.core.annotation.NameInMap("startMs")
        private Long startMs;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private MediaTimeline(Builder builder) {
            this.endMs = builder.endMs;
            this.startMs = builder.startMs;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaTimeline create() {
            return builder().build();
        }

        /**
         * @return endMs
         */
        public Long getEndMs() {
            return this.endMs;
        }

        /**
         * @return startMs
         */
        public Long getStartMs() {
            return this.startMs;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endMs; 
            private Long startMs; 
            private String text; 

            private Builder() {
            } 

            private Builder(MediaTimeline model) {
                this.endMs = model.endMs;
                this.startMs = model.startMs;
                this.text = model.text;
            } 

            /**
             * endMs.
             */
            public Builder endMs(Long endMs) {
                this.endMs = endMs;
                return this;
            }

            /**
             * startMs.
             */
            public Builder startMs(Long startMs) {
                this.startMs = startMs;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public MediaTimeline build() {
                return new MediaTimeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class ScoreDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keywordScore")
        private Float keywordScore;

        @com.aliyun.core.annotation.NameInMap("semanticScore")
        private Float semanticScore;

        private ScoreDetails(Builder builder) {
            this.keywordScore = builder.keywordScore;
            this.semanticScore = builder.semanticScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreDetails create() {
            return builder().build();
        }

        /**
         * @return keywordScore
         */
        public Float getKeywordScore() {
            return this.keywordScore;
        }

        /**
         * @return semanticScore
         */
        public Float getSemanticScore() {
            return this.semanticScore;
        }

        public static final class Builder {
            private Float keywordScore; 
            private Float semanticScore; 

            private Builder() {
            } 

            private Builder(ScoreDetails model) {
                this.keywordScore = model.keywordScore;
                this.semanticScore = model.semanticScore;
            } 

            /**
             * keywordScore.
             */
            public Builder keywordScore(Float keywordScore) {
                this.keywordScore = keywordScore;
                return this;
            }

            /**
             * semanticScore.
             */
            public Builder semanticScore(Float semanticScore) {
                this.semanticScore = semanticScore;
                return this;
            }

            public ScoreDetails build() {
                return new ScoreDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("documentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("documentName")
        private String documentName;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("locations")
        private java.util.List<Locations> locations;

        @com.aliyun.core.annotation.NameInMap("mediaEndMs")
        private Long mediaEndMs;

        @com.aliyun.core.annotation.NameInMap("mediaStartMs")
        private Long mediaStartMs;

        @com.aliyun.core.annotation.NameInMap("mediaTimeline")
        private java.util.List<MediaTimeline> mediaTimeline;

        @com.aliyun.core.annotation.NameInMap("parentChunkId")
        private String parentChunkId;

        @com.aliyun.core.annotation.NameInMap("scalarFields")
        private Object scalarFields;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("scoreDetails")
        private ScoreDetails scoreDetails;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        private Results(Builder builder) {
            this.chunkId = builder.chunkId;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.documentId = builder.documentId;
            this.documentName = builder.documentName;
            this.images = builder.images;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.locations = builder.locations;
            this.mediaEndMs = builder.mediaEndMs;
            this.mediaStartMs = builder.mediaStartMs;
            this.mediaTimeline = builder.mediaTimeline;
            this.parentChunkId = builder.parentChunkId;
            this.scalarFields = builder.scalarFields;
            this.score = builder.score;
            this.scoreDetails = builder.scoreDetails;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return documentName
         */
        public String getDocumentName() {
            return this.documentName;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return locations
         */
        public java.util.List<Locations> getLocations() {
            return this.locations;
        }

        /**
         * @return mediaEndMs
         */
        public Long getMediaEndMs() {
            return this.mediaEndMs;
        }

        /**
         * @return mediaStartMs
         */
        public Long getMediaStartMs() {
            return this.mediaStartMs;
        }

        /**
         * @return mediaTimeline
         */
        public java.util.List<MediaTimeline> getMediaTimeline() {
            return this.mediaTimeline;
        }

        /**
         * @return parentChunkId
         */
        public String getParentChunkId() {
            return this.parentChunkId;
        }

        /**
         * @return scalarFields
         */
        public Object getScalarFields() {
            return this.scalarFields;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return scoreDetails
         */
        public ScoreDetails getScoreDetails() {
            return this.scoreDetails;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String chunkId; 
            private String content; 
            private String contentType; 
            private String documentId; 
            private String documentName; 
            private java.util.List<Images> images; 
            private String knowledgeBaseId; 
            private java.util.List<Locations> locations; 
            private Long mediaEndMs; 
            private Long mediaStartMs; 
            private java.util.List<MediaTimeline> mediaTimeline; 
            private String parentChunkId; 
            private Object scalarFields; 
            private Float score; 
            private ScoreDetails scoreDetails; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.chunkId = model.chunkId;
                this.content = model.content;
                this.contentType = model.contentType;
                this.documentId = model.documentId;
                this.documentName = model.documentName;
                this.images = model.images;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.locations = model.locations;
                this.mediaEndMs = model.mediaEndMs;
                this.mediaStartMs = model.mediaStartMs;
                this.mediaTimeline = model.mediaTimeline;
                this.parentChunkId = model.parentChunkId;
                this.scalarFields = model.scalarFields;
                this.score = model.score;
                this.scoreDetails = model.scoreDetails;
                this.tags = model.tags;
            } 

            /**
             * chunkId.
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * <p>原始可读文本或表格 HTML。</p>
             * 
             * <strong>example:</strong>
             * <p>税额 1.59</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * documentId.
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * documentName.
             */
            public Builder documentName(String documentName) {
                this.documentName = documentName;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * knowledgeBaseId.
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * locations.
             */
            public Builder locations(java.util.List<Locations> locations) {
                this.locations = locations;
                return this;
            }

            /**
             * <p>音频或视频切片在原始媒体中的结束时间，单位为毫秒；非媒体切片不返回。</p>
             * 
             * <strong>example:</strong>
             * <p>8400</p>
             */
            public Builder mediaEndMs(Long mediaEndMs) {
                this.mediaEndMs = mediaEndMs;
                return this;
            }

            /**
             * <p>音频或视频切片在原始媒体中的开始时间，单位为毫秒；非媒体切片不返回。</p>
             * 
             * <strong>example:</strong>
             * <p>1250</p>
             */
            public Builder mediaStartMs(Long mediaStartMs) {
                this.mediaStartMs = mediaStartMs;
                return this;
            }

            /**
             * <p>切片内逐句或逐段内容在原始媒体中的时间范围；非音频切片不返回。</p>
             */
            public Builder mediaTimeline(java.util.List<MediaTimeline> mediaTimeline) {
                this.mediaTimeline = mediaTimeline;
                return this;
            }

            /**
             * <p>无父切片时为 null。</p>
             * 
             * <strong>example:</strong>
             * <p>parent-chunk-id</p>
             */
            public Builder parentChunkId(String parentChunkId) {
                this.parentChunkId = parentChunkId;
                return this;
            }

            /**
             * scalarFields.
             */
            public Builder scalarFields(Object scalarFields) {
                this.scalarFields = scalarFields;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * scoreDetails.
             */
            public Builder scoreDetails(ScoreDetails scoreDetails) {
                this.scoreDetails = scoreDetails;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
