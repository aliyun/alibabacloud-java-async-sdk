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
 * {@link UpdateConnectorClientResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConnectorClientResponseBody</p>
 */
public class UpdateConnectorClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectorClient")
    private ConnectorClient connectorClient;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateConnectorClientResponseBody(Builder builder) {
        this.connectorClient = builder.connectorClient;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectorClientResponseBody create() {
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

        private Builder(UpdateConnectorClientResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateConnectorClientResponseBody build() {
            return new UpdateConnectorClientResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConnectorClientResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateConnectorClientResponseBody</p>
     */
    public static class ConnectorClient extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPUSize")
        private String CPUSize;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

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

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionToRollback")
        private String versionToRollback;

        private ConnectorClient(Builder builder) {
            this.CPUSize = builder.CPUSize;
            this.connectionStatus = builder.connectionStatus;
            this.connectorId = builder.connectorId;
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
            this.version = builder.version;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
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
            private String version; 
            private String versionToRollback; 

            private Builder() {
            } 

            private Builder(ConnectorClient model) {
                this.CPUSize = model.CPUSize;
                this.connectionStatus = model.connectionStatus;
                this.connectorId = model.connectorId;
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
                this.version = model.version;
                this.versionToRollback = model.versionToRollback;
            } 

            /**
             * CPUSize.
             */
            public Builder CPUSize(String CPUSize) {
                this.CPUSize = CPUSize;
                return this;
            }

            /**
             * ConnectionStatus.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * Hosname.
             */
            public Builder hosname(String hosname) {
                this.hosname = hosname;
                return this;
            }

            /**
             * KernelVersion.
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * OperationStatus.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * ProcessRunTime.
             */
            public Builder processRunTime(Integer processRunTime) {
                this.processRunTime = processRunTime;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * ReleaseNotes.
             */
            public Builder releaseNotes(java.util.List<String> releaseNotes) {
                this.releaseNotes = releaseNotes;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionToRollback.
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
