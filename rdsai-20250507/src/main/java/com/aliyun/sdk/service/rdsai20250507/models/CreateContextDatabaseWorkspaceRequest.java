// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateContextDatabaseWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseWorkspaceRequest</p>
 */
public class CreateContextDatabaseWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionMode")
    private String permissionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateContextDatabaseWorkspaceRequest(Builder builder) {
        super(builder);
        this.memberName = builder.memberName;
        this.permissionMode = builder.permissionMode;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return permissionMode
     */
    public String getPermissionMode() {
        return this.permissionMode;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseWorkspaceRequest, Builder> {
        private String memberName; 
        private String permissionMode; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseWorkspaceRequest request) {
            super(request);
            this.memberName = request.memberName;
            this.permissionMode = request.permissionMode;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The name of the first member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-member</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The permission mode selected when creating the workspace. Valid values:</p>
         * <ul>
         * <li><code>compatibility</code>: Compatibility mode. This mode is used if this parameter is not specified.</li>
         * <li><code>advanced</code>: Advanced permission mode. Only the Alibaba Cloud account can select this mode. It takes effect immediately after the workspace is created and cannot be disabled after creation.</li>
         * </ul>
         * <p>This parameter is a string, not a Boolean switch. Valid values are case-insensitive and ignore leading and trailing whitespace. If an empty string, a string with only whitespace, or an invalid value is explicitly specified, <code>InvalidParameter</code> (HTTP 400) is returned. If a RAM user selects <code>advanced</code>, <code>NoPermission</code> (HTTP 403) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder permissionMode(String permissionMode) {
            this.putQueryParameter("PermissionMode", permissionMode);
            this.permissionMode = permissionMode;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateContextDatabaseWorkspaceRequest build() {
            return new CreateContextDatabaseWorkspaceRequest(this);
        } 

    } 

}
