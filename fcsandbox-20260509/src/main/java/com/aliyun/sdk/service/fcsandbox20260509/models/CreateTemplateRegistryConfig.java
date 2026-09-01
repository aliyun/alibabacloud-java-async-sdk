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
 * {@link CreateTemplateRegistryConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateRegistryConfig</p>
 */
public class CreateTemplateRegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private CreateTemplateRegistryAuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CreateTemplateRegistryCertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private CreateTemplateRegistryNetworkConfig networkConfig;

    private CreateTemplateRegistryConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
        this.networkConfig = builder.networkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRegistryConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public CreateTemplateRegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return certConfig
     */
    public CreateTemplateRegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return networkConfig
     */
    public CreateTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public static final class Builder {
        private CreateTemplateRegistryAuthConfig authConfig; 
        private CreateTemplateRegistryCertConfig certConfig; 
        private CreateTemplateRegistryNetworkConfig networkConfig; 

        private Builder() {
        } 

        private Builder(CreateTemplateRegistryConfig model) {
            this.authConfig = model.authConfig;
            this.certConfig = model.certConfig;
            this.networkConfig = model.networkConfig;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(CreateTemplateRegistryAuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(CreateTemplateRegistryCertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * networkConfig.
         */
        public Builder networkConfig(CreateTemplateRegistryNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public CreateTemplateRegistryConfig build() {
            return new CreateTemplateRegistryConfig(this);
        } 

    } 

}
