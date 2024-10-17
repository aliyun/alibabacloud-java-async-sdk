// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTraceRequest} extends {@link RequestModel}
 *
 * <p>GetTraceRequest</p>
 */
public class GetTraceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceID;

    private GetTraceRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.traceID = builder.traceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceID
     */
    public String getTraceID() {
        return this.traceID;
    }

    public static final class Builder extends Request.Builder<GetTraceRequest, Builder> {
        private Long endTime; 
        private String regionId; 
        private Long startTime; 
        private String traceID; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.traceID = request.traceID;
        } 

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1623827603000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>If the ID of the trace is 30 characters in length, this parameter is optional. Otherwise, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1623827602000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The trace ID. You can log on to the ARMS console and obtain the trace ID on the <strong>Trace Query</strong> page or <strong>Interface Snapshot</strong> tab.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac14001a15954493811405707d****</p>
         */
        public Builder traceID(String traceID) {
            this.putQueryParameter("TraceID", traceID);
            this.traceID = traceID;
            return this;
        }

        @Override
        public GetTraceRequest build() {
            return new GetTraceRequest(this);
        } 

    } 

}
