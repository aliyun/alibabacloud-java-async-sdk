// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceHAConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceHAConfigResponseBody</p>
 */
public class DescribeDBInstanceHAConfigResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("HAMode")
    private String HAMode;

    @NameInMap("HostInstanceInfos")
    private HostInstanceInfos hostInstanceInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncMode")
    private String syncMode;

    private DescribeDBInstanceHAConfigResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.HAMode = builder.HAMode;
        this.hostInstanceInfos = builder.hostInstanceInfos;
        this.requestId = builder.requestId;
        this.syncMode = builder.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceHAConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return HAMode
     */
    public String getHAMode() {
        return this.HAMode;
    }

    /**
     * @return hostInstanceInfos
     */
    public HostInstanceInfos getHostInstanceInfos() {
        return this.hostInstanceInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncMode
     */
    public String getSyncMode() {
        return this.syncMode;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String HAMode; 
        private HostInstanceInfos hostInstanceInfos; 
        private String requestId; 
        private String syncMode; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * HAMode.
         */
        public Builder HAMode(String HAMode) {
            this.HAMode = HAMode;
            return this;
        }

        /**
         * HostInstanceInfos.
         */
        public Builder hostInstanceInfos(HostInstanceInfos hostInstanceInfos) {
            this.hostInstanceInfos = hostInstanceInfos;
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
         * SyncMode.
         */
        public Builder syncMode(String syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public DescribeDBInstanceHAConfigResponseBody build() {
            return new DescribeDBInstanceHAConfigResponseBody(this);
        } 

    } 

    public static class NodeInfo extends TeaModel {
        @NameInMap("DataSyncTime")
        private String dataSyncTime;

        @NameInMap("LogSyncTime")
        private String logSyncTime;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SyncStatus")
        private String syncStatus;

        @NameInMap("ZoneId")
        private String zoneId;

        private NodeInfo(Builder builder) {
            this.dataSyncTime = builder.dataSyncTime;
            this.logSyncTime = builder.logSyncTime;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.regionId = builder.regionId;
            this.syncStatus = builder.syncStatus;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return dataSyncTime
         */
        public String getDataSyncTime() {
            return this.dataSyncTime;
        }

        /**
         * @return logSyncTime
         */
        public String getLogSyncTime() {
            return this.logSyncTime;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return syncStatus
         */
        public String getSyncStatus() {
            return this.syncStatus;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String dataSyncTime; 
            private String logSyncTime; 
            private String nodeId; 
            private String nodeType; 
            private String regionId; 
            private String syncStatus; 
            private String zoneId; 

            /**
             * DataSyncTime.
             */
            public Builder dataSyncTime(String dataSyncTime) {
                this.dataSyncTime = dataSyncTime;
                return this;
            }

            /**
             * LogSyncTime.
             */
            public Builder logSyncTime(String logSyncTime) {
                this.logSyncTime = logSyncTime;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
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
             * SyncStatus.
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    public static class HostInstanceInfos extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < NodeInfo> nodeInfo;

        private HostInstanceInfos(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostInstanceInfos create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List < NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < NodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public HostInstanceInfos build() {
                return new HostInstanceInfos(this);
            } 

        } 

    }
}
