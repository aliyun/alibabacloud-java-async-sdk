// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetHoneypotNodeMetricListRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotNodeMetricListRequest</p>
 */
public class GetHoneypotNodeMetricListRequest extends Request {
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
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The end time. Supported formats:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
         * <li>Formatted time: YYYY-MM-DDThh:mm:ssZ.</li>
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
         * <p>The expression used to perform real-time calculations on the query results.</p>
         * <blockquote>
         * <p>Currently, only groupby (similar to the GROUP BY clause in databases) is supported.</p>
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
         * <p>The number of records to return on each page for paging in a paged query.</p>
         * <blockquote>
         * <p>The maximum value of Length for a single request is 1440.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The name of the monitoring metric for the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The data namespace of the cloud service. Naming convention: acs_ServiceName.</p>
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
         * <p>The ID of the management node.</p>
         * <p>This parameter is required. If you do not specify this parameter, the API returns an IllegalParam error (HTTP 400).</p>
         * 
         * <strong>example:</strong>
         * <p>cc427e14-f257-4670-9d2b-d83bbbe7****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The time interval. Unit: seconds. Valid values: 60, 300, and 900.</p>
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
         * <p>The start time. Supported formats:</p>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
         * <li>Formatted time: YYYY-MM-DDThh:mm:ssZ.</li>
         * <li>The interval between StartTime and EndTime must be less than or equal to 31 days.</li>
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
        public GetHoneypotNodeMetricListRequest build() {
            return new GetHoneypotNodeMetricListRequest(this);
        } 

    } 

}
