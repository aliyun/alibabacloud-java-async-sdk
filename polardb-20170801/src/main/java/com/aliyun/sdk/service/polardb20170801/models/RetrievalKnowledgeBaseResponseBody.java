// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RetrievalKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>RetrievalKnowledgeBaseResponseBody</p>
 */
public class RetrievalKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCount")
    private Integer resultCount;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private RetrievalKnowledgeBaseResponseBody(Builder builder) {
        this.queryText = builder.queryText;
        this.requestId = builder.requestId;
        this.resultCount = builder.resultCount;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrievalKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCount
     */
    public Integer getResultCount() {
        return this.resultCount;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String queryText; 
        private String requestId; 
        private Integer resultCount; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(RetrievalKnowledgeBaseResponseBody model) {
            this.queryText = model.queryText;
            this.requestId = model.requestId;
            this.resultCount = model.resultCount;
            this.results = model.results;
        } 

        /**
         * QueryText.
         */
        public Builder queryText(String queryText) {
            this.queryText = queryText;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCount.
         */
        public Builder resultCount(Integer resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public RetrievalKnowledgeBaseResponseBody build() {
            return new RetrievalKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrievalKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrievalKnowledgeBaseResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Headings")
        private java.util.List<String> headings;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private java.util.List<Integer> pageNumbers;

        @com.aliyun.core.annotation.NameInMap("ShardContent")
        private String shardContent;

        @com.aliyun.core.annotation.NameInMap("ShardIndex")
        private Integer shardIndex;

        @com.aliyun.core.annotation.NameInMap("SimilarityScore")
        private Double similarityScore;

        private Results(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.headings = builder.headings;
            this.metadata = builder.metadata;
            this.pageNumbers = builder.pageNumbers;
            this.shardContent = builder.shardContent;
            this.shardIndex = builder.shardIndex;
            this.similarityScore = builder.similarityScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return headings
         */
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return pageNumbers
         */
        public java.util.List<Integer> getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return shardContent
         */
        public String getShardContent() {
            return this.shardContent;
        }

        /**
         * @return shardIndex
         */
        public Integer getShardIndex() {
            return this.shardIndex;
        }

        /**
         * @return similarityScore
         */
        public Double getSimilarityScore() {
            return this.similarityScore;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private java.util.List<String> headings; 
            private String metadata; 
            private java.util.List<Integer> pageNumbers; 
            private String shardContent; 
            private Integer shardIndex; 
            private Double similarityScore; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.headings = model.headings;
                this.metadata = model.metadata;
                this.pageNumbers = model.pageNumbers;
                this.shardContent = model.shardContent;
                this.shardIndex = model.shardIndex;
                this.similarityScore = model.similarityScore;
            } 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Headings.
             */
            public Builder headings(java.util.List<String> headings) {
                this.headings = headings;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * PageNumbers.
             */
            public Builder pageNumbers(java.util.List<Integer> pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * ShardContent.
             */
            public Builder shardContent(String shardContent) {
                this.shardContent = shardContent;
                return this;
            }

            /**
             * ShardIndex.
             */
            public Builder shardIndex(Integer shardIndex) {
                this.shardIndex = shardIndex;
                return this;
            }

            /**
             * SimilarityScore.
             */
            public Builder similarityScore(Double similarityScore) {
                this.similarityScore = similarityScore;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
