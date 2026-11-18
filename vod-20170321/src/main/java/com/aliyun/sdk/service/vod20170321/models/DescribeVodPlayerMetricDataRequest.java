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
 * {@link DescribeVodPlayerMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodPlayerMetricDataRequest</p>
 */
public class DescribeVodPlayerMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Top")
    private Long top;

    private DescribeVodPlayerMetricDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.interval = builder.interval;
        this.language = builder.language;
        this.metrics = builder.metrics;
        this.os = builder.os;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.terminalType = builder.terminalType;
        this.top = builder.top;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerMetricDataRequest create() {
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
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return top
     */
    public Long getTop() {
        return this.top;
    }

    public static final class Builder extends Request.Builder<DescribeVodPlayerMetricDataRequest, Builder> {
        private String appId; 
        private String endTime; 
        private String filters; 
        private String interval; 
        private String language; 
        private String metrics; 
        private String os; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startTime; 
        private String terminalType; 
        private Long top; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodPlayerMetricDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.interval = request.interval;
            this.language = request.language;
            this.metrics = request.metrics;
            this.os = request.os;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.terminalType = request.terminalType;
            this.top = request.top;
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
         * <p>The metric dimension filter. A dimension consists of a dimension type (Field), an operator (Op), and a dimension value.</p>
         * <blockquote>
         * <ul>
         * <li>You can specify up to three dimensions.</li>
         * <li>If the Metrics parameter includes any of the following four metrics, the Filters parameter does not take effect: Uv (number of playback users), AvgPerVv (average number of playbacks per user), AvgPerPlayDuration (average playback duration per user), and AvgPerCompletionVv (average number of completions per user).</li>
         * <li>Use regionCode to specify provinces and countries.</li>
         * <li>Separate multiple values with #_#.</li>
         * </ul>
         * </blockquote>
         * <p>Valid values for the dimension type (Field):</p>
         * <ul>
         * <li>SdkVersion: the SDK version.</li>
         * <li>AppVersion: the app version.</li>
         * <li>Codec: the codec.</li>
         * <li>VideoType: the video format.</li>
         * <li>Network: the network type.</li>
         * <li>Country: the country.</li>
         * <li>Isp: the ISP.</li>
         * <li>VideoDefinition: the resolution.</li>
         * <li>Domain: the domain name.</li>
         * <li>Province: the province.</li>
         * <li>IsHw: whether hardware decoding is used.</li>
         * <li>ErrorCode: the error code.</li>
         * </ul>
         * <p>Valid values for the operator (Op): = (equal to), &gt; (greater than), &lt; (less than), and != (not equal to).</p>
         * <blockquote>
         * <ul>
         * <li>Operator availability: The SdkVersion and VideoDefinition metrics support all four operators. Other metrics support only = (equal to) and != (not equal to).</li>
         * </ul>
         * </blockquote>
         * <p>To obtain dimension values, call the DescribeVodPlayerDimensionData operation.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;Field&quot;: &quot;codec&quot;,
         *     &quot;Op&quot;: &quot;=&quot;,
         *     &quot;Value&quot;: &quot;h265#<em>#h264&quot;
         *   },
         *   {
         *     &quot;Field&quot;: &quot;os&quot;,
         *     &quot;Op&quot;: &quot;=&quot;,
         *     &quot;Value&quot;: &quot;Android#</em>#iOS&quot;
         *   }
         * ]</p>
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (<strong>default</strong>): Simplified Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The metric types. You can select multiple metrics, up to a maximum of three.</p>
         * <blockquote>
         * <ul>
         * <li>Percentage data is returned in decimal format.</li>
         * </ul>
         * </blockquote>
         * <p>Quality of Service (QoS) metrics for playback:</p>
         * <ul>
         * <li>Vv: the number of playbacks.</li>
         * <li>RealVv: the actual playback volume.</li>
         * <li>FirstFrame: the first frame loading time.</li>
         * <li>SecondPlayRate: the 1-second startup rate.</li>
         * <li>SlowPlayRate: the slow startup rate.</li>
         * <li>StuckCountRate: the stuttering rate by count.</li>
         * <li>SeekDuration: the seek duration.</li>
         * <li>StuckDuration100s: the stuttering duration per 100 seconds.</li>
         * <li>StuckCount100s: the number of stuttering events per 100 seconds.</li>
         * <li>PlayFailRate: the playback failure rate.</li>
         * <li>SeedFailRate: the non-startup rate.</li>
         * <li>AvgPlayBitrate: the average playback bitrate.</li>
         * <li>AvgStartBitrate: the average startup bitrate.</li>
         * <li>ErrorCount100s: the number of errors per 100 seconds.</li>
         * </ul>
         * <p>Quality of Experience (QoE) metrics for playback:</p>
         * <ul>
         * <li>Uv: the number of playback users.</li>
         * <li>AvgPerVv: the average number of playbacks per user.</li>
         * <li>AvgVideoDuration: the average video duration.</li>
         * <li>AvgPerPlayDuration: the average playback duration per user.</li>
         * <li>AvgPerCompletionVv: the average number of completions per user.</li>
         * <li>CompletionVv: the completion volume.</li>
         * <li>CompletionRate: the completion rate.</li>
         * <li>AvgPlayDuration: the average playback duration.</li>
         * <li>JumpRate5s: the 5-second bounce rate.</li>
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
         * <p>The operating system of the playback client. You can specify this parameter to perform a filtered query for playback data of a specific operating system. Valid values: <strong>Android</strong>, <strong>iOS</strong>, <strong>Harmony</strong>, <strong>Windows</strong>, <strong>macOS</strong>, and <strong>Linux</strong>.
         * The available values vary based on the terminal type:</p>
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>5000</strong>. Maximum value: <strong>5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>You can query playback data history for up to one year.</li>
         * <li>The time range for a single query cannot exceed 31 days.</li>
         * <li>The time interval is left-closed and right-open [StartTime, EndTime).</li>
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
         * <li><strong>web</strong>: the web client.</li>
         * <li><strong>mobile</strong>: the native client.</li>
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

        /**
         * <p>The number of top data entries by playback volume to return. If you do not specify this parameter, all dimension data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder top(Long top) {
            this.putQueryParameter("Top", top);
            this.top = top;
            return this;
        }

        @Override
        public DescribeVodPlayerMetricDataRequest build() {
            return new DescribeVodPlayerMetricDataRequest(this);
        } 

    } 

}
