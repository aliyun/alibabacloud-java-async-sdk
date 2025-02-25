// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SubmitBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitBatchTaskRequest</p>
 */
public class SubmitBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitBatchTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.submitCommand = builder.submitCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBatchTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return submitCommand
     */
    public SubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static final class Builder extends Request.Builder<SubmitBatchTaskRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitBatchTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.submitCommand = request.submitCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder submitCommand(SubmitCommand submitCommand) {
            String submitCommandShrink = shrink(submitCommand, "SubmitCommand", "json");
            this.putBodyParameter("SubmitCommand", submitCommandShrink);
            this.submitCommand = submitCommand;
            return this;
        }

        @Override
        public SubmitBatchTaskRequest build() {
            return new SubmitBatchTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class CustomScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        @com.aliyun.core.annotation.Validation(required = true)
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        @com.aliyun.core.annotation.Validation(required = true)
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startTime;

        private CustomScheduleConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.interval = builder.interval;
            this.intervalUnit = builder.intervalUnit;
            this.schedulePeriod = builder.schedulePeriod;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer interval; 
            private String intervalUnit; 
            private String schedulePeriod; 
            private String startTime; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HOUR</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CustomScheduleConfig build() {
                return new CustomScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class SparkClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SparkClientVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sparkClientVersion;

        private SparkClientInfo(Builder builder) {
            this.sparkClientVersion = builder.sparkClientVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparkClientInfo create() {
            return builder().build();
        }

        /**
         * @return sparkClientVersion
         */
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

        public static final class Builder {
            private String sparkClientVersion; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder sparkClientVersion(String sparkClientVersion) {
                this.sparkClientVersion = sparkClientVersion;
                return this;
            }

            public SparkClientInfo build() {
                return new SparkClientInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class DependPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodOffset")
        private Integer periodOffset;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String periodType;

        private DependPeriod(Builder builder) {
            this.periodOffset = builder.periodOffset;
            this.periodType = builder.periodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependPeriod create() {
            return builder().build();
        }

        /**
         * @return periodOffset
         */
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        public static final class Builder {
            private Integer periodOffset; 
            private String periodType; 

            /**
             * PeriodOffset.
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CURRENT_PERIOD</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            public DependPeriod build() {
                return new DependPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class UpStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependPeriod")
        private DependPeriod dependPeriod;

        @com.aliyun.core.annotation.NameInMap("DependStrategy")
        private String dependStrategy;

        @com.aliyun.core.annotation.NameInMap("FieldList")
        private java.util.List<String> fieldList;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PeriodDiff")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer periodDiff;

        @com.aliyun.core.annotation.NameInMap("SourceNodeEnabled")
        private Boolean sourceNodeEnabled;

        @com.aliyun.core.annotation.NameInMap("SourceNodeId")
        private String sourceNodeId;

        @com.aliyun.core.annotation.NameInMap("SourceNodeOutputName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceNodeOutputName;

        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        private UpStreamList(Builder builder) {
            this.dependPeriod = builder.dependPeriod;
            this.dependStrategy = builder.dependStrategy;
            this.fieldList = builder.fieldList;
            this.nodeType = builder.nodeType;
            this.periodDiff = builder.periodDiff;
            this.sourceNodeEnabled = builder.sourceNodeEnabled;
            this.sourceNodeId = builder.sourceNodeId;
            this.sourceNodeOutputName = builder.sourceNodeOutputName;
            this.sourceTableName = builder.sourceTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpStreamList create() {
            return builder().build();
        }

        /**
         * @return dependPeriod
         */
        public DependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        /**
         * @return dependStrategy
         */
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        /**
         * @return fieldList
         */
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return periodDiff
         */
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        /**
         * @return sourceNodeEnabled
         */
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        /**
         * @return sourceNodeId
         */
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        /**
         * @return sourceNodeOutputName
         */
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public static final class Builder {
            private DependPeriod dependPeriod; 
            private String dependStrategy; 
            private java.util.List<String> fieldList; 
            private String nodeType; 
            private Integer periodDiff; 
            private Boolean sourceNodeEnabled; 
            private String sourceNodeId; 
            private String sourceNodeOutputName; 
            private String sourceTableName; 

            /**
             * DependPeriod.
             */
            public Builder dependPeriod(DependPeriod dependPeriod) {
                this.dependPeriod = dependPeriod;
                return this;
            }

            /**
             * DependStrategy.
             */
            public Builder dependStrategy(String dependStrategy) {
                this.dependStrategy = dependStrategy;
                return this;
            }

            /**
             * FieldList.
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodDiff(Integer periodDiff) {
                this.periodDiff = periodDiff;
                return this;
            }

            /**
             * SourceNodeEnabled.
             */
            public Builder sourceNodeEnabled(Boolean sourceNodeEnabled) {
                this.sourceNodeEnabled = sourceNodeEnabled;
                return this;
            }

            /**
             * SourceNodeId.
             */
            public Builder sourceNodeId(String sourceNodeId) {
                this.sourceNodeId = sourceNodeId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceNodeOutputName(String sourceNodeOutputName) {
                this.sourceNodeOutputName = sourceNodeOutputName;
                return this;
            }

            /**
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            public UpStreamList build() {
                return new UpStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomScheduleConfig")
        private CustomScheduleConfig customScheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("FileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeOutputNameList")
        private java.util.List<String> nodeOutputNameList;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<String> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("SparkClientInfo")
        private SparkClientInfo sparkClientInfo;

        @com.aliyun.core.annotation.NameInMap("UpStreamList")
        private java.util.List<UpStreamList> upStreamList;

        private SubmitCommand(Builder builder) {
            this.code = builder.code;
            this.comment = builder.comment;
            this.cronExpression = builder.cronExpression;
            this.customScheduleConfig = builder.customScheduleConfig;
            this.engine = builder.engine;
            this.fileId = builder.fileId;
            this.name = builder.name;
            this.nodeDescription = builder.nodeDescription;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeStatus = builder.nodeStatus;
            this.paramList = builder.paramList;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.schedulePeriod = builder.schedulePeriod;
            this.sparkClientInfo = builder.sparkClientInfo;
            this.upStreamList = builder.upStreamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommand create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return customScheduleConfig
         */
        public CustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeOutputNameList
         */
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        /**
         * @return nodeStatus
         */
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return pythonModuleList
         */
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return sparkClientInfo
         */
        public SparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        /**
         * @return upStreamList
         */
        public java.util.List<UpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

        public static final class Builder {
            private String code; 
            private String comment; 
            private String cronExpression; 
            private CustomScheduleConfig customScheduleConfig; 
            private String engine; 
            private Long fileId; 
            private String name; 
            private String nodeDescription; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeStatus; 
            private java.util.List<ParamList> paramList; 
            private Integer priority; 
            private Long projectId; 
            private java.util.List<String> pythonModuleList; 
            private String schedulePeriod; 
            private SparkClientInfo sparkClientInfo; 
            private java.util.List<UpStreamList> upStreamList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>show tables;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * CustomScheduleConfig.
             */
            public Builder customScheduleConfig(CustomScheduleConfig customScheduleConfig) {
                this.customScheduleConfig = customScheduleConfig;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12113111</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test111</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeDescription.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * NodeOutputNameList.
             */
            public Builder nodeOutputNameList(java.util.List<String> nodeOutputNameList) {
                this.nodeOutputNameList = nodeOutputNameList;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * ParamList.
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10121101</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * PythonModuleList.
             */
            public Builder pythonModuleList(java.util.List<String> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * SparkClientInfo.
             */
            public Builder sparkClientInfo(SparkClientInfo sparkClientInfo) {
                this.sparkClientInfo = sparkClientInfo;
                return this;
            }

            /**
             * UpStreamList.
             */
            public Builder upStreamList(java.util.List<UpStreamList> upStreamList) {
                this.upStreamList = upStreamList;
                return this;
            }

            public SubmitCommand build() {
                return new SubmitCommand(this);
            } 

        } 

    }
}
