// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApiKeyIdentityConfig} extends {@link TeaModel}
 *
 * <p>ApiKeyIdentityConfig</p>
 */
public class ApiKeyIdentityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apikey")
    private String apikey;

    @com.aliyun.core.annotation.NameInMap("apikeySource")
    private ApikeySource apikeySource;

    @com.aliyun.core.annotation.NameInMap("generateMode")
    private String generateMode;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ApiKeyIdentityConfig(Builder builder) {
        this.apikey = builder.apikey;
        this.apikeySource = builder.apikeySource;
        this.generateMode = builder.generateMode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKeyIdentityConfig create() {
        return builder().build();
    }

    /**
     * @return apikey
     */
    public String getApikey() {
        return this.apikey;
    }

    /**
     * @return apikeySource
     */
    public ApikeySource getApikeySource() {
        return this.apikeySource;
    }

    /**
     * @return generateMode
     */
    public String getGenerateMode() {
        return this.generateMode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String apikey; 
        private ApikeySource apikeySource; 
        private String generateMode; 
        private String type; 

        /**
         * apikey.
         */
        public Builder apikey(String apikey) {
            this.apikey = apikey;
            return this;
        }

        /**
         * apikeySource.
         */
        public Builder apikeySource(ApikeySource apikeySource) {
            this.apikeySource = apikeySource;
            return this;
        }

        /**
         * generateMode.
         */
        public Builder generateMode(String generateMode) {
            this.generateMode = generateMode;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ApiKeyIdentityConfig build() {
            return new ApiKeyIdentityConfig(this);
        } 

    } 

    /**
     * 
     * {@link ApiKeyIdentityConfig} extends {@link TeaModel}
     *
     * <p>ApiKeyIdentityConfig</p>
     */
    public static class ApikeySource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ApikeySource(Builder builder) {
            this.source = builder.source;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApikeySource create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String source; 
            private String value; 

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ApikeySource build() {
                return new ApikeySource(this);
            } 

        } 

    }
}
