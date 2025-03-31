// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CustomContainerConfig} extends {@link TeaModel}
 *
 * <p>CustomContainerConfig</p>
 */
public class CustomContainerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accelerationInfo")
    private AccelerationInfo accelerationInfo;

    @com.aliyun.core.annotation.NameInMap("accelerationType")
    private String accelerationType;

    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("entrypoint")
    private java.util.List<String> entrypoint;

    @com.aliyun.core.annotation.NameInMap("healthCheckConfig")
    private CustomHealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private RegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("resolvedImageUri")
    private String resolvedImageUri;

    private CustomContainerConfig(Builder builder) {
        this.accelerationInfo = builder.accelerationInfo;
        this.accelerationType = builder.accelerationType;
        this.acrInstanceId = builder.acrInstanceId;
        this.command = builder.command;
        this.entrypoint = builder.entrypoint;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.image = builder.image;
        this.port = builder.port;
        this.registryConfig = builder.registryConfig;
        this.resolvedImageUri = builder.resolvedImageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomContainerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerationInfo
     */
    public AccelerationInfo getAccelerationInfo() {
        return this.accelerationInfo;
    }

    /**
     * @return accelerationType
     */
    public String getAccelerationType() {
        return this.accelerationType;
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return entrypoint
     */
    public java.util.List<String> getEntrypoint() {
        return this.entrypoint;
    }

    /**
     * @return healthCheckConfig
     */
    public CustomHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return registryConfig
     */
    public RegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    /**
     * @return resolvedImageUri
     */
    public String getResolvedImageUri() {
        return this.resolvedImageUri;
    }

    public static final class Builder {
        private AccelerationInfo accelerationInfo; 
        private String accelerationType; 
        private String acrInstanceId; 
        private java.util.List<String> command; 
        private java.util.List<String> entrypoint; 
        private CustomHealthCheckConfig healthCheckConfig; 
        private String image; 
        private Integer port; 
        private RegistryConfig registryConfig; 
        private String resolvedImageUri; 

        private Builder() {
        } 

        private Builder(CustomContainerConfig model) {
            this.accelerationInfo = model.accelerationInfo;
            this.accelerationType = model.accelerationType;
            this.acrInstanceId = model.acrInstanceId;
            this.command = model.command;
            this.entrypoint = model.entrypoint;
            this.healthCheckConfig = model.healthCheckConfig;
            this.image = model.image;
            this.port = model.port;
            this.registryConfig = model.registryConfig;
            this.resolvedImageUri = model.resolvedImageUri;
        } 

        /**
         * accelerationInfo.
         */
        public Builder accelerationInfo(AccelerationInfo accelerationInfo) {
            this.accelerationInfo = accelerationInfo;
            return this;
        }

        /**
         * accelerationType.
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * acrInstanceId.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * command.
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * entrypoint.
         */
        public Builder entrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        /**
         * healthCheckConfig.
         */
        public Builder healthCheckConfig(CustomHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * registryConfig.
         */
        public Builder registryConfig(RegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * resolvedImageUri.
         */
        public Builder resolvedImageUri(String resolvedImageUri) {
            this.resolvedImageUri = resolvedImageUri;
            return this;
        }

        public CustomContainerConfig build() {
            return new CustomContainerConfig(this);
        } 

    } 

}
