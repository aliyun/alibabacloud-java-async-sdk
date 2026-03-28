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
         * <p>Deployment job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dploy-asdf******1234</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putPathParameter("DeploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>Indicates whether to automatically skip the deployment confirmation step.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoApproval(Boolean autoApproval) {
            this.putBodyParameter("AutoApproval", autoApproval);
            this.autoApproval = autoApproval;
            return this;
        }

        /**
         * <p>Service Configuration for deployment. For more information, see the <a href="https://help.aliyun.com/zh/pai/user-guide/parameters-of-model-services">deployment configuration</a> of PAI-EAS.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;langstudio_2026<em><strong><em><strong>3848_jro7&quot;,&quot;instance&quot;:1,&quot;workspace_id&quot;:&quot;285</strong></em>&quot;,&quot;enable_webservice&quot;:false},&quot;cloud&quot;:{&quot;computing&quot;:{&quot;instances&quot;:[{&quot;type&quot;:&quot;ecs.g7.xlarge&quot;}]},&quot;networking&quot;:{&quot;vpc_id&quot;:&quot;vpc-bp1obprt</strong></em><em><strong>4bzo00d&quot;,&quot;vswitch_id&quot;:&quot;vsw-bp1p6i36k</strong></em><em><strong>pmfhw8&quot;,&quot;security_group_id&quot;:&quot;sg-bp1djud4</strong></em>***zecl5a&quot;}}}</p>
         */
        public Builder deploymentConfig(String deploymentConfig) {
            this.putBodyParameter("DeploymentConfig", deploymentConfig);
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * <p>Deployment description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of deployment</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Deployment stage operation information. The JSON format is as follows:<br>{&quot;Stage&quot;:3,&quot;Action&quot;:&quot;Confirm&quot;}. Valid values for Action are:  </p>
         * <ul>
         * <li>Confirm: confirm.  </li>
         * <li>Cancel: cancel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Stage&quot;:3,&quot;Action&quot;:&quot;Confirm&quot;}</p>
         */
        public Builder stageAction(String stageAction) {
            this.putBodyParameter("StageAction", stageAction);
            this.stageAction = stageAction;
            return this;
        }

        /**
         * <p>Workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>174***</p>
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
