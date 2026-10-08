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
 * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchTaskInfoResponseBody</p>
 */
public class GetBatchTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private GetBatchTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchTaskInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TaskInfo taskInfo; 

        private Builder() {
        } 

        private Builder(GetBatchTaskInfoResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public GetBatchTaskInfoResponseBody build() {
            return new GetBatchTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class ConditionScheduleParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionName;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enable")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FollowScheduleParam")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean followScheduleParam;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ScheduleConditionJson")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scheduleConditionJson;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scheduleTime;

        private ConditionScheduleParamList(Builder builder) {
            this.conditionName = builder.conditionName;
            this.cronExpression = builder.cronExpression;
            this.enable = builder.enable;
            this.followScheduleParam = builder.followScheduleParam;
            this.nodeStatus = builder.nodeStatus;
            this.scheduleConditionJson = builder.scheduleConditionJson;
            this.scheduleTime = builder.scheduleTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionScheduleParamList create() {
            return builder().build();
        }

        /**
         * @return conditionName
         */
        public String getConditionName() {
            return this.conditionName;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return followScheduleParam
         */
        public Boolean getFollowScheduleParam() {
            return this.followScheduleParam;
        }

        /**
         * @return nodeStatus
         */
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return scheduleConditionJson
         */
        public String getScheduleConditionJson() {
            return this.scheduleConditionJson;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public static final class Builder {
            private String conditionName; 
            private String cronExpression; 
            private Boolean enable; 
            private Boolean followScheduleParam; 
            private Integer nodeStatus; 
            private String scheduleConditionJson; 
            private String scheduleTime; 

            private Builder() {
            } 

            private Builder(ConditionScheduleParamList model) {
                this.conditionName = model.conditionName;
                this.cronExpression = model.cronExpression;
                this.enable = model.enable;
                this.followScheduleParam = model.followScheduleParam;
                this.nodeStatus = model.nodeStatus;
                this.scheduleConditionJson = model.scheduleConditionJson;
                this.scheduleTime = model.scheduleTime;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>失败重跑</p>
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0 30 * * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followScheduleParam(Boolean followScheduleParam) {
                this.followScheduleParam = followScheduleParam;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;EXPRESSION_GROUP&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
             */
            public Builder scheduleConditionJson(String scheduleConditionJson) {
                this.scheduleConditionJson = scheduleConditionJson;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>00:30</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            public ConditionScheduleParamList build() {
                return new ConditionScheduleParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class ContextParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Desc")
        @com.aliyun.core.annotation.Validation(required = true)
        private String desc;

        @com.aliyun.core.annotation.NameInMap("ParamKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String paramKey;

        private ContextParamList(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.desc = builder.desc;
            this.paramKey = builder.paramKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContextParamList create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return paramKey
         */
        public String getParamKey() {
            return this.paramKey;
        }

        public static final class Builder {
            private String defaultValue; 
            private String desc; 
            private String paramKey; 

            private Builder() {
            } 

            private Builder(ContextParamList model) {
                this.defaultValue = model.defaultValue;
                this.desc = model.desc;
                this.paramKey = model.paramKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>输出条数</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cnt</p>
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            public ContextParamList build() {
                return new ContextParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class CustomScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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

            private Builder() {
            } 

            private Builder(CustomScheduleConfig model) {
                this.endTime = model.endTime;
                this.interval = model.interval;
                this.intervalUnit = model.intervalUnit;
                this.schedulePeriod = model.schedulePeriod;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in the format of HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>20:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The custom interval.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The interval unit. Valid values: MINUTE and HOUR.</p>
             * 
             * <strong>example:</strong>
             * <p>HOUR</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The scheduling period.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The start time in the format of HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
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
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
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
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class SparkClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SparkClientVersion")
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

            private Builder() {
            } 

            private Builder(SparkClientInfo model) {
                this.sparkClientVersion = model.sparkClientVersion;
            } 

            /**
             * <p>The Spark client version name.</p>
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
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class DependPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodOffset")
        private Integer periodOffset;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
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

            private Builder() {
            } 

            private Builder(DependPeriod model) {
                this.periodOffset = model.periodOffset;
                this.periodType = model.periodType;
            } 

            /**
             * <p>The period offset. This parameter is required when PeriodType is set to LAST_N_PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * <p>The dependency period type. Valid values: </p>
             * <ul>
             * <li>CURRENT_PERIOD</li>
             * <li>LAST_PERIOD</li>
             * <li>LAST_N_PERIOD</li>
             * <li>LAST_24_HOUR</li>
             * </ul>
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
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
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
        private Integer periodDiff;

        @com.aliyun.core.annotation.NameInMap("SourceNodeEnabled")
        private Boolean sourceNodeEnabled;

        @com.aliyun.core.annotation.NameInMap("SourceNodeId")
        private String sourceNodeId;

        @com.aliyun.core.annotation.NameInMap("SourceNodeName")
        private String sourceNodeName;

        @com.aliyun.core.annotation.NameInMap("SourceNodeOutputName")
        private String sourceNodeOutputName;

        @com.aliyun.core.annotation.NameInMap("SourceNodeUserName")
        private String sourceNodeUserName;

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
            this.sourceNodeName = builder.sourceNodeName;
            this.sourceNodeOutputName = builder.sourceNodeOutputName;
            this.sourceNodeUserName = builder.sourceNodeUserName;
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
         * @return sourceNodeName
         */
        public String getSourceNodeName() {
            return this.sourceNodeName;
        }

        /**
         * @return sourceNodeOutputName
         */
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        /**
         * @return sourceNodeUserName
         */
        public String getSourceNodeUserName() {
            return this.sourceNodeUserName;
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
            private String sourceNodeName; 
            private String sourceNodeOutputName; 
            private String sourceNodeUserName; 
            private String sourceTableName; 

            private Builder() {
            } 

            private Builder(UpStreamList model) {
                this.dependPeriod = model.dependPeriod;
                this.dependStrategy = model.dependStrategy;
                this.fieldList = model.fieldList;
                this.nodeType = model.nodeType;
                this.periodDiff = model.periodDiff;
                this.sourceNodeEnabled = model.sourceNodeEnabled;
                this.sourceNodeId = model.sourceNodeId;
                this.sourceNodeName = model.sourceNodeName;
                this.sourceNodeOutputName = model.sourceNodeOutputName;
                this.sourceNodeUserName = model.sourceNodeUserName;
                this.sourceTableName = model.sourceTableName;
            } 

            /**
             * <p>The dependency period.</p>
             */
            public Builder dependPeriod(DependPeriod dependPeriod) {
                this.dependPeriod = dependPeriod;
                return this;
            }

            /**
             * <p>The dependency strategy. Valid values: ALL, FIRST, LAST, NEAR.</p>
             * 
             * <strong>example:</strong>
             * <p>LAST</p>
             */
            public Builder dependStrategy(String dependStrategy) {
                this.dependStrategy = dependStrategy;
                return this;
            }

            /**
             * <p>The dependent logical table fields.</p>
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * <p>The type of the upstream dependency node. Valid values:</p>
             * <ul>
             * <li>PHYSICAL: physical node.</li>
             * <li>LOGICAL: logical table dependency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The period difference. A value of 0 indicates a same-period dependency. A positive number indicates a dependency on the previous N periods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodDiff(Integer periodDiff) {
                this.periodDiff = periodDiff;
                return this;
            }

            /**
             * <p>Indicates whether the upstream node is enabled.</p>
             */
            public Builder sourceNodeEnabled(Boolean sourceNodeEnabled) {
                this.sourceNodeEnabled = sourceNodeEnabled;
                return this;
            }

            /**
             * <p>The upstream node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_2001</p>
             */
            public Builder sourceNodeId(String sourceNodeId) {
                this.sourceNodeId = sourceNodeId;
                return this;
            }

            /**
             * <p>The upstream node name.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceNodeName(String sourceNodeName) {
                this.sourceNodeName = sourceNodeName;
                return this;
            }

            /**
             * <p>The output name of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceNodeOutputName(String sourceNodeOutputName) {
                this.sourceNodeOutputName = sourceNodeOutputName;
                return this;
            }

            /**
             * <p>The username of the upstream node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder sourceNodeUserName(String sourceNodeUserName) {
                this.sourceNodeUserName = sourceNodeUserName;
                return this;
            }

            /**
             * <p>The name of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
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
     * {@link GetBatchTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseScheduleTemplateId")
        private Long baseScheduleTemplateId;

        @com.aliyun.core.annotation.NameInMap("BaseScheduleTemplateName")
        private String baseScheduleTemplateName;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleEnable")
        private Boolean conditionScheduleEnable;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleParamList")
        private java.util.List<ConditionScheduleParamList> conditionScheduleParamList;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleTemplateId")
        private Long conditionScheduleTemplateId;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleTemplateName")
        private String conditionScheduleTemplateName;

        @com.aliyun.core.annotation.NameInMap("ContextParamList")
        private java.util.List<ContextParamList> contextParamList;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomScheduleConfig")
        private CustomScheduleConfig customScheduleConfig;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private String dagId;

        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

        @com.aliyun.core.annotation.NameInMap("DevHttpPath")
        private String devHttpPath;

        @com.aliyun.core.annotation.NameInMap("DevResourceGroupId")
        private String devResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("DevResourceGroupName")
        private String devResourceGroupName;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerId")
        private String developOwnerId;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerIdList")
        private java.util.List<String> developOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerName")
        private String developOwnerName;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerNameList")
        private java.util.List<String> developOwnerNameList;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("HasDevNode")
        private Boolean hasDevNode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedPublish")
        private Boolean needPublish;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeFrom")
        private String nodeFrom;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutputNameList")
        private java.util.List<String> nodeOutputNameList;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("OperatorUserId")
        private String operatorUserId;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerId")
        private String opsOwnerId;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerIdList")
        private java.util.List<String> opsOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerName")
        private String opsOwnerName;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerNameList")
        private java.util.List<String> opsOwnerNameList;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("Paused")
        private Boolean paused;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProdHttpPath")
        private String prodHttpPath;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Published")
        private Boolean published;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Rerunable")
        private Boolean rerunable;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private Integer scheduleType;

        @com.aliyun.core.annotation.NameInMap("SparkClientInfo")
        private SparkClientInfo sparkClientInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskTagList")
        private java.util.List<String> taskTagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("UpStreamList")
        private java.util.List<UpStreamList> upStreamList;

        @com.aliyun.core.annotation.NameInMap("ValidEndDate")
        private String validEndDate;

        @com.aliyun.core.annotation.NameInMap("ValidStartDate")
        private String validStartDate;

        private TaskInfo(Builder builder) {
            this.baseScheduleTemplateId = builder.baseScheduleTemplateId;
            this.baseScheduleTemplateName = builder.baseScheduleTemplateName;
            this.code = builder.code;
            this.conditionScheduleEnable = builder.conditionScheduleEnable;
            this.conditionScheduleParamList = builder.conditionScheduleParamList;
            this.conditionScheduleTemplateId = builder.conditionScheduleTemplateId;
            this.conditionScheduleTemplateName = builder.conditionScheduleTemplateName;
            this.contextParamList = builder.contextParamList;
            this.cronExpression = builder.cronExpression;
            this.customScheduleConfig = builder.customScheduleConfig;
            this.dagId = builder.dagId;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.devHttpPath = builder.devHttpPath;
            this.devResourceGroupId = builder.devResourceGroupId;
            this.devResourceGroupName = builder.devResourceGroupName;
            this.developOwnerId = builder.developOwnerId;
            this.developOwnerIdList = builder.developOwnerIdList;
            this.developOwnerName = builder.developOwnerName;
            this.developOwnerNameList = builder.developOwnerNameList;
            this.fileId = builder.fileId;
            this.hasDevNode = builder.hasDevNode;
            this.name = builder.name;
            this.needPublish = builder.needPublish;
            this.nodeDescription = builder.nodeDescription;
            this.nodeFrom = builder.nodeFrom;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeStatus = builder.nodeStatus;
            this.operatorUserId = builder.operatorUserId;
            this.opsOwnerId = builder.opsOwnerId;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.opsOwnerName = builder.opsOwnerName;
            this.opsOwnerNameList = builder.opsOwnerNameList;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.paramList = builder.paramList;
            this.paused = builder.paused;
            this.priority = builder.priority;
            this.prodHttpPath = builder.prodHttpPath;
            this.projectId = builder.projectId;
            this.published = builder.published;
            this.remark = builder.remark;
            this.rerunable = builder.rerunable;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.schedulePeriod = builder.schedulePeriod;
            this.scheduleType = builder.scheduleType;
            this.sparkClientInfo = builder.sparkClientInfo;
            this.status = builder.status;
            this.taskTagList = builder.taskTagList;
            this.taskType = builder.taskType;
            this.upStreamList = builder.upStreamList;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return baseScheduleTemplateId
         */
        public Long getBaseScheduleTemplateId() {
            return this.baseScheduleTemplateId;
        }

        /**
         * @return baseScheduleTemplateName
         */
        public String getBaseScheduleTemplateName() {
            return this.baseScheduleTemplateName;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return conditionScheduleEnable
         */
        public Boolean getConditionScheduleEnable() {
            return this.conditionScheduleEnable;
        }

        /**
         * @return conditionScheduleParamList
         */
        public java.util.List<ConditionScheduleParamList> getConditionScheduleParamList() {
            return this.conditionScheduleParamList;
        }

        /**
         * @return conditionScheduleTemplateId
         */
        public Long getConditionScheduleTemplateId() {
            return this.conditionScheduleTemplateId;
        }

        /**
         * @return conditionScheduleTemplateName
         */
        public String getConditionScheduleTemplateName() {
            return this.conditionScheduleTemplateName;
        }

        /**
         * @return contextParamList
         */
        public java.util.List<ContextParamList> getContextParamList() {
            return this.contextParamList;
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
         * @return dagId
         */
        public String getDagId() {
            return this.dagId;
        }

        /**
         * @return dataSourceCatalog
         */
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceSchema
         */
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        /**
         * @return devHttpPath
         */
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        /**
         * @return devResourceGroupId
         */
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
        }

        /**
         * @return devResourceGroupName
         */
        public String getDevResourceGroupName() {
            return this.devResourceGroupName;
        }

        /**
         * @return developOwnerId
         */
        public String getDevelopOwnerId() {
            return this.developOwnerId;
        }

        /**
         * @return developOwnerIdList
         */
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        /**
         * @return developOwnerName
         */
        public String getDevelopOwnerName() {
            return this.developOwnerName;
        }

        /**
         * @return developOwnerNameList
         */
        public java.util.List<String> getDevelopOwnerNameList() {
            return this.developOwnerNameList;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return hasDevNode
         */
        public Boolean getHasDevNode() {
            return this.hasDevNode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needPublish
         */
        public Boolean getNeedPublish() {
            return this.needPublish;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeFrom
         */
        public String getNodeFrom() {
            return this.nodeFrom;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
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
         * @return operatorUserId
         */
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        /**
         * @return opsOwnerId
         */
        public String getOpsOwnerId() {
            return this.opsOwnerId;
        }

        /**
         * @return opsOwnerIdList
         */
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        /**
         * @return opsOwnerName
         */
        public String getOpsOwnerName() {
            return this.opsOwnerName;
        }

        /**
         * @return opsOwnerNameList
         */
        public java.util.List<String> getOpsOwnerNameList() {
            return this.opsOwnerNameList;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return paused
         */
        public Boolean getPaused() {
            return this.paused;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return prodHttpPath
         */
        public String getProdHttpPath() {
            return this.prodHttpPath;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return rerunable
         */
        public Boolean getRerunable() {
            return this.rerunable;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return scheduleType
         */
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sparkClientInfo
         */
        public SparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskTagList
         */
        public java.util.List<String> getTaskTagList() {
            return this.taskTagList;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        /**
         * @return upStreamList
         */
        public java.util.List<UpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

        /**
         * @return validEndDate
         */
        public String getValidEndDate() {
            return this.validEndDate;
        }

        /**
         * @return validStartDate
         */
        public String getValidStartDate() {
            return this.validStartDate;
        }

        public static final class Builder {
            private Long baseScheduleTemplateId; 
            private String baseScheduleTemplateName; 
            private String code; 
            private Boolean conditionScheduleEnable; 
            private java.util.List<ConditionScheduleParamList> conditionScheduleParamList; 
            private Long conditionScheduleTemplateId; 
            private String conditionScheduleTemplateName; 
            private java.util.List<ContextParamList> contextParamList; 
            private String cronExpression; 
            private CustomScheduleConfig customScheduleConfig; 
            private String dagId; 
            private String dataSourceCatalog; 
            private String dataSourceId; 
            private String dataSourceSchema; 
            private String devHttpPath; 
            private String devResourceGroupId; 
            private String devResourceGroupName; 
            private String developOwnerId; 
            private java.util.List<String> developOwnerIdList; 
            private String developOwnerName; 
            private java.util.List<String> developOwnerNameList; 
            private Long fileId; 
            private Boolean hasDevNode; 
            private String name; 
            private Boolean needPublish; 
            private String nodeDescription; 
            private String nodeFrom; 
            private String nodeId; 
            private String nodeName; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeStatus; 
            private String operatorUserId; 
            private String opsOwnerId; 
            private java.util.List<String> opsOwnerIdList; 
            private String opsOwnerName; 
            private java.util.List<String> opsOwnerNameList; 
            private String ownerName; 
            private String ownerUserId; 
            private java.util.List<ParamList> paramList; 
            private Boolean paused; 
            private Integer priority; 
            private String prodHttpPath; 
            private Long projectId; 
            private Boolean published; 
            private String remark; 
            private Boolean rerunable; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String schedulePeriod; 
            private Integer scheduleType; 
            private SparkClientInfo sparkClientInfo; 
            private String status; 
            private java.util.List<String> taskTagList; 
            private Integer taskType; 
            private java.util.List<UpStreamList> upStreamList; 
            private String validEndDate; 
            private String validStartDate; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.baseScheduleTemplateId = model.baseScheduleTemplateId;
                this.baseScheduleTemplateName = model.baseScheduleTemplateName;
                this.code = model.code;
                this.conditionScheduleEnable = model.conditionScheduleEnable;
                this.conditionScheduleParamList = model.conditionScheduleParamList;
                this.conditionScheduleTemplateId = model.conditionScheduleTemplateId;
                this.conditionScheduleTemplateName = model.conditionScheduleTemplateName;
                this.contextParamList = model.contextParamList;
                this.cronExpression = model.cronExpression;
                this.customScheduleConfig = model.customScheduleConfig;
                this.dagId = model.dagId;
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.devHttpPath = model.devHttpPath;
                this.devResourceGroupId = model.devResourceGroupId;
                this.devResourceGroupName = model.devResourceGroupName;
                this.developOwnerId = model.developOwnerId;
                this.developOwnerIdList = model.developOwnerIdList;
                this.developOwnerName = model.developOwnerName;
                this.developOwnerNameList = model.developOwnerNameList;
                this.fileId = model.fileId;
                this.hasDevNode = model.hasDevNode;
                this.name = model.name;
                this.needPublish = model.needPublish;
                this.nodeDescription = model.nodeDescription;
                this.nodeFrom = model.nodeFrom;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeOutputNameList = model.nodeOutputNameList;
                this.nodeStatus = model.nodeStatus;
                this.operatorUserId = model.operatorUserId;
                this.opsOwnerId = model.opsOwnerId;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.opsOwnerName = model.opsOwnerName;
                this.opsOwnerNameList = model.opsOwnerNameList;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
                this.paramList = model.paramList;
                this.paused = model.paused;
                this.priority = model.priority;
                this.prodHttpPath = model.prodHttpPath;
                this.projectId = model.projectId;
                this.published = model.published;
                this.remark = model.remark;
                this.rerunable = model.rerunable;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.schedulePeriod = model.schedulePeriod;
                this.scheduleType = model.scheduleType;
                this.sparkClientInfo = model.sparkClientInfo;
                this.status = model.status;
                this.taskTagList = model.taskTagList;
                this.taskType = model.taskType;
                this.upStreamList = model.upStreamList;
                this.validEndDate = model.validEndDate;
                this.validStartDate = model.validStartDate;
            } 

            /**
             * BaseScheduleTemplateId.
             */
            public Builder baseScheduleTemplateId(Long baseScheduleTemplateId) {
                this.baseScheduleTemplateId = baseScheduleTemplateId;
                return this;
            }

            /**
             * BaseScheduleTemplateName.
             */
            public Builder baseScheduleTemplateName(String baseScheduleTemplateName) {
                this.baseScheduleTemplateName = baseScheduleTemplateName;
                return this;
            }

            /**
             * <p>The task code.</p>
             * 
             * <strong>example:</strong>
             * <p>show tables;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ConditionScheduleEnable.
             */
            public Builder conditionScheduleEnable(Boolean conditionScheduleEnable) {
                this.conditionScheduleEnable = conditionScheduleEnable;
                return this;
            }

            /**
             * ConditionScheduleParamList.
             */
            public Builder conditionScheduleParamList(java.util.List<ConditionScheduleParamList> conditionScheduleParamList) {
                this.conditionScheduleParamList = conditionScheduleParamList;
                return this;
            }

            /**
             * ConditionScheduleTemplateId.
             */
            public Builder conditionScheduleTemplateId(Long conditionScheduleTemplateId) {
                this.conditionScheduleTemplateId = conditionScheduleTemplateId;
                return this;
            }

            /**
             * ConditionScheduleTemplateName.
             */
            public Builder conditionScheduleTemplateName(String conditionScheduleTemplateName) {
                this.conditionScheduleTemplateName = conditionScheduleTemplateName;
                return this;
            }

            /**
             * ContextParamList.
             */
            public Builder contextParamList(java.util.List<ContextParamList> contextParamList) {
                this.contextParamList = contextParamList;
                return this;
            }

            /**
             * <p>The cron expression for automatic scheduling. Refer to the Linux cron expression syntax.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The custom scheduling interval configuration.</p>
             */
            public Builder customScheduleConfig(CustomScheduleConfig customScheduleConfig) {
                this.customScheduleConfig = customScheduleConfig;
                return this;
            }

            /**
             * <p>The ID of the DAG to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dag_102121211</p>
             */
            public Builder dagId(String dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The catalog for database SQL nodes. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_catalog</p>
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * <p>The data source ID for database SQL nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>12131111</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The schema for database SQL nodes. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>erp</p>
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
                return this;
            }

            /**
             * DevHttpPath.
             */
            public Builder devHttpPath(String devHttpPath) {
                this.devHttpPath = devHttpPath;
                return this;
            }

            /**
             * DevResourceGroupId.
             */
            public Builder devResourceGroupId(String devResourceGroupId) {
                this.devResourceGroupId = devResourceGroupId;
                return this;
            }

            /**
             * DevResourceGroupName.
             */
            public Builder devResourceGroupName(String devResourceGroupName) {
                this.devResourceGroupName = devResourceGroupName;
                return this;
            }

            /**
             * <p>The user ID of the development owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder developOwnerId(String developOwnerId) {
                this.developOwnerId = developOwnerId;
                return this;
            }

            /**
             * <p>The list of development owner IDs.</p>
             */
            public Builder developOwnerIdList(java.util.List<String> developOwnerIdList) {
                this.developOwnerIdList = developOwnerIdList;
                return this;
            }

            /**
             * <p>The name of the development owner.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder developOwnerName(String developOwnerName) {
                this.developOwnerName = developOwnerName;
                return this;
            }

            /**
             * <p>The list of development owner names.</p>
             */
            public Builder developOwnerNameList(java.util.List<String> developOwnerNameList) {
                this.developOwnerNameList = developOwnerNameList;
                return this;
            }

            /**
             * <p>The node ID in the directory tree.</p>
             * 
             * <strong>example:</strong>
             * <p>12113111</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Indicates whether the task has a development environment node.</p>
             */
            public Builder hasDevNode(Boolean hasDevNode) {
                this.hasDevNode = hasDevNode;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestTask1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the task needs to be published.</p>
             */
            public Builder needPublish(Boolean needPublish) {
                this.needPublish = needPublish;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The source of the node, indicating the organization or application that created the node.</p>
             * 
             * <strong>example:</strong>
             * <p>openapi</p>
             */
            public Builder nodeFrom(String nodeFrom) {
                this.nodeFrom = nodeFrom;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1011_21232132322</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestTask1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The list of node output names.</p>
             */
            public Builder nodeOutputNameList(java.util.List<String> nodeOutputNameList) {
                this.nodeOutputNameList = nodeOutputNameList;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li>1: Normal.</li>
             * <li>2: Paused.</li>
             * <li>3: Dry run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The user ID of the current operator.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder operatorUserId(String operatorUserId) {
                this.operatorUserId = operatorUserId;
                return this;
            }

            /**
             * <p>The user ID of the O&amp;M owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder opsOwnerId(String opsOwnerId) {
                this.opsOwnerId = opsOwnerId;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner IDs.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The name of the O&amp;M owner.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder opsOwnerName(String opsOwnerName) {
                this.opsOwnerName = opsOwnerName;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner names.</p>
             */
            public Builder opsOwnerNameList(java.util.List<String> opsOwnerNameList) {
                this.opsOwnerNameList = opsOwnerNameList;
                return this;
            }

            /**
             * <p>The name of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The user ID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The list of custom parameters for the node.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>Indicates whether the node is paused for scheduling.</p>
             */
            public Builder paused(Boolean paused) {
                this.paused = paused;
                return this;
            }

            /**
             * <p>The scheduling priority of the node. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProdHttpPath.
             */
            public Builder prodHttpPath(String prodHttpPath) {
                this.prodHttpPath = prodHttpPath;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Indicates whether the task is published.</p>
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test xx</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Indicates whether the node can be rerun.</p>
             */
            public Builder rerunable(Boolean rerunable) {
                this.rerunable = rerunable;
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
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The scheduling period. Valid values:</p>
             * <ul>
             * <li>YEARLY</li>
             * <li>MONTHLY</li>
             * <li>WEEKLY</li>
             * <li>DAILY</li>
             * <li>HOURLY</li>
             * <li>MINUTELY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The node type. Valid values: </p>
             * <ul>
             * <li>1: Periodic node.</li>
             * <li>3: Manual node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scheduleType(Integer scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The Spark client information.</p>
             */
            public Builder sparkClientInfo(SparkClientInfo sparkClientInfo) {
                this.sparkClientInfo = sparkClientInfo;
                return this;
            }

            /**
             * <p>The submit status. Valid values:</p>
             * <ul>
             * <li>0: Draft.</li>
             * <li>1: Submitted.</li>
             * <li>100: In development.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestTask1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskTagList.
             */
            public Builder taskTagList(java.util.List<String> taskTagList) {
                this.taskTagList = taskTagList;
                return this;
            }

            /**
             * <p>The task type. For more information, refer to the API operation for creating a batch task.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The upstream dependencies.</p>
             */
            public Builder upStreamList(java.util.List<UpStreamList> upStreamList) {
                this.upStreamList = upStreamList;
                return this;
            }

            /**
             * ValidEndDate.
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * ValidStartDate.
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
