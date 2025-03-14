// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorDataResponseBody</p>
 */
public class DescribeMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private String datapoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMonitorDataResponseBody(Builder builder) {
        this.datapoints = builder.datapoints;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datapoints; 
        private String nextToken; 
        private String period; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMonitorDataResponseBody model) {
            this.datapoints = model.datapoints;
            this.nextToken = model.nextToken;
            this.period = model.period;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nOc1nj4M9UaAZ/I8db***</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The interval at which the monitoring data is queried. Valid values: 60, 300, and 900. Unit: seconds.</p>
         * <blockquote>
         * <p> If you set the MetricName request parameter to FLOW_USED, the value of Period is 3600 (one hour).</p>
         * </blockquote>
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
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMonitorDataResponseBody build() {
            return new DescribeMonitorDataResponseBody(this);
        } 

    } 

}
