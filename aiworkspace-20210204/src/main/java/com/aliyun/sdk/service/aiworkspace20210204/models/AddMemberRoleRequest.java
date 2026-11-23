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
 * {@link AddMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>AddMemberRoleRequest</p>
 */
public class AddMemberRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MemberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private AddMemberRoleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memberId = builder.memberId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemberRoleRequest create() {
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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<AddMemberRoleRequest, Builder> {
        private String workspaceId; 
        private String memberId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(AddMemberRoleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memberId = request.memberId;
            this.roleName = request.roleName;
        } 

        /**
         * <p>The workspace ID. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The member ID. For information about how to obtain the member ID, see <a href="https://help.aliyun.com/document_detail/449135.html">ListMembers</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-215139******688039</p>
         */
        public Builder memberId(String memberId) {
            this.putPathParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The role to be added. Both built-in and custom roles are supported:</p>
         * <ul>
         * <li><p>Built-in roles: The following built-in roles are supported. For the permissions of each role, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>.</p>
         * <ul>
         * <li>PAI.AlgoDeveloper: Algorithm developer.</li>
         * <li>PAI.AlgoOperator: Algorithm O&amp;M.</li>
         * <li>PAI.LabelManager: Labeling administrator.</li>
         * <li>PAI.MaxComputeDeveloper: MaxCompute developer.</li>
         * <li>PAI.WorkspaceAdmin: Administrator.</li>
         * <li>PAI.WorkspaceGuest: Guest.</li>
         * <li>PAI.WorkspaceOwner: Owner.</li>
         * </ul>
         * </li>
         * <li><p>Custom roles: Enter the role ID. The ID must start with role-, such as role-sw******2tij.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI.AlgoDeveloper</p>
         */
        public Builder roleName(String roleName) {
            this.putPathParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public AddMemberRoleRequest build() {
            return new AddMemberRoleRequest(this);
        } 

    } 

}
