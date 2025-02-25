// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDayAmountResponseBody} extends {@link TeaModel}
 *
 * <p>ListDayAmountResponseBody</p>
 */
public class ListDayAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DayAmounts")
    private java.util.List < DayAmounts> dayAmounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDayAmountResponseBody(Builder builder) {
        this.dayAmounts = builder.dayAmounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDayAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return dayAmounts
     */
    public java.util.List < DayAmounts> getDayAmounts() {
        return this.dayAmounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DayAmounts> dayAmounts; 
        private String requestId; 

        /**
         * DayAmounts.
         */
        public Builder dayAmounts(java.util.List < DayAmounts> dayAmounts) {
            this.dayAmounts = dayAmounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDayAmountResponseBody build() {
            return new ListDayAmountResponseBody(this);
        } 

    } 

    public static class DayAmounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        private DayAmounts(Builder builder) {
            this.amount = builder.amount;
            this.date = builder.date;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DayAmounts create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        public static final class Builder {
            private Integer amount; 
            private String date; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            public DayAmounts build() {
                return new DayAmounts(this);
            } 

        } 

    }
}
