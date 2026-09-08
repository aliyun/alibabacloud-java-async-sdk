// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetMetricsRequest</p>
 */
public class GetMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

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
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetMetricsRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.startTime = builder.startTime;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricsRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetMetricsRequest, Builder> {
        private String dimensions; 
        private String endTime; 
        private String jobId; 
        private String length; 
        private String metricName; 
        private String namespace; 
        private String nextToken; 
        private String period; 
        private String startTime; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetMetricsRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.jobId = request.jobId;
            this.length = request.length;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.startTime = request.startTime;
            this.token = request.token;
        } 

        /**
         * <p>(Required) Request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;jobId\&quot;:\&quot;dlcdpfpc96mh63mg\&quot;,\&quot;pod\&quot;:\&quot;dlcdpfpc96mh63mg-worker-748\&quot;,\&quot;regionId\&quot;:\&quot;cn-wulanchabu\&quot;,\&quot;userId\&quot;:\&quot;1458867964644701\&quot;}]</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end time of the query. Default value: current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlckjd5hm84tmjec</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The number of records per query for paged queries. Default value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>Metric name. Not filled. Not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>JOB_MEMORY_FREE</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace for cloud service monitoring data. For more information about namespaces, see cloud service monitoring metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_pai_dlc</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The pagination cursor token. If you do not set this parameter, the first page of data is returned. When a NextToken value is returned, more data is available. Use the returned NextToken as a parameter in your next request to retrieve the next page. Repeat until NextToken returns null, which means all data has been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>2c6b65b6f9d625d4716568ca19b2064be0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistical period for monitoring data. Unit: seconds. Valid values: 15, 60, 900, and 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start time of the monitoring data query interval (UTC). Default value: one hour ago.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>A temporary token used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>eyXXXX-XXXX.XXXXX</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetMetricsRequest build() {
            return new GetMetricsRequest(this);
        } 

    } 

}
