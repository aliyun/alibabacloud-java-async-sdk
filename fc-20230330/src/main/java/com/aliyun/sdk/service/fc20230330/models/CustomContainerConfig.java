// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomContainerConfig} extends {@link TeaModel}
 *
 * <p>CustomContainerConfig</p>
 */
public class CustomContainerConfig extends TeaModel {
    @NameInMap("accelerationInfo")
    private AccelerationInfo accelerationInfo;

    @NameInMap("accelerationType")
    private String accelerationType;

    @NameInMap("acrInstanceId")
    private String acrInstanceId;

    @NameInMap("command")
    private java.util.List < String > command;

    @NameInMap("entrypoint")
    private java.util.List < String > entrypoint;

    @NameInMap("healthCheckConfig")
    private CustomHealthCheckConfig healthCheckConfig;

    @NameInMap("image")
    private String image;

    @NameInMap("port")
    private Integer port;

    private CustomContainerConfig(Builder builder) {
        this.accelerationInfo = builder.accelerationInfo;
        this.accelerationType = builder.accelerationType;
        this.acrInstanceId = builder.acrInstanceId;
        this.command = builder.command;
        this.entrypoint = builder.entrypoint;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.image = builder.image;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomContainerConfig create() {
        return builder().build();
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
    public java.util.List < String > getCommand() {
        return this.command;
    }

    /**
     * @return entrypoint
     */
    public java.util.List < String > getEntrypoint() {
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

    public static final class Builder {
        private AccelerationInfo accelerationInfo; 
        private String accelerationType; 
        private String acrInstanceId; 
        private java.util.List < String > command; 
        private java.util.List < String > entrypoint; 
        private CustomHealthCheckConfig healthCheckConfig; 
        private String image; 
        private Integer port; 

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
        public Builder command(java.util.List < String > command) {
            this.command = command;
            return this;
        }

        /**
         * entrypoint.
         */
        public Builder entrypoint(java.util.List < String > entrypoint) {
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

        public CustomContainerConfig build() {
            return new CustomContainerConfig(this);
        } 

    } 

}
