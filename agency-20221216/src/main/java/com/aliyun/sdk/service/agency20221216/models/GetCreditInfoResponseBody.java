// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreditInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreditInfoResponseBody</p>
 */
public class GetCreditInfoResponseBody extends TeaModel {
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

    private GetCreditInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreditInfoResponseBody create() {
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

        public GetCreditInfoResponseBody build() {
            return new GetCreditInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AlarmThreshold")
        private String alarmThreshold;

        @NameInMap("AvailableCredit")
        private String availableCredit;

        @NameInMap("CreditLine")
        private String creditLine;

        @NameInMap("OutstandingBalance")
        private String outstandingBalance;

        @NameInMap("ZeroCreditShutdownPolicy")
        private String zeroCreditShutdownPolicy;

        @NameInMap("newBuyStatus")
        private String newBuyStatus;

        private Data(Builder builder) {
            this.accountStatus = builder.accountStatus;
            this.alarmThreshold = builder.alarmThreshold;
            this.availableCredit = builder.availableCredit;
            this.creditLine = builder.creditLine;
            this.outstandingBalance = builder.outstandingBalance;
            this.zeroCreditShutdownPolicy = builder.zeroCreditShutdownPolicy;
            this.newBuyStatus = builder.newBuyStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return alarmThreshold
         */
        public String getAlarmThreshold() {
            return this.alarmThreshold;
        }

        /**
         * @return availableCredit
         */
        public String getAvailableCredit() {
            return this.availableCredit;
        }

        /**
         * @return creditLine
         */
        public String getCreditLine() {
            return this.creditLine;
        }

        /**
         * @return outstandingBalance
         */
        public String getOutstandingBalance() {
            return this.outstandingBalance;
        }

        /**
         * @return zeroCreditShutdownPolicy
         */
        public String getZeroCreditShutdownPolicy() {
            return this.zeroCreditShutdownPolicy;
        }

        /**
         * @return newBuyStatus
         */
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        public static final class Builder {
            private String accountStatus; 
            private String alarmThreshold; 
            private String availableCredit; 
            private String creditLine; 
            private String outstandingBalance; 
            private String zeroCreditShutdownPolicy; 
            private String newBuyStatus; 

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * AlarmThreshold.
             */
            public Builder alarmThreshold(String alarmThreshold) {
                this.alarmThreshold = alarmThreshold;
                return this;
            }

            /**
             * AvailableCredit.
             */
            public Builder availableCredit(String availableCredit) {
                this.availableCredit = availableCredit;
                return this;
            }

            /**
             * CreditLine.
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * OutstandingBalance.
             */
            public Builder outstandingBalance(String outstandingBalance) {
                this.outstandingBalance = outstandingBalance;
                return this;
            }

            /**
             * ZeroCreditShutdownPolicy.
             */
            public Builder zeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
                this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
                return this;
            }

            /**
             * newBuyStatus.
             */
            public Builder newBuyStatus(String newBuyStatus) {
                this.newBuyStatus = newBuyStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
