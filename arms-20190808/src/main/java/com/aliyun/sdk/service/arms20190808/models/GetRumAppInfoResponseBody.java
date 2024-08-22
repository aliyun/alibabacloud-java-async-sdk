// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRumAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumAppInfoResponseBody</p>
 */
public class GetRumAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRumAppInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumAppInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRumAppInfoResponseBody build() {
            return new GetRumAppInfoResponseBody(this);
        } 

    } 

    public static class ModuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultConfig")
        private java.util.Map < String, DataBonreeSDKConfigModuleConfigDefaultConfigValue > defaultConfig;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("versionConfigs")
        private java.util.Map < String, DataBonreeSDKConfigModuleConfigVersionConfigsValue > versionConfigs;

        private ModuleConfig(Builder builder) {
            this.defaultConfig = builder.defaultConfig;
            this.enable = builder.enable;
            this.versionConfigs = builder.versionConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleConfig create() {
            return builder().build();
        }

        /**
         * @return defaultConfig
         */
        public java.util.Map < String, DataBonreeSDKConfigModuleConfigDefaultConfigValue > getDefaultConfig() {
            return this.defaultConfig;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return versionConfigs
         */
        public java.util.Map < String, DataBonreeSDKConfigModuleConfigVersionConfigsValue > getVersionConfigs() {
            return this.versionConfigs;
        }

        public static final class Builder {
            private java.util.Map < String, DataBonreeSDKConfigModuleConfigDefaultConfigValue > defaultConfig; 
            private Boolean enable; 
            private java.util.Map < String, DataBonreeSDKConfigModuleConfigVersionConfigsValue > versionConfigs; 

            /**
             * The default configuration of the application.
             */
            public Builder defaultConfig(java.util.Map < String, DataBonreeSDKConfigModuleConfigDefaultConfigValue > defaultConfig) {
                this.defaultConfig = defaultConfig;
                return this;
            }

            /**
             * Indicates whether the configuration is enabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The version configurations of the application.
             */
            public Builder versionConfigs(java.util.Map < String, DataBonreeSDKConfigModuleConfigVersionConfigsValue > versionConfigs) {
                this.versionConfigs = versionConfigs;
                return this;
            }

            public ModuleConfig build() {
                return new ModuleConfig(this);
            } 

        } 

    }
    public static class BonreeSDKConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleConfig")
        private ModuleConfig moduleConfig;

        private BonreeSDKConfig(Builder builder) {
            this.moduleConfig = builder.moduleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BonreeSDKConfig create() {
            return builder().build();
        }

        /**
         * @return moduleConfig
         */
        public ModuleConfig getModuleConfig() {
            return this.moduleConfig;
        }

        public static final class Builder {
            private ModuleConfig moduleConfig; 

            /**
             * The module configuration.
             */
            public Builder moduleConfig(ModuleConfig moduleConfig) {
                this.moduleConfig = moduleConfig;
                return this;
            }

            public BonreeSDKConfig build() {
                return new BonreeSDKConfig(this);
            } 

        } 

    }
    public static class ServiceDomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("PropagatorTypes")
        private java.util.List < String > propagatorTypes;

        @com.aliyun.core.annotation.NameInMap("SamplingRate")
        private Integer samplingRate;

        @com.aliyun.core.annotation.NameInMap("Tracing")
        private Boolean tracing;

        private ServiceDomainConfigs(Builder builder) {
            this.description = builder.description;
            this.domain = builder.domain;
            this.propagatorTypes = builder.propagatorTypes;
            this.samplingRate = builder.samplingRate;
            this.tracing = builder.tracing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceDomainConfigs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return propagatorTypes
         */
        public java.util.List < String > getPropagatorTypes() {
            return this.propagatorTypes;
        }

        /**
         * @return samplingRate
         */
        public Integer getSamplingRate() {
            return this.samplingRate;
        }

        /**
         * @return tracing
         */
        public Boolean getTracing() {
            return this.tracing;
        }

        public static final class Builder {
            private String description; 
            private String domain; 
            private java.util.List < String > propagatorTypes; 
            private Integer samplingRate; 
            private Boolean tracing; 

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name or IP address.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The trace propagation protocols. This parameter is required if the tracing analysis feature is enabled.
             */
            public Builder propagatorTypes(java.util.List < String > propagatorTypes) {
                this.propagatorTypes = propagatorTypes;
                return this;
            }

            /**
             * SamplingRate.
             */
            public Builder samplingRate(Integer samplingRate) {
                this.samplingRate = samplingRate;
                return this;
            }

            /**
             * Indicates whether the tracing analysis feature is enabled. To enable the tracing analysis feature, you must activate Managed Service for OpenTelemetry. Valid values:
             * <p>
             * 
             * *   `true`: enables the tracing analysis feature. If you enable the tracing analysis feature, related headers are inserted into requests for the domain name.
             * *   `false`: disables the tracing analysis feature.
             */
            public Builder tracing(Boolean tracing) {
                this.tracing = tracing;
                return this;
            }

            public ServiceDomainConfigs build() {
                return new ServiceDomainConfigs(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroup")
        private String appGroup;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BonreeSDKConfig")
        private BonreeSDKConfig bonreeSDKConfig;

        @com.aliyun.core.annotation.NameInMap("CdnDomain")
        private String cdnDomain;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("IsSubscription")
        private String isSubscription;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceDomainConfigs")
        private java.util.List < ServiceDomainConfigs> serviceDomainConfigs;

        @com.aliyun.core.annotation.NameInMap("SlsLogstore")
        private String slsLogstore;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.appGroup = builder.appGroup;
            this.appType = builder.appType;
            this.bonreeSDKConfig = builder.bonreeSDKConfig;
            this.cdnDomain = builder.cdnDomain;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.isSubscription = builder.isSubscription;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.packageName = builder.packageName;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceDomainConfigs = builder.serviceDomainConfigs;
            this.slsLogstore = builder.slsLogstore;
            this.slsProject = builder.slsProject;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroup
         */
        public String getAppGroup() {
            return this.appGroup;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return bonreeSDKConfig
         */
        public BonreeSDKConfig getBonreeSDKConfig() {
            return this.bonreeSDKConfig;
        }

        /**
         * @return cdnDomain
         */
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return isSubscription
         */
        public String getIsSubscription() {
            return this.isSubscription;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceDomainConfigs
         */
        public java.util.List < ServiceDomainConfigs> getServiceDomainConfigs() {
            return this.serviceDomainConfigs;
        }

        /**
         * @return slsLogstore
         */
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appGroup; 
            private String appType; 
            private BonreeSDKConfig bonreeSDKConfig; 
            private String cdnDomain; 
            private String createTime; 
            private String description; 
            private String endpoint; 
            private String isSubscription; 
            private String name; 
            private String nickName; 
            private String packageName; 
            private String pid; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List < ServiceDomainConfigs> serviceDomainConfigs; 
            private String slsLogstore; 
            private String slsProject; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String type; 

            /**
             * The group to which the application belongs.
             */
            public Builder appGroup(String appGroup) {
                this.appGroup = appGroup;
                return this;
            }

            /**
             * The application type. Valid values: web, miniapp, ios, and android.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * The mobile collection configurations.
             */
            public Builder bonreeSDKConfig(BonreeSDKConfig bonreeSDKConfig) {
                this.bonreeSDKConfig = bonreeSDKConfig;
                return this;
            }

            /**
             * The domain name of the SDK.
             */
            public Builder cdnDomain(String cdnDomain) {
                this.cdnDomain = cdnDomain;
                return this;
            }

            /**
             * The time when the application was created. The value is a timestamp. Unit: milliseconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The endpoint that is used to report application data.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Indicates whether the application is subscribed. Valid values: true and false.
             */
            public Builder isSubscription(String isSubscription) {
                this.isSubscription = isSubscription;
                return this;
            }

            /**
             * The application name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The alias of the application.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The name of the application package.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The list of service domain configurations. Only mobile applications are supported.
             */
            public Builder serviceDomainConfigs(java.util.List < ServiceDomainConfigs> serviceDomainConfigs) {
                this.serviceDomainConfigs = serviceDomainConfigs;
                return this;
            }

            /**
             * The name of the Simple Log Service Logstore that stores application data.
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * The name of the Simple Log Service project that stores application data.
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * The status of the application. Valid values: created, running, and stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the application. Valid value: RUM.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
