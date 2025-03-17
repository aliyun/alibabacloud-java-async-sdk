// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link UpdateTaskFlowScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowScheduleRequest</p>
 */
public class UpdateTaskFlowScheduleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronBeginDate")
    private String cronBeginDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronEndDate")
    private String cronEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronStr")
    private String cronStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronType")
    private String cronType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean scheduleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZoneId")
    private String timeZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private UpdateTaskFlowScheduleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cronBeginDate = builder.cronBeginDate;
        this.cronEndDate = builder.cronEndDate;
        this.cronStr = builder.cronStr;
        this.cronType = builder.cronType;
        this.dagId = builder.dagId;
        this.scheduleParam = builder.scheduleParam;
        this.scheduleSwitch = builder.scheduleSwitch;
        this.tid = builder.tid;
        this.timeZoneId = builder.timeZoneId;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowScheduleRequest create() {
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
     * @return cronBeginDate
     */
    public String getCronBeginDate() {
        return this.cronBeginDate;
    }

    /**
     * @return cronEndDate
     */
    public String getCronEndDate() {
        return this.cronEndDate;
    }

    /**
     * @return cronStr
     */
    public String getCronStr() {
        return this.cronStr;
    }

    /**
     * @return cronType
     */
    public String getCronType() {
        return this.cronType;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return scheduleParam
     */
    public String getScheduleParam() {
        return this.scheduleParam;
    }

    /**
     * @return scheduleSwitch
     */
    public Boolean getScheduleSwitch() {
        return this.scheduleSwitch;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return timeZoneId
     */
    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowScheduleRequest, Builder> {
        private String regionId; 
        private String cronBeginDate; 
        private String cronEndDate; 
        private String cronStr; 
        private String cronType; 
        private Long dagId; 
        private String scheduleParam; 
        private Boolean scheduleSwitch; 
        private Long tid; 
        private String timeZoneId; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowScheduleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cronBeginDate = request.cronBeginDate;
            this.cronEndDate = request.cronEndDate;
            this.cronStr = request.cronStr;
            this.cronType = request.cronType;
            this.dagId = request.dagId;
            this.scheduleParam = request.scheduleParam;
            this.scheduleSwitch = request.scheduleSwitch;
            this.tid = request.tid;
            this.timeZoneId = request.timeZoneId;
            this.triggerType = request.triggerType;
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
         * <p>The start of the time range for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>CronBeginDate_test</p>
         */
        public Builder cronBeginDate(String cronBeginDate) {
            this.putQueryParameter("CronBeginDate", cronBeginDate);
            this.cronBeginDate = cronBeginDate;
            return this;
        }

        /**
         * <p>The end of the time range for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>CronEndDate_test</p>
         */
        public Builder cronEndDate(String cronEndDate) {
            this.putQueryParameter("CronEndDate", cronEndDate);
            this.cronEndDate = cronEndDate;
            return this;
        }

        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>CronStr_test</p>
         */
        public Builder cronStr(String cronStr) {
            this.putQueryParameter("CronStr", cronStr);
            this.cronStr = cronStr;
            return this;
        }

        /**
         * <p>The type of the scheduling cycle. Valid values:</p>
         * <ul>
         * <li><strong>MINUTE</strong>: scheduling by minute</li>
         * <li><strong>HOUR</strong>: scheduling by hour</li>
         * <li><strong>DAY</strong>: scheduling by day</li>
         * <li><strong>WEEK</strong>: scheduling by week</li>
         * <li><strong>MONTH</strong>: scheduling by month</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        public Builder cronType(String cronType) {
            this.putQueryParameter("CronType", cronType);
            this.cronType = cronType;
            return this;
        }

        /**
         * <p>The ID of the task flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7***</p>
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>The event scheduling configuration. The value of this parameter is a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ScheduleParam_test</p>
         */
        public Builder scheduleParam(String scheduleParam) {
            this.putQueryParameter("ScheduleParam", scheduleParam);
            this.scheduleParam = scheduleParam;
            return this;
        }

        /**
         * <p>Specifies whether to enable scheduling. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        public Builder scheduleSwitch(Boolean scheduleSwitch) {
            this.putQueryParameter("ScheduleSwitch", scheduleSwitch);
            this.scheduleSwitch = scheduleSwitch;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The time zone. The default time zone is UTC+8 (Asia/Shanghai).</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timeZoneId(String timeZoneId) {
            this.putQueryParameter("TimeZoneId", timeZoneId);
            this.timeZoneId = timeZoneId;
            return this;
        }

        /**
         * <p>The mode in which the task flow is triggered. Valid values:</p>
         * <ul>
         * <li><strong>Cron</strong>: The task flow is triggered based on timed scheduling.</li>
         * <li><strong>Event</strong>: The task flow is triggered by events.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Event</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public UpdateTaskFlowScheduleRequest build() {
            return new UpdateTaskFlowScheduleRequest(this);
        } 

    } 

}
