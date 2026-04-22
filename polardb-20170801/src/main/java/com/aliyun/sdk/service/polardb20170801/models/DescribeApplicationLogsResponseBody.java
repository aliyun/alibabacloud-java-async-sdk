// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationLogsResponseBody</p>
 */
public class DescribeApplicationLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeApplicationLogsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String applicationId; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeApplicationLogsResponseBody model) {
            this.applicationId = model.applicationId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeApplicationLogsResponseBody build() {
            return new DescribeApplicationLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationLogsResponseBody</p>
     */
    public static class LogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("FileLine")
        private String fileLine;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FullFilePath")
        private String fullFilePath;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("LogLevelId")
        private Long logLevelId;

        @com.aliyun.core.annotation.NameInMap("LogLevelName")
        private String logLevelName;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeVersion")
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private LogRecords(Builder builder) {
            this.componentName = builder.componentName;
            this.containerName = builder.containerName;
            this.content = builder.content;
            this.date = builder.date;
            this.fileLine = builder.fileLine;
            this.fileName = builder.fileName;
            this.fullFilePath = builder.fullFilePath;
            this.hostname = builder.hostname;
            this.logLevelId = builder.logLevelId;
            this.logLevelName = builder.logLevelName;
            this.method = builder.method;
            this.name = builder.name;
            this.runtime = builder.runtime;
            this.runtimeVersion = builder.runtimeVersion;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogRecords create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return fileLine
         */
        public String getFileLine() {
            return this.fileLine;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fullFilePath
         */
        public String getFullFilePath() {
            return this.fullFilePath;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return logLevelId
         */
        public Long getLogLevelId() {
            return this.logLevelId;
        }

        /**
         * @return logLevelName
         */
        public String getLogLevelName() {
            return this.logLevelName;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return runtimeVersion
         */
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String componentName; 
            private String containerName; 
            private String content; 
            private String date; 
            private String fileLine; 
            private String fileName; 
            private String fullFilePath; 
            private String hostname; 
            private Long logLevelId; 
            private String logLevelName; 
            private String method; 
            private String name; 
            private String runtime; 
            private String runtimeVersion; 
            private String time; 

            private Builder() {
            } 

            private Builder(LogRecords model) {
                this.componentName = model.componentName;
                this.containerName = model.containerName;
                this.content = model.content;
                this.date = model.date;
                this.fileLine = model.fileLine;
                this.fileName = model.fileName;
                this.fullFilePath = model.fullFilePath;
                this.hostname = model.hostname;
                this.logLevelId = model.logLevelId;
                this.logLevelName = model.logLevelName;
                this.method = model.method;
                this.name = model.name;
                this.runtime = model.runtime;
                this.runtimeVersion = model.runtimeVersion;
                this.time = model.time;
            } 

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * FileLine.
             */
            public Builder fileLine(String fileLine) {
                this.fileLine = fileLine;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FullFilePath.
             */
            public Builder fullFilePath(String fullFilePath) {
                this.fullFilePath = fullFilePath;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * LogLevelId.
             */
            public Builder logLevelId(Long logLevelId) {
                this.logLevelId = logLevelId;
                return this;
            }

            /**
             * LogLevelName.
             */
            public Builder logLevelName(String logLevelName) {
                this.logLevelName = logLevelName;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * RuntimeVersion.
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public LogRecords build() {
                return new LogRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogRecords")
        private java.util.List<LogRecords> logRecords;

        private Items(Builder builder) {
            this.logRecords = builder.logRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return logRecords
         */
        public java.util.List<LogRecords> getLogRecords() {
            return this.logRecords;
        }

        public static final class Builder {
            private java.util.List<LogRecords> logRecords; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.logRecords = model.logRecords;
            } 

            /**
             * LogRecords.
             */
            public Builder logRecords(java.util.List<LogRecords> logRecords) {
                this.logRecords = logRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
