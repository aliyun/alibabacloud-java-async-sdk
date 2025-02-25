// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetPolicyRequest</p>
 */
public class GetPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private GetPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetPolicyRequest, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(GetPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-cu85bamm1hkrn5g6o***</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public GetPolicyRequest build() {
            return new GetPolicyRequest(this);
        } 

    } 

}
