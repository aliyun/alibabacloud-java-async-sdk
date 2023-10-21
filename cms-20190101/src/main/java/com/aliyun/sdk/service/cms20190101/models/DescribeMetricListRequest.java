// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
    @Query
    @NameInMap("Dimensions")
    private String dimensions;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Express")
    private String express;

    @Query
    @NameInMap("Length")
    private String length;

    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("StartTime")
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
         * The dimensions that specify the resources whose monitoring data you want to query.
         * <p>
         * 
         * Set the value to a collection of key-value pairs. A typical key-value pair is `instanceId:i-2ze2d6j5uhg20x47****`.
         * 
         * >  You can query a maximum of 50 instances in a single request.
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The end of the time range to query. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The expression that is used to compute the query results in real time.
         * <p>
         * 
         * >  Only the groupby expression is supported. This expression is similar to the GROUP BY statement that is used in databases.
         */
        public Builder express(String express) {
            this.putQueryParameter("Express", express);
            this.express = express;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * >  The maximum value of the Length parameter in a request is 1440.
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * The name of the metric.
         * <p>
         * 
         * For more information about metric names, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the cloud service. Format: acs_service name.
         * <p>
         * 
         * For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The paging token.
         * <p>
         * 
         * >  If this parameter is not specified, the data on the first page is returned. A return value other than Null of this parameter indicates that not all entries have been returned. You can use this value as an input parameter to obtain entries on the next page. The value Null indicates that all query results have been returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The interval at which the monitoring data is queried.
         * <p>
         * 
         * Valid values: 60, 300, and 900.
         * 
         * Unit: seconds.
         * 
         * >  Configure this parameter based on your business scenario.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The beginning of the time range to query. The following formats are supported:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         * 
         * >  The specified period includes the end time and excludes the start time. The start time must be earlier than the end time.
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
