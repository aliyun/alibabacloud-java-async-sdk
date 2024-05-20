// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowInstanceRequest</p>
 */
public class DescribeWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DescribeWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowInstanceRequest create() {
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
     * @return workflowInstanceId
     */
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowInstanceRequest, Builder> {
        private String projectId; 
        private String workflowInstanceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkflowInstanceRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.workflowInstanceId = request.workflowInstanceId;
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
         * workflowInstanceId.
         */
        public Builder workflowInstanceId(String workflowInstanceId) {
            this.putPathParameter("workflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
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
        public DescribeWorkflowInstanceRequest build() {
            return new DescribeWorkflowInstanceRequest(this);
        } 

    } 

}
