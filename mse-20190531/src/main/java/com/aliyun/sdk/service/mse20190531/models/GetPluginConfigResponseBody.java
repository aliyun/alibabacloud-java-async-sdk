// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPluginConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginConfigResponseBody</p>
 */
public class GetPluginConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPluginConfigResponseBody build() {
            return new GetPluginConfigResponseBody(this);
        } 

    } 

    public static class GatewayConfigList extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("ConfigLevel")
        private Integer configLevel;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PluginId")
        private Long pluginId;

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

            /**
             * The plug-in configuration.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The application scope of the plug-in. Valid values:
             * <p>
             * 
             * 0: global
             * 
             * 1: domain names
             * 
             * 2: routes
             */
            public Builder configLevel(Integer configLevel) {
                this.configLevel = configLevel;
                return this;
            }

            /**
             * Indicates whether the plug-in is enabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The update time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the plug-in configuration.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the gateway plug-in.
             */
            public Builder pluginId(Long pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            public GatewayConfigList build() {
                return new GatewayConfigList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Category")
        private Integer category;

        @NameInMap("ConfigCheck")
        private String configCheck;

        @NameInMap("GatewayConfigList")
        private java.util.List < GatewayConfigList> gatewayConfigList;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Phase")
        private Integer phase;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("PublishState")
        private Integer publishState;

        @NameInMap("Readme")
        private String readme;

        @NameInMap("ReadmeEn")
        private String readmeEn;

        @NameInMap("Status")
        private String status;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionJson")
        private String versionJson;

        @NameInMap("WasmLang")
        private Integer wasmLang;

        private Data(Builder builder) {
            this.category = builder.category;
            this.configCheck = builder.configCheck;
            this.gatewayConfigList = builder.gatewayConfigList;
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
         * @return gatewayConfigList
         */
        public java.util.List < GatewayConfigList> getGatewayConfigList() {
            return this.gatewayConfigList;
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
            private java.util.List < GatewayConfigList> gatewayConfigList; 
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
            private String status; 
            private String summary; 
            private Integer type; 
            private String version; 
            private String versionJson; 
            private Integer wasmLang; 

            /**
             * The category of the plug-in. Valid values:
             * <p>
             * 
             * 0: user-defined
             * 
             * 1: permission authentication
             * 
             * 2: security protection
             * 
             * 3: transmission protocol
             * 
             * 4: traffic control
             * 
             * 5: traffic observation
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * The information about the plug-in configuration used for checking.
             */
            public Builder configCheck(String configCheck) {
                this.configCheck = configCheck;
                return this;
            }

            /**
             * The list of gateway plug-in configurations.
             */
            public Builder gatewayConfigList(java.util.List < GatewayConfigList> gatewayConfigList) {
                this.gatewayConfigList = gatewayConfigList;
                return this;
            }

            /**
             * The ID of the plug-in.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the plug-in.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The execution stage of the plug-in. Valid values:
             * <p>
             * 
             * 0: default stage
             * 
             * 1: authorization stage
             * 
             * 2: authentication stage
             * 
             * 3: statistics stage
             */
            public Builder phase(Integer phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The ID of the creator.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The execution priority of the plug-in. A larger value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The publish status.
             */
            public Builder publishState(Integer publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * The description of the README file.
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * The description of the README file that is edited in English.
             */
            public Builder readmeEn(String readmeEn) {
                this.readmeEn = readmeEn;
                return this;
            }

            /**
             * Indicates whether the plug-in is enabled. Valid values:
             * <p>
             * 
             * 0: disabled
             * 
             * 1: enabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The summary of the plug-in.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * The version of the plug-in.
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
             * The WebAssembly language. Valid values:
             * <p>
             * 
             * 0: C++
             * 
             * 1: TinyGo
             * 
             * 2: Rust
             * 
             * 3: AssemblyScript
             * 
             * 4: Zig
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
