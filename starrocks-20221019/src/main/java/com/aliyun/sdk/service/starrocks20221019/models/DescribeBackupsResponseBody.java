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
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The compute group type. Includes the following values:</p>
             * <ul>
             * <li><p>FE</p>
             * </li>
             * <li><p>BE</p>
             * </li>
             * <li><p>CN</p>
             * </li>
             * <li><p>OBSERVER</p>
             * </li>
             * <li><p>AGENT</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FE</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic unit of measurement for the service. 1 CU equals 1 CPU core + 4 GiB memory. If SpecType is memory-enhanced instance family, 1 CU equals 1 CPU core + 8 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of disks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder diskNumber(String diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * <p>The node group\&quot;s local SSD instance type. This value is only meaningful for ECS instances where SpecType is local SSD or large-capacity storage.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder residentNodeNumber(String residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * <p>The compute group specification type. Includes the following types:</p>
             * <ul>
             * <li><p>standard: Standard Edition.</p>
             * </li>
             * <li><p>localSSD: Local SSD.</p>
             * </li>
             * <li><p>bigData: Large-capacity storage.</p>
             * </li>
             * <li><p>ramEnhanced: Memory-enhanced instance family.</p>
             * </li>
             * <li><p>networkEnhanced: Network-enhanced.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk. Includes the following values:</p>
             * <ul>
             * <li><p>pl0: Maximum random read/write IOPS of 10,000 per disk.</p>
             * </li>
             * <li><p>pl1: Maximum random read/write IOPS of 50,000 per disk.</p>
             * </li>
             * <li><p>pl2: Maximum random read/write IOPS of 100,000 per disk.</p>
             * </li>
             * <li><p>pl3: Maximum random read/write IOPS of 1,000,000 per disk.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pl1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage size in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>bk-time</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1747708000</p>
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
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>c-37708ec80b5****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The minor version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3.3.13-1.0-1.7.2</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The compute group information.</p>
             */
            public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
                this.nodeGroups = nodeGroups;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzd7frphchx3a</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The cluster\&quot;s running mode:</p>
             * <ul>
             * <li><p>Shared-nothing.</p>
             * </li>
             * <li><p>Shared-data.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>shared_data</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The compute group specification type. Includes the following types:</p>
             * <ul>
             * <li><p>standard: Standard Edition.</p>
             * </li>
             * <li><p>localSSD: Local SSD.</p>
             * </li>
             * <li><p>bigData: Large-capacity storage.</p>
             * </li>
             * <li><p>ramEnhanced: Memory-enhanced instance family.</p>
             * </li>
             * <li><p>networkEnhanced: Network-enhanced.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The cluster version.</p>
             * 
             * <strong>example:</strong>
             * <p>3.3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
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
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder dataBase(String dataBase) {
                this.dataBase = dataBase;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The task end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1747718190</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The data size in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The snapshot name.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-10_backup</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The task start date.</p>
             * 
             * <strong>example:</strong>
             * <p>1747708190</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The backup job status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The data table name.</p>
             * 
             * <strong>example:</strong>
             * <p>cdc_ods_t2030_lcpf_api_topic_msg</p>
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
             * <p>The end time of this backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179028000</p>
             */
            public Builder backupFinishedTime(Long backupFinishedTime) {
                this.backupFinishedTime = backupFinishedTime;
                return this;
            }

            /**
             * <p>The start time of this backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179018000</p>
             */
            public Builder backupStartTime(Long backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The backup task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bt-12sui21312dd</p>
             */
            public Builder backupTaskId(String backupTaskId) {
                this.backupTaskId = backupTaskId;
                return this;
            }

            /**
             * <p>The backup type:</p>
             * <ul>
             * <li><p><strong>0</strong>: Fast backup.</p>
             * </li>
             * <li><p><strong>1</strong>: Consistent backup.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullBackup</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>任务描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>1742189008000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-d4be777ff5e8cXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The backup instance information.</p>
             */
            public Builder instanceSnapshot(InstanceSnapshot instanceSnapshot) {
                this.instanceSnapshot = instanceSnapshot;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The cloud disk size in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The backup job status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of backup subtasks.</p>
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
