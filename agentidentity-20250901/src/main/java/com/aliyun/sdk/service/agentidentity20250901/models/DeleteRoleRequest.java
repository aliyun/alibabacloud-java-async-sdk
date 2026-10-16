// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link DeleteRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoleRequest</p>
 */
public class DeleteRoleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private DeleteRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoleRequest create() {
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

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<DeleteRoleRequest, Builder> {
        private String roleName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The name of the role to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyst</p>
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public DeleteRoleRequest build() {
            return new DeleteRoleRequest(this);
        } 

    } 

}
