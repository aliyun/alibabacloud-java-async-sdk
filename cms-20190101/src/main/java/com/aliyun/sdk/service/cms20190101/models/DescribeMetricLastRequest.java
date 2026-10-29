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
 * {@link DescribeMetricLastRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricLastRequest</p>
 */
public class DescribeMetricLastRequest extends Request {
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

    private DescribeMetricLastRequest(Builder builder) {
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

    public static DescribeMetricLastRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMetricLastRequest, Builder> {
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

        private Builder(DescribeMetricLastRequest request) {
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
         * <p>The monitoring dimensions of the specified resource.</p>
         * <p>Format: a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> or <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
         * <blockquote>
         * <p>A maximum of 50 instances can be queried in a single request.</p>
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
         * <p>The end time for querying the metric.</p>
         * <p>The system automatically limits the query start time (query window size) based on data granularity:</p>
         * <ol>
         * <li>Second-level data: The maximum query span is 20 minutes (start time = Max(startTime, EndTime - 20min)).</li>
         * <li>Minute-level data: The maximum query span is 2 hours (start time = Max(startTime, EndTime - 2h)).</li>
         * <li>Hour-level data: The maximum query span is 2 days (start time = Max(startTime, EndTime - 2d)).</li>
         * </ol>
         * <blockquote>
         * <p>If the specified startTime is earlier than the limit, the system automatically uses the limit as the actual query start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-01-31 10:10:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The expression for real-time computation on existing query results.</p>
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
         * <p>The number of entries per page for monitoring data. This parameter is used for paged query.</p>
         * <p>Default value: 1000, which indicates 1000 entries of monitoring data per page.</p>
         * <blockquote>
         * <p>The maximum value of Length in a single request is 1440.</p>
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
         * <p>The metric name of the cloud service.</p>
         * <p>For information about metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>For information about namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
         * <ul>
         * <li>If the query results that match the filter conditions exceed the page size, a pagination cursor is returned.</li>
         * <li>To retrieve the next page of data, use the returned cursor value as the request parameter until no cursor value is returned, which indicates that all data has been retrieved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15761432850009dd70bb64cff1f0fff6c0b08ffff073be5fb1e785e2b020f7fed9b5e137bd810a6d6cff5ae****</p>
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
         * <li>If you do not set the statistical period, monitoring data is queried based on the reporting period that was specified when the metric was registered.<ul>
         * <li>The statistical period varies by metric (<code>MetricName</code>) for each cloud service. For more information, see the <code>Min Periods</code> column on the metric list page of the target cloud service in <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
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
         * <p>The start time.</p>
         * <p>Two formats are supported: 1. A UNIX timestamp string in milliseconds (ms), which represents the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC. 2. A time string in the ISO 8601 format of YYYY-MM-DDThh:mm:ssZ in UTC.</p>
         * <blockquote>
         * <p>The query range uses a left-exclusive and right-inclusive mode. StartTime cannot be equal to or greater than EndTime, and the interval between them must be less than or equal to 31 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-01-31 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricLastRequest build() {
            return new DescribeMetricLastRequest(this);
        } 

    } 

}
