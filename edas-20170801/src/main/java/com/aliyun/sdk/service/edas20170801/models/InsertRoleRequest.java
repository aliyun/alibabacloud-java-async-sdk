// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertRoleRequest} extends {@link RequestModel}
 *
 * <p>InsertRoleRequest</p>
 */
public class InsertRoleRequest extends Request {
    @Query
    @NameInMap("ActionData")
    @Validation(required = true)
    private String actionData;

    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    private InsertRoleRequest(Builder builder) {
        super(builder);
        this.actionData = builder.actionData;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionData
     */
    public String getActionData() {
        return this.actionData;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<InsertRoleRequest, Builder> {
        private String actionData; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(InsertRoleRequest request) {
            super(request);
            this.actionData = request.actionData;
            this.roleName = request.roleName;
        } 

        /**
         * The set of permissions to be granted to the role. The value is in the format of `Permission group ID 1:Permission serial number 1;...;Permission group ID n:Permission serial number n`. Example: `1:1;1:2;2:1;2:2`. For more information about permission groups and permission serial numbers, see [ListAuthority](~~149409~~).
         */
        public Builder actionData(String actionData) {
            this.putQueryParameter("ActionData", actionData);
            this.actionData = actionData;
            return this;
        }

        /**
         * The name of the role.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public InsertRoleRequest build() {
            return new InsertRoleRequest(this);
        } 

    } 

}
