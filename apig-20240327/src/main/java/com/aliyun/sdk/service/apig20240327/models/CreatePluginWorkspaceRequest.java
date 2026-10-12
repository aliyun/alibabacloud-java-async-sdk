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
         * <p>The gateway type. If this parameter is not specified, the server uses API as the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The Codeup organization ID. This is the Yunxiao DevOps organization ID, which can be obtained by parsing the response of the ListPluginRepositories operation or by creating an organization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>664f1e2xxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>The repository name, which also serves as the English ID of the plugin. The backend does not validate the format. The frontend restricts the value to the pattern /^(?![-.])[a-z0-9.-]{1,20}(?&lt;![-.])$/, which means 1 to 20 lowercase letters, digits, periods, or hyphens that cannot start or end with a period or hyphen.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-plugin</p>
         */
        public Builder repoName(String repoName) {
            this.putBodyParameter("repoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The workspace name, which is the Chinese name of the plugin. This parameter is required. If you do not specify this parameter, the API returns a 400 InvalidParameter.IsEmpty error.</p>
         * 
         * <strong>example:</strong>
         * <p>my-plugin</p>
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
