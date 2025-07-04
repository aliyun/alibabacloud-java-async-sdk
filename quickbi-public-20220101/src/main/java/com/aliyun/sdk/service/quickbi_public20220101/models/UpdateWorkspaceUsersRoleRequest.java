// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link UpdateWorkspaceUsersRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceUsersRoleRequest</p>
 */
public class UpdateWorkspaceUsersRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 30, minimum = 25)
    private Long roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateWorkspaceUsersRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.userIds = builder.userIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceUsersRoleRequest create() {
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
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceUsersRoleRequest, Builder> {
        private Long roleId; 
        private String userIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceUsersRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.userIds = request.userIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Preset space role ID, existing roles will be overwritten. Value range:</p>
         * <ul>
         * <li>25: Space Administrator</li>
         * <li>26: Space Developer</li>
         * <li>27: Space Analyst</li>
         * <li>30: Space Viewer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder roleId(Long roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>User ID. This is the UserID for Quick BI, not the UID for Alibaba Cloud.</p>
         * <ul>
         * <li>Supports batch parameters, separate user IDs with a comma (,).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>136516262323****,124498444445****</p>
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateWorkspaceUsersRoleRequest build() {
            return new UpdateWorkspaceUsersRoleRequest(this);
        } 

    } 

}
