// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
         * <p>Indicates whether the logging configurations of an application were obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the configurations were obtained.</li>
         * <li><strong>false</strong>: indicates that the configurations could not be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of logging configurations.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the trace. It can be used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li><strong>success</strong> is returned when the request succeeds.</li>
         * <li>An error code is returned when the request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
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
         * <p>The logging configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1d5e2c15671581252413581d****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListLogConfigsResponseBody build() {
            return new ListLogConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogConfigsResponseBody</p>
     */
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
             * <p>The path of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-1f240907a6faf58c653f09e81b7e****</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>The storage type of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-29 17:18:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the Logstore in Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/logs/hsf/hsf.log</p>
             */
            public Builder logDir(String logDir) {
                this.logDir = logDir;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>file_log</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-1f240907a6faf58c653f09e81b7e****</p>
             */
            public Builder slsLogStore(String slsLogStore) {
                this.slsLogStore = slsLogStore;
                return this;
            }

            /**
             * <p>The type of the log. Set this value to <strong>file_log</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-56f77b65-788d-442a-9885-7f20d91f****</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The ID of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
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
    /**
     * 
     * {@link ListLogConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LogConfigs")
        private java.util.List<LogConfigs> logConfigs;

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
        public java.util.List<LogConfigs> getLogConfigs() {
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
            private java.util.List<LogConfigs> logConfigs; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The name of the Log Service configuration.</p>
             */
            public Builder logConfigs(java.util.List<LogConfigs> logConfigs) {
                this.logConfigs = logConfigs;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
