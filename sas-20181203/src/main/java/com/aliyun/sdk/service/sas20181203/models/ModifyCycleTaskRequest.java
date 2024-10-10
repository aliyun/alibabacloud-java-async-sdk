// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCycleTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyCycleTaskRequest</p>
 */
public class ModifyCycleTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstDateStr")
    private Long firstDateStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
    private Integer intervalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetEndTime")
    private Integer targetEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetStartTime")
    private Integer targetStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
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
         * <p>The ID of the task configuration.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCycleTaskList~~">DescribeCycleTaskList</a> operation to query the IDs of task configurations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00cfa8161da093089e6804ba6a33****</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the task.</li>
         * <li><strong>0</strong>: disables the task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The time when the task first started.</p>
         * 
         * <strong>example:</strong>
         * <p>1664380800000</p>
         */
        public Builder firstDateStr(Long firstDateStr) {
            this.putQueryParameter("FirstDateStr", firstDateStr);
            this.firstDateStr = firstDateStr;
            return this;
        }

        /**
         * <p>The interval at which the task is run.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder intervalPeriod(Integer intervalPeriod) {
            this.putQueryParameter("IntervalPeriod", intervalPeriod);
            this.intervalPeriod = intervalPeriod;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;targetInfo&quot;: [
         *             {
         *                   &quot;type&quot;: &quot;groupId&quot;,
         *                   &quot;name&quot;: &quot;TI HOST&quot;,
         *                   &quot;target&quot;: 10597***
         *             },
         *             {
         *                   &quot;type&quot;: &quot;groupId&quot;,
         *                   &quot;name&quot;: &quot;expense HOST&quot;,
         *                   &quot;target&quot;: 10597***
         *             }
         *       ]
         * }</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The unit of the scan interval. Valid values:</p>
         * <ul>
         * <li><strong>day</strong></li>
         * <li><strong>hour</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The end time of the task. The time must be a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder targetEndTime(Integer targetEndTime) {
            this.putQueryParameter("TargetEndTime", targetEndTime);
            this.targetEndTime = targetEndTime;
            return this;
        }

        /**
         * <p>The start time of the task. The start time must be a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder targetStartTime(Integer targetStartTime) {
            this.putQueryParameter("TargetStartTime", targetStartTime);
            this.targetStartTime = targetStartTime;
            return this;
        }

        /**
         * <p>The name of the task. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus detection task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>VIRUS_VUL_SCHEDULE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>virus detection task</p>
         * <!-- -->
         * </li>
         * <li><p>IMAGE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>image scan task</p>
         * <!-- -->
         * </li>
         * <li><p>EMG_VUL_SCHEDULE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>urgent vulnerability scan task</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EMG_VUL_SCHEDULE_SCAN</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus detection task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>VIRUS_VUL_SCHEDULE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>virus detection task</p>
         * <!-- -->
         * </li>
         * <li><p>IMAGE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>image scan task</p>
         * <!-- -->
         * </li>
         * <li><p>EMG_VUL_SCHEDULE_SCAN</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>urgent vulnerability scan task</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
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
