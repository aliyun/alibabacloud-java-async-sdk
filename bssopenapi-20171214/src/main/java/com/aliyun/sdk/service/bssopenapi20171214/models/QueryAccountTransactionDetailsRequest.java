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
 * {@link QueryAccountTransactionDetailsRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTransactionDetailsRequest</p>
 */
public class QueryAccountTransactionDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

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
    @com.aliyun.core.annotation.NameInMap("TransactionNumber")
    private String transactionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionType")
    private String transactionType;

    private QueryAccountTransactionDetailsRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.recordID = builder.recordID;
        this.transactionChannel = builder.transactionChannel;
        this.transactionChannelSN = builder.transactionChannelSN;
        this.transactionNumber = builder.transactionNumber;
        this.transactionType = builder.transactionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTransactionDetailsRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAccountTransactionDetailsRequest, Builder> {
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer maxResults; 
        private String nextToken; 
        private String recordID; 
        private String transactionChannel; 
        private String transactionChannelSN; 
        private String transactionNumber; 
        private String transactionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountTransactionDetailsRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.recordID = request.recordID;
            this.transactionChannel = request.transactionChannel;
            this.transactionChannelSN = request.transactionChannelSN;
            this.transactionNumber = request.transactionNumber;
            this.transactionType = request.transactionType;
        } 

        /**
         * <p>The end time of creation.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-20</p>
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>The start time of creation.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-20</p>
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>An invalid parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The paging token for the paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>ABEDSDS124DASA</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The order ID or bill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2022120336190912</p>
         */
        public Builder recordID(String recordID) {
            this.putQueryParameter("RecordID", recordID);
            this.recordID = recordID;
            return this;
        }

        /**
         * <p>The transaction channel. If you specify one of the following transaction channel types, the query returns results of the specified type. If no results are found, an empty result is returned. If you do not specify this parameter, all types are returned by default.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AccountBalance: account balance</li>
         * <li>BankTransfer: bank transfer</li>
         * <li>Alipay: Alipay</li>
         * <li>AntCreditPay: Ant Credit Pay</li>
         * <li>OfflineRemittance: offline remittance</li>
         * <li>RegularBankCreditRefund: credit limit refund</li>
         * <li>CreditCard: credit card</li>
         * <li>MyBankCredit: MYbank credit</li>
         * <li>HuaxiaBankCInstallment: Huaxia Bank installment</li>
         * <li>ApplePay: Apple Pay</li>
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
         * <p>The payment reference No. of the transaction channel.</p>
         * 
         * <strong>example:</strong>
         * <p>2022112122001470591458665933</p>
         */
        public Builder transactionChannelSN(String transactionChannelSN) {
            this.putQueryParameter("TransactionChannelSN", transactionChannelSN);
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }

        /**
         * <p>The transaction number.</p>
         * 
         * <strong>example:</strong>
         * <p>410874027490089</p>
         */
        public Builder transactionNumber(String transactionNumber) {
            this.putQueryParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
            return this;
        }

        /**
         * <p>The transaction type. If you specify one of the following transaction types, the query returns results of the specified type. If no results are found, an empty result is returned. If you do not specify this parameter, all types are returned by default.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Payment: top-up</li>
         * <li>Withdraw: withdrawal</li>
         * <li>Refund: refund</li>
         * <li>Consumption: consumption</li>
         * <li>Transfer: transfer</li>
         * <li>Adjust: adjustment</li>
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
        public QueryAccountTransactionDetailsRequest build() {
            return new QueryAccountTransactionDetailsRequest(this);
        } 

    } 

}
