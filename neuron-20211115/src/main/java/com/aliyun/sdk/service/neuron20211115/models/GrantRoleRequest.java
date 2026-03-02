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
 * {@link GrantRoleRequest} extends {@link RequestModel}
 *
 * <p>GrantRoleRequest</p>
 */
public class GrantRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private RoleGrantCmd body;

    private GrantRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRoleRequest create() {
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
     * @return body
     */
    public RoleGrantCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GrantRoleRequest, Builder> {
        private Long roleId; 
        private RoleGrantCmd body; 

        private Builder() {
            super();
        } 

        private Builder(GrantRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.body = request.body;
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
         * <p>This parameter is required.</p>
         */
        public Builder body(RoleGrantCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GrantRoleRequest build() {
            return new GrantRoleRequest(this);
        } 

    } 

}
