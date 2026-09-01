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
 * {@link PublicTemplateRegistryConfig} extends {@link TeaModel}
 *
 * <p>PublicTemplateRegistryConfig</p>
 */
public class PublicTemplateRegistryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private PublicTemplateRegistryNetworkConfig networkConfig;

    private PublicTemplateRegistryConfig(Builder builder) {
        this.networkConfig = builder.networkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateRegistryConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkConfig
     */
    public PublicTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public static final class Builder {
        private PublicTemplateRegistryNetworkConfig networkConfig; 

        private Builder() {
        } 

        private Builder(PublicTemplateRegistryConfig model) {
            this.networkConfig = model.networkConfig;
        } 

        /**
         * networkConfig.
         */
        public Builder networkConfig(PublicTemplateRegistryNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public PublicTemplateRegistryConfig build() {
            return new PublicTemplateRegistryConfig(this);
        } 

    } 

}
