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
 * {@link UpdateBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateBatchTaskRequest</p>
 */
public class UpdateBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateBatchTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchTaskRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBatchTaskRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBatchTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.updateCommand = request.updateCommand;
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
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateBatchTaskRequest build() {
            return new UpdateBatchTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
     */
    public static class ConditionScheduleParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionName")
        private String conditionName;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FollowScheduleParam")
        private Boolean followScheduleParam;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ScheduleConditionJson")
        private String scheduleConditionJson;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
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
             * <p>The condition name.</p>
             * 
             * <strong>example:</strong>
             * <p>condition1</p>
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * <p>The cron expression used after the condition is met.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to enable the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Specifies whether to follow the primary schedule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder followScheduleParam(Boolean followScheduleParam) {
                this.followScheduleParam = followScheduleParam;
                return this;
            }

            /**
             * <p>The node schedule status after the condition is met. Valid values:</p>
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
             * <p>The JSON string of the conditional expression tree. The keys are in lower camel case characters and must be parsed by the invoker.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
             */
            public Builder scheduleConditionJson(String scheduleConditionJson) {
                this.scheduleConditionJson = scheduleConditionJson;
                return this;
            }

            /**
             * <p>The schedule time used after the condition is met.</p>
             * 
             * <strong>example:</strong>
             * <p>01:00</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
     */
    public static class ContextParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("ParamKey")
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
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test parameter</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
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
             * <p>The end time in the HH:mm format.</p>
             * <p>This parameter is required.</p>
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
             * <p>The interval unit. Valid values:</p>
             * <ul>
             * <li>MINUTE: Minutes.</li>
             * <li>HOUR: Hours.</li>
             * </ul>
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
             * <p>The schedule period. Valid values:</p>
             * <ul>
             * <li>YEARLY: Yearly.</li>
             * <li>MONTHLY: Monthly.</li>
             * <li>WEEKLY: Weekly.</li>
             * <li>DAILY: Daily.</li>
             * <li>HOURLY: Hourly.</li>
             * <li>MINUTELY: Minutely.</li>
             * </ul>
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
             * <p>The start time in the HH:mm format.</p>
             * <p>This parameter is required.</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
     */
    public static class ExecuteRerunConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomRerunInterval")
        private String customRerunInterval;

        @com.aliyun.core.annotation.NameInMap("CustomRerunTimes")
        private String customRerunTimes;

        @com.aliyun.core.annotation.NameInMap("FollowSystem")
        private Boolean followSystem;

        private ExecuteRerunConfig(Builder builder) {
            this.customRerunInterval = builder.customRerunInterval;
            this.customRerunTimes = builder.customRerunTimes;
            this.followSystem = builder.followSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteRerunConfig create() {
            return builder().build();
        }

        /**
         * @return customRerunInterval
         */
        public String getCustomRerunInterval() {
            return this.customRerunInterval;
        }

        /**
         * @return customRerunTimes
         */
        public String getCustomRerunTimes() {
            return this.customRerunTimes;
        }

        /**
         * @return followSystem
         */
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

        public static final class Builder {
            private String customRerunInterval; 
            private String customRerunTimes; 
            private Boolean followSystem; 

            private Builder() {
            } 

            private Builder(ExecuteRerunConfig model) {
                this.customRerunInterval = model.customRerunInterval;
                this.customRerunTimes = model.customRerunTimes;
                this.followSystem = model.followSystem;
            } 

            /**
             * <p>自定义失败重试间隔。</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder customRerunInterval(String customRerunInterval) {
                this.customRerunInterval = customRerunInterval;
                return this;
            }

            /**
             * <p>自定义失败重试次数。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder customRerunTimes(String customRerunTimes) {
                this.customRerunTimes = customRerunTimes;
                return this;
            }

            /**
             * <p>是否跟随系统配置。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followSystem(Boolean followSystem) {
                this.followSystem = followSystem;
                return this;
            }

            public ExecuteRerunConfig build() {
                return new ExecuteRerunConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
     */
    public static class ExecuteTimeOutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomValues")
        private String customValues;

        @com.aliyun.core.annotation.NameInMap("FollowSystem")
        private Boolean followSystem;

        private ExecuteTimeOutConfig(Builder builder) {
            this.customValues = builder.customValues;
            this.followSystem = builder.followSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteTimeOutConfig create() {
            return builder().build();
        }

        /**
         * @return customValues
         */
        public String getCustomValues() {
            return this.customValues;
        }

        /**
         * @return followSystem
         */
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

        public static final class Builder {
            private String customValues; 
            private Boolean followSystem; 

            private Builder() {
            } 

            private Builder(ExecuteTimeOutConfig model) {
                this.customValues = model.customValues;
                this.followSystem = model.followSystem;
            } 

            /**
             * <p>自定义超时时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder customValues(String customValues) {
                this.customValues = customValues;
                return this;
            }

            /**
             * <p>是否跟随系统配置。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followSystem(Boolean followSystem) {
                this.followSystem = followSystem;
                return this;
            }

            public ExecuteTimeOutConfig build() {
                return new ExecuteTimeOutConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
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

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
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
             * <p>The value of the parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
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

            private Builder() {
            } 

            private Builder(SparkClientInfo model) {
                this.sparkClientVersion = model.sparkClientVersion;
            } 

            /**
             * <p>The version name of the Spark client.</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
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

            private Builder() {
            } 

            private Builder(DependPeriod model) {
                this.periodOffset = model.periodOffset;
                this.periodType = model.periodType;
            } 

            /**
             * <p>The cycle offset. This parameter is required when the PeriodType parameter is set to LAST_N_PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * <p>The type of the dependency cycle. Valid values:</p>
             * <ul>
             * <li>CURRENT_PERIOD: Current cycle.</li>
             * <li>LAST_PERIOD: Last cycle.</li>
             * <li>LAST_N_PERIOD: Last N days.</li>
             * <li>LAST_24_HOUR: Last 24 hours.</li>
             * </ul>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
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
                this.sourceNodeOutputName = model.sourceNodeOutputName;
                this.sourceTableName = model.sourceTableName;
            } 

            /**
             * <p>The dependency cycle.</p>
             */
            public Builder dependPeriod(DependPeriod dependPeriod) {
                this.dependPeriod = dependPeriod;
                return this;
            }

            /**
             * <p>The dependency strategy. Valid values:</p>
             * <ul>
             * <li>ALL: All.</li>
             * <li>FIRST: First.</li>
             * <li>LAST: Last.</li>
             * <li>NEAR: Nearest.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LAST</p>
             */
            public Builder dependStrategy(String dependStrategy) {
                this.dependStrategy = dependStrategy;
                return this;
            }

            /**
             * <p>The list of dependent logical table fields.</p>
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * <p>The type of the upstream dependency node. Valid values:</p>
             * <ul>
             * <li>PHYSICAL: Physical node.</li>
             * <li>LOGICAL: Logical table dependency.</li>
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
             * <p>The cycle difference. A value of 0 indicates a dependency on the same cycle. A positive integer indicates a dependency on the previous N cycles.</p>
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
             * <p>Specifies whether the upstream node is enabled.</p>
             */
            public Builder sourceNodeEnabled(Boolean sourceNodeEnabled) {
                this.sourceNodeEnabled = sourceNodeEnabled;
                return this;
            }

            /**
             * <p>The ID of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>n_2001</p>
             */
            public Builder sourceNodeId(String sourceNodeId) {
                this.sourceNodeId = sourceNodeId;
                return this;
            }

            /**
             * <p>The output name of the upstream node.</p>
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
     * {@link UpdateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseScheduleTemplateId")
        private Long baseScheduleTemplateId;

        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleEnable")
        private Boolean conditionScheduleEnable;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleParamList")
        private java.util.List<ConditionScheduleParamList> conditionScheduleParamList;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleTemplateId")
        private Long conditionScheduleTemplateId;

        @com.aliyun.core.annotation.NameInMap("ContextParamList")
        private java.util.List<ContextParamList> contextParamList;

        @com.aliyun.core.annotation.NameInMap("CpuResource")
        private String cpuResource;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomScheduleConfig")
        private CustomScheduleConfig customScheduleConfig;

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

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerIdList")
        private java.util.List<String> developOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("ExecuteRerunConfig")
        private ExecuteRerunConfig executeRerunConfig;

        @com.aliyun.core.annotation.NameInMap("ExecuteTimeOutConfig")
        private ExecuteTimeOutConfig executeTimeOutConfig;

        @com.aliyun.core.annotation.NameInMap("FileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("MemoryResource")
        private String memoryResource;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeOutputNameList")
        private java.util.List<String> nodeOutputNameList;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerIdList")
        private java.util.List<String> opsOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProdHttpPath")
        private String prodHttpPath;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<String> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceReferenceList")
        private java.util.List<String> resourceReferenceList;

        @com.aliyun.core.annotation.NameInMap("RetryOnTimeoutEnable")
        private Boolean retryOnTimeoutEnable;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("SparkClientInfo")
        private SparkClientInfo sparkClientInfo;

        @com.aliyun.core.annotation.NameInMap("SparkDynamicResourceSwitch")
        private Boolean sparkDynamicResourceSwitch;

        @com.aliyun.core.annotation.NameInMap("SparkResourceEffectScope")
        private String sparkResourceEffectScope;

        @com.aliyun.core.annotation.NameInMap("SparkSqlResourceConfigMap")
        private String sparkSqlResourceConfigMap;

        @com.aliyun.core.annotation.NameInMap("TaskTagList")
        private java.util.List<String> taskTagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("UpStreamList")
        private java.util.List<UpStreamList> upStreamList;

        @com.aliyun.core.annotation.NameInMap("ValidEndDate")
        private String validEndDate;

        @com.aliyun.core.annotation.NameInMap("ValidStartDate")
        private String validStartDate;

        private UpdateCommand(Builder builder) {
            this.baseScheduleTemplateId = builder.baseScheduleTemplateId;
            this.code = builder.code;
            this.conditionScheduleEnable = builder.conditionScheduleEnable;
            this.conditionScheduleParamList = builder.conditionScheduleParamList;
            this.conditionScheduleTemplateId = builder.conditionScheduleTemplateId;
            this.contextParamList = builder.contextParamList;
            this.cpuResource = builder.cpuResource;
            this.cronExpression = builder.cronExpression;
            this.customScheduleConfig = builder.customScheduleConfig;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.devHttpPath = builder.devHttpPath;
            this.devResourceGroupId = builder.devResourceGroupId;
            this.developOwnerIdList = builder.developOwnerIdList;
            this.engine = builder.engine;
            this.executeRerunConfig = builder.executeRerunConfig;
            this.executeTimeOutConfig = builder.executeTimeOutConfig;
            this.fileId = builder.fileId;
            this.memoryResource = builder.memoryResource;
            this.name = builder.name;
            this.nodeDescription = builder.nodeDescription;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeStatus = builder.nodeStatus;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.paramList = builder.paramList;
            this.priority = builder.priority;
            this.prodHttpPath = builder.prodHttpPath;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceReferenceList = builder.resourceReferenceList;
            this.retryOnTimeoutEnable = builder.retryOnTimeoutEnable;
            this.schedulePeriod = builder.schedulePeriod;
            this.sparkClientInfo = builder.sparkClientInfo;
            this.sparkDynamicResourceSwitch = builder.sparkDynamicResourceSwitch;
            this.sparkResourceEffectScope = builder.sparkResourceEffectScope;
            this.sparkSqlResourceConfigMap = builder.sparkSqlResourceConfigMap;
            this.taskTagList = builder.taskTagList;
            this.taskType = builder.taskType;
            this.upStreamList = builder.upStreamList;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return baseScheduleTemplateId
         */
        public Long getBaseScheduleTemplateId() {
            return this.baseScheduleTemplateId;
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
         * @return contextParamList
         */
        public java.util.List<ContextParamList> getContextParamList() {
            return this.contextParamList;
        }

        /**
         * @return cpuResource
         */
        public String getCpuResource() {
            return this.cpuResource;
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
         * @return developOwnerIdList
         */
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return executeRerunConfig
         */
        public ExecuteRerunConfig getExecuteRerunConfig() {
            return this.executeRerunConfig;
        }

        /**
         * @return executeTimeOutConfig
         */
        public ExecuteTimeOutConfig getExecuteTimeOutConfig() {
            return this.executeTimeOutConfig;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return memoryResource
         */
        public String getMemoryResource() {
            return this.memoryResource;
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
         * @return opsOwnerIdList
         */
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
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
         * @return pythonModuleList
         */
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceReferenceList
         */
        public java.util.List<String> getResourceReferenceList() {
            return this.resourceReferenceList;
        }

        /**
         * @return retryOnTimeoutEnable
         */
        public Boolean getRetryOnTimeoutEnable() {
            return this.retryOnTimeoutEnable;
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
         * @return sparkDynamicResourceSwitch
         */
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        /**
         * @return sparkResourceEffectScope
         */
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        /**
         * @return sparkSqlResourceConfigMap
         */
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
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
            private String code; 
            private Boolean conditionScheduleEnable; 
            private java.util.List<ConditionScheduleParamList> conditionScheduleParamList; 
            private Long conditionScheduleTemplateId; 
            private java.util.List<ContextParamList> contextParamList; 
            private String cpuResource; 
            private String cronExpression; 
            private CustomScheduleConfig customScheduleConfig; 
            private String dataSourceCatalog; 
            private String dataSourceId; 
            private String dataSourceSchema; 
            private String devHttpPath; 
            private String devResourceGroupId; 
            private java.util.List<String> developOwnerIdList; 
            private String engine; 
            private ExecuteRerunConfig executeRerunConfig; 
            private ExecuteTimeOutConfig executeTimeOutConfig; 
            private Long fileId; 
            private String memoryResource; 
            private String name; 
            private String nodeDescription; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeStatus; 
            private java.util.List<String> opsOwnerIdList; 
            private java.util.List<ParamList> paramList; 
            private Integer priority; 
            private String prodHttpPath; 
            private Long projectId; 
            private java.util.List<String> pythonModuleList; 
            private String resourceGroupId; 
            private java.util.List<String> resourceReferenceList; 
            private Boolean retryOnTimeoutEnable; 
            private String schedulePeriod; 
            private SparkClientInfo sparkClientInfo; 
            private Boolean sparkDynamicResourceSwitch; 
            private String sparkResourceEffectScope; 
            private String sparkSqlResourceConfigMap; 
            private java.util.List<String> taskTagList; 
            private Integer taskType; 
            private java.util.List<UpStreamList> upStreamList; 
            private String validEndDate; 
            private String validStartDate; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.baseScheduleTemplateId = model.baseScheduleTemplateId;
                this.code = model.code;
                this.conditionScheduleEnable = model.conditionScheduleEnable;
                this.conditionScheduleParamList = model.conditionScheduleParamList;
                this.conditionScheduleTemplateId = model.conditionScheduleTemplateId;
                this.contextParamList = model.contextParamList;
                this.cpuResource = model.cpuResource;
                this.cronExpression = model.cronExpression;
                this.customScheduleConfig = model.customScheduleConfig;
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.devHttpPath = model.devHttpPath;
                this.devResourceGroupId = model.devResourceGroupId;
                this.developOwnerIdList = model.developOwnerIdList;
                this.engine = model.engine;
                this.executeRerunConfig = model.executeRerunConfig;
                this.executeTimeOutConfig = model.executeTimeOutConfig;
                this.fileId = model.fileId;
                this.memoryResource = model.memoryResource;
                this.name = model.name;
                this.nodeDescription = model.nodeDescription;
                this.nodeOutputNameList = model.nodeOutputNameList;
                this.nodeStatus = model.nodeStatus;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.paramList = model.paramList;
                this.priority = model.priority;
                this.prodHttpPath = model.prodHttpPath;
                this.projectId = model.projectId;
                this.pythonModuleList = model.pythonModuleList;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceReferenceList = model.resourceReferenceList;
                this.retryOnTimeoutEnable = model.retryOnTimeoutEnable;
                this.schedulePeriod = model.schedulePeriod;
                this.sparkClientInfo = model.sparkClientInfo;
                this.sparkDynamicResourceSwitch = model.sparkDynamicResourceSwitch;
                this.sparkResourceEffectScope = model.sparkResourceEffectScope;
                this.sparkSqlResourceConfigMap = model.sparkSqlResourceConfigMap;
                this.taskTagList = model.taskTagList;
                this.taskType = model.taskType;
                this.upStreamList = model.upStreamList;
                this.validEndDate = model.validEndDate;
                this.validStartDate = model.validStartDate;
            } 

            /**
             * <p>The base schedule template ID. This parameter takes effect when the configuration method is set to schedule template. If this parameter and all other schedule fields are not specified, the original binding is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>7305621095333696</p>
             */
            public Builder baseScheduleTemplateId(Long baseScheduleTemplateId) {
                this.baseScheduleTemplateId = baseScheduleTemplateId;
                return this;
            }

            /**
             * <p>The task code.</p>
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
             * <p>Specifies whether to enable conditional scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder conditionScheduleEnable(Boolean conditionScheduleEnable) {
                this.conditionScheduleEnable = conditionScheduleEnable;
                return this;
            }

            /**
             * <p>The conditional scheduling configuration details. This parameter overwrites the existing configurations. If this parameter is not specified, the original configurations are retained. This parameter is supported only for periodic tasks.</p>
             */
            public Builder conditionScheduleParamList(java.util.List<ConditionScheduleParamList> conditionScheduleParamList) {
                this.conditionScheduleParamList = conditionScheduleParamList;
                return this;
            }

            /**
             * <p>The conditional schedule template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7305621095333697</p>
             */
            public Builder conditionScheduleTemplateId(Long conditionScheduleTemplateId) {
                this.conditionScheduleTemplateId = conditionScheduleTemplateId;
                return this;
            }

            /**
             * <p>The cross-node parameters. These are output parameters declared by the current node for downstream nodes to reference. This parameter overwrites the existing parameters. If this parameter is not specified, the original parameters are retained.</p>
             */
            public Builder contextParamList(java.util.List<ContextParamList> contextParamList) {
                this.contextParamList = contextParamList;
                return this;
            }

            /**
             * <p>不传时保留任务当前配置。</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpuResource(String cpuResource) {
                this.cpuResource = cpuResource;
                return this;
            }

            /**
             * <p>The cron expression for automatic scheduling. You can refer to Linux cron expressions.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The custom schedule interval configuration.</p>
             */
            public Builder customScheduleConfig(CustomScheduleConfig customScheduleConfig) {
                this.customScheduleConfig = customScheduleConfig;
                return this;
            }

            /**
             * <p>The data source catalog for database SQL tasks. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_catalog</p>
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * <p>The data source ID for database SQL tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>12131111</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source schema for database SQL tasks. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>erp</p>
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
                return this;
            }

            /**
             * <p>The HTTP path in the development environment for Databricks tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/protocolv1/o/xxx</p>
             */
            public Builder devHttpPath(String devHttpPath) {
                this.devHttpPath = devHttpPath;
                return this;
            }

            /**
             * <p>The ID of the schedule resource group for development tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-def456</p>
             */
            public Builder devResourceGroupId(String devResourceGroupId) {
                this.devResourceGroupId = devResourceGroupId;
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
             * <p>The task execution engine, such as Python tasks. Valid values:</p>
             * <ul>
             * <li>PYTHON2_7: Python 2.7.</li>
             * <li>PYTHON3_7: Python 3.7.</li>
             * <li>PYTHON3_11: Python 3.11.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PYTHON3_7</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>失败重试配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
             */
            public Builder executeRerunConfig(ExecuteRerunConfig executeRerunConfig) {
                this.executeRerunConfig = executeRerunConfig;
                return this;
            }

            /**
             * <p>执行超时配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
             */
            public Builder executeTimeOutConfig(ExecuteTimeOutConfig executeTimeOutConfig) {
                this.executeTimeOutConfig = executeTimeOutConfig;
                return this;
            }

            /**
             * <p>The ID of the task directory tree node.</p>
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
             * <p>不传时保留任务当前配置。</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memoryResource(String memoryResource) {
                this.memoryResource = memoryResource;
                return this;
            }

            /**
             * <p>The name of the offline task.</p>
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
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>xx test</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
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
             * <p>The status of the node. Valid values:</p>
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
             * <p>The list of O&amp;M owner IDs. If you do not specify this parameter, the O&amp;M owners are not modified.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The list of custom parameters.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
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
             * <p>The HTTP path in the production environment. This parameter is used for Databricks nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/protocolv1/o/yyy</p>
             */
            public Builder prodHttpPath(String prodHttpPath) {
                this.prodHttpPath = prodHttpPath;
                return this;
            }

            /**
             * <p>The ID of the project to which the node belongs.</p>
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
             * <p>The list of third-party Python packages on which the node depends.</p>
             */
            public Builder pythonModuleList(java.util.List<String> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The ID of the scheduling resource group for the production node.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-abc123</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceReferenceList.
             */
            public Builder resourceReferenceList(java.util.List<String> resourceReferenceList) {
                this.resourceReferenceList = resourceReferenceList;
                return this;
            }

            /**
             * <p>超时重试开关。不传时保留任务当前配置。显式传入false时关闭。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retryOnTimeoutEnable(Boolean retryOnTimeoutEnable) {
                this.retryOnTimeoutEnable = retryOnTimeoutEnable;
                return this;
            }

            /**
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li>YEARLY: Yearly.</li>
             * <li>MONTHLY: Monthly.</li>
             * <li>WEEKLY: Weekly.</li>
             * <li>DAILY: Daily.</li>
             * <li>HOURLY: Hourly.</li>
             * <li>MINUTELY: Minutely.</li>
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
             * <p>The Spark client.</p>
             */
            public Builder sparkClientInfo(SparkClientInfo sparkClientInfo) {
                this.sparkClientInfo = sparkClientInfo;
                return this;
            }

            /**
             * <p>不传时保留任务当前配置。显式传入false时关闭。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
                this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
                return this;
            }

            /**
             * <p>ONLY_PROD表示仅生产环境，PROD_AND_DEV表示生产和开发环境。不传时保留任务当前配置。</p>
             * 
             * <strong>example:</strong>
             * <p>ONLY_PROD</p>
             */
            public Builder sparkResourceEffectScope(String sparkResourceEffectScope) {
                this.sparkResourceEffectScope = sparkResourceEffectScope;
                return this;
            }

            /**
             * <p>Spark SQL资源配置，键为配置项名称，值为字符串。不传时保留任务当前配置；传入空JSON对象{}时清空配置。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
             */
            public Builder sparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
                this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
                return this;
            }

            /**
             * <p>The list of node tags. This parameter overwrites all existing tags. If you do not specify this parameter, the original tags remain unchanged.</p>
             */
            public Builder taskTagList(java.util.List<String> taskTagList) {
                this.taskTagList = taskTagList;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li>1: Hive SQL.</li>
             * <li>5: MaxCompute SQL.</li>
             * <li>10: Shell.</li>
             * <li>21: Python.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The list of upstream dependencies.</p>
             */
            public Builder upStreamList(java.util.List<UpStreamList> upStreamList) {
                this.upStreamList = upStreamList;
                return this;
            }

            /**
             * <p>The end date of the validity period. Format: yyyy-MM-dd. This parameter must be specified together with the ValidStartDate parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-12-31</p>
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * <p>The start date of the validity period. Format: yyyy-MM-dd. This parameter must be specified together with the ValidEndDate parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01</p>
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
