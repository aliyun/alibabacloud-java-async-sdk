// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link AddWorkspaceUserRequest} extends {@link RequestModel}
 *
 * <p>AddWorkspaceUserRequest</p>
 */
public class AddWorkspaceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dmsUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String workspaceId;

    private AddWorkspaceUserRequest(Builder builder) {
        super(builder);
        this.dmsUserIds = builder.dmsUserIds;
        this.roleId = builder.roleId;
        this.roleSource = builder.roleSource;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkspaceUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dmsUserIds
     */
    public String getDmsUserIds() {
        return this.dmsUserIds;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return roleSource
     */
    public String getRoleSource() {
        return this.roleSource;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AddWorkspaceUserRequest, Builder> {
        private String dmsUserIds; 
        private String roleId; 
        private String roleSource; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddWorkspaceUserRequest request) {
            super(request);
            this.dmsUserIds = request.dmsUserIds;
            this.roleId = request.roleId;
            this.roleSource = request.roleSource;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder dmsUserIds(String dmsUserIds) {
            this.putQueryParameter("DmsUserIds", dmsUserIds);
            this.dmsUserIds = dmsUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31****</p>
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        public Builder roleSource(String roleSource) {
            this.putQueryParameter("RoleSource", roleSource);
            this.roleSource = roleSource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AddWorkspaceUserRequest build() {
            return new AddWorkspaceUserRequest(this);
        } 

    } 

}
