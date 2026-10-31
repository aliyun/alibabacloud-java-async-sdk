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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitBatchTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
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
        private String opUserId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitBatchTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The operator user ID.</p>
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
         * <p>The edit request.</p>
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
    public static class ParamList extends TeaModel {
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

        private ParamList(Builder builder) {
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

        public static ParamList create() {
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

            private Builder(ParamList model) {
                this.conditionName = model.conditionName;
                this.cronExpression = model.cronExpression;
                this.enable = model.enable;
                this.followScheduleParam = model.followScheduleParam;
                this.nodeStatus = model.nodeStatus;
                this.scheduleConditionJson = model.scheduleConditionJson;
                this.scheduleTime = model.scheduleTime;
            } 

            /**
             * <p>条件名称</p>
             * 
             * <strong>example:</strong>
             * <p>workday</p>
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * <p>命中后的cron表达式</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 5 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>是否启用该条件</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>是否跟随主调度参数</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder followScheduleParam(Boolean followScheduleParam) {
                this.followScheduleParam = followScheduleParam;
                return this;
            }

            /**
             * <p>命中后的调度状态：1正常，2暂停，3空跑</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>条件表达式树JSON字符串，内部键名使用小驼峰</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scheduleConditionJson(String scheduleConditionJson) {
                this.scheduleConditionJson = scheduleConditionJson;
                return this;
            }

            /**
             * <p>命中后的调度时间</p>
             * 
             * <strong>example:</strong>
             * <p>05:00</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
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
    public static class ConditionScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private ConditionScheduleConfig(Builder builder) {
            this.enable = builder.enable;
            this.paramList = builder.paramList;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List<ParamList> paramList; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(ConditionScheduleConfig model) {
                this.enable = model.enable;
                this.paramList = model.paramList;
                this.templateId = model.templateId;
            } 

            /**
             * <p>是否启用条件调度。传入ConditionScheduleConfig对象时必须提供，由后端校验；false关闭并清除旧配置。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>自定义条件列表；与TemplateId互斥，空列表清除旧条件</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>条件调度模板ID，与ParamList互斥</p>
             * 
             * <strong>example:</strong>
             * <p>1002</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public ConditionScheduleConfig build() {
                return new ConditionScheduleConfig(this);
            } 

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
             * <p>10:00</p>
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
             * <li>MINUTE: Minute.</li>
             * <li>HOUR: Hour.</li>
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
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
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
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class OfflineCodeTemplateParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptEnabled")
        private Boolean encryptEnabled;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OfflineCodeTemplateParams(Builder builder) {
            this.description = builder.description;
            this.encryptEnabled = builder.encryptEnabled;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineCodeTemplateParams create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptEnabled
         */
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
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
            private String description; 
            private Boolean encryptEnabled; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(OfflineCodeTemplateParams model) {
                this.description = model.description;
                this.encryptEnabled = model.encryptEnabled;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Parameter description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether encryption is enabled.</p>
             */
            public Builder encryptEnabled(Boolean encryptEnabled) {
                this.encryptEnabled = encryptEnabled;
                return this;
            }

            /**
             * <p>The key of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>paramKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>paramValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OfflineCodeTemplateParams build() {
                return new OfflineCodeTemplateParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class SubmitCommandParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private SubmitCommandParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommandParamList create() {
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

            private Builder(SubmitCommandParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the parameter.</p>
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
             * <p>key</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SubmitCommandParamList build() {
                return new SubmitCommandParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class ScheduleTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private ScheduleTemplate(Builder builder) {
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleTemplate create() {
            return builder().build();
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Long templateId; 

            private Builder() {
            } 

            private Builder(ScheduleTemplate model) {
                this.templateId = model.templateId;
            } 

            /**
             * <p>基础调度模板ID，必须为正数</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public ScheduleTemplate build() {
                return new ScheduleTemplate(this);
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

            private Builder() {
            } 

            private Builder(DependPeriod model) {
                this.periodOffset = model.periodOffset;
                this.periodType = model.periodType;
            } 

            /**
             * <p>The period offset. This parameter is required when dependencyPeriodType is set to LAST_N_PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * <p>The dependency period type. Valid values:</p>
             * <ul>
             * <li>CURRENT_PERIOD: Current period.</li>
             * <li>LAST_PERIOD: Last period.</li>
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
             * <p>The dependency period.</p>
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
             * <p>ALL</p>
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
             * <p>The upstream dependency node type. Valid values:</p>
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
             * <p>The period difference. A value of 0 indicates a dependency on the same period. A positive number indicates a dependency on the previous N periods.</p>
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
     * {@link SubmitBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeTemplateVersion")
        private Integer codeTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ConditionScheduleConfig")
        private ConditionScheduleConfig conditionScheduleConfig;

        @com.aliyun.core.annotation.NameInMap("CpuResource")
        private String cpuResource;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomScheduleConfig")
        private CustomScheduleConfig customScheduleConfig;

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

        @com.aliyun.core.annotation.NameInMap("OfflineCodeTemplateId")
        private String offlineCodeTemplateId;

        @com.aliyun.core.annotation.NameInMap("OfflineCodeTemplateParams")
        private java.util.List<OfflineCodeTemplateParams> offlineCodeTemplateParams;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<SubmitCommandParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<String> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("ResourceReferenceList")
        private java.util.List<String> resourceReferenceList;

        @com.aliyun.core.annotation.NameInMap("RetryOnTimeoutEnable")
        private Boolean retryOnTimeoutEnable;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplate")
        private ScheduleTemplate scheduleTemplate;

        @com.aliyun.core.annotation.NameInMap("SparkClientInfo")
        private SparkClientInfo sparkClientInfo;

        @com.aliyun.core.annotation.NameInMap("SparkDynamicResourceSwitch")
        private Boolean sparkDynamicResourceSwitch;

        @com.aliyun.core.annotation.NameInMap("SparkResourceEffectScope")
        private String sparkResourceEffectScope;

        @com.aliyun.core.annotation.NameInMap("SparkSqlResourceConfigMap")
        private java.util.Map<String, String> sparkSqlResourceConfigMap;

        @com.aliyun.core.annotation.NameInMap("UpStreamList")
        private java.util.List<UpStreamList> upStreamList;

        private SubmitCommand(Builder builder) {
            this.code = builder.code;
            this.codeTemplateVersion = builder.codeTemplateVersion;
            this.comment = builder.comment;
            this.conditionScheduleConfig = builder.conditionScheduleConfig;
            this.cpuResource = builder.cpuResource;
            this.cronExpression = builder.cronExpression;
            this.customScheduleConfig = builder.customScheduleConfig;
            this.engine = builder.engine;
            this.executeRerunConfig = builder.executeRerunConfig;
            this.executeTimeOutConfig = builder.executeTimeOutConfig;
            this.fileId = builder.fileId;
            this.memoryResource = builder.memoryResource;
            this.name = builder.name;
            this.nodeDescription = builder.nodeDescription;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeStatus = builder.nodeStatus;
            this.offlineCodeTemplateId = builder.offlineCodeTemplateId;
            this.offlineCodeTemplateParams = builder.offlineCodeTemplateParams;
            this.paramList = builder.paramList;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.resourceReferenceList = builder.resourceReferenceList;
            this.retryOnTimeoutEnable = builder.retryOnTimeoutEnable;
            this.schedulePeriod = builder.schedulePeriod;
            this.scheduleTemplate = builder.scheduleTemplate;
            this.sparkClientInfo = builder.sparkClientInfo;
            this.sparkDynamicResourceSwitch = builder.sparkDynamicResourceSwitch;
            this.sparkResourceEffectScope = builder.sparkResourceEffectScope;
            this.sparkSqlResourceConfigMap = builder.sparkSqlResourceConfigMap;
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
         * @return codeTemplateVersion
         */
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return conditionScheduleConfig
         */
        public ConditionScheduleConfig getConditionScheduleConfig() {
            return this.conditionScheduleConfig;
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
         * @return offlineCodeTemplateId
         */
        public String getOfflineCodeTemplateId() {
            return this.offlineCodeTemplateId;
        }

        /**
         * @return offlineCodeTemplateParams
         */
        public java.util.List<OfflineCodeTemplateParams> getOfflineCodeTemplateParams() {
            return this.offlineCodeTemplateParams;
        }

        /**
         * @return paramList
         */
        public java.util.List<SubmitCommandParamList> getParamList() {
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
         * @return scheduleTemplate
         */
        public ScheduleTemplate getScheduleTemplate() {
            return this.scheduleTemplate;
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
        public java.util.Map<String, String> getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        /**
         * @return upStreamList
         */
        public java.util.List<UpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

        public static final class Builder {
            private String code; 
            private Integer codeTemplateVersion; 
            private String comment; 
            private ConditionScheduleConfig conditionScheduleConfig; 
            private String cpuResource; 
            private String cronExpression; 
            private CustomScheduleConfig customScheduleConfig; 
            private String engine; 
            private ExecuteRerunConfig executeRerunConfig; 
            private ExecuteTimeOutConfig executeTimeOutConfig; 
            private Long fileId; 
            private String memoryResource; 
            private String name; 
            private String nodeDescription; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeStatus; 
            private String offlineCodeTemplateId; 
            private java.util.List<OfflineCodeTemplateParams> offlineCodeTemplateParams; 
            private java.util.List<SubmitCommandParamList> paramList; 
            private Integer priority; 
            private Long projectId; 
            private java.util.List<String> pythonModuleList; 
            private java.util.List<String> resourceReferenceList; 
            private Boolean retryOnTimeoutEnable; 
            private String schedulePeriod; 
            private ScheduleTemplate scheduleTemplate; 
            private SparkClientInfo sparkClientInfo; 
            private Boolean sparkDynamicResourceSwitch; 
            private String sparkResourceEffectScope; 
            private java.util.Map<String, String> sparkSqlResourceConfigMap; 
            private java.util.List<UpStreamList> upStreamList; 

            private Builder() {
            } 

            private Builder(SubmitCommand model) {
                this.code = model.code;
                this.codeTemplateVersion = model.codeTemplateVersion;
                this.comment = model.comment;
                this.conditionScheduleConfig = model.conditionScheduleConfig;
                this.cpuResource = model.cpuResource;
                this.cronExpression = model.cronExpression;
                this.customScheduleConfig = model.customScheduleConfig;
                this.engine = model.engine;
                this.executeRerunConfig = model.executeRerunConfig;
                this.executeTimeOutConfig = model.executeTimeOutConfig;
                this.fileId = model.fileId;
                this.memoryResource = model.memoryResource;
                this.name = model.name;
                this.nodeDescription = model.nodeDescription;
                this.nodeOutputNameList = model.nodeOutputNameList;
                this.nodeStatus = model.nodeStatus;
                this.offlineCodeTemplateId = model.offlineCodeTemplateId;
                this.offlineCodeTemplateParams = model.offlineCodeTemplateParams;
                this.paramList = model.paramList;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.pythonModuleList = model.pythonModuleList;
                this.resourceReferenceList = model.resourceReferenceList;
                this.retryOnTimeoutEnable = model.retryOnTimeoutEnable;
                this.schedulePeriod = model.schedulePeriod;
                this.scheduleTemplate = model.scheduleTemplate;
                this.sparkClientInfo = model.sparkClientInfo;
                this.sparkDynamicResourceSwitch = model.sparkDynamicResourceSwitch;
                this.sparkResourceEffectScope = model.sparkResourceEffectScope;
                this.sparkSqlResourceConfigMap = model.sparkSqlResourceConfigMap;
                this.upStreamList = model.upStreamList;
            } 

            /**
             * <p>The code of the task.</p>
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
             * <p>The version number of the code template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder codeTemplateVersion(Integer codeTemplateVersion) {
                this.codeTemplateVersion = codeTemplateVersion;
                return this;
            }

            /**
             * <p>The comment for the submit operation.</p>
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
             * <p>条件调度；不传保留，Enable=false关闭并清除原条件，仅周期任务支持</p>
             */
            public Builder conditionScheduleConfig(ConditionScheduleConfig conditionScheduleConfig) {
                this.conditionScheduleConfig = conditionScheduleConfig;
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
             * <p>The execution engine of the task. Valid values for Python tasks:</p>
             * <ul>
             * <li>PYTHON2_7</li>
             * <li>PYTHON3_7</li>
             * <li>PYTHON3_11</li>
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
             * <p>The ID of the node in the task directory tree.</p>
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
             * <p>The description of the task.</p>
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
             * <p>The ID of the offline code template.</p>
             * 
             * <strong>example:</strong>
             * <p>template_123456</p>
             */
            public Builder offlineCodeTemplateId(String offlineCodeTemplateId) {
                this.offlineCodeTemplateId = offlineCodeTemplateId;
                return this;
            }

            /**
             * <p>The list of parameters for the offline code template.</p>
             */
            public Builder offlineCodeTemplateParams(java.util.List<OfflineCodeTemplateParams> offlineCodeTemplateParams) {
                this.offlineCodeTemplateParams = offlineCodeTemplateParams;
                return this;
            }

            /**
             * <p>The list of custom parameters.</p>
             */
            public Builder paramList(java.util.List<SubmitCommandParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The scheduling priority of the task. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the project to which the task belongs.</p>
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
             * <p>The Python third-party packages required by the task.</p>
             */
            public Builder pythonModuleList(java.util.List<String> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>资源引用列表，元素为资源名称。不传时使用原有任务的资源引用；传入列表时整体替换，空列表表示清空引用。</p>
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
             * <p>The schedule period. Valid values:</p>
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
             * <p>基础调度模板；不传保留，空对象解除绑定，仅周期任务支持</p>
             */
            public Builder scheduleTemplate(ScheduleTemplate scheduleTemplate) {
                this.scheduleTemplate = scheduleTemplate;
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
             * <p>Spark SQL资源配置，键为配置项名称，值为字符串。不传时保留任务当前配置。传入空Map时清空配置。</p>
             */
            public Builder sparkSqlResourceConfigMap(java.util.Map<String, String> sparkSqlResourceConfigMap) {
                this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
                return this;
            }

            /**
             * <p>The upstream dependencies.</p>
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
