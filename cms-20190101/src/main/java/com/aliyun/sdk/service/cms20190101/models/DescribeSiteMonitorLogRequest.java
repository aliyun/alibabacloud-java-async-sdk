// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorLogRequest</p>
 */
public class DescribeSiteMonitorLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Browser")
    private String browser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInfo")
    private String browserInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Device")
    private String device;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIds;

    private DescribeSiteMonitorLogRequest(Builder builder) {
        super(builder);
        this.browser = builder.browser;
        this.browserInfo = builder.browserInfo;
        this.city = builder.city;
        this.device = builder.device;
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.isp = builder.isp;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browser
     */
    public String getBrowser() {
        return this.browser;
    }

    /**
     * @return browserInfo
     */
    public String getBrowserInfo() {
        return this.browserInfo;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorLogRequest, Builder> {
        private String browser; 
        private String browserInfo; 
        private String city; 
        private String device; 
        private String endTime; 
        private String filter; 
        private String isp; 
        private Integer length; 
        private String metricName; 
        private String nextToken; 
        private String startTime; 
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorLogRequest request) {
            super(request);
            this.browser = request.browser;
            this.browserInfo = request.browserInfo;
            this.city = request.city;
            this.device = request.device;
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.isp = request.isp;
            this.length = request.length;
            this.metricName = request.metricName;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
            this.taskIds = request.taskIds;
        } 

        /**
         * Browser.
         */
        public Builder browser(String browser) {
            this.putQueryParameter("Browser", browser);
            this.browser = browser;
            return this;
        }

        /**
         * BrowserInfo.
         */
        public Builder browserInfo(String browserInfo) {
            this.putQueryParameter("BrowserInfo", browserInfo);
            this.browserInfo = browserInfo;
            return this;
        }

        /**
         * The city identification code.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Device.
         */
        public Builder device(String device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * The end of the time range to query. Valid values:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         * 
         * >  We recommend that you use UNIX timestamps to prevent time zone-related issues.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The filter condition.
         * <p>
         * 
         * You can specify a simple expression, for example, `TotalTime>100`. In this case, the operation returns only the data for instant test tasks whose total response time exceeds 100 milliseconds.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The carrier identification code.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 1440.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * The name of the metric.
         * <p>
         * 
         * Only the `ProbeLog` metric is supported.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The token that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.``
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The start of the time range to query. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         * 
         * > 
         * 
         * *   The specified time range includes the end time and excludes the start time. The start time must be earlier than the end time.\
         *     We recommend that you use UNIX timestamps to prevent time zone-related issues.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The IDs of the instant test tasks. Separate multiple task IDs with commas (,).
         */
        public Builder taskIds(String taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DescribeSiteMonitorLogRequest build() {
            return new DescribeSiteMonitorLogRequest(this);
        } 

    } 

}
