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
 * {@link GetNisTrafficMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetNisTrafficMetricsRequest</p>
 */
public class GetNisTrafficMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanBy")
    private String scanBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StepMinutes")
    private Integer stepMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageInterval")
    private Integer storageInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficAnalyzerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficAnalyzerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficScenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficScenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TupleDimension")
    private String tupleDimension;

    private GetNisTrafficMetricsRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.metricName = builder.metricName;
        this.nextToken = builder.nextToken;
        this.regionNo = builder.regionNo;
        this.scanBy = builder.scanBy;
        this.stepMinutes = builder.stepMinutes;
        this.storageInterval = builder.storageInterval;
        this.trafficAnalyzerId = builder.trafficAnalyzerId;
        this.trafficScenario = builder.trafficScenario;
        this.tupleDimension = builder.tupleDimension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisTrafficMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return scanBy
     */
    public String getScanBy() {
        return this.scanBy;
    }

    /**
     * @return stepMinutes
     */
    public Integer getStepMinutes() {
        return this.stepMinutes;
    }

    /**
     * @return storageInterval
     */
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    /**
     * @return trafficAnalyzerId
     */
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    /**
     * @return trafficScenario
     */
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    /**
     * @return tupleDimension
     */
    public String getTupleDimension() {
        return this.tupleDimension;
    }

    public static final class Builder extends Request.Builder<GetNisTrafficMetricsRequest, Builder> {
        private Long beginTime; 
        private String direction; 
        private Long endTime; 
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private String metricName; 
        private String nextToken; 
        private String regionNo; 
        private String scanBy; 
        private Integer stepMinutes; 
        private Integer storageInterval; 
        private String trafficAnalyzerId; 
        private String trafficScenario; 
        private String tupleDimension; 

        private Builder() {
            super();
        } 

        private Builder(GetNisTrafficMetricsRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.metricName = request.metricName;
            this.nextToken = request.nextToken;
            this.regionNo = request.regionNo;
            this.scanBy = request.scanBy;
            this.stepMinutes = request.stepMinutes;
            this.storageInterval = request.storageInterval;
            this.trafficAnalyzerId = request.trafficAnalyzerId;
            this.trafficScenario = request.trafficScenario;
            this.tupleDimension = request.tupleDimension;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1638239092000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>In</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684373700099</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(java.util.List<Filter> filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bps</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ScanBy.
         */
        public Builder scanBy(String scanBy) {
            this.putQueryParameter("ScanBy", scanBy);
            this.scanBy = scanBy;
            return this;
        }

        /**
         * StepMinutes.
         */
        public Builder stepMinutes(Integer stepMinutes) {
            this.putQueryParameter("StepMinutes", stepMinutes);
            this.stepMinutes = stepMinutes;
            return this;
        }

        /**
         * StorageInterval.
         */
        public Builder storageInterval(Integer storageInterval) {
            this.putQueryParameter("StorageInterval", storageInterval);
            this.storageInterval = storageInterval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nta-e093cb80c7c047afbd1d</p>
         */
        public Builder trafficAnalyzerId(String trafficAnalyzerId) {
            this.putQueryParameter("TrafficAnalyzerId", trafficAnalyzerId);
            this.trafficAnalyzerId = trafficAnalyzerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VpcFlowLogAll</p>
         */
        public Builder trafficScenario(String trafficScenario) {
            this.putQueryParameter("TrafficScenario", trafficScenario);
            this.trafficScenario = trafficScenario;
            return this;
        }

        /**
         * TupleDimension.
         */
        public Builder tupleDimension(String tupleDimension) {
            this.putQueryParameter("TupleDimension", tupleDimension);
            this.tupleDimension = tupleDimension;
            return this;
        }

        @Override
        public GetNisTrafficMetricsRequest build() {
            return new GetNisTrafficMetricsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetNisTrafficMetricsRequest} extends {@link TeaModel}
     *
     * <p>GetNisTrafficMetricsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
