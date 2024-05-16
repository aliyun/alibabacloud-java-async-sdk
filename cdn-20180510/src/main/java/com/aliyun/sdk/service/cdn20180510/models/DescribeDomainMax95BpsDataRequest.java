// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The cycle to query the 95th percentile bandwidth data. Default value: **day**. Valid values:
         * <p>
         * 
         * *   **day**: queries the 95th percentile bandwidth data by day.
         * *   **month**: queries the 95th percentile bandwidth data by month.
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        /**
         * The accelerated domain name. If you do not specify a domain name, data of all domain names is queried.
         * <p>
         * 
         * > You cannot specify multiple domain names in a DescribeDomainMax95BpsData request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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
