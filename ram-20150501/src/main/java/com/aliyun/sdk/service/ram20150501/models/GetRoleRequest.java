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
 * {@link GetRoleRequest} extends {@link RequestModel}
 *
 * <p>GetRoleRequest</p>
 */
public class GetRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private GetRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<GetRoleRequest, Builder> {
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
        } 

        /**
         * <p>The name of the RAM role.</p>
         * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public GetRoleRequest build() {
            return new GetRoleRequest(this);
        } 

    } 

}
