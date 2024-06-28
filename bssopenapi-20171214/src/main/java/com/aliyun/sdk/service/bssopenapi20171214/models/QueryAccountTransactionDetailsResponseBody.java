// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountTransactionDetailsResponseBody</p>
 */
public class QueryAccountTransactionDetailsResponseBody extends TeaModel {
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

        public QueryAccountTransactionDetailsResponseBody build() {
            return new QueryAccountTransactionDetailsResponseBody(this);
        } 

    } 

    public static class AccountTransactionsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private String balance;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        @com.aliyun.core.annotation.NameInMap("RecordID")
        private String recordID;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TransactionAccount")
        private String transactionAccount;

        @com.aliyun.core.annotation.NameInMap("TransactionChannel")
        private String transactionChannel;

        @com.aliyun.core.annotation.NameInMap("TransactionChannelSN")
        private String transactionChannelSN;

        @com.aliyun.core.annotation.NameInMap("TransactionFlow")
        private String transactionFlow;

        @com.aliyun.core.annotation.NameInMap("TransactionNumber")
        private String transactionNumber;

        @com.aliyun.core.annotation.NameInMap("TransactionTime")
        private String transactionTime;

        @com.aliyun.core.annotation.NameInMap("TransactionType")
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
             * The amount of the transaction.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The balance of the account.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * The billing cycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * The type of transaction payment. Valid values:
             * <p>
             * 
             * Cash: pay for the transaction in cash. Deposit: pay for the transaction with deposit. RegularBankCreditRefund: pay for the transaction with credit refund controlled by a bank. DirectPay: directly pay for the transaction.
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            /**
             * The ID of the order or bill.
             */
            public Builder recordID(String recordID) {
                this.recordID = recordID;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * The transaction account.
             */
            public Builder transactionAccount(String transactionAccount) {
                this.transactionAccount = transactionAccount;
                return this;
            }

            /**
             * The transaction channel.
             */
            public Builder transactionChannel(String transactionChannel) {
                this.transactionChannel = transactionChannel;
                return this;
            }

            /**
             * The serial number of the transaction channel.
             */
            public Builder transactionChannelSN(String transactionChannelSN) {
                this.transactionChannelSN = transactionChannelSN;
                return this;
            }

            /**
             * Indicates whether the transaction is of the income type or the expenditure type. If one of the following types is specified, results for the specific type are returned. If the type that you specified for the parameter does not belong to the following types, no result is returned. If the parameter is left empty, results for transactions of the income and expenditure types are all returned. Valid values:
             * <p>
             * 
             * Income and Expense.
             */
            public Builder transactionFlow(String transactionFlow) {
                this.transactionFlow = transactionFlow;
                return this;
            }

            /**
             * The number of the transaction.
             */
            public Builder transactionNumber(String transactionNumber) {
                this.transactionNumber = transactionNumber;
                return this;
            }

            /**
             * The time when the transaction was made.
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * The type of the transaction. If one of the following transaction types is specified, results for the specified transaction type are returned. If the transaction type that you specified does not belong to the following transaction types, no result is returned. If the parameter is left empty, results for all transaction types are returned. Valid values:
             * <p>
             * 
             * Payment, Withdraw, Refund, Consumption, Transfer, and Adjust.
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
        @com.aliyun.core.annotation.NameInMap("AccountTransactionsList")
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
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountTransactionsList")
        private DataAccountTransactionsList accountTransactionsList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * The name of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The details of the transactions within the account.
             */
            public Builder accountTransactionsList(DataAccountTransactionsList accountTransactionsList) {
                this.accountTransactionsList = accountTransactionsList;
                return this;
            }

            /**
             * This parameter is invalid.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that is used for paging.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of entries returned.
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
