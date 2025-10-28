// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetK8sServicesResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sServicesResponseBody</p>
 */
public class GetK8sServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Services> getServices() {
        return this.services;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Services> services; 

        private Builder() {
        } 

        private Builder(GetK8sServicesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.services = model.services;
        } 

        /**
         * <p>The ID of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4823-bhjf-23u4-eiufh</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of services in the Kubernetes cluster.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        public GetK8sServicesResponseBody build() {
            return new GetK8sServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetK8sServicesResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sServicesResponseBody</p>
     */
    public static class ServicePorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodePort")
        private Integer nodePort;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
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

            private Builder() {
            } 

            private Builder(ServicePorts model) {
                this.nodePort = model.nodePort;
                this.port = model.port;
                this.protocol = model.protocol;
                this.targetPort = model.targetPort;
            } 

            /**
             * <p>The port of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * <p>The frontend service port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The backend container port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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
    /**
     * 
     * {@link GetK8sServicesResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sServicesResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterIP")
        private String clusterIP;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServicePorts")
        private java.util.List<ServicePorts> servicePorts;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<ServicePorts> getServicePorts() {
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
            private java.util.List<ServicePorts> servicePorts; 
            private String type; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.clusterIP = model.clusterIP;
                this.name = model.name;
                this.servicePorts = model.servicePorts;
                this.type = model.type;
            } 

            /**
             * <p>The IP address of the service in the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>104.23.xx.xx</p>
             */
            public Builder clusterIP(String clusterIP) {
                this.clusterIP = clusterIP;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>service-http</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The mapping of service ports.</p>
             */
            public Builder servicePorts(java.util.List<ServicePorts> servicePorts) {
                this.servicePorts = servicePorts;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterIP</p>
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
