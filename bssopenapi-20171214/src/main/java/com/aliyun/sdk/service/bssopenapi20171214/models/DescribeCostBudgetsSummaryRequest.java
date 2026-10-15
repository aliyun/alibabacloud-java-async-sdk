// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeCostBudgetsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostBudgetsSummaryRequest</p>
 */
public class DescribeCostBudgetsSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetStatus")
    private String budgetStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetType")
    private String budgetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeCostBudgetsSummaryRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.budgetStatus = builder.budgetStatus;
        this.budgetType = builder.budgetType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostBudgetsSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetName
     */
    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @return budgetStatus
     */
    public String getBudgetStatus() {
        return this.budgetStatus;
    }

    /**
     * @return budgetType
     */
    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<DescribeCostBudgetsSummaryRequest, Builder> {
        private String budgetName; 
        private String budgetStatus; 
        private String budgetType; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostBudgetsSummaryRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.budgetStatus = request.budgetStatus;
            this.budgetType = request.budgetType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The name of the budget. Supports fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>全年预算</p>
         */
        public Builder budgetName(String budgetName) {
            this.putQueryParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * <p>The status of the budget. If you do not specify this parameter, budgets in all statuses are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>notOverdue</p>
         */
        public Builder budgetStatus(String budgetStatus) {
            this.putQueryParameter("BudgetStatus", budgetStatus);
            this.budgetStatus = budgetStatus;
            return this;
        }

        /**
         * <p>The type of the budget. If you do not specify this parameter, budgets of all types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cost</p>
         */
        public Builder budgetType(String budgetType) {
            this.putQueryParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * <p>The maximum number of items to return. Valid values: 1 to 10. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results. Set this parameter to the NextToken value that is returned in the response to the previous request. If you do not specify this parameter, the query starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6NH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeCostBudgetsSummaryRequest build() {
            return new DescribeCostBudgetsSummaryRequest(this);
        } 

    } 

}
