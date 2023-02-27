// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalCallerReportRequest} extends {@link RequestModel}
 *
 * <p>GetHistoricalCallerReportRequest</p>
 */
public class GetHistoricalCallerReportRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    @Validation(required = true)
    private String callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 4102416000000D)
    private Long startTime;

    @Query
    @NameInMap("StopTime")
    @Validation(required = true, maximum = 4102416000000D)
    private Long stopTime;

    private GetHistoricalCallerReportRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalCallerReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Long getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<GetHistoricalCallerReportRequest, Builder> {
        private String callingNumber; 
        private String instanceId; 
        private Long startTime; 
        private Long stopTime; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoricalCallerReportRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
            this.stopTime = request.stopTime;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * StopTime.
         */
        public Builder stopTime(Long stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public GetHistoricalCallerReportRequest build() {
            return new GetHistoricalCallerReportRequest(this);
        } 

    } 

}
