// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
         * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
         * <p>Set the value to a collection of key-value pairs. A typical key-value pair is <code>instanceId:i-2ze2d6j5uhg20x47****</code>.</p>
         * <blockquote>
         * <p> You can query a maximum of 50 instances in a single request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}]</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
         * <li>UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</li>
         * </ul>
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
         * <p>The expression that is used to compute the query results in real time.</p>
         * <blockquote>
         * <p> Only the groupby expression is supported. This expression is similar to the GROUP BY statement that is used in databases.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <blockquote>
         * <p> The maximum value of the Length parameter in a request is 1440.</p>
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
         * <p>For more information about metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The namespace of the cloud service. Format: acs_service name.</p>
         * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The paging token.</p>
         * <blockquote>
         * <p> If this parameter is not specified, the data on the first page is returned. A return value other than Null of this parameter indicates that not all entries have been returned. You can use this value as an input parameter to obtain entries on the next page. The value Null indicates that all query results have been returned.</p>
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
         * <p>The interval at which the monitoring data is queried.</p>
         * <p>Valid values: 60, 300, and 900.</p>
         * <p>Unit: seconds.</p>
         * <blockquote>
         * <p> Configure this parameter based on your business scenario.</p>
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
         * <p>The beginning of the time range to query. The following formats are supported:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
         * <li>UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format</li>
         * </ul>
         * <blockquote>
         * <p> The specified period includes the end time and excludes the start time. The start time must be earlier than the end time.</p>
         * </blockquote>
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
