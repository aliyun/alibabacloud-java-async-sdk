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
         * The domain name of the website.
         * <p>
         * 
         * >  A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query the domain names for which forwarding rules are configured.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * >  This UNIX timestamp must indicate a point in time that is accurate to the minute.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The interval at which data is collected. Unit: seconds. Valid values are 300, 3600, and 86400.
         * <p>
         * 
         * *   If the time span between StartTime and EndTime is less than 3 days (3 days excluded), valid values are 300, 3600, and 86400.
         * *   If the time span between StartTime and EndTime is from 3 to 31 days (31 days excluded), valid values are 3600 and 86400.
         * *   If the time span between StartTime and EndTime is 31 days or longer, the valid value is 86400.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The source of the statistics. Valid value:
         * <p>
         * 
         * *   **visit**: indicates all IP addresses.
         * *   **block**: indicates blocked IP addresses.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * >  This UNIX timestamp must indicate a point in time that is accurate to the minute.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The maximum number of entries to return.
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
