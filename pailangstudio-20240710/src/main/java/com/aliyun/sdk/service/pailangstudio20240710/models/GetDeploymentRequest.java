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
 * {@link GetDeploymentRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentRequest</p>
 */
public class GetDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDeploymentRequest(Builder builder) {
        super(builder);
        this.deploymentId = builder.deploymentId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentRequest create() {
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

    public static final class Builder extends Request.Builder<GetDeploymentRequest, Builder> {
        private String deploymentId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentRequest request) {
            super(request);
            this.deploymentId = request.deploymentId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Deployment task ID.</p>
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
         * <p>Workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDeploymentRequest build() {
            return new GetDeploymentRequest(this);
        } 

    } 

}
