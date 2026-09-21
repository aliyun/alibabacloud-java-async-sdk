// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourcePriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePriceRequest</p>
 */
public class GetResourcePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceType")
    private String appInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private GetResourcePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.appInstanceType = builder.appInstanceType;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return appInstanceType
     */
    public String getAppInstanceType() {
        return this.appInstanceType;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetResourcePriceRequest, Builder> {
        private Long amount; 
        private String appInstanceType; 
        private String bizRegionId; 
        private String chargeType; 
        private String nodeInstanceType; 
        private Long period; 
        private String periodUnit; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.appInstanceType = request.appInstanceType;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.nodeInstanceType = request.nodeInstanceType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productType = request.productType;
        } 

        /**
         * <p>The quantity of resources to purchase.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The ID of the session specification type to purchase. You can obtain this value by calling the <code>ListAppInstanceType</code> operation.</p>
         * <p>Either AppInstanceType or NodeInstanceType must have a value. If both have values, NodeInstanceType is used.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general</p>
         */
        public Builder appInstanceType(String appInstanceType) {
            this.putQueryParameter("AppInstanceType", appInstanceType);
            this.appInstanceType = appInstanceType;
            return this;
        }

        /**
         * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The ID of the resource specification type to purchase. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/428502.html">ListNodeInstanceType</a> operation.</p>
         * <p>Either AppInstanceType or NodeInstanceType must have a value. If both have values, NodeInstanceType is used.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * <p>The numeric part of the resource purchase duration. This parameter is used together with PeriodUnit to specify the complete purchase duration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit part of the resource purchase duration. This parameter is used together with Period to specify the complete purchase duration. Valid combinations of Period and PeriodUnit:</p>
         * <ul>
         * <li>1 Week (1 week)</li>
         * <li>1 Month (1 month)</li>
         * <li>2 Month (2 months)</li>
         * <li>3 Month (3 months)</li>
         * <li>6 Month (6 months)</li>
         * <li>1 Year (1 year)</li>
         * <li>2 Year (2 years)</li>
         * <li>3 Year (3 years)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is case-sensitive. For example, <code>Week</code> is valid, but <code>week</code> is invalid. If the request parameters do not match the combinations listed above, such as <code>2 Week</code>, the call to this operation succeeds, but an error occurs during the order placement phase.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetResourcePriceRequest build() {
            return new GetResourcePriceRequest(this);
        } 

    } 

}
