// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSoundCodeScheduleRequest} extends {@link RequestModel}
 *
 * <p>DeleteSoundCodeScheduleRequest</p>
 */
public class DeleteSoundCodeScheduleRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ScheduleCode")
    @Validation(required = true)
    private String scheduleCode;

    private DeleteSoundCodeScheduleRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.scheduleCode = builder.scheduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSoundCodeScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public static final class Builder extends Request.Builder<DeleteSoundCodeScheduleRequest, Builder> {
        private String iotInstanceId; 
        private String scheduleCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSoundCodeScheduleRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.scheduleCode = request.scheduleCode;
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
         * ScheduleCode.
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        @Override
        public DeleteSoundCodeScheduleRequest build() {
            return new DeleteSoundCodeScheduleRequest(this);
        } 

    } 

}
