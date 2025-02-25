// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowRequest</p>
 */
public class DescribeWorkflowRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private Long projectId;

    @Path
    @NameInMap("workflowId")
    @Validation(required = true)
    private Long workflowId;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private Long workspaceId;

    private DescribeWorkflowRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.workflowId = builder.workflowId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowRequest, Builder> {
        private Long projectId; 
        private Long workflowId; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkflowRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.workflowId = request.workflowId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(Long workflowId) {
            this.putPathParameter("workflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeWorkflowRequest build() {
            return new DescribeWorkflowRequest(this);
        } 

    } 

}
