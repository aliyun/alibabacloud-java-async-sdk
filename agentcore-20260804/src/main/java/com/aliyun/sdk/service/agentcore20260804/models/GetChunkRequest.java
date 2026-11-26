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
 * {@link GetChunkRequest} extends {@link RequestModel}
 *
 * <p>GetChunkRequest</p>
 */
public class GetChunkRequest extends Request {
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

    private GetChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.chunkSeq = builder.chunkSeq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChunkRequest create() {
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

    public static final class Builder extends Request.Builder<GetChunkRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private Integer chunkSeq; 

        private Builder() {
            super();
        } 

        private Builder(GetChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.chunkSeq = request.chunkSeq;
        } 

        /**
         * <p>Resolves the tenant ID and verifies workspace ownership through a trusted gateway call by Magic. Knowledge bases are created or accessed within this tenant and workspace. Cross-tenant queries cannot be performed by using only the knowledge base ID.</p>
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
         * <p>The stable identifier of the asset to which the chunk to be queried belongs.</p>
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
         * <p>The 1-based logical sequence number of the chunk within the asset.</p>
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

        @Override
        public GetChunkRequest build() {
            return new GetChunkRequest(this);
        } 

    } 

}
