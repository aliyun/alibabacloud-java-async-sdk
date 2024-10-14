// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ForwardInfoResponse} extends {@link TeaModel}
 *
 * <p>ForwardInfoResponse</p>
 */
public class ForwardInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("ConnectInfo")
    private ConnectInfo connectInfo;

    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.NameInMap("EipAllocationId")
    private String eipAllocationId;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.NameInMap("SSHPublicKey")
    private String SSHPublicKey;

    private ForwardInfoResponse(BuilderImpl builder) {
        super(builder);
        this.connectInfo = builder.connectInfo;
        this.containerName = builder.containerName;
        this.eipAllocationId = builder.eipAllocationId;
        this.enable = builder.enable;
        this.natGatewayId = builder.natGatewayId;
        this.port = builder.port;
        this.SSHPublicKey = builder.SSHPublicKey;
    }

    public static ForwardInfoResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return connectInfo
     */
    public ConnectInfo getConnectInfo() {
        return this.connectInfo;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return eipAllocationId
     */
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return SSHPublicKey
     */
    public String getSSHPublicKey() {
        return this.SSHPublicKey;
    }

    public interface Builder extends Response.Builder<ForwardInfoResponse, Builder> {

        Builder connectInfo(ConnectInfo connectInfo);

        Builder containerName(String containerName);

        Builder eipAllocationId(String eipAllocationId);

        Builder enable(Boolean enable);

        Builder natGatewayId(String natGatewayId);

        Builder port(String port);

        Builder SSHPublicKey(String SSHPublicKey);

        @Override
        ForwardInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForwardInfoResponse, Builder>
            implements Builder {
        private ConnectInfo connectInfo; 
        private String containerName; 
        private String eipAllocationId; 
        private Boolean enable; 
        private String natGatewayId; 
        private String port; 
        private String SSHPublicKey; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForwardInfoResponse response) {
            super(response);
            this.connectInfo = response.connectInfo;
            this.containerName = response.containerName;
            this.eipAllocationId = response.eipAllocationId;
            this.enable = response.enable;
            this.natGatewayId = response.natGatewayId;
            this.port = response.port;
            this.SSHPublicKey = response.SSHPublicKey;
        } 

        /**
         * ConnectInfo.
         */
        @Override
        public Builder connectInfo(ConnectInfo connectInfo) {
            this.connectInfo = connectInfo;
            return this;
        }

        /**
         * ContainerName.
         */
        @Override
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * EipAllocationId.
         */
        @Override
        public Builder eipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }

        /**
         * Enable.
         */
        @Override
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * NatGatewayId.
         */
        @Override
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Port.
         */
        @Override
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * SSHPublicKey.
         */
        @Override
        public Builder SSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }

        @Override
        public ForwardInfoResponse build() {
            return new ForwardInfoResponse(this);
        } 

    } 

    /**
     * 
     * {@link ForwardInfoResponse} extends {@link TeaModel}
     *
     * <p>ForwardInfoResponse</p>
     */
    public static class Internet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private Internet(Builder builder) {
            this.endpoint = builder.endpoint;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internet create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String endpoint; 
            private String port; 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public Internet build() {
                return new Internet(this);
            } 

        } 

    }
    /**
     * 
     * {@link ForwardInfoResponse} extends {@link TeaModel}
     *
     * <p>ForwardInfoResponse</p>
     */
    public static class Intranet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private Intranet(Builder builder) {
            this.endpoint = builder.endpoint;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intranet create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String endpoint; 
            private String port; 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public Intranet build() {
                return new Intranet(this);
            } 

        } 

    }
    /**
     * 
     * {@link ForwardInfoResponse} extends {@link TeaModel}
     *
     * <p>ForwardInfoResponse</p>
     */
    public static class ConnectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Internet")
        private Internet internet;

        @com.aliyun.core.annotation.NameInMap("Intranet")
        private Intranet intranet;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        private ConnectInfo(Builder builder) {
            this.internet = builder.internet;
            this.intranet = builder.intranet;
            this.message = builder.message;
            this.phase = builder.phase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectInfo create() {
            return builder().build();
        }

        /**
         * @return internet
         */
        public Internet getInternet() {
            return this.internet;
        }

        /**
         * @return intranet
         */
        public Intranet getIntranet() {
            return this.intranet;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        public static final class Builder {
            private Internet internet; 
            private Intranet intranet; 
            private String message; 
            private String phase; 

            /**
             * Internet.
             */
            public Builder internet(Internet internet) {
                this.internet = internet;
                return this;
            }

            /**
             * Intranet.
             */
            public Builder intranet(Intranet intranet) {
                this.intranet = intranet;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            public ConnectInfo build() {
                return new ConnectInfo(this);
            } 

        } 

    }
}
