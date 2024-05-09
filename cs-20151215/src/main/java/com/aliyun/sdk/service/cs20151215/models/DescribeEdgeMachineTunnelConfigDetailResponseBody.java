// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineTunnelConfigDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineTunnelConfigDetailResponseBody</p>
 */
public class DescribeEdgeMachineTunnelConfigDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("device_name")
    private String deviceName;

    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("product_key")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sn")
    private String sn;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("tunnel_endpoint")
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
         * The device name.
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
         * Product Key
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * Request ID
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
         * Token
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * The tunnel endpoint.
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
