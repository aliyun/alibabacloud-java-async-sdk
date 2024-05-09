// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebReportTopIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebReportTopIpRequest</p>
 */
public class DescribeWebReportTopIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Top")
    private Integer top;

    private DescribeWebReportTopIpRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.queryType = builder.queryType;
        this.startTime = builder.startTime;
        this.top = builder.top;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebReportTopIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return top
     */
    public Integer getTop() {
        return this.top;
    }

    public static final class Builder extends Request.Builder<DescribeWebReportTopIpRequest, Builder> {
        private String domain; 
        private Long endTime; 
        private Integer interval; 
        private String queryType; 
        private Long startTime; 
        private Integer top; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebReportTopIpRequest request) {
            super(request);
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.queryType = request.queryType;
            this.startTime = request.startTime;
            this.top = request.top;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Top.
         */
        public Builder top(Integer top) {
            this.putQueryParameter("Top", top);
            this.top = top;
            return this;
        }

        @Override
        public DescribeWebReportTopIpRequest build() {
            return new DescribeWebReportTopIpRequest(this);
        } 

    } 

}
