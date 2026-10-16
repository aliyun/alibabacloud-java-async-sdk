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
 * {@link DeleteRoleAssignmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoleAssignmentRequest</p>
 */
public class DeleteRoleAssignmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalName")
    private String principalName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private DeleteRoleAssignmentRequest(Builder builder) {
        super(builder);
        this.principalName = builder.principalName;
        this.principalType = builder.principalType;
        this.roleName = builder.roleName;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoleAssignmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return principalName
     */
    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
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

    public static final class Builder extends Request.Builder<DeleteRoleAssignmentRequest, Builder> {
        private String principalName; 
        private String principalType; 
        private String roleName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoleAssignmentRequest request) {
            super(request);
            this.principalName = request.principalName;
            this.principalType = request.principalType;
            this.roleName = request.roleName;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The name of the identity. If PrincipalType is set to User, specify the username.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder principalName(String principalName) {
            this.putBodyParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * <p>The identity type. Currently, only User is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The name of the role to be removed.</p>
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
        public DeleteRoleAssignmentRequest build() {
            return new DeleteRoleAssignmentRequest(this);
        } 

    } 

}
