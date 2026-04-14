// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ContainerConfiguration} extends {@link TeaModel}
 *
 * <p>ContainerConfiguration</p>
 */
public class ContainerConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("imageRegistryType")
    private String imageRegistryType;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private RegistryConfig registryConfig;

    private ContainerConfiguration(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.command = builder.command;
        this.image = builder.image;
        this.imageRegistryType = builder.imageRegistryType;
        this.port = builder.port;
        this.registryConfig = builder.registryConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerConfiguration create() {
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
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imageRegistryType
     */
    public String getImageRegistryType() {
        return this.imageRegistryType;
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

    public static final class Builder {
        private String acrInstanceId; 
        private java.util.List<String> command; 
        private String image; 
        private String imageRegistryType; 
        private Integer port; 
        private RegistryConfig registryConfig; 

        private Builder() {
        } 

        private Builder(ContainerConfiguration model) {
            this.acrInstanceId = model.acrInstanceId;
            this.command = model.command;
            this.image = model.image;
            this.imageRegistryType = model.imageRegistryType;
            this.port = model.port;
            this.registryConfig = model.registryConfig;
        } 

        /**
         * <p>阿里云容器镜像服务（ACR）的实例ID或名称</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxx</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>在容器中运行的命令（例如：[&quot;python3&quot;, &quot;app.py&quot;]）</p>
         * 
         * <strong>example:</strong>
         * <p>python3,app.py</p>
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
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
         * <p>容器镜像的来源类型，支持ACR（阿里云容器镜像服务）、ACREE（阿里云容器镜像服务企业版）、CUSTOM（自定义镜像仓库）</p>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        public Builder imageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
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
         * <p>自定义镜像仓库的配置信息，当imageRegistryType为CUSTOM时使用</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder registryConfig(RegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        public ContainerConfiguration build() {
            return new ContainerConfiguration(this);
        } 

    } 

}
