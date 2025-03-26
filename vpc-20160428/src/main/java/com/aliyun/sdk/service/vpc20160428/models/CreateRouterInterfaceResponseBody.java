// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRouterInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouterInterfaceResponseBody</p>
 */
public class CreateRouterInterfaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateRouterInterfaceResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.routerInterfaceId = model.routerInterfaceId;
        } 

        /**
         * <p>The order number. This parameter is returned if InstanceChargeType is set to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>202008594930117</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>079874CD-AEC1-43E6-AC03-ADD96B6E4907</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2ze7fbuohm****</p>
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
