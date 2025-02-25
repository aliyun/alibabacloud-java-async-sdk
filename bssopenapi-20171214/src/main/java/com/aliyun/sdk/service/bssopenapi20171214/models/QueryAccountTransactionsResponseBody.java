// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryAccountTransactionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountTransactionsResponseBody</p>
 */
public class QueryAccountTransactionsResponseBody extends TeaModel {
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

    private QueryAccountTransactionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTransactionsResponseBody create() {
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
         * <p>Success</p>
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
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8634E02D-0942-4B1D-8295-5352FE9A1F39</p>
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

        public QueryAccountTransactionsResponseBody build() {
            return new QueryAccountTransactionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountTransactionsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionsResponseBody</p>
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
             * <p>The amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The billing cycle. Format: YYYY-MM.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03</p>
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The type of transaction payment. Valid values:</p>
             * <ul>
             * <li>Cash: pay for the transaction in cash.</li>
             * <li>Deposit: pay for the transaction with deposit.</li>
             * <li>RegularBankCreditRefund: pay for the transaction with credit refund controlled by a bank.</li>
             * <li>DirectPay: directly pay for the transaction.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cash</p>
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            /**
             * <p>The number of the order or bill.</p>
             * 
             * <strong>example:</strong>
             * <p>2020030242</p>
             */
            public Builder recordID(String recordID) {
                this.recordID = recordID;
                return this;
            }

            /**
             * <p>The remarks on the transaction.</p>
             * 
             * <strong>example:</strong>
             * <p>NAT_GW</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>The transaction account. For example, the account is a recharge account in Alipay or a transfer account.</p>
             * 
             * <strong>example:</strong>
             * <p>213562146</p>
             */
            public Builder transactionAccount(String transactionAccount) {
                this.transactionAccount = transactionAccount;
                return this;
            }

            /**
             * <p>The transaction channel.</p>
             * <ul>
             * <li>AccountBalance</li>
             * <li>BankTransfer</li>
             * <li>Alipay</li>
             * <li>AntCreditPay</li>
             * <li>OfflineRemittance</li>
             * <li>RegularBankCreditRefund</li>
             * <li>CreditCard</li>
             * <li>MyBankCredit</li>
             * <li>HuaxiaBankCInstallment</li>
             * <li>ApplePay</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountBalance</p>
             */
            public Builder transactionChannel(String transactionChannel) {
                this.transactionChannel = transactionChannel;
                return this;
            }

            /**
             * <p>The serial number of the transaction channel.</p>
             * 
             * <strong>example:</strong>
             * <p>1234354325</p>
             */
            public Builder transactionChannelSN(String transactionChannelSN) {
                this.transactionChannelSN = transactionChannelSN;
                return this;
            }

            /**
             * <p>The type of the transaction flow.</p>
             * <ul>
             * <li>Income</li>
             * <li>Expense</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Expense</p>
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
             * <p>2020-03-10T02:03:20Z</p>
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * <p>The type of the transaction.</p>
             * <ul>
             * <li>Payment</li>
             * <li>Withdraw</li>
             * <li>Refund</li>
             * <li>Consumption</li>
             * <li>Transfer</li>
             * <li>Adjust</li>
             * </ul>
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
     * {@link QueryAccountTransactionsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionsResponseBody</p>
     */
    public static class DataAccountTransactionsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountTransactionsList")
        private java.util.List<AccountTransactionsList> accountTransactionsList;

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
        public java.util.List<AccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

        public static final class Builder {
            private java.util.List<AccountTransactionsList> accountTransactionsList; 

            /**
             * AccountTransactionsList.
             */
            public Builder accountTransactionsList(java.util.List<AccountTransactionsList> accountTransactionsList) {
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
     * {@link QueryAccountTransactionsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTransactionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountTransactionsList")
        private DataAccountTransactionsList accountTransactionsList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.accountName = builder.accountName;
            this.accountTransactionsList = builder.accountTransactionsList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
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
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
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
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The name of your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The information about transactions.</p>
             */
            public Builder accountTransactionsList(DataAccountTransactionsList accountTransactionsList) {
                this.accountTransactionsList = accountTransactionsList;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
