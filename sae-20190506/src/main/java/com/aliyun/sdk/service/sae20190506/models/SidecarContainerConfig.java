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
 * {@link SidecarContainerConfig} extends {@link TeaModel}
 *
 * <p>SidecarContainerConfig</p>
 */
public class SidecarContainerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
    private String emptyDirDesc;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private SidecarContainerConfig(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.emptyDirDesc = builder.emptyDirDesc;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.memory = builder.memory;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SidecarContainerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return emptyDirDesc
     */
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
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
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String emptyDirDesc; 
        private String envs; 
        private String imageUrl; 
        private Integer memory; 
        private String name; 

        private Builder() {
        } 

        private Builder(SidecarContainerConfig model) {
            this.acrInstanceId = model.acrInstanceId;
            this.command = model.command;
            this.commandArgs = model.commandArgs;
            this.configMapMountDesc = model.configMapMountDesc;
            this.cpu = model.cpu;
            this.emptyDirDesc = model.emptyDirDesc;
            this.envs = model.envs;
            this.imageUrl = model.imageUrl;
            this.memory = model.memory;
            this.name = model.name;
        } 

        /**
         * AcrInstanceId.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
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
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * EmptyDirDesc.
         */
        public Builder emptyDirDesc(String emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
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
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public SidecarContainerConfig build() {
            return new SidecarContainerConfig(this);
        } 

    } 

}
