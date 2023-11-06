// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListRemediationExecutionsRequest</p>
 */
public class ListRemediationExecutionsRequest extends Request {
    @Query
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Query
    @NameInMap("ExecutionStatus")
    private String executionStatus;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListRemediationExecutionsRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
        this.executionStatus = builder.executionStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListRemediationExecutionsRequest, Builder> {
        private String configRuleId; 
        private String executionStatus; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRemediationExecutionsRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
            this.executionStatus = request.executionStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The rule ID.
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

        @Override
        public ListRemediationExecutionsRequest build() {
            return new ListRemediationExecutionsRequest(this);
        } 

    } 

}
