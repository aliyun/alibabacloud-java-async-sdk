// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTargetsRequest</p>
 */
public class DescribeMetricRuleTargetsRequest extends Request {
    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    private DescribeMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleTargetsRequest, Builder> {
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleTargetsRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeMetricRuleTargetsRequest build() {
            return new DescribeMetricRuleTargetsRequest(this);
        } 

    } 

}
