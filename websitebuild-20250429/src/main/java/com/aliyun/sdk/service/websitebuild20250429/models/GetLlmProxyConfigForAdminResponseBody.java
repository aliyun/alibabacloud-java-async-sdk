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
 * {@link GetLlmProxyConfigForAdminResponseBody} extends {@link TeaModel}
 *
 * <p>GetLlmProxyConfigForAdminResponseBody</p>
 */
public class GetLlmProxyConfigForAdminResponseBody extends TeaModel {
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

    private GetLlmProxyConfigForAdminResponseBody(Builder builder) {
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

    public static GetLlmProxyConfigForAdminResponseBody create() {
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

        private Builder(GetLlmProxyConfigForAdminResponseBody model) {
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

        public GetLlmProxyConfigForAdminResponseBody build() {
            return new GetLlmProxyConfigForAdminResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLlmProxyConfigForAdminResponseBody} extends {@link TeaModel}
     *
     * <p>GetLlmProxyConfigForAdminResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedModels")
        private String allowedModels;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BlockedModels")
        private String blockedModels;

        @com.aliyun.core.annotation.NameInMap("Capability")
        private String capability;

        @com.aliyun.core.annotation.NameInMap("DailyLimit")
        private Integer dailyLimit;

        @com.aliyun.core.annotation.NameInMap("DailyTokenLimit")
        private Long dailyTokenLimit;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IpBlacklist")
        private String ipBlacklist;

        @com.aliyun.core.annotation.NameInMap("IpWhitelist")
        private String ipWhitelist;

        @com.aliyun.core.annotation.NameInMap("RpmLimit")
        private Integer rpmLimit;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SuspendReason")
        private String suspendReason;

        private Module(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.bizId = builder.bizId;
            this.blockedModels = builder.blockedModels;
            this.capability = builder.capability;
            this.dailyLimit = builder.dailyLimit;
            this.dailyTokenLimit = builder.dailyTokenLimit;
            this.enabled = builder.enabled;
            this.extend = builder.extend;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ipBlacklist = builder.ipBlacklist;
            this.ipWhitelist = builder.ipWhitelist;
            this.rpmLimit = builder.rpmLimit;
            this.status = builder.status;
            this.suspendReason = builder.suspendReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public String getAllowedModels() {
            return this.allowedModels;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return blockedModels
         */
        public String getBlockedModels() {
            return this.blockedModels;
        }

        /**
         * @return capability
         */
        public String getCapability() {
            return this.capability;
        }

        /**
         * @return dailyLimit
         */
        public Integer getDailyLimit() {
            return this.dailyLimit;
        }

        /**
         * @return dailyTokenLimit
         */
        public Long getDailyTokenLimit() {
            return this.dailyTokenLimit;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ipBlacklist
         */
        public String getIpBlacklist() {
            return this.ipBlacklist;
        }

        /**
         * @return ipWhitelist
         */
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        /**
         * @return rpmLimit
         */
        public Integer getRpmLimit() {
            return this.rpmLimit;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return suspendReason
         */
        public String getSuspendReason() {
            return this.suspendReason;
        }

        public static final class Builder {
            private String allowedModels; 
            private String bizId; 
            private String blockedModels; 
            private String capability; 
            private Integer dailyLimit; 
            private Long dailyTokenLimit; 
            private Boolean enabled; 
            private String extend; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String ipBlacklist; 
            private String ipWhitelist; 
            private Integer rpmLimit; 
            private Integer status; 
            private String suspendReason; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.allowedModels = model.allowedModels;
                this.bizId = model.bizId;
                this.blockedModels = model.blockedModels;
                this.capability = model.capability;
                this.dailyLimit = model.dailyLimit;
                this.dailyTokenLimit = model.dailyTokenLimit;
                this.enabled = model.enabled;
                this.extend = model.extend;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.ipBlacklist = model.ipBlacklist;
                this.ipWhitelist = model.ipWhitelist;
                this.rpmLimit = model.rpmLimit;
                this.status = model.status;
                this.suspendReason = model.suspendReason;
            } 

            /**
             * AllowedModels.
             */
            public Builder allowedModels(String allowedModels) {
                this.allowedModels = allowedModels;
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
             * BlockedModels.
             */
            public Builder blockedModels(String blockedModels) {
                this.blockedModels = blockedModels;
                return this;
            }

            /**
             * Capability.
             */
            public Builder capability(String capability) {
                this.capability = capability;
                return this;
            }

            /**
             * DailyLimit.
             */
            public Builder dailyLimit(Integer dailyLimit) {
                this.dailyLimit = dailyLimit;
                return this;
            }

            /**
             * DailyTokenLimit.
             */
            public Builder dailyTokenLimit(Long dailyTokenLimit) {
                this.dailyTokenLimit = dailyTokenLimit;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IpBlacklist.
             */
            public Builder ipBlacklist(String ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * IpWhitelist.
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            /**
             * RpmLimit.
             */
            public Builder rpmLimit(Integer rpmLimit) {
                this.rpmLimit = rpmLimit;
                return this;
            }

            /**
             * <p>trial,draft,live,refunded,expired,released</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SuspendReason.
             */
            public Builder suspendReason(String suspendReason) {
                this.suspendReason = suspendReason;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
