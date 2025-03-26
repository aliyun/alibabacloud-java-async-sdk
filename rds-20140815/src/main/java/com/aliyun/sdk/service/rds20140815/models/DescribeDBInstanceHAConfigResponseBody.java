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
         * <p>rm-uf6wjk5xxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The high availability mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>RPO</strong>: Data consistency is preferred. The instance ensures data reliability to minimize data losses. If you have high requirements on data consistency, select this mode.</li>
         * <li><strong>RTO</strong>: Service availability is preferred. The instance restores the database service at the earliest opportunity to ensure service availability. If you have high requirements on instance availability, select this mode.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for instances that run MySQL.</p>
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
         * <p>An array that consists of the information of the primary and secondary instances.</p>
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
         * <p>The data replication mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Sync</strong>: the synchronous mode</li>
         * <li><strong>Semi-sync</strong>: the semi-synchronous replication mode</li>
         * <li><strong>Async</strong>: the asynchronous mode</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for instances that run MySQL.</p>
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
             * <p>The time when the secondary instance completed the synchronization of data from the primary instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-05T15:15:00Z</p>
             */
            public Builder dataSyncTime(String dataSyncTime) {
                this.dataSyncTime = dataSyncTime;
                return this;
            }

            /**
             * <p>The time when the secondary instance received logs from the primary instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-05T15:15:00Z</p>
             */
            public Builder logSyncTime(String logSyncTime) {
                this.logSyncTime = logSyncTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3397027</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: the primary node</li>
             * <li><strong>Slave</strong>: the secondary node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The synchronization status. Valid values:</p>
             * <ul>
             * <li><strong>NotAvailable</strong>: The synchronization fails. This means that faults occur.</li>
             * <li><strong>Syncing</strong>: The synchronization is in process. In this case, a primary/secondary switchover may cause data losses.</li>
             * <li><strong>Synchronized</strong>: The synchronization is completed.</li>
             * <li><strong>NotSupport</strong>: The database engine or database engine version does not involve the synchronization between the primary and secondary instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotAvailable</p>
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
