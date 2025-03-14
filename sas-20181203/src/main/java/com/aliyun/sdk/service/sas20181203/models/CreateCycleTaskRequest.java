// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateCycleTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCycleTaskRequest</p>
 */
public class CreateCycleTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstDateStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long firstDateStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer intervalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private CreateCycleTaskRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.firstDateStr = builder.firstDateStr;
        this.intervalPeriod = builder.intervalPeriod;
        this.param = builder.param;
        this.periodUnit = builder.periodUnit;
        this.source = builder.source;
        this.targetEndTime = builder.targetEndTime;
        this.targetStartTime = builder.targetStartTime;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCycleTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<CreateCycleTaskRequest, Builder> {
        private Integer enable; 
        private Long firstDateStr; 
        private Integer intervalPeriod; 
        private String param; 
        private String periodUnit; 
        private String source; 
        private Integer targetEndTime; 
        private Integer targetStartTime; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCycleTaskRequest request) {
            super(request);
            this.enable = request.enable;
            this.firstDateStr = request.firstDateStr;
            this.intervalPeriod = request.intervalPeriod;
            this.param = request.param;
            this.periodUnit = request.periodUnit;
            this.source = request.source;
            this.targetEndTime = request.targetEndTime;
            this.targetStartTime = request.targetStartTime;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>Specifies whether to enable the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The first time when the task is performed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1650556800000</p>
         */
        public Builder firstDateStr(Long firstDateStr) {
            this.putQueryParameter("FirstDateStr", firstDateStr);
            this.firstDateStr = firstDateStr;
            return this;
        }

        /**
         * <p>The interval of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <li><strong>day</strong>: days</li>
         * <li><strong>hour</strong>: hours</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The additional source for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>console_batch</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The time when the task ends. Unit: hours.</p>
         * <p>This parameter is required.</p>
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
         * <p>The time when the task is started. Unit: hours.</p>
         * <p>This parameter is required.</p>
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
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public CreateCycleTaskRequest build() {
            return new CreateCycleTaskRequest(this);
        } 

    } 

}
