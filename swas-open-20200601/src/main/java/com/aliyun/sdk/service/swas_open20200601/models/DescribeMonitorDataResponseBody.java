// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorDataResponseBody</p>
 */
public class DescribeMonitorDataResponseBody extends TeaModel {
    @NameInMap("Datapoints")
    private String datapoints;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Period")
    private String period;

    @NameInMap("RequestId")
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

        /**
         * Datapoints.
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * RequestId.
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
