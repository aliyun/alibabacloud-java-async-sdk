// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetPriceRequest} extends {@link RequestModel}
 *
 * <p>GetPriceRequest</p>
 */
public class GetPriceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceAttributes")
    private java.util.Map<String, ?> resourceAttributes;

    private GetPriceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.regionId = builder.regionId;
        this.resourceAttributes = builder.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAttributes
     */
    public java.util.Map<String, ?> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public static final class Builder extends Request.Builder<GetPriceRequest, Builder> {
        private String requestPath; 
        private String regionId; 
        private java.util.Map<String, ?> resourceAttributes; 

        private Builder() {
            super();
        } 

        private Builder(GetPriceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.regionId = request.regionId;
            this.resourceAttributes = request.resourceAttributes;
        } 

        /**
         * <p>The request path. Format: /api/v1/providers/{provider}/products/{product}/price/{resourceType}</p>
         * <p>The variables in the request path:</p>
         * <p>provider: the cloud service provider. Currently, only Aliyun is supported.</p>
         * <p>product: the code of the product.</p>
         * <p>resourceType: the type of the resource. For example, the resourceType of Redis Account is DBInstance/Account.</p>
         * <p>The resources that support price inquiry:</p>
         * <p>Redis DBInstance: /api/v1/providers/aliyun/products/Redis/price/DBInstance</p>
         * <p>ECS Instance: /api/v1/providers/aliyun/products/ECS/price/Instance</p>
         * <p>RDS DBInstance: /api/v1/providers/aliyun/products/RDS/price/DBInstance</p>
         * <p>SLB LoadBalancer: /api/v1/providers/aliyun/products/SLB/price/LoadBalancer</p>
         * <p>ClickHouse DBCluster: /api/v1/providers/aliyun/products/ClickHouse/price/DBCluster</p>
         * <p>AliKafka Instance: /api/v1/providers/aliyun/products/AliKafka/price/Instance</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/providers/aliyun/products/SLB/price/LoadBalancer</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required if the cloud product is deployed in a region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The attributes based on which the price is queried (in JSON format).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;LoadBalancerName&quot;: &quot;cc-test&quot;,
         *         &quot;LoadBalancerSpec&quot;: &quot;slb.s3.small&quot;,
         *         &quot;InternetChargeType&quot;: &quot;paybybandwidth&quot;,
         *         &quot;AddressType&quot;: &quot;internet&quot;,
         *         &quot;PaymentType&quot;: &quot;PayAsYouGo&quot;,
         *         &quot;Bandwidth&quot;: 6
         *       }</p>
         */
        public Builder resourceAttributes(java.util.Map<String, ?> resourceAttributes) {
            String resourceAttributesShrink = shrink(resourceAttributes, "resourceAttributes", "json");
            this.putQueryParameter("resourceAttributes", resourceAttributesShrink);
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        @Override
        public GetPriceRequest build() {
            return new GetPriceRequest(this);
        } 

    } 

}
