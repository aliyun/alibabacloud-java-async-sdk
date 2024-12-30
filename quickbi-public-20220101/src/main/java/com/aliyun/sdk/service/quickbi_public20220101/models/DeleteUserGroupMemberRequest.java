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
 * {@link DeleteUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserGroupMemberRequest</p>
 */
public class DeleteUserGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteUserGroupMemberRequest(Builder builder) {
        super(builder);
        this.userGroupId = builder.userGroupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserGroupMemberRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserGroupMemberRequest, Builder> {
        private String userGroupId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserGroupMemberRequest request) {
            super(request);
            this.userGroupId = request.userGroupId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>46e537****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The user ID of the Quick BI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserGroupMemberRequest build() {
            return new DeleteUserGroupMemberRequest(this);
        } 

    } 

}
