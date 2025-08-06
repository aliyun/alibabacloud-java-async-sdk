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
 * {@link CreateLicenseRequest} extends {@link RequestModel}
 *
 * <p>CreateLicenseRequest</p>
 */
public class CreateLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private String beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private Long customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredOn")
    private String expiredOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateLicenseRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.beginTime = builder.beginTime;
        this.businessType = builder.businessType;
        this.contractNo = builder.contractNo;
        this.customerId = builder.customerId;
        this.expiredOn = builder.expiredOn;
        this.extraInfo = builder.extraInfo;
        this.operator = builder.operator;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLicenseRequest create() {
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
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
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
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateLicenseRequest, Builder> {
        private Long accountId; 
        private String beginTime; 
        private String businessType; 
        private String contractNo; 
        private Long customerId; 
        private String expiredOn; 
        private String extraInfo; 
        private String operator; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateLicenseRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.beginTime = request.beginTime;
            this.businessType = request.businessType;
            this.contractNo = request.contractNo;
            this.customerId = request.customerId;
            this.expiredOn = request.expiredOn;
            this.extraInfo = request.extraInfo;
            this.operator = request.operator;
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
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * ExpiredOn.
         */
        public Builder expiredOn(String expiredOn) {
            this.putQueryParameter("ExpiredOn", expiredOn);
            this.expiredOn = expiredOn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateLicenseRequest build() {
            return new CreateLicenseRequest(this);
        } 

    } 

}
