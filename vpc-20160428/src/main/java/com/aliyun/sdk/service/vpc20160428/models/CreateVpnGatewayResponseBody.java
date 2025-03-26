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
 * {@link CreateVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnGatewayResponseBody</p>
 */
public class CreateVpnGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateVpnGatewayResponseBody model) {
            this.name = model.name;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.vpnGatewayId = model.vpnGatewayId;
        } 

        /**
         * <p>The name of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>MYVPN</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * <p>If automatic payment is disabled, you must manually complete the payment for the VPN gateway in the <a href="https://usercenter2-intl.aliyun.com/billing/#/account/overview">Alibaba Cloud Management console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>208240895400460</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB2C156A-41F8-49CC-A756-D55AFC8BFD69</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-uf68lxhgr7ftbqr3p****</p>
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
