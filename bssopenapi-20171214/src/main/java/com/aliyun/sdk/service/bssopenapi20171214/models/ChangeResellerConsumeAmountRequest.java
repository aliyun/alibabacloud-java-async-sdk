// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeResellerConsumeAmountRequest} extends {@link RequestModel}
 *
 * <p>ChangeResellerConsumeAmountRequest</p>
 */
public class ChangeResellerConsumeAmountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdjustType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adjustType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMap")
    private String extendMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ChangeResellerConsumeAmountRequest request) {
            super(request);
            this.adjustType = request.adjustType;
            this.amount = request.amount;
            this.businessType = request.businessType;
            this.currency = request.currency;
            this.extendMap = request.extendMap;
            this.outBizId = request.outBizId;
            this.ownerId = request.ownerId;
            this.source = request.source;
        } 

        /**
         * <p>The type of the consumption amount adjustment. Valid values: increase: The consumption amount increases because new consumption occurs. decrease: The consumption amount decreases because funds are added to the account. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>increase/decrease</p>
         */
        public Builder adjustType(String adjustType) {
            this.putQueryParameter("AdjustType", adjustType);
            this.adjustType = adjustType;
            return this;
        }

        /**
         * <p>The amount to be adjusted. Unit: CNY</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The type of the business.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_amount_adjust</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The type of the currency.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * <p>The extended field of a message.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extendMap(String extendMap) {
            this.putQueryParameter("ExtendMap", extendMap);
            this.extendMap = extendMap;
            return this;
        }

        /**
         * <p>The ID of the primary key for external business. The ID is used for idempotence verification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1647396865</p>
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The source of the request. Specify the system name for the parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
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
