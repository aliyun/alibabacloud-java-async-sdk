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
 * {@link GetAppPluginResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppPluginResponseBody</p>
 */
public class GetAppPluginResponseBody extends TeaModel {
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

    private GetAppPluginResponseBody(Builder builder) {
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

    public static GetAppPluginResponseBody create() {
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

        private Builder(GetAppPluginResponseBody model) {
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

        public GetAppPluginResponseBody build() {
            return new GetAppPluginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppPluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppPluginResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConfigItems")
        private String configItems;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("GitRef")
        private String gitRef;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private String hooks;

        @com.aliyun.core.annotation.NameInMap("HotCount")
        private Integer hotCount;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("RepositoryUrl")
        private String repositoryUrl;

        @com.aliyun.core.annotation.NameInMap("SkillHeader")
        private String skillHeader;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private Module(Builder builder) {
            this.category = builder.category;
            this.configItems = builder.configItems;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.display = builder.display;
            this.enabled = builder.enabled;
            this.extend = builder.extend;
            this.gitRef = builder.gitRef;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hooks = builder.hooks;
            this.hotCount = builder.hotCount;
            this.icon = builder.icon;
            this.pluginId = builder.pluginId;
            this.pluginName = builder.pluginName;
            this.repositoryUrl = builder.repositoryUrl;
            this.skillHeader = builder.skillHeader;
            this.status = builder.status;
            this.tags = builder.tags;
            this.version = builder.version;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return configItems
         */
        public String getConfigItems() {
            return this.configItems;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return gitRef
         */
        public String getGitRef() {
            return this.gitRef;
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
         * @return hooks
         */
        public String getHooks() {
            return this.hooks;
        }

        /**
         * @return hotCount
         */
        public Integer getHotCount() {
            return this.hotCount;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        /**
         * @return skillHeader
         */
        public String getSkillHeader() {
            return this.skillHeader;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String category; 
            private String configItems; 
            private String createdBy; 
            private String description; 
            private Integer display; 
            private Integer enabled; 
            private String extend; 
            private String gitRef; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hooks; 
            private Integer hotCount; 
            private String icon; 
            private String pluginId; 
            private String pluginName; 
            private String repositoryUrl; 
            private String skillHeader; 
            private String status; 
            private String tags; 
            private String version; 
            private String visibility; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.category = model.category;
                this.configItems = model.configItems;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.display = model.display;
                this.enabled = model.enabled;
                this.extend = model.extend;
                this.gitRef = model.gitRef;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hooks = model.hooks;
                this.hotCount = model.hotCount;
                this.icon = model.icon;
                this.pluginId = model.pluginId;
                this.pluginName = model.pluginName;
                this.repositoryUrl = model.repositoryUrl;
                this.skillHeader = model.skillHeader;
                this.status = model.status;
                this.tags = model.tags;
                this.version = model.version;
                this.visibility = model.visibility;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConfigItems.
             */
            public Builder configItems(String configItems) {
                this.configItems = configItems;
                return this;
            }

            /**
             * CreatedBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
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
             * GitRef.
             */
            public Builder gitRef(String gitRef) {
                this.gitRef = gitRef;
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
             * Hooks.
             */
            public Builder hooks(String hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * HotCount.
             */
            public Builder hotCount(Integer hotCount) {
                this.hotCount = hotCount;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
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
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * RepositoryUrl.
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            /**
             * SkillHeader.
             */
            public Builder skillHeader(String skillHeader) {
                this.skillHeader = skillHeader;
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
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
