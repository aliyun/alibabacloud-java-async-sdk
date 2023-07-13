// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricTopRequest</p>
 */
public class DescribeMetricTopRequest extends Request {
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
    @NameInMap("OrderDesc")
    private String orderDesc;

    @Query
    @NameInMap("Orderby")
    @Validation(required = true)
    private String orderby;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("StartTime")
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
         * The error message.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The statistical period of the monitoring data. Unit: seconds. Valid values: 15, 60, 900, and 3600.
         */
        public Builder express(String express) {
            this.putQueryParameter("Express", express);
            this.express = express;
            return this;
        }

        /**
         * The start of the time range to query monitoring data.
         * <p>
         * 
         * *   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``
         * 
         * *   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.```` The following examples demonstrate how to determine the period in which monitoring data is queried:
         * 
         *     *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.
         *     *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.
         *     *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.
         * 
         * The following formats are supported:
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         * 
         * > 
         * 
         * *   You must set the `StartTime` parameter to a point in time that is later than 00:00:00 Thursday, January 1, 1970. Otherwise, this parameter is invalid.
         * *   We recommend that you use UNIX timestamps to prevent time zone-related issues.
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeMetricTop**.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The statistical period of the monitoring data.
         * <p>
         * 
         * Valid values: 15, 60, 900, and 3600.
         * 
         * Unit: seconds.
         * 
         * > 
         * 
         * *   If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported.
         * *   Statistical periods vary based on metrics that are specified by `MetricName`. For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder orderDesc(String orderDesc) {
            this.putQueryParameter("OrderDesc", orderDesc);
            this.orderDesc = orderDesc;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10.
         * 
         * >  The maximum value of the Length parameter in a request is 1440.
         */
        public Builder orderby(String orderby) {
            this.putQueryParameter("Orderby", orderby);
            this.orderby = orderby;
            return this;
        }

        /**
         * The field based on which data is sorted. Valid values:
         * <p>
         * 
         * *   Average: the average value
         * *   Minimum: the minimum value
         * *   Maximum: the maximum value
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The end of the time range to query monitoring data.
         * <p>
         * 
         * *   If the `StartTime` and `EndTime` parameters are not specified, the monitoring data of the last statistical period is queried.``
         * 
         * *   If the `StartTime` and `EndTime` parameters are specified, the monitoring data of the last statistical period in the specified time range is queried.```` The following examples demonstrate how to determine the period in which monitoring data is queried:
         * 
         *     *   If you set the `Period` parameter to 15, the specified time range must be less than or equal to 20 minutes. For example, if you set the StartTime parameter to 2021-05-08 08:10:00 and the EndTime parameter to 2021-05-08 08:30:00, the monitoring data of the last 15 seconds in the time range is queried.
         *     *   If you set the `Period` parameter to 60 or 900, the specified time range must be less than or equal to 2 hours. For example, if you set the Period parameter to 60, the StartTime parameter to 2021-05-08 08:00:00, and the EndTime parameter to 2021-05-08 10:00:00, the monitoring data of the last 60 seconds in the time range is queried.
         *     *   If you set the `Period` parameter to 3600, the specified time range must be less than or equal to two days. For example, if you set the StartTime parameter to 2021-05-08 08:00:00 and the EndTime parameter to 2021-05-10 08:00:00, the monitoring data of the last 3,600 seconds in the time range is queried.
         * 
         * The following formats are supported:
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970
         * *   UTC time: the UTC time that follows the YYYY-MM-DDThh:mm:ssZ format
         * 
         * >  We recommend that you use UNIX timestamps to prevent time zone-related issues.
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
