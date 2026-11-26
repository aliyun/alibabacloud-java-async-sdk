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
 * {@link UpdateChunksRequest} extends {@link RequestModel}
 *
 * <p>UpdateChunksRequest</p>
 */
public class UpdateChunksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("assetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateChunksRequestBody body;

    private UpdateChunksRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChunksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return body
     */
    public UpdateChunksRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateChunksRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private UpdateChunksRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChunksRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.body = request.body;
        } 

        /**
         * <p>由 Magic 从可信网关调用身份解析 tenantId 并校验工作空间归属；知识库在该租户及工作空间内创建或访问，不能仅凭 knowledgeBaseId 跨租户查询。</p>
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder assetId(String assetId) {
            this.putPathParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>同一资产内最多 100 条。</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateChunksRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateChunksRequest build() {
            return new UpdateChunksRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChunksRequest} extends {@link TeaModel}
     *
     * <p>UpdateChunksRequest</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkSeq")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
        private Integer chunkSeq;

        @com.aliyun.core.annotation.NameInMap("chunkToken")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkToken;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        private Chunks(Builder builder) {
            this.chunkSeq = builder.chunkSeq;
            this.chunkToken = builder.chunkToken;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
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
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Integer chunkSeq; 
            private String chunkToken; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.chunkSeq = model.chunkSeq;
                this.chunkToken = model.chunkToken;
                this.enabled = model.enabled;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>原样回传查询返回的 chunkToken，请求开始已过期返回 Chunk.VersionConflict。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder chunkToken(String chunkToken) {
                this.chunkToken = chunkToken;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateChunksRequest} extends {@link TeaModel}
     *
     * <p>UpdateChunksRequest</p>
     */
    public static class UpdateChunksRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Chunks> chunks;

        private UpdateChunksRequestBody(Builder builder) {
            this.chunks = builder.chunks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateChunksRequestBody create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<Chunks> getChunks() {
            return this.chunks;
        }

        public static final class Builder {
            private java.util.List<Chunks> chunks; 

            private Builder() {
            } 

            private Builder(UpdateChunksRequestBody model) {
                this.chunks = model.chunks;
            } 

            /**
             * <p>1 至 100 项，chunkSeq 不得重复。按请求开始读取的已发布结果校验所有令牌并固定写入目标。</p>
             * <p>This parameter is required.</p>
             */
            public Builder chunks(java.util.List<Chunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            public UpdateChunksRequestBody build() {
                return new UpdateChunksRequestBody(this);
            } 

        } 

    }
}
