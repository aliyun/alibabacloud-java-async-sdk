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
 * {@link PublicUpdateTemplateRegistryConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateRegistryConfig</p>
 */
public class PublicUpdateTemplateRegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private PublicUpdateTemplateRegistryAuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private PublicUpdateTemplateRegistryCertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private PublicUpdateTemplateRegistryNetworkConfig networkConfig;

    private PublicUpdateTemplateRegistryConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
        this.networkConfig = builder.networkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateRegistryConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public PublicUpdateTemplateRegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return certConfig
     */
    public PublicUpdateTemplateRegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return networkConfig
     */
    public PublicUpdateTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public static final class Builder {
        private PublicUpdateTemplateRegistryAuthConfig authConfig; 
        private PublicUpdateTemplateRegistryCertConfig certConfig; 
        private PublicUpdateTemplateRegistryNetworkConfig networkConfig; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateRegistryConfig model) {
            this.authConfig = model.authConfig;
            this.certConfig = model.certConfig;
            this.networkConfig = model.networkConfig;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(PublicUpdateTemplateRegistryAuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(PublicUpdateTemplateRegistryCertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * networkConfig.
         */
        public Builder networkConfig(PublicUpdateTemplateRegistryNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public PublicUpdateTemplateRegistryConfig build() {
            return new PublicUpdateTemplateRegistryConfig(this);
        } 

    } 

}
