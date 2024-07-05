// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
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
         * Token.
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
