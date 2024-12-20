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
 * {@link RegistryConfig} extends {@link TeaModel}
 *
 * <p>RegistryConfig</p>
 */
public class RegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private RegistryAuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private RegistryCertConfig certConfig;

    private RegistryConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
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

    public static final class Builder {
        private RegistryAuthConfig authConfig; 
        private RegistryCertConfig certConfig; 

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

        public RegistryConfig build() {
            return new RegistryConfig(this);
        } 

    } 

}
