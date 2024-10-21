// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62172DD5-6BAC-45DF-8D44-56SDF467BAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cenrmap-w4yf7toozfol3q****</p>
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
