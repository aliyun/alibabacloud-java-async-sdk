// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerCollectDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodPlayerCollectDataRequest</p>
 */
public class DescribeVodPlayerCollectDataRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalType;

    private DescribeVodPlayerCollectDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.metrics = builder.metrics;
        this.os = builder.os;
        this.period = builder.period;
        this.startTime = builder.startTime;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerCollectDataRequest create() {
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
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribeVodPlayerCollectDataRequest, Builder> {
        private String appId; 
        private String endTime; 
        private String interval; 
        private String metrics; 
        private String os; 
        private String period; 
        private String startTime; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodPlayerCollectDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.metrics = request.metrics;
            this.os = request.os;
            this.period = request.period;
            this.startTime = request.startTime;
            this.terminalType = request.terminalType;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The end time of the query. Format: yyyy-mm-ddThh:mm:ssZ (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-05T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the queried data. Valid values: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>. The supported time granularity varies based on the time span specified by <code>StartTime</code> and <code>EndTime</code>:</p>
         * <ul>
         * <li>Within 3 days: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>.</li>
         * <li>4 to 7 days: <strong>1h</strong> and <strong>1d</strong>.</li>
         * <li>More than 7 days: <strong>1d</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The metric type. You can specify multiple metrics, up to three.</p>
         * <blockquote>
         * <ul>
         * <li>Percentage data is returned in decimal format.</li>
         * </ul>
         * </blockquote>
         * <p>Quality of Service (QoS) metrics for playback quality:</p>
         * <ul>
         * <li>Vv: Number of plays.</li>
         * <li>RealVv: Actual play volume.</li>
         * <li>FirstFrame: First frame time.</li>
         * <li>SecondPlayRate: 1-second startup rate.</li>
         * <li>SlowPlayRate: Slow startup rate.</li>
         * <li>StuckCountRate: Stuttering count rate.</li>
         * <li>SeekDuration: Seek duration.</li>
         * <li>StuckDuration100s: Stuttering duration per 100 seconds.</li>
         * <li>StuckCount100s: Stuttering count per 100 seconds.</li>
         * <li>PlayFailRate: Playback failure rate.</li>
         * <li>SeedFailRate: Unstarted playback rate.</li>
         * <li>AvgPlayBitrate: Average playback bitrate.</li>
         * <li>AvgStartBitrate: Average startup bitrate.</li>
         * <li>ErrorCount100s: Error count per 100 seconds.</li>
         * </ul>
         * <p>Quality of Experience (QoE) metrics for playback experience:</p>
         * <ul>
         * <li>Uv: Number of playback users.</li>
         * <li>AvgPerVv: Average number of plays per user.</li>
         * <li>AvgVideoDuration: Average video duration.</li>
         * <li>AvgPerPlayDuration: Average playback duration per user.</li>
         * <li>AvgPerCompletionVv: Average number of completed plays per user.</li>
         * <li>CompletionVv: Completed play volume.</li>
         * <li>CompletionRate: Completion rate.</li>
         * <li>AvgPlayDuration: Average playback duration.</li>
         * <li>JumpRate5s: 5-second bounce rate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Vv,Uv,AvgPerVv</p>
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The operating system of the playback terminal. You can specify this parameter to perform a filtered query for the playback data of a specific operating system. Valid values: <strong>Android</strong>, <strong>iOS</strong>, <strong>Harmony</strong>, <strong>Windows</strong>, <strong>macOS</strong>, and <strong>Linux</strong>.
         * The valid values vary based on the terminal type:</p>
         * <ul>
         * <li><strong>native</strong>: Android, iOS, and Harmony.</li>
         * <li><strong>web</strong>: Android, iOS, Harmony, Windows, macOS, and Linux.</li>
         * </ul>
         * <p>Separate multiple operating systems with #_#.</p>
         * 
         * <strong>example:</strong>
         * <p>Android、iOS、Windows</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The time range used to confirm the period-over-period analysis, in days (d).</p>
         * <p>For example, if you set the value to 1d (1 day), the period-over-period time range is from StartTime-1d to EndTime-1d.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>You can query historical playback data for the last year.</li>
         * <li>The time range for a single query cannot exceed 31 days.</li>
         * <li>The time range is a left-closed and right-open interval [StartTime, EndTime).</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The terminal type. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: Web client.</li>
         * <li><strong>mobile</strong>: Native client.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public DescribeVodPlayerCollectDataRequest build() {
            return new DescribeVodPlayerCollectDataRequest(this);
        } 

    } 

}
