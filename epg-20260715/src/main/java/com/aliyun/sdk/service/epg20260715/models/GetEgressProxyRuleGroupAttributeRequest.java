// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyRuleGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetEgressProxyRuleGroupAttributeRequest</p>
 */
public class GetEgressProxyRuleGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyRuleGroupId;

    private GetEgressProxyRuleGroupAttributeRequest(Builder builder) {
        super(builder);
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyRuleGroupAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public static final class Builder extends Request.Builder<GetEgressProxyRuleGroupAttributeRequest, Builder> {
        private String egressProxyRuleGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetEgressProxyRuleGroupAttributeRequest request) {
            super(request);
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.putBodyParameter("EgressProxyRuleGroupId", egressProxyRuleGroupId);
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        @Override
        public GetEgressProxyRuleGroupAttributeRequest build() {
            return new GetEgressProxyRuleGroupAttributeRequest(this);
        } 

    } 

}
