// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTagsForPrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListTagsForPrivateAccessPolicyRequest</p>
 */
public class ListTagsForPrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public ListTagsForPrivateAccessPolicyRequest build() {
            return new ListTagsForPrivateAccessPolicyRequest(this);
        } 

    } 

}
