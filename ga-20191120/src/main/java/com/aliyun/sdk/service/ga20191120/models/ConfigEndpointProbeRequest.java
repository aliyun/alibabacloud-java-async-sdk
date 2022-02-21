// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigEndpointProbeRequest} extends {@link RequestModel}
 *
 * <p>ConfigEndpointProbeRequest</p>
 */
public class ConfigEndpointProbeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private String enable;

    @Query
    @NameInMap("Endpoint")
    @Validation(required = true)
    private String endpoint;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("EndpointType")
    @Validation(required = true)
    private String endpointType;

    @Query
    @NameInMap("ProbePort")
    private String probePort;

    @Query
    @NameInMap("ProbeProtocol")
    private String probeProtocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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

        private Builder(ConfigEndpointProbeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.enable = response.enable;
            this.endpoint = response.endpoint;
            this.endpointGroupId = response.endpointGroupId;
            this.endpointType = response.endpointType;
            this.probePort = response.probePort;
            this.probeProtocol = response.probeProtocol;
            this.regionId = response.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * EndpointGroupId.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * ProbePort.
         */
        public Builder probePort(String probePort) {
            this.putQueryParameter("ProbePort", probePort);
            this.probePort = probePort;
            return this;
        }

        /**
         * ProbeProtocol.
         */
        public Builder probeProtocol(String probeProtocol) {
            this.putQueryParameter("ProbeProtocol", probeProtocol);
            this.probeProtocol = probeProtocol;
            return this;
        }

        /**
         * RegionId.
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
