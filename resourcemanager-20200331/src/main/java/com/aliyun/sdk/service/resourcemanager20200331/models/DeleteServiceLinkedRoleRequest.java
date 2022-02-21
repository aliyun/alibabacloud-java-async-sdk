// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceLinkedRoleRequest</p>
 */
public class DeleteServiceLinkedRoleRequest extends Request {
    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
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

        private Builder(DeleteServiceLinkedRoleRequest response) {
            super(response);
            this.roleName = response.roleName;
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
        public DeleteServiceLinkedRoleRequest build() {
            return new DeleteServiceLinkedRoleRequest(this);
        } 

    } 

}
