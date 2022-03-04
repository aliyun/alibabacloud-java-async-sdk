// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouterInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouterInterfaceResponseBody</p>
 */
public class CreateRouterInterfaceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouterInterfaceId")
    private String routerInterfaceId;

    private CreateRouterInterfaceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.routerInterfaceId = builder.routerInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouterInterfaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routerInterfaceId
     */
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public static final class Builder {
        private Long orderId; 
        private String requestId; 
        private String routerInterfaceId; 

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouterInterfaceId.
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        public CreateRouterInterfaceResponseBody build() {
            return new CreateRouterInterfaceResponseBody(this);
        } 

    } 

}
