// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyAddonsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyAddonsRequest</p>
 */
public class ListIntegrationPolicyAddonsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private ListIntegrationPolicyAddonsRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyAddonsRequest create() {
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

    public static final class Builder extends Request.Builder<ListIntegrationPolicyAddonsRequest, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyAddonsRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-3563e6bf338141b3b92c118e2c318c37</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public ListIntegrationPolicyAddonsRequest build() {
            return new ListIntegrationPolicyAddonsRequest(this);
        } 

    } 

}
