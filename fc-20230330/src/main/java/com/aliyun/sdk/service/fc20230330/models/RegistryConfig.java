// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegistryConfig} extends {@link TeaModel}
 *
 * <p>RegistryConfig</p>
 */
public class RegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private RegistryAuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private RegistryCertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private RegistryNetworkConfig networkConfig;

    private RegistryConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
        this.networkConfig = builder.networkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistryConfig create() {
        return builder().build();
    }

    /**
     * @return authConfig
     */
    public RegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return certConfig
     */
    public RegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return networkConfig
     */
    public RegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public static final class Builder {
        private RegistryAuthConfig authConfig; 
        private RegistryCertConfig certConfig; 
        private RegistryNetworkConfig networkConfig; 

        /**
         * authConfig.
         */
        public Builder authConfig(RegistryAuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(RegistryCertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * networkConfig.
         */
        public Builder networkConfig(RegistryNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public RegistryConfig build() {
            return new RegistryConfig(this);
        } 

    } 

}
