// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIngressGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIngressGatewaysResponseBody</p>
 */
public class DescribeIngressGatewaysResponseBody extends TeaModel {
    @NameInMap("IngressGateways")
    private java.util.List < java.util.Map<String, ?>> ingressGateways;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIngressGatewaysResponseBody(Builder builder) {
        this.ingressGateways = builder.ingressGateways;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIngressGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return ingressGateways
     */
    public java.util.List < java.util.Map<String, ?>> getIngressGateways() {
        return this.ingressGateways;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, ?>> ingressGateways; 
        private String requestId; 

        /**
         * IngressGateways.
         */
        public Builder ingressGateways(java.util.List < java.util.Map<String, ?>> ingressGateways) {
            this.ingressGateways = ingressGateways;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIngressGatewaysResponseBody build() {
            return new DescribeIngressGatewaysResponseBody(this);
        } 

    } 

}
