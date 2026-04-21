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
         * credentials.
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * source.
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
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * mode.
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
