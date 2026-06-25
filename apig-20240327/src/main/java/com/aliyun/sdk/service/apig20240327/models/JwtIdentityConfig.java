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
 * {@link JwtIdentityConfig} extends {@link TeaModel}
 *
 * <p>JwtIdentityConfig</p>
 */
public class JwtIdentityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("claimsToHeadersConfigs")
    private java.util.List<ClaimsToHeadersConfigs> claimsToHeadersConfigs;

    @com.aliyun.core.annotation.NameInMap("jwks")
    private String jwks;

    @com.aliyun.core.annotation.NameInMap("jwtPayloadConfig")
    private JwtPayloadConfig jwtPayloadConfig;

    @com.aliyun.core.annotation.NameInMap("jwtTokenConfig")
    private JwtTokenConfig jwtTokenConfig;

    @com.aliyun.core.annotation.NameInMap("remoteJwks")
    private String remoteJwks;

    @com.aliyun.core.annotation.NameInMap("secretType")
    private String secretType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private JwtIdentityConfig(Builder builder) {
        this.claimsToHeadersConfigs = builder.claimsToHeadersConfigs;
        this.jwks = builder.jwks;
        this.jwtPayloadConfig = builder.jwtPayloadConfig;
        this.jwtTokenConfig = builder.jwtTokenConfig;
        this.remoteJwks = builder.remoteJwks;
        this.secretType = builder.secretType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JwtIdentityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return claimsToHeadersConfigs
     */
    public java.util.List<ClaimsToHeadersConfigs> getClaimsToHeadersConfigs() {
        return this.claimsToHeadersConfigs;
    }

    /**
     * @return jwks
     */
    public String getJwks() {
        return this.jwks;
    }

    /**
     * @return jwtPayloadConfig
     */
    public JwtPayloadConfig getJwtPayloadConfig() {
        return this.jwtPayloadConfig;
    }

    /**
     * @return jwtTokenConfig
     */
    public JwtTokenConfig getJwtTokenConfig() {
        return this.jwtTokenConfig;
    }

    /**
     * @return remoteJwks
     */
    public String getRemoteJwks() {
        return this.remoteJwks;
    }

    /**
     * @return secretType
     */
    public String getSecretType() {
        return this.secretType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<ClaimsToHeadersConfigs> claimsToHeadersConfigs; 
        private String jwks; 
        private JwtPayloadConfig jwtPayloadConfig; 
        private JwtTokenConfig jwtTokenConfig; 
        private String remoteJwks; 
        private String secretType; 
        private String type; 

        private Builder() {
        } 

        private Builder(JwtIdentityConfig model) {
            this.claimsToHeadersConfigs = model.claimsToHeadersConfigs;
            this.jwks = model.jwks;
            this.jwtPayloadConfig = model.jwtPayloadConfig;
            this.jwtTokenConfig = model.jwtTokenConfig;
            this.remoteJwks = model.remoteJwks;
            this.secretType = model.secretType;
            this.type = model.type;
        } 

        /**
         * claimsToHeadersConfigs.
         */
        public Builder claimsToHeadersConfigs(java.util.List<ClaimsToHeadersConfigs> claimsToHeadersConfigs) {
            this.claimsToHeadersConfigs = claimsToHeadersConfigs;
            return this;
        }

        /**
         * jwks.
         */
        public Builder jwks(String jwks) {
            this.jwks = jwks;
            return this;
        }

        /**
         * jwtPayloadConfig.
         */
        public Builder jwtPayloadConfig(JwtPayloadConfig jwtPayloadConfig) {
            this.jwtPayloadConfig = jwtPayloadConfig;
            return this;
        }

        /**
         * jwtTokenConfig.
         */
        public Builder jwtTokenConfig(JwtTokenConfig jwtTokenConfig) {
            this.jwtTokenConfig = jwtTokenConfig;
            return this;
        }

        /**
         * remoteJwks.
         */
        public Builder remoteJwks(String remoteJwks) {
            this.remoteJwks = remoteJwks;
            return this;
        }

        /**
         * secretType.
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public JwtIdentityConfig build() {
            return new JwtIdentityConfig(this);
        } 

    } 

    /**
     * 
     * {@link JwtIdentityConfig} extends {@link TeaModel}
     *
     * <p>JwtIdentityConfig</p>
     */
    public static class ClaimsToHeadersConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("claim")
        private String claim;

        @com.aliyun.core.annotation.NameInMap("header")
        private String header;

        @com.aliyun.core.annotation.NameInMap("override")
        private Boolean override;

        private ClaimsToHeadersConfigs(Builder builder) {
            this.claim = builder.claim;
            this.header = builder.header;
            this.override = builder.override;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClaimsToHeadersConfigs create() {
            return builder().build();
        }

        /**
         * @return claim
         */
        public String getClaim() {
            return this.claim;
        }

        /**
         * @return header
         */
        public String getHeader() {
            return this.header;
        }

        /**
         * @return override
         */
        public Boolean getOverride() {
            return this.override;
        }

        public static final class Builder {
            private String claim; 
            private String header; 
            private Boolean override; 

            private Builder() {
            } 

            private Builder(ClaimsToHeadersConfigs model) {
                this.claim = model.claim;
                this.header = model.header;
                this.override = model.override;
            } 

            /**
             * claim.
             */
            public Builder claim(String claim) {
                this.claim = claim;
                return this;
            }

            /**
             * header.
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * override.
             */
            public Builder override(Boolean override) {
                this.override = override;
                return this;
            }

            public ClaimsToHeadersConfigs build() {
                return new ClaimsToHeadersConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link JwtIdentityConfig} extends {@link TeaModel}
     *
     * <p>JwtIdentityConfig</p>
     */
    public static class JwtPayloadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("payloadKeyName")
        private String payloadKeyName;

        @com.aliyun.core.annotation.NameInMap("payloadKeyValue")
        private String payloadKeyValue;

        private JwtPayloadConfig(Builder builder) {
            this.payloadKeyName = builder.payloadKeyName;
            this.payloadKeyValue = builder.payloadKeyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JwtPayloadConfig create() {
            return builder().build();
        }

        /**
         * @return payloadKeyName
         */
        public String getPayloadKeyName() {
            return this.payloadKeyName;
        }

        /**
         * @return payloadKeyValue
         */
        public String getPayloadKeyValue() {
            return this.payloadKeyValue;
        }

        public static final class Builder {
            private String payloadKeyName; 
            private String payloadKeyValue; 

            private Builder() {
            } 

            private Builder(JwtPayloadConfig model) {
                this.payloadKeyName = model.payloadKeyName;
                this.payloadKeyValue = model.payloadKeyValue;
            } 

            /**
             * payloadKeyName.
             */
            public Builder payloadKeyName(String payloadKeyName) {
                this.payloadKeyName = payloadKeyName;
                return this;
            }

            /**
             * payloadKeyValue.
             */
            public Builder payloadKeyValue(String payloadKeyValue) {
                this.payloadKeyValue = payloadKeyValue;
                return this;
            }

            public JwtPayloadConfig build() {
                return new JwtPayloadConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link JwtIdentityConfig} extends {@link TeaModel}
     *
     * <p>JwtIdentityConfig</p>
     */
    public static class JwtTokenConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("pass")
        private Boolean pass;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        private JwtTokenConfig(Builder builder) {
            this.key = builder.key;
            this.pass = builder.pass;
            this.position = builder.position;
            this.prefix = builder.prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JwtTokenConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        public static final class Builder {
            private String key; 
            private Boolean pass; 
            private String position; 
            private String prefix; 

            private Builder() {
            } 

            private Builder(JwtTokenConfig model) {
                this.key = model.key;
                this.pass = model.pass;
                this.position = model.position;
                this.prefix = model.prefix;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            public JwtTokenConfig build() {
                return new JwtTokenConfig(this);
            } 

        } 

    }
}
