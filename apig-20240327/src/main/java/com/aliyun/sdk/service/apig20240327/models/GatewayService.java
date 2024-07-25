// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayService} extends {@link TeaModel}
 *
 * <p>GatewayService</p>
 */
public class GatewayService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addresses")
    private java.util.List < String > addresses;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    @com.aliyun.core.annotation.NameInMap("healthCheck")
    private ServiceHealthCheck healthCheck;

    @com.aliyun.core.annotation.NameInMap("healthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("ports")
    private java.util.List < Ports> ports;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("unhealthyEndpoints")
    private java.util.List < String > unhealthyEndpoints;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private GatewayService(Builder builder) {
        this.addresses = builder.addresses;
        this.createTimestamp = builder.createTimestamp;
        this.gatewayServiceId = builder.gatewayServiceId;
        this.healthCheck = builder.healthCheck;
        this.healthStatus = builder.healthStatus;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.ports = builder.ports;
        this.qualifier = builder.qualifier;
        this.sourceType = builder.sourceType;
        this.unhealthyEndpoints = builder.unhealthyEndpoints;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayService create() {
        return builder().build();
    }

    /**
     * @return addresses
     */
    public java.util.List < String > getAddresses() {
        return this.addresses;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return gatewayServiceId
     */
    public String getGatewayServiceId() {
        return this.gatewayServiceId;
    }

    /**
     * @return healthCheck
     */
    public ServiceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return ports
     */
    public java.util.List < Ports> getPorts() {
        return this.ports;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return unhealthyEndpoints
     */
    public java.util.List < String > getUnhealthyEndpoints() {
        return this.unhealthyEndpoints;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private java.util.List < String > addresses; 
        private Long createTimestamp; 
        private String gatewayServiceId; 
        private ServiceHealthCheck healthCheck; 
        private String healthStatus; 
        private String name; 
        private String namespace; 
        private java.util.List < Ports> ports; 
        private String qualifier; 
        private String sourceType; 
        private java.util.List < String > unhealthyEndpoints; 
        private Long updateTimestamp; 

        /**
         * addresses.
         */
        public Builder addresses(java.util.List < String > addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * gatewayServiceId.
         */
        public Builder gatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }

        /**
         * healthCheck.
         */
        public Builder healthCheck(ServiceHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * healthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * ports.
         */
        public Builder ports(java.util.List < Ports> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * unhealthyEndpoints.
         */
        public Builder unhealthyEndpoints(java.util.List < String > unhealthyEndpoints) {
            this.unhealthyEndpoints = unhealthyEndpoints;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public GatewayService build() {
            return new GatewayService(this);
        } 

    } 

    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String name; 
            private Integer port; 
            private String protocol; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
}
