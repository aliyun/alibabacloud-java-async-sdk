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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private String clientToken; 
        private Boolean dryRun; 
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
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values: true: performs only a dry run without performing the actual operation. false: performs the actual request. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enable.</li>
         * <li><strong>0</strong>: Disable.</li>
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
         * <p>The time of the first execution.</p>
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
         * <p>The interval period.</p>
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
         * <p>The extended information field.</p>
         * <blockquote>
         * <p>Note: This parameter is required. If you do not specify this parameter, the API returns an error. The value is a JSON-formatted string that must contain at least the targetInfo array.</p>
         * </blockquote>
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
         * <p>The unit of the scan period. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: day.</li>
         * <li><strong>hour</strong>: hour.</li>
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
         * <p>The source from which the task is created.</p>
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
         * <p>The end time of the task, in hours.</p>
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
         * <p>The start time of the task, in hours.</p>
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
         * <p>The task name. This is a custom string used to identify the periodic scan task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_virus_scan</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scan.</li>
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
