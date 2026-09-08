// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListIntervalInstanceReportRequest} extends {@link RequestModel}
 *
 * <p>ListIntervalInstanceReportRequest</p>
 */
public class ListIntervalInstanceReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListIntervalInstanceReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntervalInstanceReportRequest create() {
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListIntervalInstanceReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String interval; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListIntervalInstanceReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.startTime = request.startTime;
        } 

        /**
         * <p>End Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. The time precision for statistics is hourly, snapped backward to the start of the hour, using an open interval. For example, if the original Start Time is 11:12:20 and End Time is 11:45:50, the aligned time range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1620316799000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Segment statistics type. This parameter is optional. The default value is Daily (daily aggregation).</p>
         * 
         * <strong>example:</strong>
         * <p>Hourly</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>Start Time, in UNIX timestamp format with millisecond precision. This parameter is optional. The default value is 00:00 of the current day. The time granularity for statistics is hourly, rounded down to the nearest hour, and uses a closed interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1620230400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListIntervalInstanceReportRequest build() {
            return new ListIntervalInstanceReportRequest(this);
        } 

    } 

}
