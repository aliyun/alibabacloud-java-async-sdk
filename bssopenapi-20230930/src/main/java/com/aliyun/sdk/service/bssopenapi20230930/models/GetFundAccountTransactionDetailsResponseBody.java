// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetFundAccountTransactionDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountTransactionDetailsResponseBody</p>
 */
public class GetFundAccountTransactionDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetFundAccountTransactionDetailsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountTransactionDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Object metadata; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetFundAccountTransactionDetailsResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.metadata = model.metadata;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Data list</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response structure metadata</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetFundAccountTransactionDetailsResponseBody build() {
            return new GetFundAccountTransactionDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFundAccountTransactionDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFundAccountTransactionDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Balance")
        private String balance;

        @com.aliyun.core.annotation.NameInMap("BillNumber")
        private String billNumber;

        @com.aliyun.core.annotation.NameInMap("ChannelTransactionNumber")
        private String channelTransactionNumber;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("FundAccountEcid")
        private String fundAccountEcid;

        @com.aliyun.core.annotation.NameInMap("FundAccountId")
        private Long fundAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountName")
        private String fundAccountName;

        @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
        private Long fundAccountOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        @com.aliyun.core.annotation.NameInMap("Nbid")
        private String nbid;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("TransactionAccount")
        private String transactionAccount;

        @com.aliyun.core.annotation.NameInMap("TransactionAmount")
        private String transactionAmount;

        @com.aliyun.core.annotation.NameInMap("TransactionChannel")
        private String transactionChannel;

        @com.aliyun.core.annotation.NameInMap("TransactionDirection")
        private String transactionDirection;

        @com.aliyun.core.annotation.NameInMap("TransactionNumber")
        private Long transactionNumber;

        @com.aliyun.core.annotation.NameInMap("TransactionTime")
        private String transactionTime;

        @com.aliyun.core.annotation.NameInMap("TransactionType")
        private String transactionType;

        private Data(Builder builder) {
            this.balance = builder.balance;
            this.billNumber = builder.billNumber;
            this.channelTransactionNumber = builder.channelTransactionNumber;
            this.currency = builder.currency;
            this.fundAccountEcid = builder.fundAccountEcid;
            this.fundAccountId = builder.fundAccountId;
            this.fundAccountName = builder.fundAccountName;
            this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
            this.fundType = builder.fundType;
            this.nbid = builder.nbid;
            this.remark = builder.remark;
            this.site = builder.site;
            this.transactionAccount = builder.transactionAccount;
            this.transactionAmount = builder.transactionAmount;
            this.transactionChannel = builder.transactionChannel;
            this.transactionDirection = builder.transactionDirection;
            this.transactionNumber = builder.transactionNumber;
            this.transactionTime = builder.transactionTime;
            this.transactionType = builder.transactionType;
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
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return billNumber
         */
        public String getBillNumber() {
            return this.billNumber;
        }

        /**
         * @return channelTransactionNumber
         */
        public String getChannelTransactionNumber() {
            return this.channelTransactionNumber;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return fundAccountEcid
         */
        public String getFundAccountEcid() {
            return this.fundAccountEcid;
        }

        /**
         * @return fundAccountId
         */
        public Long getFundAccountId() {
            return this.fundAccountId;
        }

        /**
         * @return fundAccountName
         */
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        /**
         * @return fundAccountOwnerAccountId
         */
        public Long getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        /**
         * @return fundType
         */
        public String getFundType() {
            return this.fundType;
        }

        /**
         * @return nbid
         */
        public String getNbid() {
            return this.nbid;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return transactionAccount
         */
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

        /**
         * @return transactionAmount
         */
        public String getTransactionAmount() {
            return this.transactionAmount;
        }

        /**
         * @return transactionChannel
         */
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        /**
         * @return transactionDirection
         */
        public String getTransactionDirection() {
            return this.transactionDirection;
        }

        /**
         * @return transactionNumber
         */
        public Long getTransactionNumber() {
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
            private String balance; 
            private String billNumber; 
            private String channelTransactionNumber; 
            private String currency; 
            private String fundAccountEcid; 
            private Long fundAccountId; 
            private String fundAccountName; 
            private Long fundAccountOwnerAccountId; 
            private String fundType; 
            private String nbid; 
            private String remark; 
            private String site; 
            private String transactionAccount; 
            private String transactionAmount; 
            private String transactionChannel; 
            private String transactionDirection; 
            private Long transactionNumber; 
            private String transactionTime; 
            private String transactionType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.balance = model.balance;
                this.billNumber = model.billNumber;
                this.channelTransactionNumber = model.channelTransactionNumber;
                this.currency = model.currency;
                this.fundAccountEcid = model.fundAccountEcid;
                this.fundAccountId = model.fundAccountId;
                this.fundAccountName = model.fundAccountName;
                this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
                this.fundType = model.fundType;
                this.nbid = model.nbid;
                this.remark = model.remark;
                this.site = model.site;
                this.transactionAccount = model.transactionAccount;
                this.transactionAmount = model.transactionAmount;
                this.transactionChannel = model.transactionChannel;
                this.transactionDirection = model.transactionDirection;
                this.transactionNumber = model.transactionNumber;
                this.transactionTime = model.transactionTime;
                this.transactionType = model.transactionType;
            } 

            /**
             * <p>Balance after the operation</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>Order number or bill number</p>
             * 
             * <strong>example:</strong>
             * <p>2323203243</p>
             */
            public Builder billNumber(String billNumber) {
                this.billNumber = billNumber;
                return this;
            }

            /**
             * <p>External transaction serial number</p>
             * 
             * <strong>example:</strong>
             * <p>20244389232</p>
             */
            public Builder channelTransactionNumber(String channelTransactionNumber) {
                this.channelTransactionNumber = channelTransactionNumber;
                return this;
            }

            /**
             * <p>Transaction amount currency</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>Enterprise entity ID</p>
             * 
             * <strong>example:</strong>
             * <p>23473943</p>
             */
            public Builder fundAccountEcid(String fundAccountEcid) {
                this.fundAccountEcid = fundAccountEcid;
                return this;
            }

            /**
             * <p>Account ID</p>
             * 
             * <strong>example:</strong>
             * <p>1232121</p>
             */
            public Builder fundAccountId(Long fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * <p>Account name</p>
             * 
             * <strong>example:</strong>
             * <p>云某的名称</p>
             */
            public Builder fundAccountName(String fundAccountName) {
                this.fundAccountName = fundAccountName;
                return this;
            }

            /**
             * <p>Alibaba Cloud account ID of the account owner</p>
             * 
             * <strong>example:</strong>
             * <p>32343231</p>
             */
            public Builder fundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * <p>Fund type</p>
             * 
             * <strong>example:</strong>
             * <p>ACCT_BOOK</p>
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            /**
             * <p>Primary marketplace</p>
             * 
             * <strong>example:</strong>
             * <p>2684210001</p>
             */
            public Builder nbid(String nbid) {
                this.nbid = nbid;
                return this;
            }

            /**
             * <p>Remarks</p>
             * 
             * <strong>example:</strong>
             * <p>订单备注</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Site</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * <p>Corresponding transaction account, such as the Alipay top-up account or the counterparty account for transfers.</p>
             * 
             * <strong>example:</strong>
             * <p>186****3975</p>
             */
            public Builder transactionAccount(String transactionAccount) {
                this.transactionAccount = transactionAccount;
                return this;
            }

            /**
             * <p>Transaction amount</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder transactionAmount(String transactionAmount) {
                this.transactionAmount = transactionAmount;
                return this;
            }

            /**
             * <p>Transaction channel. If specified, the query filters by transaction channel. If not specified, all channels are queried by default.</p>
             * <p>User balance: ACCT_CASH.</p>
             * <p>Alipay: ALIPAY.</p>
             * <p>Alipay Zhifutong: ALIPAY_ZHIFUTONG.</p>
             * <p>Offline remittance: OFFLINE_REMIT.</p>
             * <p>Credit control quota refund: REFUND.</p>
             * <p>Online banking: UNION_PAY_BANK.</p>
             * <p>Credit card: CREDIT_CARD. (International site only)</p>
             * <p>PayPal: PAYPAL. (International site only)</p>
             * 
             * <strong>example:</strong>
             * <p>ALIPAY</p>
             */
            public Builder transactionChannel(String transactionChannel) {
                this.transactionChannel = transactionChannel;
                return this;
            }

            /**
             * <p>Transaction direction: in/out (income/expenditure)</p>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder transactionDirection(String transactionDirection) {
                this.transactionDirection = transactionDirection;
                return this;
            }

            /**
             * <p>Transaction serial number</p>
             * 
             * <strong>example:</strong>
             * <p>5423121</p>
             */
            public Builder transactionNumber(Long transactionNumber) {
                this.transactionNumber = transactionNumber;
                return this;
            }

            /**
             * <p>Formatted transaction time string</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01 12:00:00</p>
             */
            public Builder transactionTime(String transactionTime) {
                this.transactionTime = transactionTime;
                return this;
            }

            /**
             * <p>Transaction type. If a transaction type is specified, only results of that type are returned. If the specified type does not exist, the result is empty. If not specified, all types are returned by default.</p>
             * <p>Top-up: CHARGE.</p>
             * <p>Withdrawal: WITHDRAW.</p>
             * <p>Refund: REFUND.</p>
             * <p>Payment: PAY.</p>
             * <p>Transfer: TRANSFER.</p>
             * <p>Adjustment: ADJUST.</p>
             * <p>Order expiration refund: PAY_FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>CHARGE</p>
             */
            public Builder transactionType(String transactionType) {
                this.transactionType = transactionType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
