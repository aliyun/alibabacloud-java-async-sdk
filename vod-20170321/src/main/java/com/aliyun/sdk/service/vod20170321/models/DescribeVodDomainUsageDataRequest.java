// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodDomainUsageDataRequest</p>
 */
public class DescribeVodDomainUsageDataRequest extends Request {
    @Query
    @NameInMap("Area")
    private String area;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Field")
    @Validation(required = true)
    private String field;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeVodDomainUsageDataRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainUsageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
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
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVodDomainUsageDataRequest, Builder> {
        private String area; 
        private String domainName; 
        private String endTime; 
        private String field; 
        private String interval; 
        private Long ownerId; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodDomainUsageDataRequest request) {
            super(request);
            this.area = request.area;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.field = request.field;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * The region where you want to query data. Default value: CN. Valid values:
         * <p>
         * 
         * *   **CN**: Chinese mainland
         * *   **OverSeas**: outside the Chinese mainland
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * The accelerated domain name. If you leave this parameter empty, the merged data of all your accelerated domain names is returned. Separate multiple accelerated domain names with commas (,).
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the data to return. Valid values:
         * <p>
         * 
         * *   **bps**: bandwidth
         * *   **traf**: traffic
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * The time interval between the data entries to return. Unit: seconds. Valid values: **300** (5 minutes), **3600** (1 hour), and **86400** (1 day).
         * <p>
         * 
         * *   If **Interval** is set to **300**, you can query usage data in the last six months. The maximum time range per query that can be specified is three days.
         * *   If **Interval** is set to **3600** or **86400**, you can query usage data of the previous year.
         * *   If you do not set the **Interval** parameter, the maximum time range that you can query is one month. If you specify a time range of 1 to 3 days, the time interval between the entries that are returned is 1 hour. If you specify a time range of at least 4 days, the time interval between the entries that are returned is 1 day.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The type of content that you want to query. Valid values:
         * <p>
         * 
         * *   **static**: static content
         * *   **dynamic**: dynamic requests
         * *   **all**: all content
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVodDomainUsageDataRequest build() {
            return new DescribeVodDomainUsageDataRequest(this);
        } 

    } 

}
