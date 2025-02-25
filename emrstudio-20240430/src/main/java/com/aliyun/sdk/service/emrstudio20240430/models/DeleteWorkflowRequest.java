// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWorkflowRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkflowRequest</p>
 */
public class DeleteWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteWorkflowRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.workflowId = builder.workflowId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteWorkflowRequest, Builder> {
        private String projectId; 
        private String workflowId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkflowRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.workflowId = request.workflowId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putPathParameter("workflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteWorkflowRequest build() {
            return new DeleteWorkflowRequest(this);
        } 

    } 

}
