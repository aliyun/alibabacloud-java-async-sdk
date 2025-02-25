// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>OperateWorkflowInstanceRequest</p>
 */
public class OperateWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("execType")
    private String execType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
    private String workflowInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private OperateWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.execType = builder.execType;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateWorkflowInstanceRequest create() {
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
     * @return execType
     */
    public String getExecType() {
        return this.execType;
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

    public static final class Builder extends Request.Builder<OperateWorkflowInstanceRequest, Builder> {
        private String projectId; 
        private String execType; 
        private String workflowInstanceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(OperateWorkflowInstanceRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.execType = request.execType;
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
         * execType.
         */
        public Builder execType(String execType) {
            this.putBodyParameter("execType", execType);
            this.execType = execType;
            return this;
        }

        /**
         * workflowInstanceId.
         */
        public Builder workflowInstanceId(String workflowInstanceId) {
            this.putBodyParameter("workflowInstanceId", workflowInstanceId);
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
        public OperateWorkflowInstanceRequest build() {
            return new OperateWorkflowInstanceRequest(this);
        } 

    } 

}
