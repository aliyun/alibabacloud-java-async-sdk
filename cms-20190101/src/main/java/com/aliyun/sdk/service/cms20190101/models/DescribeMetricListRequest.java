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
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Express")
    private String express;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Length")
    private String length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeMetricListRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.express = builder.express;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return express
     */
    public String getExpress() {
        return this.express;
    }

    /**
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder extends Request.Builder<DescribeMetricListRequest, Builder> {
        private String dimensions; 
        private String endTime; 
        private String express; 
        private String length; 
        private String metricName; 
        private String namespace; 
        private String nextToken; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricListRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.express = request.express;
            this.length = request.length;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The dimensions that specify the resources to be monitored.</p>
         * <p>Format: a collection of key-value pairs, such as <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
         * <blockquote>
         * <p>A single request can be used to query a maximum of 50 instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}]</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * </li>
         * <li><p>Format: YYYY-MM-DD hh:mm:ss.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The interval between \<code>StartTime\\</code> and \<code>EndTime\\</code> must be less than or equal to 31 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-01-30 00:10:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The expression that is used for real-time computing based on the query results.</p>
         * <blockquote>
         * <p>Only the groupby expression is supported. This expression is similar to the GROUP BY statement in databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
         */
        public Builder express(String express) {
            this.putQueryParameter("Express", express);
            this.express = express;
            return this;
        }

        /**
         * <p>The number of entries to return on each page for a paged query.</p>
         * <blockquote>
         * <p>The maximum value of \<code>Length\\</code> in a single request is 1440.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The name of the metric.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_idle</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The pagination cursor.</p>
         * <blockquote>
         * <p>If you do not set this parameter, the first page of data is returned. If a value is returned for this parameter, it indicates that more data is available. To retrieve the next page, use the returned value as the \<code>NextToken\\</code> in your next request. A null value indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15761485350009dd70bb64cff1f0fff750b08ffff073be5fb1e785e2b020f1a949d5ea14aea7fed82f01dd8****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data.</p>
         * <p>Valid values: 15, 60, 900, and 3600.</p>
         * <p>Unit: seconds.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not set this parameter, the reporting period that was specified when the metric was registered is used.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The statistical period of each metric (<code>MetricName</code>) of a cloud service is different. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * </li>
         * <li><p>Format: YYYY-MM-DD hh:mm:ss.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The time range is a left-open and right-closed interval. The value of \<code>StartTime\\</code> must be earlier than the value of \<code>EndTime\\</code>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The interval between \<code>StartTime\\</code> and \<code>EndTime\\</code> must be less than or equal to 31 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2019-01-30 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricListRequest build() {
            return new DescribeMetricListRequest(this);
        } 

    } 

}
