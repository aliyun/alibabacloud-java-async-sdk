// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginsResponseBody</p>
 */
public class GetPluginsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

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

    private GetPluginsResponseBody(Builder builder) {
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

    public static GetPluginsResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The data entries returned.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The dynamic part in the error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned code.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPluginsResponseBody build() {
            return new GetPluginsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Category")
        private Integer category;

        @NameInMap("ConfigCheck")
        private String configCheck;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxVersion")
        private String maxVersion;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("NewVersionPublishingFlag")
        private Boolean newVersionPublishingFlag;

        @NameInMap("Phase")
        private Integer phase;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("PublishState")
        private Integer publishState;

        @NameInMap("Status")
        private String status;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Version")
        private String version;

        @NameInMap("WasmFile")
        private String wasmFile;

        @NameInMap("WasmLang")
        private Integer wasmLang;

        private Data(Builder builder) {
            this.category = builder.category;
            this.configCheck = builder.configCheck;
            this.id = builder.id;
            this.maxVersion = builder.maxVersion;
            this.mode = builder.mode;
            this.name = builder.name;
            this.newVersionPublishingFlag = builder.newVersionPublishingFlag;
            this.phase = builder.phase;
            this.primaryUser = builder.primaryUser;
            this.priority = builder.priority;
            this.publishState = builder.publishState;
            this.status = builder.status;
            this.summary = builder.summary;
            this.version = builder.version;
            this.wasmFile = builder.wasmFile;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxVersion
         */
        public String getMaxVersion() {
            return this.maxVersion;
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
         * @return newVersionPublishingFlag
         */
        public Boolean getNewVersionPublishingFlag() {
            return this.newVersionPublishingFlag;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return wasmFile
         */
        public String getWasmFile() {
            return this.wasmFile;
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
            private Long id; 
            private String maxVersion; 
            private Integer mode; 
            private String name; 
            private Boolean newVersionPublishingFlag; 
            private Integer phase; 
            private String primaryUser; 
            private Integer priority; 
            private Integer publishState; 
            private String status; 
            private String summary; 
            private String version; 
            private String wasmFile; 
            private Integer wasmLang; 

            /**
             * The type of the plug-in. Valid values:
             * <p>
             * 
             * 0: custom
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
             * The ID of the plug-in.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The latest version of the plug-in.
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
                return this;
            }

            /**
             * The plug-in language. Valid values:
             * <p>
             * 
             * *   0: the WebAssembly plug-in
             * *   2: the Lua plug-in
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
             * Indicates whether the latest version is being released.
             */
            public Builder newVersionPublishingFlag(Boolean newVersionPublishingFlag) {
                this.newVersionPublishingFlag = newVersionPublishingFlag;
                return this;
            }

            /**
             * The execution stage of the plug-in.
             * <p>
             * 
             * *   0: default stage
             * *   1: authorization stage
             * *   2: authentication stage
             * *   3: statistics stage
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
             * The release state of the plug-in. Valid values:
             * <p>
             * 
             * *   0: The plug-in was released.
             * *   1: The plug-in is being released.
             * *   2: The plug-in failed to be released.
             */
            public Builder publishState(Integer publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * Indicates whether the plug-in is enabled. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
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
             * The version of the plug-in.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The URL of the Object Storage Service (OSS) bucket that stores the WebAssembly plug-in.
             */
            public Builder wasmFile(String wasmFile) {
                this.wasmFile = wasmFile;
                return this;
            }

            /**
             * The WebAssembly language. Valid values:
             * <p>
             * 
             * *   0: C++
             * *   1: TinyGo
             * *   2: Rust
             * *   3: AssemblyScript
             * *   4: Zig
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
