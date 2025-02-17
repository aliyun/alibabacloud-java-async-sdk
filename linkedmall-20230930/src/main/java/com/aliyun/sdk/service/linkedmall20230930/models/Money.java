// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link Money} extends {@link TeaModel}
 *
 * <p>Money</p>
 */
public class Money extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("amountAsString")
    private String amountAsString;

    @com.aliyun.core.annotation.NameInMap("amountString")
    private String amountString;

    @com.aliyun.core.annotation.NameInMap("cent")
    private Long cent;

    @com.aliyun.core.annotation.NameInMap("currency")
    private Currency currency;

    @com.aliyun.core.annotation.NameInMap("currencyCode")
    private String currencyCode;

    @com.aliyun.core.annotation.NameInMap("positive")
    private Boolean positive;

    private Money(Builder builder) {
        this.amount = builder.amount;
        this.amountAsString = builder.amountAsString;
        this.amountString = builder.amountString;
        this.cent = builder.cent;
        this.currency = builder.currency;
        this.currencyCode = builder.currencyCode;
        this.positive = builder.positive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Money create() {
        return builder().build();
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return amountAsString
     */
    public String getAmountAsString() {
        return this.amountAsString;
    }

    /**
     * @return amountString
     */
    public String getAmountString() {
        return this.amountString;
    }

    /**
     * @return cent
     */
    public Long getCent() {
        return this.cent;
    }

    /**
     * @return currency
     */
    public Currency getCurrency() {
        return this.currency;
    }

    /**
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * @return positive
     */
    public Boolean getPositive() {
        return this.positive;
    }

    public static final class Builder {
        private Long amount; 
        private String amountAsString; 
        private String amountString; 
        private Long cent; 
        private Currency currency; 
        private String currencyCode; 
        private Boolean positive; 

        /**
         * amount.
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * amountAsString.
         */
        public Builder amountAsString(String amountAsString) {
            this.amountAsString = amountAsString;
            return this;
        }

        /**
         * amountString.
         */
        public Builder amountString(String amountString) {
            this.amountString = amountString;
            return this;
        }

        /**
         * cent.
         */
        public Builder cent(Long cent) {
            this.cent = cent;
            return this;
        }

        /**
         * currency.
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        /**
         * currencyCode.
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * positive.
         */
        public Builder positive(Boolean positive) {
            this.positive = positive;
            return this;
        }

        public Money build() {
            return new Money(this);
        } 

    } 

    /**
     * 
     * {@link Money} extends {@link TeaModel}
     *
     * <p>Money</p>
     */
    public static class Currency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currencyCode")
        private String currencyCode;

        @com.aliyun.core.annotation.NameInMap("defaultFractionDigits")
        private Integer defaultFractionDigits;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("numericCode")
        private Integer numericCode;

        @com.aliyun.core.annotation.NameInMap("symbol")
        private String symbol;

        private Currency(Builder builder) {
            this.currencyCode = builder.currencyCode;
            this.defaultFractionDigits = builder.defaultFractionDigits;
            this.displayName = builder.displayName;
            this.numericCode = builder.numericCode;
            this.symbol = builder.symbol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Currency create() {
            return builder().build();
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return defaultFractionDigits
         */
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return numericCode
         */
        public Integer getNumericCode() {
            return this.numericCode;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        public static final class Builder {
            private String currencyCode; 
            private Integer defaultFractionDigits; 
            private String displayName; 
            private Integer numericCode; 
            private String symbol; 

            /**
             * currencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * defaultFractionDigits.
             */
            public Builder defaultFractionDigits(Integer defaultFractionDigits) {
                this.defaultFractionDigits = defaultFractionDigits;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * numericCode.
             */
            public Builder numericCode(Integer numericCode) {
                this.numericCode = numericCode;
                return this;
            }

            /**
             * symbol.
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            public Currency build() {
                return new Currency(this);
            } 

        } 

    }
}
