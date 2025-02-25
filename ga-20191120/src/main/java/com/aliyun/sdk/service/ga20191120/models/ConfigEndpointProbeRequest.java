// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigEndpointProbeRequest} extends {@link RequestModel}
 *
 * <p>ConfigEndpointProbeRequest</p>
 */
public class ConfigEndpointProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbePort")
    private String probePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeProtocol")
    private String probeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ConfigEndpointProbeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enable = builder.enable;
        this.endpoint = builder.endpoint;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointType = builder.endpointType;
        this.probePort = builder.probePort;
        this.probeProtocol = builder.probeProtocol;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigEndpointProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return probePort
     */
    public String getProbePort() {
        return this.probePort;
    }

    /**
     * @return probeProtocol
     */
    public String getProbeProtocol() {
        return this.probeProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigEndpointProbeRequest, Builder> {
        private String clientToken; 
        private String enable; 
        private String endpoint; 
        private String endpointGroupId; 
        private String endpointType; 
        private String probePort; 
        private String probeProtocol; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigEndpointProbeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enable = request.enable;
            this.endpoint = request.endpoint;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointType = request.endpointType;
            this.probePort = request.probePort;
            this.probeProtocol = request.probeProtocol;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable latency monitoring. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The endpoint group ID.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The type of the endpoint. Valid values:
         * <p>
         * 
         * *   **Ip:** a custom IP address.
         * *   **Domain:** a custom domain name.
         * *   **EIP:** an Alibaba Cloud elastic IP address (EIP).
         * *   **PublicIp:** an Alibaba Cloud public IP address.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The port that is used to monitor latency. Valid values: **0** to **65535**.
         */
        public Builder probePort(String probePort) {
            this.putQueryParameter("ProbePort", probePort);
            this.probePort = probePort;
            return this;
        }

        /**
         * The protocol that is used to monitor latency. Valid values:
         * <p>
         * 
         * *   **tcp:** TCP.
         * *   **icmp:** ICMP.
         */
        public Builder probeProtocol(String probeProtocol) {
            this.putQueryParameter("ProbeProtocol", probeProtocol);
            this.probeProtocol = probeProtocol;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigEndpointProbeRequest build() {
            return new ConfigEndpointProbeRequest(this);
        } 

    } 

}
