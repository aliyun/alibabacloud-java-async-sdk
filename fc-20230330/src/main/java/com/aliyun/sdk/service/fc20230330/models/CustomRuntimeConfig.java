// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomRuntimeConfig} extends {@link TeaModel}
 *
 * <p>CustomRuntimeConfig</p>
 */
public class CustomRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List < String > args;

    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List < String > command;

    @com.aliyun.core.annotation.NameInMap("healthCheckConfig")
    private CustomHealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    private CustomRuntimeConfig(Builder builder) {
        this.args = builder.args;
        this.command = builder.command;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomRuntimeConfig create() {
        return builder().build();
    }

    /**
     * @return args
     */
    public java.util.List < String > getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public java.util.List < String > getCommand() {
        return this.command;
    }

    /**
     * @return healthCheckConfig
     */
    public CustomHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder {
        private java.util.List < String > args; 
        private java.util.List < String > command; 
        private CustomHealthCheckConfig healthCheckConfig; 
        private Integer port; 

        /**
         * args.
         */
        public Builder args(java.util.List < String > args) {
            this.args = args;
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
         * healthCheckConfig.
         */
        public Builder healthCheckConfig(CustomHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        public CustomRuntimeConfig build() {
            return new CustomRuntimeConfig(this);
        } 

    } 

}
