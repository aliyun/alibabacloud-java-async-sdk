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
 * {@link InsertRoleRequest} extends {@link RequestModel}
 *
 * <p>InsertRoleRequest</p>
 */
public class InsertRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The set of permissions to be granted to the role. The value is in the format of <code>Permission group ID 1:Permission serial number 1;...;Permission group ID n:Permission serial number n</code>. Example: <code>1:1;1:2;2:1;2:2</code>. For more information about permission groups and permission serial numbers, see <a href="https://help.aliyun.com/document_detail/149409.html">ListAuthority</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15:1;14:2</p>
         */
        public Builder actionData(String actionData) {
            this.putQueryParameter("ActionData", actionData);
            this.actionData = actionData;
            return this;
        }

        /**
         * <p>The name of the role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testrole</p>
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
