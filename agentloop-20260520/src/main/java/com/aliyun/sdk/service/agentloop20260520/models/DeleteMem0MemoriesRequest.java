// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DeleteMem0MemoriesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMem0MemoriesRequest</p>
 */
public class DeleteMem0MemoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_id")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("context_store_id")
    private String contextStoreId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("org_id")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("project_id")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("run_id")
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private DeleteMem0MemoriesRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.contextStoreId = builder.contextStoreId;
        this.metadata = builder.metadata;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.runId = builder.runId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMem0MemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return contextStoreId
     */
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteMem0MemoriesRequest, Builder> {
        private String agentSpace; 
        private String agentId; 
        private String appId; 
        private String contextStoreId; 
        private java.util.Map<String, ?> metadata; 
        private String orgId; 
        private String projectId; 
        private String runId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMem0MemoriesRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.agentId = request.agentId;
            this.appId = request.appId;
            this.contextStoreId = request.contextStoreId;
            this.metadata = request.metadata;
            this.orgId = request.orgId;
            this.projectId = request.projectId;
            this.runId = request.runId;
            this.userId = request.userId;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * agent_id.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * app_id.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("app_id", appId);
            this.appId = appId;
            return this;
        }

        /**
         * context_store_id.
         */
        public Builder contextStoreId(String contextStoreId) {
            this.putQueryParameter("context_store_id", contextStoreId);
            this.contextStoreId = contextStoreId;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            String metadataShrink = shrink(metadata, "metadata", "json");
            this.putQueryParameter("metadata", metadataShrink);
            this.metadata = metadata;
            return this;
        }

        /**
         * org_id.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("org_id", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * project_id.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * run_id.
         */
        public Builder runId(String runId) {
            this.putQueryParameter("run_id", runId);
            this.runId = runId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteMem0MemoriesRequest build() {
            return new DeleteMem0MemoriesRequest(this);
        } 

    } 

}
