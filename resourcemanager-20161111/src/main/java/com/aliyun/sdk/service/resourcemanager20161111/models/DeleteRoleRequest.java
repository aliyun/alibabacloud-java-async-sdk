// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoleRequest</p>
 */
public class DeleteRoleRequest extends Request {
    @Query
    @NameInMap("RoleName")
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
         * RoleName.
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
