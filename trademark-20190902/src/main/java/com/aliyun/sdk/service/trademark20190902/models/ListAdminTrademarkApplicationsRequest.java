// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdminTrademarkApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListAdminTrademarkApplicationsRequest</p>
 */
public class ListAdminTrademarkApplicationsRequest extends Request {
    @Query
    @NameInMap("ApplicantName")
    private String applicantName;

    @Query
    @NameInMap("ApplicationStatus")
    @Validation(maximum = 200)
    private Integer applicationStatus;

    @Query
    @NameInMap("ApplicationType")
    private String applicationType;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("SupplementStatus")
    @Validation(maximum = 6, minimum = 1)
    private Integer supplementStatus;

    @Query
    @NameInMap("TrademarkName")
    private String trademarkName;

    @Query
    @NameInMap("TrademarkNumber")
    private String trademarkNumber;

    @Query
    @NameInMap("UserId")
    private String userId;

    private ListAdminTrademarkApplicationsRequest(Builder builder) {
        super(builder);
        this.applicantName = builder.applicantName;
        this.applicationStatus = builder.applicationStatus;
        this.applicationType = builder.applicationType;
        this.bizId = builder.bizId;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortOrder = builder.sortOrder;
        this.supplementStatus = builder.supplementStatus;
        this.trademarkName = builder.trademarkName;
        this.trademarkNumber = builder.trademarkNumber;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdminTrademarkApplicationsRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListAdminTrademarkApplicationsRequest, Builder> {
        private String applicantName; 
        private Integer applicationStatus; 
        private String applicationType; 
        private String bizId; 
        private String orderId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortOrder; 
        private Integer supplementStatus; 
        private String trademarkName; 
        private String trademarkNumber; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListAdminTrademarkApplicationsRequest request) {
            super(request);
            this.applicantName = request.applicantName;
            this.applicationStatus = request.applicationStatus;
            this.applicationType = request.applicationType;
            this.bizId = request.bizId;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortOrder = request.sortOrder;
            this.supplementStatus = request.supplementStatus;
            this.trademarkName = request.trademarkName;
            this.trademarkNumber = request.trademarkNumber;
            this.userId = request.userId;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListAdminTrademarkApplicationsRequest build() {
            return new ListAdminTrademarkApplicationsRequest(this);
        } 

    } 

}
