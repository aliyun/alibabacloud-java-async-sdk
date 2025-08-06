// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListLicenseInfosRequest} extends {@link RequestModel}
 *
 * <p>ListLicenseInfosRequest</p>
 */
public class ListLicenseInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private Long customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndBeginTime")
    private String endBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndExpiredOn")
    private String endExpiredOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseId")
    private String licenseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartBeginTime")
    private String startBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartExpiredOn")
    private String startExpiredOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListLicenseInfosRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.businessType = builder.businessType;
        this.contractNo = builder.contractNo;
        this.customerId = builder.customerId;
        this.endBeginTime = builder.endBeginTime;
        this.endExpiredOn = builder.endExpiredOn;
        this.extraInfo = builder.extraInfo;
        this.licenseId = builder.licenseId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.startBeginTime = builder.startBeginTime;
        this.startExpiredOn = builder.startExpiredOn;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLicenseInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return contractNo
     */
    public String getContractNo() {
        return this.contractNo;
    }

    /**
     * @return customerId
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * @return endBeginTime
     */
    public String getEndBeginTime() {
        return this.endBeginTime;
    }

    /**
     * @return endExpiredOn
     */
    public String getEndExpiredOn() {
        return this.endExpiredOn;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return licenseId
     */
    public String getLicenseId() {
        return this.licenseId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startBeginTime
     */
    public String getStartBeginTime() {
        return this.startBeginTime;
    }

    /**
     * @return startExpiredOn
     */
    public String getStartExpiredOn() {
        return this.startExpiredOn;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListLicenseInfosRequest, Builder> {
        private Long accountId; 
        private String businessType; 
        private String contractNo; 
        private Long customerId; 
        private String endBeginTime; 
        private String endExpiredOn; 
        private String extraInfo; 
        private String licenseId; 
        private Long pageNo; 
        private Long pageSize; 
        private String sortBy; 
        private String startBeginTime; 
        private String startExpiredOn; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListLicenseInfosRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.businessType = request.businessType;
            this.contractNo = request.contractNo;
            this.customerId = request.customerId;
            this.endBeginTime = request.endBeginTime;
            this.endExpiredOn = request.endExpiredOn;
            this.extraInfo = request.extraInfo;
            this.licenseId = request.licenseId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.startBeginTime = request.startBeginTime;
            this.startExpiredOn = request.startExpiredOn;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * ContractNo.
         */
        public Builder contractNo(String contractNo) {
            this.putQueryParameter("ContractNo", contractNo);
            this.contractNo = contractNo;
            return this;
        }

        /**
         * CustomerId.
         */
        public Builder customerId(Long customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * EndBeginTime.
         */
        public Builder endBeginTime(String endBeginTime) {
            this.putQueryParameter("EndBeginTime", endBeginTime);
            this.endBeginTime = endBeginTime;
            return this;
        }

        /**
         * EndExpiredOn.
         */
        public Builder endExpiredOn(String endExpiredOn) {
            this.putQueryParameter("EndExpiredOn", endExpiredOn);
            this.endExpiredOn = endExpiredOn;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * LicenseId.
         */
        public Builder licenseId(String licenseId) {
            this.putQueryParameter("LicenseId", licenseId);
            this.licenseId = licenseId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StartBeginTime.
         */
        public Builder startBeginTime(String startBeginTime) {
            this.putQueryParameter("StartBeginTime", startBeginTime);
            this.startBeginTime = startBeginTime;
            return this;
        }

        /**
         * StartExpiredOn.
         */
        public Builder startExpiredOn(String startExpiredOn) {
            this.putQueryParameter("StartExpiredOn", startExpiredOn);
            this.startExpiredOn = startExpiredOn;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListLicenseInfosRequest build() {
            return new ListLicenseInfosRequest(this);
        } 

    } 

}
