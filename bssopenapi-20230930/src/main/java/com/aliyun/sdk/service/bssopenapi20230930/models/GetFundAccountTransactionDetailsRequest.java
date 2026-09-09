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
         * <p>Transaction order number</p>
         * 
         * <strong>example:</strong>
         * <p>2023212312321</p>
         */
        public Builder billNumber(String billNumber) {
            this.putBodyParameter("BillNumber", billNumber);
            this.billNumber = billNumber;
            return this;
        }

        /**
         * <p>Transaction channel serial number</p>
         * 
         * <strong>example:</strong>
         * <p>20250312334312322</p>
         */
        public Builder channelTransactionNumber(String channelTransactionNumber) {
            this.putBodyParameter("ChannelTransactionNumber", channelTransactionNumber);
            this.channelTransactionNumber = channelTransactionNumber;
            return this;
        }

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Query end timestamp (milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1735664561000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Fund account ID. If not specified, the account ID owned by the current account (owner) is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>123221232</p>
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * <p>Page size (maximum 200)</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Query start timestamp (milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1735664461000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
         */
        public Builder transactionChannelList(java.util.List<String> transactionChannelList) {
            String transactionChannelListShrink = shrink(transactionChannelList, "TransactionChannelList", "json");
            this.putBodyParameter("TransactionChannelList", transactionChannelListShrink);
            this.transactionChannelList = transactionChannelList;
            return this;
        }

        /**
         * <p>Transaction direction: in/out (fund inflow/outflow)</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        public Builder transactionDirection(String transactionDirection) {
            this.putBodyParameter("TransactionDirection", transactionDirection);
            this.transactionDirection = transactionDirection;
            return this;
        }

        /**
         * <p>Transaction serial number</p>
         * 
         * <strong>example:</strong>
         * <p>543231231</p>
         */
        public Builder transactionNumber(Long transactionNumber) {
            this.putBodyParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
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
            this.putBodyParameter("TransactionType", transactionType);
            this.transactionType = transactionType;
            return this;
        }

        /**
         * <p>Transaction type list. Supports querying with multiple parameters.</p>
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
