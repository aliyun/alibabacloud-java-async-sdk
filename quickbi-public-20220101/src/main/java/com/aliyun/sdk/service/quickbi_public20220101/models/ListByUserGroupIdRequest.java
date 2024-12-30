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
 * {@link ListByUserGroupIdRequest} extends {@link RequestModel}
 *
 * <p>ListByUserGroupIdRequest</p>
 */
public class ListByUserGroupIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupIds;

    private ListByUserGroupIdRequest(Builder builder) {
        super(builder);
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListByUserGroupIdRequest create() {
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

    public static final class Builder extends Request.Builder<ListByUserGroupIdRequest, Builder> {
        private String userGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListByUserGroupIdRequest request) {
            super(request);
            this.userGroupIds = request.userGroupIds;
        } 

        /**
         * <p>The ID of the user group that you want to query. Separate multiple user groups with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34fe-<em><strong>-6dcb,84q9-</strong></em>*-4a274</p>
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListByUserGroupIdRequest build() {
            return new ListByUserGroupIdRequest(this);
        } 

    } 

}
