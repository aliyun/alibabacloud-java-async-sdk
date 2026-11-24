// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.commodity = builder.commodity;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodity
     */
    public String getCommodity() {
        return this.commodity;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private String commodity; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.commodity = request.commodity;
            this.orderType = request.orderType;
        } 

        /**
         * <p>Serialized commodity information based on the specified OrderType. The CommodityType corresponding to each OrderType is as follows:</p>
         * <p>INSTANCE_BUY: InstanceBuyCommodity
         * INSTANCE_RENEW: InstanceRenewCommodity
         * INSTANCE_UPGRADE: InstanceUpgradeCommodity
         * The parameters in the example are described as follows:</p>
         * <p>productCode: The product code.
         * skuCode: The product specification code. For non-image products: prepay for subscription, postpay for pay-as-you-go. For image products: ECS for pay-as-you-go, Package for subscription.
         * components: Specification modules. The version package_version is required, and other modules depend on the product settings.
         * duration: Number of cycles, such as 1, 2, 3...
         * pricingCycle: Cycle unit. Day, Month, or Year.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;components&quot;:{&quot;package_version&quot;:&quot;yuncode12928000016&quot;},&quot;duration&quot;:1,&quot;pricingCycle&quot;:&quot;YEAR&quot;,&quot;productCode&quot;:&quot;cmgj01**28&quot;,&quot;quantity&quot;:1,&quot;skuCode&quot;:&quot;prepay&quot;}</p>
         */
        public Builder commodity(String commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Order type. Valid values:</p>
         * <p>INSTANCE_BUY: Product purchase
         * INSTANCE_RENEW: Instance renewal
         * INSTANCE_UPGRADE: Instance upgrade
         * Note: For renewal-type price inquiries, you must pass InstanceId in the Commodity parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE_BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

}
