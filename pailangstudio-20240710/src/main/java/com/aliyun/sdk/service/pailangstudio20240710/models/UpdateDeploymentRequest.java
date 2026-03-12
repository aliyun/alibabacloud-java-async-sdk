// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link UpdateDeploymentRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeploymentRequest</p>
 */
public class UpdateDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoApproval")
    private Boolean autoApproval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentConfig")
    private String deploymentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StageAction")
    private String stageAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDeploymentRequest(Builder builder) {
        super(builder);
        this.deploymentId = builder.deploymentId;
        this.autoApproval = builder.autoApproval;
        this.deploymentConfig = builder.deploymentConfig;
        this.description = builder.description;
        this.stageAction = builder.stageAction;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeploymentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return autoApproval
     */
    public Boolean getAutoApproval() {
        return this.autoApproval;
    }

    /**
     * @return deploymentConfig
     */
    public String getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return stageAction
     */
    public String getStageAction() {
        return this.stageAction;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDeploymentRequest, Builder> {
        private String deploymentId; 
        private Boolean autoApproval; 
        private String deploymentConfig; 
        private String description; 
        private String stageAction; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeploymentRequest request) {
            super(request);
            this.deploymentId = request.deploymentId;
            this.autoApproval = request.autoApproval;
            this.deploymentConfig = request.deploymentConfig;
            this.description = request.description;
            this.stageAction = request.stageAction;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DeploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.putPathParameter("DeploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * AutoApproval.
         */
        public Builder autoApproval(Boolean autoApproval) {
            this.putBodyParameter("AutoApproval", autoApproval);
            this.autoApproval = autoApproval;
            return this;
        }

        /**
         * DeploymentConfig.
         */
        public Builder deploymentConfig(String deploymentConfig) {
            this.putBodyParameter("DeploymentConfig", deploymentConfig);
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * StageAction.
         */
        public Builder stageAction(String stageAction) {
            this.putBodyParameter("StageAction", stageAction);
            this.stageAction = stageAction;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDeploymentRequest build() {
            return new UpdateDeploymentRequest(this);
        } 

    } 

}
