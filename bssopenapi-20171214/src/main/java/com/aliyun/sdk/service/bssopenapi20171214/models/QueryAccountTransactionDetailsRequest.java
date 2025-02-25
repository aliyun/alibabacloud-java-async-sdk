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
         * <p>The end of the creation time range to query.</p>
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
         * <p>The beginning of the creation time range to query.</p>
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
         * <p>This parameter is invalid.</p>
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
         * <p>The token that is used for paging.</p>
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
         * <p>The ID of the order or bill.</p>
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
         * <p>The transaction channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        public Builder transactionChannel(String transactionChannel) {
            this.putQueryParameter("TransactionChannel", transactionChannel);
            this.transactionChannel = transactionChannel;
            return this;
        }

        /**
         * <p>The serial number of the transaction channel.</p>
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
         * <p>The number of the transaction.</p>
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
         * <p>The type of the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>CHARGE</p>
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
