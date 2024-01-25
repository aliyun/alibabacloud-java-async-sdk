// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUdmSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUdmSnapshotsResponseBody</p>
 */
public class DescribeUdmSnapshotsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private java.util.List < Snapshots> snapshots;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeUdmSnapshotsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUdmSnapshotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshots
     */
    public java.util.List < Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Snapshots> snapshots; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about snapshots.
         */
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of backup snapshots.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUdmSnapshotsResponseBody build() {
            return new DescribeUdmSnapshotsResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("ConsistentLevel")
        private String consistentLevel;

        @NameInMap("ContainOsDisk")
        private Boolean containOsDisk;

        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("DiskDevName")
        private String diskDevName;

        @NameInMap("DiskHbrSnapshotIdWithDeviceMap")
        private java.util.Map < String, ? > diskHbrSnapshotIdWithDeviceMap;

        @NameInMap("DiskIdList")
        private java.util.List < String > diskIdList;

        @NameInMap("DowngradeReason")
        private String downgradeReason;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceIdWithDiskIdListMap")
        private java.util.Map < String, ? > instanceIdWithDiskIdListMap;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("NativeSnapshotIdList")
        private java.util.List < String > nativeSnapshotIdList;

        @NameInMap("OsDiskId")
        private String osDiskId;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("OsNameEn")
        private String osNameEn;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("SnapshotGroupId")
        private String snapshotGroupId;

        @NameInMap("SystemDisk")
        private Boolean systemDisk;

        @NameInMap("VmName")
        private String vmName;

        private Detail(Builder builder) {
            this.consistentLevel = builder.consistentLevel;
            this.containOsDisk = builder.containOsDisk;
            this.diskCategory = builder.diskCategory;
            this.diskDevName = builder.diskDevName;
            this.diskHbrSnapshotIdWithDeviceMap = builder.diskHbrSnapshotIdWithDeviceMap;
            this.diskIdList = builder.diskIdList;
            this.downgradeReason = builder.downgradeReason;
            this.hostName = builder.hostName;
            this.instanceIdWithDiskIdListMap = builder.instanceIdWithDiskIdListMap;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.instantAccess = builder.instantAccess;
            this.nativeSnapshotIdList = builder.nativeSnapshotIdList;
            this.osDiskId = builder.osDiskId;
            this.osName = builder.osName;
            this.osNameEn = builder.osNameEn;
            this.osType = builder.osType;
            this.performanceLevel = builder.performanceLevel;
            this.platform = builder.platform;
            this.snapshotGroupId = builder.snapshotGroupId;
            this.systemDisk = builder.systemDisk;
            this.vmName = builder.vmName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return consistentLevel
         */
        public String getConsistentLevel() {
            return this.consistentLevel;
        }

        /**
         * @return containOsDisk
         */
        public Boolean getContainOsDisk() {
            return this.containOsDisk;
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return diskDevName
         */
        public String getDiskDevName() {
            return this.diskDevName;
        }

        /**
         * @return diskHbrSnapshotIdWithDeviceMap
         */
        public java.util.Map < String, ? > getDiskHbrSnapshotIdWithDeviceMap() {
            return this.diskHbrSnapshotIdWithDeviceMap;
        }

        /**
         * @return diskIdList
         */
        public java.util.List < String > getDiskIdList() {
            return this.diskIdList;
        }

        /**
         * @return downgradeReason
         */
        public String getDowngradeReason() {
            return this.downgradeReason;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceIdWithDiskIdListMap
         */
        public java.util.Map < String, ? > getInstanceIdWithDiskIdListMap() {
            return this.instanceIdWithDiskIdListMap;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return nativeSnapshotIdList
         */
        public java.util.List < String > getNativeSnapshotIdList() {
            return this.nativeSnapshotIdList;
        }

        /**
         * @return osDiskId
         */
        public String getOsDiskId() {
            return this.osDiskId;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return osNameEn
         */
        public String getOsNameEn() {
            return this.osNameEn;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return snapshotGroupId
         */
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
        }

        /**
         * @return systemDisk
         */
        public Boolean getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return vmName
         */
        public String getVmName() {
            return this.vmName;
        }

        public static final class Builder {
            private String consistentLevel; 
            private Boolean containOsDisk; 
            private String diskCategory; 
            private String diskDevName; 
            private java.util.Map < String, ? > diskHbrSnapshotIdWithDeviceMap; 
            private java.util.List < String > diskIdList; 
            private String downgradeReason; 
            private String hostName; 
            private java.util.Map < String, ? > instanceIdWithDiskIdListMap; 
            private String instanceName; 
            private String instanceType; 
            private Boolean instantAccess; 
            private java.util.List < String > nativeSnapshotIdList; 
            private String osDiskId; 
            private String osName; 
            private String osNameEn; 
            private String osType; 
            private String performanceLevel; 
            private String platform; 
            private String snapshotGroupId; 
            private Boolean systemDisk; 
            private String vmName; 

            /**
             * The consistency level.
             */
            public Builder consistentLevel(String consistentLevel) {
                this.consistentLevel = consistentLevel;
                return this;
            }

            /**
             * Indicates whether the system disk is included.
             */
            public Builder containOsDisk(Boolean containOsDisk) {
                this.containOsDisk = containOsDisk;
                return this;
            }

            /**
             * The type of the source disk.
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * The name of the disk.
             */
            public Builder diskDevName(String diskDevName) {
                this.diskDevName = diskDevName;
                return this;
            }

            /**
             * The mapping between the device and the recovery point ID.
             */
            public Builder diskHbrSnapshotIdWithDeviceMap(java.util.Map < String, ? > diskHbrSnapshotIdWithDeviceMap) {
                this.diskHbrSnapshotIdWithDeviceMap = diskHbrSnapshotIdWithDeviceMap;
                return this;
            }

            /**
             * The IDs of the disks that are backed up at the recovery point.
             */
            public Builder diskIdList(java.util.List < String > diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * The reason for the downgrade.
             */
            public Builder downgradeReason(String downgradeReason) {
                this.downgradeReason = downgradeReason;
                return this;
            }

            /**
             * The hostname.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The mapping between the instance ID and the disk ID.
             */
            public Builder instanceIdWithDiskIdListMap(java.util.Map < String, ? > instanceIdWithDiskIdListMap) {
                this.instanceIdWithDiskIdListMap = instanceIdWithDiskIdListMap;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The specifications of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Indicates whether the backup is created by the instant clone feature.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The list of snapshot IDs, corresponding to DiskIdList.
             */
            public Builder nativeSnapshotIdList(java.util.List < String > nativeSnapshotIdList) {
                this.nativeSnapshotIdList = nativeSnapshotIdList;
                return this;
            }

            /**
             * The ID of the system disk.
             */
            public Builder osDiskId(String osDiskId) {
                this.osDiskId = osDiskId;
                return this;
            }

            /**
             * The name of the operating system.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * The English name of the operating system.
             */
            public Builder osNameEn(String osNameEn) {
                this.osNameEn = osNameEn;
                return this;
            }

            /**
             * The type of the operating system. Valid values: linux and windows.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The performance level of the source disk.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The system platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The ID of the snapshot group.
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * Indicates whether the disk is a system disk.
             */
            public Builder systemDisk(Boolean systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder vmName(String vmName) {
                this.vmName = vmName;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("ActualBytes")
        private String actualBytes;

        @NameInMap("AdvancedRetentionType")
        private String advancedRetentionType;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("BytesTotal")
        private Long bytesTotal;

        @NameInMap("CompleteTime")
        private Long completeTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("NativeSnapshotId")
        private String nativeSnapshotId;

        @NameInMap("NativeSnapshotInfo")
        private String nativeSnapshotInfo;

        @NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("RealSnapshotTime")
        private Long realSnapshotTime;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("SnapshotHash")
        private String snapshotHash;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        private Snapshots(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.advancedRetentionType = builder.advancedRetentionType;
            this.backupType = builder.backupType;
            this.bytesTotal = builder.bytesTotal;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.detail = builder.detail;
            this.diskId = builder.diskId;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.nativeSnapshotId = builder.nativeSnapshotId;
            this.nativeSnapshotInfo = builder.nativeSnapshotInfo;
            this.parentSnapshotHash = builder.parentSnapshotHash;
            this.prefix = builder.prefix;
            this.realSnapshotTime = builder.realSnapshotTime;
            this.retention = builder.retention;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public String getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return advancedRetentionType
         */
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return nativeSnapshotId
         */
        public String getNativeSnapshotId() {
            return this.nativeSnapshotId;
        }

        /**
         * @return nativeSnapshotInfo
         */
        public String getNativeSnapshotInfo() {
            return this.nativeSnapshotInfo;
        }

        /**
         * @return parentSnapshotHash
         */
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return realSnapshotTime
         */
        public Long getRealSnapshotTime() {
            return this.realSnapshotTime;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return snapshotHash
         */
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String actualBytes; 
            private String advancedRetentionType; 
            private String backupType; 
            private Long bytesTotal; 
            private Long completeTime; 
            private Long createTime; 
            private Long createdTime; 
            private Detail detail; 
            private String diskId; 
            private Long expireTime; 
            private String instanceId; 
            private String jobId; 
            private String nativeSnapshotId; 
            private String nativeSnapshotInfo; 
            private String parentSnapshotHash; 
            private String prefix; 
            private Long realSnapshotTime; 
            private Long retention; 
            private String snapshotHash; 
            private String snapshotId; 
            private String sourceType; 
            private Long startTime; 
            private String status; 
            private Long updatedTime; 

            /**
             * The size of the backup snapshot. Unit: bytes.
             */
            public Builder actualBytes(String actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * The special retention type, which is valid only for special backups. Valid values:
             * <p>
             * 
             * *   **WEEKLY**: weekly backups
             * *   **MONTHLY**: monthly backups
             * *   **YEARLY**: yearly backups
             */
            public Builder advancedRetentionType(String advancedRetentionType) {
                this.advancedRetentionType = advancedRetentionType;
                return this;
            }

            /**
             * The backup type. Valid value: **COMPLETE**, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The total amount of data. Unit: bytes.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The time when the backup snapshot was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The snapshot details.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The ID of the cloud disk or local disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The expiration time of the backup.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the backup job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The ID of the backup snapshot.
             */
            public Builder nativeSnapshotId(String nativeSnapshotId) {
                this.nativeSnapshotId = nativeSnapshotId;
                return this;
            }

            /**
             * The snapshot information.
             */
            public Builder nativeSnapshotInfo(String nativeSnapshotInfo) {
                this.nativeSnapshotInfo = nativeSnapshotInfo;
                return this;
            }

            /**
             * The hash value of the parent backup snapshot.
             */
            public Builder parentSnapshotHash(String parentSnapshotHash) {
                this.parentSnapshotHash = parentSnapshotHash;
                return this;
            }

            /**
             * The prefix of the backup snapshot.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * The timestamp of the backup snapshot. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder realSnapshotTime(Long realSnapshotTime) {
                this.realSnapshotTime = realSnapshotTime;
                return this;
            }

            /**
             * The retention period of the backup snapshot. Unit: days.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * The hash value of the backup snapshot.
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * The ID of the backup snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **UDM_ECS**: ECS instance backup
             * *   **UDM_ECS_DISK**: disk backup subtask of ECS instance backup
             * *   **UDM_DISK**: disk backup
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the backup job. Valid values:
             * <p>
             * 
             * *   **COMPLETE**: The backup job is completed.
             * *   **PARTIAL_COMPLETE**: The backup job is partially completed.
             * *   **FAILED**: The backup job has failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
