// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportedServicesDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportedServicesDetailResponseBody</p>
 */
public class DescribeImportedServicesDetailResponseBody extends TeaModel {
    @NameInMap("Details")
    private java.util.List < Details> details;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImportedServicesDetailResponseBody(Builder builder) {
        this.details = builder.details;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportedServicesDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return details
     */
    public java.util.List < Details> getDetails() {
        return this.details;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Details> details; 
        private String requestId; 

        /**
         * Details.
         */
        public Builder details(java.util.List < Details> details) {
            this.details = details;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImportedServicesDetailResponseBody build() {
            return new DescribeImportedServicesDetailResponseBody(this);
        } 

    } 

    public static class Ports extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NodePort")
        private Integer nodePort;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
        private Integer targetPort;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.nodePort = builder.nodePort;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
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
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String name; 
            private Integer nodePort; 
            private Integer port; 
            private String protocol; 
            private Integer targetPort; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodePort.
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
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
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    public static class Details extends TeaModel {
        @NameInMap("ClusterIds")
        private java.util.List < String > clusterIds;

        @NameInMap("Labels")
        private java.util.Map < String, String > labels;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Ports")
        private java.util.List < Ports> ports;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceType")
        private String serviceType;

        private Details(Builder builder) {
            this.clusterIds = builder.clusterIds;
            this.labels = builder.labels;
            this.namespace = builder.namespace;
            this.ports = builder.ports;
            this.serviceName = builder.serviceName;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return clusterIds
         */
        public java.util.List < String > getClusterIds() {
            return this.clusterIds;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, String > getLabels() {
            return this.labels;
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
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private java.util.List < String > clusterIds; 
            private java.util.Map < String, String > labels; 
            private String namespace; 
            private java.util.List < Ports> ports; 
            private String serviceName; 
            private String serviceType; 

            /**
             * ClusterIds.
             */
            public Builder clusterIds(java.util.List < String > clusterIds) {
                this.clusterIds = clusterIds;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

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
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
