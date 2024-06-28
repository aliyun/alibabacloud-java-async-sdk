// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBalanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountBalanceResponseBody</p>
 */
public class QueryAccountBalanceResponseBody extends TeaModel {
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

    private QueryAccountBalanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountBalanceResponseBody create() {
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
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
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

        public QueryAccountBalanceResponseBody build() {
            return new QueryAccountBalanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private String availableAmount;

        @com.aliyun.core.annotation.NameInMap("AvailableCashAmount")
        private String availableCashAmount;

        @com.aliyun.core.annotation.NameInMap("CreditAmount")
        private String creditAmount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("MybankCreditAmount")
        private String mybankCreditAmount;

        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private String quotaLimit;

        private Data(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.availableCashAmount = builder.availableCashAmount;
            this.creditAmount = builder.creditAmount;
            this.currency = builder.currency;
            this.mybankCreditAmount = builder.mybankCreditAmount;
            this.quotaLimit = builder.quotaLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableAmount
         */
        public String getAvailableAmount() {
            return this.availableAmount;
        }

        /**
         * @return availableCashAmount
         */
        public String getAvailableCashAmount() {
            return this.availableCashAmount;
        }

        /**
         * @return creditAmount
         */
        public String getCreditAmount() {
            return this.creditAmount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return mybankCreditAmount
         */
        public String getMybankCreditAmount() {
            return this.mybankCreditAmount;
        }

        /**
         * @return quotaLimit
         */
        public String getQuotaLimit() {
            return this.quotaLimit;
        }

        public static final class Builder {
            private String availableAmount; 
            private String availableCashAmount; 
            private String creditAmount; 
            private String currency; 
            private String mybankCreditAmount; 
            private String quotaLimit; 

            /**
             * The available balance of the account.
             */
            public Builder availableAmount(String availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * The available balance in cash.
             */
            public Builder availableCashAmount(String availableCashAmount) {
                this.availableCashAmount = availableCashAmount;
                return this;
            }

            /**
             * The credit balance of the account.
             */
            public Builder creditAmount(String creditAmount) {
                this.creditAmount = creditAmount;
                return this;
            }

            /**
             * The type of the currency. Valid values:
             * <p>
             * 
             * *   CNY: Chinese Yuan
             * *   USD: US dollar
             * *   JPY: Japanese Yen
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The credit line controlled by MYbank.
             */
            public Builder mybankCreditAmount(String mybankCreditAmount) {
                this.mybankCreditAmount = mybankCreditAmount;
                return this;
            }

            /**
             * QuotaLimit.
             */
            public Builder quotaLimit(String quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
