// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteUserGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserGroupRequest</p>
 */
public class DeleteUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private DeleteUserGroupRequest(Builder builder) {
        super(builder);
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteUserGroupRequest, Builder> {
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserGroupRequest request) {
            super(request);
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public DeleteUserGroupRequest build() {
            return new DeleteUserGroupRequest(this);
        } 

    } 

}
