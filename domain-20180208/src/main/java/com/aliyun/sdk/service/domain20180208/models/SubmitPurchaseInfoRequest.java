// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitPurchaseInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitPurchaseInfoRequest</p>
 */
public class SubmitPurchaseInfoRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("PurchaseCurrency")
    private String purchaseCurrency;

    @Body
    @NameInMap("PurchasePrice")
    private Double purchasePrice;

    @Body
    @NameInMap("PurchaseProofs")
    private java.util.List < String > purchaseProofs;

    private SubmitPurchaseInfoRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.purchaseCurrency = builder.purchaseCurrency;
        this.purchasePrice = builder.purchasePrice;
        this.purchaseProofs = builder.purchaseProofs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPurchaseInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return purchaseCurrency
     */
    public String getPurchaseCurrency() {
        return this.purchaseCurrency;
    }

    /**
     * @return purchasePrice
     */
    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    /**
     * @return purchaseProofs
     */
    public java.util.List < String > getPurchaseProofs() {
        return this.purchaseProofs;
    }

    public static final class Builder extends Request.Builder<SubmitPurchaseInfoRequest, Builder> {
        private String bizId; 
        private String purchaseCurrency; 
        private Double purchasePrice; 
        private java.util.List < String > purchaseProofs; 

        private Builder() {
            super();
        } 

        private Builder(SubmitPurchaseInfoRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.purchaseCurrency = request.purchaseCurrency;
            this.purchasePrice = request.purchasePrice;
            this.purchaseProofs = request.purchaseProofs;
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
         * PurchaseCurrency.
         */
        public Builder purchaseCurrency(String purchaseCurrency) {
            this.putBodyParameter("PurchaseCurrency", purchaseCurrency);
            this.purchaseCurrency = purchaseCurrency;
            return this;
        }

        /**
         * PurchasePrice.
         */
        public Builder purchasePrice(Double purchasePrice) {
            this.putBodyParameter("PurchasePrice", purchasePrice);
            this.purchasePrice = purchasePrice;
            return this;
        }

        /**
         * PurchaseProofs.
         */
        public Builder purchaseProofs(java.util.List < String > purchaseProofs) {
            this.putBodyParameter("PurchaseProofs", purchaseProofs);
            this.purchaseProofs = purchaseProofs;
            return this;
        }

        @Override
        public SubmitPurchaseInfoRequest build() {
            return new SubmitPurchaseInfoRequest(this);
        } 

    } 

}
