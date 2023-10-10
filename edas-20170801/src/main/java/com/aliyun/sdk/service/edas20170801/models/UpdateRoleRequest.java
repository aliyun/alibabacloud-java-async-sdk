// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleRequest</p>
 */
public class UpdateRoleRequest extends Request {
    @Query
    @NameInMap("ActionData")
    @Validation(required = true)
    private String actionData;

    @Query
    @NameInMap("RoleId")
    @Validation(required = true)
    private Integer roleId;

    private UpdateRoleRequest(Builder builder) {
        super(builder);
        this.actionData = builder.actionData;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoleRequest create() {
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
     * @return roleId
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<UpdateRoleRequest, Builder> {
        private String actionData; 
        private Integer roleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoleRequest request) {
            super(request);
            this.actionData = request.actionData;
            this.roleId = request.roleId;
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
         * The ID of the role. You can call the ListRole operation to query the role IDs. For more information, see [ListRole](~~149410~~).
         */
        public Builder roleId(Integer roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public UpdateRoleRequest build() {
            return new UpdateRoleRequest(this);
        } 

    } 

}
