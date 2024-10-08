// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCustomScenePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomScenePolicyRequest</p>
 */
public class DeleteCustomScenePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long policyId;

    private DeleteCustomScenePolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomScenePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCustomScenePolicyRequest, Builder> {
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomScenePolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * PolicyId.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeleteCustomScenePolicyRequest build() {
            return new DeleteCustomScenePolicyRequest(this);
        } 

    } 

}
