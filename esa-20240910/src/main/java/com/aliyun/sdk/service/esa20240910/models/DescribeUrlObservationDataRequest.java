// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeUrlObservationDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUrlObservationDataRequest</p>
 */
public class DescribeUrlObservationDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPlatform")
    private String clientPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeUrlObservationDataRequest(Builder builder) {
        super(builder);
        this.clientPlatform = builder.clientPlatform;
        this.endTime = builder.endTime;
        this.metric = builder.metric;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUrlObservationDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientPlatform
     */
    public String getClientPlatform() {
        return this.clientPlatform;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DescribeUrlObservationDataRequest, Builder> {
        private String clientPlatform; 
        private String endTime; 
        private String metric; 
        private String siteId; 
        private String startTime; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUrlObservationDataRequest request) {
            super(request);
            this.clientPlatform = request.clientPlatform;
            this.endTime = request.endTime;
            this.metric = request.metric;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
            this.url = request.url;
        } 

        /**
         * <p>The device platform. If this parameter is left empty, data for all platforms is queried.</p>
         * <ul>
         * <li><p>PC</p>
         * </li>
         * <li><p>Mobile</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        public Builder clientPlatform(String clientPlatform) {
            this.putQueryParameter("ClientPlatform", clientPlatform);
            this.clientPlatform = clientPlatform;
            return this;
        }

        /**
         * <p>The end time for the data query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metric to query.</p>
         * <ul>
         * <li>TTFB: Measures the time from when a resource request is initiated to when the first byte of the response begins to arrive.</li>
         * <li>FCP: Measures the time from when the page starts loading to when any part of the page content is rendered on the screen.</li>
         * <li>LCP: Reports the render time of the largest image or text block visible within the viewport.</li>
         * <li>CLS: A metric that measures the largest burst of layout shift scores for every unexpected layout shift that occurs throughout the entire lifecycle of a page.</li>
         * <li>INP: Measures the responsiveness of a page, specifically how long it takes for the page to visibly respond to user input.</li>
         * <li>FID: Measures the time from when a user first interacts with a page to when the browser is actually able to begin processing event handlers in response to that interaction.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TTFB</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start time for the data query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The URL of the web page to monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/test</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DescribeUrlObservationDataRequest build() {
            return new DescribeUrlObservationDataRequest(this);
        } 

    } 

}
