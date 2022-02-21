// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicePurifyPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateDevicePurifyPlanRequest</p>
 */
public class CreateDevicePurifyPlanRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Integer endTime;

    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Integer startTime;

    private CreateDevicePurifyPlanRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicePurifyPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateDevicePurifyPlanRequest, Builder> {
        private Integer endTime; 
        private String iotId; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevicePurifyPlanRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.iotId = response.iotId;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateDevicePurifyPlanRequest build() {
            return new CreateDevicePurifyPlanRequest(this);
        } 

    } 

}
