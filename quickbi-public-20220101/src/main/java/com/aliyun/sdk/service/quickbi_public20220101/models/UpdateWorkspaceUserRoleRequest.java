// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceUserRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceUserRoleRequest</p>
 */
public class UpdateWorkspaceUserRoleRequest extends Request {
    @Query
    @NameInMap("RoleId")
    @Validation(required = true, maximum = 30, minimum = 25)
    private Long roleId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private UpdateWorkspaceUserRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceUserRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceUserRoleRequest, Builder> {
        private Long roleId; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceUserRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RoleId.
         */
        public Builder roleId(Long roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateWorkspaceUserRoleRequest build() {
            return new UpdateWorkspaceUserRoleRequest(this);
        } 

    } 

}
