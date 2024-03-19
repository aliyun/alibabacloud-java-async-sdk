// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrganizationRoleConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryOrganizationRoleConfigRequest</p>
 */
public class QueryOrganizationRoleConfigRequest extends Request {
    @Query
    @NameInMap("RoleId")
    @Validation(required = true)
    private Long roleId;

    private QueryOrganizationRoleConfigRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationRoleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<QueryOrganizationRoleConfigRequest, Builder> {
        private Long roleId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrganizationRoleConfigRequest request) {
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
        public QueryOrganizationRoleConfigRequest build() {
            return new QueryOrganizationRoleConfigRequest(this);
        } 

    } 

}
