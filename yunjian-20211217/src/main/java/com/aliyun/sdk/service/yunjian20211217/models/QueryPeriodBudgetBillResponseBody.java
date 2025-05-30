// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link QueryPeriodBudgetBillResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPeriodBudgetBillResponseBody</p>
 */
public class QueryPeriodBudgetBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("periodBudgetBillDTOS")
    private java.util.List<PeriodBudgetBillDTOS> periodBudgetBillDTOS;

    private QueryPeriodBudgetBillResponseBody(Builder builder) {
        this.periodBudgetBillDTOS = builder.periodBudgetBillDTOS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPeriodBudgetBillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return periodBudgetBillDTOS
     */
    public java.util.List<PeriodBudgetBillDTOS> getPeriodBudgetBillDTOS() {
        return this.periodBudgetBillDTOS;
    }

    public static final class Builder {
        private java.util.List<PeriodBudgetBillDTOS> periodBudgetBillDTOS; 

        private Builder() {
        } 

        private Builder(QueryPeriodBudgetBillResponseBody model) {
            this.periodBudgetBillDTOS = model.periodBudgetBillDTOS;
        } 

        /**
         * periodBudgetBillDTOS.
         */
        public Builder periodBudgetBillDTOS(java.util.List<PeriodBudgetBillDTOS> periodBudgetBillDTOS) {
            this.periodBudgetBillDTOS = periodBudgetBillDTOS;
            return this;
        }

        public QueryPeriodBudgetBillResponseBody build() {
            return new QueryPeriodBudgetBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPeriodBudgetBillResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPeriodBudgetBillResponseBody</p>
     */
    public static class PeriodBudgetBillDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bill")
        private Double bill;

        @com.aliyun.core.annotation.NameInMap("budget")
        private Double budget;

        @com.aliyun.core.annotation.NameInMap("lastYearBill")
        private Double lastYearBill;

        @com.aliyun.core.annotation.NameInMap("month")
        private String month;

        private PeriodBudgetBillDTOS(Builder builder) {
            this.bill = builder.bill;
            this.budget = builder.budget;
            this.lastYearBill = builder.lastYearBill;
            this.month = builder.month;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodBudgetBillDTOS create() {
            return builder().build();
        }

        /**
         * @return bill
         */
        public Double getBill() {
            return this.bill;
        }

        /**
         * @return budget
         */
        public Double getBudget() {
            return this.budget;
        }

        /**
         * @return lastYearBill
         */
        public Double getLastYearBill() {
            return this.lastYearBill;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        public static final class Builder {
            private Double bill; 
            private Double budget; 
            private Double lastYearBill; 
            private String month; 

            private Builder() {
            } 

            private Builder(PeriodBudgetBillDTOS model) {
                this.bill = model.bill;
                this.budget = model.budget;
                this.lastYearBill = model.lastYearBill;
                this.month = model.month;
            } 

            /**
             * bill.
             */
            public Builder bill(Double bill) {
                this.bill = bill;
                return this;
            }

            /**
             * budget.
             */
            public Builder budget(Double budget) {
                this.budget = budget;
                return this;
            }

            /**
             * lastYearBill.
             */
            public Builder lastYearBill(Double lastYearBill) {
                this.lastYearBill = lastYearBill;
                return this;
            }

            /**
             * month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            public PeriodBudgetBillDTOS build() {
                return new PeriodBudgetBillDTOS(this);
            } 

        } 

    }
}
