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
 * {@link CreateTemplateCopyAction} extends {@link TeaModel}
 *
 * <p>CreateTemplateCopyAction</p>
 */
public class CreateTemplateCopyAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private CreateTemplateRegistryConfig registryConfig;

    @com.aliyun.core.annotation.NameInMap("registryType")
    private String registryType;

    private CreateTemplateCopyAction(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.enabled = builder.enabled;
        this.image = builder.image;
        this.registryConfig = builder.registryConfig;
        this.registryType = builder.registryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateCopyAction create() {
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
    public CreateTemplateRegistryConfig getRegistryConfig() {
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
        private CreateTemplateRegistryConfig registryConfig; 
        private String registryType; 

        private Builder() {
        } 

        private Builder(CreateTemplateCopyAction model) {
            this.acrInstanceId = model.acrInstanceId;
            this.enabled = model.enabled;
            this.image = model.image;
            this.registryConfig = model.registryConfig;
            this.registryType = model.registryType;
        } 

        /**
         * acrInstanceId.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
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
         * registryConfig.
         */
        public Builder registryConfig(CreateTemplateRegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        /**
         * registryType.
         */
        public Builder registryType(String registryType) {
            this.registryType = registryType;
            return this;
        }

        public CreateTemplateCopyAction build() {
            return new CreateTemplateCopyAction(this);
        } 

    } 

}
