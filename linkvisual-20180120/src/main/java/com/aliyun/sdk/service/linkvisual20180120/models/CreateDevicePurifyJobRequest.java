// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicePurifyJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDevicePurifyJobRequest</p>
 */
public class CreateDevicePurifyJobRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private CreateDevicePurifyJobRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicePurifyJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateDevicePurifyJobRequest, Builder> {
        private Long endTime; 
        private String iotId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevicePurifyJobRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.iotId = response.iotId;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
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
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateDevicePurifyJobRequest build() {
            return new CreateDevicePurifyJobRequest(this);
        } 

    } 

}
