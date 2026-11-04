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
 * {@link PublicUpdateTemplateSandboxConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateSandboxConfig</p>
 */
public class PublicUpdateTemplateSandboxConfig extends TeaModel {
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
    private PublicUpdateTemplateRegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("registryType")
    private String registryType;

    @com.aliyun.core.annotation.NameInMap("startCommand")
    private String startCommand;

    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<PublicUpdateTemplateStep> steps;

    private PublicUpdateTemplateSandboxConfig(Builder builder) {
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

    public static PublicUpdateTemplateSandboxConfig create() {
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
    public PublicUpdateTemplateRegistryConfig getRegistryConfig() {
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
    public java.util.List<PublicUpdateTemplateStep> getSteps() {
        return this.steps;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private Integer generation; 
        private String image; 
        private String osType; 
        private String readyCommand; 
        private PublicUpdateTemplateRegistryConfig registryConfig; 
        private String registryType; 
        private String startCommand; 
        private java.util.List<PublicUpdateTemplateStep> steps; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateSandboxConfig model) {
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
         * <p>The ID of the ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-abc123</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The sandbox generation. Valid values: 1: rund. 2: micro.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder generation(Integer generation) {
            this.generation = generation;
            return this;
        }

        /**
         * <p>The image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/my/ns:v1</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * <p>The readiness probe command for the micro sandbox. This command is supported only by the second generation.</p>
         * 
         * <strong>example:</strong>
         * <p>/ready</p>
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * <p>The image repository configuration.</p>
         */
        public Builder registryConfig(PublicUpdateTemplateRegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * <p>The image repository type.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        public Builder registryType(String registryType) {
            this.registryType = registryType;
            return this;
        }

        /**
         * <p>The startup command for the micro sandbox. This command is supported only by the second generation.</p>
         * 
         * <strong>example:</strong>
         * <p>/start-coroutines.sh</p>
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        /**
         * <p>The list of custom build steps. If you do not specify this parameter, the original steps are retained. If you pass an empty array, the steps are cleared.</p>
         */
        public Builder steps(java.util.List<PublicUpdateTemplateStep> steps) {
            this.steps = steps;
            return this;
        }

        public PublicUpdateTemplateSandboxConfig build() {
            return new PublicUpdateTemplateSandboxConfig(this);
        } 

    } 

}
