// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountTransactionDetailsResponseBody</p>
 */
public class QueryAccountTransactionDetailsResponseBody extends TeaModel {
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

    private QueryAccountTransactionDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTransactionDetailsResponseBody create() {
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

        public QueryAccountTransactionDetailsResponseBody build() {
            return new QueryAccountTransactionDetailsResponseBody(this);
        } 

    } 

    public static class AccountTransactionsList extends TeaModel {
        @NameInMap("Amount")
        private String amount;

        @NameInMap("Balance")
        private String balance;

        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("FundType")
        private String fundType;

        @NameInMap("RecordID")
        private String recordID;

        @NameInMap("Remarks")
        private String remarks;

        @NameInMap("TransactionAccount")
        private String transactionAccount;

        @NameInMap("TransactionChannel")
        private String transactionChannel;

        @NameInMap("TransactionChannelSN")
        private String transactionChannelSN;

        @NameInMap("TransactionFlow")
        private String transactionFlow;

        @NameInMap("TransactionNumber")
        private String transactionNumber;

        @NameInMap("TransactionTime")
        private String transactionTime;

        @NameInMap("TransactionType")
        private String transactionType;

        private AccountTransactionsList(Builder builder) {
            this.amount = builder.amount;
            this.balance = builder.balance;
            this.billingCycle = builder.billingCycle;
            this.fundType = builder.fundType;
            this.recordID = builder.recordID;
            this.remarks = builder.remarks;
            this.transactionAccount = builder.transactionAccount;
            this.transactionChannel = builder.transactionChannel;
            this.transactionChannelSN = builder.transactionChannelSN;
            this.transactionFlow = builder.transactionFlow;
            this.transactionNumber = builder.transactionNumber;
            this.transactionTime = builder.transactionTime;
            this.transactionType = builder.transactionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountTransactionsList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return balance
         */
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return fundType
         */
        public String getFundType() {
            return this.fundType;
        }

        /**
         * @return recordID
         */
        public String getRecordID() {
            return this.recordID;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return transactionAccount
         */
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

        /**
         * @return transactionChannel
         */
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        /**
         * @return transactionChannelSN
         */
        public String getTransactionChannelSN() {
            return this.transactionChannelSN;
        }

        /**
         * @return transactionFlow
         */
        public String getTransactionFlow() {
            return this.transactionFlow;
        }

        /**
         * @return transactionNumber
         */
        public String getTransactionNumber() {
            return this.transactionNumber;
        }

        /**
         * @return transactionTime
         */
        public String getTransactionTime() {
            return this.transactionTime;
        }

        /**
         * @return transactionType
         */
        public String getTransactionType() {
            return this.transactionType;
        }

        public static final class Builder {
            private String amount; 
            private String balance; 
            private String billingCycle; 
            private String fundType; 
            private String recordID; 
            private String remarks; 
            private String transactionAccount; 
            private String transactionChannel; 
            private String transactionChannelSN; 
            private String transactionFlow; 
            private String transactionNumber; 
            private String transactionTime; 
            private String transactionType; 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Balance.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * BillingCycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * FundType.
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            /**
             * RecordID.
             */
            public Builder recordID(String recordID) {
                this.recordID = recordID;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TransactionAccount.
             */
            public Builder transactionAccount(String transactionAccount) {
                this.transactionAccount = transactionAccount;
                return this;
            }

            /**
             * TransactionChannel.
             */
            public Builder transactionChannel(String transactionChannel) {
                this.transactionChannel = transactionChannel;
                return this;
            }

            /**
             * TransactionChannelSN.
             */
            public Builder transactionChannelSN(String transactionChannelSN) {
                this.transactionChannelSN = transactionChannelSN;
                return this;
            }

            /**
             * TransactionFlow.
             */
            public Builder transactionFlow(String transactionFlow) {
                this.transactionFlow = transactionFlow;
                return this;
            }

            /**
             * TransactionNumber.
             */
            public Builder transactionNumber(String transactionNumber) {
                this.transactionNumber = transactionNumber;
                return this;
            }

            /**
             * TransactionTime.
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * TransactionType.
             */
            public Builder transactionType(String transactionType) {
                this.transactionType = transactionType;
                return this;
            }

            public AccountTransactionsList build() {
                return new AccountTransactionsList(this);
            } 

        } 

    }
    public static class DataAccountTransactionsList extends TeaModel {
        @NameInMap("AccountTransactionsList")
        private java.util.List < AccountTransactionsList> accountTransactionsList;

        private DataAccountTransactionsList(Builder builder) {
            this.accountTransactionsList = builder.accountTransactionsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataAccountTransactionsList create() {
            return builder().build();
        }

        /**
         * @return accountTransactionsList
         */
        public java.util.List < AccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

        public static final class Builder {
            private java.util.List < AccountTransactionsList> accountTransactionsList; 

            /**
             * AccountTransactionsList.
             */
            public Builder accountTransactionsList(java.util.List < AccountTransactionsList> accountTransactionsList) {
                this.accountTransactionsList = accountTransactionsList;
                return this;
            }

            public DataAccountTransactionsList build() {
                return new DataAccountTransactionsList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountTransactionsList")
        private DataAccountTransactionsList accountTransactionsList;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.accountName = builder.accountName;
            this.accountTransactionsList = builder.accountTransactionsList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountTransactionsList
         */
        public DataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String accountName; 
            private DataAccountTransactionsList accountTransactionsList; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountTransactionsList.
             */
            public Builder accountTransactionsList(DataAccountTransactionsList accountTransactionsList) {
                this.accountTransactionsList = accountTransactionsList;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
