// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceEstimateCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceEstimateCostResponseBody</p>
 */
public class GetServiceEstimateCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private java.util.Map < String, CommodityValue > commodity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.Map < String, ? > resources;

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
    public java.util.Map < String, CommodityValue > getCommodity() {
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
    public java.util.Map < String, ? > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private java.util.Map < String, CommodityValue > commodity; 
        private String requestId; 
        private java.util.Map < String, ? > resources; 

        /**
         * Estimated commodity cost.
         */
        public Builder commodity(java.util.Map < String, CommodityValue > commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Estimated resource cost.
         */
        public Builder resources(java.util.Map < String, ? > resources) {
            this.resources = resources;
            return this;
        }

        public GetServiceEstimateCostResponseBody build() {
            return new GetServiceEstimateCostResponseBody(this);
        } 

    } 

}
