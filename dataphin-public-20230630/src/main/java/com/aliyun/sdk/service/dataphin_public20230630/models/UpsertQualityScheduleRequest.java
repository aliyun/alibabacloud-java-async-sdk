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
 * {@link UpsertQualityScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityScheduleRequest</p>
 */
public class UpsertQualityScheduleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityScheduleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityScheduleRequest create() {
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
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityScheduleRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityScheduleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.upsertCommand = request.upsertCommand;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update instruction.</p>
         * <p>This parameter is required.</p>
         */
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityScheduleRequest build() {
            return new UpsertQualityScheduleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityScheduleRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityScheduleRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValidatePartitionType")
        private String validatePartitionType;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private UpsertCommand(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.id = builder.id;
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

        public static UpsertCommand create() {
            return builder().build();
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
            private String cronExpression; 
            private Long id; 
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

            private Builder(UpsertCommand model) {
                this.cronExpression = model.cronExpression;
                this.id = model.id;
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
             * <p>The schedule object ID. If this parameter is specified, the schedule is updated. If this parameter is not specified, a schedule is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the schedule object.</p>
             * <p>This parameter is required.</p>
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
             * <p>The schedule interval type for timed scheduling. Valid values:</p>
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
             * <p>The schedule interval values for timed scheduling.</p>
             */
            public Builder periodScheduleParamList(java.util.List<String> periodScheduleParamList) {
                this.periodScheduleParamList = periodScheduleParamList;
                return this;
            }

            /**
             * <p>The trigger method for fixed task triggers. Valid values:</p>
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
             * <p>The list of trigger nodes for trigger scheduling.</p>
             */
            public Builder triggerNodeList(java.util.List<String> triggerNodeList) {
                this.triggerNodeList = triggerNodeList;
                return this;
            }

            /**
             * <p>The trigger method for trigger scheduling. Valid values:</p>
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
             * <p>This parameter is required.</p>
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
             * <li>TASK_REFERRED_PARTITION: task update partition.</li>
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
             * <p>The monitored object ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
