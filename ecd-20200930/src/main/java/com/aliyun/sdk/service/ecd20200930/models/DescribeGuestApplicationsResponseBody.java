// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestApplicationsResponseBody</p>
 */
public class DescribeGuestApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List < Applications> applications;

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

    /**
     * @return applications
     */
    public java.util.List < Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Applications> applications; 
        private String requestId; 

        /**
         * The details of the applications.
         */
        public Builder applications(java.util.List < Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestApplicationsResponseBody build() {
            return new DescribeGuestApplicationsResponseBody(this);
        } 

    } 

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

            /**
             * The application name.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The application version.
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * The CPU utilization (%).
             */
            public Builder cpuPercent(Double cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * The GPU utilization (%).
             */
            public Builder gpuPercent(Double gpuPercent) {
                this.gpuPercent = gpuPercent;
                return this;
            }

            /**
             * The I/O read and write performance.
             */
            public Builder iospeed(Double iospeed) {
                this.iospeed = iospeed;
                return this;
            }

            /**
             * The memory utilization (%).
             */
            public Builder memPercent(Double memPercent) {
                this.memPercent = memPercent;
                return this;
            }

            /**
             * The PID.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The path to the process.
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
        private java.util.List < ProcessData> processData;

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
        public java.util.List < ProcessData> getProcessData() {
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
            private java.util.List < ProcessData> processData; 
            private String processPath; 
            private String status; 

            /**
             * The application name.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The application version.
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * The CPU utilization (%).
             */
            public Builder cpuPercent(Double cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * The GPU utilization (%).
             */
            public Builder gpuPercent(Double gpuPercent) {
                this.gpuPercent = gpuPercent;
                return this;
            }

            /**
             * The icon URL of the application.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * The I/O read and write performance.
             */
            public Builder ioSpeed(Double ioSpeed) {
                this.ioSpeed = ioSpeed;
                return this;
            }

            /**
             * The memory utilization (%).
             */
            public Builder memPercent(Double memPercent) {
                this.memPercent = memPercent;
                return this;
            }

            /**
             * The process ID (PID).
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The process information.
             */
            public Builder processData(java.util.List < ProcessData> processData) {
                this.processData = processData;
                return this;
            }

            /**
             * The path to the process.
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * The application status.
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
