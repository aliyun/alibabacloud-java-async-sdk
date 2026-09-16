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
         * <p>The product API. Valid values:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
         * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration.</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status.</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition).</li>
         * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition).</li>
         * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification.</li>
         * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition).</li>
         * <li><strong>MOBILE_DETECT</strong>: phone number detection. </li>
         * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition).</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition.</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition.</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query.</li>
         * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
         * </ul>
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
         * <p>The bank card number.</p>
         * 
         * <strong>example:</strong>
         * <p>610*************1181</p>
         */
        public Builder bankCard(String bankCard) {
            this.putQueryParameter("BankCard", bankCard);
            this.bankCard = bankCard;
            return this;
        }

        /**
         * <p>The authentication status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Authentication passed.</li>
         * <li><strong>2</strong>: Authentication failed.</li>
         * <li><strong>3</strong>: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The end time of the query. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>522132197411184XXX</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The telecommunications service provider name. Valid values:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile.</li>
         * <li><strong>CUCC</strong>: China Unicom.</li>
         * <li><strong>CTCC</strong>: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CTCC</p>
         */
        public Builder ispName(String ispName) {
            this.putQueryParameter("IspName", ispName);
            this.ispName = ispName;
            return this;
        }

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>19127612221</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B012DB99-6C10-5740-81E0-B3A8C1C1B9C1</p>
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The result code. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/information-verification/">official documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        public Builder subCode(String subCode) {
            this.putQueryParameter("SubCode", subCode);
            this.subCode = subCode;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The license plate number.</p>
         * 
         * <strong>example:</strong>
         * <p>陕A9****</p>
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
