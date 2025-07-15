// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeMeterLiveBypassDurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterLiveBypassDurationRequest</p>
 */
public class DescribeMeterLiveBypassDurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeMeterLiveBypassDurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterLiveBypassDurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMeterLiveBypassDurationRequest, Builder> {
        private String appId; 
        private String endTime; 
        private String interval; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterLiveBypassDurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the application. You can view the application ID on the <a href="https://help.aliyun.com/document_detail/2355593.html">Applications</a> page in the ApsaraVideo Real-time Communication (ARTC) section of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4346289a-a790-4869-9e23-22766d5e****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. The time range that can be specified is greater than or equal to 5 minutes and less than or equal to 31 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>300</li>
         * <li>3600</li>
         * <li>86400</li>
         * </ul>
         * <p>If you specify an invalid value or do not specify this parameter, the default value 3600 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMeterLiveBypassDurationRequest build() {
            return new DescribeMeterLiveBypassDurationRequest(this);
        } 

    } 

}
