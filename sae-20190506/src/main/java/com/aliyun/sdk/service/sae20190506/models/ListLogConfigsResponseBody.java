// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogConfigsResponseBody</p>
 */
public class ListLogConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListLogConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Indicates whether the logging configurations of an application were obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the configurations were obtained.
         * *   **false**: indicates that the configurations could not be obtained.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of logging configurations.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the trace. It can be used to query the details of a request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   **success** is returned when the request succeeds.
         * *   An error code is returned when the request fails.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The logging configurations.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListLogConfigsResponseBody build() {
            return new ListLogConfigsResponseBody(this);
        } 

    } 

    public static class LogConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LogDir")
        private String logDir;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SlsLogStore")
        private String slsLogStore;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        @com.aliyun.core.annotation.NameInMap("StoreType")
        private String storeType;

        private LogConfigs(Builder builder) {
            this.configName = builder.configName;
            this.createTime = builder.createTime;
            this.logDir = builder.logDir;
            this.logType = builder.logType;
            this.regionId = builder.regionId;
            this.slsLogStore = builder.slsLogStore;
            this.slsProject = builder.slsProject;
            this.storeType = builder.storeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfigs create() {
            return builder().build();
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return logDir
         */
        public String getLogDir() {
            return this.logDir;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return slsLogStore
         */
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
        }

        /**
         * @return storeType
         */
        public String getStoreType() {
            return this.storeType;
        }

        public static final class Builder {
            private String configName; 
            private String createTime; 
            private String logDir; 
            private String logType; 
            private String regionId; 
            private String slsLogStore; 
            private String slsProject; 
            private String storeType; 

            /**
             * The path of logs.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * The storage type of logs.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the Logstore in Log Service.
             */
            public Builder logDir(String logDir) {
                this.logDir = logDir;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * The number of the returned page.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the configuration was created.
             */
            public Builder slsLogStore(String slsLogStore) {
                this.slsLogStore = slsLogStore;
                return this;
            }

            /**
             * The type of the log. Set this value to **file_log**.
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * The ID of the Log Service project.
             */
            public Builder storeType(String storeType) {
                this.storeType = storeType;
                return this;
            }

            public LogConfigs build() {
                return new LogConfigs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LogConfigs")
        private java.util.List < LogConfigs> logConfigs;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.logConfigs = builder.logConfigs;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return logConfigs
         */
        public java.util.List < LogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List < LogConfigs> logConfigs; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * The total number of returned entries.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The name of the Log Service configuration.
             */
            public Builder logConfigs(java.util.List < LogConfigs> logConfigs) {
                this.logConfigs = logConfigs;
                return this;
            }

            /**
             * The error code.
             * <p>
             * 
             * *   The **ErrorCode** parameter is not returned when the request succeeds.
             * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
