// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateRemediationExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateRemediationExecutionsRequest</p>
 */
public class ListAggregateRemediationExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
    private String executionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    private ListAggregateRemediationExecutionsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleId = builder.configRuleId;
        this.executionStatus = builder.executionStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceAccountId = builder.resourceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateRemediationExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public static final class Builder extends Request.Builder<ListAggregateRemediationExecutionsRequest, Builder> {
        private String aggregatorId; 
        private String configRuleId; 
        private String executionStatus; 
        private Long maxResults; 
        private String nextToken; 
        private Long resourceAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateRemediationExecutionsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleId = request.configRuleId;
            this.executionStatus = request.executionStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceAccountId = request.resourceAccountId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The status of the remediation. Valid values:
         * <p>
         * 
         * *   Success
         * *   Failed
         */
        public Builder executionStatus(String executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * The maximum number of entries to return for a single request. Valid values: 10 to 100.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the member account in the account group.
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        @Override
        public ListAggregateRemediationExecutionsRequest build() {
            return new ListAggregateRemediationExecutionsRequest(this);
        } 

    } 

}
