// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link VerifyWorkspaceAcrRamAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>VerifyWorkspaceAcrRamAuthorizationRequest</p>
 */
public class VerifyWorkspaceAcrRamAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repository")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repository;

    private VerifyWorkspaceAcrRamAuthorizationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.acrInstanceId = builder.acrInstanceId;
        this.namespace = builder.namespace;
        this.repository = builder.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWorkspaceAcrRamAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    public static final class Builder extends Request.Builder<VerifyWorkspaceAcrRamAuthorizationRequest, Builder> {
        private String workspaceId; 
        private String acrInstanceId; 
        private String namespace; 
        private String repository; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWorkspaceAcrRamAuthorizationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.acrInstanceId = request.acrInstanceId;
            this.namespace = request.namespace;
            this.repository = request.repository;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ACR Enterprise instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-1234567890abcdef</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putQueryParameter("acrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The target ACR namespace, which corresponds to Agent artifact.container.namespace. This is not a Kubernetes namespace. Together with the instance and repository, it determines the authorization scope.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The target repository name, which corresponds to Agent artifact.container.repo. It does not include a tag, namespace, or path separator. Wildcards are not accepted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-image</p>
         */
        public Builder repository(String repository) {
            this.putQueryParameter("repository", repository);
            this.repository = repository;
            return this;
        }

        @Override
        public VerifyWorkspaceAcrRamAuthorizationRequest build() {
            return new VerifyWorkspaceAcrRamAuthorizationRequest(this);
        } 

    } 

}
