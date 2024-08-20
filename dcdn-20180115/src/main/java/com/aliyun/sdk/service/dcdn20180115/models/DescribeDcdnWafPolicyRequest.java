// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafPolicyRequest</p>
 */
public class DescribeDcdnWafPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    private DescribeDcdnWafPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafPolicyRequest, Builder> {
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * The ID of the protection policy. You can specify only one ID in each request.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeDcdnWafPolicyRequest build() {
            return new DescribeDcdnWafPolicyRequest(this);
        } 

    } 

}
