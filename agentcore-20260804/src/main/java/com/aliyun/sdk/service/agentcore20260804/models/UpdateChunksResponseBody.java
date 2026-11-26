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
 * {@link UpdateChunksResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateChunksResponseBody</p>
 */
public class UpdateChunksResponseBody extends TeaModel {
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

    private UpdateChunksResponseBody(Builder builder) {
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

    public static UpdateChunksResponseBody create() {
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

        private Builder(UpdateChunksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>同步返回 COMPLETED 表示本次写入结束，不改变资产原有处理状态；逐项返回 SUCCEEDED 或 FAILED，允许部分成功，不保证整批原子性或并发发布的新结果继承本次修改。无需轮询。</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>true 表示请求已处理，不表示每一项都成功；检查 results 和 failedCount。令牌过期或资源状态等整次拒绝时为 false。</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateChunksResponseBody build() {
            return new UpdateChunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChunksResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunksResponseBody</p>
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
             * <p>本次修改的目标序号。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>失败时的脱敏原因；不包含内部任务、执行或物理存储标识。</p>
             * 
             * <strong>example:</strong>
             * <p>目标 Chunk 不存在。</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>ACCEPTED 表示内容编辑已受理但未完成；SUCCEEDED 表示纯启停已写入请求开始确定的目标或内容编辑已发布；不承诺并发发布的新结果继承启停。FAILED 表示该项未完成。</p>
             * 
             * <strong>example:</strong>
             * <p>ACCEPTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>仅终态返回：SUCCEEDED 为 true，FAILED 为 false；ACCEPTED 时不返回，不能将已受理当成写入成功。与表示请求受理或查询成功的接口顶层 success 独立。</p>
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
     * {@link UpdateChunksResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunksResponseBody</p>
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
             * <p>仅异步内容编辑返回原 UpdateChunk 的 clientToken，用于幂等重试；GetAsset 不接收或返回 clientToken。纯启停不创建异步回执。同一资产内不同参数复用同 token 返回 IdempotencyConflict。</p>
             * 
             * <strong>example:</strong>
             * <p>chunk-update-001</p>
             */
            public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
            }

            /**
             * <p>预留的幂等结果保留截止时间，当前未输出；不作为文档状态查询或自动重试的依据。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-03T02:05:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>本次 FAILED 项数量；异步内容编辑仍为 ACCEPTED 时，不能将 0 视为修改成功。</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>本次 UpdateChunk 或 UpdateChunks 的逐项结果。纯启停同步返回 SUCCEEDED/FAILED，批量允许部分成功；内容编辑先返回 ACCEPTED，幂等重放可返回已记录的处理结果。当前文档是否完成通过 GetAsset 的 status 判断。逐项结果与顶层 success 独立。</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>本次提交的 Chunk 数量；UpdateChunk 为 1，UpdateChunks 为 1 至 100。</p>
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
     * {@link UpdateChunksResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunksResponseBody</p>
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
             * <p>稳定的产品错误码；不返回内部任务标识、堆栈或存储地址。</p>
             * 
             * <strong>example:</strong>
             * <p>ProcessingFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>可向用户展示的脱敏错误摘要。</p>
             * 
             * <strong>example:</strong>
             * <p>文件解析失败。</p>
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
     * {@link UpdateChunksResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChunksResponseBody</p>
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
             * <p>处理目标资产。</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>UpdateChunk 或 UpdateChunks 返回的逐项结果。同步启停直接返回最终结果；异步内容编辑返回受理结果，幂等重放返回已记录的请求结果。文档当前状态通过 GetAsset 查询，GetAsset 不返回此字段。逐项结果不由接口顶层 success 表示。</p>
             */
            public Builder chunkUpdate(ChunkUpdate chunkUpdate) {
                this.chunkUpdate = chunkUpdate;
                return this;
            }

            /**
             * <p>目标知识库。</p>
             * 
             * <strong>example:</strong>
             * <p>kb-001</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>当前处理的脱敏错误摘要。</p>
             */
            public Builder lastError(LastError lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>考虑禁用和墓碑后的已发布结果可用性。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publishedResultAvailable(Boolean publishedResultAvailable) {
                this.publishedResultAvailable = publishedResultAvailable;
                return this;
            }

            /**
             * <p>UpdateChunk 或 UpdateChunks 的受理或执行结果；同步 Chunk 启停响应的 COMPLETED 仅表示本次写入结束，不改变资产原处理状态。异步内容编辑的受理和幂等重放结果不代表文档当前状态，文档状态通过 GetAsset 查询。</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>ISO 8601 UTC 时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>目标工作空间。</p>
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
