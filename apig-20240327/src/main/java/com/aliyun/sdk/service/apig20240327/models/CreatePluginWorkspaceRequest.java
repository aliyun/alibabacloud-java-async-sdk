// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreatePluginWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginWorkspaceRequest</p>
 */
public class CreatePluginWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("repoName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    private CreatePluginWorkspaceRequest(Builder builder) {
        super(builder);
        this.gatewayType = builder.gatewayType;
        this.organizationId = builder.organizationId;
        this.repoName = builder.repoName;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreatePluginWorkspaceRequest, Builder> {
        private String gatewayType; 
        private String organizationId; 
        private String repoName; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePluginWorkspaceRequest request) {
            super(request);
            this.gatewayType = request.gatewayType;
            this.organizationId = request.organizationId;
            this.repoName = request.repoName;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder repoName(String repoName) {
            this.putBodyParameter("repoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putBodyParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreatePluginWorkspaceRequest build() {
            return new CreatePluginWorkspaceRequest(this);
        } 

    } 

}
