// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRuleResourcesRequest</p>
 */
public class DeleteMetricRuleResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DeleteMetricRuleResourcesRequest(Builder builder) {
        super(builder);
        this.resources = builder.resources;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRuleResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRuleResourcesRequest, Builder> {
        private String resources; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRuleResourcesRequest request) {
            super(request);
            this.resources = request.resources;
            this.ruleId = request.ruleId;
        } 

        /**
         * The resources that are associated with the alert rule.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * The ID of the alert rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteMetricRuleResourcesRequest build() {
            return new DeleteMetricRuleResourcesRequest(this);
        } 

    } 

}
