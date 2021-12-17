// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCenRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenRouteMapResponseBody</p>
 */
public class CreateCenRouteMapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteMapId")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RouteMapId.</p>
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
