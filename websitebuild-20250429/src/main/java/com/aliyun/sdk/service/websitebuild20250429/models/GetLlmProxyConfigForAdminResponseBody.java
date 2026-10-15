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
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed. Valid values:</p>
         * <ul>
         * <li>false: Retries are not allowed.</li>
         * <li>true: Retries are allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name. The application with this name is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic code. This parameter is not in use. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message. This parameter is used to replace the <code>%s</code> variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>For example, if the <strong>ErrMessage</strong> parameter returns <strong>The Value of Input Parameter %s is not valid</strong> and the <strong>DynamicMessage</strong> parameter returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
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
         * <p>The returned object.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is synchronously processed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>The list of supported models.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.5-plus</p>
             */
            public Builder allowedModels(String allowedModels) {
                this.allowedModels = allowedModels;
                return this;
            }

            /**
             * <p>The business ID of the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WD20250703155602000001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The list of blocked models.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.5-plus</p>
             */
            public Builder blockedModels(String blockedModels) {
                this.blockedModels = blockedModels;
                return this;
            }

            /**
             * <p>Grants specific permissions to processes in the container. Only NET_ADMIN and NET_RAW are supported.</p>
             * <blockquote>
             * <p>NET_RAW is not supported by default. Submit a ticket to apply for this permission.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>adds2</p>
             */
            public Builder capability(String capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>The maximum number of requests per day.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder dailyLimit(Integer dailyLimit) {
                this.dailyLimit = dailyLimit;
                return this;
            }

            /**
             * <p>The maximum number of tokens per day.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder dailyTokenLimit(Long dailyTokenLimit) {
                this.dailyTokenLimit = dailyTokenLimit;
                return this;
            }

            /**
             * <p>Indicates whether scheduled delivery of resource snapshots is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The extended configuration in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;deliveryNodeName\&quot;:\&quot;绑定域名及发布\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Finish\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Provider\&quot;}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
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
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>16257</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>121.41.11.161,10.200.255.60</p>
             */
            public Builder ipBlacklist(String ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * <p>The IP whitelist. Separate multiple IP addresses with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>121.41.11.161,10.200.255.60</p>
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            /**
             * <p>The maximum number of requests per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
             * <p>The reason for suspension.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
