// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElbBuyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateElbBuyOrderResponseBody</p>
 */
public class CreateElbBuyOrderResponseBody extends TeaModel {
    @NameInMap("LoadBalancerIds")
    private java.util.List < String > loadBalancerIds;

    @NameInMap("RequestId")
    private String requestId;

    private CreateElbBuyOrderResponseBody(Builder builder) {
        this.loadBalancerIds = builder.loadBalancerIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElbBuyOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List < String > getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > loadBalancerIds; 
        private String requestId; 

        /**
         * LoadBalancerIds.
         */
        public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateElbBuyOrderResponseBody build() {
            return new CreateElbBuyOrderResponseBody(this);
        } 

    } 

}
