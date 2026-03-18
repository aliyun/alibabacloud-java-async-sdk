// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeBackupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeBackupsResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class NodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("DiskNumber")
        private String diskNumber;

        @com.aliyun.core.annotation.NameInMap("LocalStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("ResidentNodeNumber")
        private String residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("StoragePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        private NodeGroups(Builder builder) {
            this.componentType = builder.componentType;
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public String getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public String getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String componentType; 
            private Integer cu; 
            private String diskNumber; 
            private String localStorageInstanceType; 
            private String residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(NodeGroups model) {
                this.componentType = model.componentType;
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
            } 

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * DiskNumber.
             */
            public Builder diskNumber(String diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * LocalStorageInstanceType.
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * ResidentNodeNumber.
             */
            public Builder residentNodeNumber(String residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * StoragePerformanceLevel.
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public NodeGroups build() {
                return new NodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class InstanceSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("NodeGroups")
        private java.util.List<NodeGroups> nodeGroups;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private InstanceSnapshot(Builder builder) {
            this.instanceName = builder.instanceName;
            this.minorVersion = builder.minorVersion;
            this.nodeGroups = builder.nodeGroups;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runMode = builder.runMode;
            this.specType = builder.specType;
            this.tags = builder.tags;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSnapshot create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return nodeGroups
         */
        public java.util.List<NodeGroups> getNodeGroups() {
            return this.nodeGroups;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String instanceName; 
            private String minorVersion; 
            private java.util.List<NodeGroups> nodeGroups; 
            private String regionId; 
            private String resourceGroupId; 
            private String runMode; 
            private String specType; 
            private java.util.List<Tags> tags; 
            private String version; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(InstanceSnapshot model) {
                this.instanceName = model.instanceName;
                this.minorVersion = model.minorVersion;
                this.nodeGroups = model.nodeGroups;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runMode = model.runMode;
                this.specType = model.specType;
                this.tags = model.tags;
                this.version = model.version;
                this.vpcId = model.vpcId;
            } 

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * NodeGroups.
             */
            public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
                this.nodeGroups = nodeGroups;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RunMode.
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0cez8106f2n85c2d7i</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public InstanceSnapshot build() {
                return new InstanceSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class SubTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataBase")
        private String dataBase;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private SubTasks(Builder builder) {
            this.dataBase = builder.dataBase;
            this.detail = builder.detail;
            this.finishedTime = builder.finishedTime;
            this.size = builder.size;
            this.snapshotName = builder.snapshotName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTasks create() {
            return builder().build();
        }

        /**
         * @return dataBase
         */
        public String getDataBase() {
            return this.dataBase;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshotName
         */
        public String getSnapshotName() {
            return this.snapshotName;
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
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String dataBase; 
            private String detail; 
            private Long finishedTime; 
            private Long size; 
            private String snapshotName; 
            private Long startTime; 
            private String status; 
            private String table; 

            private Builder() {
            } 

            private Builder(SubTasks model) {
                this.dataBase = model.dataBase;
                this.detail = model.detail;
                this.finishedTime = model.finishedTime;
                this.size = model.size;
                this.snapshotName = model.snapshotName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.table = model.table;
            } 

            /**
             * DataBase.
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotName.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
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
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public SubTasks build() {
                return new SubTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupFinishedTime")
        private Long backupFinishedTime;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private Long backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupTaskId")
        private String backupTaskId;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSnapshot")
        private InstanceSnapshot instanceSnapshot;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubTasks")
        private java.util.List<SubTasks> subTasks;

        private Data(Builder builder) {
            this.backupFinishedTime = builder.backupFinishedTime;
            this.backupStartTime = builder.backupStartTime;
            this.backupTaskId = builder.backupTaskId;
            this.backupType = builder.backupType;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceSnapshot = builder.instanceSnapshot;
            this.regionId = builder.regionId;
            this.size = builder.size;
            this.status = builder.status;
            this.subTasks = builder.subTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupFinishedTime
         */
        public Long getBackupFinishedTime() {
            return this.backupFinishedTime;
        }

        /**
         * @return backupStartTime
         */
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupTaskId
         */
        public String getBackupTaskId() {
            return this.backupTaskId;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return instanceSnapshot
         */
        public InstanceSnapshot getInstanceSnapshot() {
            return this.instanceSnapshot;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subTasks
         */
        public java.util.List<SubTasks> getSubTasks() {
            return this.subTasks;
        }

        public static final class Builder {
            private Long backupFinishedTime; 
            private Long backupStartTime; 
            private String backupTaskId; 
            private String backupType; 
            private String description; 
            private Long expireTime; 
            private String instanceId; 
            private InstanceSnapshot instanceSnapshot; 
            private String regionId; 
            private Long size; 
            private String status; 
            private java.util.List<SubTasks> subTasks; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.backupFinishedTime = model.backupFinishedTime;
                this.backupStartTime = model.backupStartTime;
                this.backupTaskId = model.backupTaskId;
                this.backupType = model.backupType;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceSnapshot = model.instanceSnapshot;
                this.regionId = model.regionId;
                this.size = model.size;
                this.status = model.status;
                this.subTasks = model.subTasks;
            } 

            /**
             * BackupFinishedTime.
             */
            public Builder backupFinishedTime(Long backupFinishedTime) {
                this.backupFinishedTime = backupFinishedTime;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(Long backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupTaskId.
             */
            public Builder backupTaskId(String backupTaskId) {
                this.backupTaskId = backupTaskId;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * InstanceSnapshot.
             */
            public Builder instanceSnapshot(InstanceSnapshot instanceSnapshot) {
                this.instanceSnapshot = instanceSnapshot;
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
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
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
             * SubTasks.
             */
            public Builder subTasks(java.util.List<SubTasks> subTasks) {
                this.subTasks = subTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
