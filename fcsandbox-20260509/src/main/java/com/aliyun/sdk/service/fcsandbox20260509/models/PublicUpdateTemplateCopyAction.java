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
 * {@link PublicUpdateTemplateCopyAction} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateCopyAction</p>
 */
public class PublicUpdateTemplateCopyAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private PublicUpdateTemplateRegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("registryType")
    private String registryType;

    private PublicUpdateTemplateCopyAction(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.enabled = builder.enabled;
        this.image = builder.image;
        this.registryConfig = builder.registryConfig;
        this.registryType = builder.registryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateCopyAction create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
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

    public static final class Builder {
        private String acrInstanceId; 
        private Boolean enabled; 
        private String image; 
        private PublicUpdateTemplateRegistryConfig registryConfig; 
        private String registryType; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateCopyAction model) {
            this.acrInstanceId = model.acrInstanceId;
            this.enabled = model.enabled;
            this.image = model.image;
            this.registryConfig = model.registryConfig;
            this.registryType = model.registryType;
        } 

        /**
         * <p>The ID of the destination ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-abc123</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>Indicates whether image replication is enabled.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The destination image address for replication.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/my/ns:v2</p>
         */
        public Builder image(String image) {
            this.image = image;
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
         * <p>The destination repository type.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        public Builder registryType(String registryType) {
            this.registryType = registryType;
            return this;
        }

        public PublicUpdateTemplateCopyAction build() {
            return new PublicUpdateTemplateCopyAction(this);
        } 

    } 

}
