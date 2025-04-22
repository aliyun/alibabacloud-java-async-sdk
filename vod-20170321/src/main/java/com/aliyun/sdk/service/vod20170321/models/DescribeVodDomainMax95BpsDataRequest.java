// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainMax95BpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodDomainMax95BpsDataRequest</p>
 */
public class DescribeVodDomainMax95BpsDataRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoint")
    private String timePoint;

    private DescribeVodDomainMax95BpsDataRequest(Builder builder) {
        super(builder);
        this.cycle = builder.cycle;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainMax95BpsDataRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeVodDomainMax95BpsDataRequest, Builder> {
        private String cycle; 
        private String domainName; 
        private String endTime; 
        private Long ownerId; 
        private String startTime; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodDomainMax95BpsDataRequest request) {
            super(request);
            this.cycle = request.cycle;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.timePoint = request.timePoint;
        } 

        /**
         * <p>The cycle to query the 95th percentile bandwidth data. Valid values:</p>
         * <ul>
         * <li>day (default)</li>
         * <li>month</li>
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
         * <p>The domain name to be queried for acceleration. If the parameter is empty, the data merged from all accelerated domain names will be returned by default.</p>
         * <blockquote>
         * <p>Batch domain name queries are not supported.</p>
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
         * <p>End time point. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd&quot;T&quot;HH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-12T13:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Start time point. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd&quot;T&quot;HH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The start time point for getting the data. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd&quot;T&quot;HH:mm:ssZ.</p>
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
        public DescribeVodDomainMax95BpsDataRequest build() {
            return new DescribeVodDomainMax95BpsDataRequest(this);
        } 

    } 

}
