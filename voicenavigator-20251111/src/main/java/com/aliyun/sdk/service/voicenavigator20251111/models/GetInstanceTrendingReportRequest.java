// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetInstanceTrendingReportRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceTrendingReportRequest</p>
 */
public class GetInstanceTrendingReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    private String timeInterval;

    private GetInstanceTrendingReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTrendingReportRequest create() {
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
     * @return timeInterval
     */
    public String getTimeInterval() {
        return this.timeInterval;
    }

    public static final class Builder extends Request.Builder<GetInstanceTrendingReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private Long startTime; 
        private String timeInterval; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceTrendingReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
            this.timeInterval = request.timeInterval;
        } 

        /**
         * <p>The end time of the statistical period. The value is a millisecond-level UNIX timestamp that represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. The following constraints apply:</p>
         * <p>Time range constraint: The maximum time range is 7 days for hourly queries and 180 days for daily queries.
         * Time granularity alignment: For hourly queries, the minutes, seconds, and milliseconds must be 0. For daily queries, the hours, minutes, seconds, and milliseconds must be 0.
         * If the specified timestamp is not aligned with the corresponding granularity, the server automatically rounds it up.</p>
         * 
         * <strong>example:</strong>
         * <p>1582103299434</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The start time of the statistical period. The value is a millisecond-level UNIX timestamp that represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. The following constraints apply:</p>
         * <ol>
         * <li>Earliest boundary: The start time can trace back to 00:00:00 of the date 365 calendar days before the current date.</li>
         * <li>Time granularity alignment: For hourly queries, the minutes, seconds, and milliseconds must be 0. For daily queries, the hours, minutes, seconds, and milliseconds must be 0.</li>
         * <li>If the specified timestamp is not aligned with the corresponding granularity, the server automatically rounds it up.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1582267398628</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder timeInterval(String timeInterval) {
            this.putBodyParameter("TimeInterval", timeInterval);
            this.timeInterval = timeInterval;
            return this;
        }

        @Override
        public GetInstanceTrendingReportRequest build() {
            return new GetInstanceTrendingReportRequest(this);
        } 

    } 

}
