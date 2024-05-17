// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectorsResponseBody</p>
 */
public class ListConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connectors")
    private java.util.List < Connectors> connectors;

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

    /**
     * @return connectors
     */
    public java.util.List < Connectors> getConnectors() {
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
        private java.util.List < Connectors> connectors; 
        private String requestId; 
        private Integer totalNum; 

        /**
         * Connectors.
         */
        public Builder connectors(java.util.List < Connectors> connectors) {
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
    public static class Connectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List < Applications> applications;

        @com.aliyun.core.annotation.NameInMap("ConnectorClients")
        private java.util.List < ConnectorClients> connectorClients;

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
        public java.util.List < Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return connectorClients
         */
        public java.util.List < ConnectorClients> getConnectorClients() {
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
            private java.util.List < Applications> applications; 
            private java.util.List < ConnectorClients> connectorClients; 
            private String connectorId; 
            private String createTime; 
            private String name; 
            private String regionId; 
            private String status; 
            private String switchStatus; 
            private UpgradeTime upgradeTime; 

            /**
             * Applications.
             */
            public Builder applications(java.util.List < Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * ConnectorClients.
             */
            public Builder connectorClients(java.util.List < ConnectorClients> connectorClients) {
                this.connectorClients = connectorClients;
                return this;
            }

            /**
             * ConnectorID。
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
