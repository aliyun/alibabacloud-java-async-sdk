// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link WafSiteSettings} extends {@link TeaModel}
 *
 * <p>WafSiteSettings</p>
 */
public class WafSiteSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddBotProtectionHeaders")
    private AddBotProtectionHeaders addBotProtectionHeaders;

    @com.aliyun.core.annotation.NameInMap("AddSecurityHeaders")
    private AddSecurityHeaders addSecurityHeaders;

    @com.aliyun.core.annotation.NameInMap("BotManagement")
    private BotManagement botManagement;

    @com.aliyun.core.annotation.NameInMap("ClientIpIdentifier")
    private ClientIpIdentifier clientIpIdentifier;

    @com.aliyun.core.annotation.NameInMap("SecurityLevel")
    private SecurityLevel securityLevel;

    private WafSiteSettings(Builder builder) {
        this.addBotProtectionHeaders = builder.addBotProtectionHeaders;
        this.addSecurityHeaders = builder.addSecurityHeaders;
        this.botManagement = builder.botManagement;
        this.clientIpIdentifier = builder.clientIpIdentifier;
        this.securityLevel = builder.securityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafSiteSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return botManagement
     */
    public BotManagement getBotManagement() {
        return this.botManagement;
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
        private BotManagement botManagement; 
        private ClientIpIdentifier clientIpIdentifier; 
        private SecurityLevel securityLevel; 

        private Builder() {
        } 

        private Builder(WafSiteSettings model) {
            this.addBotProtectionHeaders = model.addBotProtectionHeaders;
            this.addSecurityHeaders = model.addSecurityHeaders;
            this.botManagement = model.botManagement;
            this.clientIpIdentifier = model.clientIpIdentifier;
            this.securityLevel = model.securityLevel;
        } 

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
         * BotManagement.
         */
        public Builder botManagement(BotManagement botManagement) {
            this.botManagement = botManagement;
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

            private Builder() {
            } 

            private Builder(AddBotProtectionHeaders model) {
                this.enable = model.enable;
            } 

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

            private Builder() {
            } 

            private Builder(AddSecurityHeaders model) {
                this.enable = model.enable;
            } 

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
    public static class DefiniteBots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private DefiniteBots(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefiniteBots create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String action; 
            private Long id; 

            private Builder() {
            } 

            private Builder(DefiniteBots model) {
                this.action = model.action;
                this.id = model.id;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public DefiniteBots build() {
                return new DefiniteBots(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class EffectOnStatic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private EffectOnStatic(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectOnStatic create() {
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

            private Builder() {
            } 

            private Builder(EffectOnStatic model) {
                this.enable = model.enable;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public EffectOnStatic build() {
                return new EffectOnStatic(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class JSDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private JSDetection(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JSDetection create() {
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

            private Builder() {
            } 

            private Builder(JSDetection model) {
                this.enable = model.enable;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public JSDetection build() {
                return new JSDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class LikelyBots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private LikelyBots(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LikelyBots create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String action; 
            private Long id; 

            private Builder() {
            } 

            private Builder(LikelyBots model) {
                this.action = model.action;
                this.id = model.id;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public LikelyBots build() {
                return new LikelyBots(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class VerifiedBots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private VerifiedBots(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VerifiedBots create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String action; 
            private Long id; 

            private Builder() {
            } 

            private Builder(VerifiedBots model) {
                this.action = model.action;
                this.id = model.id;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public VerifiedBots build() {
                return new VerifiedBots(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class BotManagement extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefiniteBots")
        private DefiniteBots definiteBots;

        @com.aliyun.core.annotation.NameInMap("EffectOnStatic")
        private EffectOnStatic effectOnStatic;

        @com.aliyun.core.annotation.NameInMap("JSDetection")
        private JSDetection JSDetection;

        @com.aliyun.core.annotation.NameInMap("LikelyBots")
        private LikelyBots likelyBots;

        @com.aliyun.core.annotation.NameInMap("VerifiedBots")
        private VerifiedBots verifiedBots;

        private BotManagement(Builder builder) {
            this.definiteBots = builder.definiteBots;
            this.effectOnStatic = builder.effectOnStatic;
            this.JSDetection = builder.JSDetection;
            this.likelyBots = builder.likelyBots;
            this.verifiedBots = builder.verifiedBots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BotManagement create() {
            return builder().build();
        }

        /**
         * @return definiteBots
         */
        public DefiniteBots getDefiniteBots() {
            return this.definiteBots;
        }

        /**
         * @return effectOnStatic
         */
        public EffectOnStatic getEffectOnStatic() {
            return this.effectOnStatic;
        }

        /**
         * @return JSDetection
         */
        public JSDetection getJSDetection() {
            return this.JSDetection;
        }

        /**
         * @return likelyBots
         */
        public LikelyBots getLikelyBots() {
            return this.likelyBots;
        }

        /**
         * @return verifiedBots
         */
        public VerifiedBots getVerifiedBots() {
            return this.verifiedBots;
        }

        public static final class Builder {
            private DefiniteBots definiteBots; 
            private EffectOnStatic effectOnStatic; 
            private JSDetection JSDetection; 
            private LikelyBots likelyBots; 
            private VerifiedBots verifiedBots; 

            private Builder() {
            } 

            private Builder(BotManagement model) {
                this.definiteBots = model.definiteBots;
                this.effectOnStatic = model.effectOnStatic;
                this.JSDetection = model.JSDetection;
                this.likelyBots = model.likelyBots;
                this.verifiedBots = model.verifiedBots;
            } 

            /**
             * DefiniteBots.
             */
            public Builder definiteBots(DefiniteBots definiteBots) {
                this.definiteBots = definiteBots;
                return this;
            }

            /**
             * EffectOnStatic.
             */
            public Builder effectOnStatic(EffectOnStatic effectOnStatic) {
                this.effectOnStatic = effectOnStatic;
                return this;
            }

            /**
             * JSDetection.
             */
            public Builder JSDetection(JSDetection JSDetection) {
                this.JSDetection = JSDetection;
                return this;
            }

            /**
             * LikelyBots.
             */
            public Builder likelyBots(LikelyBots likelyBots) {
                this.likelyBots = likelyBots;
                return this;
            }

            /**
             * VerifiedBots.
             */
            public Builder verifiedBots(VerifiedBots verifiedBots) {
                this.verifiedBots = verifiedBots;
                return this;
            }

            public BotManagement build() {
                return new BotManagement(this);
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
        private java.util.List<String> headers;

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
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<String> headers; 
            private String mode; 

            private Builder() {
            } 

            private Builder(ClientIpIdentifier model) {
                this.headers = model.headers;
                this.mode = model.mode;
            } 

            /**
             * Headers.
             */
            public Builder headers(java.util.List<String> headers) {
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

            private Builder() {
            } 

            private Builder(SecurityLevel model) {
                this.value = model.value;
            } 

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
