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
 * {@link DescribeAIDBClusterTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterTasksResponseBody</p>
 */
public class DescribeAIDBClusterTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeAIDBClusterTasksResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.items = builder.items;
        this.relativeDBClusterId = builder.relativeDBClusterId;
        this.requestId = builder.requestId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return relativeDBClusterId
     */
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String engine; 
        private String engineVersion; 
        private java.util.List<Items> items; 
        private String relativeDBClusterId; 
        private String requestId; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterTasksResponseBody model) {
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.items = model.items;
            this.relativeDBClusterId = model.relativeDBClusterId;
            this.requestId = model.requestId;
            this.taskType = model.taskType;
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
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RelativeDBClusterId.
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public DescribeAIDBClusterTasksResponseBody build() {
            return new DescribeAIDBClusterTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedTime")
        private String completedTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBNodeDescription")
        private String DBNodeDescription;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatusDesc")
        private String DBNodeStatusDesc;

        @com.aliyun.core.annotation.NameInMap("DataZoneId")
        private String dataZoneId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

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

        private Items(Builder builder) {
            this.completedTime = builder.completedTime;
            this.creationTime = builder.creationTime;
            this.DBNodeDescription = builder.DBNodeDescription;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.DBNodeStatusDesc = builder.DBNodeStatusDesc;
            this.dataZoneId = builder.dataZoneId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
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

        public static Items create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBNodeDescription
         */
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return DBNodeStatus
         */
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        /**
         * @return DBNodeStatusDesc
         */
        public String getDBNodeStatusDesc() {
            return this.DBNodeStatusDesc;
        }

        /**
         * @return dataZoneId
         */
        public String getDataZoneId() {
            return this.dataZoneId;
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
            private String creationTime; 
            private String DBNodeDescription; 
            private String DBNodeId; 
            private String DBNodeStatus; 
            private String DBNodeStatusDesc; 
            private String dataZoneId; 
            private String engine; 
            private String engineVersion; 
            private String modelName; 
            private String modelPath; 
            private String modelSource; 
            private String runningTimes; 
            private String startTime; 
            private String trainMode; 
            private String trainType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.completedTime = model.completedTime;
                this.creationTime = model.creationTime;
                this.DBNodeDescription = model.DBNodeDescription;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeStatus = model.DBNodeStatus;
                this.DBNodeStatusDesc = model.DBNodeStatusDesc;
                this.dataZoneId = model.dataZoneId;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DBNodeDescription.
             */
            public Builder DBNodeDescription(String DBNodeDescription) {
                this.DBNodeDescription = DBNodeDescription;
                return this;
            }

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * DBNodeStatus.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * DBNodeStatusDesc.
             */
            public Builder DBNodeStatusDesc(String DBNodeStatusDesc) {
                this.DBNodeStatusDesc = DBNodeStatusDesc;
                return this;
            }

            /**
             * DataZoneId.
             */
            public Builder dataZoneId(String dataZoneId) {
                this.dataZoneId = dataZoneId;
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
