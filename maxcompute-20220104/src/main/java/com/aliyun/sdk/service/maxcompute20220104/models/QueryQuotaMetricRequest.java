// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link QueryQuotaMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryQuotaMetricRequest</p>
 */
public class QueryQuotaMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interval")
    private Long interval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nickname")
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subMetric")
    private String subMetric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subQuotaNickname")
    private String subQuotaNickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("strategy")
    private String strategy;

    private QueryQuotaMetricRequest(Builder builder) {
        super(builder);
        this.metric = builder.metric;
        this.interval = builder.interval;
        this.nickname = builder.nickname;
        this.subMetric = builder.subMetric;
        this.subQuotaNickname = builder.subQuotaNickname;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQuotaMetricRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return subMetric
     */
    public String getSubMetric() {
        return this.subMetric;
    }

    /**
     * @return subQuotaNickname
     */
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<QueryQuotaMetricRequest, Builder> {
        private String metric; 
        private Long interval; 
        private String nickname; 
        private String subMetric; 
        private String subQuotaNickname; 
        private Long endTime; 
        private Long startTime; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(QueryQuotaMetricRequest request) {
            super(request);
            this.metric = request.metric;
            this.interval = request.interval;
            this.nickname = request.nickname;
            this.subMetric = request.subMetric;
            this.subQuotaNickname = request.subQuotaNickname;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.strategy = request.strategy;
        } 

        /**
         * <p>The name of the metric. Valid values: cpu and memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        public Builder metric(String metric) {
            this.putPathParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The fixed interval in seconds. If you leave this parameter empty, the system uses an automatic interval policy.</p>
         * <ul>
         * <li><p>Automatic interval policy: The interval is 60 seconds for a time range within 6 hours, 300 seconds for a time range within 24 hours, 900 seconds for a time range within 72 hours, and 1,800 seconds for a time range longer than 72 hours.</p>
         * </li>
         * <li><p>Specified interval: Valid values are 60, 300, and 900. The query time range must be within 72 hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Long interval) {
            this.putBodyParameter("interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The nickname of the level-1 quota. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_sns_p</p>
         */
        public Builder nickname(String nickname) {
            this.putBodyParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * subMetric.
         */
        public Builder subMetric(String subMetric) {
            this.putBodyParameter("subMetric", subMetric);
            this.subMetric = subMetric;
            return this;
        }

        /**
         * <p>The nickname of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>os_sns</p>
         */
        public Builder subQuotaNickname(String subQuotaNickname) {
            this.putBodyParameter("subQuotaNickname", subQuotaNickname);
            this.subQuotaNickname = subQuotaNickname;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735536322</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735534322</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The aggregation strategy for the data. The default value is max. Valid values: max and avg.</p>
         * <p>Data is collected at one-minute intervals. If you query a long time range, the system may use an interval longer than one minute and aggregate the data. This parameter specifies how the data is aggregated.</p>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public QueryQuotaMetricRequest build() {
            return new QueryQuotaMetricRequest(this);
        } 

    } 

}
