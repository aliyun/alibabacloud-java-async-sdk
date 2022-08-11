// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyDetailsRequest</p>
 */
public class DescribePolicyDetailsRequest extends Request {
    @Path
    @NameInMap("policy_name")
    @Validation(required = true)
    private String policyName;

    private DescribePolicyDetailsRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DescribePolicyDetailsRequest, Builder> {
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyDetailsRequest request) {
            super(request);
            this.policyName = request.policyName;
        } 

        /**
         * 策略治理规则名称
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DescribePolicyDetailsRequest build() {
            return new DescribePolicyDetailsRequest(this);
        } 

    } 

}
