// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegistrationPoliciesForUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ListRegistrationPoliciesForUserGroupRequest</p>
 */
public class ListRegistrationPoliciesForUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > userGroupIds;

    private ListRegistrationPoliciesForUserGroupRequest(Builder builder) {
        super(builder);
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistrationPoliciesForUserGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ListRegistrationPoliciesForUserGroupRequest, Builder> {
        private java.util.List < String > userGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListRegistrationPoliciesForUserGroupRequest request) {
            super(request);
            this.userGroupIds = request.userGroupIds;
        } 

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListRegistrationPoliciesForUserGroupRequest build() {
            return new ListRegistrationPoliciesForUserGroupRequest(this);
        } 

    } 

}
