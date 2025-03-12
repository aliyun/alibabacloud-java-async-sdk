// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainMax95BpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainMax95BpsDataRequest</p>
 */
public class DescribeDomainMax95BpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cycle")
    private String cycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoint")
    private String timePoint;

    private DescribeDomainMax95BpsDataRequest(Builder builder) {
        super(builder);
        this.cycle = builder.cycle;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainMax95BpsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<DescribeDomainMax95BpsDataRequest, Builder> {
        private String cycle; 
        private String domainName; 
        private String endTime; 
        private String startTime; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainMax95BpsDataRequest request) {
            super(request);
            this.cycle = request.cycle;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.timePoint = request.timePoint;
        } 

        /**
         * <p>The cycle to query the 95th percentile bandwidth data. Default value: <strong>day</strong>. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: queries the 95th percentile bandwidth data by day.</li>
         * <li><strong>month</strong>: queries the 95th percentile bandwidth data by month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        /**
         * <p>The accelerated domain name. If you do not specify a domain name, data of all domain names is queried.</p>
         * <blockquote>
         * <p>You cannot specify multiple domain names in a DescribeDomainMax95BpsData request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-12-22T08:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-21T08:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-21T10:00:00Z</p>
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public DescribeDomainMax95BpsDataRequest build() {
            return new DescribeDomainMax95BpsDataRequest(this);
        } 

    } 

}
