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
 * {@link GetAppInstanceEntitlementResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppInstanceEntitlementResponseBody</p>
 */
public class GetAppInstanceEntitlementResponseBody extends TeaModel {
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

    private GetAppInstanceEntitlementResponseBody(Builder builder) {
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

    public static GetAppInstanceEntitlementResponseBody create() {
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

        private Builder(GetAppInstanceEntitlementResponseBody model) {
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
         * <p>The access denied details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retry is allowed.</p>
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
         * <p>ish-intelligence-store-platform-admin-web</p>
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
         * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
         * <p>The error arguments.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
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
         * <p>The root error message.</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetAppInstanceEntitlementResponseBody build() {
            return new GetAppInstanceEntitlementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppInstanceEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceEntitlementResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allocated")
        private Boolean allocated;

        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Configured")
        private Boolean configured;

        @com.aliyun.core.annotation.NameInMap("Entitled")
        private Boolean entitled;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Long quota;

        @com.aliyun.core.annotation.NameInMap("Remaining")
        private Long remaining;

        @com.aliyun.core.annotation.NameInMap("ResourceCode")
        private String resourceCode;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Boolean running;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UsagePercent")
        private Integer usagePercent;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private Items(Builder builder) {
            this.allocated = builder.allocated;
            this.available = builder.available;
            this.code = builder.code;
            this.configured = builder.configured;
            this.entitled = builder.entitled;
            this.featureType = builder.featureType;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.pluginId = builder.pluginId;
            this.quota = builder.quota;
            this.remaining = builder.remaining;
            this.resourceCode = builder.resourceCode;
            this.resourceType = builder.resourceType;
            this.running = builder.running;
            this.type = builder.type;
            this.usagePercent = builder.usagePercent;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allocated
         */
        public Boolean getAllocated() {
            return this.allocated;
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        /**
         * @return entitled
         */
        public Boolean getEntitled() {
            return this.entitled;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return quota
         */
        public Long getQuota() {
            return this.quota;
        }

        /**
         * @return remaining
         */
        public Long getRemaining() {
            return this.remaining;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return running
         */
        public Boolean getRunning() {
            return this.running;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usagePercent
         */
        public Integer getUsagePercent() {
            return this.usagePercent;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Boolean allocated; 
            private Boolean available; 
            private String code; 
            private Boolean configured; 
            private Boolean entitled; 
            private String featureType; 
            private String instanceId; 
            private String name; 
            private String pluginId; 
            private Long quota; 
            private Long remaining; 
            private String resourceCode; 
            private String resourceType; 
            private Boolean running; 
            private String type; 
            private Integer usagePercent; 
            private Long used; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.allocated = model.allocated;
                this.available = model.available;
                this.code = model.code;
                this.configured = model.configured;
                this.entitled = model.entitled;
                this.featureType = model.featureType;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.pluginId = model.pluginId;
                this.quota = model.quota;
                this.remaining = model.remaining;
                this.resourceCode = model.resourceCode;
                this.resourceType = model.resourceType;
                this.running = model.running;
                this.type = model.type;
                this.usagePercent = model.usagePercent;
                this.used = model.used;
            } 

            /**
             * <p>Indicates whether an instance is allocated.</p>
             */
            public Builder allocated(Boolean allocated) {
                this.allocated = allocated;
                return this;
            }

            /**
             * <p>Indicates whether this entitlement item is currently available.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The code of the entitlement item.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Indicates whether the configuration is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            /**
             * <p>Indicates whether the edition grants this entitlement item.</p>
             */
            public Builder entitled(Boolean entitled) {
                this.entitled = entitled;
                return this;
            }

            /**
             * <p>The feature source type. Valid values: PLUGIN, SKILL, CHANNEL, and SYSTEM.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * <p>The runtime instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_v2intl_public_intl-sg-i5c43rcpw04</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the entitlement item.</p>
             * 
             * <strong>example:</strong>
             * <p>4e46d24b56bfa944b5e6f2305715bc4e.jpg</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The plug-in ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alipay-isv</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>The total quota.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder quota(Long quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The remaining amount.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder remaining(Long remaining) {
                this.remaining = remaining;
                return this;
            }

            /**
             * <p>The association code of the resource domain.</p>
             * 
             * <strong>example:</strong>
             * <p>SmsCount</p>
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * <p>The resource type. Valid values: QUOTA and LIMIT.</p>
             * 
             * <strong>example:</strong>
             * <p>filesystem</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the instance is running.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder running(Boolean running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The entitlement type. Valid values: FEATURE, RESOURCE, and RUNTIME.</p>
             * 
             * <strong>example:</strong>
             * <p>question</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usagePercent(Integer usagePercent) {
                this.usagePercent = usagePercent;
                return this;
            }

            /**
             * <p>The used amount.</p>
             * 
             * <strong>example:</strong>
             * <p>3295422523872</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceEntitlementResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private Module(Builder builder) {
            this.bizId = builder.bizId;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String bizId; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.bizId = model.bizId;
                this.items = model.items;
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
             * <p>The list of all entitlement items.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
