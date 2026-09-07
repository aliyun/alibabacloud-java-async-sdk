// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersResponseBody</p>
 */
public class DescribeDBClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBClustersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDBClustersResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EDBA27-AF3E-5966-9503-FD1557E19167</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBClustersResponseBody build() {
            return new DescribeDBClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class StepList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepDesc")
        private String stepDesc;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepProgress")
        private String stepProgress;

        @com.aliyun.core.annotation.NameInMap("StepStatus")
        private String stepStatus;

        private StepList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.stepDesc = builder.stepDesc;
            this.stepName = builder.stepName;
            this.stepProgress = builder.stepProgress;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepDesc
         */
        public String getStepDesc() {
            return this.stepDesc;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepProgress
         */
        public String getStepProgress() {
            return this.stepProgress;
        }

        /**
         * @return stepStatus
         */
        public String getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private String stepDesc; 
            private String stepName; 
            private String stepProgress; 
            private String stepStatus; 

            private Builder() {
            } 

            private Builder(StepList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.stepDesc = model.stepDesc;
                this.stepName = model.stepName;
                this.stepProgress = model.stepProgress;
                this.stepStatus = model.stepStatus;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * StepDesc.
             */
            public Builder stepDesc(String stepDesc) {
                this.stepDesc = stepDesc;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * StepProgress.
             */
            public Builder stepProgress(String stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * StepStatus.
             */
            public Builder stepStatus(String stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public StepList build() {
                return new StepList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class TaskInfoStepList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StepList")
        private java.util.List<StepList> stepList;

        private TaskInfoStepList(Builder builder) {
            this.stepList = builder.stepList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfoStepList create() {
            return builder().build();
        }

        /**
         * @return stepList
         */
        public java.util.List<StepList> getStepList() {
            return this.stepList;
        }

        public static final class Builder {
            private java.util.List<StepList> stepList; 

            private Builder() {
            } 

            private Builder(TaskInfoStepList model) {
                this.stepList = model.stepList;
            } 

            /**
             * StepList.
             */
            public Builder stepList(java.util.List<StepList> stepList) {
                this.stepList = stepList;
                return this;
            }

            public TaskInfoStepList build() {
                return new TaskInfoStepList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepList")
        private TaskInfoStepList stepList;

        private TaskInfo(Builder builder) {
            this.name = builder.name;
            this.progress = builder.progress;
            this.status = builder.status;
            this.stepList = builder.stepList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepList
         */
        public TaskInfoStepList getStepList() {
            return this.stepList;
        }

        public static final class Builder {
            private String name; 
            private String progress; 
            private String status; 
            private TaskInfoStepList stepList; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.name = model.name;
                this.progress = model.progress;
                this.status = model.status;
                this.stepList = model.stepList;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
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
             * StepList.
             */
            public Builder stepList(TaskInfoStepList stepList) {
                this.stepList = stepList;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class DBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AINodeNumber")
        private Integer AINodeNumber;

        @com.aliyun.core.annotation.NameInMap("AINodeSpec")
        private String AINodeSpec;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
        private String DBClusterNetworkType;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBClusterType")
        private String DBClusterType;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeCount")
        private Long DBNodeCount;

        @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
        private Long DBNodeStorage;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("ElasticIOResource")
        private Integer elasticIOResource;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("ExecutorCount")
        private String executorCount;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("InnerIp")
        private String innerIp;

        @com.aliyun.core.annotation.NameInMap("InnerPort")
        private String innerPort;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProductForm")
        private String productForm;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("RdsInstanceId")
        private String rdsInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservedACU")
        private String reservedACU;

        @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
        private Integer reservedNodeCount;

        @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
        private String reservedNodeSize;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StorageResource")
        private String storageResource;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TaskInfo")
        private TaskInfo taskInfo;

        @com.aliyun.core.annotation.NameInMap("VPCCloudInstanceId")
        private String VPCCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBCluster(Builder builder) {
            this.AINodeNumber = builder.AINodeNumber;
            this.AINodeSpec = builder.AINodeSpec;
            this.category = builder.category;
            this.commodityCode = builder.commodityCode;
            this.computeResource = builder.computeResource;
            this.connectionString = builder.connectionString;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterNetworkType = builder.DBClusterNetworkType;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBClusterType = builder.DBClusterType;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodeStorage = builder.DBNodeStorage;
            this.DBVersion = builder.DBVersion;
            this.diskType = builder.diskType;
            this.dtsJobId = builder.dtsJobId;
            this.elasticIOResource = builder.elasticIOResource;
            this.engine = builder.engine;
            this.executorCount = builder.executorCount;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.innerIp = builder.innerIp;
            this.innerPort = builder.innerPort;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.mode = builder.mode;
            this.payType = builder.payType;
            this.port = builder.port;
            this.productForm = builder.productForm;
            this.productVersion = builder.productVersion;
            this.rdsInstanceId = builder.rdsInstanceId;
            this.regionId = builder.regionId;
            this.reservedACU = builder.reservedACU;
            this.reservedNodeCount = builder.reservedNodeCount;
            this.reservedNodeSize = builder.reservedNodeSize;
            this.resourceGroupId = builder.resourceGroupId;
            this.storageResource = builder.storageResource;
            this.tags = builder.tags;
            this.taskInfo = builder.taskInfo;
            this.VPCCloudInstanceId = builder.VPCCloudInstanceId;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBCluster create() {
            return builder().build();
        }

        /**
         * @return AINodeNumber
         */
        public Integer getAINodeNumber() {
            return this.AINodeNumber;
        }

        /**
         * @return AINodeSpec
         */
        public String getAINodeSpec() {
            return this.AINodeSpec;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBClusterNetworkType
         */
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        /**
         * @return DBClusterStatus
         */
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        /**
         * @return DBClusterType
         */
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeCount
         */
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        /**
         * @return DBNodeStorage
         */
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return elasticIOResource
         */
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return executorCount
         */
        public String getExecutorCount() {
            return this.executorCount;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return innerIp
         */
        public String getInnerIp() {
            return this.innerIp;
        }

        /**
         * @return innerPort
         */
        public String getInnerPort() {
            return this.innerPort;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return productForm
         */
        public String getProductForm() {
            return this.productForm;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return rdsInstanceId
         */
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservedACU
         */
        public String getReservedACU() {
            return this.reservedACU;
        }

        /**
         * @return reservedNodeCount
         */
        public Integer getReservedNodeCount() {
            return this.reservedNodeCount;
        }

        /**
         * @return reservedNodeSize
         */
        public String getReservedNodeSize() {
            return this.reservedNodeSize;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return storageResource
         */
        public String getStorageResource() {
            return this.storageResource;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return taskInfo
         */
        public TaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        /**
         * @return VPCCloudInstanceId
         */
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer AINodeNumber; 
            private String AINodeSpec; 
            private String category; 
            private String commodityCode; 
            private String computeResource; 
            private String connectionString; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterNetworkType; 
            private String DBClusterStatus; 
            private String DBClusterType; 
            private String DBNodeClass; 
            private Long DBNodeCount; 
            private Long DBNodeStorage; 
            private String DBVersion; 
            private String diskType; 
            private String dtsJobId; 
            private Integer elasticIOResource; 
            private String engine; 
            private String executorCount; 
            private String expireTime; 
            private String expired; 
            private String innerIp; 
            private String innerPort; 
            private String lockMode; 
            private String lockReason; 
            private String mode; 
            private String payType; 
            private String port; 
            private String productForm; 
            private String productVersion; 
            private String rdsInstanceId; 
            private String regionId; 
            private String reservedACU; 
            private Integer reservedNodeCount; 
            private String reservedNodeSize; 
            private String resourceGroupId; 
            private String storageResource; 
            private Tags tags; 
            private TaskInfo taskInfo; 
            private String VPCCloudInstanceId; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBCluster model) {
                this.AINodeNumber = model.AINodeNumber;
                this.AINodeSpec = model.AINodeSpec;
                this.category = model.category;
                this.commodityCode = model.commodityCode;
                this.computeResource = model.computeResource;
                this.connectionString = model.connectionString;
                this.createTime = model.createTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterNetworkType = model.DBClusterNetworkType;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBClusterType = model.DBClusterType;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeCount = model.DBNodeCount;
                this.DBNodeStorage = model.DBNodeStorage;
                this.DBVersion = model.DBVersion;
                this.diskType = model.diskType;
                this.dtsJobId = model.dtsJobId;
                this.elasticIOResource = model.elasticIOResource;
                this.engine = model.engine;
                this.executorCount = model.executorCount;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.innerIp = model.innerIp;
                this.innerPort = model.innerPort;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.mode = model.mode;
                this.payType = model.payType;
                this.port = model.port;
                this.productForm = model.productForm;
                this.productVersion = model.productVersion;
                this.rdsInstanceId = model.rdsInstanceId;
                this.regionId = model.regionId;
                this.reservedACU = model.reservedACU;
                this.reservedNodeCount = model.reservedNodeCount;
                this.reservedNodeSize = model.reservedNodeSize;
                this.resourceGroupId = model.resourceGroupId;
                this.storageResource = model.storageResource;
                this.tags = model.tags;
                this.taskInfo = model.taskInfo;
                this.VPCCloudInstanceId = model.VPCCloudInstanceId;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AINodeNumber.
             */
            public Builder AINodeNumber(Integer AINodeNumber) {
                this.AINodeNumber = AINodeNumber;
                return this;
            }

            /**
             * AINodeSpec.
             */
            public Builder AINodeSpec(String AINodeSpec) {
                this.AINodeSpec = AINodeSpec;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ComputeResource.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBClusterDescription.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBClusterNetworkType.
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * DBClusterStatus.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * DBClusterType.
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeCount.
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * DBNodeStorage.
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * DtsJobId.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * ElasticIOResource.
             */
            public Builder elasticIOResource(Integer elasticIOResource) {
                this.elasticIOResource = elasticIOResource;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * ExecutorCount.
             */
            public Builder executorCount(String executorCount) {
                this.executorCount = executorCount;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * InnerIp.
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * InnerPort.
             */
            public Builder innerPort(String innerPort) {
                this.innerPort = innerPort;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ProductForm.
             */
            public Builder productForm(String productForm) {
                this.productForm = productForm;
                return this;
            }

            /**
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * RdsInstanceId.
             */
            public Builder rdsInstanceId(String rdsInstanceId) {
                this.rdsInstanceId = rdsInstanceId;
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
             * ReservedACU.
             */
            public Builder reservedACU(String reservedACU) {
                this.reservedACU = reservedACU;
                return this;
            }

            /**
             * ReservedNodeCount.
             */
            public Builder reservedNodeCount(Integer reservedNodeCount) {
                this.reservedNodeCount = reservedNodeCount;
                return this;
            }

            /**
             * ReservedNodeSize.
             */
            public Builder reservedNodeSize(String reservedNodeSize) {
                this.reservedNodeSize = reservedNodeSize;
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
             * StorageResource.
             */
            public Builder storageResource(String storageResource) {
                this.storageResource = storageResource;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TaskInfo.
             */
            public Builder taskInfo(TaskInfo taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            /**
             * VPCCloudInstanceId.
             */
            public Builder VPCCloudInstanceId(String VPCCloudInstanceId) {
                this.VPCCloudInstanceId = VPCCloudInstanceId;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBCluster build() {
                return new DBCluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBCluster")
        private java.util.List<DBCluster> DBCluster;

        private Items(Builder builder) {
            this.DBCluster = builder.DBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBCluster
         */
        public java.util.List<DBCluster> getDBCluster() {
            return this.DBCluster;
        }

        public static final class Builder {
            private java.util.List<DBCluster> DBCluster; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBCluster = model.DBCluster;
            } 

            /**
             * DBCluster.
             */
            public Builder DBCluster(java.util.List<DBCluster> DBCluster) {
                this.DBCluster = DBCluster;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
