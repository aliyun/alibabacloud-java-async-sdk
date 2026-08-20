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
 * {@link DeleteProhibitedPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DeleteProhibitedPoliciesRequest</p>
 */
public class DeleteProhibitedPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    private DeleteProhibitedPoliciesRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProhibitedPoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProhibitedPoliciesRequest, Builder> {
        private java.util.List<String> policyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProhibitedPoliciesRequest request) {
            super(request);
            this.policyIds = request.policyIds;
        } 

        /**
         * PolicyIds.
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putBodyParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public DeleteProhibitedPoliciesRequest build() {
            return new DeleteProhibitedPoliciesRequest(this);
        } 

    } 

}
