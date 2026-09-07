// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetConnectorClientResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectorClientResponseBody</p>
 */
public class GetConnectorClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectorClient")
    private ConnectorClient connectorClient;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConnectorClientResponseBody(Builder builder) {
        this.connectorClient = builder.connectorClient;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectorClientResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectorClient
     */
    public ConnectorClient getConnectorClient() {
        return this.connectorClient;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConnectorClient connectorClient; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetConnectorClientResponseBody model) {
            this.connectorClient = model.connectorClient;
            this.requestId = model.requestId;
        } 

        /**
         * <p>ConnectorClient。</p>
         */
        public Builder connectorClient(ConnectorClient connectorClient) {
            this.connectorClient = connectorClient;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConnectorClientResponseBody build() {
            return new GetConnectorClientResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConnectorClientResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectorClientResponseBody</p>
     */
    public static class ConnectorClient extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPUSize")
        private String CPUSize;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
        private String connectorVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("Hosname")
        private String hosname;

        @com.aliyun.core.annotation.NameInMap("KernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("ProcessRunTime")
        private Integer processRunTime;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("ReleaseNotes")
        private java.util.List<String> releaseNotes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        @com.aliyun.core.annotation.NameInMap("VersionToRollback")
        private String versionToRollback;

        private ConnectorClient(Builder builder) {
            this.CPUSize = builder.CPUSize;
            this.connectionStatus = builder.connectionStatus;
            this.connectorId = builder.connectorId;
            this.connectorVersion = builder.connectorVersion;
            this.createTime = builder.createTime;
            this.devTag = builder.devTag;
            this.hosname = builder.hosname;
            this.kernelVersion = builder.kernelVersion;
            this.memorySize = builder.memorySize;
            this.operationStatus = builder.operationStatus;
            this.privateIp = builder.privateIp;
            this.processRunTime = builder.processRunTime;
            this.publicIp = builder.publicIp;
            this.releaseNotes = builder.releaseNotes;
            this.status = builder.status;
            this.upgradeStatus = builder.upgradeStatus;
            this.versionToRollback = builder.versionToRollback;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectorClient create() {
            return builder().build();
        }

        /**
         * @return CPUSize
         */
        public String getCPUSize() {
            return this.CPUSize;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorVersion
         */
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return hosname
         */
        public String getHosname() {
            return this.hosname;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return processRunTime
         */
        public Integer getProcessRunTime() {
            return this.processRunTime;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return releaseNotes
         */
        public java.util.List<String> getReleaseNotes() {
            return this.releaseNotes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return versionToRollback
         */
        public String getVersionToRollback() {
            return this.versionToRollback;
        }

        public static final class Builder {
            private String CPUSize; 
            private String connectionStatus; 
            private String connectorId; 
            private String connectorVersion; 
            private String createTime; 
            private String devTag; 
            private String hosname; 
            private String kernelVersion; 
            private String memorySize; 
            private String operationStatus; 
            private String privateIp; 
            private Integer processRunTime; 
            private String publicIp; 
            private java.util.List<String> releaseNotes; 
            private String status; 
            private String upgradeStatus; 
            private String versionToRollback; 

            private Builder() {
            } 

            private Builder(ConnectorClient model) {
                this.CPUSize = model.CPUSize;
                this.connectionStatus = model.connectionStatus;
                this.connectorId = model.connectorId;
                this.connectorVersion = model.connectorVersion;
                this.createTime = model.createTime;
                this.devTag = model.devTag;
                this.hosname = model.hosname;
                this.kernelVersion = model.kernelVersion;
                this.memorySize = model.memorySize;
                this.operationStatus = model.operationStatus;
                this.privateIp = model.privateIp;
                this.processRunTime = model.processRunTime;
                this.publicIp = model.publicIp;
                this.releaseNotes = model.releaseNotes;
                this.status = model.status;
                this.upgradeStatus = model.upgradeStatus;
                this.versionToRollback = model.versionToRollback;
            } 

            /**
             * <p>The number of CPUs of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder CPUSize(String CPUSize) {
                this.CPUSize = CPUSize;
                return this;
            }

            /**
             * <p>The connection status of the ConnectorClient. Valid values:</p>
             * <ul>
             * <li><strong>Connected</strong>: Connected.</li>
             * <li><strong>Disconnected</strong>: Disconnected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>ConnectorID。</p>
             * 
             * <strong>example:</strong>
             * <p>connector-94db94e06b98****</p>
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * <p>The connector client version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder connectorVersion(String connectorVersion) {
                this.connectorVersion = connectorVersion;
                return this;
            }

            /**
             * <p>The creation time of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-16 17:18:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique device identifier of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>E86266A0-2859-58EF-8F5B-EDE226FF6EB2</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>connector_client_hostname</p>
             */
            public Builder hosname(String hosname) {
                this.hosname = hosname;
                return this;
            }

            /**
             * <p>The kernel version of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>22.3.0</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The memory size of the ConnectorClient. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>32768</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The O&amp;M status. Valid values:</p>
             * <ul>
             * <li><strong>Running</strong>: O&amp;M in progress.</li>
             * <li><strong>Failed</strong>: O&amp;M failed.</li>
             * <li>(Empty string): Not in O&amp;M status.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>The private IP address of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The program runtime. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder processRunTime(Integer processRunTime) {
                this.processRunTime = processRunTime;
                return this;
            }

            /**
             * <p>The public IP address of the ConnectorClient.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.1</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * <p>The release notes.</p>
             */
            public Builder releaseNotes(java.util.List<String> releaseNotes) {
                this.releaseNotes = releaseNotes;
                return this;
            }

            /**
             * <p>The enabled status of the ConnectorClient, which can be used to force the client offline. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The new version status of the connector. Valid values:</p>
             * <ul>
             * <li><strong>Latest</strong>: The current version is the latest.</li>
             * <li><strong>NewVersionAvailable</strong>: A newer version is available for upgrade.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * <p>The version to roll back to.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder versionToRollback(String versionToRollback) {
                this.versionToRollback = versionToRollback;
                return this;
            }

            public ConnectorClient build() {
                return new ConnectorClient(this);
            } 

        } 

    }
}
