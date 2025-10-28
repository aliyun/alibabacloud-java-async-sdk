// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleRequest</p>
 */
public class UpdateRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The set of permissions to be granted to the role. The value is in the format of <code>Permission group ID 1:Permission serial number 1;...;Permission group ID n:Permission serial number n</code>. Example: <code>1:1;1:2;2:1;2:2</code>. For more information about permission groups and permission serial numbers, see <a href="https://help.aliyun.com/document_detail/149409.html">ListAuthority</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15:1</p>
         */
        public Builder actionData(String actionData) {
            this.putQueryParameter("ActionData", actionData);
            this.actionData = actionData;
            return this;
        }

        /**
         * <p>The ID of the role. You can call the ListRole operation to query the role IDs. For more information, see <a href="https://help.aliyun.com/document_detail/149410.html">ListRole</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32371</p>
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
