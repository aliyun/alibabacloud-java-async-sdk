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

        /**
         * BackupDataList.
         */
        public Builder backupDataList(java.util.List<BackupDataList> backupDataList) {
            this.backupDataList = backupDataList;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * ColdDataSize.
             */
            public Builder coldDataSize(Long coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * DataDesc.
             */
            public Builder dataDesc(String dataDesc) {
                this.dataDesc = dataDesc;
                return this;
            }

            /**
             * DataGran.
             */
            public Builder dataGran(String dataGran) {
                this.dataGran = dataGran;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceRegion.
             */
            public Builder instanceRegion(String instanceRegion) {
                this.instanceRegion = instanceRegion;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceZoneId.
             */
            public Builder instanceZoneId(String instanceZoneId) {
                this.instanceZoneId = instanceZoneId;
                return this;
            }

            /**
             * SnapshotRegion.
             */
            public Builder snapshotRegion(String snapshotRegion) {
                this.snapshotRegion = snapshotRegion;
                return this;
            }

            /**
             * SnapshotZoneId.
             */
            public Builder snapshotZoneId(String snapshotZoneId) {
                this.snapshotZoneId = snapshotZoneId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * TriggerType.
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
