// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPolicesForUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ListPolicesForUserGroupRequest</p>
 */
public class ListPolicesForUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListPolicesForUserGroupRequest build() {
            return new ListPolicesForUserGroupRequest(this);
        } 

    } 

}
