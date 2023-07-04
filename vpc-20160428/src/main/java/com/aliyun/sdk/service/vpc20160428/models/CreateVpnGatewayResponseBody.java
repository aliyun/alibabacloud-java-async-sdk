// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnGatewayResponseBody</p>
 */
public class CreateVpnGatewayResponseBody extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private CreateVpnGatewayResponseBody(Builder builder) {
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private String name; 
        private Long orderId; 
        private String requestId; 
        private String vpnGatewayId; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the order.
         * <p>
         * 
         * If automatic payment is disabled, you must manually complete the payment for the VPN gateway in the [Alibaba Cloud Management console](https://usercenter2-intl.aliyun.com/billing/#/account/overview).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public CreateVpnGatewayResponseBody build() {
            return new CreateVpnGatewayResponseBody(this);
        } 

    } 

}
