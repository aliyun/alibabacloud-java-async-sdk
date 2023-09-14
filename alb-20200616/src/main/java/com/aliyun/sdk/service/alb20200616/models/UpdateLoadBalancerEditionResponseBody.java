// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerEditionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLoadBalancerEditionResponseBody</p>
 */
public class UpdateLoadBalancerEditionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateLoadBalancerEditionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerEditionResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLoadBalancerEditionResponseBody build() {
            return new UpdateLoadBalancerEditionResponseBody(this);
        } 

    } 

}
