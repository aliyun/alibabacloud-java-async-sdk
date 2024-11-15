// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ForwardInfo} extends {@link TeaModel}
 *
 * <p>ForwardInfo</p>
 */
public class ForwardInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private java.util.List < String > accessType;

    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.NameInMap("EipAllocationId")
    private String eipAllocationId;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    private String externalPort;

    @com.aliyun.core.annotation.NameInMap("ForwardPort")
    private String forwardPort;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("SSHPublicKey")
    private String SSHPublicKey;

    private ForwardInfo(Builder builder) {
        this.accessType = builder.accessType;
        this.containerName = builder.containerName;
        this.eipAllocationId = builder.eipAllocationId;
        this.enable = builder.enable;
        this.externalPort = builder.externalPort;
        this.forwardPort = builder.forwardPort;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.SSHPublicKey = builder.SSHPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForwardInfo create() {
        return builder().build();
    }

    /**
     * @return accessType
     */
    public java.util.List < String > getAccessType() {
        return this.accessType;
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
     * @return externalPort
     */
    public String getExternalPort() {
        return this.externalPort;
    }

    /**
     * @return forwardPort
     */
    public String getForwardPort() {
        return this.forwardPort;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return SSHPublicKey
     */
    public String getSSHPublicKey() {
        return this.SSHPublicKey;
    }

    public static final class Builder {
        private java.util.List < String > accessType; 
        private String containerName; 
        private String eipAllocationId; 
        private Boolean enable; 
        private String externalPort; 
        private String forwardPort; 
        private String name; 
        private String natGatewayId; 
        private String SSHPublicKey; 

        /**
         * AccessType.
         */
        public Builder accessType(java.util.List < String > accessType) {
            this.accessType = accessType;
            return this;
        }

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
         * ExternalPort.
         */
        public Builder externalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }

        /**
         * ForwardPort.
         */
        public Builder forwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
