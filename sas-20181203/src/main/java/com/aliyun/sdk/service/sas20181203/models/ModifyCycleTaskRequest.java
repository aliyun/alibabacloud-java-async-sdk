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
         * <p>The ID of the configuration.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeCycleTaskList~~">DescribeCycleTaskList</a> operation to obtain this parameter.</p>
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
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
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
         * <p>The first execution time.</p>
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
         * <p>The interval period.</p>
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
         * <p>The extended information field.</p>
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
         * <p>The unit of the scan cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: day.</li>
         * <li><strong>hour</strong>: hour.</li>
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
         * <p>The task end time, in hours.</p>
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
         * <p>The task start time, in hours.</p>
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
         * <p>The node name. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scanning.</li>
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
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scanning.</li>
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
