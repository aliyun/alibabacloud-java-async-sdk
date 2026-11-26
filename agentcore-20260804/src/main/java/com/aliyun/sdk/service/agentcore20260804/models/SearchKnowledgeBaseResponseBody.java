// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private SearchKnowledgeBaseResponseBody(Builder builder) {
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

    public static SearchKnowledgeBaseResponseBody create() {
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

        private Builder(SearchKnowledgeBaseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The stable result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The published results that the caller has permission to access.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The actual HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the data masking result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class Scores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fusion")
        private Double fusion;

        @com.aliyun.core.annotation.NameInMap("keyword")
        private Double keyword;

        @com.aliyun.core.annotation.NameInMap("rerank")
        private Double rerank;

        @com.aliyun.core.annotation.NameInMap("vector")
        private Double vector;

        private Scores(Builder builder) {
            this.fusion = builder.fusion;
            this.keyword = builder.keyword;
            this.rerank = builder.rerank;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scores create() {
            return builder().build();
        }

        /**
         * @return fusion
         */
        public Double getFusion() {
            return this.fusion;
        }

        /**
         * @return keyword
         */
        public Double getKeyword() {
            return this.keyword;
        }

        /**
         * @return rerank
         */
        public Double getRerank() {
            return this.rerank;
        }

        /**
         * @return vector
         */
        public Double getVector() {
            return this.vector;
        }

        public static final class Builder {
            private Double fusion; 
            private Double keyword; 
            private Double rerank; 
            private Double vector; 

            private Builder() {
            } 

            private Builder(Scores model) {
                this.fusion = model.fusion;
                this.keyword = model.keyword;
                this.rerank = model.rerank;
                this.vector = model.vector;
            } 

            /**
             * <p>The normalized score for the fusion stage. This field is not returned if the stage is not involved.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder fusion(Double fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The normalized score for the keyword channel. This field is not returned if the stage is not involved.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder keyword(Double keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The normalized score for the reranking stage. This field is not returned if the stage is not involved.</p>
             * 
             * <strong>example:</strong>
             * <p>0.92</p>
             */
            public Builder rerank(Double rerank) {
                this.rerank = rerank;
                return this;
            }

            /**
             * <p>The normalized score for the vector channel. This field is not returned if the stage is not involved.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder vector(Double vector) {
                this.vector = vector;
                return this;
            }

            public Scores build() {
                return new Scores(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("assetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("chunkSeq")
        private Integer chunkSeq;

        @com.aliyun.core.annotation.NameInMap("chunkToken")
        private String chunkToken;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("scores")
        private Scores scores;

        @com.aliyun.core.annotation.NameInMap("sourceLocation")
        private String sourceLocation;

        @com.aliyun.core.annotation.NameInMap("titlePath")
        private String titlePath;

        private Chunks(Builder builder) {
            this.assetId = builder.assetId;
            this.assetName = builder.assetName;
            this.chunkSeq = builder.chunkSeq;
            this.chunkToken = builder.chunkToken;
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.score = builder.score;
            this.scores = builder.scores;
            this.sourceLocation = builder.sourceLocation;
            this.titlePath = builder.titlePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return chunkSeq
         */
        public Integer getChunkSeq() {
            return this.chunkSeq;
        }

        /**
         * @return chunkToken
         */
        public String getChunkToken() {
            return this.chunkToken;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return scores
         */
        public Scores getScores() {
            return this.scores;
        }

        /**
         * @return sourceLocation
         */
        public String getSourceLocation() {
            return this.sourceLocation;
        }

        /**
         * @return titlePath
         */
        public String getTitlePath() {
            return this.titlePath;
        }

        public static final class Builder {
            private String assetId; 
            private String assetName; 
            private Integer chunkSeq; 
            private String chunkToken; 
            private String content; 
            private String fileName; 
            private Double score; 
            private Scores scores; 
            private String sourceLocation; 
            private String titlePath; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.assetId = model.assetId;
                this.assetName = model.assetName;
                this.chunkSeq = model.chunkSeq;
                this.chunkToken = model.chunkToken;
                this.content = model.content;
                this.fileName = model.fileName;
                this.score = model.score;
                this.scores = model.scores;
                this.sourceLocation = model.sourceLocation;
                this.titlePath = model.titlePath;
            } 

            /**
             * <p>The asset to which the matched chunk belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The display name of the matched asset.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The 1-based logical sequence number within the published asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>The opaque token passed back as-is during updates. It is verified against the current published results at the start of the request, and an error is returned if it has expired. It does not follow newly published concurrent results after a simple start-stop operation, and must not be parsed or generated manually.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder chunkToken(String chunkToken) {
                this.chunkToken = chunkToken;
                return this;
            }

            /**
             * <p>The chunk content that has passed the permission, enablement status, and published version verifications.</p>
             * 
             * <strong>example:</strong>
             * <p>Welcome to the product</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The file name that matches the published original file. It is not affected by changes to the asset display name.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The ranking score interpreted by scoreType. Normalization is not guaranteed, and scores cannot be directly compared across different modes or queries.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0325</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The detailed normalized scores for the vector, keyword, fusion, and reranking stages. Stages that are not involved are not returned.</p>
             */
            public Builder scores(Scores scores) {
                this.scores = scores;
                return this;
            }

            /**
             * <p>The source location, such as p.3 for a PDF page, s.2 for a PPT slide, or a worksheet name. This field is not returned if the location cannot be mapped.</p>
             * 
             * <strong>example:</strong>
             * <p>p.3</p>
             */
            public Builder sourceLocation(String sourceLocation) {
                this.sourceLocation = sourceLocation;
                return this;
            }

            /**
             * <p>The title hierarchy to which the matched chunk belongs. This field is not returned if the hierarchy cannot be located.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Guide &gt; Configuration</p>
             */
            public Builder titlePath(String titlePath) {
                this.titlePath = titlePath;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        private java.util.List<Chunks> chunks;

        @com.aliyun.core.annotation.NameInMap("scoreType")
        private String scoreType;

        @com.aliyun.core.annotation.NameInMap("timeSpent")
        private Long timeSpent;

        private Data(Builder builder) {
            this.chunks = builder.chunks;
            this.scoreType = builder.scoreType;
            this.timeSpent = builder.timeSpent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<Chunks> getChunks() {
            return this.chunks;
        }

        /**
         * @return scoreType
         */
        public String getScoreType() {
            return this.scoreType;
        }

        /**
         * @return timeSpent
         */
        public Long getTimeSpent() {
            return this.timeSpent;
        }

        public static final class Builder {
            private java.util.List<Chunks> chunks; 
            private String scoreType; 
            private Long timeSpent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chunks = model.chunks;
                this.scoreType = model.scoreType;
                this.timeSpent = model.timeSpent;
            } 

            /**
             * <p>The final authorized and published candidates. The number of candidates may be less than topK. If a backend failure occurs, an error is returned instead of a fake success with empty results.</p>
             */
            public Builder chunks(java.util.List<Chunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * <p>The actual final ranking stage, such as keyword, vector, rrf, weighted, or rerank. This does not replace the detailed scores.</p>
             * 
             * <strong>example:</strong>
             * <p>rrf</p>
             */
            public Builder scoreType(String scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * <p>The server-side processing duration for the current knowledge base retrieval, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder timeSpent(Long timeSpent) {
                this.timeSpent = timeSpent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
