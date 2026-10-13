// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateContextDatabaseSyncJobRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseSyncJobRequest</p>
 */
public class CreateContextDatabaseSyncJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.Map<String, ?> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetKnowledgeBaseId")
    private String targetKnowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetKnowledgeBaseName")
    private String targetKnowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateContextDatabaseSyncJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.filters = builder.filters;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.name = builder.name;
        this.sourceId = builder.sourceId;
        this.targetId = builder.targetId;
        this.targetKnowledgeBaseId = builder.targetKnowledgeBaseId;
        this.targetKnowledgeBaseName = builder.targetKnowledgeBaseName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseSyncJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetKnowledgeBaseId
     */
    public String getTargetKnowledgeBaseId() {
        return this.targetKnowledgeBaseId;
    }

    /**
     * @return targetKnowledgeBaseName
     */
    public String getTargetKnowledgeBaseName() {
        return this.targetKnowledgeBaseName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseSyncJobRequest, Builder> {
        private String clientToken; 
        private java.util.Map<String, ?> filters; 
        private String knowledgeBaseId; 
        private String name; 
        private String sourceId; 
        private String targetId; 
        private String targetKnowledgeBaseId; 
        private String targetKnowledgeBaseName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseSyncJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.filters = request.filters;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.name = request.name;
            this.sourceId = request.sourceId;
            this.targetId = request.targetId;
            this.targetKnowledgeBaseId = request.targetKnowledgeBaseId;
            this.targetKnowledgeBaseName = request.targetKnowledgeBaseName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The idempotence token.</p>
         * 
         * <strong>example:</strong>
         * <p>sync-connection-20260923-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;include&quot;:[&quot;/R&amp;D Documents/<strong>&quot;],&quot;exclude&quot;:[&quot;/Archived Documents/</strong>&quot;],&quot;excludedDocumentIds&quot;:[],&quot;sizeLimit&quot;:2147483648,&quot;typeAllowlist&quot;:[&quot;docx&quot;,&quot;pdf&quot;]}</p>
         */
        public Builder filters(java.util.Map<String, ?> filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The ID of the target knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-as1llqmkol****</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The name of the import task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Team Document Import</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The data source ID, a UUID generated by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The target ID, a UUID generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The target knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder targetKnowledgeBaseId(String targetKnowledgeBaseId) {
            this.putQueryParameter("TargetKnowledgeBaseId", targetKnowledgeBaseId);
            this.targetKnowledgeBaseId = targetKnowledgeBaseId;
            return this;
        }

        /**
         * <p>The target knowledge base name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Name</p>
         */
        public Builder targetKnowledgeBaseName(String targetKnowledgeBaseName) {
            this.putQueryParameter("TargetKnowledgeBaseName", targetKnowledgeBaseName);
            this.targetKnowledgeBaseName = targetKnowledgeBaseName;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateContextDatabaseSyncJobRequest build() {
            return new CreateContextDatabaseSyncJobRequest(this);
        } 

    } 

}
