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
 * {@link DescribeKnowledgeBaseAnswerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseAnswerResponseBody</p>
 */
public class DescribeKnowledgeBaseAnswerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("CompletionTokens")
    private Integer completionTokens;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorType")
    private String errorType;

    @com.aliyun.core.annotation.NameInMap("LLMModelId")
    private String LLMModelId;

    @com.aliyun.core.annotation.NameInMap("PromptTokens")
    private Integer promptTokens;

    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeKnowledgeBaseAnswerResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.answer = builder.answer;
        this.completionTokens = builder.completionTokens;
        this.errorMessage = builder.errorMessage;
        this.errorType = builder.errorType;
        this.LLMModelId = builder.LLMModelId;
        this.promptTokens = builder.promptTokens;
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
        this.sources = builder.sources;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseAnswerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return completionTokens
     */
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @return LLMModelId
     */
    public String getLLMModelId() {
        return this.LLMModelId;
    }

    /**
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sources
     */
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentId; 
        private String answer; 
        private Integer completionTokens; 
        private String errorMessage; 
        private String errorType; 
        private String LLMModelId; 
        private Integer promptTokens; 
        private String queryId; 
        private String requestId; 
        private java.util.List<Sources> sources; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseAnswerResponseBody model) {
            this.agentId = model.agentId;
            this.answer = model.answer;
            this.completionTokens = model.completionTokens;
            this.errorMessage = model.errorMessage;
            this.errorType = model.errorType;
            this.LLMModelId = model.LLMModelId;
            this.promptTokens = model.promptTokens;
            this.queryId = model.queryId;
            this.requestId = model.requestId;
            this.sources = model.sources;
            this.status = model.status;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * CompletionTokens.
         */
        public Builder completionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
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
         * ErrorType.
         */
        public Builder errorType(String errorType) {
            this.errorType = errorType;
            return this;
        }

        /**
         * LLMModelId.
         */
        public Builder LLMModelId(String LLMModelId) {
            this.LLMModelId = LLMModelId;
            return this;
        }

        /**
         * PromptTokens.
         */
        public Builder promptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sources.
         */
        public Builder sources(java.util.List<Sources> sources) {
            this.sources = sources;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeKnowledgeBaseAnswerResponseBody build() {
            return new DescribeKnowledgeBaseAnswerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBaseAnswerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseAnswerResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkMetadata")
        private java.util.Map<String, ?> chunkMetadata;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private java.util.List<Integer> pageNumbers;

        @com.aliyun.core.annotation.NameInMap("ShardContent")
        private String shardContent;

        @com.aliyun.core.annotation.NameInMap("ShardIndex")
        private Integer shardIndex;

        @com.aliyun.core.annotation.NameInMap("SimilarityScore")
        private Double similarityScore;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private Integer sourceId;

        private Sources(Builder builder) {
            this.chunkMetadata = builder.chunkMetadata;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.metadata = builder.metadata;
            this.pageNumbers = builder.pageNumbers;
            this.shardContent = builder.shardContent;
            this.shardIndex = builder.shardIndex;
            this.similarityScore = builder.similarityScore;
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return chunkMetadata
         */
        public java.util.Map<String, ?> getChunkMetadata() {
            return this.chunkMetadata;
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
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
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

        /**
         * @return sourceId
         */
        public Integer getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> chunkMetadata; 
            private String fileId; 
            private String fileName; 
            private String knowledgeBaseId; 
            private java.util.Map<String, ?> metadata; 
            private java.util.List<Integer> pageNumbers; 
            private String shardContent; 
            private Integer shardIndex; 
            private Double similarityScore; 
            private Integer sourceId; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.chunkMetadata = model.chunkMetadata;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.metadata = model.metadata;
                this.pageNumbers = model.pageNumbers;
                this.shardContent = model.shardContent;
                this.shardIndex = model.shardIndex;
                this.similarityScore = model.similarityScore;
                this.sourceId = model.sourceId;
            } 

            /**
             * ChunkMetadata.
             */
            public Builder chunkMetadata(java.util.Map<String, ?> chunkMetadata) {
                this.chunkMetadata = chunkMetadata;
                return this;
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
             * KnowledgeBaseId.
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
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

            /**
             * SourceId.
             */
            public Builder sourceId(Integer sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
