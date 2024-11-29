// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteTableResponseBody</p>
 */
public class CreateRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    private CreateRouteTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeTableId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62172DD5-6BAC-45DF-8D44-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the route tables.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdvzu2****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        public CreateRouteTableResponseBody build() {
            return new CreateRouteTableResponseBody(this);
        } 

    } 

}
