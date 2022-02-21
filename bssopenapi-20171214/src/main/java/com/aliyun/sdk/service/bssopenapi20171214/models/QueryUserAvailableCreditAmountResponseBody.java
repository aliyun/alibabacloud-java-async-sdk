// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserAvailableCreditAmountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserAvailableCreditAmountResponseBody</p>
 */
public class QueryUserAvailableCreditAmountResponseBody extends TeaModel {
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

    private QueryUserAvailableCreditAmountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserAvailableCreditAmountResponseBody create() {
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

        public QueryUserAvailableCreditAmountResponseBody build() {
            return new QueryUserAvailableCreditAmountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AvailableAmount")
        private String availableAmount;

        @NameInMap("AvailableCacheAmount")
        private String availableCacheAmount;

        @NameInMap("AwardedCreditAmount")
        private String awardedCreditAmount;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("WwardMyBankAmount")
        private String wwardMyBankAmount;

        private Data(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.availableCacheAmount = builder.availableCacheAmount;
            this.awardedCreditAmount = builder.awardedCreditAmount;
            this.currency = builder.currency;
            this.wwardMyBankAmount = builder.wwardMyBankAmount;
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
         * @return availableCacheAmount
         */
        public String getAvailableCacheAmount() {
            return this.availableCacheAmount;
        }

        /**
         * @return awardedCreditAmount
         */
        public String getAwardedCreditAmount() {
            return this.awardedCreditAmount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return wwardMyBankAmount
         */
        public String getWwardMyBankAmount() {
            return this.wwardMyBankAmount;
        }

        public static final class Builder {
            private String availableAmount; 
            private String availableCacheAmount; 
            private String awardedCreditAmount; 
            private String currency; 
            private String wwardMyBankAmount; 

            /**
             * AvailableAmount.
             */
            public Builder availableAmount(String availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * AvailableCacheAmount.
             */
            public Builder availableCacheAmount(String availableCacheAmount) {
                this.availableCacheAmount = availableCacheAmount;
                return this;
            }

            /**
             * AwardedCreditAmount.
             */
            public Builder awardedCreditAmount(String awardedCreditAmount) {
                this.awardedCreditAmount = awardedCreditAmount;
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
             * WwardMyBankAmount.
             */
            public Builder wwardMyBankAmount(String wwardMyBankAmount) {
                this.wwardMyBankAmount = wwardMyBankAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
