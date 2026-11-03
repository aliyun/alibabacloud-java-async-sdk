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
 * {@link UpdateContextDatabaseSyncJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextDatabaseSyncJobRequest</p>
 */
public class UpdateContextDatabaseSyncJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.Map<String, ?> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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

    private UpdateContextDatabaseSyncJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enabled = builder.enabled;
        this.filters = builder.filters;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.targetKnowledgeBaseId = builder.targetKnowledgeBaseId;
        this.targetKnowledgeBaseName = builder.targetKnowledgeBaseName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextDatabaseSyncJobRequest create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<UpdateContextDatabaseSyncJobRequest, Builder> {
        private String clientToken; 
        private Boolean enabled; 
        private java.util.Map<String, ?> filters; 
        private String jobId; 
        private String name; 
        private String targetKnowledgeBaseId; 
        private String targetKnowledgeBaseName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextDatabaseSyncJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enabled = request.enabled;
            this.filters = request.filters;
            this.jobId = request.jobId;
            this.name = request.name;
            this.targetKnowledgeBaseId = request.targetKnowledgeBaseId;
            this.targetKnowledgeBaseName = request.targetKnowledgeBaseName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The idempotency token.</p>
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
         * <p>Specifies whether the task is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;include&quot;:[&quot;/R&amp;D documents/<strong>&quot;],&quot;exclude&quot;:[&quot;/Archived documents/</strong>&quot;],&quot;excludedDocumentIds&quot;:[],&quot;sizeLimit&quot;:2147483648,&quot;typeAllowlist&quot;:[&quot;docx&quot;,&quot;pdf&quot;]}</p>
         */
        public Builder filters(java.util.Map<String, ?> filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The job ID, which is a UUID generated by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name.</p>
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
         * <p>The ID of the target knowledge base.</p>
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
         * <p>The name of the target knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
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
        public UpdateContextDatabaseSyncJobRequest build() {
            return new UpdateContextDatabaseSyncJobRequest(this);
        } 

    } 

}
