// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeGuestApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestApplicationsResponseBody</p>
 */
public class DescribeGuestApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGuestApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGuestApplicationsResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>272CF39E-B5DE-5BE3-A09B-B43F1026****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestApplicationsResponseBody build() {
            return new DescribeGuestApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGuestApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGuestApplicationsResponseBody</p>
     */
    public static class ProcessData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationVersion")
        private String applicationVersion;

        @com.aliyun.core.annotation.NameInMap("CpuPercent")
        private Double cpuPercent;

        @com.aliyun.core.annotation.NameInMap("GpuPercent")
        private Double gpuPercent;

        @com.aliyun.core.annotation.NameInMap("Iospeed")
        private Double iospeed;

        @com.aliyun.core.annotation.NameInMap("MemPercent")
        private Double memPercent;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        private ProcessData(Builder builder) {
            this.applicationName = builder.applicationName;
            this.applicationVersion = builder.applicationVersion;
            this.cpuPercent = builder.cpuPercent;
            this.gpuPercent = builder.gpuPercent;
            this.iospeed = builder.iospeed;
            this.memPercent = builder.memPercent;
            this.pid = builder.pid;
            this.processPath = builder.processPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessData create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationVersion
         */
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        /**
         * @return cpuPercent
         */
        public Double getCpuPercent() {
            return this.cpuPercent;
        }

        /**
         * @return gpuPercent
         */
        public Double getGpuPercent() {
            return this.gpuPercent;
        }

        /**
         * @return iospeed
         */
        public Double getIospeed() {
            return this.iospeed;
        }

        /**
         * @return memPercent
         */
        public Double getMemPercent() {
            return this.memPercent;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        public static final class Builder {
            private String applicationName; 
            private String applicationVersion; 
            private Double cpuPercent; 
            private Double gpuPercent; 
            private Double iospeed; 
            private Double memPercent; 
            private Integer pid; 
            private String processPath; 

            private Builder() {
            } 

            private Builder(ProcessData model) {
                this.applicationName = model.applicationName;
                this.applicationVersion = model.applicationVersion;
                this.cpuPercent = model.cpuPercent;
                this.gpuPercent = model.gpuPercent;
                this.iospeed = model.iospeed;
                this.memPercent = model.memPercent;
                this.pid = model.pid;
                this.processPath = model.processPath;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Google Chrome</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>115.0.5790.110</p>
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * <p>The CPU utilization (%).</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder cpuPercent(Double cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * <p>The GPU usage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder gpuPercent(Double gpuPercent) {
                this.gpuPercent = gpuPercent;
                return this;
            }

            /**
             * <p>The I/O read and write performance. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>124906.0</p>
             */
            public Builder iospeed(Double iospeed) {
                this.iospeed = iospeed;
                return this;
            }

            /**
             * <p>The memory usage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder memPercent(Double memPercent) {
                this.memPercent = memPercent;
                return this;
            }

            /**
             * <p>The PID.</p>
             * 
             * <strong>example:</strong>
             * <p>1357</p>
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The path to the process.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\Google\Chrome\Application\ch****.exe</p>
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            public ProcessData build() {
                return new ProcessData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGuestApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGuestApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationVersion")
        private String applicationVersion;

        @com.aliyun.core.annotation.NameInMap("CpuPercent")
        private Double cpuPercent;

        @com.aliyun.core.annotation.NameInMap("GpuPercent")
        private Double gpuPercent;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("IoSpeed")
        private Double ioSpeed;

        @com.aliyun.core.annotation.NameInMap("MemPercent")
        private Double memPercent;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("ProcessData")
        private java.util.List<ProcessData> processData;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Applications(Builder builder) {
            this.applicationName = builder.applicationName;
            this.applicationVersion = builder.applicationVersion;
            this.cpuPercent = builder.cpuPercent;
            this.gpuPercent = builder.gpuPercent;
            this.iconUrl = builder.iconUrl;
            this.ioSpeed = builder.ioSpeed;
            this.memPercent = builder.memPercent;
            this.pid = builder.pid;
            this.processData = builder.processData;
            this.processPath = builder.processPath;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationVersion
         */
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        /**
         * @return cpuPercent
         */
        public Double getCpuPercent() {
            return this.cpuPercent;
        }

        /**
         * @return gpuPercent
         */
        public Double getGpuPercent() {
            return this.gpuPercent;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return ioSpeed
         */
        public Double getIoSpeed() {
            return this.ioSpeed;
        }

        /**
         * @return memPercent
         */
        public Double getMemPercent() {
            return this.memPercent;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return processData
         */
        public java.util.List<ProcessData> getProcessData() {
            return this.processData;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationName; 
            private String applicationVersion; 
            private Double cpuPercent; 
            private Double gpuPercent; 
            private String iconUrl; 
            private Double ioSpeed; 
            private Double memPercent; 
            private Integer pid; 
            private java.util.List<ProcessData> processData; 
            private String processPath; 
            private String status; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationName = model.applicationName;
                this.applicationVersion = model.applicationVersion;
                this.cpuPercent = model.cpuPercent;
                this.gpuPercent = model.gpuPercent;
                this.iconUrl = model.iconUrl;
                this.ioSpeed = model.ioSpeed;
                this.memPercent = model.memPercent;
                this.pid = model.pid;
                this.processData = model.processData;
                this.processPath = model.processPath;
                this.status = model.status;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Google Chrome</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>115.0.5790.110</p>
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * <p>The CPU utilization (%).</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder cpuPercent(Double cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * <p>The GPU utilization (%).</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder gpuPercent(Double gpuPercent) {
                this.gpuPercent = gpuPercent;
                return this;
            }

            /**
             * <p>The icon URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/market/preload/default****.png">https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/market/preload/default****.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The I/O read and write performance. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>124906.0</p>
             */
            public Builder ioSpeed(Double ioSpeed) {
                this.ioSpeed = ioSpeed;
                return this;
            }

            /**
             * <p>The memory utilization (%).</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder memPercent(Double memPercent) {
                this.memPercent = memPercent;
                return this;
            }

            /**
             * <p>The process ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>1357</p>
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The processes.</p>
             */
            public Builder processData(java.util.List<ProcessData> processData) {
                this.processData = processData;
                return this;
            }

            /**
             * <p>The path to the process.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\Google\Chrome\Application\ch****.exe</p>
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * <p>The status of the application.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Idle: The application is installed in the cloud computer but is not running.</li>
             * <li>Running: The application has been installed in the cloud computer and is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
