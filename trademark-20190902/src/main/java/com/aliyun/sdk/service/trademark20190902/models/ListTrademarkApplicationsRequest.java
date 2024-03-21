// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrademarkApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListTrademarkApplicationsRequest</p>
 */
public class ListTrademarkApplicationsRequest extends Request {
    @Query
    @NameInMap("ApplicantName")
    private String applicantName;

    @Query
    @NameInMap("ApplicationStatus")
    private Integer applicationStatus;

    @Query
    @NameInMap("ApplicationType")
    private String applicationType;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("CreateTimeLeft")
    private Long createTimeLeft;

    @Query
    @NameInMap("CreateTimeRight")
    private Long createTimeRight;

    @Query
    @NameInMap("Flag")
    @Validation(maximum = 100, minimum = 1)
    private Integer flag;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductType")
    @Validation(maximum = 100, minimum = 1)
    private Integer productType;

    @Query
    @NameInMap("QueryVoucherOrderDoneFlag")
    private Boolean queryVoucherOrderDoneFlag;

    @Query
    @NameInMap("QueryVoucherOrderFlag")
    private Boolean queryVoucherOrderFlag;

    @Query
    @NameInMap("SortFiled")
    private String sortFiled;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("SupplementStatus")
    private Integer supplementStatus;

    @Query
    @NameInMap("TrademarkName")
    private String trademarkName;

    @Query
    @NameInMap("TrademarkNumber")
    private String trademarkNumber;

    private ListTrademarkApplicationsRequest(Builder builder) {
        super(builder);
        this.applicantName = builder.applicantName;
        this.applicationStatus = builder.applicationStatus;
        this.applicationType = builder.applicationType;
        this.bizId = builder.bizId;
        this.createTimeLeft = builder.createTimeLeft;
        this.createTimeRight = builder.createTimeRight;
        this.flag = builder.flag;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.queryVoucherOrderDoneFlag = builder.queryVoucherOrderDoneFlag;
        this.queryVoucherOrderFlag = builder.queryVoucherOrderFlag;
        this.sortFiled = builder.sortFiled;
        this.sortOrder = builder.sortOrder;
        this.supplementStatus = builder.supplementStatus;
        this.trademarkName = builder.trademarkName;
        this.trademarkNumber = builder.trademarkNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrademarkApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicantName
     */
    public String getApplicantName() {
        return this.applicantName;
    }

    /**
     * @return applicationStatus
     */
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return createTimeLeft
     */
    public Long getCreateTimeLeft() {
        return this.createTimeLeft;
    }

    /**
     * @return createTimeRight
     */
    public Long getCreateTimeRight() {
        return this.createTimeRight;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public Integer getProductType() {
        return this.productType;
    }

    /**
     * @return queryVoucherOrderDoneFlag
     */
    public Boolean getQueryVoucherOrderDoneFlag() {
        return this.queryVoucherOrderDoneFlag;
    }

    /**
     * @return queryVoucherOrderFlag
     */
    public Boolean getQueryVoucherOrderFlag() {
        return this.queryVoucherOrderFlag;
    }

    /**
     * @return sortFiled
     */
    public String getSortFiled() {
        return this.sortFiled;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return supplementStatus
     */
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    /**
     * @return trademarkNumber
     */
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    public static final class Builder extends Request.Builder<ListTrademarkApplicationsRequest, Builder> {
        private String applicantName; 
        private Integer applicationStatus; 
        private String applicationType; 
        private String bizId; 
        private Long createTimeLeft; 
        private Long createTimeRight; 
        private Integer flag; 
        private String orderId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer productType; 
        private Boolean queryVoucherOrderDoneFlag; 
        private Boolean queryVoucherOrderFlag; 
        private String sortFiled; 
        private String sortOrder; 
        private Integer supplementStatus; 
        private String trademarkName; 
        private String trademarkNumber; 

        private Builder() {
            super();
        } 

        private Builder(ListTrademarkApplicationsRequest request) {
            super(request);
            this.applicantName = request.applicantName;
            this.applicationStatus = request.applicationStatus;
            this.applicationType = request.applicationType;
            this.bizId = request.bizId;
            this.createTimeLeft = request.createTimeLeft;
            this.createTimeRight = request.createTimeRight;
            this.flag = request.flag;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.queryVoucherOrderDoneFlag = request.queryVoucherOrderDoneFlag;
            this.queryVoucherOrderFlag = request.queryVoucherOrderFlag;
            this.sortFiled = request.sortFiled;
            this.sortOrder = request.sortOrder;
            this.supplementStatus = request.supplementStatus;
            this.trademarkName = request.trademarkName;
            this.trademarkNumber = request.trademarkNumber;
        } 

        /**
         * ApplicantName.
         */
        public Builder applicantName(String applicantName) {
            this.putQueryParameter("ApplicantName", applicantName);
            this.applicantName = applicantName;
            return this;
        }

        /**
         * ApplicationStatus.
         */
        public Builder applicationStatus(Integer applicationStatus) {
            this.putQueryParameter("ApplicationStatus", applicationStatus);
            this.applicationStatus = applicationStatus;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CreateTimeLeft.
         */
        public Builder createTimeLeft(Long createTimeLeft) {
            this.putQueryParameter("CreateTimeLeft", createTimeLeft);
            this.createTimeLeft = createTimeLeft;
            return this;
        }

        /**
         * CreateTimeRight.
         */
        public Builder createTimeRight(Long createTimeRight) {
            this.putQueryParameter("CreateTimeRight", createTimeRight);
            this.createTimeRight = createTimeRight;
            return this;
        }

        /**
         * Flag.
         */
        public Builder flag(Integer flag) {
            this.putQueryParameter("Flag", flag);
            this.flag = flag;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProductType.
         */
        public Builder productType(Integer productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * QueryVoucherOrderDoneFlag.
         */
        public Builder queryVoucherOrderDoneFlag(Boolean queryVoucherOrderDoneFlag) {
            this.putQueryParameter("QueryVoucherOrderDoneFlag", queryVoucherOrderDoneFlag);
            this.queryVoucherOrderDoneFlag = queryVoucherOrderDoneFlag;
            return this;
        }

        /**
         * QueryVoucherOrderFlag.
         */
        public Builder queryVoucherOrderFlag(Boolean queryVoucherOrderFlag) {
            this.putQueryParameter("QueryVoucherOrderFlag", queryVoucherOrderFlag);
            this.queryVoucherOrderFlag = queryVoucherOrderFlag;
            return this;
        }

        /**
         * SortFiled.
         */
        public Builder sortFiled(String sortFiled) {
            this.putQueryParameter("SortFiled", sortFiled);
            this.sortFiled = sortFiled;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * SupplementStatus.
         */
        public Builder supplementStatus(Integer supplementStatus) {
            this.putQueryParameter("SupplementStatus", supplementStatus);
            this.supplementStatus = supplementStatus;
            return this;
        }

        /**
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        /**
         * TrademarkNumber.
         */
        public Builder trademarkNumber(String trademarkNumber) {
            this.putQueryParameter("TrademarkNumber", trademarkNumber);
            this.trademarkNumber = trademarkNumber;
            return this;
        }

        @Override
        public ListTrademarkApplicationsRequest build() {
            return new ListTrademarkApplicationsRequest(this);
        } 

    } 

}
