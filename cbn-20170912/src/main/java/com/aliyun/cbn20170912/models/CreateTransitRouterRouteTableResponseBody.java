// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateTransitRouterRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteTableResponseBody</p>
 */
public class CreateTransitRouterRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;


    private CreateTransitRouterRouteTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterRouteTableId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableId.</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        public CreateTransitRouterRouteTableResponseBody build() {
            return new CreateTransitRouterRouteTableResponseBody(this);
        } 

    } 

}
