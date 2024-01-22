// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddressOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddressOverviewResponseBody</p>
 */
public class DescribeAddressOverviewResponseBody extends TeaModel {
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

    private DescribeAddressOverviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressOverviewResponseBody create() {
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
         * Id of the request
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

        public DescribeAddressOverviewResponseBody build() {
            return new DescribeAddressOverviewResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Balance")
        private Float balance;

        @NameInMap("FirstSeen")
        private Long firstSeen;

        @NameInMap("LastSeen")
        private Long lastSeen;

        @NameInMap("ReceivedTxsCount")
        private Integer receivedTxsCount;

        @NameInMap("SpentTxsCount")
        private Integer spentTxsCount;

        @NameInMap("TotalReceived")
        private Float totalReceived;

        @NameInMap("TotalSpent")
        private Float totalSpent;

        @NameInMap("TxsCount")
        private Long txsCount;

        private Data(Builder builder) {
            this.balance = builder.balance;
            this.firstSeen = builder.firstSeen;
            this.lastSeen = builder.lastSeen;
            this.receivedTxsCount = builder.receivedTxsCount;
            this.spentTxsCount = builder.spentTxsCount;
            this.totalReceived = builder.totalReceived;
            this.totalSpent = builder.totalSpent;
            this.txsCount = builder.txsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return balance
         */
        public Float getBalance() {
            return this.balance;
        }

        /**
         * @return firstSeen
         */
        public Long getFirstSeen() {
            return this.firstSeen;
        }

        /**
         * @return lastSeen
         */
        public Long getLastSeen() {
            return this.lastSeen;
        }

        /**
         * @return receivedTxsCount
         */
        public Integer getReceivedTxsCount() {
            return this.receivedTxsCount;
        }

        /**
         * @return spentTxsCount
         */
        public Integer getSpentTxsCount() {
            return this.spentTxsCount;
        }

        /**
         * @return totalReceived
         */
        public Float getTotalReceived() {
            return this.totalReceived;
        }

        /**
         * @return totalSpent
         */
        public Float getTotalSpent() {
            return this.totalSpent;
        }

        /**
         * @return txsCount
         */
        public Long getTxsCount() {
            return this.txsCount;
        }

        public static final class Builder {
            private Float balance; 
            private Long firstSeen; 
            private Long lastSeen; 
            private Integer receivedTxsCount; 
            private Integer spentTxsCount; 
            private Float totalReceived; 
            private Float totalSpent; 
            private Long txsCount; 

            /**
             * Balance.
             */
            public Builder balance(Float balance) {
                this.balance = balance;
                return this;
            }

            /**
             * FirstSeen.
             */
            public Builder firstSeen(Long firstSeen) {
                this.firstSeen = firstSeen;
                return this;
            }

            /**
             * LastSeen.
             */
            public Builder lastSeen(Long lastSeen) {
                this.lastSeen = lastSeen;
                return this;
            }

            /**
             * ReceivedTxsCount.
             */
            public Builder receivedTxsCount(Integer receivedTxsCount) {
                this.receivedTxsCount = receivedTxsCount;
                return this;
            }

            /**
             * SpentTxsCount.
             */
            public Builder spentTxsCount(Integer spentTxsCount) {
                this.spentTxsCount = spentTxsCount;
                return this;
            }

            /**
             * TotalReceived.
             */
            public Builder totalReceived(Float totalReceived) {
                this.totalReceived = totalReceived;
                return this;
            }

            /**
             * TotalSpent.
             */
            public Builder totalSpent(Float totalSpent) {
                this.totalSpent = totalSpent;
                return this;
            }

            /**
             * TxsCount.
             */
            public Builder txsCount(Long txsCount) {
                this.txsCount = txsCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
