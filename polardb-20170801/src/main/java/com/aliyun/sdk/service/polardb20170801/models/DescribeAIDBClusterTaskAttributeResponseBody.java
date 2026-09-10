// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterTaskAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterTaskAttributeResponseBody</p>
 */
public class DescribeAIDBClusterTaskAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessInfo")
    private String accessInfo;

    @com.aliyun.core.annotation.NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomBucketInfo")
    private CustomBucketInfo customBucketInfo;

    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @com.aliyun.core.annotation.NameInMap("DBClusterStatusDesc")
    private String DBClusterStatusDesc;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("DataSets")
    private java.util.List<DataSets> dataSets;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.List<java.util.Map<String, ?>> extraInfo;

    @com.aliyun.core.annotation.NameInMap("KindCode")
    private Long kindCode;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("ModelPath")
    private String modelPath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private java.util.List<TaskInfo> taskInfo;

    @com.aliyun.core.annotation.NameInMap("TuneArch")
    private String tuneArch;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeAIDBClusterTaskAttributeResponseBody(Builder builder) {
        this.accessInfo = builder.accessInfo;
        this.clusterNetworkType = builder.clusterNetworkType;
        this.createTime = builder.createTime;
        this.customBucketInfo = builder.customBucketInfo;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.DBClusterStatusDesc = builder.DBClusterStatusDesc;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.dataSets = builder.dataSets;
        this.extraInfo = builder.extraInfo;
        this.kindCode = builder.kindCode;
        this.lockMode = builder.lockMode;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.modelPath = builder.modelPath;
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
        this.tuneArch = builder.tuneArch;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterTaskAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInfo
     */
    public String getAccessInfo() {
        return this.accessInfo;
    }

    /**
     * @return clusterNetworkType
     */
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customBucketInfo
     */
    public CustomBucketInfo getCustomBucketInfo() {
        return this.customBucketInfo;
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
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    /**
     * @return DBClusterStatusDesc
     */
    public String getDBClusterStatusDesc() {
        return this.DBClusterStatusDesc;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return dataSets
     */
    public java.util.List<DataSets> getDataSets() {
        return this.dataSets;
    }

    /**
     * @return extraInfo
     */
    public java.util.List<java.util.Map<String, ?>> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return kindCode
     */
    public Long getKindCode() {
        return this.kindCode;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return modelPath
     */
    public String getModelPath() {
        return this.modelPath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public java.util.List<TaskInfo> getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @return tuneArch
     */
    public String getTuneArch() {
        return this.tuneArch;
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

    public static final class Builder {
        private String accessInfo; 
        private String clusterNetworkType; 
        private String createTime; 
        private CustomBucketInfo customBucketInfo; 
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String DBClusterStatus; 
        private String DBClusterStatusDesc; 
        private String DBType; 
        private String DBVersion; 
        private java.util.List<DataSets> dataSets; 
        private java.util.List<java.util.Map<String, ?>> extraInfo; 
        private Long kindCode; 
        private String lockMode; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String modelPath; 
        private String requestId; 
        private java.util.List<TaskInfo> taskInfo; 
        private String tuneArch; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterTaskAttributeResponseBody model) {
            this.accessInfo = model.accessInfo;
            this.clusterNetworkType = model.clusterNetworkType;
            this.createTime = model.createTime;
            this.customBucketInfo = model.customBucketInfo;
            this.DBClusterDescription = model.DBClusterDescription;
            this.DBClusterId = model.DBClusterId;
            this.DBClusterStatus = model.DBClusterStatus;
            this.DBClusterStatusDesc = model.DBClusterStatusDesc;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.dataSets = model.dataSets;
            this.extraInfo = model.extraInfo;
            this.kindCode = model.kindCode;
            this.lockMode = model.lockMode;
            this.maintainEndTime = model.maintainEndTime;
            this.maintainStartTime = model.maintainStartTime;
            this.modelPath = model.modelPath;
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
            this.tuneArch = model.tuneArch;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
        } 

        /**
         * <p>The access information of the model in the test deployment scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;networkInterfaceId\&quot;:\&quot;eni-2zea***\&quot;,\&quot;port\&quot;:\&quot;8000\&quot;,\&quot;host\&quot;:\&quot;192.<strong>.</strong>.**\&quot;}</p>
         */
        public Builder accessInfo(String accessInfo) {
            this.accessInfo = accessInfo;
            return this;
        }

        /**
         * <p>The network type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-12T03:45:13Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CustomBucketInfo.
         */
        public Builder customBucketInfo(CustomBucketInfo customBucketInfo) {
            this.customBucketInfo = customBucketInfo;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>task01</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze99***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The training status. Valid values:</p>
         * <ul>
         * <li><strong>ACTIVATION</strong>: Training in progress.</li>
         * <li><strong>COMPLETED</strong>: Training succeeded.</li>
         * <li><strong>FAILED</strong>: Training failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The training status. Valid values:</p>
         * <ul>
         * <li><strong>ACTIVATION</strong>: Training in progress.</li>
         * <li><strong>COMPLETED</strong>: Training succeeded.</li>
         * <li><strong>FAILED</strong>: Training failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder DBClusterStatusDesc(String DBClusterStatusDesc) {
            this.DBClusterStatusDesc = DBClusterStatusDesc;
            return this;
        }

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_ai</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version. Valid values:</p>
         * <ul>
         * <li><strong>3.1</strong>: model operator tuning.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3.1</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The datasets.</p>
         */
        public Builder dataSets(java.util.List<DataSets> dataSets) {
            this.dataSets = dataSets;
            return this;
        }

        /**
         * <p>The additional information, including runtime parameters.</p>
         */
        public Builder extraInfo(java.util.List<java.util.Map<String, ?>> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>18</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder kindCode(Long kindCode) {
            this.kindCode = kindCode;
            return this;
        }

        /**
         * <p>The lock mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: locked.</li>
         * <li><strong>1</strong>: unlocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The maintenance end time.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The maintenance start time.</p>
         * 
         * <strong>example:</strong>
         * <p>8:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>The list of model paths output in the model fine-tuning scenario.</p>
         */
        public Builder modelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>45D24263-7E3A-4140-9472-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder taskInfo(java.util.List<TaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * TuneArch.
         */
        public Builder tuneArch(String tuneArch) {
            this.tuneArch = tuneArch;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        public DescribeAIDBClusterTaskAttributeResponseBody build() {
            return new DescribeAIDBClusterTaskAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskAttributeResponseBody</p>
     */
    public static class CustomBucketInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomOssBucketName")
        private String customOssBucketName;

        private CustomBucketInfo(Builder builder) {
            this.customOssBucketName = builder.customOssBucketName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomBucketInfo create() {
            return builder().build();
        }

        /**
         * @return customOssBucketName
         */
        public String getCustomOssBucketName() {
            return this.customOssBucketName;
        }

        public static final class Builder {
            private String customOssBucketName; 

            private Builder() {
            } 

            private Builder(CustomBucketInfo model) {
                this.customOssBucketName = model.customOssBucketName;
            } 

            /**
             * CustomOssBucketName.
             */
            public Builder customOssBucketName(String customOssBucketName) {
                this.customOssBucketName = customOssBucketName;
                return this;
            }

            public CustomBucketInfo build() {
                return new CustomBucketInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskAttributeResponseBody</p>
     */
    public static class DataSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SplitDatasetRatio")
        private String splitDatasetRatio;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSets(Builder builder) {
            this.datasetName = builder.datasetName;
            this.path = builder.path;
            this.splitDatasetRatio = builder.splitDatasetRatio;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSets create() {
            return builder().build();
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return splitDatasetRatio
         */
        public String getSplitDatasetRatio() {
            return this.splitDatasetRatio;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String datasetName; 
            private String path; 
            private String splitDatasetRatio; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSets model) {
                this.datasetName = model.datasetName;
                this.path = model.path;
                this.splitDatasetRatio = model.splitDatasetRatio;
                this.type = model.type;
            } 

            /**
             * <p>The dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset02</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The dataset path.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_ai/datasets/train/grpo/dataset02/test-**.jsonl#1000</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The ratio split from the training set.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder splitDatasetRatio(String splitDatasetRatio) {
                this.splitDatasetRatio = splitDatasetRatio;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li><strong>train</strong>: training set.</li>
             * <li><strong>eval</strong>: validation set.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>train</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSets build() {
                return new DataSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskAttributeResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedTime")
        private String completedTime;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelPath")
        private String modelPath;

        @com.aliyun.core.annotation.NameInMap("ModelSource")
        private String modelSource;

        @com.aliyun.core.annotation.NameInMap("RunningTimes")
        private String runningTimes;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TrainMode")
        private String trainMode;

        @com.aliyun.core.annotation.NameInMap("TrainType")
        private String trainType;

        private TaskInfo(Builder builder) {
            this.completedTime = builder.completedTime;
            this.modelName = builder.modelName;
            this.modelPath = builder.modelPath;
            this.modelSource = builder.modelSource;
            this.runningTimes = builder.runningTimes;
            this.startTime = builder.startTime;
            this.trainMode = builder.trainMode;
            this.trainType = builder.trainType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelPath
         */
        public String getModelPath() {
            return this.modelPath;
        }

        /**
         * @return modelSource
         */
        public String getModelSource() {
            return this.modelSource;
        }

        /**
         * @return runningTimes
         */
        public String getRunningTimes() {
            return this.runningTimes;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return trainMode
         */
        public String getTrainMode() {
            return this.trainMode;
        }

        /**
         * @return trainType
         */
        public String getTrainType() {
            return this.trainType;
        }

        public static final class Builder {
            private String completedTime; 
            private String modelName; 
            private String modelPath; 
            private String modelSource; 
            private String runningTimes; 
            private String startTime; 
            private String trainMode; 
            private String trainType; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.completedTime = model.completedTime;
                this.modelName = model.modelName;
                this.modelPath = model.modelPath;
                this.modelSource = model.modelSource;
                this.runningTimes = model.runningTimes;
                this.startTime = model.startTime;
                this.trainMode = model.trainMode;
                this.trainType = model.trainType;
            } 

            /**
             * <p>The task completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-10T01:56:00Z</p>
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * <p>The foundation model.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen-1.7B</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The path of the custom model.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen-1.7B</p>
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * <p>The model source. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: pre-trained model.</li>
             * <li><strong>custom</strong>: custom model.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder modelSource(String modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * <p>The runtime parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;split_dataset_ratio&quot;: 0.1,&quot;train_mode&quot;: &quot;grpo&quot;,&quot;train_type&quot;: &quot;lora&quot;,&quot;num_epochs&quot;: 1,&quot;batch_size&quot;: 2,&quot;eval_batch_size&quot;: 2, &quot;num_generations&quot;: 2, &quot;learning_rate&quot;: &quot;1e-6&quot;, &quot;data_file_list&quot;: &quot;test-00000-of-00001.jsonl#1000&quot;, &quot;lora_rank&quot;: 8, &quot;lora_alpha&quot;: 32, &quot;external_plugins&quot;: &quot;/plugin/train/plugin.py&quot;, &quot;reward_funcs&quot;: &quot;format,external_countdown&quot;, &quot;gpu_memory_utilization&quot;: 0.4}</p>
             */
            public Builder runningTimes(String runningTimes) {
                this.runningTimes = runningTimes;
                return this;
            }

            /**
             * <p>The task start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-10T01:56:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>sft</strong>: SFT efficient training.</li>
             * <li><strong>grpo</strong>: GRPO reinforcement learning.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stf</p>
             */
            public Builder trainMode(String trainMode) {
                this.trainMode = trainMode;
                return this;
            }

            /**
             * <p>The training method. Valid values:</p>
             * <ul>
             * <li><strong>lora</strong></li>
             * <li><strong>full</strong>: full-parameter fine-tuning.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lora</p>
             */
            public Builder trainType(String trainType) {
                this.trainType = trainType;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
