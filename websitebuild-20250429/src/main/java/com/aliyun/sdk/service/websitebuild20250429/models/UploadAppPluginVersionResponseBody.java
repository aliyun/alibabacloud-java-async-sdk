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
         * <p>The detailed reasons for access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether a retry is allowed. Valid values:</p>
         * <ul>
         * <li>false: A retry is not allowed.</li>
         * <li>true: A retry is allowed.</li>
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
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ish-intelligence-store-platform-admin-web</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic code. This parameter is not used and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not used and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/gl3d6l3817id8p1/gl3d6l3817id8p1.diff.zip?Expires=1750392068&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=Bcj3eohy8nmlSQ7AAGdq7JZoLjM%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/gl3d6l3817id8p1/gl3d6l3817id8p1.diff.zip?Expires=1750392068&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=Bcj3eohy8nmlSQ7AAGdq7JZoLjM%3D</a></p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The application module.</p>
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
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Specifies whether synchronous processing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>The commit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder commitSha(String commitSha) {
                this.commitSha = commitSha;
                return this;
            }

            /**
             * <p>The ID of the bound API gateway plugin.</p>
             * 
             * <strong>example:</strong>
             * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
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
             * <p>The signature version, such as OSS4-HMAC-SHA256.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-02</p>
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
