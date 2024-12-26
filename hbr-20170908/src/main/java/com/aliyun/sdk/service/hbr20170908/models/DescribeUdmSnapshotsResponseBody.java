// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeUdmSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUdmSnapshotsResponseBody</p>
 */
public class DescribeUdmSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Snapshots> getSnapshots() {
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
        private java.util.List<Snapshots> snapshots; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>51CDEECB-7001-51CC-94AC-2A0F2A4B71D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about snapshots.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of backup snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUdmSnapshotsResponseBody build() {
            return new DescribeUdmSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUdmSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUdmSnapshotsResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentLevel")
        private String consistentLevel;

        @com.aliyun.core.annotation.NameInMap("ContainOsDisk")
        private Boolean containOsDisk;

        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        @com.aliyun.core.annotation.NameInMap("DiskDevName")
        private String diskDevName;

        @com.aliyun.core.annotation.NameInMap("DiskHbrSnapshotIdWithDeviceMap")
        private java.util.Map<String, ?> diskHbrSnapshotIdWithDeviceMap;

        @com.aliyun.core.annotation.NameInMap("DiskIdList")
        private java.util.List<String> diskIdList;

        @com.aliyun.core.annotation.NameInMap("DowngradeReason")
        private String downgradeReason;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceIdWithDiskIdListMap")
        private java.util.Map<String, ?> instanceIdWithDiskIdListMap;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstantAccess")
        private Boolean instantAccess;

        @com.aliyun.core.annotation.NameInMap("NativeSnapshotIdList")
        private java.util.List<String> nativeSnapshotIdList;

        @com.aliyun.core.annotation.NameInMap("OsDiskId")
        private String osDiskId;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("OsNameEn")
        private String osNameEn;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SnapshotGroupId")
        private String snapshotGroupId;

        @com.aliyun.core.annotation.NameInMap("SystemDisk")
        private Boolean systemDisk;

        @com.aliyun.core.annotation.NameInMap("VmName")
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
        public java.util.Map<String, ?> getDiskHbrSnapshotIdWithDeviceMap() {
            return this.diskHbrSnapshotIdWithDeviceMap;
        }

        /**
         * @return diskIdList
         */
        public java.util.List<String> getDiskIdList() {
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
        public java.util.Map<String, ?> getInstanceIdWithDiskIdListMap() {
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
        public java.util.List<String> getNativeSnapshotIdList() {
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
            private java.util.Map<String, ?> diskHbrSnapshotIdWithDeviceMap; 
            private java.util.List<String> diskIdList; 
            private String downgradeReason; 
            private String hostName; 
            private java.util.Map<String, ?> instanceIdWithDiskIdListMap; 
            private String instanceName; 
            private String instanceType; 
            private Boolean instantAccess; 
            private java.util.List<String> nativeSnapshotIdList; 
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
             * <p>The consistency level.</p>
             * 
             * <strong>example:</strong>
             * <p>CRASH</p>
             */
            public Builder consistentLevel(String consistentLevel) {
                this.consistentLevel = consistentLevel;
                return this;
            }

            /**
             * <p>Indicates whether the system disk is included.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder containOsDisk(Boolean containOsDisk) {
                this.containOsDisk = containOsDisk;
                return this;
            }

            /**
             * <p>The type of the source disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder diskDevName(String diskDevName) {
                this.diskDevName = diskDevName;
                return this;
            }

            /**
             * <p>The mapping between the device and the recovery point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;/dev/xvdb&quot;:&quot;s-0000u7y6wm3v1e7hxh5a&quot;,					 
             *     &quot;/dev/xvda&quot;:&quot;s-0004bl6yr5pt89jjsv5a&quot;
             * }</p>
             */
            public Builder diskHbrSnapshotIdWithDeviceMap(java.util.Map<String, ?> diskHbrSnapshotIdWithDeviceMap) {
                this.diskHbrSnapshotIdWithDeviceMap = diskHbrSnapshotIdWithDeviceMap;
                return this;
            }

            /**
             * <p>The IDs of the disks that are backed up at the recovery point.</p>
             */
            public Builder diskIdList(java.util.List<String> diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * <p>The reason for the downgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>HBR.NoRamRoleBound</p>
             */
            public Builder downgradeReason(String downgradeReason) {
                this.downgradeReason = downgradeReason;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>iZbpxxxxxxxxxxxxxxxxe2Z</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The mapping between the instance ID and the disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;i-bp1dlp0keohh7ids4uo6&quot;:&quot;d-bp1e6427vhd320hifvs&quot;,					 
             *     &quot;i-bp1dlp0keohh7ids4uo6&quot;:&quot;d-bp1e6427vhd320hifvd&quot;
             * }</p>
             */
            public Builder instanceIdWithDiskIdListMap(java.util.Map<String, ?> instanceIdWithDiskIdListMap) {
                this.instanceIdWithDiskIdListMap = instanceIdWithDiskIdListMap;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>swh-hbr</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The specifications of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Indicates whether the backup is created by the instant clone feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * <p>The list of snapshot IDs, corresponding to DiskIdList.</p>
             */
            public Builder nativeSnapshotIdList(java.util.List<String> nativeSnapshotIdList) {
                this.nativeSnapshotIdList = nativeSnapshotIdList;
                return this;
            }

            /**
             * <p>The ID of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1e6427vhd320hifvc</p>
             */
            public Builder osDiskId(String osDiskId) {
                this.osDiskId = osDiskId;
                return this;
            }

            /**
             * <p>The name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Debian 10.10 64-bit (UEFI)</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The English name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Debian  11.1 64 bit</p>
             */
            public Builder osNameEn(String osNameEn) {
                this.osNameEn = osNameEn;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values: linux and windows.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The performance level of the source disk.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The system platform.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The ID of the snapshot group.</p>
             * 
             * <strong>example:</strong>
             * <p>ssg-uf6856txcaq31uj***</p>
             */
            public Builder snapshotGroupId(String snapshotGroupId) {
                this.snapshotGroupId = snapshotGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the disk is a system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDisk(Boolean systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>BNSHSVR42 IPGUARD</p>
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
    /**
     * 
     * {@link DescribeUdmSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUdmSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private String actualBytes;

        @com.aliyun.core.annotation.NameInMap("AdvancedRetentionType")
        private String advancedRetentionType;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NativeSnapshotId")
        private String nativeSnapshotId;

        @com.aliyun.core.annotation.NameInMap("NativeSnapshotInfo")
        private String nativeSnapshotInfo;

        @com.aliyun.core.annotation.NameInMap("ParentSnapshotHash")
        private String parentSnapshotHash;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("RealSnapshotTime")
        private Long realSnapshotTime;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("SnapshotHash")
        private String snapshotHash;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
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
             * <p>The size of the backup snapshot. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder actualBytes(String actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The special retention type, which is valid only for special backups. Valid values:</p>
             * <ul>
             * <li><strong>WEEKLY</strong>: weekly backups</li>
             * <li><strong>MONTHLY</strong>: monthly backups</li>
             * <li><strong>YEARLY</strong>: yearly backups</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WEEKLY</p>
             */
            public Builder advancedRetentionType(String advancedRetentionType) {
                this.advancedRetentionType = advancedRetentionType;
                return this;
            }

            /**
             * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The total amount of data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1646895666</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1607436917</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The snapshot details.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The ID of the cloud disk or local disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-2ze86h5fga5rfwxxa8ef</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The expiration time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1640334062</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1f0pe78dxizrsdcgxd</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-00030j3chkt******2</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-00047mg17p26x*****b</p>
             */
            public Builder nativeSnapshotId(String nativeSnapshotId) {
                this.nativeSnapshotId = nativeSnapshotId;
                return this;
            }

            /**
             * <p>The snapshot information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *                     &quot;sourceDiskId&quot;:&quot;d-bp17misjuy636t82v7b0&quot;,
             *                     &quot;lastModifiedTime&quot;:&quot;2022-03-09T11:35:12Z&quot;,
             *                     &quot;snapshotSN&quot;:&quot;64588-429372675-857161235&quot;,
             *                     &quot;snapshotId&quot;:&quot;s-bp1fbtwv3e6xr6wpe9e0&quot;,
             *                     &quot;creationTime&quot;:&quot;2022-03-09T11:31:12Z&quot;,
             *                     &quot;snapshotType&quot;:&quot;user&quot;,
             *                     &quot;usage&quot;:&quot;none&quot;,
             *                     &quot;description&quot;:&quot;&quot;,
             *                     &quot;sourceStorageType&quot;:&quot;disk&quot;,
             *                     &quot;tags&quot;:[
             *                         {
             *                             &quot;tagValue&quot;:&quot;job-0007e0wqjl0imbrtkmnm&quot;,
             *                             &quot;tagKey&quot;:&quot;HBR JobId&quot;
             *                         }
             *                     ],
             *                     &quot;productCode&quot;:&quot;&quot;,
             *                     &quot;encrypted&quot;:false,
             *                     &quot;sourceDiskType&quot;:&quot;system&quot;,
             *                     &quot;retentionDays&quot;:30,
             *                     &quot;snapshotName&quot;:&quot;Created-from-HBR-job:job-0007e0wqjl0imbrtkmnm&quot;,
             *                     &quot;kMSKeyId&quot;:&quot;&quot;,
             *                     &quot;progress&quot;:&quot;100%&quot;,
             *                     &quot;category&quot;:&quot;standard&quot;,
             *                     &quot;sourceDiskSize&quot;:&quot;20&quot;,
             *                     &quot;status&quot;:&quot;accomplished&quot;
             *                 }</p>
             */
            public Builder nativeSnapshotInfo(String nativeSnapshotInfo) {
                this.nativeSnapshotInfo = nativeSnapshotInfo;
                return this;
            }

            /**
             * <p>The hash value of the parent backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>f2fe..</p>
             */
            public Builder parentSnapshotHash(String parentSnapshotHash) {
                this.parentSnapshotHash = parentSnapshotHash;
                return this;
            }

            /**
             * <p>The prefix of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>example/</p>
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The timestamp of the backup snapshot. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
             */
            public Builder realSnapshotTime(Long realSnapshotTime) {
                this.realSnapshotTime = realSnapshotTime;
                return this;
            }

            /**
             * <p>The retention period of the backup snapshot. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The hash value of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>f2fe...</p>
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * <p>The ID of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-00047mxg17p26*****b</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
             * <li><strong>UDM_ECS_DISK</strong>: disk backup subtask of ECS instance backup</li>
             * <li><strong>UDM_DISK</strong>: disk backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDM_ECS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the backup job. Valid values:</p>
             * <ul>
             * <li><strong>COMPLETE</strong>: The backup job is completed.</li>
             * <li><strong>PARTIAL_COMPLETE</strong>: The backup job is partially completed.</li>
             * <li><strong>FAILED</strong>: The backup job has failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642496679</p>
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
