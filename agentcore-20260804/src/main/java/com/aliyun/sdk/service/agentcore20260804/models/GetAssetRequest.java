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
 * {@link GetAssetRequest} extends {@link RequestModel}
 *
 * <p>GetAssetRequest</p>
 */
public class GetAssetRequest extends Request {
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

    private GetAssetRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetRequest create() {
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

    public static final class Builder extends Request.Builder<GetAssetRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
        } 

        /**
         * <p>The ID of the AgentCore workspace. Magic resolves the tenantId from the trusted gateway call identity and verifies workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. Cross-tenant queries cannot be performed by using only knowledgeBaseId.</p>
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
         * <p>The ID of the knowledge base to which the asset belongs.</p>
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
         * <p>The stable identifier of the asset to be queried.</p>
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

        @Override
        public GetAssetRequest build() {
            return new GetAssetRequest(this);
        } 

    } 

}
