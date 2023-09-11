// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableLoadBalancerIpv6InternetResponseBody} extends {@link TeaModel}
 *
 * <p>EnableLoadBalancerIpv6InternetResponseBody</p>
 */
public class EnableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableLoadBalancerIpv6InternetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableLoadBalancerIpv6InternetResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableLoadBalancerIpv6InternetResponseBody build() {
            return new EnableLoadBalancerIpv6InternetResponseBody(this);
        } 

    } 

}
