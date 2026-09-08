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
 * {@link HiMarketApiKeyConfig} extends {@link TeaModel}
 *
 * <p>HiMarketApiKeyConfig</p>
 */
public class HiMarketApiKeyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentials")
    private java.util.List<Credentials> credentials;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private HiMarketApiKeyConfig(Builder builder) {
        this.credentials = builder.credentials;
        this.key = builder.key;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketApiKeyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentials
     */
    public java.util.List<Credentials> getCredentials() {
        return this.credentials;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private java.util.List<Credentials> credentials; 
        private String key; 
        private String source; 

        private Builder() {
        } 

        private Builder(HiMarketApiKeyConfig model) {
            this.credentials = model.credentials;
            this.key = model.key;
            this.source = model.source;
        } 

        /**
         * <p>The list of credentials.</p>
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The name of the location from which the API key is extracted.</p>
         * 
         * <strong>example:</strong>
         * <p>Apikey</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The source type of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public HiMarketApiKeyConfig build() {
            return new HiMarketApiKeyConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketApiKeyConfig} extends {@link TeaModel}
     *
     * <p>HiMarketApiKeyConfig</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        private Credentials(Builder builder) {
            this.apiKey = builder.apiKey;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String apiKey; 
            private String mode; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.apiKey = model.apiKey;
                this.mode = model.mode;
            } 

            /**
             * <p>The API key value.</p>
             * 
             * <strong>example:</strong>
             * <p>my-api-key-123</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The generation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
