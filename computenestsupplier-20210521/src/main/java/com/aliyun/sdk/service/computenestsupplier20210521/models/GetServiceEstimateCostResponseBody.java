// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
    private java.util.Map<String, ?> commodity;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodity
     */
    public java.util.Map<String, ?> getCommodity() {
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
        private java.util.Map<String, ?> commodity; 
        private String requestId; 
        private java.util.Map<String, ?> resources; 

        private Builder() {
        } 

        private Builder(GetServiceEstimateCostResponseBody model) {
            this.commodity = model.commodity;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>The subscription duration information about the purchase order of Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PayPeriodUnit&quot;:Month,&quot;PayPeriod&quot;:1}</p>
         */
        public Builder commodity(java.util.Map<String, ?> commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E73F09DC-6C13-5CB1-A10F-7A4E125ABD2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;ECSInstances&quot;:{
         *         &quot;Type&quot;:&quot;ALIYUN::ECS::InstanceGroup&quot;,
         *         &quot;Success&quot;:true,
         *         &quot;Result&quot;:{
         *           &quot;Order&quot;:{
         *             &quot;Currency&quot;:&quot;CNY&quot;,
         *             &quot;RuleIds&quot;:[
         *               1752723
         *             ],
         *             &quot;DetailInfos&quot;:{
         *               &quot;ResourcePriceModel&quot;:[
         *                 {
         *                   &quot;Resource&quot;:&quot;bandwidth&quot;,
         *                   &quot;TradeAmount&quot;:0.0,
         *                   &quot;SubRuleIds&quot;:[],
         *                   &quot;OriginalAmount&quot;:0.0,
         *                   &quot;DiscountAmount&quot;:0.0
         *                 },
         *                 {
         *                   &quot;Resource&quot;:&quot;image&quot;,
         *                   &quot;TradeAmount&quot;:0.0,
         *                   &quot;SubRuleIds&quot;:[],
         *                   &quot;OriginalAmount&quot;:0.0,
         *                   &quot;DiscountAmount&quot;:0.0
         *                 },
         *                 {
         *                   &quot;Resource&quot;:&quot;instanceType&quot;,
         *                   &quot;TradeAmount&quot;:0.006966,
         *                   &quot;SubRuleIds&quot;:[],
         *                   &quot;OriginalAmount&quot;:0.45,
         *                   &quot;DiscountAmount&quot;:0.443034
         *                 },
         *                 {
         *                   &quot;Resource&quot;:&quot;systemDisk&quot;,
         *                   &quot;TradeAmount&quot;:0.000867,
         *                   &quot;SubRuleIds&quot;:[],
         *                   &quot;OriginalAmount&quot;:0.056,
         *                   &quot;DiscountAmount&quot;:0.055133
         *                 },
         *                 {
         *                   &quot;Resource&quot;:&quot;dataDisk&quot;,
         *                   &quot;TradeAmount&quot;:0.002167,
         *                   &quot;SubRuleIds&quot;:[],
         *                   &quot;OriginalAmount&quot;:0.14,
         *                   &quot;DiscountAmount&quot;:0.137833
         *                 }
         *               ]
         *             }</p>
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
