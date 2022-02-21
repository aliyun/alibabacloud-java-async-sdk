// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicePurifyPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateDevicePurifyPlanRequest</p>
 */
public class UpdateDevicePurifyPlanRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Integer endTime;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Integer startTime;

    private UpdateDevicePurifyPlanRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.planId = builder.planId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDevicePurifyPlanRequest create() {
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<UpdateDevicePurifyPlanRequest, Builder> {
        private Integer endTime; 
        private String planId; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDevicePurifyPlanRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.planId = response.planId;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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
        public UpdateDevicePurifyPlanRequest build() {
            return new UpdateDevicePurifyPlanRequest(this);
        } 

    } 

}
