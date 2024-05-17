// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableTransitRouterRouteTablePropagationResponseBody} extends {@link TeaModel}
 *
 * <p>EnableTransitRouterRouteTablePropagationResponseBody</p>
 */
public class EnableTransitRouterRouteTablePropagationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableTransitRouterRouteTablePropagationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableTransitRouterRouteTablePropagationResponseBody create() {
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

        public EnableTransitRouterRouteTablePropagationResponseBody build() {
            return new EnableTransitRouterRouteTablePropagationResponseBody(this);
        } 

    } 

}
