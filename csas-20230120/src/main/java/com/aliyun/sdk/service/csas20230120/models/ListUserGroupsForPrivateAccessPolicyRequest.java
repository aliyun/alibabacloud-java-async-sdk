// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsForPrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListUserGroupsForPrivateAccessPolicyRequest</p>
 */
public class ListUserGroupsForPrivateAccessPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyIds")
    @Validation(required = true)
    private java.util.List < String > policyIds;

    private ListUserGroupsForPrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsForPrivateAccessPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    public static final class Builder extends Request.Builder<ListUserGroupsForPrivateAccessPolicyRequest, Builder> {
        private java.util.List < String > policyIds; 

        private Builder() {
            super();
        } 

        private Builder(ListUserGroupsForPrivateAccessPolicyRequest request) {
            super(request);
            this.policyIds = request.policyIds;
        } 

        /**
         * PolicyIds.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public ListUserGroupsForPrivateAccessPolicyRequest build() {
            return new ListUserGroupsForPrivateAccessPolicyRequest(this);
        } 

    } 

}
