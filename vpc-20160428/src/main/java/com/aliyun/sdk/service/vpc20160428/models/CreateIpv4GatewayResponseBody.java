// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpv4GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpv4GatewayResponseBody</p>
 */
public class CreateIpv4GatewayResponseBody extends TeaModel {
    @NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateIpv4GatewayResponseBody(Builder builder) {
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpv4GatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipv4GatewayId; 
        private String requestId; 

        /**
         * Ipv4GatewayId.
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpv4GatewayResponseBody build() {
            return new CreateIpv4GatewayResponseBody(this);
        } 

    } 

}
