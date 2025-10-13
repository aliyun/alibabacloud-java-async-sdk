// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListBackupDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListBackupDataResponseBody</p>
 */
public class ListBackupDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupDataList")
    private java.util.List<BackupDataList> backupDataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBackupDataResponseBody(Builder builder) {
        this.backupDataList = builder.backupDataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupDataList
     */
    public java.util.List<BackupDataList> getBackupDataList() {
        return this.backupDataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BackupDataList> backupDataList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListBackupDataResponseBody model) {
            this.backupDataList = model.backupDataList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The backups.</p>
         */
        public Builder backupDataList(java.util.List<BackupDataList> backupDataList) {
            this.backupDataList = backupDataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4AA0C48F-B5BB-5FF9-A43B-6B91E0715D46</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBackupDataResponseBody build() {
            return new ListBackupDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBackupDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListBackupDataResponseBody</p>
     */
    public static class BackupDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("ColdDataSize")
        private Long coldDataSize;

        @com.aliyun.core.annotation.NameInMap("DataDesc")
        private String dataDesc;

        @com.aliyun.core.annotation.NameInMap("DataGran")
        private String dataGran;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceRegion")
        private String instanceRegion;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceZoneId")
        private String instanceZoneId;

        @com.aliyun.core.annotation.NameInMap("SnapshotRegion")
        private String snapshotRegion;

        @com.aliyun.core.annotation.NameInMap("SnapshotZoneId")
        private String snapshotZoneId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private BackupDataList(Builder builder) {
            this.backupType = builder.backupType;
            this.coldDataSize = builder.coldDataSize;
            this.dataDesc = builder.dataDesc;
            this.dataGran = builder.dataGran;
            this.dataSize = builder.dataSize;
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRegion = builder.instanceRegion;
            this.instanceType = builder.instanceType;
            this.instanceZoneId = builder.instanceZoneId;
            this.snapshotRegion = builder.snapshotRegion;
            this.snapshotZoneId = builder.snapshotZoneId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupDataList create() {
            return builder().build();
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return coldDataSize
         */
        public Long getColdDataSize() {
            return this.coldDataSize;
        }

        /**
         * @return dataDesc
         */
        public String getDataDesc() {
            return this.dataDesc;
        }

        /**
         * @return dataGran
         */
        public String getDataGran() {
            return this.dataGran;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRegion
         */
        public String getInstanceRegion() {
            return this.instanceRegion;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceZoneId
         */
        public String getInstanceZoneId() {
            return this.instanceZoneId;
        }

        /**
         * @return snapshotRegion
         */
        public String getSnapshotRegion() {
            return this.snapshotRegion;
        }

        /**
         * @return snapshotZoneId
         */
        public String getSnapshotZoneId() {
            return this.snapshotZoneId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String backupType; 
            private Long coldDataSize; 
            private String dataDesc; 
            private String dataGran; 
            private Long dataSize; 
            private String dataTime; 
            private String endTime; 
            private Long id; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRegion; 
            private String instanceType; 
            private String instanceZoneId; 
            private String snapshotRegion; 
            private String snapshotZoneId; 
            private String startTime; 
            private String status; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(BackupDataList model) {
                this.backupType = model.backupType;
                this.coldDataSize = model.coldDataSize;
                this.dataDesc = model.dataDesc;
                this.dataGran = model.dataGran;
                this.dataSize = model.dataSize;
                this.dataTime = model.dataTime;
                this.endTime = model.endTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceRegion = model.instanceRegion;
                this.instanceType = model.instanceType;
                this.instanceZoneId = model.instanceZoneId;
                this.snapshotRegion = model.snapshotRegion;
                this.snapshotZoneId = model.snapshotZoneId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The backup type. In general, the following two types are supported: local backup and remote backup. In the local backup type, snapshots reside in the same region as your instance. The following two sub-types are available: full (single backup, single replica) and redundant (zone-redundant storage, multiple replicas). In the remote backup type, snapshots and your instance reside in different regions. Remote backups are the replicas of the backups of the full or redundant type in another region. The values local and remote do not represent specific types, but are used only for data filtering. The value local indicates all local backups, and the value remote indicates all remote backups.</p>
             * 
             * <strong>example:</strong>
             * <p>redundant</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The size of cold data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>32413521</p>
             */
            public Builder coldDataSize(Long coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * <p>The description of the backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder dataDesc(String dataDesc) {
                this.dataDesc = dataDesc;
                return this;
            }

            /**
             * <p>The backup granularity.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder dataGran(String dataGran) {
                this.dataGran = dataGran;
                return this;
            }

            /**
             * <p>The size of the backup data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>76085723136</p>
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The snapshot time. The value format of this parameter follows the same standard as that of the StartTime parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-28T12:23:37.000+00:00</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The end time of the backup task. The value format of this parameter follows the same standard as that of the StartTime parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-28T12:27:34.000+00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The unique ID of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1780805690994479105</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-pe33jdxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>my-hologres-dw</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder instanceRegion(String instanceRegion) {
                this.instanceRegion = instanceRegion;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Warehouse: virtual warehouse instance</li>
             * <li>Standard: general-purpose instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Warehouse</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The zone in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder instanceZoneId(String instanceZoneId) {
                this.instanceZoneId = instanceZoneId;
                return this;
            }

            /**
             * <p>The region in which the backup data resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder snapshotRegion(String snapshotRegion) {
                this.snapshotRegion = snapshotRegion;
                return this;
            }

            /**
             * <p>The zone in which the backup data resides. In zone-redundant storage mode, backup data is stored in different zones, including the current zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder snapshotZoneId(String snapshotZoneId) {
                this.snapshotZoneId = snapshotZoneId;
                return this;
            }

            /**
             * <p>The start time of the backup task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.SSSTZ format. The time is displayed in UTC (the same below).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-28T11:19:56.000+00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the backup task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>processing</li>
             * <li>completed</li>
             * <li>failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The mode in which the backup task is triggered.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>scheduled: periodic backup</li>
             * <li>manual: manual backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scheduled</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public BackupDataList build() {
                return new BackupDataList(this);
            } 

        } 

    }
}
