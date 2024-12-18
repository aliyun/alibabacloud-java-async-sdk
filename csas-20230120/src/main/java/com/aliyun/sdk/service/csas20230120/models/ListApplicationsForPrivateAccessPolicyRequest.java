// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListApplicationsForPrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsForPrivateAccessPolicyRequest</p>
 */
public class ListApplicationsForPrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> policyIds;

    private ListApplicationsForPrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForPrivateAccessPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public static final class Builder extends Request.Builder<ListApplicationsForPrivateAccessPolicyRequest, Builder> {
        private java.util.List<String> policyIds; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsForPrivateAccessPolicyRequest request) {
            super(request);
            this.policyIds = request.policyIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public ListApplicationsForPrivateAccessPolicyRequest build() {
            return new ListApplicationsForPrivateAccessPolicyRequest(this);
        } 

    } 

}
