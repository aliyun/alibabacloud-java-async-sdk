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
 * {@link GetWorkspaceRoleRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspaceRoleRequest</p>
 */
public class GetWorkspaceRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    private GetWorkspaceRoleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceRoleRequest create() {
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
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<GetWorkspaceRoleRequest, Builder> {
        private String workspaceId; 
        private String roleId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspaceRoleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.roleId = request.roleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-tzi7f9czc0cxs9s45t</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.putPathParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public GetWorkspaceRoleRequest build() {
            return new GetWorkspaceRoleRequest(this);
        } 

    } 

}
