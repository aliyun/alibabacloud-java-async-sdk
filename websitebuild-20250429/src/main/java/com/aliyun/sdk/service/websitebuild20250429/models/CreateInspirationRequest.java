// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateInspirationRequest} extends {@link RequestModel}
 *
 * <p>CreateInspirationRequest</p>
 */
public class CreateInspirationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amountspec")
    private String amountspec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    private CreateInspirationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.amountspec = builder.amountspec;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.extend = builder.extend;
        this.paymentType = builder.paymentType;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspirationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return amountspec
     */
    public String getAmountspec() {
        return this.amountspec;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    public static final class Builder extends Request.Builder<CreateInspirationRequest, Builder> {
        private String regionId; 
        private String amountspec; 
        private String clientToken; 
        private Integer duration; 
        private String extend; 
        private String paymentType; 
        private String pricingCycle; 
        private Integer quantity; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspirationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.amountspec = request.amountspec;
            this.clientToken = request.clientToken;
            this.duration = request.duration;
            this.extend = request.extend;
            this.paymentType = request.paymentType;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The specification of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder amountspec(String amountspec) {
            this.putQueryParameter("Amountspec", amountspec);
            this.amountspec = amountspec;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The extended information in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The payment type.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_PAY</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The unit of the subscription cycle. Valid values:</p>
         * <ul>
         * <li>Year: year</li>
         * <li>Month: month</li>
         * <li>Day: day</li>
         * <li>Hour: hour</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The number of instances to subscribe to.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        @Override
        public CreateInspirationRequest build() {
            return new CreateInspirationRequest(this);
        } 

    } 

}
