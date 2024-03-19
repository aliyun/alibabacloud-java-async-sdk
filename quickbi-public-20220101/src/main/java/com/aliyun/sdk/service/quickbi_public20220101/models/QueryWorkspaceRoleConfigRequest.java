// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorkspaceRoleConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryWorkspaceRoleConfigRequest</p>
 */
public class QueryWorkspaceRoleConfigRequest extends Request {
    @Query
    @NameInMap("RoleId")
    @Validation(required = true)
    private Long roleId;

    private QueryWorkspaceRoleConfigRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorkspaceRoleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<QueryWorkspaceRoleConfigRequest, Builder> {
        private Long roleId; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorkspaceRoleConfigRequest request) {
            super(request);
            this.roleId = request.roleId;
        } 

        /**
         * RoleId.
         */
        public Builder roleId(Long roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public QueryWorkspaceRoleConfigRequest build() {
            return new QueryWorkspaceRoleConfigRequest(this);
        } 

    } 

}
