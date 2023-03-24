// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateAccessPolicyRequest</p>
 */
public class DeletePrivateAccessPolicyRequest extends Request {
    @Body
    @NameInMap("PolicyId")
    @Validation(required = true)
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
         * PolicyId.
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
