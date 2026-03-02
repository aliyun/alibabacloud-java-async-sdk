// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListPrivilegeByRoleRequest} extends {@link RequestModel}
 *
 * <p>ListPrivilegeByRoleRequest</p>
 */
public class ListPrivilegeByRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    private ListPrivilegeByRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivilegeByRoleRequest create() {
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

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder extends Request.Builder<ListPrivilegeByRoleRequest, Builder> {
        private Long roleId; 
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivilegeByRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.accountId = request.accountId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleId(Long roleId) {
            this.putPathParameter("roleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public ListPrivilegeByRoleRequest build() {
            return new ListPrivilegeByRoleRequest(this);
        } 

    } 

}
