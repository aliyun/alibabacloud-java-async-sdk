// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("Headless")
    private Boolean headless;

    @Query
    @NameInMap("K8sServiceId")
    @Validation(required = true)
    private String k8sServiceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("PortMappings")
    @Validation(required = true)
    private java.util.List < PortMappings> portMappings;

    @Query
    @NameInMap("ServiceType")
    @Validation(required = true)
    private String serviceType;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.headless = builder.headless;
        this.k8sServiceId = builder.k8sServiceId;
        this.name = builder.name;
        this.portMappings = builder.portMappings;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return headless
     */
    public Boolean getHeadless() {
        return this.headless;
    }

    /**
     * @return k8sServiceId
     */
    public String getK8sServiceId() {
        return this.k8sServiceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portMappings
     */
    public java.util.List < PortMappings> getPortMappings() {
        return this.portMappings;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private Long envId; 
        private Boolean headless; 
        private String k8sServiceId; 
        private String name; 
        private java.util.List < PortMappings> portMappings; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.envId = request.envId;
            this.headless = request.headless;
            this.k8sServiceId = request.k8sServiceId;
            this.name = request.name;
            this.portMappings = request.portMappings;
            this.serviceType = request.serviceType;
        } 

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Headless.
         */
        public Builder headless(Boolean headless) {
            this.putQueryParameter("Headless", headless);
            this.headless = headless;
            return this;
        }

        /**
         * K8sServiceId.
         */
        public Builder k8sServiceId(String k8sServiceId) {
            this.putQueryParameter("K8sServiceId", k8sServiceId);
            this.k8sServiceId = k8sServiceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PortMappings.
         */
        public Builder portMappings(java.util.List < PortMappings> portMappings) {
            this.putBodyParameter("PortMappings", portMappings);
            this.portMappings = portMappings;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    public static class PortMappings extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("NodePort")
        private Integer nodePort;

        @NameInMap("Port")
        @Validation(required = true)
        private Integer port;

        @NameInMap("Protocol")
        @Validation(required = true)
        private String protocol;

        @NameInMap("TargetPort")
        @Validation(required = true)
        private String targetPort;

        private PortMappings(Builder builder) {
            this.name = builder.name;
            this.nodePort = builder.nodePort;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMappings create() {
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
        public String getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String name; 
            private Integer nodePort; 
            private Integer port; 
            private String protocol; 
            private String targetPort; 

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
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public PortMappings build() {
                return new PortMappings(this);
            } 

        } 

    }
}
