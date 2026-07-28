// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetNisTrafficMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetNisTrafficMetricsResponseBody</p>
 */
public class GetNisTrafficMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("MetricStatics")
    private java.util.List<MetricStatics> metricStatics;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private GetNisTrafficMetricsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.metricStatics = builder.metricStatics;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisTrafficMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metricStatics
     */
    public java.util.List<MetricStatics> getMetricStatics() {
        return this.metricStatics;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<MetricStatics> metricStatics; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private String unit; 

        private Builder() {
        } 

        private Builder(GetNisTrafficMetricsResponseBody model) {
            this.maxResults = model.maxResults;
            this.metricStatics = model.metricStatics;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.unit = model.unit;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MetricStatics.
         */
        public Builder metricStatics(java.util.List<MetricStatics> metricStatics) {
            this.metricStatics = metricStatics;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public GetNisTrafficMetricsResponseBody build() {
            return new GetNisTrafficMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNisTrafficMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNisTrafficMetricsResponseBody</p>
     */
    public static class MetricStatics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private MetricStatics(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricStatics create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timeStamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(MetricStatics model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public MetricStatics build() {
                return new MetricStatics(this);
            } 

        } 

    }
}
