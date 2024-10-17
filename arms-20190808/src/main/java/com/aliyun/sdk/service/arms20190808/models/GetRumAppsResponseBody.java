// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRumAppsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumAppsResponseBody</p>
 */
public class GetRumAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppList")
    private java.util.List < AppList> appList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRumAppsResponseBody(Builder builder) {
        this.appList = builder.appList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appList
     */
    public java.util.List < AppList> getAppList() {
        return this.appList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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
        private java.util.List < AppList> appList; 
        private Integer code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The queried applications.</p>
         */
        public Builder appList(java.util.List < AppList> appList) {
            this.appList = appList;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error, please contact customer service.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRumAppsResponseBody build() {
            return new GetRumAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRumAppsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumAppsResponseBody</p>
     */
    public static class ServiceDomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("PropagatorTypes")
        private java.util.List < String > propagatorTypes;

        @com.aliyun.core.annotation.NameInMap("Tracing")
        private String tracing;

        private ServiceDomainConfigs(Builder builder) {
            this.description = builder.description;
            this.domain = builder.domain;
            this.propagatorTypes = builder.propagatorTypes;
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
         * @return tracing
         */
        public String getTracing() {
            return this.tracing;
        }

        public static final class Builder {
            private String description; 
            private String domain; 
            private java.util.List < String > propagatorTypes; 
            private String tracing; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name or IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The trace propagation protocols. This parameter is required if the tracing analysis feature is enabled.</p>
             */
            public Builder propagatorTypes(java.util.List < String > propagatorTypes) {
                this.propagatorTypes = propagatorTypes;
                return this;
            }

            /**
             * <p>Indicates whether the tracing analysis feature is enabled. To enable the tracing analysis feature, you must activate Managed Service for OpenTelemetry. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enables the tracing analysis feature. If you enable the tracing analysis feature, related headers are inserted into requests for the domain name.</li>
             * <li><code>false</code>: disables the tracing analysis feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracing(String tracing) {
                this.tracing = tracing;
                return this;
            }

            public ServiceDomainConfigs build() {
                return new ServiceDomainConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRumAppsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumAppsResponseBody</p>
     */
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
             * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
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
    /**
     * 
     * {@link GetRumAppsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumAppsResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Object createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("IsSubscription")
        private Boolean isSubscription;

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

        private AppList(Builder builder) {
            this.appType = builder.appType;
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

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return createTime
         */
        public Object getCreateTime() {
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
        public Boolean getIsSubscription() {
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
            private String appType; 
            private Object createTime; 
            private String description; 
            private String endpoint; 
            private Boolean isSubscription; 
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
             * <p>The application type. Valid values: web, miniapp, ios, and android.</p>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The time when the application was created. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1685686960872</p>
             */
            public Builder createTime(Object createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The endpoint that is used to report application data.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx-default-cn.rum.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>Indicates whether the application is subscribed. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSubscription(Boolean isSubscription) {
                this.isSubscription = isSubscription;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>home page</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alias of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Williamtag</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The package name of the Android application.</p>
             * 
             * <strong>example:</strong>
             * <p>com.zy.yxws</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx@cc08bdxxxx20b15</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzaq3ypaqkdy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The list of service domain configurations. Only mobile applications are supported.</p>
             */
            public Builder serviceDomainConfigs(java.util.List < ServiceDomainConfigs> serviceDomainConfigs) {
                this.serviceDomainConfigs = serviceDomainConfigs;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service Logstore that stores application data.</p>
             * 
             * <strong>example:</strong>
             * <p>logstore-rum</p>
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that stores application data.</p>
             * 
             * <strong>example:</strong>
             * <p>proj-xtrace-xxxxxxxba6ef5466b5debf9e2f951-cn-hangzhou</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The status of the application. Valid values: created, running, and stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the application. Valid value: RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>RUM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
}
