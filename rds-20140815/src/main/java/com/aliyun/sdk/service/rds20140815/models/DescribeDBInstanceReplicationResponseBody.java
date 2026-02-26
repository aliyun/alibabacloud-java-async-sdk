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
 * {@link DescribeDBInstanceReplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceReplicationResponseBody</p>
 */
public class DescribeDBInstanceReplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExternalReplication")
    private String externalReplication;

    @com.aliyun.core.annotation.NameInMap("GtidExecuted")
    private String gtidExecuted;

    @com.aliyun.core.annotation.NameInMap("ImportStatus")
    private String importStatus;

    @com.aliyun.core.annotation.NameInMap("ReplicationDelay")
    private String replicationDelay;

    @com.aliyun.core.annotation.NameInMap("ReplicationErrorMessage")
    private String replicationErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ReplicationIp")
    private String replicationIp;

    @com.aliyun.core.annotation.NameInMap("ReplicationPort")
    private String replicationPort;

    @com.aliyun.core.annotation.NameInMap("ReplicationSource")
    private String replicationSource;

    @com.aliyun.core.annotation.NameInMap("ReplicationState")
    private String replicationState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlaveStatusList")
    private java.util.List<SlaveStatusList> slaveStatusList;

    private DescribeDBInstanceReplicationResponseBody(Builder builder) {
        this.externalReplication = builder.externalReplication;
        this.gtidExecuted = builder.gtidExecuted;
        this.importStatus = builder.importStatus;
        this.replicationDelay = builder.replicationDelay;
        this.replicationErrorMessage = builder.replicationErrorMessage;
        this.replicationIp = builder.replicationIp;
        this.replicationPort = builder.replicationPort;
        this.replicationSource = builder.replicationSource;
        this.replicationState = builder.replicationState;
        this.requestId = builder.requestId;
        this.slaveStatusList = builder.slaveStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceReplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalReplication
     */
    public String getExternalReplication() {
        return this.externalReplication;
    }

    /**
     * @return gtidExecuted
     */
    public String getGtidExecuted() {
        return this.gtidExecuted;
    }

    /**
     * @return importStatus
     */
    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * @return replicationDelay
     */
    public String getReplicationDelay() {
        return this.replicationDelay;
    }

    /**
     * @return replicationErrorMessage
     */
    public String getReplicationErrorMessage() {
        return this.replicationErrorMessage;
    }

    /**
     * @return replicationIp
     */
    public String getReplicationIp() {
        return this.replicationIp;
    }

    /**
     * @return replicationPort
     */
    public String getReplicationPort() {
        return this.replicationPort;
    }

    /**
     * @return replicationSource
     */
    public String getReplicationSource() {
        return this.replicationSource;
    }

    /**
     * @return replicationState
     */
    public String getReplicationState() {
        return this.replicationState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaveStatusList
     */
    public java.util.List<SlaveStatusList> getSlaveStatusList() {
        return this.slaveStatusList;
    }

    public static final class Builder {
        private String externalReplication; 
        private String gtidExecuted; 
        private String importStatus; 
        private String replicationDelay; 
        private String replicationErrorMessage; 
        private String replicationIp; 
        private String replicationPort; 
        private String replicationSource; 
        private String replicationState; 
        private String requestId; 
        private java.util.List<SlaveStatusList> slaveStatusList; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceReplicationResponseBody model) {
            this.externalReplication = model.externalReplication;
            this.gtidExecuted = model.gtidExecuted;
            this.importStatus = model.importStatus;
            this.replicationDelay = model.replicationDelay;
            this.replicationErrorMessage = model.replicationErrorMessage;
            this.replicationIp = model.replicationIp;
            this.replicationPort = model.replicationPort;
            this.replicationSource = model.replicationSource;
            this.replicationState = model.replicationState;
            this.requestId = model.requestId;
            this.slaveStatusList = model.slaveStatusList;
        } 

        /**
         * <p>Indicates whether the native replication mods is enabled. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder externalReplication(String externalReplication) {
            this.externalReplication = externalReplication;
            return this;
        }

        /**
         * GtidExecuted.
         */
        public Builder gtidExecuted(String gtidExecuted) {
            this.gtidExecuted = gtidExecuted;
            return this;
        }

        /**
         * <p>COMPLETED: 导入完成，INIT: 初始化，IMPORTING: 正在导入</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder importStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }

        /**
         * <p>The replication latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder replicationDelay(String replicationDelay) {
            this.replicationDelay = replicationDelay;
            return this;
        }

        /**
         * <p>The replication error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Got fatal error 1236 from master when reading data from binary log...</p>
         */
        public Builder replicationErrorMessage(String replicationErrorMessage) {
            this.replicationErrorMessage = replicationErrorMessage;
            return this;
        }

        /**
         * ReplicationIp.
         */
        public Builder replicationIp(String replicationIp) {
            this.replicationIp = replicationIp;
            return this;
        }

        /**
         * ReplicationPort.
         */
        public Builder replicationPort(String replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }

        /**
         * <p>The source of the native replication.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.x.x</p>
         */
        public Builder replicationSource(String replicationSource) {
            this.replicationSource = replicationSource;
            return this;
        }

        /**
         * <p>The current replication status. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong></li>
         * <li><strong>Connecting</strong></li>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Error</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running
         * Connecting
         * Stopped
         * Error</p>
         */
        public Builder replicationState(String replicationState) {
            this.replicationState = replicationState;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlaveStatusList.
         */
        public Builder slaveStatusList(java.util.List<SlaveStatusList> slaveStatusList) {
            this.slaveStatusList = slaveStatusList;
            return this;
        }

        public DescribeDBInstanceReplicationResponseBody build() {
            return new DescribeDBInstanceReplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceReplicationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceReplicationResponseBody</p>
     */
    public static class SlaveStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("ExecutedGtidSet")
        private String executedGtidSet;

        @com.aliyun.core.annotation.NameInMap("LastErrno")
        private Integer lastErrno;

        @com.aliyun.core.annotation.NameInMap("LastIoErrno")
        private Integer lastIoErrno;

        @com.aliyun.core.annotation.NameInMap("LastIoError")
        private String lastIoError;

        @com.aliyun.core.annotation.NameInMap("LastSqlErrno")
        private Integer lastSqlErrno;

        @com.aliyun.core.annotation.NameInMap("LastSqlError")
        private String lastSqlError;

        @com.aliyun.core.annotation.NameInMap("MasterHost")
        private String masterHost;

        @com.aliyun.core.annotation.NameInMap("MasterUser")
        private String masterUser;

        @com.aliyun.core.annotation.NameInMap("MasterUuid")
        private String masterUuid;

        @com.aliyun.core.annotation.NameInMap("ReplicateDoDb")
        private String replicateDoDb;

        @com.aliyun.core.annotation.NameInMap("ReplicateDoTable")
        private String replicateDoTable;

        @com.aliyun.core.annotation.NameInMap("ReplicateIgnoreDb")
        private String replicateIgnoreDb;

        @com.aliyun.core.annotation.NameInMap("ReplicateIgnoreTable")
        private String replicateIgnoreTable;

        @com.aliyun.core.annotation.NameInMap("ReplicateWildDoTable")
        private String replicateWildDoTable;

        @com.aliyun.core.annotation.NameInMap("ReplicateWildIgnoreTable")
        private String replicateWildIgnoreTable;

        @com.aliyun.core.annotation.NameInMap("SecondsBehindMaster")
        private Integer secondsBehindMaster;

        @com.aliyun.core.annotation.NameInMap("SlaveIoRunning")
        private String slaveIoRunning;

        @com.aliyun.core.annotation.NameInMap("SlaveIoState")
        private String slaveIoState;

        @com.aliyun.core.annotation.NameInMap("SlaveSqlRunning")
        private String slaveSqlRunning;

        @com.aliyun.core.annotation.NameInMap("SlaveSqlRunningState")
        private String slaveSqlRunningState;

        private SlaveStatusList(Builder builder) {
            this.channelName = builder.channelName;
            this.executedGtidSet = builder.executedGtidSet;
            this.lastErrno = builder.lastErrno;
            this.lastIoErrno = builder.lastIoErrno;
            this.lastIoError = builder.lastIoError;
            this.lastSqlErrno = builder.lastSqlErrno;
            this.lastSqlError = builder.lastSqlError;
            this.masterHost = builder.masterHost;
            this.masterUser = builder.masterUser;
            this.masterUuid = builder.masterUuid;
            this.replicateDoDb = builder.replicateDoDb;
            this.replicateDoTable = builder.replicateDoTable;
            this.replicateIgnoreDb = builder.replicateIgnoreDb;
            this.replicateIgnoreTable = builder.replicateIgnoreTable;
            this.replicateWildDoTable = builder.replicateWildDoTable;
            this.replicateWildIgnoreTable = builder.replicateWildIgnoreTable;
            this.secondsBehindMaster = builder.secondsBehindMaster;
            this.slaveIoRunning = builder.slaveIoRunning;
            this.slaveIoState = builder.slaveIoState;
            this.slaveSqlRunning = builder.slaveSqlRunning;
            this.slaveSqlRunningState = builder.slaveSqlRunningState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveStatusList create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return executedGtidSet
         */
        public String getExecutedGtidSet() {
            return this.executedGtidSet;
        }

        /**
         * @return lastErrno
         */
        public Integer getLastErrno() {
            return this.lastErrno;
        }

        /**
         * @return lastIoErrno
         */
        public Integer getLastIoErrno() {
            return this.lastIoErrno;
        }

        /**
         * @return lastIoError
         */
        public String getLastIoError() {
            return this.lastIoError;
        }

        /**
         * @return lastSqlErrno
         */
        public Integer getLastSqlErrno() {
            return this.lastSqlErrno;
        }

        /**
         * @return lastSqlError
         */
        public String getLastSqlError() {
            return this.lastSqlError;
        }

        /**
         * @return masterHost
         */
        public String getMasterHost() {
            return this.masterHost;
        }

        /**
         * @return masterUser
         */
        public String getMasterUser() {
            return this.masterUser;
        }

        /**
         * @return masterUuid
         */
        public String getMasterUuid() {
            return this.masterUuid;
        }

        /**
         * @return replicateDoDb
         */
        public String getReplicateDoDb() {
            return this.replicateDoDb;
        }

        /**
         * @return replicateDoTable
         */
        public String getReplicateDoTable() {
            return this.replicateDoTable;
        }

        /**
         * @return replicateIgnoreDb
         */
        public String getReplicateIgnoreDb() {
            return this.replicateIgnoreDb;
        }

        /**
         * @return replicateIgnoreTable
         */
        public String getReplicateIgnoreTable() {
            return this.replicateIgnoreTable;
        }

        /**
         * @return replicateWildDoTable
         */
        public String getReplicateWildDoTable() {
            return this.replicateWildDoTable;
        }

        /**
         * @return replicateWildIgnoreTable
         */
        public String getReplicateWildIgnoreTable() {
            return this.replicateWildIgnoreTable;
        }

        /**
         * @return secondsBehindMaster
         */
        public Integer getSecondsBehindMaster() {
            return this.secondsBehindMaster;
        }

        /**
         * @return slaveIoRunning
         */
        public String getSlaveIoRunning() {
            return this.slaveIoRunning;
        }

        /**
         * @return slaveIoState
         */
        public String getSlaveIoState() {
            return this.slaveIoState;
        }

        /**
         * @return slaveSqlRunning
         */
        public String getSlaveSqlRunning() {
            return this.slaveSqlRunning;
        }

        /**
         * @return slaveSqlRunningState
         */
        public String getSlaveSqlRunningState() {
            return this.slaveSqlRunningState;
        }

        public static final class Builder {
            private String channelName; 
            private String executedGtidSet; 
            private Integer lastErrno; 
            private Integer lastIoErrno; 
            private String lastIoError; 
            private Integer lastSqlErrno; 
            private String lastSqlError; 
            private String masterHost; 
            private String masterUser; 
            private String masterUuid; 
            private String replicateDoDb; 
            private String replicateDoTable; 
            private String replicateIgnoreDb; 
            private String replicateIgnoreTable; 
            private String replicateWildDoTable; 
            private String replicateWildIgnoreTable; 
            private Integer secondsBehindMaster; 
            private String slaveIoRunning; 
            private String slaveIoState; 
            private String slaveSqlRunning; 
            private String slaveSqlRunningState; 

            private Builder() {
            } 

            private Builder(SlaveStatusList model) {
                this.channelName = model.channelName;
                this.executedGtidSet = model.executedGtidSet;
                this.lastErrno = model.lastErrno;
                this.lastIoErrno = model.lastIoErrno;
                this.lastIoError = model.lastIoError;
                this.lastSqlErrno = model.lastSqlErrno;
                this.lastSqlError = model.lastSqlError;
                this.masterHost = model.masterHost;
                this.masterUser = model.masterUser;
                this.masterUuid = model.masterUuid;
                this.replicateDoDb = model.replicateDoDb;
                this.replicateDoTable = model.replicateDoTable;
                this.replicateIgnoreDb = model.replicateIgnoreDb;
                this.replicateIgnoreTable = model.replicateIgnoreTable;
                this.replicateWildDoTable = model.replicateWildDoTable;
                this.replicateWildIgnoreTable = model.replicateWildIgnoreTable;
                this.secondsBehindMaster = model.secondsBehindMaster;
                this.slaveIoRunning = model.slaveIoRunning;
                this.slaveIoState = model.slaveIoState;
                this.slaveSqlRunning = model.slaveSqlRunning;
                this.slaveSqlRunningState = model.slaveSqlRunningState;
            } 

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * ExecutedGtidSet.
             */
            public Builder executedGtidSet(String executedGtidSet) {
                this.executedGtidSet = executedGtidSet;
                return this;
            }

            /**
             * <p>0表示无错误，其他值表示具体的错误代码</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lastErrno(Integer lastErrno) {
                this.lastErrno = lastErrno;
                return this;
            }

            /**
             * <p>0表示无错误，其他值表示IO线程的错误代码</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lastIoErrno(Integer lastIoErrno) {
                this.lastIoErrno = lastIoErrno;
                return this;
            }

            /**
             * <p>IO线程的错误信息描述</p>
             */
            public Builder lastIoError(String lastIoError) {
                this.lastIoError = lastIoError;
                return this;
            }

            /**
             * <p>0表示无错误，其他值表示SQL线程的错误代码</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lastSqlErrno(Integer lastSqlErrno) {
                this.lastSqlErrno = lastSqlErrno;
                return this;
            }

            /**
             * <p>SQL线程的错误信息描述</p>
             */
            public Builder lastSqlError(String lastSqlError) {
                this.lastSqlError = lastSqlError;
                return this;
            }

            /**
             * MasterHost.
             */
            public Builder masterHost(String masterHost) {
                this.masterHost = masterHost;
                return this;
            }

            /**
             * MasterUser.
             */
            public Builder masterUser(String masterUser) {
                this.masterUser = masterUser;
                return this;
            }

            /**
             * MasterUuid.
             */
            public Builder masterUuid(String masterUuid) {
                this.masterUuid = masterUuid;
                return this;
            }

            /**
             * ReplicateDoDb.
             */
            public Builder replicateDoDb(String replicateDoDb) {
                this.replicateDoDb = replicateDoDb;
                return this;
            }

            /**
             * ReplicateDoTable.
             */
            public Builder replicateDoTable(String replicateDoTable) {
                this.replicateDoTable = replicateDoTable;
                return this;
            }

            /**
             * ReplicateIgnoreDb.
             */
            public Builder replicateIgnoreDb(String replicateIgnoreDb) {
                this.replicateIgnoreDb = replicateIgnoreDb;
                return this;
            }

            /**
             * ReplicateIgnoreTable.
             */
            public Builder replicateIgnoreTable(String replicateIgnoreTable) {
                this.replicateIgnoreTable = replicateIgnoreTable;
                return this;
            }

            /**
             * ReplicateWildDoTable.
             */
            public Builder replicateWildDoTable(String replicateWildDoTable) {
                this.replicateWildDoTable = replicateWildDoTable;
                return this;
            }

            /**
             * ReplicateWildIgnoreTable.
             */
            public Builder replicateWildIgnoreTable(String replicateWildIgnoreTable) {
                this.replicateWildIgnoreTable = replicateWildIgnoreTable;
                return this;
            }

            /**
             * SecondsBehindMaster.
             */
            public Builder secondsBehindMaster(Integer secondsBehindMaster) {
                this.secondsBehindMaster = secondsBehindMaster;
                return this;
            }

            /**
             * <p>Yes: 运行中，No: 已停止</p>
             * 
             * <strong>example:</strong>
             * <p>Yes</p>
             */
            public Builder slaveIoRunning(String slaveIoRunning) {
                this.slaveIoRunning = slaveIoRunning;
                return this;
            }

            /**
             * SlaveIoState.
             */
            public Builder slaveIoState(String slaveIoState) {
                this.slaveIoState = slaveIoState;
                return this;
            }

            /**
             * <p>Yes: 运行中，No: 已停止</p>
             * 
             * <strong>example:</strong>
             * <p>Yes</p>
             */
            public Builder slaveSqlRunning(String slaveSqlRunning) {
                this.slaveSqlRunning = slaveSqlRunning;
                return this;
            }

            /**
             * SlaveSqlRunningState.
             */
            public Builder slaveSqlRunningState(String slaveSqlRunningState) {
                this.slaveSqlRunningState = slaveSqlRunningState;
                return this;
            }

            public SlaveStatusList build() {
                return new SlaveStatusList(this);
            } 

        } 

    }
}
