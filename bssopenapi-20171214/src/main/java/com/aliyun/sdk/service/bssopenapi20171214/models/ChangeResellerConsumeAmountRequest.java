// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResellerConsumeAmountRequest} extends {@link RequestModel}
 *
 * <p>ChangeResellerConsumeAmountRequest</p>
 */
public class ChangeResellerConsumeAmountRequest extends Request {
    @Query
    @NameInMap("AdjustType")
    @Validation(required = true)
    private String adjustType;

    @Query
    @NameInMap("Amount")
    @Validation(required = true)
    private String amount;

    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("Currency")
    @Validation(required = true)
    private String currency;

    @Query
    @NameInMap("ExtendMap")
    private String extendMap;

    @Query
    @NameInMap("OutBizId")
    @Validation(required = true)
    private String outBizId;

    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private ChangeResellerConsumeAmountRequest(Builder builder) {
        super(builder);
        this.adjustType = builder.adjustType;
        this.amount = builder.amount;
        this.businessType = builder.businessType;
        this.currency = builder.currency;
        this.extendMap = builder.extendMap;
        this.outBizId = builder.outBizId;
        this.ownerId = builder.ownerId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResellerConsumeAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustType
     */
    public String getAdjustType() {
        return this.adjustType;
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return extendMap
     */
    public String getExtendMap() {
        return this.extendMap;
    }

    /**
     * @return outBizId
     */
    public String getOutBizId() {
        return this.outBizId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ChangeResellerConsumeAmountRequest, Builder> {
        private String adjustType; 
        private String amount; 
        private String businessType; 
        private String currency; 
        private String extendMap; 
        private String outBizId; 
        private Long ownerId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResellerConsumeAmountRequest response) {
            super(response);
            this.adjustType = response.adjustType;
            this.amount = response.amount;
            this.businessType = response.businessType;
            this.currency = response.currency;
            this.extendMap = response.extendMap;
            this.outBizId = response.outBizId;
            this.ownerId = response.ownerId;
            this.source = response.source;
        } 

        /**
         * AdjustType.
         */
        public Builder adjustType(String adjustType) {
            this.putQueryParameter("AdjustType", adjustType);
            this.adjustType = adjustType;
            return this;
        }

        /**
         * Amount.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
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
         * Currency.
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * ExtendMap.
         */
        public Builder extendMap(String extendMap) {
            this.putQueryParameter("ExtendMap", extendMap);
            this.extendMap = extendMap;
            return this;
        }

        /**
         * OutBizId.
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ChangeResellerConsumeAmountRequest build() {
            return new ChangeResellerConsumeAmountRequest(this);
        } 

    } 

}
