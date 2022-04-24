// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTransactionsRequest</p>
 */
public class QueryAccountTransactionsRequest extends Request {
    @Query
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

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
    @NameInMap("TransactionFlow")
    private String transactionFlow;

    @Query
    @NameInMap("TransactionNumber")
    private String transactionNumber;

    @Query
    @NameInMap("TransactionType")
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * TransactionFlow.
         */
        public Builder transactionFlow(String transactionFlow) {
            this.putQueryParameter("TransactionFlow", transactionFlow);
            this.transactionFlow = transactionFlow;
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
        public QueryAccountTransactionsRequest build() {
            return new QueryAccountTransactionsRequest(this);
        } 

    } 

}
