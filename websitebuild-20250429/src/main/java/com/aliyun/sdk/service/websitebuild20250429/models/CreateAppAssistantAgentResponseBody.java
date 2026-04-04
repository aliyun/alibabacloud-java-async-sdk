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
 * {@link CreateAppAssistantAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppAssistantAgentResponseBody</p>
 */
public class CreateAppAssistantAgentResponseBody extends TeaModel {
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
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private CreateAppAssistantAgentResponseBody(Builder builder) {
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

    public static CreateAppAssistantAgentResponseBody create() {
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
    public Module getModule() {
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
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(CreateAppAssistantAgentResponseBody model) {
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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
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
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public CreateAppAssistantAgentResponseBody build() {
            return new CreateAppAssistantAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppAssistantAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppAssistantAgentResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, String> extra;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Credential(Builder builder) {
            this.extra = builder.extra;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private java.util.Map<String, String> extra; 
            private String username; 

            private Builder() {
            } 

            private Builder(Credential model) {
                this.extra = model.extra;
                this.username = model.username;
            } 

            /**
             * Extra.
             */
            public Builder extra(java.util.Map<String, String> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Username.
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
     * {@link CreateAppAssistantAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppAssistantAgentResponseBody</p>
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
             * Extra.
             */
            public Builder extra(java.util.Map<String, String> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * RawScript.
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
     * {@link CreateAppAssistantAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppAssistantAgentResponseBody</p>
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
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Credential.
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * EmbedConfig.
             */
            public Builder embedConfig(EmbedConfig embedConfig) {
                this.embedConfig = embedConfig;
                return this;
            }

            /**
             * ExtraParams.
             */
            public Builder extraParams(java.util.Map<String, String> extraParams) {
                this.extraParams = extraParams;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * PlatformAppId.
             */
            public Builder platformAppId(String platformAppId) {
                this.platformAppId = platformAppId;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
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
