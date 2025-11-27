// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DescribeJobMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMetricDataResponseBody</p>
 */
public class DescribeJobMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private String dataPoints;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeJobMetricDataResponseBody(Builder builder) {
        this.dataPoints = builder.dataPoints;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPoints
     */
    public String getDataPoints() {
        return this.dataPoints;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataPoints; 
        private Integer period; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeJobMetricDataResponseBody model) {
            this.dataPoints = model.dataPoints;
            this.period = model.period;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Monitoring statistics points.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;timestamp&quot;:1709540685000,&quot;Minimum&quot;:28.45,&quot;Maximum&quot;:28.45,&quot;Average&quot;:28.45}]</p>
         */
        public Builder dataPoints(String dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data. Valid values: 15, 60, 900, and 3600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobMetricDataResponseBody build() {
            return new DescribeJobMetricDataResponseBody(this);
        } 

    } 

}
