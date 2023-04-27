// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowScheduleRequest</p>
 */
public class UpdateTaskFlowScheduleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CronBeginDate")
    private String cronBeginDate;

    @Query
    @NameInMap("CronEndDate")
    private String cronEndDate;

    @Query
    @NameInMap("CronStr")
    private String cronStr;

    @Query
    @NameInMap("CronType")
    private String cronType;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("ScheduleParam")
    @Validation(required = true)
    private String scheduleParam;

    @Query
    @NameInMap("ScheduleSwitch")
    @Validation(required = true)
    private Boolean scheduleSwitch;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("TimeZoneId")
    private String timeZoneId;

    @Query
    @NameInMap("TriggerType")
    @Validation(required = true)
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
         * CronBeginDate.
         */
        public Builder cronBeginDate(String cronBeginDate) {
            this.putQueryParameter("CronBeginDate", cronBeginDate);
            this.cronBeginDate = cronBeginDate;
            return this;
        }

        /**
         * CronEndDate.
         */
        public Builder cronEndDate(String cronEndDate) {
            this.putQueryParameter("CronEndDate", cronEndDate);
            this.cronEndDate = cronEndDate;
            return this;
        }

        /**
         * CronStr.
         */
        public Builder cronStr(String cronStr) {
            this.putQueryParameter("CronStr", cronStr);
            this.cronStr = cronStr;
            return this;
        }

        /**
         * CronType.
         */
        public Builder cronType(String cronType) {
            this.putQueryParameter("CronType", cronType);
            this.cronType = cronType;
            return this;
        }

        /**
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * ScheduleParam.
         */
        public Builder scheduleParam(String scheduleParam) {
            this.putQueryParameter("ScheduleParam", scheduleParam);
            this.scheduleParam = scheduleParam;
            return this;
        }

        /**
         * ScheduleSwitch.
         */
        public Builder scheduleSwitch(Boolean scheduleSwitch) {
            this.putQueryParameter("ScheduleSwitch", scheduleSwitch);
            this.scheduleSwitch = scheduleSwitch;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * TimeZoneId.
         */
        public Builder timeZoneId(String timeZoneId) {
            this.putQueryParameter("TimeZoneId", timeZoneId);
            this.timeZoneId = timeZoneId;
            return this;
        }

        /**
         * TriggerType.
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
