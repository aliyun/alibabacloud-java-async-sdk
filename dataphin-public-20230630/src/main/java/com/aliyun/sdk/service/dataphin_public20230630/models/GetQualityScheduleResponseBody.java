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
 * {@link GetQualityScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityScheduleResponseBody</p>
 */
public class GetQualityScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityScheduleInfo")
    private QualityScheduleInfo qualityScheduleInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityScheduleResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityScheduleInfo = builder.qualityScheduleInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityScheduleResponseBody create() {
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
     * @return qualityScheduleInfo
     */
    public QualityScheduleInfo getQualityScheduleInfo() {
        return this.qualityScheduleInfo;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private QualityScheduleInfo qualityScheduleInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityScheduleResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityScheduleInfo = model.qualityScheduleInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The details of the schedule object.</p>
         */
        public Builder qualityScheduleInfo(QualityScheduleInfo qualityScheduleInfo) {
            this.qualityScheduleInfo = qualityScheduleInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetQualityScheduleResponseBody build() {
            return new GetQualityScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityScheduleResponseBody</p>
     */
    public static class QualityScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsRefByRule")
        private Boolean isRefByRule;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionExpression")
        private String partitionExpression;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("PeriodScheduleIntervalType")
        private String periodScheduleIntervalType;

        @com.aliyun.core.annotation.NameInMap("PeriodScheduleParamList")
        private java.util.List<String> periodScheduleParamList;

        @com.aliyun.core.annotation.NameInMap("StaticTaskTriggerType")
        private String staticTaskTriggerType;

        @com.aliyun.core.annotation.NameInMap("TriggerNodeList")
        private java.util.List<String> triggerNodeList;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValidatePartitionType")
        private String validatePartitionType;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private QualityScheduleInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.cronExpression = builder.cronExpression;
            this.id = builder.id;
            this.isRefByRule = builder.isRefByRule;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.partitionExpression = builder.partitionExpression;
            this.partitionType = builder.partitionType;
            this.periodScheduleIntervalType = builder.periodScheduleIntervalType;
            this.periodScheduleParamList = builder.periodScheduleParamList;
            this.staticTaskTriggerType = builder.staticTaskTriggerType;
            this.triggerNodeList = builder.triggerNodeList;
            this.triggerType = builder.triggerType;
            this.type = builder.type;
            this.validatePartitionType = builder.validatePartitionType;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isRefByRule
         */
        public Boolean getIsRefByRule() {
            return this.isRefByRule;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionExpression
         */
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return periodScheduleIntervalType
         */
        public String getPeriodScheduleIntervalType() {
            return this.periodScheduleIntervalType;
        }

        /**
         * @return periodScheduleParamList
         */
        public java.util.List<String> getPeriodScheduleParamList() {
            return this.periodScheduleParamList;
        }

        /**
         * @return staticTaskTriggerType
         */
        public String getStaticTaskTriggerType() {
            return this.staticTaskTriggerType;
        }

        /**
         * @return triggerNodeList
         */
        public java.util.List<String> getTriggerNodeList() {
            return this.triggerNodeList;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validatePartitionType
         */
        public String getValidatePartitionType() {
            return this.validatePartitionType;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String cronExpression; 
            private Long id; 
            private Boolean isRefByRule; 
            private String modifier; 
            private String modifyTime; 
            private String name; 
            private String partitionExpression; 
            private String partitionType; 
            private String periodScheduleIntervalType; 
            private java.util.List<String> periodScheduleParamList; 
            private String staticTaskTriggerType; 
            private java.util.List<String> triggerNodeList; 
            private String triggerType; 
            private String type; 
            private String validatePartitionType; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(QualityScheduleInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.cronExpression = model.cronExpression;
                this.id = model.id;
                this.isRefByRule = model.isRefByRule;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.partitionExpression = model.partitionExpression;
                this.partitionType = model.partitionType;
                this.periodScheduleIntervalType = model.periodScheduleIntervalType;
                this.periodScheduleParamList = model.periodScheduleParamList;
                this.staticTaskTriggerType = model.staticTaskTriggerType;
                this.triggerNodeList = model.triggerNodeList;
                this.triggerType = model.triggerType;
                this.type = model.type;
                this.validatePartitionType = model.validatePartitionType;
                this.watchId = model.watchId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The cron expression for timed scheduling.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li><ul>
             * <li>1/* * * *</li>
             * </ul>
             * </li>
             * </ul>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The ID of the schedule object.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the schedule object is referenced by a rule.</p>
             */
            public Builder isRefByRule(Boolean isRefByRule) {
                this.isRefByRule = isRefByRule;
                return this;
            }

            /**
             * <p>The user ID of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the schedule object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom partition expression.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=${yyyyMMdd}</p>
             */
            public Builder partitionExpression(String partitionExpression) {
                this.partitionExpression = partitionExpression;
                return this;
            }

            /**
             * <p>The partition type. Valid values:</p>
             * <ul>
             * <li>EVERY_DAY: every day.</li>
             * <li>PRE_DAY: yesterday.</li>
             * <li>TODAY: today.</li>
             * <li>FIRST_DAY_OF_WEEK: first day of the week (Sunday).</li>
             * <li>CUSTOM: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * <p>The interval type for timed scheduling. Valid values:</p>
             * <ul>
             * <li>DAILY: day.</li>
             * <li>WEEKLY: week.</li>
             * <li>MONTHLY: month.</li>
             * <li>HOURLY: hour.</li>
             * <li>MINUTELY: minute.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder periodScheduleIntervalType(String periodScheduleIntervalType) {
                this.periodScheduleIntervalType = periodScheduleIntervalType;
                return this;
            }

            /**
             * <p>The interval values for timed scheduling.</p>
             */
            public Builder periodScheduleParamList(java.util.List<String> periodScheduleParamList) {
                this.periodScheduleParamList = periodScheduleParamList;
                return this;
            }

            /**
             * <p>The trigger type for fixed task triggers. Valid values:</p>
             * <ul>
             * <li>ALL_TASKS_FINISHED: triggered when all tasks are finished.</li>
             * <li>ONE_TASKS_FINISHED: triggered when one task is finished.</li>
             * <li>PRE_ONE_TASKS_START: triggered when the previous task starts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONE_TASKS_FINISHED</p>
             */
            public Builder staticTaskTriggerType(String staticTaskTriggerType) {
                this.staticTaskTriggerType = staticTaskTriggerType;
                return this;
            }

            /**
             * <p>The list of trigger nodes for trigger-based scheduling.</p>
             */
            public Builder triggerNodeList(java.util.List<String> triggerNodeList) {
                this.triggerNodeList = triggerNodeList;
                return this;
            }

            /**
             * <p>The trigger type for trigger-based scheduling. Valid values:</p>
             * <ul>
             * <li>STATIC_TASK_TRIGGER: fixed task trigger.</li>
             * <li>CODE_CHECK_TRIGGER: code check trigger.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC_TASK_TRIGGER</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The schedule type. Valid values:</p>
             * <ul>
             * <li>PERIOD_SCHEDULE: timed scheduling.</li>
             * <li>MANUAL_SCHEDULE: manual trigger.</li>
             * <li>CODE_CHECK_TRIGGER: code check trigger.</li>
             * <li>STATIC_TASK_TRIGGER: fixed task trigger.</li>
             * <li>DEPENDENCY_SCHEDULE: dependency scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PERIOD_SCHEDULE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The validation scope. Valid values:</p>
             * <ul>
             * <li>TASK_REFERRED_PARTITION: partition updated by the task.</li>
             * <li>USER_DEFINED_PARTITION: custom partition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TASK_REFERRED_PARTITION</p>
             */
            public Builder validatePartitionType(String validatePartitionType) {
                this.validatePartitionType = validatePartitionType;
                return this;
            }

            /**
             * <p>The ID of the monitored object.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityScheduleInfo build() {
                return new QualityScheduleInfo(this);
            } 

        } 

    }
}
