// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeDeviceGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceGatewayResponseBody</p>
 */
public class DescribeDeviceGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeDeviceGatewayResponseBody(Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String host; 
        private Long port; 
        private String protocol; 
        private String requestId; 
        private String token; 

        private Builder() {
        } 

        private Builder(DescribeDeviceGatewayResponseBody model) {
            this.host = model.host;
            this.port = model.port;
            this.protocol = model.protocol;
            this.requestId = model.requestId;
            this.token = model.token;
        } 

        /**
         * <p>Alibaba Cloud service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>Port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * <p>Device registration protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>Request ID for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Token code.</p>
         * 
         * <strong>example:</strong>
         * <p>f5578fbc-694c-461d-a2a2-eb090775cef0</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DescribeDeviceGatewayResponseBody build() {
            return new DescribeDeviceGatewayResponseBody(this);
        } 

    } 

}
