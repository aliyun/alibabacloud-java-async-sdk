// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostBudgetsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostBudgetsSummaryResponseBody</p>
 */
public class DescribeCostBudgetsSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("Budget")
        private java.util.Map < String, ? > budget;

        @NameInMap("BudgetName")
        private String budgetName;

        @NameInMap("BudgetStatus")
        private String budgetStatus;

        @NameInMap("BudgetType")
        private String budgetType;

        @NameInMap("CalculatedValues")
        private java.util.Map < String, ? > calculatedValues;

        @NameInMap("ConsumePeriod")
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
             * Budget.
             */
            public Builder budget(java.util.Map < String, ? > budget) {
                this.budget = budget;
                return this;
            }

            /**
             * BudgetName.
             */
            public Builder budgetName(String budgetName) {
                this.budgetName = budgetName;
                return this;
            }

            /**
             * BudgetStatus.
             */
            public Builder budgetStatus(String budgetStatus) {
                this.budgetStatus = budgetStatus;
                return this;
            }

            /**
             * BudgetType.
             */
            public Builder budgetType(String budgetType) {
                this.budgetType = budgetType;
                return this;
            }

            /**
             * CalculatedValues.
             */
            public Builder calculatedValues(java.util.Map < String, ? > calculatedValues) {
                this.calculatedValues = calculatedValues;
                return this;
            }

            /**
             * ConsumePeriod.
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
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
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
             * 站点名称
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * 本次请求所返回的最大记录条数。
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * 下页token
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * 总记录数。
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
