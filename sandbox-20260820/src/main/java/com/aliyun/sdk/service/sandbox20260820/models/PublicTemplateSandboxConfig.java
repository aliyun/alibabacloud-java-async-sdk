// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicTemplateSandboxConfig} extends {@link TeaModel}
 *
 * <p>PublicTemplateSandboxConfig</p>
 */
public class PublicTemplateSandboxConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("generation")
    private Integer generation;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("osType")
    private String osType;

    @com.aliyun.core.annotation.NameInMap("readyCommand")
    private String readyCommand;

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private PublicTemplateRegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("startCommand")
    private String startCommand;

    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<PublicTemplateStep> steps;

    private PublicTemplateSandboxConfig(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.generation = builder.generation;
        this.image = builder.image;
        this.osType = builder.osType;
        this.readyCommand = builder.readyCommand;
        this.registryConfig = builder.registryConfig;
        this.startCommand = builder.startCommand;
        this.steps = builder.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateSandboxConfig create() {
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
     * @return generation
     */
    public Integer getGeneration() {
        return this.generation;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return readyCommand
     */
    public String getReadyCommand() {
        return this.readyCommand;
    }

    /**
     * @return registryConfig
     */
    public PublicTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    /**
     * @return startCommand
     */
    public String getStartCommand() {
        return this.startCommand;
    }

    /**
     * @return steps
     */
    public java.util.List<PublicTemplateStep> getSteps() {
        return this.steps;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private Integer generation; 
        private String image; 
        private String osType; 
        private String readyCommand; 
        private PublicTemplateRegistryConfig registryConfig; 
        private String startCommand; 
        private java.util.List<PublicTemplateStep> steps; 

        private Builder() {
        } 

        private Builder(PublicTemplateSandboxConfig model) {
            this.acrInstanceId = model.acrInstanceId;
            this.generation = model.generation;
            this.image = model.image;
            this.osType = model.osType;
            this.readyCommand = model.readyCommand;
            this.registryConfig = model.registryConfig;
            this.startCommand = model.startCommand;
            this.steps = model.steps;
        } 

        /**
         * <p>The ID of the Container Registry Enterprise instance. This parameter is required when registryType is set to acree.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-****</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The sandbox generation. Valid values: 1 (first generation) and 2 (second generation). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder generation(Integer generation) {
            this.generation = generation;
            return this;
        }

        /**
         * <p>The address of the sandbox base image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The operating system type of the second-generation sandbox. Valid values: linux-amd64, android-36-osworld, and windows-osworld.</p>
         * 
         * <strong>example:</strong>
         * <p>linux-amd64</p>
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * <p>The readiness probe command for the sandbox. A successful execution indicates that the sandbox is ready to receive requests. This parameter is supported only by first-generation sandboxes.</p>
         * 
         * <strong>example:</strong>
         * <p>curl -sf <a href="http://127.0.0.1:49983/health">http://127.0.0.1:49983/health</a></p>
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * <p>The configuration used to access the image repository. For security reasons, only the network configuration is returned in query responses, and logon credentials are not returned.</p>
         */
        public Builder registryConfig(PublicTemplateRegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * <p>The startup command for the sandbox container. This parameter is supported only by first-generation sandboxes.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin/start.sh</p>
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        /**
         * <p>The list of custom build steps.</p>
         */
        public Builder steps(java.util.List<PublicTemplateStep> steps) {
            this.steps = steps;
            return this;
        }

        public PublicTemplateSandboxConfig build() {
            return new PublicTemplateSandboxConfig(this);
        } 

    } 

}
