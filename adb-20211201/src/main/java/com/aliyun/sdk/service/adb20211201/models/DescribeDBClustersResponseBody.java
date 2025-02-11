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

        /**
         * <p>The queried clusters.</p>
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

            /**
             * <p>The tag key.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/179253.html">TagResources</a> operation to add tags to a cluster.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
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

            /**
             * <p>The end time of the job step. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-10T10:28:34Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the job step. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-10T09:28:34Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The description of the job step.</p>
             * 
             * <strong>example:</strong>
             * <p>Apply resource</p>
             */
            public Builder stepDesc(String stepDesc) {
                this.stepDesc = stepDesc;
                return this;
            }

            /**
             * <p>The name of the job step.</p>
             * 
             * <strong>example:</strong>
             * <p>ApplyResource</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The progress of the job step. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder stepProgress(String stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * <p>The status of the job step. Valid values:</p>
             * <ul>
             * <li><strong>NOT_RUN</strong></li>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>SUCCEED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
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

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>analyticDBFlexibleScaleOut</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The progress of the job. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>NOT_RUN</strong></li>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>SUCCEED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job steps.</p>
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

            /**
             * <p>The mode of the cluster. This parameter is returned only for Data Warehouse Edition clusters. Valid values:</p>
             * <ul>
             * <li><strong>BASIC</strong>: reserved mode for Basic Edition.</li>
             * <li><strong>CLUSTER</strong>: reserved mode for Cluster Edition.</li>
             * <li><strong>MIXED_STORAGE</strong>: elastic mode for Cluster Edition.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about cluster editions, see <a href="https://help.aliyun.com/document_detail/205001.html">Editions</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MIXED_STORAGE</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The billing method of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>ads</strong>: pay-as-you-go.</li>
             * <li><strong>ads_pre</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ads_pre</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The specifications of reserved computing resources. Each ACU is approximately equal to 1 core and 4 GB memory. Computing resources are used to compute data. The increase in the computing resources can accelerate queries. You can scale computing resources based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * <p>The public endpoint that is used to connect to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-bp163885f8q21****.ads.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the <em>yyyy-mm-ddThh:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-01T09:50:18Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_test</p>
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-bp163885f8q21****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The network type of the cluster. <strong>VPC</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Preparing</strong></li>
             * </ul>
             * <!---->
             * 
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * <!---->
             * 
             * <ul>
             * <li><strong>Restoring</strong></li>
             * </ul>
             * <!---->
             * 
             * <ul>
             * <li><strong>ClassChanging</strong></li>
             * <li><strong>NetAddressCreating</strong></li>
             * <li><strong>NetAddressDeleting</strong></li>
             * <li><strong>NetAddressModifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * <p>The type of the cluster. By default, <strong>Common</strong> is returned, which indicates a common cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * <p>The node specifications of the cluster. This parameter is returned only for Data Warehouse Edition clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>E8</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The number of node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * <p>The storage capacity of the cluster. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * <p>The engine version of the AnalyticDB for MySQL Data Lakehouse Edition cluster. <strong>5.0</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The disk type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd</strong>: local disk.</li>
             * <li><strong>cloud</strong>: basic disk.</li>
             * <li><strong>cloud_ssd</strong>: standard SSD.</li>
             * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
             * <li><strong>cloud_essd</strong>: PL1 Enterprise SSD (ESSD).</li>
             * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
             * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The ID of the Data Transmission Service (DTS) synchronization job This parameter is returned only for MySQL analytic instances.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsb1578j90XXXX</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The number of elastic I/O units (EIUs). For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/189505.html">EIUs</a>&quot; section of the Scale out elastic I/O resources topic.</p>
             * <blockquote>
             * <p> This parameter is returned only for clusters in elastic mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder elasticIOResource(Integer elasticIOResource) {
                this.elasticIOResource = elasticIOResource;
                return this;
            }

            /**
             * <p>The engine of the cluster. <strong>AnalyticDB</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The number of compute nodes that are used by the cluster in elastic mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executorCount(String executorCount) {
                this.executorCount = executorCount;
                return this;
            }

            /**
             * <p>The time when the cluster expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the billing method of the cluster is subscription, the actual expiration time is returned.</p>
             * </li>
             * <li><p>If the billing method of the cluster is pay-as-you-go, null is returned.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2022-07-01T09:50:18Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the subscription cluster has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the cluster has expired, the system locks or releases the cluster within a period of time. We recommend that you renew the expired cluster. For more information, see <a href="https://help.aliyun.com/document_detail/135246.html">Renewal policy</a>.</p>
             * </li>
             * <li><p>This parameter is not returned for pay-as-you-go clusters.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The internal IP address of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.xx.xx</p>
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * <p>The internal port of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder innerPort(String innerPort) {
                this.innerPort = innerPort;
                return this;
            }

            /**
             * <p>The lock status of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The cluster is not locked.</li>
             * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The cluster is automatically locked due to cluster expiration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the cluster is locked.</p>
             * <blockquote>
             * <p> This parameter is returned only when the cluster was locked. <strong>instance_expire</strong> is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>instance_expire</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The mode of the cluster. By default, <strong>flexible</strong> is returned, which indicates that the cluster is in elastic mode.</p>
             * 
             * <strong>example:</strong>
             * <p>flexible</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The billing method of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The service type of the cluster. Valid values:</p>
             * <ul>
             * <li>LegacyForm</li>
             * <li>IntegrationForm</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IntegrationForm</p>
             */
            public Builder productForm(String productForm) {
                this.productForm = productForm;
                return this;
            }

            /**
             * <p>The edition of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>BasicVersion</strong>: Basic Edition.</li>
             * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseVersion</p>
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is returned only for MySQL analytic instances.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp11q28kvl688****</p>
             */
            public Builder rdsInstanceId(String rdsInstanceId) {
                this.rdsInstanceId = rdsInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remaining reserved computing resources that are available in the cluster. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>32ACU</p>
             */
            public Builder reservedACU(String reservedACU) {
                this.reservedACU = reservedACU;
                return this;
            }

            /**
             * <p>The number of reserved resource nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reservedNodeCount(Integer reservedNodeCount) {
                this.reservedNodeCount = reservedNodeCount;
                return this;
            }

            /**
             * <p>The single-node specifications of reserved resources.</p>
             * 
             * <strong>example:</strong>
             * <p>8ACU</p>
             */
            public Builder reservedNodeSize(String reservedNodeSize) {
                this.reservedNodeSize = reservedNodeSize;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyiu4ekp****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The specifications of reserved storage resources. Each AnalyticDB compute unit (ACU) is approximately equal to 1 core and 4 GB memory. Storage resources are used to read and write data. The increase in the storage resources can improve the read and write performance of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>24ACU</p>
             */
            public Builder storageResource(String storageResource) {
                this.storageResource = storageResource;
                return this;
            }

            /**
             * <p>The tags that are added to the cluster.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The job progress.</p>
             */
            public Builder taskInfo(TaskInfo taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            /**
             * <p>The ID of the cluster that resides in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bp163885f8q21****-controller</p>
             */
            public Builder VPCCloudInstanceId(String VPCCloudInstanceId) {
                this.VPCCloudInstanceId = VPCCloudInstanceId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp13h7uzhulpuxvnp****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1syh8vvw8yech7n****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
