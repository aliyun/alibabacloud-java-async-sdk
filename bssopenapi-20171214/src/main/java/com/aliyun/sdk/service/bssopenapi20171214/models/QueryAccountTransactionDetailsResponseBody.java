// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code returned.</p>
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
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>asadadad-edafafafaasd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAccountTransactionDetailsResponseBody build() {
            return new QueryAccountTransactionDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountTransactionDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionDetailsResponseBody</p>
     */
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
             * <p>The amount of the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>1.00</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The balance of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>The billing cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10</p>
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The type of transaction payment. Valid values:</p>
             * <p>Cash: pay for the transaction in cash. Deposit: pay for the transaction with deposit. RegularBankCreditRefund: pay for the transaction with credit refund controlled by a bank. DirectPay: directly pay for the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>Cash</p>
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            /**
             * <p>The ID of the order or bill.</p>
             * 
             * <strong>example:</strong>
             * <p>2022120336190912</p>
             */
            public Builder recordID(String recordID) {
                this.recordID = recordID;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>The transaction account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:fortune_test@xxx.com">fortune_test@xxx.com</a></p>
             */
            public Builder transactionAccount(String transactionAccount) {
                this.transactionAccount = transactionAccount;
                return this;
            }

            /**
             * <p>The transaction channel.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIPAY</p>
             */
            public Builder transactionChannel(String transactionChannel) {
                this.transactionChannel = transactionChannel;
                return this;
            }

            /**
             * <p>The serial number of the transaction channel.</p>
             * 
             * <strong>example:</strong>
             * <p>123232434343532</p>
             */
            public Builder transactionChannelSN(String transactionChannelSN) {
                this.transactionChannelSN = transactionChannelSN;
                return this;
            }

            /**
             * <p>Indicates whether the transaction is of the income type or the expenditure type. If one of the following types is specified, results for the specific type are returned. If the type that you specified for the parameter does not belong to the following types, no result is returned. If the parameter is left empty, results for transactions of the income and expenditure types are all returned. Valid values:</p>
             * <p>Income and Expense.</p>
             * 
             * <strong>example:</strong>
             * <p>Income</p>
             */
            public Builder transactionFlow(String transactionFlow) {
                this.transactionFlow = transactionFlow;
                return this;
            }

            /**
             * <p>The number of the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>43342334</p>
             */
            public Builder transactionNumber(String transactionNumber) {
                this.transactionNumber = transactionNumber;
                return this;
            }

            /**
             * <p>The time when the transaction was made.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01</p>
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * <p>The type of the transaction. If one of the following transaction types is specified, results for the specified transaction type are returned. If the transaction type that you specified does not belong to the following transaction types, no result is returned. If the parameter is left empty, results for all transaction types are returned. Valid values:</p>
             * <p>Payment, Withdraw, Refund, Consumption, Transfer, and Adjust.</p>
             * 
             * <strong>example:</strong>
             * <p>Consumption</p>
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
    /**
     * 
     * {@link QueryAccountTransactionDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionDetailsResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryAccountTransactionDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionDetailsResponseBody</p>
     */
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
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>yidi</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The details of the transactions within the account.</p>
             */
            public Builder accountTransactionsList(DataAccountTransactionsList accountTransactionsList) {
                this.accountTransactionsList = accountTransactionsList;
                return this;
            }

            /**
             * <p>This parameter is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that is used for paging.</p>
             * 
             * <strong>example:</strong>
             * <p>ASHDADS</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
