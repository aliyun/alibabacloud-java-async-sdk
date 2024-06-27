// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadDocumentJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadDocumentJobResponseBody</p>
 */
public class GetUploadDocumentJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkResult")
    private ChunkResult chunkResult;

    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Usage usage;

    private GetUploadDocumentJobResponseBody(Builder builder) {
        this.chunkResult = builder.chunkResult;
        this.job = builder.job;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadDocumentJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return chunkResult
     */
    public ChunkResult getChunkResult() {
        return this.chunkResult;
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private ChunkResult chunkResult; 
        private Job job; 
        private String message; 
        private String requestId; 
        private String status; 
        private Usage usage; 

        /**
         * The chunking result.
         */
        public Builder chunkResult(ChunkResult chunkResult) {
            this.chunkResult = chunkResult;
            return this;
        }

        /**
         * The information about the document upload job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the operation. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The number of tokens that are used for document understanding or embedding.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetUploadDocumentJobResponseBody build() {
            return new GetUploadDocumentJobResponseBody(this);
        } 

    } 

    public static class ChunkResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkFileUrl")
        private String chunkFileUrl;

        @com.aliyun.core.annotation.NameInMap("PlainChunkFileUrl")
        private String plainChunkFileUrl;

        private ChunkResult(Builder builder) {
            this.chunkFileUrl = builder.chunkFileUrl;
            this.plainChunkFileUrl = builder.plainChunkFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkResult create() {
            return builder().build();
        }

        /**
         * @return chunkFileUrl
         */
        public String getChunkFileUrl() {
            return this.chunkFileUrl;
        }

        /**
         * @return plainChunkFileUrl
         */
        public String getPlainChunkFileUrl() {
            return this.plainChunkFileUrl;
        }

        public static final class Builder {
            private String chunkFileUrl; 
            private String plainChunkFileUrl; 

            /**
             * The URL of the file after chunking. The validity period of the URL is 2 hours. The file is in the JSONL format. Each line is in the `{"page_content":"*****", "metadata": {"**":"***","**":"***"}` format.
             */
            public Builder chunkFileUrl(String chunkFileUrl) {
                this.chunkFileUrl = chunkFileUrl;
                return this;
            }

            /**
             * The URL of the file that does not contain metadata after chunking. The validity period of the URL is 2 hours. The file is in the TXT format. Each line is a chunk. The file can be easily used for embedding.
             */
            public Builder plainChunkFileUrl(String plainChunkFileUrl) {
                this.plainChunkFileUrl = plainChunkFileUrl;
                return this;
            }

            public ChunkResult build() {
                return new ChunkResult(this);
            } 

        } 

    }
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Job(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.id = builder.id;
            this.progress = builder.progress;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public Boolean getCompleted() {
            return this.completed;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean completed; 
            private String createTime; 
            private String error; 
            private String id; 
            private Integer progress; 
            private String status; 
            private String updateTime; 

            /**
             * Indicates whether the operation is complete.
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The error message.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The progress of the document upload job. Unit: %. A value of 100 indicates that the job is complete.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of the job. Valid values: Valid values:
             * <p>
             * 
             * *   Success
             * *   Failed (See the Error parameter for failure reasons.)
             * *   Cancelling
             * *   Cancelled
             * *   Start
             * *   Running
             * *   Pending
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the job was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbeddingEntries")
        private Integer embeddingEntries;

        @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
        private Integer embeddingTokens;

        private Usage(Builder builder) {
            this.embeddingEntries = builder.embeddingEntries;
            this.embeddingTokens = builder.embeddingTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return embeddingEntries
         */
        public Integer getEmbeddingEntries() {
            return this.embeddingEntries;
        }

        /**
         * @return embeddingTokens
         */
        public Integer getEmbeddingTokens() {
            return this.embeddingTokens;
        }

        public static final class Builder {
            private Integer embeddingEntries; 
            private Integer embeddingTokens; 

            /**
             * EmbeddingEntries.
             */
            public Builder embeddingEntries(Integer embeddingEntries) {
                this.embeddingEntries = embeddingEntries;
                return this;
            }

            /**
             * The number of tokens that are used for vectorization.
             * <p>
             * 
             * >  A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.
             */
            public Builder embeddingTokens(Integer embeddingTokens) {
                this.embeddingTokens = embeddingTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
