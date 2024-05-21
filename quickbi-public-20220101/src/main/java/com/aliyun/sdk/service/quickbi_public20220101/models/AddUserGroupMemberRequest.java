// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMemberRequest</p>
 */
public class AddUserGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The result of adding members to a user group is returned. Valid values:
         * <p>
         * 
         * *   true: The task is added.
         * *   false: The tag failed to be added.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
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
