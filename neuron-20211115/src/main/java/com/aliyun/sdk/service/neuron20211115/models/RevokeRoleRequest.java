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
 * {@link RevokeRoleRequest} extends {@link RequestModel}
 *
 * <p>RevokeRoleRequest</p>
 */
public class RevokeRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private RoleRevokeCmd body;

    private RevokeRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeRoleRequest create() {
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
    public RoleRevokeCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RevokeRoleRequest, Builder> {
        private Long roleId; 
        private RoleRevokeCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RevokeRoleRequest request) {
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
        public Builder body(RoleRevokeCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RevokeRoleRequest build() {
            return new RevokeRoleRequest(this);
        } 

    } 

}
