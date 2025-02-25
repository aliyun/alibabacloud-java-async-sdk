// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentStatusesResponseBody</p>
 */
public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeStatusList")
    private NodeStatusList nodeStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The host status information.</p>
         */
        public Builder nodeStatusList(NodeStatusList nodeStatusList) {
            this.nodeStatusList = nodeStatusList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6F8371DF-AB81-41B8-9E1B-5493B3FF0E4F</p>
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

        public DescribeMonitoringAgentStatusesResponseBody build() {
            return new DescribeMonitoringAgentStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitoringAgentStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentStatusesResponseBody</p>
     */
    public static class NodeStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInstallErrorCode")
        private String agentInstallErrorCode;

        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Boolean autoInstall;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OsMonitorConfig")
        private String osMonitorConfig;

        @com.aliyun.core.annotation.NameInMap("OsMonitorErrorCode")
        private String osMonitorErrorCode;

        @com.aliyun.core.annotation.NameInMap("OsMonitorErrorDetail")
        private String osMonitorErrorDetail;

        @com.aliyun.core.annotation.NameInMap("OsMonitorStatus")
        private String osMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("OsMonitorVersion")
        private String osMonitorVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NodeStatus(Builder builder) {
            this.agentInstallErrorCode = builder.agentInstallErrorCode;
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
         * @return agentInstallErrorCode
         */
        public String getAgentInstallErrorCode() {
            return this.agentInstallErrorCode;
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
            private String agentInstallErrorCode; 
            private Boolean autoInstall; 
            private String instanceId; 
            private String osMonitorConfig; 
            private String osMonitorErrorCode; 
            private String osMonitorErrorDetail; 
            private String osMonitorStatus; 
            private String osMonitorVersion; 
            private String status; 

            /**
             * <p>The error code returned when the CloudMonitor agent is installed. Valid values:</p>
             * <ul>
             * <li>Common.Timeout: The installation timed out.</li>
             * <li>Common.SLR: The service-linked role for CloudMonitor is unauthorized.</li>
             * <li>Common.OS: The operating system is not supported.</li>
             * <li>Assist.Invalid: Cloud Assistant is not running.</li>
             * <li>Assist.Invoke: An error occurred when the installation program is started.</li>
             * <li>Assist.Execute: An error occurred when the installation program is running.</li>
             * </ul>
             */
            public Builder agentInstallErrorCode(String agentInstallErrorCode) {
                this.agentInstallErrorCode = agentInstallErrorCode;
                return this;
            }

            /**
             * <p>Indicates whether the CloudMonitor agent is automatically installed. Valid values:</p>
             * <ul>
             * <li>true: The CloudMonitor agent is automatically installed.</li>
             * <li>false: The CloudMonitor agent is not automatically installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp3dunahluwajv6f****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the SysAK monitoring feature is enabled.`` Valid values:</p>
             * <ul>
             * <li><code>true</code>: The SysAK monitoring feature is enabled.</li>
             * <li><code>false</code>: the SysAK monitoring feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;sysak&quot;:true}</p>
             */
            public Builder osMonitorConfig(String osMonitorConfig) {
                this.osMonitorConfig = osMonitorConfig;
                return this;
            }

            /**
             * <p>The error status of SysOM. Valid values:</p>
             * <ul>
             * <li><code>install_fail</code>: SysOM fails to be installed or an unknown error occurs.</li>
             * <li><code>install_assist_invalid</code>: SysOM fails to be installed because the status of Cloud Assistant is invalid.</li>
             * <li><code>install_assist_command_fail</code>: SysOM fails to be installed because the installation command fails to run.</li>
             * <li><code>uninstall_fail</code>: SysOM fails to be uninstalled or an unknown error occurs.</li>
             * <li><code>uninstall_assist_invalid</code>: SysOM fails to be uninstalled because the status of Cloud Assistant is invalid.</li>
             * <li><code>uninstall_assist_command_fail</code>: SysOM fails to be uninstalled because the uninstallation command fails to run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>install_fail</p>
             */
            public Builder osMonitorErrorCode(String osMonitorErrorCode) {
                this.osMonitorErrorCode = osMonitorErrorCode;
                return this;
            }

            /**
             * <p>The details of the execution error. Valid values:</p>
             * <ul>
             * <li><code>Command.ErrorCode.Fail.Downlaod.REGIN_ID</code>: Failed to obtain the region ID.</li>
             * <li><code>Command.ErrorCode.Fail.Downlaod.SYSAK</code>: Failed to download the .rpm package of System Analyse Kit (SysAK).</li>
             * <li><code>Command.ErrorCode.Fail.Downlaod.CMON_FILE</code>: Failed to download the CMON file.</li>
             * <li><code>Command.ErrorCode.Fail.Downlaod.BTF</code>: Failed to start SysAK because the BTF file is not found.</li>
             * <li><code>Command.ErrorCode.Fail.Start.SYSAK</code>: Failed to start SysAK due to an unknown error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Command.ErrorCode.Fail.Downlaod.REGIN_ID</p>
             */
            public Builder osMonitorErrorDetail(String osMonitorErrorDetail) {
                this.osMonitorErrorDetail = osMonitorErrorDetail;
                return this;
            }

            /**
             * <p>The status of SysOM. Valid values:</p>
             * <ul>
             * <li>installing: SysOM is being installed.</li>
             * <li>running: SysOM is running.</li>
             * <li>stopped: SysOM is stopped.</li>
             * <li>uninstalling: SysOM is being uninstalled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder osMonitorStatus(String osMonitorStatus) {
                this.osMonitorStatus = osMonitorStatus;
                return this;
            }

            /**
             * <p>The SysOM version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.0-12</p>
             */
            public Builder osMonitorVersion(String osMonitorVersion) {
                this.osMonitorVersion = osMonitorVersion;
                return this;
            }

            /**
             * <p>The status of the CloudMonitor agent. Valid values:</p>
             * <ul>
             * <li>running: The CloudMonitor agent is running.</li>
             * <li>stopped: The CloudMonitor agent is stopped.</li>
             * <li>installing: The CloudMonitor agent is being installed.</li>
             * <li>install_faild: The CloudMonitor agent fails to be installed.</li>
             * <li>abnormal: The CloudMonitor agent is not properly installed.</li>
             * <li>not_installed: The CloudMonitor agent is not installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
    /**
     * 
     * {@link DescribeMonitoringAgentStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentStatusesResponseBody</p>
     */
    public static class NodeStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeStatus")
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
