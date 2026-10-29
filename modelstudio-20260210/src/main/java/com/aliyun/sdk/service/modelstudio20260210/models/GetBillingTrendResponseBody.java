// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetBillingTrendResponseBody</p>
 */
public class GetBillingTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetBillingTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBillingTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetBillingTrendResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>099A671E-FA21-5A36-8A73-918572DDEF53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBillingTrendResponseBody build() {
            return new GetBillingTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class CostTotals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private CostTotals(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostTotals create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(CostTotals model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total cost amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The currency of the amount.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>94.34</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The tax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>5.66</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public CostTotals build() {
                return new CostTotals(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class GroupByTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private GroupByTotal(Builder builder) {
            this.amount = builder.amount;
            this.key = builder.key;
            this.name = builder.name;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupByTotal create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String key; 
            private String name; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(GroupByTotal model) {
                this.amount = model.amount;
                this.key = model.key;
                this.name = model.name;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total amount of the current group.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The dimension value of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the group, which is affected by the locale input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The pretax amount of the current group.</p>
             * 
             * <strong>example:</strong>
             * <p>56.60</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The tax amount of the current group.</p>
             * 
             * <strong>example:</strong>
             * <p>3.40</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public GroupByTotal build() {
                return new GroupByTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class HistoryPeriodCostTotals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private HistoryPeriodCostTotals(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryPeriodCostTotals create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(HistoryPeriodCostTotals model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total cost amount.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The currency of the amount.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The tax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public HistoryPeriodCostTotals build() {
                return new HistoryPeriodCostTotals(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class HistoryPeriodGroupByTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private HistoryPeriodGroupByTotal(Builder builder) {
            this.amount = builder.amount;
            this.key = builder.key;
            this.name = builder.name;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryPeriodGroupByTotal create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String key; 
            private String name; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(HistoryPeriodGroupByTotal model) {
                this.amount = model.amount;
                this.key = model.key;
                this.name = model.name;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total amount of the current group.</p>
             * 
             * <strong>example:</strong>
             * <p>246</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The dimension value of the group. If the value is null, DIMENSION_FILTER_NULL_VALUE is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the group, which is affected by the locale parameter. If the value is null, a hyphen (-) is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The total tax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>146</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public HistoryPeriodGroupByTotal build() {
                return new HistoryPeriodGroupByTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class PeriodDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private String percentage;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private PeriodDetails(Builder builder) {
            this.amount = builder.amount;
            this.key = builder.key;
            this.name = builder.name;
            this.percentage = builder.percentage;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String key; 
            private String name; 
            private String percentage; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(PeriodDetails model) {
                this.amount = model.amount;
                this.key = model.key;
                this.name = model.name;
                this.percentage = model.percentage;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The amount of the current group.</p>
             * 
             * <strong>example:</strong>
             * <p>526</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The dimension value of the group. If the value is null, DIMENSION_FILTER_NULL_VALUE is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the group, which is affected by the locale parameter. If the value is null, a hyphen (-) is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The percentage of the group amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The total pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The total tax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>426</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public PeriodDetails build() {
                return new PeriodDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class Total extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private Total(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Total create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(Total model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total cost amount of the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The currency of the amount.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The total pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The total tax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public Total build() {
                return new Total(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class ResultByTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("periodDetails")
        private java.util.List<PeriodDetails> periodDetails;

        @com.aliyun.core.annotation.NameInMap("total")
        private Total total;

        private ResultByTime(Builder builder) {
            this.period = builder.period;
            this.periodDetails = builder.periodDetails;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultByTime create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return periodDetails
         */
        public java.util.List<PeriodDetails> getPeriodDetails() {
            return this.periodDetails;
        }

        /**
         * @return total
         */
        public Total getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String period; 
            private java.util.List<PeriodDetails> periodDetails; 
            private Total total; 

            private Builder() {
            } 

            private Builder(ResultByTime model) {
                this.period = model.period;
                this.periodDetails = model.periodDetails;
                this.total = model.total;
            } 

            /**
             * <p>The statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>20260801</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The cost groups that actually exist in the current period.</p>
             */
            public Builder periodDetails(java.util.List<PeriodDetails> periodDetails) {
                this.periodDetails = periodDetails;
                return this;
            }

            /**
             * <p>The total costs of the current period.</p>
             */
            public Builder total(Total total) {
                this.total = total;
                return this;
            }

            public ResultByTime build() {
                return new ResultByTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class HistoryPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("costTotals")
        private HistoryPeriodCostTotals costTotals;

        @com.aliyun.core.annotation.NameInMap("groupByTotal")
        private java.util.List<HistoryPeriodGroupByTotal> groupByTotal;

        @com.aliyun.core.annotation.NameInMap("resultByTime")
        private java.util.List<ResultByTime> resultByTime;

        private HistoryPeriod(Builder builder) {
            this.costTotals = builder.costTotals;
            this.groupByTotal = builder.groupByTotal;
            this.resultByTime = builder.resultByTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryPeriod create() {
            return builder().build();
        }

        /**
         * @return costTotals
         */
        public HistoryPeriodCostTotals getCostTotals() {
            return this.costTotals;
        }

        /**
         * @return groupByTotal
         */
        public java.util.List<HistoryPeriodGroupByTotal> getGroupByTotal() {
            return this.groupByTotal;
        }

        /**
         * @return resultByTime
         */
        public java.util.List<ResultByTime> getResultByTime() {
            return this.resultByTime;
        }

        public static final class Builder {
            private HistoryPeriodCostTotals costTotals; 
            private java.util.List<HistoryPeriodGroupByTotal> groupByTotal; 
            private java.util.List<ResultByTime> resultByTime; 

            private Builder() {
            } 

            private Builder(HistoryPeriod model) {
                this.costTotals = model.costTotals;
                this.groupByTotal = model.groupByTotal;
                this.resultByTime = model.resultByTime;
            } 

            /**
             * <p>The total costs within the historical range, including the top N items and Other.</p>
             */
            public Builder costTotals(HistoryPeriodCostTotals costTotals) {
                this.costTotals = costTotals;
                return this;
            }

            /**
             * <p>The total costs of the top N groups and the optional Other group within the historical period.</p>
             */
            public Builder groupByTotal(java.util.List<HistoryPeriodGroupByTotal> groupByTotal) {
                this.groupByTotal = groupByTotal;
                return this;
            }

            /**
             * <p>The list of cost trends sorted in ascending order by time.</p>
             */
            public Builder resultByTime(java.util.List<ResultByTime> resultByTime) {
                this.resultByTime = resultByTime;
                return this;
            }

            public HistoryPeriod build() {
                return new HistoryPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class ResultByTimePeriodDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private String percentage;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private ResultByTimePeriodDetails(Builder builder) {
            this.amount = builder.amount;
            this.key = builder.key;
            this.name = builder.name;
            this.percentage = builder.percentage;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultByTimePeriodDetails create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String key; 
            private String name; 
            private String percentage; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(ResultByTimePeriodDetails model) {
                this.amount = model.amount;
                this.key = model.key;
                this.name = model.name;
                this.percentage = model.percentage;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The amount of the group in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The dimension value of the group. For data other than the top N items, DIMENSION_GROUP_OTHERS_VALUE is used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the group, which is affected by the locale input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ratio of the current group amount to the total amount of the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6667</p>
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The pretax amount of the group in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>18.87</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The tax amount of the group in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>1.13</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public ResultByTimePeriodDetails build() {
                return new ResultByTimePeriodDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class ResultByTimeTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        private ResultByTimeTotal(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultByTimeTotal create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String pretaxAmount; 
            private String taxAmount; 

            private Builder() {
            } 

            private Builder(ResultByTimeTotal model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
            } 

            /**
             * <p>The total cost amount of the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The currency of the amount in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The pretax amount of the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>28.30</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The tax amount of the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>1.70</p>
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            public ResultByTimeTotal build() {
                return new ResultByTimeTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class DataResultByTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("periodDetails")
        private java.util.List<ResultByTimePeriodDetails> periodDetails;

        @com.aliyun.core.annotation.NameInMap("total")
        private ResultByTimeTotal total;

        private DataResultByTime(Builder builder) {
            this.period = builder.period;
            this.periodDetails = builder.periodDetails;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResultByTime create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return periodDetails
         */
        public java.util.List<ResultByTimePeriodDetails> getPeriodDetails() {
            return this.periodDetails;
        }

        /**
         * @return total
         */
        public ResultByTimeTotal getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String period; 
            private java.util.List<ResultByTimePeriodDetails> periodDetails; 
            private ResultByTimeTotal total; 

            private Builder() {
            } 

            private Builder(DataResultByTime model) {
                this.period = model.period;
                this.periodDetails = model.periodDetails;
                this.total = model.total;
            } 

            /**
             * <p>The statistical period. DAY returns yyyyMMdd, and MONTH returns yyyyMM.</p>
             * 
             * <strong>example:</strong>
             * <p>20260801</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The cost groups that actually exist in the current period.</p>
             */
            public Builder periodDetails(java.util.List<ResultByTimePeriodDetails> periodDetails) {
                this.periodDetails = periodDetails;
                return this;
            }

            /**
             * <p>The total costs of the current period.</p>
             */
            public Builder total(ResultByTimeTotal total) {
                this.total = total;
                return this;
            }

            public DataResultByTime build() {
                return new DataResultByTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("costTotals")
        private CostTotals costTotals;

        @com.aliyun.core.annotation.NameInMap("groupByTotal")
        private java.util.List<GroupByTotal> groupByTotal;

        @com.aliyun.core.annotation.NameInMap("historyPeriod")
        private HistoryPeriod historyPeriod;

        @com.aliyun.core.annotation.NameInMap("resultByTime")
        private java.util.List<DataResultByTime> resultByTime;

        private Data(Builder builder) {
            this.costTotals = builder.costTotals;
            this.groupByTotal = builder.groupByTotal;
            this.historyPeriod = builder.historyPeriod;
            this.resultByTime = builder.resultByTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return costTotals
         */
        public CostTotals getCostTotals() {
            return this.costTotals;
        }

        /**
         * @return groupByTotal
         */
        public java.util.List<GroupByTotal> getGroupByTotal() {
            return this.groupByTotal;
        }

        /**
         * @return historyPeriod
         */
        public HistoryPeriod getHistoryPeriod() {
            return this.historyPeriod;
        }

        /**
         * @return resultByTime
         */
        public java.util.List<DataResultByTime> getResultByTime() {
            return this.resultByTime;
        }

        public static final class Builder {
            private CostTotals costTotals; 
            private java.util.List<GroupByTotal> groupByTotal; 
            private HistoryPeriod historyPeriod; 
            private java.util.List<DataResultByTime> resultByTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.costTotals = model.costTotals;
                this.groupByTotal = model.groupByTotal;
                this.historyPeriod = model.historyPeriod;
                this.resultByTime = model.resultByTime;
            } 

            /**
             * <p>The total costs within the entire query time range, including the top N items and Other.</p>
             */
            public Builder costTotals(CostTotals costTotals) {
                this.costTotals = costTotals;
                return this;
            }

            /**
             * <p>The total costs of the top N groups and the optional Other group within the period.</p>
             */
            public Builder groupByTotal(java.util.List<GroupByTotal> groupByTotal) {
                this.groupByTotal = groupByTotal;
                return this;
            }

            /**
             * <p>The historical period data, which is returned when the includeHistoryPeriod input parameter is set to true.</p>
             */
            public Builder historyPeriod(HistoryPeriod historyPeriod) {
                this.historyPeriod = historyPeriod;
                return this;
            }

            /**
             * <p>The list of cost trends sorted in ascending order by time.</p>
             */
            public Builder resultByTime(java.util.List<DataResultByTime> resultByTime) {
                this.resultByTime = resultByTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
