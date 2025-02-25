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
 * {@link GetLatestJobStartLogRequest} extends {@link RequestModel}
 *
 * <p>GetLatestJobStartLogRequest</p>
 */
public class GetLatestJobStartLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetLatestJobStartLogRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentId = builder.deploymentId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLatestJobStartLogRequest create() {
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
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetLatestJobStartLogRequest, Builder> {
        private String namespace; 
        private String deploymentId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetLatestJobStartLogRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentId = request.deploymentId;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
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
         * <p>The deployment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putPathParameter("deploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
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
        public GetLatestJobStartLogRequest build() {
            return new GetLatestJobStartLogRequest(this);
        } 

    } 

}
