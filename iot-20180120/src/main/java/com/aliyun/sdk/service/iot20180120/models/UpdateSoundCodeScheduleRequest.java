// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateSoundCodeScheduleRequest</p>
 */
public class UpdateSoundCodeScheduleRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ScheduleCode")
    @Validation(required = true)
    private String scheduleCode;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("Status")
    private String status;

    private UpdateSoundCodeScheduleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.endDate = builder.endDate;
        this.endTime = builder.endTime;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.scheduleCode = builder.scheduleCode;
        this.startDate = builder.startDate;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSoundCodeScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateSoundCodeScheduleRequest, Builder> {
        private String description; 
        private String endDate; 
        private String endTime; 
        private String iotInstanceId; 
        private String name; 
        private String scheduleCode; 
        private String startDate; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSoundCodeScheduleRequest request) {
            super(request);
            this.description = request.description;
            this.endDate = request.endDate;
            this.endTime = request.endTime;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.scheduleCode = request.scheduleCode;
            this.startDate = request.startDate;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ScheduleCode.
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateSoundCodeScheduleRequest build() {
            return new UpdateSoundCodeScheduleRequest(this);
        } 

    } 

}
