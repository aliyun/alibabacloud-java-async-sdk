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
 * {@link ApiKeyIdentityConfig} extends {@link TeaModel}
 *
 * <p>ApiKeyIdentityConfig</p>
 */
public class ApiKeyIdentityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apikeySource")
    private ApikeySource apikeySource;

    @com.aliyun.core.annotation.NameInMap("apikeySources")
    private java.util.List<ApikeySources> apikeySources;

    @com.aliyun.core.annotation.NameInMap("credentials")
    private java.util.List<Credentials> credentials;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ApiKeyIdentityConfig(Builder builder) {
        this.apikeySource = builder.apikeySource;
        this.apikeySources = builder.apikeySources;
        this.credentials = builder.credentials;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKeyIdentityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apikeySource
     */
    public ApikeySource getApikeySource() {
        return this.apikeySource;
    }

    /**
     * @return apikeySources
     */
    public java.util.List<ApikeySources> getApikeySources() {
        return this.apikeySources;
    }

    /**
     * @return credentials
     */
    public java.util.List<Credentials> getCredentials() {
        return this.credentials;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private ApikeySource apikeySource; 
        private java.util.List<ApikeySources> apikeySources; 
        private java.util.List<Credentials> credentials; 
        private String type; 

        private Builder() {
        } 

        private Builder(ApiKeyIdentityConfig model) {
            this.apikeySource = model.apikeySource;
            this.apikeySources = model.apikeySources;
            this.credentials = model.credentials;
            this.type = model.type;
        } 

        /**
         * <p>The API key source configuration.</p>
         */
        public Builder apikeySource(ApikeySource apikeySource) {
            this.apikeySource = apikeySource;
            return this;
        }

        /**
         * <p>The complete set of API key credential sources. The set contains one to three items. Multiple sources are applicable only to the AI gateway Header mode. Query String and non-AI gateway allow only a single source. If submitted together with apikeySource, the latter must be consistent with the compatible projection.</p>
         */
        public Builder apikeySources(java.util.List<ApikeySources> apikeySources) {
            this.apikeySources = apikeySources;
            return this;
        }

        /**
         * <p>The list of credentials.</p>
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>Apikey</p>
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

            private Builder() {
            } 

            private Builder(ApikeySource model) {
                this.source = model.source;
                this.value = model.value;
            } 

            /**
             * <p>The API key source.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The API key value.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
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
    /**
     * 
     * {@link ApiKeyIdentityConfig} extends {@link TeaModel}
     *
     * <p>ApiKeyIdentityConfig</p>
     */
    public static class ApikeySources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ApikeySources(Builder builder) {
            this.source = builder.source;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApikeySources create() {
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

            private Builder() {
            } 

            private Builder(ApikeySources model) {
                this.source = model.source;
                this.value = model.value;
            } 

            /**
             * <p>The credential source type.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The field name of the HTTP header or query string.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorization</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ApikeySources build() {
                return new ApikeySources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiKeyIdentityConfig} extends {@link TeaModel}
     *
     * <p>ApiKeyIdentityConfig</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apikey")
        private String apikey;

        @com.aliyun.core.annotation.NameInMap("generateMode")
        private String generateMode;

        private Credentials(Builder builder) {
            this.apikey = builder.apikey;
            this.generateMode = builder.generateMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return apikey
         */
        public String getApikey() {
            return this.apikey;
        }

        /**
         * @return generateMode
         */
        public String getGenerateMode() {
            return this.generateMode;
        }

        public static final class Builder {
            private String apikey; 
            private String generateMode; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.apikey = model.apikey;
                this.generateMode = model.generateMode;
            } 

            /**
             * <p>The API key configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder apikey(String apikey) {
                this.apikey = apikey;
                return this;
            }

            /**
             * <p>The generation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder generateMode(String generateMode) {
                this.generateMode = generateMode;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
