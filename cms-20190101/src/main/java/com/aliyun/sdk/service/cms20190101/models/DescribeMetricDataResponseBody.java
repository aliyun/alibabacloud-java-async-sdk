// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricDataResponseBody</p>
 */
public class DescribeMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private String datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMetricDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String datapoints; 
        private String message; 
        private String period; 
        private String requestId; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The monitoring data. The value includes the following fields:</p>
         * <ul>
         * <li><code>timestamp</code>: the time when the alert was triggered.</li>
         * <li><code>userId</code>: the ID of the user for which the alert was triggered.</li>
         * <li><code>instanceId</code>: the ID of the instance for which the alert was triggered.</li>
         * <li><code>Minimum</code>, <code>Average</code>, and <code>Maximum</code>: the aggregation methods.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;timestamp&quot;:1618368900000,&quot;Average&quot;:95.8291666666667,&quot;Minimum&quot;:65.48,&quot;Maximum&quot;:100.0},{&quot;timestamp&quot;:1618368960000,&quot;Average&quot;:95.8683333333333,&quot;Minimum&quot;:67.84,&quot;Maximum&quot;:100.0}]</p>
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data.</p>
         * <p>Valid values: 15, 60, 900, and 3600.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A5F022D-AC7C-460E-94AE-B9E75083D027</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetricDataResponseBody build() {
            return new DescribeMetricDataResponseBody(this);
        } 

    } 

}
