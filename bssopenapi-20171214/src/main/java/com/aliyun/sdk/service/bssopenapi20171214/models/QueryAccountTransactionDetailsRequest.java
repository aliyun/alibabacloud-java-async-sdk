// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionDetailsRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTransactionDetailsRequest</p>
 */
public class QueryAccountTransactionDetailsRequest extends Request {
    @Query
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RecordID")
    private String recordID;

    @Query
    @NameInMap("TransactionChannel")
    private String transactionChannel;

    @Query
    @NameInMap("TransactionChannelSN")
    private String transactionChannelSN;

    @Query
    @NameInMap("TransactionNumber")
    private String transactionNumber;

    @Query
    @NameInMap("TransactionType")
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
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RecordID.
         */
        public Builder recordID(String recordID) {
            this.putQueryParameter("RecordID", recordID);
            this.recordID = recordID;
            return this;
        }

        /**
         * TransactionChannel.
         */
        public Builder transactionChannel(String transactionChannel) {
            this.putQueryParameter("TransactionChannel", transactionChannel);
            this.transactionChannel = transactionChannel;
            return this;
        }

        /**
         * TransactionChannelSN.
         */
        public Builder transactionChannelSN(String transactionChannelSN) {
            this.putQueryParameter("TransactionChannelSN", transactionChannelSN);
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }

        /**
         * TransactionNumber.
         */
        public Builder transactionNumber(String transactionNumber) {
            this.putQueryParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
            return this;
        }

        /**
         * TransactionType.
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
