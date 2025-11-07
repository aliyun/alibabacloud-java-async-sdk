// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeMetaSearchPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetaSearchPageListRequest</p>
 */
public class DescribeMetaSearchPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Api")
    @com.aliyun.core.annotation.Validation(required = true)
    private String api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BankCard")
    private String bankCard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspName")
    private String ispName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleNum")
    private String vehicleNum;

    private DescribeMetaSearchPageListRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.bankCard = builder.bankCard;
        this.bizCode = builder.bizCode;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.identifyNum = builder.identifyNum;
        this.ispName = builder.ispName;
        this.mobile = builder.mobile;
        this.pageSize = builder.pageSize;
        this.reqId = builder.reqId;
        this.startDate = builder.startDate;
        this.subCode = builder.subCode;
        this.userName = builder.userName;
        this.vehicleNum = builder.vehicleNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaSearchPageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return bankCard
     */
    public String getBankCard() {
        return this.bankCard;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return ispName
     */
    public String getIspName() {
        return this.ispName;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vehicleNum
     */
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public static final class Builder extends Request.Builder<DescribeMetaSearchPageListRequest, Builder> {
        private String api; 
        private String bankCard; 
        private String bizCode; 
        private Integer currentPage; 
        private Long endDate; 
        private String identifyNum; 
        private String ispName; 
        private String mobile; 
        private Integer pageSize; 
        private String reqId; 
        private Long startDate; 
        private String subCode; 
        private String userName; 
        private String vehicleNum; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetaSearchPageListRequest request) {
            super(request);
            this.api = request.api;
            this.bankCard = request.bankCard;
            this.bizCode = request.bizCode;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.identifyNum = request.identifyNum;
            this.ispName = request.ispName;
            this.mobile = request.mobile;
            this.pageSize = request.pageSize;
            this.reqId = request.reqId;
            this.startDate = request.startDate;
            this.subCode = request.subCode;
            this.userName = request.userName;
            this.vehicleNum = request.vehicleNum;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_CARD_2_META</p>
         */
        public Builder api(String api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * BankCard.
         */
        public Builder bankCard(String bankCard) {
            this.putQueryParameter("BankCard", bankCard);
            this.bankCard = bankCard;
            return this;
        }

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1739926800000</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * IdentifyNum.
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * IspName.
         */
        public Builder ispName(String ispName) {
            this.putQueryParameter("IspName", ispName);
            this.ispName = ispName;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1760198400000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.putQueryParameter("SubCode", subCode);
            this.subCode = subCode;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VehicleNum.
         */
        public Builder vehicleNum(String vehicleNum) {
            this.putQueryParameter("VehicleNum", vehicleNum);
            this.vehicleNum = vehicleNum;
            return this;
        }

        @Override
        public DescribeMetaSearchPageListRequest build() {
            return new DescribeMetaSearchPageListRequest(this);
        } 

    } 

}
