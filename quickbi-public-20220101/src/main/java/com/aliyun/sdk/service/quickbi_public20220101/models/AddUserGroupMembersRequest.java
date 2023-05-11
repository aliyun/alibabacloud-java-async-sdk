// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserGroupMembersRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMembersRequest</p>
 */
public class AddUserGroupMembersRequest extends Request {
    @Query
    @NameInMap("UserGroupIds")
    @Validation(required = true)
    private String userGroupIds;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private AddUserGroupMembersRequest(Builder builder) {
        super(builder);
        this.userGroupIds = builder.userGroupIds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMembersRequest create() {
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

    public static final class Builder extends Request.Builder<AddUserGroupMembersRequest, Builder> {
        private String userGroupIds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserGroupMembersRequest request) {
            super(request);
            this.userGroupIds = request.userGroupIds;
            this.userId = request.userId;
        } 

        /**
         * The IDs of the user groups. Separate the IDs with commas (,). Example: aGroupId,bGroupId,cGroupIds
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * The user ID of the Quick BI.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddUserGroupMembersRequest build() {
            return new AddUserGroupMembersRequest(this);
        } 

    } 

}
