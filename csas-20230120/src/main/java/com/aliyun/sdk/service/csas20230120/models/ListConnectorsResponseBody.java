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
 * {@link ListConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectorsResponseBody</p>
 */
public class ListConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connectors")
    private java.util.List<Connectors> connectors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListConnectorsResponseBody(Builder builder) {
        this.connectors = builder.connectors;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectors
     */
    public java.util.List<Connectors> getConnectors() {
        return this.connectors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Connectors> connectors; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListConnectorsResponseBody model) {
            this.connectors = model.connectors;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * Connectors.
         */
        public Builder connectors(java.util.List<Connectors> connectors) {
            this.connectors = connectors;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListConnectorsResponseBody build() {
            return new ListConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationName; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
            } 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class ConnectorClients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        private ConnectorClients(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.devTag = builder.devTag;
            this.hostname = builder.hostname;
            this.publicIp = builder.publicIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectorClients create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String devTag; 
            private String hostname; 
            private String publicIp; 

            private Builder() {
            } 

            private Builder(ConnectorClients model) {
                this.connectionStatus = model.connectionStatus;
                this.devTag = model.devTag;
                this.hostname = model.hostname;
                this.publicIp = model.publicIp;
            } 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
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
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            public ConnectorClients build() {
                return new ConnectorClients(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class UpgradeTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private UpgradeTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeTime create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(UpgradeTime model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public UpgradeTime build() {
                return new UpgradeTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class Connectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("ClusterIP")
        private String clusterIP;

        @com.aliyun.core.annotation.NameInMap("ClusterPort")
        private String clusterPort;

        @com.aliyun.core.annotation.NameInMap("ConnectorClients")
        private java.util.List<ConnectorClients> connectorClients;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        private String switchStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeTime")
        private UpgradeTime upgradeTime;

        private Connectors(Builder builder) {
            this.applications = builder.applications;
            this.clusterIP = builder.clusterIP;
            this.clusterPort = builder.clusterPort;
            this.connectorClients = builder.connectorClients;
            this.connectorId = builder.connectorId;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.switchStatus = builder.switchStatus;
            this.upgradeTime = builder.upgradeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connectors create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return clusterIP
         */
        public String getClusterIP() {
            return this.clusterIP;
        }

        /**
         * @return clusterPort
         */
        public String getClusterPort() {
            return this.clusterPort;
        }

        /**
         * @return connectorClients
         */
        public java.util.List<ConnectorClients> getConnectorClients() {
            return this.connectorClients;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return upgradeTime
         */
        public UpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private String clusterIP; 
            private String clusterPort; 
            private java.util.List<ConnectorClients> connectorClients; 
            private String connectorId; 
            private String createTime; 
            private String name; 
            private String regionId; 
            private String status; 
            private String switchStatus; 
            private UpgradeTime upgradeTime; 

            private Builder() {
            } 

            private Builder(Connectors model) {
                this.applications = model.applications;
                this.clusterIP = model.clusterIP;
                this.clusterPort = model.clusterPort;
                this.connectorClients = model.connectorClients;
                this.connectorId = model.connectorId;
                this.createTime = model.createTime;
                this.name = model.name;
                this.regionId = model.regionId;
                this.status = model.status;
                this.switchStatus = model.switchStatus;
                this.upgradeTime = model.upgradeTime;
            } 

            /**
             * Applications.
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * ClusterIP.
             */
            public Builder clusterIP(String clusterIP) {
                this.clusterIP = clusterIP;
                return this;
            }

            /**
             * ClusterPort.
             */
            public Builder clusterPort(String clusterPort) {
                this.clusterPort = clusterPort;
                return this;
            }

            /**
             * ConnectorClients.
             */
            public Builder connectorClients(java.util.List<ConnectorClients> connectorClients) {
                this.connectorClients = connectorClients;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SwitchStatus.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * UpgradeTime.
             */
            public Builder upgradeTime(UpgradeTime upgradeTime) {
                this.upgradeTime = upgradeTime;
                return this;
            }

            public Connectors build() {
                return new Connectors(this);
            } 

        } 

    }
}
