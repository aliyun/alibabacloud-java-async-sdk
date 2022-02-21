// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceDirectoryServicesValueValue} extends {@link TeaModel}
 *
 * <p>ServiceDirectoryServicesValueValue</p>
 */
public class ServiceDirectoryServicesValueValue extends TeaModel {
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

    private ServiceDirectoryServicesValueValue(Builder builder) {
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.port = builder.port;
        this.targetPort = builder.targetPort;
        this.nodePort = builder.nodePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceDirectoryServicesValueValue create() {
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

        public ServiceDirectoryServicesValueValue build() {
            return new ServiceDirectoryServicesValueValue(this);
        } 

    } 

}
