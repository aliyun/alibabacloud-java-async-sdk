// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetServiceEstimateCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceEstimateCostResponseBody</p>
 */
public class GetServiceEstimateCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private java.util.Map<String, CommodityValue> commodity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.Map<String, ?> resources;

    private GetServiceEstimateCostResponseBody(Builder builder) {
        this.commodity = builder.commodity;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceEstimateCostResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodity
     */
    public java.util.Map<String, CommodityValue> getCommodity() {
        return this.commodity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.Map<String, ?> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private java.util.Map<String, CommodityValue> commodity; 
        private String requestId; 
        private java.util.Map<String, ?> resources; 

        /**
         * <p>The estimated price.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cmgj00059839&quot;: {&quot;Result&quot;: {&quot;InquiryType&quot;: &quot;Buy&quot;, &quot;Order&quot;: {&quot;Currency&quot;: &quot;CNY&quot;, &quot;DiscountAmount&quot;: &quot;0.0&quot;, &quot;TradeAmount&quot;: &quot;0.01&quot;, &quot;OriginalAmount&quot;: &quot;0.01&quot;}}}}</p>
         */
        public Builder commodity(java.util.Map<String, CommodityValue> commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08ABBB67-39C9-5EE7-98E5-80486F75CE8D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;EcsInstance&quot; : { &quot;Type&quot; : &quot;ALIYUN::ECS::Instance&quot;, &quot;Success&quot; : true, &quot;Result&quot; : { &quot;Order&quot; : { &quot;Currency&quot; : &quot;CNY&quot;, &quot;RuleIds&quot; : [ &quot;102111101338****&quot; ], &quot;DetailInfos&quot; : { &quot;ResourcePriceModel&quot; : [ { &quot;OriginalPrice&quot; : 0, &quot;DiscountPrice&quot; : 0, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;bandwidth&quot;, &quot;TradePrice&quot; : 0 }, { &quot;OriginalPrice&quot; : 0, &quot;DiscountPrice&quot; : 0, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;image&quot;, &quot;TradePrice&quot; : 0 }, { &quot;OriginalPrice&quot; : 0.366666, &quot;DiscountPrice&quot; : 0.249012, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;instanceType&quot;, &quot;TradePrice&quot; : 0.117654 }, { &quot;OriginalPrice&quot; : 0.055555, &quot;DiscountPrice&quot; : 0.037729, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;systemDisk&quot;, &quot;TradePrice&quot; : 0.017826 } ] }, &quot;TradeAmount&quot; : 0.135, &quot;OriginalAmount&quot; : 0.422, &quot;Coupons&quot; : { &quot;Coupon&quot; : [ ] }, &quot;DiscountAmount&quot; : 0.287 }, &quot;OrderSupplement&quot; : { &quot;PriceUnit&quot; : &quot;/Hour&quot;, &quot;ChargeType&quot; : &quot;PostPaid&quot;, &quot;Quantity&quot; : 1, &quot;PriceType&quot; : &quot;Total&quot; }, &quot;Rules&quot; : { &quot;Rule&quot; : [ { &quot;RuleDescId&quot; : &quot;102111101338****&quot;, &quot;Name&quot; : &quot;contract discount_multi-billing item discount_3.208750 discount&quot; } ] } } } }</p>
         */
        public Builder resources(java.util.Map<String, ?> resources) {
            this.resources = resources;
            return this;
        }

        public GetServiceEstimateCostResponseBody build() {
            return new GetServiceEstimateCostResponseBody(this);
        } 

    } 

}
