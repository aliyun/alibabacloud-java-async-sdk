// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerHTTPListenerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerHTTPListenerResponseBody</p>
 */
public class CreateLoadBalancerHTTPListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateLoadBalancerHTTPListenerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerHTTPListenerResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLoadBalancerHTTPListenerResponseBody build() {
            return new CreateLoadBalancerHTTPListenerResponseBody(this);
        } 

    } 

}
