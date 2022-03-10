// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMemberRequest</p>
 */
public class AddUserGroupMemberRequest extends Request {
    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    @Query
    @NameInMap("UserIdList")
    @Validation(required = true)
    private String userIdList;

    private AddUserGroupMemberRequest(Builder builder) {
        super(builder);
        this.userGroupId = builder.userGroupId;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMemberRequest create() {
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
     * @return userIdList
     */
    public String getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<AddUserGroupMemberRequest, Builder> {
        private String userGroupId; 
        private String userIdList; 

        private Builder() {
            super();
        } 

        private Builder(AddUserGroupMemberRequest request) {
            super(request);
            this.userGroupId = request.userGroupId;
            this.userIdList = request.userIdList;
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
         * UserIdList.
         */
        public Builder userIdList(String userIdList) {
            this.putQueryParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public AddUserGroupMemberRequest build() {
            return new AddUserGroupMemberRequest(this);
        } 

    } 

}
