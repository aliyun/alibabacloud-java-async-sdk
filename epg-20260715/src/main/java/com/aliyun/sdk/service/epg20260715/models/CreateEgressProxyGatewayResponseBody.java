// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEgressProxyGatewayResponseBody</p>
 */
public class CreateEgressProxyGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    private String egressProxyGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEgressProxyGatewayResponseBody(Builder builder) {
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String egressProxyGatewayId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEgressProxyGatewayResponseBody model) {
            this.egressProxyGatewayId = model.egressProxyGatewayId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the egress proxy gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A05AB5-98DC-5175-9BBB-33BA653BC0C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEgressProxyGatewayResponseBody build() {
            return new CreateEgressProxyGatewayResponseBody(this);
        } 

    } 

}
