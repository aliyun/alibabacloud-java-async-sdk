// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterTransitRouterMulticastGroupSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupSourcesResponseBody</p>
 */
public class DeregisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeregisterTransitRouterMulticastGroupSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterTransitRouterMulticastGroupSourcesResponseBody create() {
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

        public DeregisterTransitRouterMulticastGroupSourcesResponseBody build() {
            return new DeregisterTransitRouterMulticastGroupSourcesResponseBody(this);
        } 

    } 

}
