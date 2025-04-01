// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeRestorableTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestorableTenantsResponseBody</p>
 */
public class DescribeRestorableTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tenants")
    private java.util.List<Tenants> tenants;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Tenants> getTenants() {
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
        private java.util.List<Tenants> tenants; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRestorableTenantsResponseBody model) {
            this.requestId = model.requestId;
            this.tenants = model.tenants;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the tenants.</p>
         */
        public Builder tenants(java.util.List<Tenants> tenants) {
            this.tenants = tenants;
            return this;
        }

        /**
         * <p>The total number.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRestorableTenantsResponseBody build() {
            return new DescribeRestorableTenantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestorableTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestorableTenantsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BackupSets model) {
                this.backupSetId = model.backupSetId;
                this.checkpoint = model.checkpoint;
                this.setId = model.setId;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ID of the full backup set used for restore.</p>
             * 
             * <strong>example:</strong>
             * <p>bak-4n****gacpa8</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The checkpoint of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01&quot;T&quot;12:10:10.000&quot;Z&quot;</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>bak-xxxxx</p>
             */
            public Builder setId(String setId) {
                this.setId = setId;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t5********</p>
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
    /**
     * 
     * {@link DescribeRestorableTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestorableTenantsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TimeIntervalList model) {
                this.endTime = model.endTime;
                this.fromArchive = model.fromArchive;
                this.startTime = model.startTime;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The end time of the restorable period.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-13T02:43:03Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the restore is based on archiving.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fromArchive(Boolean fromArchive) {
                this.fromArchive = fromArchive;
                return this;
            }

            /**
             * <p>The start time of the restorable period.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-20T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The storage type of backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
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
    /**
     * 
     * {@link DescribeRestorableTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestorableTenantsResponseBody</p>
     */
    public static class Tenants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupBucketName")
        private String backupBucketName;

        @com.aliyun.core.annotation.NameInMap("BackupSets")
        private java.util.List<BackupSets> backupSets;

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
        private String tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TimeIntervalList")
        private java.util.List<TimeIntervalList> timeIntervalList;

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
        public java.util.List<BackupSets> getBackupSets() {
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
        public String getTenantMode() {
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
        public java.util.List<TimeIntervalList> getTimeIntervalList() {
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
            private java.util.List<BackupSets> backupSets; 
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
            private String tenantMode; 
            private String tenantName; 
            private java.util.List<TimeIntervalList> timeIntervalList; 
            private Long unitNum; 
            private Long usedDisk; 

            private Builder() {
            } 

            private Builder(Tenants model) {
                this.backupBucketName = model.backupBucketName;
                this.backupSets = model.backupSets;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.cpuNum = model.cpuNum;
                this.memoryNum = model.memoryNum;
                this.method = model.method;
                this.obRpmVersion = model.obRpmVersion;
                this.obTenantId = model.obTenantId;
                this.obVersion = model.obVersion;
                this.sourceRegion = model.sourceRegion;
                this.tenantAlias = model.tenantAlias;
                this.tenantDataBackupRemainDays = model.tenantDataBackupRemainDays;
                this.tenantId = model.tenantId;
                this.tenantMode = model.tenantMode;
                this.tenantName = model.tenantName;
                this.timeIntervalList = model.timeIntervalList;
                this.unitNum = model.unitNum;
                this.usedDisk = model.usedDisk;
            } 

            /**
             * <p>The name of the backup directory.</p>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder backupBucketName(String backupBucketName) {
                this.backupBucketName = backupBucketName;
                return this;
            }

            /**
             * <p>The list of backup sets.</p>
             */
            public Builder backupSets(java.util.List<BackupSets> backupSets) {
                this.backupSets = backupSets;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>objnf3b2****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testCluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuNum(Long cpuNum) {
                this.cpuNum = cpuNum;
                return this;
            }

            /**
             * <p>The size of memory for the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder memoryNum(Long memoryNum) {
                this.memoryNum = memoryNum;
                return this;
            }

            /**
             * <p>The backup method.</p>
             * 
             * <strong>example:</strong>
             * <p>logical</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The version of the OceanBase Database RPM package.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.3.1-2022080510****</p>
             */
            public Builder obRpmVersion(String obRpmVersion) {
                this.obRpmVersion = obRpmVersion;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>tvd43v****</p>
             */
            public Builder obTenantId(String obTenantId) {
                this.obTenantId = obTenantId;
                return this;
            }

            /**
             * <p>The major version of OceanBase Database.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.3.1</p>
             */
            public Builder obVersion(String obVersion) {
                this.obVersion = obVersion;
                return this;
            }

            /**
             * <p>The region of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>The alias of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder tenantAlias(String tenantAlias) {
                this.tenantAlias = tenantAlias;
                return this;
            }

            /**
             * <p>The remaining validity period, in days, of the backup data of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder tenantDataBackupRemainDays(Integer tenantDataBackupRemainDays) {
                this.tenantDataBackupRemainDays = tenantDataBackupRemainDays;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The mode of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>Oracle</p>
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>sbtest1</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The list of restorable periods of the tenant.</p>
             */
            public Builder timeIntervalList(java.util.List<TimeIntervalList> timeIntervalList) {
                this.timeIntervalList = timeIntervalList;
                return this;
            }

            /**
             * <p>The number of nodes of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * <p>The size of disk space for the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
