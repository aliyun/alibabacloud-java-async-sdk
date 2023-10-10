// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sServicesResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sServicesResponseBody</p>
 */
public class GetK8sServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Services")
    private java.util.List < Services> services;

    private GetK8sServicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Services> services; 

        /**
         * The ID of the change process.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The list of services in the Kubernetes cluster.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        public GetK8sServicesResponseBody build() {
            return new GetK8sServicesResponseBody(this);
        } 

    } 

    public static class ServicePorts extends TeaModel {
        @NameInMap("NodePort")
        private Integer nodePort;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
        private String targetPort;

        private ServicePorts(Builder builder) {
            this.nodePort = builder.nodePort;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicePorts create() {
            return builder().build();
        }

        /**
         * @return nodePort
         */
        public Integer getNodePort() {
            return this.nodePort;
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
         * @return targetPort
         */
        public String getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private Integer nodePort; 
            private Integer port; 
            private String protocol; 
            private String targetPort; 

            /**
             * The port of the node.
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * The frontend service port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol of the service.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The backend container port.
             */
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public ServicePorts build() {
                return new ServicePorts(this);
            } 

        } 

    }
    public static class Services extends TeaModel {
        @NameInMap("ClusterIP")
        private String clusterIP;

        @NameInMap("Name")
        private String name;

        @NameInMap("ServicePorts")
        private java.util.List < ServicePorts> servicePorts;

        @NameInMap("Type")
        private String type;

        private Services(Builder builder) {
            this.clusterIP = builder.clusterIP;
            this.name = builder.name;
            this.servicePorts = builder.servicePorts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return clusterIP
         */
        public String getClusterIP() {
            return this.clusterIP;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return servicePorts
         */
        public java.util.List < ServicePorts> getServicePorts() {
            return this.servicePorts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterIP; 
            private String name; 
            private java.util.List < ServicePorts> servicePorts; 
            private String type; 

            /**
             * The IP address of the service in the Kubernetes cluster.
             */
            public Builder clusterIP(String clusterIP) {
                this.clusterIP = clusterIP;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The mapping of service ports.
             */
            public Builder servicePorts(java.util.List < ServicePorts> servicePorts) {
                this.servicePorts = servicePorts;
                return this;
            }

            /**
             * The type of the service.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
