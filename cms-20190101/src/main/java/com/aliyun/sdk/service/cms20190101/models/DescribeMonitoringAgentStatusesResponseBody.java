// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMonitoringAgentStatusesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.nodeStatusList = model.nodeStatusList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
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
         * NodeStatusList.
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

        @com.aliyun.core.annotation.NameInMap("LoongCollectorStatus")
        private String loongCollectorStatus;

        @com.aliyun.core.annotation.NameInMap("LoongCollectorVersion")
        private String loongCollectorVersion;

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
            this.loongCollectorStatus = builder.loongCollectorStatus;
            this.loongCollectorVersion = builder.loongCollectorVersion;
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
         * @return loongCollectorStatus
         */
        public String getLoongCollectorStatus() {
            return this.loongCollectorStatus;
        }

        /**
         * @return loongCollectorVersion
         */
        public String getLoongCollectorVersion() {
            return this.loongCollectorVersion;
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
            private String loongCollectorStatus; 
            private String loongCollectorVersion; 
            private String osMonitorConfig; 
            private String osMonitorErrorCode; 
            private String osMonitorErrorDetail; 
            private String osMonitorStatus; 
            private String osMonitorVersion; 
            private String status; 

            private Builder() {
            } 

            private Builder(NodeStatus model) {
                this.agentInstallErrorCode = model.agentInstallErrorCode;
                this.autoInstall = model.autoInstall;
                this.instanceId = model.instanceId;
                this.loongCollectorStatus = model.loongCollectorStatus;
                this.loongCollectorVersion = model.loongCollectorVersion;
                this.osMonitorConfig = model.osMonitorConfig;
                this.osMonitorErrorCode = model.osMonitorErrorCode;
                this.osMonitorErrorDetail = model.osMonitorErrorDetail;
                this.osMonitorStatus = model.osMonitorStatus;
                this.osMonitorVersion = model.osMonitorVersion;
                this.status = model.status;
            } 

            /**
             * AgentInstallErrorCode.
             */
            public Builder agentInstallErrorCode(String agentInstallErrorCode) {
                this.agentInstallErrorCode = agentInstallErrorCode;
                return this;
            }

            /**
             * AutoInstall.
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LoongCollectorStatus.
             */
            public Builder loongCollectorStatus(String loongCollectorStatus) {
                this.loongCollectorStatus = loongCollectorStatus;
                return this;
            }

            /**
             * LoongCollectorVersion.
             */
            public Builder loongCollectorVersion(String loongCollectorVersion) {
                this.loongCollectorVersion = loongCollectorVersion;
                return this;
            }

            /**
             * OsMonitorConfig.
             */
            public Builder osMonitorConfig(String osMonitorConfig) {
                this.osMonitorConfig = osMonitorConfig;
                return this;
            }

            /**
             * OsMonitorErrorCode.
             */
            public Builder osMonitorErrorCode(String osMonitorErrorCode) {
                this.osMonitorErrorCode = osMonitorErrorCode;
                return this;
            }

            /**
             * OsMonitorErrorDetail.
             */
            public Builder osMonitorErrorDetail(String osMonitorErrorDetail) {
                this.osMonitorErrorDetail = osMonitorErrorDetail;
                return this;
            }

            /**
             * OsMonitorStatus.
             */
            public Builder osMonitorStatus(String osMonitorStatus) {
                this.osMonitorStatus = osMonitorStatus;
                return this;
            }

            /**
             * OsMonitorVersion.
             */
            public Builder osMonitorVersion(String osMonitorVersion) {
                this.osMonitorVersion = osMonitorVersion;
                return this;
            }

            /**
             * Status.
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
        private java.util.List<NodeStatus> nodeStatus;

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
        public java.util.List<NodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

        public static final class Builder {
            private java.util.List<NodeStatus> nodeStatus; 

            private Builder() {
            } 

            private Builder(NodeStatusList model) {
                this.nodeStatus = model.nodeStatus;
            } 

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(java.util.List<NodeStatus> nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            public NodeStatusList build() {
                return new NodeStatusList(this);
            } 

        } 

    }
}
