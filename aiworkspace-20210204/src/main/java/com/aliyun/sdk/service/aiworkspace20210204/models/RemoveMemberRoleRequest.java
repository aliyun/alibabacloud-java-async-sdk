// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>RemoveMemberRoleRequest</p>
 */
public class RemoveMemberRoleRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Path
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Path
    @NameInMap("RoleName")
    @Validation(required = true)
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putPathParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * RoleName.
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
