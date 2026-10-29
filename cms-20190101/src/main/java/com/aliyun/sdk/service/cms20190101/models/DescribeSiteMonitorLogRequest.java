// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
         * <p>The type of the browser.</p>
         * 
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        public Builder browser(String browser) {
            this.putQueryParameter("Browser", browser);
            this.browser = browser;
            return this;
        }

        /**
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder browserInfo(String browserInfo) {
            this.putQueryParameter("BrowserInfo", browserInfo);
            this.browserInfo = browserInfo;
            return this;
        }

        /**
         * <p>The city ID.</p>
         * 
         * <strong>example:</strong>
         * <p>546</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>The type of the device. This parameter specifies the screen size for impersonation.</p>
         * 
         * <strong>example:</strong>
         * <p>laptop</p>
         */
        public Builder device(String device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * <p>The end of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</p>
         * </li>
         * <li><p>UTC format: YYYY-MM-DDThh:mm:ssZ.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Use UNIX timestamps to prevent time zone-related issues.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1638422475687</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter expression for detection results.</p>
         * <p>Simple expressions are supported. For example, you can use the <code>TotalTime&gt;100</code> expression to query the detection data whose total response time exceeds 100 milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>TotalTime&gt;100</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The carrier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 1440.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The metric.</p>
         * <p>Only the <code>ProbeLog</code> metric is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ProbeLog</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>If the response is truncated, use the <code>NextToken</code> parameter to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</p>
         * </li>
         * <li><p>UTC format: YYYY-MM-DDThh:mm:ssZ.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The start time and end time follow the (StartTime, EndTime] pattern. The value of StartTime cannot be the same as or later than the value of EndTime.<br> - Use UNIX timestamps to prevent time zone-related issues.<br></li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1638422474389</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the detection task. You can specify multiple task IDs. Separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>afa5c3ce-f944-4363-9edb-ce919a29****</p>
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
