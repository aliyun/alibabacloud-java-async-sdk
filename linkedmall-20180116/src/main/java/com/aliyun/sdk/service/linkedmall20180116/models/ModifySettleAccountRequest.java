// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ModifySettleAccountRequest} extends {@link RequestModel}
 *
 * <p>ModifySettleAccountRequest</p>
 */
public class ModifySettleAccountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountChannel")
    private String accountChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    private String accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountPayType")
    private String accountPayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CountryOrAreaCode")
    private String countryOrAreaCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdempotentId")
    private String idempotentId;

    private ModifySettleAccountRequest(Builder builder) {
        super(builder);
        this.accountChannel = builder.accountChannel;
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.accountNo = builder.accountNo;
        this.accountPayType = builder.accountPayType;
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.countryOrAreaCode = builder.countryOrAreaCode;
        this.currency = builder.currency;
        this.extInfo = builder.extInfo;
        this.idempotentId = builder.idempotentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySettleAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountChannel
     */
    public String getAccountChannel() {
        return this.accountChannel;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return accountPayType
     */
    public String getAccountPayType() {
        return this.accountPayType;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return countryOrAreaCode
     */
    public String getCountryOrAreaCode() {
        return this.countryOrAreaCode;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public static final class Builder extends Request.Builder<ModifySettleAccountRequest, Builder> {
        private String accountChannel; 
        private String accountId; 
        private String accountName; 
        private String accountNo; 
        private String accountPayType; 
        private String accountType; 
        private String bizId; 
        private String countryOrAreaCode; 
        private String currency; 
        private String extInfo; 
        private String idempotentId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySettleAccountRequest request) {
            super(request);
            this.accountChannel = request.accountChannel;
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.accountNo = request.accountNo;
            this.accountPayType = request.accountPayType;
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.countryOrAreaCode = request.countryOrAreaCode;
            this.currency = request.currency;
            this.extInfo = request.extInfo;
            this.idempotentId = request.idempotentId;
        } 

        /**
         * AccountChannel.
         */
        public Builder accountChannel(String accountChannel) {
            this.putBodyParameter("AccountChannel", accountChannel);
            this.accountChannel = accountChannel;
            return this;
        }

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * AccountPayType.
         */
        public Builder accountPayType(String accountPayType) {
            this.putBodyParameter("AccountPayType", accountPayType);
            this.accountPayType = accountPayType;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putBodyParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CountryOrAreaCode.
         */
        public Builder countryOrAreaCode(String countryOrAreaCode) {
            this.putBodyParameter("CountryOrAreaCode", countryOrAreaCode);
            this.countryOrAreaCode = countryOrAreaCode;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * IdempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putBodyParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        @Override
        public ModifySettleAccountRequest build() {
            return new ModifySettleAccountRequest(this);
        } 

    } 

}
