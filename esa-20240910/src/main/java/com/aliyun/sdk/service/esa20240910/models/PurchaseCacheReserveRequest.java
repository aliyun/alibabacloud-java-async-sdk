// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PurchaseCacheReserveRequest} extends {@link RequestModel}
 *
 * <p>PurchaseCacheReserveRequest</p>
 */
public class PurchaseCacheReserveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrRegion")
    private String crRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaGb")
    private Long quotaGb;

    private PurchaseCacheReserveRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.crRegion = builder.crRegion;
        this.period = builder.period;
        this.quotaGb = builder.quotaGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseCacheReserveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return crRegion
     */
    public String getCrRegion() {
        return this.crRegion;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return quotaGb
     */
    public Long getQuotaGb() {
        return this.quotaGb;
    }

    public static final class Builder extends Request.Builder<PurchaseCacheReserveRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String chargeType; 
        private String crRegion; 
        private Integer period; 
        private Long quotaGb; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseCacheReserveRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.crRegion = request.crRegion;
            this.period = request.period;
            this.quotaGb = request.quotaGb;
        } 

        /**
         * <p>Whether to automatically pay. The default value is false.</p>
         * <ul>
         * <li>true: Automatically pay.</li>
         * <li>false: Do not automatically pay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Whether to auto-renew:</p>
         * <ul>
         * <li>true: Auto-renew.</li>
         * <li>false: Do not auto-renew.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Billing type</p>
         * <ul>
         * <li>PREPAY: Prepaid.</li>
         * <li>POSTPAY: Postpaid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>Cache retention region</p>
         * <ul>
         * <li>HK: Hong Kong, China</li>
         * <li>CN-beijing: Mainland China - Beijing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HK</p>
         */
        public Builder crRegion(String crRegion) {
            this.putQueryParameter("CrRegion", crRegion);
            this.crRegion = crRegion;
            return this;
        }

        /**
         * <p>Purchase period (unit: month).</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>Cache retention specification (unit: GB).</p>
         * 
         * <strong>example:</strong>
         * <p>512000</p>
         */
        public Builder quotaGb(Long quotaGb) {
            this.putQueryParameter("QuotaGb", quotaGb);
            this.quotaGb = quotaGb;
            return this;
        }

        @Override
        public PurchaseCacheReserveRequest build() {
            return new PurchaseCacheReserveRequest(this);
        } 

    } 

}
