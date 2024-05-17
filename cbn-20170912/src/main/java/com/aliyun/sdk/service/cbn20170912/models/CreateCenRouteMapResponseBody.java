// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenRouteMapResponseBody</p>
 */
public class CreateCenRouteMapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMapId")
    private String routeMapId;

    private CreateCenRouteMapResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeMapId = builder.routeMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenRouteMapResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeMapId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the routing policy.
         */
        public Builder routeMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }

        public CreateCenRouteMapResponseBody build() {
            return new CreateCenRouteMapResponseBody(this);
        } 

    } 

}
