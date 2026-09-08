// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UpdateDataAgentWorkspaceMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataAgentWorkspaceMemberRoleRequest</p>
 */
public class UpdateDataAgentWorkspaceMemberRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDataAgentWorkspaceMemberRoleRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.memberId = builder.memberId;
        this.roleName = builder.roleName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentWorkspaceMemberRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDataAgentWorkspaceMemberRoleRequest, Builder> {
        private String DMSUnit; 
        private String memberId; 
        private String roleName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAgentWorkspaceMemberRoleRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.memberId = request.memberId;
            this.roleName = request.roleName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The UID of the member whose role you want to change.</p>
         * 
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The role to assign to the member.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
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
        public UpdateDataAgentWorkspaceMemberRoleRequest build() {
            return new UpdateDataAgentWorkspaceMemberRoleRequest(this);
        } 

    } 

}
