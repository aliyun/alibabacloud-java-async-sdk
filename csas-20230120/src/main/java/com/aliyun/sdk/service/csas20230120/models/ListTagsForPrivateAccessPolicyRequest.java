// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsForPrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListTagsForPrivateAccessPolicyRequest</p>
 */
public class ListTagsForPrivateAccessPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyIds")
    @Validation(required = true)
    private java.util.List < String > policyIds;

    private ListTagsForPrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsForPrivateAccessPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ListTagsForPrivateAccessPolicyRequest, Builder> {
        private java.util.List < String > policyIds; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsForPrivateAccessPolicyRequest request) {
            super(request);
            this.policyIds = request.policyIds;
        } 

        /**
         * PolicyIds.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            String policyIdsShrink = shrink(policyIds, "PolicyIds", "json");
            this.putQueryParameter("PolicyIds", policyIdsShrink);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public ListTagsForPrivateAccessPolicyRequest build() {
            return new ListTagsForPrivateAccessPolicyRequest(this);
        } 

    } 

}
