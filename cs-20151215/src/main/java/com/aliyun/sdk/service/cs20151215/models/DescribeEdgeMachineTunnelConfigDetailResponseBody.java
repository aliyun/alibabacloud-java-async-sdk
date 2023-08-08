// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineTunnelConfigDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineTunnelConfigDetailResponseBody</p>
 */
public class DescribeEdgeMachineTunnelConfigDetailResponseBody extends TeaModel {
    @NameInMap("device_name")
    private String deviceName;

    @NameInMap("model")
    private String model;

    @NameInMap("product_key")
    private String productKey;

    @NameInMap("request_id")
    private String requestId;

    @NameInMap("sn")
    private String sn;

    @NameInMap("token")
    private String token;

    @NameInMap("tunnel_endpoint")
    private String tunnelEndpoint;

    private DescribeEdgeMachineTunnelConfigDetailResponseBody(Builder builder) {
        this.deviceName = builder.deviceName;
        this.model = builder.model;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.sn = builder.sn;
        this.token = builder.token;
        this.tunnelEndpoint = builder.tunnelEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineTunnelConfigDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tunnelEndpoint
     */
    public String getTunnelEndpoint() {
        return this.tunnelEndpoint;
    }

    public static final class Builder {
        private String deviceName; 
        private String model; 
        private String productKey; 
        private String requestId; 
        private String sn; 
        private String token; 
        private String tunnelEndpoint; 

        /**
         * The name of the cloud-native box.
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * The model of the cloud-native box.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * The product key.
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The serial number of the cloud-native box.
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * The token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * The backend endpoint of the tunnel.
         */
        public Builder tunnelEndpoint(String tunnelEndpoint) {
            this.tunnelEndpoint = tunnelEndpoint;
            return this;
        }

        public DescribeEdgeMachineTunnelConfigDetailResponseBody build() {
            return new DescribeEdgeMachineTunnelConfigDetailResponseBody(this);
        } 

    } 

}
