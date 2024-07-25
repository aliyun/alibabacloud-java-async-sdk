// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayRouteBackendConfig} extends {@link TeaModel}
 *
 * <p>GatewayRouteBackendConfig</p>
 */
public class GatewayRouteBackendConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.List < Services> services;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GatewayRouteBackendConfig(Builder builder) {
        this.services = builder.services;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayRouteBackendConfig create() {
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

        public GatewayRouteBackendConfig build() {
            return new GatewayRouteBackendConfig(this);
        } 

    } 

    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Float weight;

        private Services(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceType = builder.sourceType;
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
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private Integer port; 
            private String protocol; 
            private String sourceType; 
            private Float weight; 

            /**
             * gatewayServiceId.
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
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
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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
