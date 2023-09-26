// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCycleTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyCycleTaskRequest</p>
 */
public class ModifyCycleTaskRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    @Query
    @NameInMap("Enable")
    private Integer enable;

    @Query
    @NameInMap("FirstDateStr")
    private Long firstDateStr;

    @Query
    @NameInMap("IntervalPeriod")
    private Integer intervalPeriod;

    @Query
    @NameInMap("Param")
    private String param;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("TargetEndTime")
    private Integer targetEndTime;

    @Query
    @NameInMap("TargetStartTime")
    private Integer targetStartTime;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private ModifyCycleTaskRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.enable = builder.enable;
        this.firstDateStr = builder.firstDateStr;
        this.intervalPeriod = builder.intervalPeriod;
        this.param = builder.param;
        this.periodUnit = builder.periodUnit;
        this.targetEndTime = builder.targetEndTime;
        this.targetStartTime = builder.targetStartTime;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCycleTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return firstDateStr
     */
    public Long getFirstDateStr() {
        return this.firstDateStr;
    }

    /**
     * @return intervalPeriod
     */
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return targetEndTime
     */
    public Integer getTargetEndTime() {
        return this.targetEndTime;
    }

    /**
     * @return targetStartTime
     */
    public Integer getTargetStartTime() {
        return this.targetStartTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ModifyCycleTaskRequest, Builder> {
        private String configId; 
        private Integer enable; 
        private Long firstDateStr; 
        private Integer intervalPeriod; 
        private String param; 
        private String periodUnit; 
        private Integer targetEndTime; 
        private Integer targetStartTime; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCycleTaskRequest request) {
            super(request);
            this.configId = request.configId;
            this.enable = request.enable;
            this.firstDateStr = request.firstDateStr;
            this.intervalPeriod = request.intervalPeriod;
            this.param = request.param;
            this.periodUnit = request.periodUnit;
            this.targetEndTime = request.targetEndTime;
            this.targetStartTime = request.targetStartTime;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The ID of the task configuration.
         * <p>
         * 
         * >  You can call the [DescribeCycleTaskList](~~DescribeCycleTaskList~~) operation to query the IDs of task configurations.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * Specifies whether to enable the task. Valid values:
         * <p>
         * 
         * *   **1**: enables the task.
         * *   **0**: disables the task.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The time when the task first started.
         */
        public Builder firstDateStr(Long firstDateStr) {
            this.putQueryParameter("FirstDateStr", firstDateStr);
            this.firstDateStr = firstDateStr;
            return this;
        }

        /**
         * The interval at which the task is run.
         */
        public Builder intervalPeriod(Integer intervalPeriod) {
            this.putQueryParameter("IntervalPeriod", intervalPeriod);
            this.intervalPeriod = intervalPeriod;
            return this;
        }

        /**
         * The additional information.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The unit of the scan interval. Valid values:
         * <p>
         * 
         * *   **day**
         * *   **hour**
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The end time of the task. The time must be a time frame.
         */
        public Builder targetEndTime(Integer targetEndTime) {
            this.putQueryParameter("TargetEndTime", targetEndTime);
            this.targetEndTime = targetEndTime;
            return this;
        }

        /**
         * The start time of the task. The start time must be a time frame.
         */
        public Builder targetStartTime(Integer targetStartTime) {
            this.putQueryParameter("TargetStartTime", targetStartTime);
            this.targetStartTime = targetStartTime;
            return this;
        }

        /**
         * The name of the task. Valid values:
         * <p>
         * 
         * *   **VIRUS_VUL_SCHEDULE_SCAN**: virus detection task
         * *   **IMAGE_SCAN**: image scan task
         * *   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task
         * 
         * Valid values:
         * 
         * *   VIRUS_VUL_SCHEDULE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     virus detection task
         * 
         *     <!-- -->
         * 
         * *   IMAGE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     image scan task
         * 
         *     <!-- -->
         * 
         * *   EMG_VUL_SCHEDULE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     urgent vulnerability scan task
         * 
         *     <!-- -->
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * *   **VIRUS_VUL_SCHEDULE_SCAN**: virus detection task
         * *   **IMAGE_SCAN**: image scan task
         * *   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task
         * 
         * Valid values:
         * 
         * *   VIRUS_VUL_SCHEDULE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     virus detection task
         * 
         *     <!-- -->
         * 
         * *   IMAGE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     image scan task
         * 
         *     <!-- -->
         * 
         * *   EMG_VUL_SCHEDULE_SCAN
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     urgent vulnerability scan task
         * 
         *     <!-- -->
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ModifyCycleTaskRequest build() {
            return new ModifyCycleTaskRequest(this);
        } 

    } 

}
