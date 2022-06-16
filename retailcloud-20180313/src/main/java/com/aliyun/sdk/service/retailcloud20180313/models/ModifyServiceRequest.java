// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyServiceRequest</p>
 */
public class ModifyServiceRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PortMappings")
    private java.util.List < PortMappings> portMappings;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private Long serviceId;

    private ModifyServiceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.portMappings = builder.portMappings;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<ModifyServiceRequest, Builder> {
        private String name; 
        private java.util.List < PortMappings> portMappings; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyServiceRequest request) {
            super(request);
            this.name = request.name;
            this.portMappings = request.portMappings;
            this.serviceId = request.serviceId;
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
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public ModifyServiceRequest build() {
            return new ModifyServiceRequest(this);
        } 

    } 

    public static class PortMappings extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NodePort")
        private Integer nodePort;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
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
