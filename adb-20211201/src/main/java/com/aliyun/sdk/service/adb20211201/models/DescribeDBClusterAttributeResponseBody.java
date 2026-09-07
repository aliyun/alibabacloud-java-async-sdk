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
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAttributeResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterAttributeResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAttributeResponseBody build() {
            return new DescribeDBClusterAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class DBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AINodeNumber")
        private Integer AINodeNumber;

        @com.aliyun.core.annotation.NameInMap("AINodeSpec")
        private String AINodeSpec;

        @com.aliyun.core.annotation.NameInMap("ClickhouseEngineCacheSize")
        private Integer clickhouseEngineCacheSize;

        @com.aliyun.core.annotation.NameInMap("ClickhouseEngineEnabled")
        private Boolean clickhouseEngineEnabled;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("ComputeResourceTotal")
        private String computeResourceTotal;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

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

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("DiskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("KmsId")
        private String kmsId;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProductForm")
        private String productForm;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

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

        @com.aliyun.core.annotation.NameInMap("SecondaryVSwitchId")
        private String secondaryVSwitchId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("StorageResource")
        private String storageResource;

        @com.aliyun.core.annotation.NameInMap("StorageResourceTotal")
        private String storageResourceTotal;

        @com.aliyun.core.annotation.NameInMap("SupportedFeatures")
        private java.util.Map<String, String> supportedFeatures;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TaskInfo")
        private TaskInfo taskInfo;

        @com.aliyun.core.annotation.NameInMap("UserENIStatus")
        private Boolean userENIStatus;

        @com.aliyun.core.annotation.NameInMap("UserENIVSwitchOptions")
        private String userENIVSwitchOptions;

        @com.aliyun.core.annotation.NameInMap("UserENIVpcId")
        private String userENIVpcId;

        @com.aliyun.core.annotation.NameInMap("UserENIZoneOptions")
        private String userENIZoneOptions;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBCluster(Builder builder) {
            this.AINodeNumber = builder.AINodeNumber;
            this.AINodeSpec = builder.AINodeSpec;
            this.clickhouseEngineCacheSize = builder.clickhouseEngineCacheSize;
            this.clickhouseEngineEnabled = builder.clickhouseEngineEnabled;
            this.commodityCode = builder.commodityCode;
            this.computeResource = builder.computeResource;
            this.computeResourceTotal = builder.computeResourceTotal;
            this.connectionString = builder.connectionString;
            this.creationTime = builder.creationTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterNetworkType = builder.DBClusterNetworkType;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBClusterType = builder.DBClusterType;
            this.DBVersion = builder.DBVersion;
            this.diskEncryption = builder.diskEncryption;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.kmsId = builder.kmsId;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.mode = builder.mode;
            this.payType = builder.payType;
            this.port = builder.port;
            this.productForm = builder.productForm;
            this.productVersion = builder.productVersion;
            this.regionId = builder.regionId;
            this.reservedACU = builder.reservedACU;
            this.reservedNodeCount = builder.reservedNodeCount;
            this.reservedNodeSize = builder.reservedNodeSize;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryVSwitchId = builder.secondaryVSwitchId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.storageResource = builder.storageResource;
            this.storageResourceTotal = builder.storageResourceTotal;
            this.supportedFeatures = builder.supportedFeatures;
            this.tags = builder.tags;
            this.taskInfo = builder.taskInfo;
            this.userENIStatus = builder.userENIStatus;
            this.userENIVSwitchOptions = builder.userENIVSwitchOptions;
            this.userENIVpcId = builder.userENIVpcId;
            this.userENIZoneOptions = builder.userENIZoneOptions;
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
         * @return clickhouseEngineCacheSize
         */
        public Integer getClickhouseEngineCacheSize() {
            return this.clickhouseEngineCacheSize;
        }

        /**
         * @return clickhouseEngineEnabled
         */
        public Boolean getClickhouseEngineEnabled() {
            return this.clickhouseEngineEnabled;
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
         * @return computeResourceTotal
         */
        public String getComputeResourceTotal() {
            return this.computeResourceTotal;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
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
         * @return kmsId
         */
        public String getKmsId() {
            return this.kmsId;
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
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
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
        public Integer getPort() {
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
         * @return secondaryVSwitchId
         */
        public String getSecondaryVSwitchId() {
            return this.secondaryVSwitchId;
        }

        /**
         * @return secondaryZoneId
         */
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        /**
         * @return storageResource
         */
        public String getStorageResource() {
            return this.storageResource;
        }

        /**
         * @return storageResourceTotal
         */
        public String getStorageResourceTotal() {
            return this.storageResourceTotal;
        }

        /**
         * @return supportedFeatures
         */
        public java.util.Map<String, String> getSupportedFeatures() {
            return this.supportedFeatures;
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
         * @return userENIStatus
         */
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        /**
         * @return userENIVSwitchOptions
         */
        public String getUserENIVSwitchOptions() {
            return this.userENIVSwitchOptions;
        }

        /**
         * @return userENIVpcId
         */
        public String getUserENIVpcId() {
            return this.userENIVpcId;
        }

        /**
         * @return userENIZoneOptions
         */
        public String getUserENIZoneOptions() {
            return this.userENIZoneOptions;
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
            private Integer clickhouseEngineCacheSize; 
            private Boolean clickhouseEngineEnabled; 
            private String commodityCode; 
            private String computeResource; 
            private String computeResourceTotal; 
            private String connectionString; 
            private String creationTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterNetworkType; 
            private String DBClusterStatus; 
            private String DBClusterType; 
            private String DBVersion; 
            private Boolean diskEncryption; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String expired; 
            private String kmsId; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String mode; 
            private String payType; 
            private Integer port; 
            private String productForm; 
            private String productVersion; 
            private String regionId; 
            private String reservedACU; 
            private Integer reservedNodeCount; 
            private String reservedNodeSize; 
            private String resourceGroupId; 
            private String secondaryVSwitchId; 
            private String secondaryZoneId; 
            private String storageResource; 
            private String storageResourceTotal; 
            private java.util.Map<String, String> supportedFeatures; 
            private Tags tags; 
            private TaskInfo taskInfo; 
            private Boolean userENIStatus; 
            private String userENIVSwitchOptions; 
            private String userENIVpcId; 
            private String userENIZoneOptions; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBCluster model) {
                this.AINodeNumber = model.AINodeNumber;
                this.AINodeSpec = model.AINodeSpec;
                this.clickhouseEngineCacheSize = model.clickhouseEngineCacheSize;
                this.clickhouseEngineEnabled = model.clickhouseEngineEnabled;
                this.commodityCode = model.commodityCode;
                this.computeResource = model.computeResource;
                this.computeResourceTotal = model.computeResourceTotal;
                this.connectionString = model.connectionString;
                this.creationTime = model.creationTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterNetworkType = model.DBClusterNetworkType;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBClusterType = model.DBClusterType;
                this.DBVersion = model.DBVersion;
                this.diskEncryption = model.diskEncryption;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.kmsId = model.kmsId;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainTime = model.maintainTime;
                this.mode = model.mode;
                this.payType = model.payType;
                this.port = model.port;
                this.productForm = model.productForm;
                this.productVersion = model.productVersion;
                this.regionId = model.regionId;
                this.reservedACU = model.reservedACU;
                this.reservedNodeCount = model.reservedNodeCount;
                this.reservedNodeSize = model.reservedNodeSize;
                this.resourceGroupId = model.resourceGroupId;
                this.secondaryVSwitchId = model.secondaryVSwitchId;
                this.secondaryZoneId = model.secondaryZoneId;
                this.storageResource = model.storageResource;
                this.storageResourceTotal = model.storageResourceTotal;
                this.supportedFeatures = model.supportedFeatures;
                this.tags = model.tags;
                this.taskInfo = model.taskInfo;
                this.userENIStatus = model.userENIStatus;
                this.userENIVSwitchOptions = model.userENIVSwitchOptions;
                this.userENIVpcId = model.userENIVpcId;
                this.userENIZoneOptions = model.userENIZoneOptions;
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
             * ClickhouseEngineCacheSize.
             */
            public Builder clickhouseEngineCacheSize(Integer clickhouseEngineCacheSize) {
                this.clickhouseEngineCacheSize = clickhouseEngineCacheSize;
                return this;
            }

            /**
             * ClickhouseEngineEnabled.
             */
            public Builder clickhouseEngineEnabled(Boolean clickhouseEngineEnabled) {
                this.clickhouseEngineEnabled = clickhouseEngineEnabled;
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
             * ComputeResourceTotal.
             */
            public Builder computeResourceTotal(String computeResourceTotal) {
                this.computeResourceTotal = computeResourceTotal;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * DiskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
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
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
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
             * KmsId.
             */
            public Builder kmsId(String kmsId) {
                this.kmsId = kmsId;
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
             * MaintainTime.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
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
            public Builder port(Integer port) {
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
             * SecondaryVSwitchId.
             */
            public Builder secondaryVSwitchId(String secondaryVSwitchId) {
                this.secondaryVSwitchId = secondaryVSwitchId;
                return this;
            }

            /**
             * SecondaryZoneId.
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
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
             * StorageResourceTotal.
             */
            public Builder storageResourceTotal(String storageResourceTotal) {
                this.storageResourceTotal = storageResourceTotal;
                return this;
            }

            /**
             * SupportedFeatures.
             */
            public Builder supportedFeatures(java.util.Map<String, String> supportedFeatures) {
                this.supportedFeatures = supportedFeatures;
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
             * UserENIStatus.
             */
            public Builder userENIStatus(Boolean userENIStatus) {
                this.userENIStatus = userENIStatus;
                return this;
            }

            /**
             * UserENIVSwitchOptions.
             */
            public Builder userENIVSwitchOptions(String userENIVSwitchOptions) {
                this.userENIVSwitchOptions = userENIVSwitchOptions;
                return this;
            }

            /**
             * UserENIVpcId.
             */
            public Builder userENIVpcId(String userENIVpcId) {
                this.userENIVpcId = userENIVpcId;
                return this;
            }

            /**
             * UserENIZoneOptions.
             */
            public Builder userENIZoneOptions(String userENIZoneOptions) {
                this.userENIZoneOptions = userENIZoneOptions;
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
