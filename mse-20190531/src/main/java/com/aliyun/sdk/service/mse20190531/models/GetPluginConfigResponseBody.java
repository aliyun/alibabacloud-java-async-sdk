// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPluginConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginConfigResponseBody</p>
 */
public class GetPluginConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPluginConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginConfigResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Integer code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>03A3E2F4-6804-5663-9D5D-2EC47A1*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPluginConfigResponseBody build() {
            return new GetPluginConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPluginConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginConfigResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ResourceList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPluginConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginConfigResponseBody</p>
     */
    public static class GatewayConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConfigLevel")
        private Integer configLevel;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private Long pluginId;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        private GatewayConfigList(Builder builder) {
            this.config = builder.config;
            this.configLevel = builder.configLevel;
            this.enable = builder.enable;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.pluginId = builder.pluginId;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayConfigList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return configLevel
         */
        public Integer getConfigLevel() {
            return this.configLevel;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
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
         * @return pluginId
         */
        public Long getPluginId() {
            return this.pluginId;
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private String config; 
            private Integer configLevel; 
            private Boolean enable; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long pluginId; 
            private java.util.List < ResourceList> resourceList; 

            /**
             * <p>The plug-in configuration.</p>
             * 
             * <strong>example:</strong>
             * <p># Configure a check for the required fields of the plug-in, such as name, age, and friends. Sample configuration: name: John age: 18 friends: - David - Anne</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The application scope of the plug-in. Valid values:</p>
             * <p>0: global</p>
             * <p>1: domain names</p>
             * <p>2: routes</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder configLevel(Integer configLevel) {
                this.configLevel = configLevel;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-ubuwqygbq4783gqb2y3f87q****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1667309705000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1667309705000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the plug-in configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the gateway plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pluginId(Long pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * ResourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public GatewayConfigList build() {
                return new GatewayConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPluginConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("ConfigCheck")
        private String configCheck;

        @com.aliyun.core.annotation.NameInMap("ConfigExample")
        private String configExample;

        @com.aliyun.core.annotation.NameInMap("DomainConfigStartIndex")
        private Integer domainConfigStartIndex;

        @com.aliyun.core.annotation.NameInMap("GatewayConfigList")
        private java.util.List < GatewayConfigList> gatewayConfigList;

        @com.aliyun.core.annotation.NameInMap("GatewayConfigStartIndex")
        private Integer gatewayConfigStartIndex;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private Integer phase;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PublishState")
        private Integer publishState;

        @com.aliyun.core.annotation.NameInMap("Readme")
        private String readme;

        @com.aliyun.core.annotation.NameInMap("ReadmeEn")
        private String readmeEn;

        @com.aliyun.core.annotation.NameInMap("RouteConfigStartIndex")
        private Integer routeConfigStartIndex;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionJson")
        private String versionJson;

        @com.aliyun.core.annotation.NameInMap("WasmLang")
        private Integer wasmLang;

        private Data(Builder builder) {
            this.category = builder.category;
            this.configCheck = builder.configCheck;
            this.configExample = builder.configExample;
            this.domainConfigStartIndex = builder.domainConfigStartIndex;
            this.gatewayConfigList = builder.gatewayConfigList;
            this.gatewayConfigStartIndex = builder.gatewayConfigStartIndex;
            this.id = builder.id;
            this.imageName = builder.imageName;
            this.mode = builder.mode;
            this.name = builder.name;
            this.phase = builder.phase;
            this.primaryUser = builder.primaryUser;
            this.priority = builder.priority;
            this.publishState = builder.publishState;
            this.readme = builder.readme;
            this.readmeEn = builder.readmeEn;
            this.routeConfigStartIndex = builder.routeConfigStartIndex;
            this.status = builder.status;
            this.summary = builder.summary;
            this.type = builder.type;
            this.version = builder.version;
            this.versionJson = builder.versionJson;
            this.wasmLang = builder.wasmLang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return configCheck
         */
        public String getConfigCheck() {
            return this.configCheck;
        }

        /**
         * @return configExample
         */
        public String getConfigExample() {
            return this.configExample;
        }

        /**
         * @return domainConfigStartIndex
         */
        public Integer getDomainConfigStartIndex() {
            return this.domainConfigStartIndex;
        }

        /**
         * @return gatewayConfigList
         */
        public java.util.List < GatewayConfigList> getGatewayConfigList() {
            return this.gatewayConfigList;
        }

        /**
         * @return gatewayConfigStartIndex
         */
        public Integer getGatewayConfigStartIndex() {
            return this.gatewayConfigStartIndex;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public Integer getPhase() {
            return this.phase;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return publishState
         */
        public Integer getPublishState() {
            return this.publishState;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return readmeEn
         */
        public String getReadmeEn() {
            return this.readmeEn;
        }

        /**
         * @return routeConfigStartIndex
         */
        public Integer getRouteConfigStartIndex() {
            return this.routeConfigStartIndex;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionJson
         */
        public String getVersionJson() {
            return this.versionJson;
        }

        /**
         * @return wasmLang
         */
        public Integer getWasmLang() {
            return this.wasmLang;
        }

        public static final class Builder {
            private Integer category; 
            private String configCheck; 
            private String configExample; 
            private Integer domainConfigStartIndex; 
            private java.util.List < GatewayConfigList> gatewayConfigList; 
            private Integer gatewayConfigStartIndex; 
            private Long id; 
            private String imageName; 
            private Integer mode; 
            private String name; 
            private Integer phase; 
            private String primaryUser; 
            private Integer priority; 
            private Integer publishState; 
            private String readme; 
            private String readmeEn; 
            private Integer routeConfigStartIndex; 
            private String status; 
            private String summary; 
            private Integer type; 
            private String version; 
            private String versionJson; 
            private Integer wasmLang; 

            /**
             * <p>The category of the plug-in. Valid values:</p>
             * <p>0: user-defined</p>
             * <p>1: permission authentication</p>
             * <p>2: security protection</p>
             * <p>3: transmission protocol</p>
             * <p>4: traffic control</p>
             * <p>5: traffic observation</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The information about the plug-in configuration used for checking.</p>
             * 
             * <strong>example:</strong>
             * <p># The configuration includes the fields required for checking, such as name, age, and friends. Sample configuration: name: John age: 18 friends: - David - Anne</p>
             */
            public Builder configCheck(String configCheck) {
                this.configCheck = configCheck;
                return this;
            }

            /**
             * ConfigExample.
             */
            public Builder configExample(String configExample) {
                this.configExample = configExample;
                return this;
            }

            /**
             * DomainConfigStartIndex.
             */
            public Builder domainConfigStartIndex(Integer domainConfigStartIndex) {
                this.domainConfigStartIndex = domainConfigStartIndex;
                return this;
            }

            /**
             * <p>The list of gateway plug-in configurations.</p>
             */
            public Builder gatewayConfigList(java.util.List < GatewayConfigList> gatewayConfigList) {
                this.gatewayConfigList = gatewayConfigList;
                return this;
            }

            /**
             * GatewayConfigStartIndex.
             */
            public Builder gatewayConfigStartIndex(Integer gatewayConfigStartIndex) {
                this.gatewayConfigStartIndex = gatewayConfigStartIndex;
                return this;
            }

            /**
             * <p>The ID of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The execution stage of the plug-in. Valid values:</p>
             * <p>0: default stage</p>
             * <p>1: authorization stage</p>
             * <p>2: authentication stage</p>
             * <p>3: statistics stage</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder phase(Integer phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * <p>The execution priority of the plug-in. A larger value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The publish status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishState(Integer publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * <p>The description of the README file.</p>
             * 
             * <strong>example:</strong>
             * <p>read me</p>
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * <p>The description of the README file that is edited in English.</p>
             * 
             * <strong>example:</strong>
             * <p>read me</p>
             */
            public Builder readmeEn(String readmeEn) {
                this.readmeEn = readmeEn;
                return this;
            }

            /**
             * RouteConfigStartIndex.
             */
            public Builder routeConfigStartIndex(Integer routeConfigStartIndex) {
                this.routeConfigStartIndex = routeConfigStartIndex;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is enabled. Valid values:</p>
             * <p>0: disabled</p>
             * <p>1: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The summary of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a plug-in.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionJson.
             */
            public Builder versionJson(String versionJson) {
                this.versionJson = versionJson;
                return this;
            }

            /**
             * <p>The WebAssembly language. Valid values:</p>
             * <p>0: C++</p>
             * <p>1: TinyGo</p>
             * <p>2: Rust</p>
             * <p>3: AssemblyScript</p>
             * <p>4: Zig</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wasmLang(Integer wasmLang) {
                this.wasmLang = wasmLang;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
