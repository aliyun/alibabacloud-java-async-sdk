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
 * {@link ListIntervalAgentReportRequest} extends {@link RequestModel}
 *
 * <p>ListIntervalAgentReportRequest</p>
 */
public class ListIntervalAgentReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

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
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListIntervalAgentReportRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.mediaType = builder.mediaType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntervalAgentReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListIntervalAgentReportRequest, Builder> {
        private String agentId; 
        private Long endTime; 
        private String instanceId; 
        private String interval; 
        private String mediaType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListIntervalAgentReportRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.mediaType = request.mediaType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Agent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>End time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. Time precision for statistics is at the hour level, rounded down to the next full hour, using an open interval. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned input time range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1532707199000</p>
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
         * <p>Segment statistics type. Optional. Default value is Daily (aggregated by Day).</p>
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
         * <p>Media type. The default value is Audio. Other valid values include Chat and Video.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Start time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is 00:00:00 of the current day. Time precision for statistics is at the hour level, rounded down to the previous full hour, using a closed interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListIntervalAgentReportRequest build() {
            return new ListIntervalAgentReportRequest(this);
        } 

    } 

}
