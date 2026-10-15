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
 * {@link CreateTemplateSandboxConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateSandboxConfig</p>
 */
public class CreateTemplateSandboxConfig extends TeaModel {
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
    private CreateTemplateRegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("registryType")
    private String registryType;

    @com.aliyun.core.annotation.NameInMap("startCommand")
    private String startCommand;

    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<CreateTemplateStep> steps;

    private CreateTemplateSandboxConfig(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.generation = builder.generation;
        this.image = builder.image;
        this.osType = builder.osType;
        this.readyCommand = builder.readyCommand;
        this.registryConfig = builder.registryConfig;
        this.registryType = builder.registryType;
        this.startCommand = builder.startCommand;
        this.steps = builder.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateSandboxConfig create() {
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
    public CreateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
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
    public java.util.List<CreateTemplateStep> getSteps() {
        return this.steps;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private Integer generation; 
        private String image; 
        private String osType; 
        private String readyCommand; 
        private CreateTemplateRegistryConfig registryConfig; 
        private String registryType; 
        private String startCommand; 
        private java.util.List<CreateTemplateStep> steps; 

        private Builder() {
        } 

        private Builder(CreateTemplateSandboxConfig model) {
            this.acrInstanceId = model.acrInstanceId;
            this.generation = model.generation;
            this.image = model.image;
            this.osType = model.osType;
            this.readyCommand = model.readyCommand;
            this.registryConfig = model.registryConfig;
            this.registryType = model.registryType;
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
         * <p>The sandbox readiness probe command. A successful execution indicates that the sandbox is ready to accept requests. This parameter is supported only for first-generation sandboxes.</p>
         * 
         * <strong>example:</strong>
         * <p>curl -sf <a href="http://127.0.0.1:49983/health">http://127.0.0.1:49983/health</a></p>
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * <p>The credential, TLS, and network configuration required to access the source image repository.</p>
         */
        public Builder registryConfig(CreateTemplateRegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * <p>The image repository type. Valid values: oci (standard OCI repository), acr (Container Registry Personal Edition), and acree (Container Registry Enterprise Edition). If not specified, the type is inferred from the image address.</p>
         * 
         * <strong>example:</strong>
         * <p>acree</p>
         */
        public Builder registryType(String registryType) {
            this.registryType = registryType;
            return this;
        }

        /**
         * <p>The startup command for the sandbox container. This parameter is supported only for first-generation sandboxes.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin/start.sh</p>
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        /**
         * <p>The list of custom build instructions. This is not supported in the current version. Passing a non-empty list returns an error.</p>
         */
        public Builder steps(java.util.List<CreateTemplateStep> steps) {
            this.steps = steps;
            return this;
        }

        public CreateTemplateSandboxConfig build() {
            return new CreateTemplateSandboxConfig(this);
        } 

    } 

}
