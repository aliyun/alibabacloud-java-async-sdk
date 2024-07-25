// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayRouteBackend} extends {@link TeaModel}
 *
 * <p>GatewayRouteBackend</p>
 */
public class GatewayRouteBackend extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.List < Services> services;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GatewayRouteBackend(Builder builder) {
        this.services = builder.services;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayRouteBackend create() {
        return builder().build();
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < Services> services; 
        private String type; 

        /**
         * services.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GatewayRouteBackend build() {
            return new GatewayRouteBackend(this);
        } 

    } 

    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Float weight;

        private Services(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return gatewayServiceId
         */
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
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

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private String name; 
            private Integer port; 
            private String protocol; 
            private String version; 
            private Float weight; 

            /**
             * gatewayServiceId.
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
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

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Float weight) {
                this.weight = weight;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
