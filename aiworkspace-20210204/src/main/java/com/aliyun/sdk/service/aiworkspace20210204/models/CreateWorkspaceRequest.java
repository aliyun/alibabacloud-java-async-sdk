// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("DisplayName")
    private String displayName;

    @Body
    @NameInMap("EnvTypes")
    @Validation(required = true)
    private java.util.List < String > envTypes;

    @Body
    @NameInMap("WorkspaceName")
    @Validation(required = true)
    private String workspaceName;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.envTypes = builder.envTypes;
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
    public java.util.List < String > getEnvTypes() {
        return this.envTypes;
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
        private java.util.List < String > envTypes; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.envTypes = request.envTypes;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * EnvTypes.
         */
        public Builder envTypes(java.util.List < String > envTypes) {
            this.putBodyParameter("EnvTypes", envTypes);
            this.envTypes = envTypes;
            return this;
        }

        /**
         * WorkspaceName.
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
