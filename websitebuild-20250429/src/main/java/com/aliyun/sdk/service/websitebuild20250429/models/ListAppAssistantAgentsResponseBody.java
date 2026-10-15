// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAppAssistantAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppAssistantAgentsResponseBody</p>
 */
public class ListAppAssistantAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppAssistantAgentsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppAssistantAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public java.util.List<Module> getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private java.util.List<Module> module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppAssistantAgentsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether a retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-b</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response element.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the value of the <strong>DtsJobId</strong> request parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAppAssistantAgentsResponseBody build() {
            return new ListAppAssistantAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppAssistantAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppAssistantAgentsResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiSecret")
        private String apiSecret;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, String> extra;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Credential(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiSecret = builder.apiSecret;
            this.extra = builder.extra;
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiSecret
         */
        public String getApiSecret() {
            return this.apiSecret;
        }

        /**
         * @return extra
         */
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String apiKey; 
            private String apiSecret; 
            private java.util.Map<String, String> extra; 
            private String password; 
            private String username; 

            private Builder() {
            } 

            private Builder(Credential model) {
                this.apiKey = model.apiKey;
                this.apiSecret = model.apiSecret;
                this.extra = model.extra;
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * <p>API Key</p>
             * 
             * <strong>example:</strong>
             * <p>akm-xxxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>API Secret</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxxxx</p>
             */
            public Builder apiSecret(String apiSecret) {
                this.apiSecret = apiSecret;
                return this;
            }

            /**
             * <p>The extension field.</p>
             */
            public Builder extra(java.util.Map<String, String> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppAssistantAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppAssistantAgentsResponseBody</p>
     */
    public static class EmbedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, String> extra;

        @com.aliyun.core.annotation.NameInMap("RawScript")
        private String rawScript;

        private EmbedConfig(Builder builder) {
            this.extra = builder.extra;
            this.rawScript = builder.rawScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbedConfig create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        /**
         * @return rawScript
         */
        public String getRawScript() {
            return this.rawScript;
        }

        public static final class Builder {
            private java.util.Map<String, String> extra; 
            private String rawScript; 

            private Builder() {
            } 

            private Builder(EmbedConfig model) {
                this.extra = model.extra;
                this.rawScript = model.rawScript;
            } 

            /**
             * <p>The extension field.</p>
             */
            public Builder extra(java.util.Map<String, String> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The raw embedding script.</p>
             */
            public Builder rawScript(String rawScript) {
                this.rawScript = rawScript;
                return this;
            }

            public EmbedConfig build() {
                return new EmbedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppAssistantAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppAssistantAgentsResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("EmbedConfig")
        private EmbedConfig embedConfig;

        @com.aliyun.core.annotation.NameInMap("ExtraParams")
        private java.util.Map<String, String> extraParams;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("PlatformAppId")
        private String platformAppId;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Module(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.bizId = builder.bizId;
            this.credential = builder.credential;
            this.embedConfig = builder.embedConfig;
            this.extraParams = builder.extraParams;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.platformAppId = builder.platformAppId;
            this.platformType = builder.platformType;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return embedConfig
         */
        public EmbedConfig getEmbedConfig() {
            return this.embedConfig;
        }

        /**
         * @return extraParams
         */
        public java.util.Map<String, String> getExtraParams() {
            return this.extraParams;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return platformAppId
         */
        public String getPlatformAppId() {
            return this.platformAppId;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String bizId; 
            private Credential credential; 
            private EmbedConfig embedConfig; 
            private java.util.Map<String, String> extraParams; 
            private String gmtCreate; 
            private String gmtModified; 
            private String platformAppId; 
            private String platformType; 
            private String status; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.bizId = model.bizId;
                this.credential = model.credential;
                this.embedConfig = model.embedConfig;
                this.extraParams = model.extraParams;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.platformAppId = model.platformAppId;
                this.platformType = model.platformType;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * <p>The agent ID returned by the platform.</p>
             * 
             * <strong>example:</strong>
             * <p>liyang1_v@soulapp</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>演示</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The business ID of the associated application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WD20250703155602000001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The authentication credential.</p>
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>The embedding configuration.</p>
             */
            public Builder embedConfig(EmbedConfig embedConfig) {
                this.embedConfig = embedConfig;
                return this;
            }

            /**
             * <p>The extension parameters.</p>
             */
            public Builder extraParams(java.util.Map<String, String> extraParams) {
                this.extraParams = extraParams;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1740479834</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-28T02:25:41Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The platform application ID of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>WA12313123131</p>
             */
            public Builder platformAppId(String platformAppId) {
                this.platformAppId = platformAppId;
                return this;
            }

            /**
             * <p>The platform type.</p>
             * 
             * <strong>example:</strong>
             * <p>VMWARE</p>
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1231311312</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
