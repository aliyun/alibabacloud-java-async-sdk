// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomerQuotaRecordListRequest} extends {@link RequestModel}
 *
 * <p>CustomerQuotaRecordListRequest</p>
 */
public class CustomerQuotaRecordListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endUserPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private CustomerQuotaRecordListRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.endUserPk = builder.endUserPk;
        this.language = builder.language;
        this.operationType = builder.operationType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerQuotaRecordListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endUserPk
     */
    public Long getEndUserPk() {
        return this.endUserPk;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CustomerQuotaRecordListRequest, Builder> {
        private String endDate; 
        private Long endUserPk; 
        private String language; 
        private String operationType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CustomerQuotaRecordListRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.endUserPk = request.endUserPk;
            this.language = request.language;
            this.operationType = request.operationType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * End Date Format: yyyy-MM-dd
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Customer UID
         */
        public Builder endUserPk(Long endUserPk) {
            this.putQueryParameter("EndUserPk", endUserPk);
            this.endUserPk = endUserPk;
            return this;
        }

        /**
         * Multilingual Parameters, the default language is English.</br>
         * <p>
         * en: English</br>
         * zh: Chinese</br>
         * ja: Japanese </br>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Operation Type Enum</br>
         * <p>
         * all All types</br>
         * quota_create Create quota</br>
         * quota_amount_adjust Adjust the amount of quota</br>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * Pagination, current page number, starting from 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Pagination, record number on each page. Maximum 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Start Date Format: yyyy-MM-dd
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CustomerQuotaRecordListRequest build() {
            return new CustomerQuotaRecordListRequest(this);
        } 

    } 

}
