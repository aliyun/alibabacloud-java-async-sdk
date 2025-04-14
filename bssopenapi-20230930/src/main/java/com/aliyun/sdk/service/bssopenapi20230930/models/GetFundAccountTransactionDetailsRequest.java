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
 * {@link GetFundAccountTransactionDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetFundAccountTransactionDetailsRequest</p>
 */
public class GetFundAccountTransactionDetailsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillNumber")
    private String billNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelTransactionNumber")
    private String channelTransactionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionChannelList")
    private java.util.List<String> transactionChannelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionDirection")
    private String transactionDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionNumber")
    private Long transactionNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionType")
    private String transactionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionTypeList")
    private java.util.List<String> transactionTypeList;

    private GetFundAccountTransactionDetailsRequest(Builder builder) {
        super(builder);
        this.billNumber = builder.billNumber;
        this.channelTransactionNumber = builder.channelTransactionNumber;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.fundAccountId = builder.fundAccountId;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.transactionChannelList = builder.transactionChannelList;
        this.transactionDirection = builder.transactionDirection;
        this.transactionNumber = builder.transactionNumber;
        this.transactionType = builder.transactionType;
        this.transactionTypeList = builder.transactionTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountTransactionDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fundAccountId
     */
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return transactionChannelList
     */
    public java.util.List<String> getTransactionChannelList() {
        return this.transactionChannelList;
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
     * @return transactionType
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    /**
     * @return transactionTypeList
     */
    public java.util.List<String> getTransactionTypeList() {
        return this.transactionTypeList;
    }

    public static final class Builder extends Request.Builder<GetFundAccountTransactionDetailsRequest, Builder> {
        private String billNumber; 
        private String channelTransactionNumber; 
        private Integer currentPage; 
        private Long endTime; 
        private Long fundAccountId; 
        private Integer pageSize; 
        private Long startTime; 
        private java.util.List<String> transactionChannelList; 
        private String transactionDirection; 
        private Long transactionNumber; 
        private String transactionType; 
        private java.util.List<String> transactionTypeList; 

        private Builder() {
            super();
        } 

        private Builder(GetFundAccountTransactionDetailsRequest request) {
            super(request);
            this.billNumber = request.billNumber;
            this.channelTransactionNumber = request.channelTransactionNumber;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.fundAccountId = request.fundAccountId;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.transactionChannelList = request.transactionChannelList;
            this.transactionDirection = request.transactionDirection;
            this.transactionNumber = request.transactionNumber;
            this.transactionType = request.transactionType;
            this.transactionTypeList = request.transactionTypeList;
        } 

        /**
         * BillNumber.
         */
        public Builder billNumber(String billNumber) {
            this.putBodyParameter("BillNumber", billNumber);
            this.billNumber = billNumber;
            return this;
        }

        /**
         * ChannelTransactionNumber.
         */
        public Builder channelTransactionNumber(String channelTransactionNumber) {
            this.putBodyParameter("ChannelTransactionNumber", channelTransactionNumber);
            this.channelTransactionNumber = channelTransactionNumber;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TransactionChannelList.
         */
        public Builder transactionChannelList(java.util.List<String> transactionChannelList) {
            String transactionChannelListShrink = shrink(transactionChannelList, "TransactionChannelList", "json");
            this.putBodyParameter("TransactionChannelList", transactionChannelListShrink);
            this.transactionChannelList = transactionChannelList;
            return this;
        }

        /**
         * TransactionDirection.
         */
        public Builder transactionDirection(String transactionDirection) {
            this.putBodyParameter("TransactionDirection", transactionDirection);
            this.transactionDirection = transactionDirection;
            return this;
        }

        /**
         * TransactionNumber.
         */
        public Builder transactionNumber(Long transactionNumber) {
            this.putBodyParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
            return this;
        }

        /**
         * TransactionType.
         */
        public Builder transactionType(String transactionType) {
            this.putBodyParameter("TransactionType", transactionType);
            this.transactionType = transactionType;
            return this;
        }

        /**
         * TransactionTypeList.
         */
        public Builder transactionTypeList(java.util.List<String> transactionTypeList) {
            String transactionTypeListShrink = shrink(transactionTypeList, "TransactionTypeList", "json");
            this.putBodyParameter("TransactionTypeList", transactionTypeListShrink);
            this.transactionTypeList = transactionTypeList;
            return this;
        }

        @Override
        public GetFundAccountTransactionDetailsRequest build() {
            return new GetFundAccountTransactionDetailsRequest(this);
        } 

    } 

}
