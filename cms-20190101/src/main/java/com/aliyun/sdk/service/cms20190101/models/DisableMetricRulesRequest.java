// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>DisableMetricRulesRequest</p>
 */
public class DisableMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ruleId;

    private DisableMetricRulesRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableMetricRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public java.util.List < String > getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DisableMetricRulesRequest, Builder> {
        private java.util.List < String > ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DisableMetricRulesRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the alert rule. Valid values of N: 1 to 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>detect_87****_HTTP_HttpLatency</p>
         */
        public Builder ruleId(java.util.List < String > ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DisableMetricRulesRequest build() {
            return new DisableMetricRulesRequest(this);
        } 

    } 

}
