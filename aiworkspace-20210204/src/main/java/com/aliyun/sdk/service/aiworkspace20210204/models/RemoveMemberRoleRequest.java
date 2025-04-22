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
 * {@link RemoveMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>RemoveMemberRoleRequest</p>
 */
public class RemoveMemberRoleRequest extends Request {
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

    private RemoveMemberRoleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memberId = builder.memberId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMemberRoleRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveMemberRoleRequest, Builder> {
        private String workspaceId; 
        private String memberId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMemberRoleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memberId = request.memberId;
            this.roleName = request.roleName;
        } 

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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
         * <p>The member ID. You can call <a href="https://help.aliyun.com/document_detail/449135.html">ListMembers</a> to obtain the member ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-21513926******88039</p>
         */
        public Builder memberId(String memberId) {
            this.putPathParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The role name. For more information about the mappings between role names and permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>. Valid values:</p>
         * <ul>
         * <li>PAI.AlgoDeveloper: algorithm developer</li>
         * <li>PAI.AlgoOperator: algorithm O&amp;M engineer</li>
         * <li>PAI.LabelManager: labeling administrator</li>
         * <li>PAI.MaxComputeDeveloper: MaxCompute developer</li>
         * <li>PAI.WorkspaceAdmin: administrator</li>
         * <li>PAI.WorkspaceGuest: guest</li>
         * <li>PAI.WorkspaceOwner: owner</li>
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
        public RemoveMemberRoleRequest build() {
            return new RemoveMemberRoleRequest(this);
        } 

    } 

}
