// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link InitContainerConfig} extends {@link TeaModel}
 *
 * <p>InitContainerConfig</p>
 */
public class InitContainerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private InitContainerConfig(Builder builder) {
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitContainerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMapMountDesc
     */
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private String envs; 
        private String imageUrl; 
        private String name; 

        private Builder() {
        } 

        private Builder(InitContainerConfig model) {
            this.command = model.command;
            this.commandArgs = model.commandArgs;
            this.configMapMountDesc = model.configMapMountDesc;
            this.envs = model.envs;
            this.imageUrl = model.imageUrl;
            this.name = model.name;
        } 

        /**
         * Command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * CommandArgs.
         */
        public Builder commandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * ConfigMapMountDesc.
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(String envs) {
            this.envs = envs;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public InitContainerConfig build() {
            return new InitContainerConfig(this);
        } 

    } 

}
