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

        private Builder(GetCreditInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. Valid values:</p>
         * <ul>
         * <li>200: OK.</li>
         * <li>1109: System error.</li>
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message information.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud uses this ID for error tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current API call is successful. Valid values:</p>
         * <ul>
         * <li>True: Successful.</li>
         * <li>False: Failed.</li>
         * </ul>
         * <p>This does not indicate whether the subsequent business operation is successful.</p>
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

        @com.aliyun.core.annotation.NameInMap("PAYGFreezeStatus")
        private String PAYGFreezeStatus;

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
            this.PAYGFreezeStatus = builder.PAYGFreezeStatus;
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
         * @return PAYGFreezeStatus
         */
        public String getPAYGFreezeStatus() {
            return this.PAYGFreezeStatus;
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
            private String PAYGFreezeStatus; 
            private String zeroCreditShutdownPolicy; 
            private String newBuyStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountStatus = model.accountStatus;
                this.alarmThreshold = model.alarmThreshold;
                this.availableCredit = model.availableCredit;
                this.consumedUndeductedValue = model.consumedUndeductedValue;
                this.creditLine = model.creditLine;
                this.outstandingBalance = model.outstandingBalance;
                this.PAYGFreezeStatus = model.PAYGFreezeStatus;
                this.zeroCreditShutdownPolicy = model.zeroCreditShutdownPolicy;
                this.newBuyStatus = model.newBuyStatus;
            } 

            /**
             * <p>The credit control status of the sub-account. Valid values:</p>
             * <ol>
             * <li>normal: Normal.</li>
             * <li>arrearsNotShutdown: The account has an overdue payment but is not shut down.</li>
             * <li>shutdown: Shut down.</li>
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
             * <p>The percentage value. When the available credit drops below this percentage of the credit limit, an email notification is sent to the main account.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder alarmThreshold(String alarmThreshold) {
                this.alarmThreshold = alarmThreshold;
                return this;
            }

            /**
             * <p>The available credit.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder availableCredit(String availableCredit) {
                this.availableCredit = availableCredit;
                return this;
            }

            /**
             * <p>The total outstanding amount of virtual bills before simulated deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder consumedUndeductedValue(String consumedUndeductedValue) {
                this.consumedUndeductedValue = consumedUndeductedValue;
                return this;
            }

            /**
             * <p>The credit limit of the sub-account.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * <p>The credit amount consumed by the sub-account that has not yet been paid.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outstandingBalance(String outstandingBalance) {
                this.outstandingBalance = outstandingBalance;
                return this;
            }

            /**
             * <p>The freeze status of pay-as-you-go. Valid values:</p>
             * <ul>
             * <li>freeze: Frozen.</li>
             * <li>normal: Normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder PAYGFreezeStatus(String PAYGFreezeStatus) {
                this.PAYGFreezeStatus = PAYGFreezeStatus;
                return this;
            }

            /**
             * <p>The policy that the system uses to manage resources when the active credit is 0 or less. Valid values:</p>
             * <p>1: delayStop. Alibaba Cloud takes over the resources. Instances are shut down after the credit is exhausted with a delay epoch. If payment is not made within 15 days, storage resources are released.</p>
             * <p>2: noStop. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manage it manually.</p>
             * <p>3: immediatelyStop. Instances are shut down immediately when the account enters the overdue payment state, which triggers instance shutdown.</p>
             * 
             * <strong>example:</strong>
             * <p>delayStop</p>
             */
            public Builder zeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
                this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
                return this;
            }

            /**
             * <p>The status that manages the purchase actions of the customer. Valid values:</p>
             * <ul>
             * <li>ban: New purchases are prohibited.</li>
             * <li>cancelBan: Normal status.</li>
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
