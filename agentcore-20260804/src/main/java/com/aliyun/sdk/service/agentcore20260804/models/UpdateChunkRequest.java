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
 * {@link UpdateChunkRequest} extends {@link RequestModel}
 *
 * <p>UpdateChunkRequest</p>
 */
public class UpdateChunkRequest extends Request {
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

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("chunkSeq")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer chunkSeq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateChunkRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.chunkSeq = builder.chunkSeq;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChunkRequest create() {
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
     * @return chunkSeq
     */
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    /**
     * @return body
     */
    public UpdateChunkRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateChunkRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private Integer chunkSeq; 
        private UpdateChunkRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.chunkSeq = request.chunkSeq;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The system resolves the tenantId from the trusted gateway and validates the workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. You cannot query across tenants by using only the knowledgeBaseId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The unique identifier of the knowledge base to which the asset belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The stable identifier of the asset to which the chunk to be updated belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asset-001</p>
         */
        public Builder assetId(String assetId) {
            this.putPathParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>The logical sequence number of the chunk within the asset, starting from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder chunkSeq(Integer chunkSeq) {
            this.putPathParameter("chunkSeq", chunkSeq);
            this.chunkSeq = chunkSeq;
            return this;
        }

        /**
         * <p>You must provide the chunkToken and at least one of the content or enabled parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateChunkRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Required when modifying the content. Used for idempotent retries of asynchronous edits. This parameter is not used as a query parameter for GetAsset. If the same token is used with different parameters, IdempotencyConflict is returned. This parameter can be omitted when only modifying the enabled status, and no asynchronous receipt is created.</p>
         * 
         * <strong>example:</strong>
         * <p>chunk-update-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateChunkRequest build() {
            return new UpdateChunkRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChunkRequest} extends {@link TeaModel}
     *
     * <p>UpdateChunkRequest</p>
     */
    public static class UpdateChunkRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkToken")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chunkToken;

        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(maxLength = 32768)
        private String content;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private UpdateChunkRequestBody(Builder builder) {
            this.chunkToken = builder.chunkToken;
            this.content = builder.content;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateChunkRequestBody create() {
            return builder().build();
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
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String chunkToken; 
            private String content; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(UpdateChunkRequestBody model) {
                this.chunkToken = model.chunkToken;
                this.content = model.content;
                this.enabled = model.enabled;
            } 

            /**
             * <p>Pass back the chunkToken returned by GetChunk, ListChunks, or SearchKnowledgeBase as is. Do not parse or generate it yourself. If the token has expired at the beginning of the request, Chunk.VersionConflict is returned.</p>
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
             * <p>Replaces the chunk content. The maximum length is 32,768 characters. Affected vectors are regenerated before the new generation is published. If omitted, the original content is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>Welcome to the product</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Specifies whether the chunk is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.
             * Enabling or disabling only modifies the published result determined at the beginning of the request, and does not follow new results during the process. Indexes are synchronized asynchronously, which may cause a brief delay in retrieval. If omitted, the original enabled status is retained.</li>
             * </ul>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public UpdateChunkRequestBody build() {
                return new UpdateChunkRequestBody(this);
            } 

        } 

    }
}
