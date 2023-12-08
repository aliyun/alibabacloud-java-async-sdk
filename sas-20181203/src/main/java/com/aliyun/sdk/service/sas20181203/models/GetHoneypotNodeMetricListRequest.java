// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotNodeMetricListRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotNodeMetricListRequest</p>
 */
public class GetHoneypotNodeMetricListRequest extends Request {
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
    private String metricName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private GetHoneypotNodeMetricListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.express = builder.express;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.nodeId = builder.nodeId;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotNodeMetricListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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

    public static final class Builder extends Request.Builder<GetHoneypotNodeMetricListRequest, Builder> {
        private String endTime; 
        private String express; 
        private String length; 
        private String metricName; 
        private String namespace; 
        private String nodeId; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotNodeMetricListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.express = request.express;
            this.length = request.length;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.nodeId = request.nodeId;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Valid values:
         * <p>
         * 
         * *   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC
         * *   Date format: YYYY-MM-DDThh:mm:ssZ
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
         * >  Only the groupby expression is supported. This expression is similar to the GROUP BY statement that applies to databases.
         */
        public Builder express(String express) {
            this.putQueryParameter("Express", express);
            this.express = express;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The metric that is used to monitor the cloud service.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the cloud service. Format: acs_cloud service name.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The management node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The time interval. Unit: seconds. Valid values: 60, 300, and 900.
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
         * *   UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC
         * *   Date format: YYYY-MM-DDThh:mm:ssZ
         * *   The interval between the start time and the end time is less than or equal to 31 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetHoneypotNodeMetricListRequest build() {
            return new GetHoneypotNodeMetricListRequest(this);
        } 

    } 

}
