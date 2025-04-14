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
 * {@link GetFundAccountCanTransferAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountCanTransferAmountResponseBody</p>
 */
public class GetFundAccountCanTransferAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAmount")
    private String availableAmount;

    @com.aliyun.core.annotation.NameInMap("CashAmount")
    private String cashAmount;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("FundAccountEcid")
    private String fundAccountEcid;

    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    @com.aliyun.core.annotation.NameInMap("FundAccountName")
    private String fundAccountName;

    @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
    private Long fundAccountOwnerAccountId;

    @com.aliyun.core.annotation.NameInMap("MaxTransferableAmount")
    private String maxTransferableAmount;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    @com.aliyun.core.annotation.NameInMap("TransferAmount")
    private String transferAmount;

    private GetFundAccountCanTransferAmountResponseBody(Builder builder) {
        this.availableAmount = builder.availableAmount;
        this.cashAmount = builder.cashAmount;
        this.currency = builder.currency;
        this.fundAccountEcid = builder.fundAccountEcid;
        this.fundAccountId = builder.fundAccountId;
        this.fundAccountName = builder.fundAccountName;
        this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
        this.maxTransferableAmount = builder.maxTransferableAmount;
        this.metadata = builder.metadata;
        this.nbid = builder.nbid;
        this.requestId = builder.requestId;
        this.site = builder.site;
        this.transferAmount = builder.transferAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanTransferAmountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableAmount
     */
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    /**
     * @return cashAmount
     */
    public String getCashAmount() {
        return this.cashAmount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return fundAccountEcid
     */
    public String getFundAccountEcid() {
        return this.fundAccountEcid;
    }

    /**
     * @return fundAccountId
     */
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    /**
     * @return fundAccountName
     */
    public String getFundAccountName() {
        return this.fundAccountName;
    }

    /**
     * @return fundAccountOwnerAccountId
     */
    public Long getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    /**
     * @return maxTransferableAmount
     */
    public String getMaxTransferableAmount() {
        return this.maxTransferableAmount;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    /**
     * @return transferAmount
     */
    public String getTransferAmount() {
        return this.transferAmount;
    }

    public static final class Builder {
        private String availableAmount; 
        private String cashAmount; 
        private String currency; 
        private String fundAccountEcid; 
        private Long fundAccountId; 
        private String fundAccountName; 
        private Long fundAccountOwnerAccountId; 
        private String maxTransferableAmount; 
        private Object metadata; 
        private String nbid; 
        private String requestId; 
        private String site; 
        private String transferAmount; 

        private Builder() {
        } 

        private Builder(GetFundAccountCanTransferAmountResponseBody model) {
            this.availableAmount = model.availableAmount;
            this.cashAmount = model.cashAmount;
            this.currency = model.currency;
            this.fundAccountEcid = model.fundAccountEcid;
            this.fundAccountId = model.fundAccountId;
            this.fundAccountName = model.fundAccountName;
            this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
            this.maxTransferableAmount = model.maxTransferableAmount;
            this.metadata = model.metadata;
            this.nbid = model.nbid;
            this.requestId = model.requestId;
            this.site = model.site;
            this.transferAmount = model.transferAmount;
        } 

        /**
         * AvailableAmount.
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }

        /**
         * CashAmount.
         */
        public Builder cashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * FundAccountEcid.
         */
        public Builder fundAccountEcid(String fundAccountEcid) {
            this.fundAccountEcid = fundAccountEcid;
            return this;
        }

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * FundAccountName.
         */
        public Builder fundAccountName(String fundAccountName) {
            this.fundAccountName = fundAccountName;
            return this;
        }

        /**
         * FundAccountOwnerAccountId.
         */
        public Builder fundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }

        /**
         * MaxTransferableAmount.
         */
        public Builder maxTransferableAmount(String maxTransferableAmount) {
            this.maxTransferableAmount = maxTransferableAmount;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.nbid = nbid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Site.
         */
        public Builder site(String site) {
            this.site = site;
            return this;
        }

        /**
         * TransferAmount.
         */
        public Builder transferAmount(String transferAmount) {
            this.transferAmount = transferAmount;
            return this;
        }

        public GetFundAccountCanTransferAmountResponseBody build() {
            return new GetFundAccountCanTransferAmountResponseBody(this);
        } 

    } 

}
