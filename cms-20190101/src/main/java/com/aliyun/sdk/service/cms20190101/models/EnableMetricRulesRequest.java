// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>EnableMetricRulesRequest</p>
 */
public class EnableMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ruleId;

    private EnableMetricRulesRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMetricRulesRequest create() {
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

    public static final class Builder extends Request.Builder<EnableMetricRulesRequest, Builder> {
        private java.util.List < String > ruleId; 

        private Builder() {
            super();
        } 

        private Builder(EnableMetricRulesRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * The IDs of the alert rules.
         * <p>
         * 
         * Valid values of N: 1 to 100.
         * 
         * For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleId(java.util.List < String > ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public EnableMetricRulesRequest build() {
            return new EnableMetricRulesRequest(this);
        } 

    } 

}
