// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> envTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.envTypes = builder.envTypes;
        this.resourceGroupId = builder.resourceGroupId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return envTypes
     */
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private String description; 
        private String displayName; 
        private java.util.List<String> envTypes; 
        private String resourceGroupId; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.envTypes = request.envTypes;
            this.resourceGroupId = request.resourceGroupId;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The description of the workspace. The description can be up to 80 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the workspace. You can set it based on the purpose of the workspace. If left empty, the name of the workspace is used.</p>
         * 
         * <strong>example:</strong>
         * <p>display name</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The environment of the workspace.</p>
         * <ul>
         * <li>Workspaces in basic mode can run only in the production environment (prod).</li>
         * <li>Workspaces in standard mode can run in both the development and production environments (dev and prod).</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder envTypes(java.util.List<String> envTypes) {
            this.putBodyParameter("EnvTypes", envTypes);
            this.envTypes = envTypes;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the workspace. Format:</p>
         * <ul>
         * <li>The name must be 3 to 23 characters in length, and can contain letters, underscores (_), and digits.</li>
         * <li>The name must start with a letter.</li>
         * <li>It must be unique in the current region.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace_example</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putBodyParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

}
