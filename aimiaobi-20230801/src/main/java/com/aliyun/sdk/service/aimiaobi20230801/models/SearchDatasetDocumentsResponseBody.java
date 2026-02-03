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
 * {@link SearchDatasetDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDatasetDocumentsResponseBody</p>
 */
public class SearchDatasetDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SearchDatasetDocumentsResponseBody(Builder builder) {
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

    public static SearchDatasetDocumentsResponseBody create() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SearchDatasetDocumentsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(Data data) {
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

        public SearchDatasetDocumentsResponseBody build() {
            return new SearchDatasetDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchDatasetDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDatasetDocumentsResponseBody</p>
     */
    public static class ChunkInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunk")
        private String chunk;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        private ChunkInfos(Builder builder) {
            this.chunk = builder.chunk;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkInfos create() {
            return builder().build();
        }

        /**
         * @return chunk
         */
        public String getChunk() {
            return this.chunk;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String chunk; 
            private Double score; 

            private Builder() {
            } 

            private Builder(ChunkInfos model) {
                this.chunk = model.chunk;
                this.score = model.score;
            } 

            /**
             * Chunk.
             */
            public Builder chunk(String chunk) {
                this.chunk = chunk;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public ChunkInfos build() {
                return new ChunkInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDatasetDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDatasetDocumentsResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryUuid")
        private String categoryUuid;

        @com.aliyun.core.annotation.NameInMap("Chunk")
        private String chunk;

        @com.aliyun.core.annotation.NameInMap("ChunkInfos")
        private java.util.List<ChunkInfos> chunkInfos;

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

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("SourceFrom")
        private String sourceFrom;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Documents(Builder builder) {
            this.categoryUuid = builder.categoryUuid;
            this.chunk = builder.chunk;
            this.chunkInfos = builder.chunkInfos;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docType = builder.docType;
            this.docUuid = builder.docUuid;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.sourceFrom = builder.sourceFrom;
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return categoryUuid
         */
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        /**
         * @return chunk
         */
        public String getChunk() {
            return this.chunk;
        }

        /**
         * @return chunkInfos
         */
        public java.util.List<ChunkInfos> getChunkInfos() {
            return this.chunkInfos;
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
         * @return sourceFrom
         */
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
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
            private String categoryUuid; 
            private String chunk; 
            private java.util.List<ChunkInfos> chunkInfos; 
            private String content; 
            private String docId; 
            private String docType; 
            private String docUuid; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private String pubTime; 
            private Double score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private String sourceFrom; 
            private String summary; 
            private java.util.List<String> tags; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.categoryUuid = model.categoryUuid;
                this.chunk = model.chunk;
                this.chunkInfos = model.chunkInfos;
                this.content = model.content;
                this.docId = model.docId;
                this.docType = model.docType;
                this.docUuid = model.docUuid;
                this.extend1 = model.extend1;
                this.extend2 = model.extend2;
                this.extend3 = model.extend3;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.sourceFrom = model.sourceFrom;
                this.summary = model.summary;
                this.tags = model.tags;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * CategoryUuid.
             */
            public Builder categoryUuid(String categoryUuid) {
                this.categoryUuid = categoryUuid;
                return this;
            }

            /**
             * Chunk.
             */
            public Builder chunk(String chunk) {
                this.chunk = chunk;
                return this;
            }

            /**
             * ChunkInfos.
             */
            public Builder chunkInfos(java.util.List<ChunkInfos> chunkInfos) {
                this.chunkInfos = chunkInfos;
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
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
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
             * SourceFrom.
             */
            public Builder sourceFrom(String sourceFrom) {
                this.sourceFrom = sourceFrom;
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
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
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

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDatasetDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDatasetDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Documents")
        private java.util.List<Documents> documents;

        private Data(Builder builder) {
            this.documents = builder.documents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documents
         */
        public java.util.List<Documents> getDocuments() {
            return this.documents;
        }

        public static final class Builder {
            private java.util.List<Documents> documents; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documents = model.documents;
            } 

            /**
             * Documents.
             */
            public Builder documents(java.util.List<Documents> documents) {
                this.documents = documents;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
