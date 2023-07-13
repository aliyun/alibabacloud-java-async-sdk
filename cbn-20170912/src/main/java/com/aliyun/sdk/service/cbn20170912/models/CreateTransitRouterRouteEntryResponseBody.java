// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteEntryResponseBody</p>
 */
public class CreateTransitRouterRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterRouteEntryId")
    private String transitRouterRouteEntryId;

    private CreateTransitRouterRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterRouteEntryId
     */
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterRouteEntryId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the route.
         */
        public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }

        public CreateTransitRouterRouteEntryResponseBody build() {
            return new CreateTransitRouterRouteEntryResponseBody(this);
        } 

    } 

}
