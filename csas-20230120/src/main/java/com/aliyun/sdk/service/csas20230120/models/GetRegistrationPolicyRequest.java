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
 * {@link GetRegistrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetRegistrationPolicyRequest</p>
 */
public class GetRegistrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private GetRegistrationPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistrationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<GetRegistrationPolicyRequest, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegistrationPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>The ID of the device registration policy. Valid values are obtained from the following sources:</p>
         * <ul>
         * <li><a href="~~ListRegistrationPolicies~~">ListRegistrationPolicies</a>: Queries device registration policies in batches.</li>
         * <li><a href="~~GetRegistrationPolicy~~">GetRegistrationPolicy</a>: Queries the details of a device registration policy.</li>
         * <li><a href="~~CreateRegistrationPolicy~~">CreateRegistrationPolicy</a>: Creates a device registration policy.</li>
         * <li><a href="~~UpdateRegistrationPolicy~~">UpdateRegistrationPolicy</a>: Updates a device registration policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-policy-dcbfd33cb004****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public GetRegistrationPolicyRequest build() {
            return new GetRegistrationPolicyRequest(this);
        } 

    } 

}
