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
 * {@link DeleteDeploymentRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeploymentRequest</p>
 */
public class DeleteDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteDeploymentRequest(Builder builder) {
        super(builder);
        this.deploymentId = builder.deploymentId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeploymentRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDeploymentRequest, Builder> {
        private String deploymentId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeploymentRequest request) {
            super(request);
            this.deploymentId = request.deploymentId;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteDeploymentRequest build() {
            return new DeleteDeploymentRequest(this);
        } 

    } 

}
