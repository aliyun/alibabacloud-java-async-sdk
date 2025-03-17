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
 * {@link AddUserGroupMembersRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMembersRequest</p>
 */
public class AddUserGroupMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of the user groups. Separate the IDs with commas (,). Example: aGroupId,bGroupId,cGroupIds</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0d5fb19b-<strong><strong>-</strong></strong>-99da-1248fc27ca51</p>
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The user ID of the Quick BI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>46e5****37a5</p>
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
