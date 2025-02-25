// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricTopRequest</p>
 */
public class DescribeMetricTopRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OrderDesc")
    private String orderDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Orderby")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderby;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeMetricTopRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.express = builder.express;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.orderDesc = builder.orderDesc;
        this.orderby = builder.orderby;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricTopRequest create() {
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
     * @return orderDesc
     */
    public String getOrderDesc() {
        return this.orderDesc;
    }

    /**
     * @return orderby
     */
    public String getOrderby() {
        return this.orderby;
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

    public static final class Builder extends Request.Builder<DescribeMetricTopRequest, Builder> {
        private String dimensions; 
        private String endTime; 
        private String express; 
        private String length; 
        private String metricName; 
        private String namespace; 
        private String orderDesc; 
        private String orderby; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricTopRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.express = request.express;
            this.length = request.length;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.orderDesc = request.orderDesc;
            this.orderby = request.orderby;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The monitoring dimensions of the specified resource.</p>
         * <p>Set the value to a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> or <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
         * <blockquote>
         * <p> You can query a maximum of 50 instances in each request.</p>
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
         * <p>The end of the time range to query monitoring data.</p>
         * <ul>
         * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
         * </li>
         * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
         * <ul>
         * <li>If you set the <code>Period</code> parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</li>
         * <li>If you set the <code>Period</code> parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</li>
         * <li>If you set the <code>Period</code> parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The following formats are supported:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
         * <li>Time format: YYYY-MM-DDThh:mm:ssZ</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08 10:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The expression that is used to compute the query results in real time.</p>
         * <blockquote>
         * <p> Only the <code>groupby</code> expression is supported. This expression is similar to the GROUP BY statement used in databases.</p>
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
         * <p>The number of entries per page.</p>
         * <p>Default value: 10.</p>
         * <blockquote>
         * <p> The maximum value of the Length parameter in a request is 1440.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The metric that is used to monitor the cloud service.</p>
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
         * <p>The namespace of the cloud service.</p>
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
         * <p>The order in which data is sorted. Valid values:</p>
         * <ul>
         * <li>True: sorts data in ascending order.</li>
         * <li>False (default): sorts data in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder orderDesc(String orderDesc) {
            this.putQueryParameter("OrderDesc", orderDesc);
            this.orderDesc = orderDesc;
            return this;
        }

        /**
         * <p>The field based on which data is sorted. Valid values:</p>
         * <ul>
         * <li>Average</li>
         * <li>Minimum</li>
         * <li>Maximum</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        public Builder orderby(String orderby) {
            this.putQueryParameter("Orderby", orderby);
            this.orderby = orderby;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data.</p>
         * <p>Valid values: 15, 60, 900, and 3600.</p>
         * <p>Unit: seconds.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported.</p>
         * </li>
         * <li><p>Statistical periods vary based on the metrics that are specified by <code>MetricName</code>. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * </li>
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
         * <p>The start of the time range to query monitoring data.</p>
         * <ul>
         * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are not specified, the monitoring data of the last statistical period is queried.``</p>
         * </li>
         * <li><p>If the <code>StartTime</code> and <code>EndTime</code> parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.````</p>
         * <ul>
         * <li>If you set the <code>Period</code> parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.</li>
         * <li>If you set the <code>Period</code> parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.</li>
         * <li>If you set the <code>Period</code> parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The following formats are supported:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970</li>
         * <li>Time format: YYYY-MM-DDThh:mm:ssZ</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You must set the <code>StartTime</code> parameter to a point in time that is later than 00:00:00 Thursday, January 1, 1970. Otherwise, this parameter is invalid.</p>
         * </li>
         * <li><p>We recommend that you use UNIX timestamps to prevent time zone-related issues.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08 08:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricTopRequest build() {
            return new DescribeMetricTopRequest(this);
        } 

    } 

}
