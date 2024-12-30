// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link DeleteUserGroupMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserGroupMembersRequest</p>
 */
public class DeleteUserGroupMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteUserGroupMembersRequest(Builder builder) {
        super(builder);
        this.userGroupIds = builder.userGroupIds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserGroupMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userGroupIds
     */
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserGroupMembersRequest, Builder> {
        private String userGroupIds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserGroupMembersRequest request) {
            super(request);
            this.userGroupIds = request.userGroupIds;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>204627493484****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserGroupMembersRequest build() {
            return new DeleteUserGroupMembersRequest(this);
        } 

    } 

}
