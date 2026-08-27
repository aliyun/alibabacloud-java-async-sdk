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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
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
         * success.
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
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * pretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * taxAmount.
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
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * taxAmount.
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
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * pretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * taxAmount.
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
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * pretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * taxAmount.
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
             * period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * periodDetails.
             */
            public Builder periodDetails(java.util.List<PeriodDetails> periodDetails) {
                this.periodDetails = periodDetails;
                return this;
            }

            /**
             * total.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("costTotals")
        private CostTotals costTotals;

        @com.aliyun.core.annotation.NameInMap("groupByTotal")
        private java.util.List<GroupByTotal> groupByTotal;

        @com.aliyun.core.annotation.NameInMap("resultByTime")
        private java.util.List<ResultByTime> resultByTime;

        private Data(Builder builder) {
            this.costTotals = builder.costTotals;
            this.groupByTotal = builder.groupByTotal;
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
         * @return resultByTime
         */
        public java.util.List<ResultByTime> getResultByTime() {
            return this.resultByTime;
        }

        public static final class Builder {
            private CostTotals costTotals; 
            private java.util.List<GroupByTotal> groupByTotal; 
            private java.util.List<ResultByTime> resultByTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.costTotals = model.costTotals;
                this.groupByTotal = model.groupByTotal;
                this.resultByTime = model.resultByTime;
            } 

            /**
             * costTotals.
             */
            public Builder costTotals(CostTotals costTotals) {
                this.costTotals = costTotals;
                return this;
            }

            /**
             * groupByTotal.
             */
            public Builder groupByTotal(java.util.List<GroupByTotal> groupByTotal) {
                this.groupByTotal = groupByTotal;
                return this;
            }

            /**
             * resultByTime.
             */
            public Builder resultByTime(java.util.List<ResultByTime> resultByTime) {
                this.resultByTime = resultByTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
