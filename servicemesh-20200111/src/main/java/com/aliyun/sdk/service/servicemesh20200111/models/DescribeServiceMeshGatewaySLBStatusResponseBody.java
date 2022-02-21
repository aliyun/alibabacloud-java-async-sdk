// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshGatewaySLBStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshGatewaySLBStatusResponseBody</p>
 */
public class DescribeServiceMeshGatewaySLBStatusResponseBody extends TeaModel {
    @NameInMap("GatewaySLB")
    private java.util.Map < String, GatewaySLBValue > gatewaySLB;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshGatewaySLBStatusResponseBody(Builder builder) {
        this.gatewaySLB = builder.gatewaySLB;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshGatewaySLBStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return gatewaySLB
     */
    public java.util.Map < String, GatewaySLBValue > getGatewaySLB() {
        return this.gatewaySLB;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, GatewaySLBValue > gatewaySLB; 
        private String requestId; 

        /**
         * GatewaySLB.
         */
        public Builder gatewaySLB(java.util.Map < String, GatewaySLBValue > gatewaySLB) {
            this.gatewaySLB = gatewaySLB;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshGatewaySLBStatusResponseBody build() {
            return new DescribeServiceMeshGatewaySLBStatusResponseBody(this);
        } 

    } 

}
