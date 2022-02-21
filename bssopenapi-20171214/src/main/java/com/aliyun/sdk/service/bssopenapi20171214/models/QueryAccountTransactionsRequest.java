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
    @NameInMap("TransactionChannelSN")
    private String transactionChannelSN;

    @Query
    @NameInMap("TransactionNumber")
    private String transactionNumber;

    private QueryAccountTransactionsRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.recordID = builder.recordID;
        this.transactionChannelSN = builder.transactionChannelSN;
        this.transactionNumber = builder.transactionNumber;
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

    public static final class Builder extends Request.Builder<QueryAccountTransactionsRequest, Builder> {
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String recordID; 
        private String transactionChannelSN; 
        private String transactionNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountTransactionsRequest response) {
            super(response);
            this.createTimeEnd = response.createTimeEnd;
            this.createTimeStart = response.createTimeStart;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.recordID = response.recordID;
            this.transactionChannelSN = response.transactionChannelSN;
            this.transactionNumber = response.transactionNumber;
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

        @Override
        public QueryAccountTransactionsRequest build() {
            return new QueryAccountTransactionsRequest(this);
        } 

    } 

}
