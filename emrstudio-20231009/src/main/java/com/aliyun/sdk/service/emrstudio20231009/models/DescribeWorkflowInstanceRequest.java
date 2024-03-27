// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowInstanceRequest</p>
 */
public class DescribeWorkflowInstanceRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private Long projectId;

    @Path
    @NameInMap("workflowInstanceId")
    private Integer workflowInstanceId;

    @Query
    @NameInMap("workspaceId")
    private Long workspaceId;

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
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return workflowInstanceId
     */
    public Integer getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowInstanceRequest, Builder> {
        private Long projectId; 
        private Integer workflowInstanceId; 
        private Long workspaceId; 

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
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * workflowInstanceId.
         */
        public Builder workflowInstanceId(Integer workflowInstanceId) {
            this.putPathParameter("workflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
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
        public DescribeWorkflowInstanceRequest build() {
            return new DescribeWorkflowInstanceRequest(this);
        } 

    } 

}
