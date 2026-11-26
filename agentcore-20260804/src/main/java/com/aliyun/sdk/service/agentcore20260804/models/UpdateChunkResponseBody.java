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
 * {@link UpdateChunkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateChunkResponseBody</p>
 */
public class UpdateChunkResponseBody extends TeaModel {
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

    private UpdateChunkResponseBody(Builder builder) {
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

    public static UpdateChunkResponseBody create() {
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

        private Builder(UpdateChunkResponseBody model) {
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
         * <p>For pure enable or disable operations, COMPLETED and the final state of each item are synchronously returned, indicating that the current write operation is complete. This does not change the original processing status of the asset or guarantee that concurrently published new results inherit the modifications. Polling is not required. When content is included, poll the current status of GetAsset until it reaches COMPLETED or FAILED. For failure reasons, see lastError. GetAsset does not accept clientToken or return chunkUpdate. ACCEPTED does not indicate completion.</p>
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
         * <p>The desensitized result description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successfully processed or accepted. For pure enable or disable operations, the final result of each item is checked. For content edits, you must wait for the asynchronous final state.</li>
         * <li>false: The entire request is rejected due to token expiration, authentication failure, or resource status issues.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateChunkResponseBody build() {
            return new UpdateChunkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChunkResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunkResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkSeq")
        private Integer chunkSeq;

        @com.aliyun.core.annotation.NameInMap("failureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        private Results(Builder builder) {
            this.chunkSeq = builder.chunkSeq;
            this.failureReason = builder.failureReason;
            this.status = builder.status;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return chunkSeq
         */
        public Integer getChunkSeq() {
            return this.chunkSeq;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Integer chunkSeq; 
            private String failureReason; 
            private String status; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.chunkSeq = model.chunkSeq;
                this.failureReason = model.failureReason;
                this.status = model.status;
                this.success = model.success;
            } 

            /**
             * <p>The target sequence number for this modification.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>The desensitized reason for the failure. It does not contain internal task, execution, or physical storage identifiers.</p>
             * 
             * <strong>example:</strong>
             * <p>The target chunk does not exist</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>ACCEPTED indicates that the content edit is accepted but not completed. SUCCEEDED indicates that the pure enable or disable operation has been written to the target determined at the beginning of the request, or the content edit has been published. It is not guaranteed that concurrently published new results will inherit the enable or disable operations. FAILED indicates that the item is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>ACCEPTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Returned only in the final state. The value is true for SUCCEEDED and false for FAILED. This parameter is not returned for ACCEPTED. An accepted state cannot be treated as a successful write. This parameter is independent of the top-level success parameter, which indicates request acceptance or query success.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateChunkResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunkResponseBody</p>
     */
    public static class ChunkUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientToken")
        private String clientToken;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private ChunkUpdate(Builder builder) {
            this.clientToken = builder.clientToken;
            this.expiresAt = builder.expiresAt;
            this.failedCount = builder.failedCount;
            this.results = builder.results;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkUpdate create() {
            return builder().build();
        }

        /**
         * @return clientToken
         */
        public String getClientToken() {
            return this.clientToken;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String clientToken; 
            private String expiresAt; 
            private Integer failedCount; 
            private java.util.List<Results> results; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ChunkUpdate model) {
                this.clientToken = model.clientToken;
                this.expiresAt = model.expiresAt;
                this.failedCount = model.failedCount;
                this.results = model.results;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Only asynchronous content edits return the clientToken of the original UpdateChunk for idempotent retries. GetAsset does not accept or return the clientToken. Pure enable or disable operations do not create asynchronous receipts. If the same token is reused with different parameters within the same asset, IdempotencyConflict is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>chunk-update-001</p>
             */
            public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
            }

            /**
             * <p>The reserved expiration time for idempotent result retention. This field is not currently outputted and is not used as a basis for document status queries or automatic retries.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-03T02:05:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The number of FAILED items in this request. When asynchronous content edits are still in the ACCEPTED state, a value of 0 does not indicate a successful modification.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The itemized results of the current UpdateChunk or UpdateChunks request. Synchronous enable or disable operations return SUCCEEDED or FAILED, and batch operations allow partial success. Content edits first return ACCEPTED, and idempotent replays may return recorded processing results. You can determine whether the current document is completed by checking the status returned by GetAsset. The itemized results are independent of the top-level success parameter.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The number of chunks submitted in this request. The value is 1 for UpdateChunk, and 1 to 100 for UpdateChunks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ChunkUpdate build() {
                return new ChunkUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateChunkResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunkResponseBody</p>
     */
    public static class LastError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private LastError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(LastError model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The stable product error code. It does not return internal task identifiers, stack traces, or storage addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>ProcessingFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The desensitized error summary that can be displayed to users.</p>
             * 
             * <strong>example:</strong>
             * <p>File parsing failed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public LastError build() {
                return new LastError(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateChunkResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunkResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("chunkUpdate")
        private ChunkUpdate chunkUpdate;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private LastError lastError;

        @com.aliyun.core.annotation.NameInMap("publishedResultAvailable")
        private Boolean publishedResultAvailable;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.assetId = builder.assetId;
            this.chunkUpdate = builder.chunkUpdate;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.lastError = builder.lastError;
            this.publishedResultAvailable = builder.publishedResultAvailable;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return chunkUpdate
         */
        public ChunkUpdate getChunkUpdate() {
            return this.chunkUpdate;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return lastError
         */
        public LastError getLastError() {
            return this.lastError;
        }

        /**
         * @return publishedResultAvailable
         */
        public Boolean getPublishedResultAvailable() {
            return this.publishedResultAvailable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String assetId; 
            private ChunkUpdate chunkUpdate; 
            private String knowledgeBaseId; 
            private LastError lastError; 
            private Boolean publishedResultAvailable; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetId = model.assetId;
                this.chunkUpdate = model.chunkUpdate;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.lastError = model.lastError;
                this.publishedResultAvailable = model.publishedResultAvailable;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The target asset for processing.</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The itemized results returned by UpdateChunk or UpdateChunks. Synchronous enable or disable operations directly return the final results. Asynchronous content edits return the acceptance results, and idempotent replays return the recorded request results. You can query the current status of the document by calling GetAsset. GetAsset does not return this field. The itemized results are not represented by the top-level success parameter of the API operation.</p>
             */
            public Builder chunkUpdate(ChunkUpdate chunkUpdate) {
                this.chunkUpdate = chunkUpdate;
                return this;
            }

            /**
             * <p>The target knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-001</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The desensitized error summary of the current processing.</p>
             */
            public Builder lastError(LastError lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The availability of the published result, considering disabled states and tombstones.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publishedResultAvailable(Boolean publishedResultAvailable) {
                this.publishedResultAvailable = publishedResultAvailable;
                return this;
            }

            /**
             * <p>The acceptance or execution result of UpdateChunk or UpdateChunks. The COMPLETED status in the synchronous chunk enable or disable response only indicates that the current write operation is complete, and does not change the original processing status of the asset. The acceptance and idempotent replay results of asynchronous content edits do not represent the current status of the document. You can query the document status by calling GetAsset.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The target workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-001</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
