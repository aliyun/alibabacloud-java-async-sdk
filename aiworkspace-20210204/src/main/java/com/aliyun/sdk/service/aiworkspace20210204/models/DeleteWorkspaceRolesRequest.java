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
 * {@link DeleteWorkspaceRolesRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceRolesRequest</p>
 */
public class DeleteWorkspaceRolesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private java.util.List<String> roleIds;

    private DeleteWorkspaceRolesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.roleIds = builder.roleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceRolesRequest create() {
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
     * @return roleIds
     */
    public java.util.List<String> getRoleIds() {
        return this.roleIds;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceRolesRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> roleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceRolesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.roleIds = request.roleIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>98***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * RoleIds.
         */
        public Builder roleIds(java.util.List<String> roleIds) {
            this.putBodyParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        @Override
        public DeleteWorkspaceRolesRequest build() {
            return new DeleteWorkspaceRolesRequest(this);
        } 

    } 

}
