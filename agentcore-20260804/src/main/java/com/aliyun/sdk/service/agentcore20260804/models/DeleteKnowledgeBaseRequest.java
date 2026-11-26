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
 * {@link DeleteKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteKnowledgeBaseRequest</p>
 */
public class DeleteKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    private DeleteKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeBaseRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteKnowledgeBaseRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeBaseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
        } 

        /**
         * <p>Resolves the tenant ID from the trusted gateway through Magic and verifies workspace ownership. A knowledge base is created or accessed within this tenant and workspace. Cross-tenant queries are not supported by using only the knowledge base ID.</p>
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
         * <p>The unique identifier of the knowledge base.</p>
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

        @Override
        public DeleteKnowledgeBaseRequest build() {
            return new DeleteKnowledgeBaseRequest(this);
        } 

    } 

}
