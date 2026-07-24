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
 * {@link DeleteDeploymentByNameRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeploymentByNameRequest</p>
 */
public class DeleteDeploymentByNameRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteDeploymentByNameRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentName = builder.deploymentName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeploymentByNameRequest create() {
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
     * @return deploymentName
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteDeploymentByNameRequest, Builder> {
        private String namespace; 
        private String deploymentName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeploymentByNameRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentName = request.deploymentName;
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
         * <p>test</p>
         */
        public Builder deploymentName(String deploymentName) {
            this.putQueryParameter("deploymentName", deploymentName);
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>710d6a64d8c34d</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteDeploymentByNameRequest build() {
            return new DeleteDeploymentByNameRequest(this);
        } 

    } 

}
