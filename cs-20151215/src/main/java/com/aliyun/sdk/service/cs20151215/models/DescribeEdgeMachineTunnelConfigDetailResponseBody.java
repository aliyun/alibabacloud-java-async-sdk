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
    @NameInMap("model")
    private String model;

    @NameInMap("sn")
    private String sn;

    @NameInMap("tunnel_endpoint")
    private String tunnelEndpoint;

    @NameInMap("token")
    private String token;

    @NameInMap("product_key")
    private String productKey;

    @NameInMap("device_name")
    private String deviceName;

    @NameInMap("request_id")
    private String requestId;

    private DescribeEdgeMachineTunnelConfigDetailResponseBody(Builder builder) {
        this.model = builder.model;
        this.sn = builder.sn;
        this.tunnelEndpoint = builder.tunnelEndpoint;
        this.token = builder.token;
        this.productKey = builder.productKey;
        this.deviceName = builder.deviceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineTunnelConfigDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return tunnelEndpoint
     */
    public String getTunnelEndpoint() {
        return this.tunnelEndpoint;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String model; 
        private String sn; 
        private String tunnelEndpoint; 
        private String token; 
        private String productKey; 
        private String deviceName; 
        private String requestId; 

        /**
         * Cloud Native all-in-one model
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * SN serial number of cloud native all-in-one machine
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * Tunnel backend link
         */
        public Builder tunnelEndpoint(String tunnelEndpoint) {
            this.tunnelEndpoint = tunnelEndpoint;
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
         * Product Key
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * Device Name
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Request ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEdgeMachineTunnelConfigDetailResponseBody build() {
            return new DescribeEdgeMachineTunnelConfigDetailResponseBody(this);
        } 

    } 

}
