// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnWafPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnWafPolicyRequest</p>
 */
public class DeleteDcdnWafPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    private DeleteDcdnWafPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnWafPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DeleteDcdnWafPolicyRequest, Builder> {
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnWafPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * The ID of the protection policy that you want to delete. You can specify only one ID in each request.
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeleteDcdnWafPolicyRequest build() {
            return new DeleteDcdnWafPolicyRequest(this);
        } 

    } 

}
