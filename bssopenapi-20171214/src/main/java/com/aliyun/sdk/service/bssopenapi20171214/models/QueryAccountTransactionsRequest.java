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
 * {@link QueryAccountTransactionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTransactionsRequest</p>
 */
public class QueryAccountTransactionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordID")
    private String recordID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionChannel")
    private String transactionChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionChannelSN")
    private String transactionChannelSN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionFlow")
    private String transactionFlow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionNumber")
    private String transactionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionType")
    private String transactionType;

    private QueryAccountTransactionsRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.recordID = builder.recordID;
        this.transactionChannel = builder.transactionChannel;
        this.transactionChannelSN = builder.transactionChannelSN;
        this.transactionFlow = builder.transactionFlow;
        this.transactionNumber = builder.transactionNumber;
        this.transactionType = builder.transactionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTransactionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
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
     * @return recordID
     */
    public String getRecordID() {
        return this.recordID;
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
     * @return transactionType
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    public static final class Builder extends Request.Builder<QueryAccountTransactionsRequest, Builder> {
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String recordID; 
        private String transactionChannel; 
        private String transactionChannelSN; 
        private String transactionFlow; 
        private String transactionNumber; 
        private String transactionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountTransactionsRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.recordID = request.recordID;
            this.transactionChannel = request.transactionChannel;
            this.transactionChannelSN = request.transactionChannelSN;
            this.transactionFlow = request.transactionFlow;
            this.transactionNumber = request.transactionNumber;
            this.transactionType = request.transactionType;
        } 

        /**
         * <p>The end time of the creation time range. If not specified, the default value is the current time. Example: 2018-01-01T00:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-06T01:55:00Z</p>
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the creation time range. If not specified, the default value is one month before the current time. Example: 2018-01-01T00:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-05T01:46:09Z</p>
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The order or bill number.</p>
         * 
         * <strong>example:</strong>
         * <p>20200302</p>
         */
        public Builder recordID(String recordID) {
            this.putQueryParameter("RecordID", recordID);
            this.recordID = recordID;
            return this;
        }

        /**
         * <p>The transaction channel. If you specify a transaction channel, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
         * <ul>
         * <li>AccountBalance: Account balance.</li>
         * <li>BankTransfer: Bank transfer.</li>
         * <li>Alipay: Alipay.</li>
         * <li>AntCreditPay: Ant Credit Pay.</li>
         * <li>OfflineRemittance: Offline remittance.</li>
         * <li>RegularBankCreditRefund: Credit-based payment refund.</li>
         * <li>CreditCard: Credit card.</li>
         * <li>MyBankCredit: MYbank Credit.</li>
         * <li>HuaxiaBankCInstallment: Huaxia Bank installment.</li>
         * <li>ApplePay: Apple Pay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountBalance</p>
         */
        public Builder transactionChannel(String transactionChannel) {
            this.putQueryParameter("TransactionChannel", transactionChannel);
            this.transactionChannel = transactionChannel;
            return this;
        }

        /**
         * <p>The payment reference No.</p>
         * 
         * <strong>example:</strong>
         * <p>12342134</p>
         */
        public Builder transactionChannelSN(String transactionChannelSN) {
            this.putQueryParameter("TransactionChannelSN", transactionChannelSN);
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }

        /**
         * <p>The income and expense type. If you specify an income and expense type, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
         * <ul>
         * <li>Income: Income.</li>
         * <li>Expense: Expense.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Income</p>
         */
        public Builder transactionFlow(String transactionFlow) {
            this.putQueryParameter("TransactionFlow", transactionFlow);
            this.transactionFlow = transactionFlow;
            return this;
        }

        /**
         * <p>The transaction number.</p>
         * 
         * <strong>example:</strong>
         * <p>133314076</p>
         */
        public Builder transactionNumber(String transactionNumber) {
            this.putQueryParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
            return this;
        }

        /**
         * <p>The transaction type. If you specify a transaction type, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
         * <ul>
         * <li>Payment: Top-up.</li>
         * <li>Withdraw: Withdrawal.</li>
         * <li>Refund: Refund.</li>
         * <li>Consumption: Consumption.</li>
         * <li>Transfer: Transfer.</li>
         * <li>Adjust: Adjustment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Payment</p>
         */
        public Builder transactionType(String transactionType) {
            this.putQueryParameter("TransactionType", transactionType);
            this.transactionType = transactionType;
            return this;
        }

        @Override
        public QueryAccountTransactionsRequest build() {
            return new QueryAccountTransactionsRequest(this);
        } 

    } 

}
