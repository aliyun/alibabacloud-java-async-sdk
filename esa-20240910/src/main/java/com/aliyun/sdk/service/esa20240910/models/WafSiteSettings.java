// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WafSiteSettings} extends {@link TeaModel}
 *
 * <p>WafSiteSettings</p>
 */
public class WafSiteSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddBotProtectionHeaders")
    private AddBotProtectionHeaders addBotProtectionHeaders;

    @com.aliyun.core.annotation.NameInMap("AddSecurityHeaders")
    private AddSecurityHeaders addSecurityHeaders;

    @com.aliyun.core.annotation.NameInMap("ClientIpIdentifier")
    private ClientIpIdentifier clientIpIdentifier;

    @com.aliyun.core.annotation.NameInMap("SecurityLevel")
    private SecurityLevel securityLevel;

    private WafSiteSettings(Builder builder) {
        this.addBotProtectionHeaders = builder.addBotProtectionHeaders;
        this.addSecurityHeaders = builder.addSecurityHeaders;
        this.clientIpIdentifier = builder.clientIpIdentifier;
        this.securityLevel = builder.securityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafSiteSettings create() {
        return builder().build();
    }

    /**
     * @return addBotProtectionHeaders
     */
    public AddBotProtectionHeaders getAddBotProtectionHeaders() {
        return this.addBotProtectionHeaders;
    }

    /**
     * @return addSecurityHeaders
     */
    public AddSecurityHeaders getAddSecurityHeaders() {
        return this.addSecurityHeaders;
    }

    /**
     * @return clientIpIdentifier
     */
    public ClientIpIdentifier getClientIpIdentifier() {
        return this.clientIpIdentifier;
    }

    /**
     * @return securityLevel
     */
    public SecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public static final class Builder {
        private AddBotProtectionHeaders addBotProtectionHeaders; 
        private AddSecurityHeaders addSecurityHeaders; 
        private ClientIpIdentifier clientIpIdentifier; 
        private SecurityLevel securityLevel; 

        /**
         * AddBotProtectionHeaders.
         */
        public Builder addBotProtectionHeaders(AddBotProtectionHeaders addBotProtectionHeaders) {
            this.addBotProtectionHeaders = addBotProtectionHeaders;
            return this;
        }

        /**
         * AddSecurityHeaders.
         */
        public Builder addSecurityHeaders(AddSecurityHeaders addSecurityHeaders) {
            this.addSecurityHeaders = addSecurityHeaders;
            return this;
        }

        /**
         * ClientIpIdentifier.
         */
        public Builder clientIpIdentifier(ClientIpIdentifier clientIpIdentifier) {
            this.clientIpIdentifier = clientIpIdentifier;
            return this;
        }

        /**
         * SecurityLevel.
         */
        public Builder securityLevel(SecurityLevel securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public WafSiteSettings build() {
            return new WafSiteSettings(this);
        } 

    } 

    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class AddBotProtectionHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private AddBotProtectionHeaders(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddBotProtectionHeaders create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AddBotProtectionHeaders build() {
                return new AddBotProtectionHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class AddSecurityHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private AddSecurityHeaders(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddSecurityHeaders create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AddSecurityHeaders build() {
                return new AddSecurityHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class ClientIpIdentifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List < String > headers;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private ClientIpIdentifier(Builder builder) {
            this.headers = builder.headers;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientIpIdentifier create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List < String > getHeaders() {
            return this.headers;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List < String > headers; 
            private String mode; 

            /**
             * Headers.
             */
            public Builder headers(java.util.List < String > headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public ClientIpIdentifier build() {
                return new ClientIpIdentifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class SecurityLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SecurityLevel(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityLevel create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityLevel build() {
                return new SecurityLevel(this);
            } 

        } 

    }
}
