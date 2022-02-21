// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerHTTPSListenerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerHTTPSListenerResponseBody</p>
 */
public class CreateLoadBalancerHTTPSListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateLoadBalancerHTTPSListenerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerHTTPSListenerResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLoadBalancerHTTPSListenerResponseBody build() {
            return new CreateLoadBalancerHTTPSListenerResponseBody(this);
        } 

    } 

}
