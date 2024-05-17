// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsForRegistrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListUserGroupsForRegistrationPolicyRequest</p>
 */
public class ListUserGroupsForRegistrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > policyIds;

    private ListUserGroupsForRegistrationPolicyRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsForRegistrationPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ListUserGroupsForRegistrationPolicyRequest, Builder> {
        private java.util.List < String > policyIds; 

        private Builder() {
            super();
        } 

        private Builder(ListUserGroupsForRegistrationPolicyRequest request) {
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
        public ListUserGroupsForRegistrationPolicyRequest build() {
            return new ListUserGroupsForRegistrationPolicyRequest(this);
        } 

    } 

}
