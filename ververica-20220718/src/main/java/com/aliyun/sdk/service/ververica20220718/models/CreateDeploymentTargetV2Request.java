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
 * {@link CreateDeploymentTargetV2Request} extends {@link RequestModel}
 *
 * <p>CreateDeploymentTargetV2Request</p>
 */
public class CreateDeploymentTargetV2Request extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Resource body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentTargetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentTargetName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CreateDeploymentTargetV2Request(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.body = builder.body;
        this.deploymentTargetName = builder.deploymentTargetName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentTargetV2Request create() {
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
     * @return body
     */
    public Resource getBody() {
        return this.body;
    }

    /**
     * @return deploymentTargetName
     */
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateDeploymentTargetV2Request, Builder> {
        private String namespace; 
        private Resource body; 
        private String deploymentTargetName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentTargetV2Request request) {
            super(request);
            this.namespace = request.namespace;
            this.body = request.body;
            this.deploymentTargetName = request.deploymentTargetName;
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
         * body.
         */
        public Builder body(Resource body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dt</p>
         */
        public Builder deploymentTargetName(String deploymentTargetName) {
            this.putQueryParameter("deploymentTargetName", deploymentTargetName);
            this.deploymentTargetName = deploymentTargetName;
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
        public CreateDeploymentTargetV2Request build() {
            return new CreateDeploymentTargetV2Request(this);
        } 

    } 

}
