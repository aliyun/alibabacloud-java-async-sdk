// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionRuleDetailRequest</p>
 */
public class GetInterceptionRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private GetInterceptionRuleDetailRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionRuleDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetInterceptionRuleDetailRequest, Builder> {
        private String clusterId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionRuleDetailRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.ruleId = request.ruleId;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * > You can call the [ListInterceptionRulePage](~~ListInterceptionRulePage~~) operation to query the IDs of rules.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetInterceptionRuleDetailRequest build() {
            return new GetInterceptionRuleDetailRequest(this);
        } 

    } 

}
