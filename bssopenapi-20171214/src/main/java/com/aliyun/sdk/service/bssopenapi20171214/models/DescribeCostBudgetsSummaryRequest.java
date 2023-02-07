// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostBudgetsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostBudgetsSummaryRequest</p>
 */
public class DescribeCostBudgetsSummaryRequest extends Request {
    @Query
    @NameInMap("BudgetName")
    private String budgetName;

    @Query
    @NameInMap("BudgetStatus")
    private String budgetStatus;

    @Query
    @NameInMap("BudgetType")
    private String budgetType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
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
         * 预算名称
         */
        public Builder budgetName(String budgetName) {
            this.putQueryParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * 预算状态
         */
        public Builder budgetStatus(String budgetStatus) {
            this.putQueryParameter("BudgetStatus", budgetStatus);
            this.budgetStatus = budgetStatus;
            return this;
        }

        /**
         * 预算类型
         */
        public Builder budgetType(String budgetType) {
            this.putQueryParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * 读取的最大数据记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 开始读取的位置
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
