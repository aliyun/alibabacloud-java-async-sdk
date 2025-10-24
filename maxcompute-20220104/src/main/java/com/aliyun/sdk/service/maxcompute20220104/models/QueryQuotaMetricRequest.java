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
            this.subQuotaNickname = request.subQuotaNickname;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.strategy = request.strategy;
        } 

        /**
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
         * interval.
         */
        public Builder interval(Long interval) {
            this.putBodyParameter("interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * nickname.
         */
        public Builder nickname(String nickname) {
            this.putBodyParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * subQuotaNickname.
         */
        public Builder subQuotaNickname(String subQuotaNickname) {
            this.putBodyParameter("subQuotaNickname", subQuotaNickname);
            this.subQuotaNickname = subQuotaNickname;
            return this;
        }

        /**
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
         * strategy.
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
