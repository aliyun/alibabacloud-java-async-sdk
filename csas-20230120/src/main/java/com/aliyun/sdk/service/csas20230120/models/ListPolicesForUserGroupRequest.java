// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ListPolicesForUserGroupRequest</p>
 */
public class ListPolicesForUserGroupRequest extends Request {
    @Query
    @NameInMap("UserGroupIds")
    @Validation(required = true)
    private java.util.List < String > userGroupIds;

    private ListPolicesForUserGroupRequest(Builder builder) {
        super(builder);
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userGroupIds
     */
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    public static final class Builder extends Request.Builder<ListPolicesForUserGroupRequest, Builder> {
        private java.util.List < String > userGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicesForUserGroupRequest request) {
            super(request);
            this.userGroupIds = request.userGroupIds;
        } 

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "UserGroupIds", "json");
            this.putQueryParameter("UserGroupIds", userGroupIdsShrink);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListPolicesForUserGroupRequest build() {
            return new ListPolicesForUserGroupRequest(this);
        } 

    } 

}
