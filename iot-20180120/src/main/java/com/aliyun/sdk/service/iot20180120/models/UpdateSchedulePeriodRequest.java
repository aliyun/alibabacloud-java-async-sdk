// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSchedulePeriodRequest} extends {@link RequestModel}
 *
 * <p>UpdateSchedulePeriodRequest</p>
 */
public class UpdateSchedulePeriodRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("PeriodCode")
    @Validation(required = true)
    private String periodCode;

    @Body
    @NameInMap("SoundCodeContent")
    private String soundCodeContent;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    private UpdateSchedulePeriodRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.iotInstanceId = builder.iotInstanceId;
        this.periodCode = builder.periodCode;
        this.soundCodeContent = builder.soundCodeContent;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSchedulePeriodRequest create() {
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
     * @return periodCode
     */
    public String getPeriodCode() {
        return this.periodCode;
    }

    /**
     * @return soundCodeContent
     */
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<UpdateSchedulePeriodRequest, Builder> {
        private String description; 
        private String endTime; 
        private String iotInstanceId; 
        private String periodCode; 
        private String soundCodeContent; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSchedulePeriodRequest request) {
            super(request);
            this.description = request.description;
            this.endTime = request.endTime;
            this.iotInstanceId = request.iotInstanceId;
            this.periodCode = request.periodCode;
            this.soundCodeContent = request.soundCodeContent;
            this.startTime = request.startTime;
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
         * PeriodCode.
         */
        public Builder periodCode(String periodCode) {
            this.putBodyParameter("PeriodCode", periodCode);
            this.periodCode = periodCode;
            return this;
        }

        /**
         * SoundCodeContent.
         */
        public Builder soundCodeContent(String soundCodeContent) {
            this.putBodyParameter("SoundCodeContent", soundCodeContent);
            this.soundCodeContent = soundCodeContent;
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

        @Override
        public UpdateSchedulePeriodRequest build() {
            return new UpdateSchedulePeriodRequest(this);
        } 

    } 

}
