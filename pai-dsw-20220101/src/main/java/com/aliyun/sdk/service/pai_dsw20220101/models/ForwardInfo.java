// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForwardInfo} extends {@link TeaModel}
 *
 * <p>ForwardInfo</p>
 */
public class ForwardInfo extends TeaModel {
    @NameInMap("ContainerName")
    private String containerName;

    @NameInMap("EipAllocationId")
    private String eipAllocationId;

    @NameInMap("Enable")
    private Boolean enable;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("Port")
    private String port;

    @NameInMap("SSHPublicKey")
    private String SSHPublicKey;

    private ForwardInfo(Builder builder) {
        this.containerName = builder.containerName;
        this.eipAllocationId = builder.eipAllocationId;
        this.enable = builder.enable;
        this.natGatewayId = builder.natGatewayId;
        this.port = builder.port;
        this.SSHPublicKey = builder.SSHPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForwardInfo create() {
        return builder().build();
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

    public static final class Builder {
        private String containerName; 
        private String eipAllocationId; 
        private Boolean enable; 
        private String natGatewayId; 
        private String port; 
        private String SSHPublicKey; 

        /**
         * ContainerName.
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * EipAllocationId.
         */
        public Builder eipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * SSHPublicKey.
         */
        public Builder SSHPublicKey(String SSHPublicKey) {
            this.SSHPublicKey = SSHPublicKey;
            return this;
        }

        public ForwardInfo build() {
            return new ForwardInfo(this);
        } 

    } 

}
