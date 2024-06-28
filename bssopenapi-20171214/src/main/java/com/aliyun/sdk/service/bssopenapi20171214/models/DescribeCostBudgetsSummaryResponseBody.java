// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostBudgetsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostBudgetsSummaryResponseBody</p>
 */
public class DescribeCostBudgetsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCostBudgetsSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostBudgetsSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCostBudgetsSummaryResponseBody build() {
            return new DescribeCostBudgetsSummaryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Budget")
        private java.util.Map < String, ? > budget;

        @com.aliyun.core.annotation.NameInMap("BudgetName")
        private String budgetName;

        @com.aliyun.core.annotation.NameInMap("BudgetStatus")
        private String budgetStatus;

        @com.aliyun.core.annotation.NameInMap("BudgetType")
        private String budgetType;

        @com.aliyun.core.annotation.NameInMap("CalculatedValues")
        private java.util.Map < String, ? > calculatedValues;

        @com.aliyun.core.annotation.NameInMap("ConsumePeriod")
        private java.util.Map < String, ? > consumePeriod;

        private Items(Builder builder) {
            this.budget = builder.budget;
            this.budgetName = builder.budgetName;
            this.budgetStatus = builder.budgetStatus;
            this.budgetType = builder.budgetType;
            this.calculatedValues = builder.calculatedValues;
            this.consumePeriod = builder.consumePeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return budget
         */
        public java.util.Map < String, ? > getBudget() {
            return this.budget;
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
         * @return calculatedValues
         */
        public java.util.Map < String, ? > getCalculatedValues() {
            return this.calculatedValues;
        }

        /**
         * @return consumePeriod
         */
        public java.util.Map < String, ? > getConsumePeriod() {
            return this.consumePeriod;
        }

        public static final class Builder {
            private java.util.Map < String, ? > budget; 
            private String budgetName; 
            private String budgetStatus; 
            private String budgetType; 
            private java.util.Map < String, ? > calculatedValues; 
            private java.util.Map < String, ? > consumePeriod; 

            /**
             * The information about the budget. The BudgetCycleType parameter indicates the cycle of the budget. Valid values: daily, monthly, quarterly, and yearly. The TotalBudgetAmount parameter indicates the total budget. The BudgetMemo parameter indicates the remarks of the budget.
             */
            public Builder budget(java.util.Map < String, ? > budget) {
                this.budget = budget;
                return this;
            }

            /**
             * The name of the budget.
             */
            public Builder budgetName(String budgetName) {
                this.budgetName = budgetName;
                return this;
            }

            /**
             * The status of the budget.
             */
            public Builder budgetStatus(String budgetStatus) {
                this.budgetStatus = budgetStatus;
                return this;
            }

            /**
             * The type of the budget.
             */
            public Builder budgetType(String budgetType) {
                this.budgetType = budgetType;
                return this;
            }

            /**
             * The information about the estimate-to-actual analysis. The ActualConsumeSum parameter indicates the accumulated actual value. The ActualAddForecastedAmount parameter indicates the sum of accumulated actual value and predicted value. If the BudgetType parameter is set to cost, the sum of actual value and predicted value includes the actual cost incurred from the budget start date to the current date and the predicted cost from the current date to the budget end date. If the BudgetType parameter is set to asset, the sum of actual value and predicted value includes the actual usage or coverage from the budget start date to the budget end date. If the budget end date minus the current date is more than one year, the part that exceeds one year is not included. The ActualAndBudgetComparison parameter indicates the comparison between the actual value and the predicted value. The value of the ActualAndBudgetComparison parameter is calculated based on the following formula: Accumulated actual value/Total budget × 100%.
             */
            public Builder calculatedValues(java.util.Map < String, ? > calculatedValues) {
                this.calculatedValues = calculatedValues;
                return this;
            }

            /**
             * The information about the billing cycle. The ConsumePeriodBegin parameter indicates the start date of the budget. The ConsumePeriodEnd parameter indicates the end date of the budget.
             */
            public Builder consumePeriod(java.util.Map < String, ? > consumePeriod) {
                this.consumePeriod = consumePeriod;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
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

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String hostId; 
            private java.util.List < Items> items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * The site of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The data that is returned.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The maximum number of entries that are returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that is used to retrieve the next page
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of entries that are returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
