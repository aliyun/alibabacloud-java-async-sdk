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
 * {@link GetRoleRequest} extends {@link RequestModel}
 *
 * <p>GetRoleRequest</p>
 */
public class GetRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rolePrincipal")
    private String rolePrincipal;

    private GetRoleRequest(Builder builder) {
        super(builder);
        this.rolePrincipal = builder.rolePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleRequest create() {
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

    public static final class Builder extends Request.Builder<GetRoleRequest, Builder> {
        private String rolePrincipal; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleRequest request) {
            super(request);
            this.rolePrincipal = request.rolePrincipal;
        } 

        /**
         * rolePrincipal.
         */
        public Builder rolePrincipal(String rolePrincipal) {
            this.putQueryParameter("rolePrincipal", rolePrincipal);
            this.rolePrincipal = rolePrincipal;
            return this;
        }

        @Override
        public GetRoleRequest build() {
            return new GetRoleRequest(this);
        } 

    } 

}
