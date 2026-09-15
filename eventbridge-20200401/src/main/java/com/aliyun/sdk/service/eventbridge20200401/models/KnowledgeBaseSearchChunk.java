// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link KnowledgeBaseSearchChunk} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseSearchChunk</p>
 */
public class KnowledgeBaseSearchChunk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkSeq")
    private Integer chunkSeq;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("Scores")
    private Scores scores;

    @com.aliyun.core.annotation.NameInMap("SourceLocation")
    private String sourceLocation;

    @com.aliyun.core.annotation.NameInMap("TitlePath")
    private String titlePath;

    private KnowledgeBaseSearchChunk(Builder builder) {
        this.chunkSeq = builder.chunkSeq;
        this.content = builder.content;
        this.documentId = builder.documentId;
        this.fileName = builder.fileName;
        this.score = builder.score;
        this.scores = builder.scores;
        this.sourceLocation = builder.sourceLocation;
        this.titlePath = builder.titlePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseSearchChunk create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkSeq
     */
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
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
        private Integer chunkSeq; 
        private String content; 
        private String documentId; 
        private String fileName; 
        private Double score; 
        private Scores scores; 
        private String sourceLocation; 
        private String titlePath; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseSearchChunk model) {
            this.chunkSeq = model.chunkSeq;
            this.content = model.content;
            this.documentId = model.documentId;
            this.fileName = model.fileName;
            this.score = model.score;
            this.scores = model.scores;
            this.sourceLocation = model.sourceLocation;
            this.titlePath = model.titlePath;
        } 

        /**
         * <p>The sequence number of the chunk within the document.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder chunkSeq(Integer chunkSeq) {
            this.chunkSeq = chunkSeq;
            return this;
        }

        /**
         * <p>The body content of the hit chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBridge supports routing events to multiple target services</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the document to which the hit chunk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-bp1xxxxxxxxxxxx</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The file name of the document to which the hit chunk belongs. This value has the same source as the FileName returned by GetDocument and can be used to render the reference source.</p>
         * 
         * <strong>example:</strong>
         * <p>product-handbook.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The retrieval relevance score. A higher score indicates higher relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.92</p>
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The score details for each stage. Score fields that are not involved in the calculation are not returned.</p>
         */
        public Builder scores(Scores scores) {
            this.scores = scores;
            return this;
        }

        /**
         * <p>The location of the chunk in the original document. p.N indicates page N (PDF). s.N indicates slide N (PPT/PPTX).</p>
         * 
         * <strong>example:</strong>
         * <p>p.3</p>
         */
        public Builder sourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        /**
         * <p>The title path to which the chunk belongs, such as Chapter 1&gt;1.1 Overview.</p>
         * 
         * <strong>example:</strong>
         * <p>Installation Guide&gt;Prerequisites</p>
         */
        public Builder titlePath(String titlePath) {
            this.titlePath = titlePath;
            return this;
        }

        public KnowledgeBaseSearchChunk build() {
            return new KnowledgeBaseSearchChunk(this);
        } 

    } 

    /**
     * 
     * {@link KnowledgeBaseSearchChunk} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseSearchChunk</p>
     */
    public static class Scores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fusion")
        private Double fusion;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private Double keyword;

        @com.aliyun.core.annotation.NameInMap("Rerank")
        private Double rerank;

        @com.aliyun.core.annotation.NameInMap("Vector")
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
             * <p>The score after hybrid search fusion (reciprocal rank fusion or weighted normalization, depending on the active fusion algorithm). Value range: [0, 1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.78</p>
             */
            public Builder fusion(Double fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The normalized score of keyword (full-text) search. Value range: [0, 1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.62</p>
             */
            public Builder keyword(Double keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The score assigned by the rerank model. Value range: [0, 1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.91</p>
             */
            public Builder rerank(Double rerank) {
                this.rerank = rerank;
                return this;
            }

            /**
             * <p>The similarity score of vector retrieval. Value range: [0, 1].</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
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
}
