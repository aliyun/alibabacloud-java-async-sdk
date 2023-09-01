// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceRequest</p>
 */
public class UpdateWorkspaceRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DisplayName")
    private String displayName;

    private UpdateWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateWorkspaceRequest, Builder> {
        private String workspaceId; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.description = request.description;
            this.displayName = request.displayName;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
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

        @Override
        public UpdateWorkspaceRequest build() {
            return new UpdateWorkspaceRequest(this);
        } 

    } 

}
