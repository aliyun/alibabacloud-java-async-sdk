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
 * {@link UploadAppPluginVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UploadAppPluginVersionResponseBody</p>
 */
public class UploadAppPluginVersionResponseBody extends TeaModel {
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

    private UploadAppPluginVersionResponseBody(Builder builder) {
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

    public static UploadAppPluginVersionResponseBody create() {
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

        private Builder(UploadAppPluginVersionResponseBody model) {
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

        public UploadAppPluginVersionResponseBody build() {
            return new UploadAppPluginVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadAppPluginVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UploadAppPluginVersionResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitSha")
        private String commitSha;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Module(Builder builder) {
            this.commitSha = builder.commitSha;
            this.pluginId = builder.pluginId;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return commitSha
         */
        public String getCommitSha() {
            return this.commitSha;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String commitSha; 
            private String pluginId; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.commitSha = model.commitSha;
                this.pluginId = model.pluginId;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * CommitSha.
             */
            public Builder commitSha(String commitSha) {
                this.commitSha = commitSha;
                return this;
            }

            /**
             * PluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>trial,draft,live,refunded,expired,released</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
