// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetCreditInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreditInfoResponseBody</p>
 */
public class GetCreditInfoResponseBody extends TeaModel {
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
         * <p>Result Code:</p>
         * <ul>
         * <li>200 OK</li>
         * <li>1109 System Error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Message Information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, Alibaba Cloud will track errors with this.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCreditInfoResponseBody build() {
            return new GetCreditInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCreditInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetCreditInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AlarmThreshold")
        private String alarmThreshold;

        @com.aliyun.core.annotation.NameInMap("AvailableCredit")
        private String availableCredit;

        @com.aliyun.core.annotation.NameInMap("ConsumedUndeductedValue")
        private String consumedUndeductedValue;

        @com.aliyun.core.annotation.NameInMap("CreditLine")
        private String creditLine;

        @com.aliyun.core.annotation.NameInMap("OutstandingBalance")
        private String outstandingBalance;

        @com.aliyun.core.annotation.NameInMap("ZeroCreditShutdownPolicy")
        private String zeroCreditShutdownPolicy;

        @com.aliyun.core.annotation.NameInMap("newBuyStatus")
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
             * <p>The Credit Control status, Value Range:</br></p>
             * <ol>
             * <li>normal - Sub Account status is running as usual.</li>
             * <li>arrearsNotShutdown - Sub Account status is running as usual, but have outstanding bill(s).</li>
             * <li>shutdown -  Sub Account status is down.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>Percentage value, when the available credit limit is lower than this credit limit percentage, a notification E-mail will be sent to the main account.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder alarmThreshold(String alarmThreshold) {
                this.alarmThreshold = alarmThreshold;
                return this;
            }

            /**
             * <p>The Credit available to consume.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder availableCredit(String availableCredit) {
                this.availableCredit = availableCredit;
                return this;
            }

            /**
             * <p>Obtain total unpaid amount on demo bill before simulated deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder consumedUndeductedValue(String consumedUndeductedValue) {
                this.consumedUndeductedValue = consumedUndeductedValue;
                return this;
            }

            /**
             * <p>The Credit Line of Sub Account</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * <p>The Credit have been consumed by Sub Account, and haven&quot;t be paid.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outstandingBalance(String outstandingBalance) {
                this.outstandingBalance = outstandingBalance;
                return this;
            }

            /**
             * <p>The systematic controlling policy for resource management, specifically when the available Credit of Sub Account falls to 0 or less.</br></p>
             * <ul>
             * <li>1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br></li>
             * <li>2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource&quot;s life-circle of Sub Account.</br></li>
             * <li>3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delayStop</p>
             */
            public Builder zeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
                this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
                return this;
            }

            /**
             * <p>Manage order operation.</p>
             * <ul>
             * <li>ban：Ban the new purchase action.</li>
             * <li>normal：The account could raise new purchase order as usual.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ban</p>
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
