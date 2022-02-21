// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBalanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountBalanceResponseBody</p>
 */
public class QueryAccountBalanceResponseBody extends TeaModel {
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

        public QueryAccountBalanceResponseBody build() {
            return new QueryAccountBalanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AvailableAmount")
        private String availableAmount;

        @NameInMap("AvailableCashAmount")
        private String availableCashAmount;

        @NameInMap("CreditAmount")
        private String creditAmount;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("MybankCreditAmount")
        private String mybankCreditAmount;

        private Data(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.availableCashAmount = builder.availableCashAmount;
            this.creditAmount = builder.creditAmount;
            this.currency = builder.currency;
            this.mybankCreditAmount = builder.mybankCreditAmount;
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

        public static final class Builder {
            private String availableAmount; 
            private String availableCashAmount; 
            private String creditAmount; 
            private String currency; 
            private String mybankCreditAmount; 

            /**
             * AvailableAmount.
             */
            public Builder availableAmount(String availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * AvailableCashAmount.
             */
            public Builder availableCashAmount(String availableCashAmount) {
                this.availableCashAmount = availableCashAmount;
                return this;
            }

            /**
             * CreditAmount.
             */
            public Builder creditAmount(String creditAmount) {
                this.creditAmount = creditAmount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * MybankCreditAmount.
             */
            public Builder mybankCreditAmount(String mybankCreditAmount) {
                this.mybankCreditAmount = mybankCreditAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
