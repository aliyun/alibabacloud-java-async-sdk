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

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeAIDBClusterTaskAttributeResponseBody(Builder builder) {
        this.accessInfo = builder.accessInfo;
        this.clusterNetworkType = builder.clusterNetworkType;
        this.createTime = builder.createTime;
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
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterTaskAttributeResponseBody model) {
            this.accessInfo = model.accessInfo;
            this.clusterNetworkType = model.clusterNetworkType;
            this.createTime = model.createTime;
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
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
        } 

        /**
         * AccessInfo.
         */
        public Builder accessInfo(String accessInfo) {
            this.accessInfo = accessInfo;
            return this;
        }

        /**
         * ClusterNetworkType.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
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
         * DBClusterStatus.
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * DBClusterStatusDesc.
         */
        public Builder DBClusterStatusDesc(String DBClusterStatusDesc) {
            this.DBClusterStatusDesc = DBClusterStatusDesc;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
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
         * DataSets.
         */
        public Builder dataSets(java.util.List<DataSets> dataSets) {
            this.dataSets = dataSets;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.List<java.util.Map<String, ?>> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * KindCode.
         */
        public Builder kindCode(Long kindCode) {
            this.kindCode = kindCode;
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
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * ModelPath.
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
         * TaskInfo.
         */
        public Builder taskInfo(java.util.List<TaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
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
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * SplitDatasetRatio.
             */
            public Builder splitDatasetRatio(String splitDatasetRatio) {
                this.splitDatasetRatio = splitDatasetRatio;
                return this;
            }

            /**
             * Type.
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
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelPath.
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * ModelSource.
             */
            public Builder modelSource(String modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * RunningTimes.
             */
            public Builder runningTimes(String runningTimes) {
                this.runningTimes = runningTimes;
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
             * TrainMode.
             */
            public Builder trainMode(String trainMode) {
                this.trainMode = trainMode;
                return this;
            }

            /**
             * TrainType.
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
