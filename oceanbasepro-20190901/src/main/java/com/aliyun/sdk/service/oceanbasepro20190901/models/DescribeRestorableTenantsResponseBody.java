// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestorableTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestorableTenantsResponseBody</p>
 */
public class DescribeRestorableTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tenants")
    private java.util.List < Tenants> tenants;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRestorableTenantsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenants = builder.tenants;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestorableTenantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenants
     */
    public java.util.List < Tenants> getTenants() {
        return this.tenants;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tenants> tenants; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tenants.
         */
        public Builder tenants(java.util.List < Tenants> tenants) {
            this.tenants = tenants;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRestorableTenantsResponseBody build() {
            return new DescribeRestorableTenantsResponseBody(this);
        } 

    } 

    public static class BackupSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("SetId")
        private String setId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private BackupSets(Builder builder) {
            this.backupSetId = builder.backupSetId;
            this.checkpoint = builder.checkpoint;
            this.setId = builder.setId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupSets create() {
            return builder().build();
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return setId
         */
        public String getSetId() {
            return this.setId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String backupSetId; 
            private String checkpoint; 
            private String setId; 
            private String tenantId; 

            /**
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * SetId.
             */
            public Builder setId(String setId) {
                this.setId = setId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public BackupSets build() {
                return new BackupSets(this);
            } 

        } 

    }
    public static class TimeIntervalList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FromArchive")
        private Boolean fromArchive;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private TimeIntervalList(Builder builder) {
            this.endTime = builder.endTime;
            this.fromArchive = builder.fromArchive;
            this.startTime = builder.startTime;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeIntervalList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromArchive
         */
        public Boolean getFromArchive() {
            return this.fromArchive;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String endTime; 
            private Boolean fromArchive; 
            private String startTime; 
            private String storageType; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FromArchive.
             */
            public Builder fromArchive(Boolean fromArchive) {
                this.fromArchive = fromArchive;
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
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public TimeIntervalList build() {
                return new TimeIntervalList(this);
            } 

        } 

    }
    public static class Tenants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupBucketName")
        private String backupBucketName;

        @com.aliyun.core.annotation.NameInMap("BackupSets")
        private java.util.List < BackupSets> backupSets;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CpuNum")
        private Long cpuNum;

        @com.aliyun.core.annotation.NameInMap("MemoryNum")
        private Long memoryNum;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("ObRpmVersion")
        private String obRpmVersion;

        @com.aliyun.core.annotation.NameInMap("ObTenantId")
        private String obTenantId;

        @com.aliyun.core.annotation.NameInMap("ObVersion")
        private String obVersion;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("TenantAlias")
        private String tenantAlias;

        @com.aliyun.core.annotation.NameInMap("TenantDataBackupRemainDays")
        private Integer tenantDataBackupRemainDays;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
        private Long tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TimeIntervalList")
        private java.util.List < TimeIntervalList> timeIntervalList;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Long unitNum;

        @com.aliyun.core.annotation.NameInMap("UsedDisk")
        private Long usedDisk;

        private Tenants(Builder builder) {
            this.backupBucketName = builder.backupBucketName;
            this.backupSets = builder.backupSets;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cpuNum = builder.cpuNum;
            this.memoryNum = builder.memoryNum;
            this.method = builder.method;
            this.obRpmVersion = builder.obRpmVersion;
            this.obTenantId = builder.obTenantId;
            this.obVersion = builder.obVersion;
            this.sourceRegion = builder.sourceRegion;
            this.tenantAlias = builder.tenantAlias;
            this.tenantDataBackupRemainDays = builder.tenantDataBackupRemainDays;
            this.tenantId = builder.tenantId;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.timeIntervalList = builder.timeIntervalList;
            this.unitNum = builder.unitNum;
            this.usedDisk = builder.usedDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenants create() {
            return builder().build();
        }

        /**
         * @return backupBucketName
         */
        public String getBackupBucketName() {
            return this.backupBucketName;
        }

        /**
         * @return backupSets
         */
        public java.util.List < BackupSets> getBackupSets() {
            return this.backupSets;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return cpuNum
         */
        public Long getCpuNum() {
            return this.cpuNum;
        }

        /**
         * @return memoryNum
         */
        public Long getMemoryNum() {
            return this.memoryNum;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return obRpmVersion
         */
        public String getObRpmVersion() {
            return this.obRpmVersion;
        }

        /**
         * @return obTenantId
         */
        public String getObTenantId() {
            return this.obTenantId;
        }

        /**
         * @return obVersion
         */
        public String getObVersion() {
            return this.obVersion;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return tenantAlias
         */
        public String getTenantAlias() {
            return this.tenantAlias;
        }

        /**
         * @return tenantDataBackupRemainDays
         */
        public Integer getTenantDataBackupRemainDays() {
            return this.tenantDataBackupRemainDays;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantMode
         */
        public Long getTenantMode() {
            return this.tenantMode;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return timeIntervalList
         */
        public java.util.List < TimeIntervalList> getTimeIntervalList() {
            return this.timeIntervalList;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        /**
         * @return usedDisk
         */
        public Long getUsedDisk() {
            return this.usedDisk;
        }

        public static final class Builder {
            private String backupBucketName; 
            private java.util.List < BackupSets> backupSets; 
            private String clusterId; 
            private String clusterName; 
            private Long cpuNum; 
            private Long memoryNum; 
            private String method; 
            private String obRpmVersion; 
            private String obTenantId; 
            private String obVersion; 
            private String sourceRegion; 
            private String tenantAlias; 
            private Integer tenantDataBackupRemainDays; 
            private String tenantId; 
            private Long tenantMode; 
            private String tenantName; 
            private java.util.List < TimeIntervalList> timeIntervalList; 
            private Long unitNum; 
            private Long usedDisk; 

            /**
             * BackupBucketName.
             */
            public Builder backupBucketName(String backupBucketName) {
                this.backupBucketName = backupBucketName;
                return this;
            }

            /**
             * BackupSets.
             */
            public Builder backupSets(java.util.List < BackupSets> backupSets) {
                this.backupSets = backupSets;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CpuNum.
             */
            public Builder cpuNum(Long cpuNum) {
                this.cpuNum = cpuNum;
                return this;
            }

            /**
             * MemoryNum.
             */
            public Builder memoryNum(Long memoryNum) {
                this.memoryNum = memoryNum;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * ObRpmVersion.
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * ObTenantId.
             */
            public Builder obTenantId(String obTenantId) {
                this.obTenantId = obTenantId;
                return this;
            }

            /**
             * ObVersion.
             */
            public Builder obVersion(String obVersion) {
                this.obVersion = obVersion;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * TenantAlias.
             */
            public Builder tenantAlias(String tenantAlias) {
                this.tenantAlias = tenantAlias;
                return this;
            }

            /**
             * TenantDataBackupRemainDays.
             */
            public Builder tenantDataBackupRemainDays(Integer tenantDataBackupRemainDays) {
                this.tenantDataBackupRemainDays = tenantDataBackupRemainDays;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TenantMode.
             */
            public Builder tenantMode(Long tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * TimeIntervalList.
             */
            public Builder timeIntervalList(java.util.List < TimeIntervalList> timeIntervalList) {
                this.timeIntervalList = timeIntervalList;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * UsedDisk.
             */
            public Builder usedDisk(Long usedDisk) {
                this.usedDisk = usedDisk;
                return this;
            }

            public Tenants build() {
                return new Tenants(this);
            } 

        } 

    }
}
