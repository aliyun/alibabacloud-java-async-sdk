// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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

    private PublicTemplateSandboxConfig(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.generation = builder.generation;
        this.image = builder.image;
        this.osType = builder.osType;
        this.readyCommand = builder.readyCommand;
        this.registryConfig = builder.registryConfig;
        this.startCommand = builder.startCommand;
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

    public static final class Builder {
        private String acrInstanceId; 
        private Integer generation; 
        private String image; 
        private String osType; 
        private String readyCommand; 
        private PublicTemplateRegistryConfig registryConfig; 
        private String startCommand; 

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
        } 

        /**
         * <p>The ACR Enterprise instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-abcd1234efgh</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The sandbox generation. A value of 1 indicates the first-generation sandbox. A value of 2 indicates the second-generation sandbox.</p>
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
         * <p>registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
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
         * <p>The sandbox readiness probe command.</p>
         * 
         * <strong>example:</strong>
         * <p>curl -sf <a href="http://127.0.0.1:8080/healthz">http://127.0.0.1:8080/healthz</a></p>
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * <p>The image repository configuration.</p>
         */
        public Builder registryConfig(PublicTemplateRegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * <p>The sandbox startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>sleep infinity</p>
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        public PublicTemplateSandboxConfig build() {
            return new PublicTemplateSandboxConfig(this);
        } 

    } 

}
