// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserGroupMemberRequest</p>
 */
public class DeleteUserGroupMemberRequest extends Request {
    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
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
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * UserId.
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
