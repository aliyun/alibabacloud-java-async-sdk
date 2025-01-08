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
 * {@link DeleteRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoleRequest</p>
 */
public class DeleteRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private DeleteRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
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

    public static final class Builder extends Request.Builder<DeleteRoleRequest, Builder> {
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
        } 

        /**
         * <p>The name of the RAM role.</p>
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
        public DeleteRoleRequest build() {
            return new DeleteRoleRequest(this);
        } 

    } 

}
