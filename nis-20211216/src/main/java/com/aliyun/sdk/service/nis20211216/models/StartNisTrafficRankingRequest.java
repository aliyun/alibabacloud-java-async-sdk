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
 * {@link StartNisTrafficRankingRequest} extends {@link RequestModel}
 *
 * <p>StartNisTrafficRankingRequest</p>
 */
public class StartNisTrafficRankingRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageInterval")
    private Integer storageInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    private Integer topN;

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

    private StartNisTrafficRankingRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.groupBy = builder.groupBy;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.regionNo = builder.regionNo;
        this.sort = builder.sort;
        this.storageInterval = builder.storageInterval;
        this.topN = builder.topN;
        this.trafficAnalyzerId = builder.trafficAnalyzerId;
        this.trafficScenario = builder.trafficScenario;
        this.tupleDimension = builder.tupleDimension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartNisTrafficRankingRequest create() {
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
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return storageInterval
     */
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
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

    public static final class Builder extends Request.Builder<StartNisTrafficRankingRequest, Builder> {
        private Long beginTime; 
        private String direction; 
        private Long endTime; 
        private java.util.List<Filter> filter; 
        private java.util.List<String> groupBy; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String regionNo; 
        private String sort; 
        private Integer storageInterval; 
        private Integer topN; 
        private String trafficAnalyzerId; 
        private String trafficScenario; 
        private String tupleDimension; 

        private Builder() {
            super();
        } 

        private Builder(StartNisTrafficRankingRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.groupBy = request.groupBy;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.regionNo = request.regionNo;
            this.sort = request.sort;
            this.storageInterval = request.storageInterval;
            this.topN = request.topN;
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
         * <p>Out</p>
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
         * GroupBy.
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            String groupByShrink = shrink(groupBy, "GroupBy", "json");
            this.putQueryParameter("GroupBy", groupByShrink);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * <p>Bytes</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
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
         * TopN.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nta-262****ca07f</p>
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
        public StartNisTrafficRankingRequest build() {
            return new StartNisTrafficRankingRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartNisTrafficRankingRequest} extends {@link TeaModel}
     *
     * <p>StartNisTrafficRankingRequest</p>
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
