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

    @com.aliyun.core.annotation.NameInMap("BandwidthAbuseProtection")
    private BandwidthAbuseProtection bandwidthAbuseProtection;

    @com.aliyun.core.annotation.NameInMap("BotManagement")
    private BotManagement botManagement;

    @com.aliyun.core.annotation.NameInMap("ClientIpIdentifier")
    private ClientIpIdentifier clientIpIdentifier;

    @com.aliyun.core.annotation.NameInMap("DisableSecurityModule")
    private DisableSecurityModule disableSecurityModule;

    @com.aliyun.core.annotation.NameInMap("RequestBodyInspection")
    private RequestBodyInspection requestBodyInspection;

    @com.aliyun.core.annotation.NameInMap("SecurityLevel")
    private SecurityLevel securityLevel;

    private WafSiteSettings(Builder builder) {
        this.addBotProtectionHeaders = builder.addBotProtectionHeaders;
        this.addSecurityHeaders = builder.addSecurityHeaders;
        this.bandwidthAbuseProtection = builder.bandwidthAbuseProtection;
        this.botManagement = builder.botManagement;
        this.clientIpIdentifier = builder.clientIpIdentifier;
        this.disableSecurityModule = builder.disableSecurityModule;
        this.requestBodyInspection = builder.requestBodyInspection;
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
     * @return bandwidthAbuseProtection
     */
    public BandwidthAbuseProtection getBandwidthAbuseProtection() {
        return this.bandwidthAbuseProtection;
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
     * @return disableSecurityModule
     */
    public DisableSecurityModule getDisableSecurityModule() {
        return this.disableSecurityModule;
    }

    /**
     * @return requestBodyInspection
     */
    public RequestBodyInspection getRequestBodyInspection() {
        return this.requestBodyInspection;
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
        private BandwidthAbuseProtection bandwidthAbuseProtection; 
        private BotManagement botManagement; 
        private ClientIpIdentifier clientIpIdentifier; 
        private DisableSecurityModule disableSecurityModule; 
        private RequestBodyInspection requestBodyInspection; 
        private SecurityLevel securityLevel; 

        private Builder() {
        } 

        private Builder(WafSiteSettings model) {
            this.addBotProtectionHeaders = model.addBotProtectionHeaders;
            this.addSecurityHeaders = model.addSecurityHeaders;
            this.bandwidthAbuseProtection = model.bandwidthAbuseProtection;
            this.botManagement = model.botManagement;
            this.clientIpIdentifier = model.clientIpIdentifier;
            this.disableSecurityModule = model.disableSecurityModule;
            this.requestBodyInspection = model.requestBodyInspection;
            this.securityLevel = model.securityLevel;
        } 

        /**
         * <p>The bot protection headers.</p>
         */
        public Builder addBotProtectionHeaders(AddBotProtectionHeaders addBotProtectionHeaders) {
            this.addBotProtectionHeaders = addBotProtectionHeaders;
            return this;
        }

        /**
         * <p>The security headers.</p>
         */
        public Builder addSecurityHeaders(AddSecurityHeaders addSecurityHeaders) {
            this.addSecurityHeaders = addSecurityHeaders;
            return this;
        }

        /**
         * <p>The bandwidth abuse protection.</p>
         */
        public Builder bandwidthAbuseProtection(BandwidthAbuseProtection bandwidthAbuseProtection) {
            this.bandwidthAbuseProtection = bandwidthAbuseProtection;
            return this;
        }

        /**
         * <p>The bot management.</p>
         */
        public Builder botManagement(BotManagement botManagement) {
            this.botManagement = botManagement;
            return this;
        }

        /**
         * <p>The client IP identification.</p>
         */
        public Builder clientIpIdentifier(ClientIpIdentifier clientIpIdentifier) {
            this.clientIpIdentifier = clientIpIdentifier;
            return this;
        }

        /**
         * <p>The disable security module configuration.</p>
         */
        public Builder disableSecurityModule(DisableSecurityModule disableSecurityModule) {
            this.disableSecurityModule = disableSecurityModule;
            return this;
        }

        /**
         * <p>The request body inspection configuration. Controls the deep packet inspection behavior of WAF for HTTP request bodies. After this feature is enabled, content-based matching rules such as SQL injection and XSS detection take effect on request bodies.</p>
         * <p>This configuration can contain the following fields:</p>
         * <ul>
         * <li><code>Id</code>: The unique identifier of the built-in inspection rule.</li>
         * <li><code>SizeLimit</code>: The maximum size of the request body to inspect.</li>
         * <li><code>Action</code>: The action to take when the request body exceeds the size limit.</li>
         * </ul>
         */
        public Builder requestBodyInspection(RequestBodyInspection requestBodyInspection) {
            this.requestBodyInspection = requestBodyInspection;
            return this;
        }

        /**
         * <p>The security level.</p>
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
             * <p>The switch.</p>
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
             * <p>The switch.</p>
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
    public static class BandwidthAbuseProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BandwidthAbuseProtection(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthAbuseProtection create() {
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private Long id; 
            private String status; 

            private Builder() {
            } 

            private Builder(BandwidthAbuseProtection model) {
                this.action = model.action;
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * <p>The action of the bandwidth abuse protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The ID of the bandwidth abuse protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The switch status of the bandwidth abuse protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BandwidthAbuseProtection build() {
                return new BandwidthAbuseProtection(this);
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
             * <p>The action.</p>
             * 
             * <strong>example:</strong>
             * <p>captcha</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20000001</p>
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
             * <p>The switch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The switch.</p>
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
             * <p>The action.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20000002</p>
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
             * <p>The action.</p>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20000003</p>
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
             * <p>The definite bots.</p>
             */
            public Builder definiteBots(DefiniteBots definiteBots) {
                this.definiteBots = definiteBots;
                return this;
            }

            /**
             * <p>Specifies whether the rule applies to static resource requests.</p>
             */
            public Builder effectOnStatic(EffectOnStatic effectOnStatic) {
                this.effectOnStatic = effectOnStatic;
                return this;
            }

            /**
             * <p>The JavaScript detection.</p>
             */
            public Builder JSDetection(JSDetection JSDetection) {
                this.JSDetection = JSDetection;
                return this;
            }

            /**
             * <p>The likely bots.</p>
             */
            public Builder likelyBots(LikelyBots likelyBots) {
                this.likelyBots = likelyBots;
                return this;
            }

            /**
             * <p>The verified bots.</p>
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
             * <p>The specified headers.</p>
             */
            public Builder headers(java.util.List<String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The identification mode.</p>
             * 
             * <strong>example:</strong>
             * <p>headers</p>
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
    public static class DisableSecurityModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DisableSecurityModule(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisableSecurityModule create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            private Builder() {
            } 

            private Builder(DisableSecurityModule model) {
                this.status = model.status;
            } 

            /**
             * <p>The status switch for disabling the security module.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DisableSecurityModule build() {
                return new DisableSecurityModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafSiteSettings} extends {@link TeaModel}
     *
     * <p>WafSiteSettings</p>
     */
    public static class RequestBodyInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private String sizeLimit;

        private RequestBodyInspection(Builder builder) {
            this.action = builder.action;
            this.id = builder.id;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestBodyInspection create() {
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

        /**
         * @return sizeLimit
         */
        public String getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private String action; 
            private Long id; 
            private String sizeLimit; 

            private Builder() {
            } 

            private Builder(RequestBodyInspection model) {
                this.action = model.action;
                this.id = model.id;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * <p>The action to take when the request body size exceeds <code>SizeLimit</code>.</p>
             * <p>Common values (the complete enumeration is subject to the server-side configuration):</p>
             * <ul>
             * <li><code>allow</code>: Allow directly without performing deep packet inspection on the excess portion.</li>
             * </ul>
             * <blockquote>
             * <p>The complete enum is subject to the WAF server-side configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The request body inspection rule ID (unique identifier of the built-in rule). When request body inspection is enabled, the server uses this ID to associate the matching logic of the built-in inspection rule. The ID value is subject to the WAF built-in rule list.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum size of the request body to inspect, in bytes.</p>
             * <ul>
             * <li>When the request body is less than or equal to this value, the entire content is subject to WAF matching.</li>
             * <li>When the request body exceeds this value, the action specified in the <code>Action</code> field is taken (for example, inspect only the first N bytes, reject, or allow directly).</li>
             * </ul>
             * <blockquote>
             * <p>The specific value range and default value are subject to the WAF server-side configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16KB</p>
             */
            public Builder sizeLimit(String sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public RequestBodyInspection build() {
                return new RequestBodyInspection(this);
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
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SecurityLevel(Builder builder) {
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityLevel create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long id; 
            private String value; 

            private Builder() {
            } 

            private Builder(SecurityLevel model) {
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * <p>The request body inspection rule ID (unique identifier of the built-in rule). When request body inspection is enabled, the server uses this ID to associate the matching logic of the built-in inspection rule. The ID value is subject to the WAF built-in rule list.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The security level value.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
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
