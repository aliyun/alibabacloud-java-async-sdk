// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListPoliciesForRoleRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesForRoleRequest</p>
 */
public class ListPoliciesForRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private ListPoliciesForRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<ListPoliciesForRoleRequest, Builder> {
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesForRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
        } 

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>AdminRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public ListPoliciesForRoleRequest build() {
            return new ListPoliciesForRoleRequest(this);
        } 

    } 

}
