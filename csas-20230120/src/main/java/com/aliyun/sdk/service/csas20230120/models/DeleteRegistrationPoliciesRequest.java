// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRegistrationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRegistrationPoliciesRequest</p>
 */
public class DeleteRegistrationPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > policyIds;

    private DeleteRegistrationPoliciesRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRegistrationPoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRegistrationPoliciesRequest, Builder> {
        private java.util.List < String > policyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRegistrationPoliciesRequest request) {
            super(request);
            this.policyIds = request.policyIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putBodyParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public DeleteRegistrationPoliciesRequest build() {
            return new DeleteRegistrationPoliciesRequest(this);
        } 

    } 

}
