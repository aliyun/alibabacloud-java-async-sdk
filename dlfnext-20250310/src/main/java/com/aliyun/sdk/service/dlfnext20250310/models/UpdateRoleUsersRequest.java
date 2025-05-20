// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link UpdateRoleUsersRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleUsersRequest</p>
 */
public class UpdateRoleUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolePrincipal")
    private String rolePrincipal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userPrincipals")
    private java.util.List<String> userPrincipals;

    private UpdateRoleUsersRequest(Builder builder) {
        super(builder);
        this.rolePrincipal = builder.rolePrincipal;
        this.userPrincipals = builder.userPrincipals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoleUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rolePrincipal
     */
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    /**
     * @return userPrincipals
     */
    public java.util.List<String> getUserPrincipals() {
        return this.userPrincipals;
    }

    public static final class Builder extends Request.Builder<UpdateRoleUsersRequest, Builder> {
        private String rolePrincipal; 
        private java.util.List<String> userPrincipals; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoleUsersRequest request) {
            super(request);
            this.rolePrincipal = request.rolePrincipal;
            this.userPrincipals = request.userPrincipals;
        } 

        /**
         * rolePrincipal.
         */
        public Builder rolePrincipal(String rolePrincipal) {
            this.putBodyParameter("rolePrincipal", rolePrincipal);
            this.rolePrincipal = rolePrincipal;
            return this;
        }

        /**
         * userPrincipals.
         */
        public Builder userPrincipals(java.util.List<String> userPrincipals) {
            this.putBodyParameter("userPrincipals", userPrincipals);
            this.userPrincipals = userPrincipals;
            return this;
        }

        @Override
        public UpdateRoleUsersRequest build() {
            return new UpdateRoleUsersRequest(this);
        } 

    } 

}
