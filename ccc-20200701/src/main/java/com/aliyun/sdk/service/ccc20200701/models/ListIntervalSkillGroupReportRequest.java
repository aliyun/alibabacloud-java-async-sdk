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
 * {@link ListIntervalSkillGroupReportRequest} extends {@link RequestModel}
 *
 * <p>ListIntervalSkillGroupReportRequest</p>
 */
public class ListIntervalSkillGroupReportRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListIntervalSkillGroupReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.mediaType = builder.mediaType;
        this.skillGroupId = builder.skillGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntervalSkillGroupReportRequest create() {
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListIntervalSkillGroupReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String interval; 
        private String mediaType; 
        private String skillGroupId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListIntervalSkillGroupReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.mediaType = request.mediaType;
            this.skillGroupId = request.skillGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>End Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. The time precision for statistics is hourly, snapped backward to the nearest hour, using an open interval. For example, if the Start Time is 11:12:20 and the End Time is 11:45:50, the aligned input parameter Time Range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1604725528000</p>
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
         * <p>Segment statistics type. The default is Daily (aggregated by day).</p>
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
         * <p>Media type. The default is Audio. Other valid values include Chat and Video.</p>
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
         * <p>Skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skg-default@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>Start Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is 00:00 of the current day. Statistics are aggregated by hour, rounded down to the nearest hour, and the interval is closed.</p>
         * 
         * <strong>example:</strong>
         * <p>1604639129000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListIntervalSkillGroupReportRequest build() {
            return new ListIntervalSkillGroupReportRequest(this);
        } 

    } 

}
