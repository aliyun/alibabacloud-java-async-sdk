// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyDetailsRequest</p>
 */
public class DescribePolicyDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
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
         * The policy name.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DescribePolicyDetailsRequest build() {
            return new DescribePolicyDetailsRequest(this);
        } 

    } 

}
