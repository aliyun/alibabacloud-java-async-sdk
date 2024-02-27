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
         * Result Code:
         * <p>
         * - 200 OK
         * - 1109 System Error
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
         * Message Information
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, Alibaba Cloud will track errors with this.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.
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

        @NameInMap("ConsumedUndeductedValue")
        private String consumedUndeductedValue;

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
            this.consumedUndeductedValue = builder.consumedUndeductedValue;
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
         * @return consumedUndeductedValue
         */
        public String getConsumedUndeductedValue() {
            return this.consumedUndeductedValue;
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
            private String consumedUndeductedValue; 
            private String creditLine; 
            private String outstandingBalance; 
            private String zeroCreditShutdownPolicy; 
            private String newBuyStatus; 

            /**
             * The Credit Control status, Value Range:</br>
             * <p>
             * 1. normal - Sub Account status is running as usual.
             * 2. arrearsNotShutdown - Sub Account status is running as usual, but have outstanding bill(s).
             * 3. shutdown -  Sub Account status is down.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * Percentage value, when the available credit limit is lower than this credit limit percentage, a notification E-mail will be sent to the main account.
             */
            public Builder alarmThreshold(String alarmThreshold) {
                this.alarmThreshold = alarmThreshold;
                return this;
            }

            /**
             * The Credit available to consume.
             */
            public Builder availableCredit(String availableCredit) {
                this.availableCredit = availableCredit;
                return this;
            }

            /**
             * Obtain total unpaid amount on demo bill before simulated deduction.
             */
            public Builder consumedUndeductedValue(String consumedUndeductedValue) {
                this.consumedUndeductedValue = consumedUndeductedValue;
                return this;
            }

            /**
             * The Credit Line of Sub Account
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * The Credit have been consumed by Sub Account, and haven\"t be paid.
             */
            public Builder outstandingBalance(String outstandingBalance) {
                this.outstandingBalance = outstandingBalance;
                return this;
            }

            /**
             * The systematic controlling policy for resource management, specifically when the available Credit of Sub Account falls to 0 or less.</br>
             * <p>
             * 
             * - 1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br>
             * - 2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\"s life-circle of Sub Account.</br>
             * - 3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br>
             */
            public Builder zeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
                this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
                return this;
            }

            /**
             * Manage order operation.
             * <p>
             * - ban：Ban the new purchase action.
             * - normal：The account could raise new purchase order as usual.
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
