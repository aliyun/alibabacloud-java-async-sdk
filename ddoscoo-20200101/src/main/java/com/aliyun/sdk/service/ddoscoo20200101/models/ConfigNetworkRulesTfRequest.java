// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRulesTfRequest} extends {@link RequestModel}
 *
 * <p>ConfigNetworkRulesTfRequest</p>
 */
public class ConfigNetworkRulesTfRequest extends Request {
    @Query
    @NameInMap("PortParam")
    @Validation(required = true)
    private java.util.List < PortParam> portParam;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ConfigNetworkRulesTfRequest(Builder builder) {
        super(builder);
        this.portParam = builder.portParam;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetworkRulesTfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portParam
     */
    public java.util.List < PortParam> getPortParam() {
        return this.portParam;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigNetworkRulesTfRequest, Builder> {
        private java.util.List < PortParam> portParam; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigNetworkRulesTfRequest response) {
            super(response);
            this.portParam = response.portParam;
            this.regionId = response.regionId;
        } 

        /**
         * PortParam.
         */
        public Builder portParam(java.util.List < PortParam> portParam) {
            this.putQueryParameter("PortParam", portParam);
            this.portParam = portParam;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigNetworkRulesTfRequest build() {
            return new ConfigNetworkRulesTfRequest(this);
        } 

    } 

    public static class PortParam extends TeaModel {
        @NameInMap("BackendPort")
        private String backendPort;

        @NameInMap("FrontendPort")
        @Validation(required = true)
        private String frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServers")
        @Validation(required = true)
        private java.util.List < String > realServers;

        private PortParam(Builder builder) {
            this.backendPort = builder.backendPort;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.realServers = builder.realServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortParam create() {
            return builder().build();
        }

        /**
         * @return backendPort
         */
        public String getBackendPort() {
            return this.backendPort;
        }

        /**
         * @return frontendPort
         */
        public String getFrontendPort() {
            return this.frontendPort;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        public static final class Builder {
            private String backendPort; 
            private String frontendPort; 
            private String instanceId; 
            private String protocol; 
            private java.util.List < String > realServers; 

            /**
             * BackendPort.
             */
            public Builder backendPort(String backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * FrontendPort.
             */
            public Builder frontendPort(String frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RealServers.
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            public PortParam build() {
                return new PortParam(this);
            } 

        } 

    }
}
