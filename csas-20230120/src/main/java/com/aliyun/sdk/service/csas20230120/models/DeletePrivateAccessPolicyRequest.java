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
 * {@link DeletePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateAccessPolicyRequest</p>
 */
public class DeletePrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private DeletePrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivateAccessPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrivateAccessPolicyRequest, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivateAccessPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-867ef4007c8a****</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeletePrivateAccessPolicyRequest build() {
            return new DeletePrivateAccessPolicyRequest(this);
        } 

    } 

}
