// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribePolicyDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyDetailsRequest</p>
 */
public class DescribePolicyDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_name")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKAllowedRepos</p>
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
