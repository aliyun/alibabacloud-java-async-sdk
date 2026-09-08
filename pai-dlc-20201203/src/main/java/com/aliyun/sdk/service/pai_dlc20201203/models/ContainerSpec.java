// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ContainerSpec} extends {@link TeaModel}
 *
 * <p>ContainerSpec</p>
 */
public class ContainerSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("Command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("Env")
    private java.util.List<EnvVar> env;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private ResourceRequirements resources;

    @com.aliyun.core.annotation.NameInMap("SecurityContext")
    private SecurityContext securityContext;

    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    private ContainerSpec(Builder builder) {
        this.args = builder.args;
        this.command = builder.command;
        this.env = builder.env;
        this.image = builder.image;
        this.name = builder.name;
        this.resources = builder.resources;
        this.securityContext = builder.securityContext;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.List<String> getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return env
     */
    public java.util.List<EnvVar> getEnv() {
        return this.env;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resources
     */
    public ResourceRequirements getResources() {
        return this.resources;
    }

    /**
     * @return securityContext
     */
    public SecurityContext getSecurityContext() {
        return this.securityContext;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder {
        private java.util.List<String> args; 
        private java.util.List<String> command; 
        private java.util.List<EnvVar> env; 
        private String image; 
        private String name; 
        private ResourceRequirements resources; 
        private SecurityContext securityContext; 
        private String workingDir; 

        private Builder() {
        } 

        private Builder(ContainerSpec model) {
            this.args = model.args;
            this.command = model.command;
            this.env = model.env;
            this.image = model.image;
            this.name = model.name;
            this.resources = model.resources;
            this.securityContext = model.securityContext;
            this.workingDir = model.workingDir;
        } 

        /**
         * <p>The command parameters.</p>
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * <p>The user command.</p>
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         */
        public Builder env(java.util.List<EnvVar> env) {
            this.env = env;
            return this;
        }

        /**
         * <p>The container image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/pai-dlc/curl:v1.0.0</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>data-init</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The container resources.</p>
         */
        public Builder resources(ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        /**
         * SecurityContext.
         */
        public Builder securityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * <p>The working directory in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/root</p>
         */
        public Builder workingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public ContainerSpec build() {
            return new ContainerSpec(this);
        } 

    } 

}
