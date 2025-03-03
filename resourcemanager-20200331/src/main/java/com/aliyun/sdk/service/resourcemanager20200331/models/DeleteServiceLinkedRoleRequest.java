// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DeleteServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceLinkedRoleRequest</p>
 */
public class DeleteServiceLinkedRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private DeleteServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceLinkedRoleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteServiceLinkedRoleRequest, Builder> {
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceLinkedRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
        } 

        /**
         * <p>The name of the role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForPolarDB</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public DeleteServiceLinkedRoleRequest build() {
            return new DeleteServiceLinkedRoleRequest(this);
        } 

    } 

}
