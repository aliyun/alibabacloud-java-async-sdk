// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateWarningThresholdRequest} extends {@link RequestModel}
 *
 * <p>CreateWarningThresholdRequest</p>
 */
public class CreateWarningThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyHaltLimit")
    private Integer dailyHaltLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyWarningLimit")
    private Integer dailyWarningLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonthlyHaltLimit")
    private Integer monthlyHaltLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonthlyWarningLimit")
    private Integer monthlyWarningLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateWarningThresholdRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.dailyHaltLimit = builder.dailyHaltLimit;
        this.dailyWarningLimit = builder.dailyWarningLimit;
        this.monthlyHaltLimit = builder.monthlyHaltLimit;
        this.monthlyWarningLimit = builder.monthlyWarningLimit;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarningThresholdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return dailyHaltLimit
     */
    public Integer getDailyHaltLimit() {
        return this.dailyHaltLimit;
    }

    /**
     * @return dailyWarningLimit
     */
    public Integer getDailyWarningLimit() {
        return this.dailyWarningLimit;
    }

    /**
     * @return monthlyHaltLimit
     */
    public Integer getMonthlyHaltLimit() {
        return this.monthlyHaltLimit;
    }

    /**
     * @return monthlyWarningLimit
     */
    public Integer getMonthlyWarningLimit() {
        return this.monthlyWarningLimit;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateWarningThresholdRequest, Builder> {
        private String bizType; 
        private Integer dailyHaltLimit; 
        private Integer dailyWarningLimit; 
        private Integer monthlyHaltLimit; 
        private Integer monthlyWarningLimit; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWarningThresholdRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.dailyHaltLimit = request.dailyHaltLimit;
            this.dailyWarningLimit = request.dailyWarningLimit;
            this.monthlyHaltLimit = request.monthlyHaltLimit;
            this.monthlyWarningLimit = request.monthlyWarningLimit;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * DailyHaltLimit.
         */
        public Builder dailyHaltLimit(Integer dailyHaltLimit) {
            this.putQueryParameter("DailyHaltLimit", dailyHaltLimit);
            this.dailyHaltLimit = dailyHaltLimit;
            return this;
        }

        /**
         * DailyWarningLimit.
         */
        public Builder dailyWarningLimit(Integer dailyWarningLimit) {
            this.putQueryParameter("DailyWarningLimit", dailyWarningLimit);
            this.dailyWarningLimit = dailyWarningLimit;
            return this;
        }

        /**
         * MonthlyHaltLimit.
         */
        public Builder monthlyHaltLimit(Integer monthlyHaltLimit) {
            this.putQueryParameter("MonthlyHaltLimit", monthlyHaltLimit);
            this.monthlyHaltLimit = monthlyHaltLimit;
            return this;
        }

        /**
         * MonthlyWarningLimit.
         */
        public Builder monthlyWarningLimit(Integer monthlyWarningLimit) {
            this.putQueryParameter("MonthlyWarningLimit", monthlyWarningLimit);
            this.monthlyWarningLimit = monthlyWarningLimit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateWarningThresholdRequest build() {
            return new CreateWarningThresholdRequest(this);
        } 

    } 

}
