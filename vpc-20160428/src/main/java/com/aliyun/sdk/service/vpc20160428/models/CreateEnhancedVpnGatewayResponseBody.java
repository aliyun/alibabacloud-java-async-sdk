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
 * {@link CreateEnhancedVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnhancedVpnGatewayResponseBody</p>
 */
public class CreateEnhancedVpnGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private CreateEnhancedVpnGatewayResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnhancedVpnGatewayResponseBody create() {
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
        private String requestId; 
        private String vpnGatewayId; 

        private Builder() {
        } 

        private Builder(CreateEnhancedVpnGatewayResponseBody model) {
            this.name = model.name;
            this.requestId = model.requestId;
            this.vpnGatewayId = model.vpnGatewayId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * VpnGatewayId.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public CreateEnhancedVpnGatewayResponseBody build() {
            return new CreateEnhancedVpnGatewayResponseBody(this);
        } 

    } 

}
