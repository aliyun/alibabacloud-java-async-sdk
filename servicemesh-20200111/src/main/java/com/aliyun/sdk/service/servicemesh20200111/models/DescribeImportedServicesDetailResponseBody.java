// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImportedServicesDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportedServicesDetailResponseBody</p>
 */
public class DescribeImportedServicesDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.List<Details> details;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public java.util.List<Details> getDetails() {
        return this.details;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Details> details; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImportedServicesDetailResponseBody model) {
            this.details = model.details;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the services.</p>
         */
        public Builder details(java.util.List<Details> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0496204-7586-5B4C-B364-2361CC0EDxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImportedServicesDetailResponseBody build() {
            return new DescribeImportedServicesDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImportedServicesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportedServicesDetailResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodePort")
        private Integer nodePort;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
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

            private Builder() {
            } 

            private Builder(Ports model) {
                this.name = model.name;
                this.nodePort = model.nodePort;
                this.port = model.port;
                this.protocol = model.protocol;
                this.targetPort = model.targetPort;
            } 

            /**
             * <p>The name of a port.</p>
             * 
             * <strong>example:</strong>
             * <p>http-0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node port.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The container port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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
    /**
     * 
     * {@link DescribeImportedServicesDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportedServicesDetailResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterIds")
        private java.util.List<String> clusterIds;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
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
        public java.util.List<String> getClusterIds() {
            return this.clusterIds;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
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
        public java.util.List<Ports> getPorts() {
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
            private java.util.List<String> clusterIds; 
            private java.util.Map<String, String> labels; 
            private String namespace; 
            private java.util.List<Ports> ports; 
            private String serviceName; 
            private String serviceType; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.clusterIds = model.clusterIds;
                this.labels = model.labels;
                this.namespace = model.namespace;
                this.ports = model.ports;
                this.serviceName = model.serviceName;
                this.serviceType = model.serviceType;
            } 

            /**
             * <p>The clusters on the data plane.</p>
             */
            public Builder clusterIds(java.util.List<String> clusterIds) {
                this.clusterIds = clusterIds;
                return this;
            }

            /**
             * <p>The labels of the service.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The namespace in which the service resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The ports declared for the service.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The name of a service.</p>
             * 
             * <strong>example:</strong>
             * <p>productpage</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Kubernetes</p>
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
