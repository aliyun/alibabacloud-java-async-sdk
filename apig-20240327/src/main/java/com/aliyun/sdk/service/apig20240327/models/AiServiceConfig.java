// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiServiceConfig} extends {@link TeaModel}
 *
 * <p>AiServiceConfig</p>
 */
public class AiServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<String> apiKeys;

    @com.aliyun.core.annotation.NameInMap("enableHealthCheck")
    private Boolean enableHealthCheck;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private AiServiceConfig(Builder builder) {
        this.address = builder.address;
        this.apiKeys = builder.apiKeys;
        this.enableHealthCheck = builder.enableHealthCheck;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiServiceConfig create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return apiKeys
     */
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return enableHealthCheck
     */
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private String address; 
        private java.util.List<String> apiKeys; 
        private Boolean enableHealthCheck; 
        private java.util.List<String> protocols; 
        private String provider; 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * apiKeys.
         */
        public Builder apiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * enableHealthCheck.
         */
        public Builder enableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        /**
         * protocols.
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public AiServiceConfig build() {
            return new AiServiceConfig(this);
        } 

    } 

}
