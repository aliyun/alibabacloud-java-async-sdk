// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskInstanceRequest</p>
 */
public class DescribeTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowInstanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DescribeTaskInstanceRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.taskInstanceId = builder.taskInstanceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInstanceRequest create() {
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
     * @return taskInstanceId
     */
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeTaskInstanceRequest, Builder> {
        private String projectId; 
        private String workflowInstanceId; 
        private String taskInstanceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskInstanceRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.workflowInstanceId = request.workflowInstanceId;
            this.taskInstanceId = request.taskInstanceId;
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
         * taskInstanceId.
         */
        public Builder taskInstanceId(String taskInstanceId) {
            this.putPathParameter("taskInstanceId", taskInstanceId);
            this.taskInstanceId = taskInstanceId;
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
        public DescribeTaskInstanceRequest build() {
            return new DescribeTaskInstanceRequest(this);
        } 

    } 

}
