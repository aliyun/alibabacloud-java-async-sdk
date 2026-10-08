// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceHAConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceHAConfigResponseBody</p>
 */
public class DescribeDBInstanceHAConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("HAMode")
    private String HAMode;

    @com.aliyun.core.annotation.NameInMap("HostInstanceInfos")
    private HostInstanceInfos hostInstanceInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncMode")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceHAConfigResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.HAMode = model.HAMode;
            this.hostInstanceInfos = model.hostInstanceInfos;
            this.requestId = model.requestId;
            this.syncMode = model.syncMode;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The High-availability Mode. Valid values:</p>
         * <ul>
         * <li><strong>RPO</strong>: Data consistency is preferred. The instance prioritizes data reliability to minimize data loss. Use RPO mode if you have high requirements for data consistency.</li>
         * <li><strong>RTO</strong>: Instance availability is preferred. The instance recovers services as soon as possible to maximize available time. Use RTO mode if you have high requirements for database uptime.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RPO</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data replication mode. Valid values:</p>
         * <ul>
         * <li><strong>Sync</strong>: synchronous replication</li>
         * <li><strong>Semi-sync</strong>: semi-synchronous replication</li>
         * <li><strong>Async</strong>: asynchronous replication</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        public Builder syncMode(String syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public DescribeDBInstanceHAConfigResponseBody build() {
            return new DescribeDBInstanceHAConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceHAConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceHAConfigResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSyncTime")
        private String dataSyncTime;

        @com.aliyun.core.annotation.NameInMap("LogSyncTime")
        private String logSyncTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private String syncStatus;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.dataSyncTime = model.dataSyncTime;
                this.logSyncTime = model.logSyncTime;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.regionId = model.regionId;
                this.syncStatus = model.syncStatus;
                this.zoneId = model.zoneId;
            } 

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
    /**
     * 
     * {@link DescribeDBInstanceHAConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceHAConfigResponseBody</p>
     */
    public static class HostInstanceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<NodeInfo> nodeInfo;

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
        public java.util.List<NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List<NodeInfo> nodeInfo; 

            private Builder() {
            } 

            private Builder(HostInstanceInfos model) {
                this.nodeInfo = model.nodeInfo;
            } 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public HostInstanceInfos build() {
                return new HostInstanceInfos(this);
            } 

        } 

    }
}
