// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentStatusesResponseBody</p>
 */
public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NodeStatusList")
    private NodeStatusList nodeStatusList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMonitoringAgentStatusesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nodeStatusList = builder.nodeStatusList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentStatusesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeStatusList
     */
    public NodeStatusList getNodeStatusList() {
        return this.nodeStatusList;
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
        private String code; 
        private String message; 
        private NodeStatusList nodeStatusList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
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
         * The host status information.
         */
        public Builder nodeStatusList(NodeStatusList nodeStatusList) {
            this.nodeStatusList = nodeStatusList;
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
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringAgentStatusesResponseBody build() {
            return new DescribeMonitoringAgentStatusesResponseBody(this);
        } 

    } 

    public static class NodeStatus extends TeaModel {
        @NameInMap("AutoInstall")
        private Boolean autoInstall;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OsMonitorConfig")
        private String osMonitorConfig;

        @NameInMap("OsMonitorErrorCode")
        private String osMonitorErrorCode;

        @NameInMap("OsMonitorErrorDetail")
        private String osMonitorErrorDetail;

        @NameInMap("OsMonitorStatus")
        private String osMonitorStatus;

        @NameInMap("OsMonitorVersion")
        private String osMonitorVersion;

        @NameInMap("Status")
        private String status;

        private NodeStatus(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.instanceId = builder.instanceId;
            this.osMonitorConfig = builder.osMonitorConfig;
            this.osMonitorErrorCode = builder.osMonitorErrorCode;
            this.osMonitorErrorDetail = builder.osMonitorErrorDetail;
            this.osMonitorStatus = builder.osMonitorStatus;
            this.osMonitorVersion = builder.osMonitorVersion;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeStatus create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return osMonitorConfig
         */
        public String getOsMonitorConfig() {
            return this.osMonitorConfig;
        }

        /**
         * @return osMonitorErrorCode
         */
        public String getOsMonitorErrorCode() {
            return this.osMonitorErrorCode;
        }

        /**
         * @return osMonitorErrorDetail
         */
        public String getOsMonitorErrorDetail() {
            return this.osMonitorErrorDetail;
        }

        /**
         * @return osMonitorStatus
         */
        public String getOsMonitorStatus() {
            return this.osMonitorStatus;
        }

        /**
         * @return osMonitorVersion
         */
        public String getOsMonitorVersion() {
            return this.osMonitorVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private String instanceId; 
            private String osMonitorConfig; 
            private String osMonitorErrorCode; 
            private String osMonitorErrorDetail; 
            private String osMonitorStatus; 
            private String osMonitorVersion; 
            private String status; 

            /**
             * Indicates whether the CloudMonitor agent is automatically installed. Valid values:
             * <p>
             * 
             * *   true: The CloudMonitor agent is automatically installed.
             * *   false: The CloudMonitor agent is not automatically installed.
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the SysAK monitoring feature is enabled.`` Valid values:
             * <p>
             * 
             * *   `true`: The SysAK monitoring feature is enabled.
             * *   `false`: the SysAK monitoring feature is disabled.
             */
            public Builder osMonitorConfig(String osMonitorConfig) {
                this.osMonitorConfig = osMonitorConfig;
                return this;
            }

            /**
             * The error status of SysOM. Valid values:
             * <p>
             * 
             * *   `install_fail`: SysOM fails to be installed or an unknown error occurs.
             * *   `install_assist_invalid`: SysOM fails to be installed because the status of Cloud Assistant is invalid.
             * *   `install_assist_command_fail`: SysOM fails to be installed because the installation command fails to run.
             * *   `uninstall_fail`: SysOM fails to be uninstalled or an unknown error occurs.
             * *   `uninstall_assist_invalid`: SysOM fails to be uninstalled because the status of Cloud Assistant is invalid.
             * *   `uninstall_assist_command_fail`: SysOM fails to be uninstalled because the uninstallation command fails to run.
             */
            public Builder osMonitorErrorCode(String osMonitorErrorCode) {
                this.osMonitorErrorCode = osMonitorErrorCode;
                return this;
            }

            /**
             * The details of the execution error. Valid values:
             * <p>
             * 
             * *   `Command.ErrorCode.Fail.Downlaod.REGIN_ID`: Failed to obtain the region ID.
             * *   `Command.ErrorCode.Fail.Downlaod.SYSAK`: Failed to download the .rpm package of System Analyse Kit (SysAK).
             * *   `Command.ErrorCode.Fail.Downlaod.CMON_FILE`: Failed to download the CMON file.
             * *   `Command.ErrorCode.Fail.Downlaod.BTF`: Failed to start SysAK because the BTF file is not found.
             * *   `Command.ErrorCode.Fail.Start.SYSAK`: Failed to start SysAK due to an unknown error.
             */
            public Builder osMonitorErrorDetail(String osMonitorErrorDetail) {
                this.osMonitorErrorDetail = osMonitorErrorDetail;
                return this;
            }

            /**
             * The status of SysOM. Valid values:
             * <p>
             * 
             * *   installing: SysOM is being installed.
             * *   running: SysOM is running.
             * *   stopped: SysOM is stopped.
             * *   uninstalling: SysOM is being uninstalled.
             */
            public Builder osMonitorStatus(String osMonitorStatus) {
                this.osMonitorStatus = osMonitorStatus;
                return this;
            }

            /**
             * The SysOM version.
             */
            public Builder osMonitorVersion(String osMonitorVersion) {
                this.osMonitorVersion = osMonitorVersion;
                return this;
            }

            /**
             * The status of the CloudMonitor agent. Valid values:
             * <p>
             * 
             * *   running: The CloudMonitor agent is running.
             * *   stopped: The CloudMonitor agent is stopped.
             * *   installing: The CloudMonitor agent is being installed.
             * *   install_faild: The CloudMonitor agent fails to be installed.
             * *   abnormal: The CloudMonitor agent is not properly installed.
             * *   not_installed: The CloudMonitor agent is not installed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NodeStatus build() {
                return new NodeStatus(this);
            } 

        } 

    }
    public static class NodeStatusList extends TeaModel {
        @NameInMap("NodeStatus")
        private java.util.List < NodeStatus> nodeStatus;

        private NodeStatusList(Builder builder) {
            this.nodeStatus = builder.nodeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeStatusList create() {
            return builder().build();
        }

        /**
         * @return nodeStatus
         */
        public java.util.List < NodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

        public static final class Builder {
            private java.util.List < NodeStatus> nodeStatus; 

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(java.util.List < NodeStatus> nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            public NodeStatusList build() {
                return new NodeStatusList(this);
            } 

        } 

    }
}
