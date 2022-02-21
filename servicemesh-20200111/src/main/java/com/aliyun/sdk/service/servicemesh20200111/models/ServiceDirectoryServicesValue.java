// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceDirectoryServicesValue} extends {@link TeaModel}
 *
 * <p>ServiceDirectoryServicesValue</p>
 */
public class ServiceDirectoryServicesValue extends TeaModel {
    @NameInMap("Ports")
    private java.util.List < Ports> ports;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @NameInMap("ClusterIds")
    private java.util.List < String > clusterIds;

    private ServiceDirectoryServicesValue(Builder builder) {
        this.ports = builder.ports;
        this.serviceName = builder.serviceName;
        this.namespace = builder.namespace;
        this.serviceType = builder.serviceType;
        this.labels = builder.labels;
        this.clusterIds = builder.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceDirectoryServicesValue create() {
        return builder().build();
    }

    /**
     * @return ports
     */
    public java.util.List < Ports> getPorts() {
        return this.ports;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return clusterIds
     */
    public java.util.List < String > getClusterIds() {
        return this.clusterIds;
    }

    public static final class Builder {
        private java.util.List < Ports> ports; 
        private String serviceName; 
        private String namespace; 
        private String serviceType; 
        private java.util.Map < String, String > labels; 
        private java.util.List < String > clusterIds; 

        /**
         * Ports.
         */
        public Builder ports(java.util.List < Ports> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * ClusterIds.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            this.clusterIds = clusterIds;
            return this;
        }

        public ServiceDirectoryServicesValue build() {
            return new ServiceDirectoryServicesValue(this);
        } 

    } 

    public static class Ports extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("TargetPort")
        private Integer targetPort;

        @NameInMap("NodePort")
        private Integer nodePort;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.port = builder.port;
            this.targetPort = builder.targetPort;
            this.nodePort = builder.nodePort;
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
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        /**
         * @return nodePort
         */
        public Integer getNodePort() {
            return this.nodePort;
        }

        public static final class Builder {
            private String name; 
            private String protocol; 
            private Integer port; 
            private Integer targetPort; 
            private Integer nodePort; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * NodePort.
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
}
