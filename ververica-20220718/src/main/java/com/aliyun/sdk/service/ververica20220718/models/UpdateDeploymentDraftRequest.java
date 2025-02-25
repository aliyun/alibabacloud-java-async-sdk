// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link UpdateDeploymentDraftRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeploymentDraftRequest</p>
 */
public class UpdateDeploymentDraftRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deploymentDraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentDraftId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeploymentDraft body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private UpdateDeploymentDraftRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentDraftId = builder.deploymentDraftId;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeploymentDraftRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return deploymentDraftId
     */
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    /**
     * @return body
     */
    public DeploymentDraft getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateDeploymentDraftRequest, Builder> {
        private String namespace; 
        private String deploymentDraftId; 
        private DeploymentDraft body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeploymentDraftRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentDraftId = request.deploymentDraftId;
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c84d73be-40ad-4627-8bdd-fa1eba51b234</p>
         */
        public Builder deploymentDraftId(String deploymentDraftId) {
            this.putPathParameter("deploymentDraftId", deploymentDraftId);
            this.deploymentDraftId = deploymentDraftId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(DeploymentDraft body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdateDeploymentDraftRequest build() {
            return new UpdateDeploymentDraftRequest(this);
        } 

    } 

}
