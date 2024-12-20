// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ImageRegistryConfig} extends {@link TeaModel}
 *
 * <p>ImageRegistryConfig</p>
 */
public class ImageRegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthConfig")
    private RegistryAuthenticationConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("CertConfig")
    private RegistryCertificateConfig certConfig;

    private ImageRegistryConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRegistryConfig create() {
        return builder().build();
    }

    /**
     * @return authConfig
     */
    public RegistryAuthenticationConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return certConfig
     */
    public RegistryCertificateConfig getCertConfig() {
        return this.certConfig;
    }

    public static final class Builder {
        private RegistryAuthenticationConfig authConfig; 
        private RegistryCertificateConfig certConfig; 

        /**
         * AuthConfig.
         */
        public Builder authConfig(RegistryAuthenticationConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * CertConfig.
         */
        public Builder certConfig(RegistryCertificateConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        public ImageRegistryConfig build() {
            return new ImageRegistryConfig(this);
        } 

    } 

}
