// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskRequest</p>
 */
public class DescribeTaskRequest extends Request {
    @Path
    @NameInMap("workflowId")
    @Validation(required = true)
    private String workflowId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DescribeTaskRequest(Builder builder) {
        super(builder);
        this.workflowId = builder.workflowId;
        this.projectId = builder.projectId;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeTaskRequest, Builder> {
        private String workflowId; 
        private String projectId; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskRequest request) {
            super(request);
            this.workflowId = request.workflowId;
            this.projectId = request.projectId;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
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
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
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
        public DescribeTaskRequest build() {
            return new DescribeTaskRequest(this);
        } 

    } 

}
