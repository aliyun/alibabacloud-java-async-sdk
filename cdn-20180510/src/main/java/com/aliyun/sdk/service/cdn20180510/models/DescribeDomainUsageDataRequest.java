// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainUsageDataRequest</p>
 */
public class DescribeDomainUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataProtocol")
    private String dataProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    @com.aliyun.core.annotation.Validation(required = true)
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDomainUsageDataRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.dataProtocol = builder.dataProtocol;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.interval = builder.interval;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainUsageDataRequest create() {
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
     * @return dataProtocol
     */
    public String getDataProtocol() {
        return this.dataProtocol;
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

    public static final class Builder extends Request.Builder<DescribeDomainUsageDataRequest, Builder> {
        private String area; 
        private String dataProtocol; 
        private String domainName; 
        private String endTime; 
        private String field; 
        private String interval; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainUsageDataRequest request) {
            super(request);
            this.area = request.area;
            this.dataProtocol = request.dataProtocol;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.field = request.field;
            this.interval = request.interval;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * The billable region. Valid values:
         * <p>
         * 
         * *   **CN** (default): inside the Chinese mainland
         * *   **OverSeas**: outside the Chinese mainland
         * *   **AP1**: Asia Pacific 1
         * *   **AP2**: Asia Pacific 2
         * *   **AP3**: Asia Pacific 3
         * *   **NA**: North America
         * *   **SA**: South America
         * *   **EU**: Europe
         * *   **MEAA**: Middle East and Africa
         * *   **all**: all the preceding billable regions
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * The protocol of the data that you want to query. Valid values:
         * <p>
         * 
         * *   **http:** HTTP
         * *   **https:** HTTPS
         * *   **quic**: QUIC
         * *   **all** (default): HTTP, HTTPS, and QUIC
         */
        public Builder dataProtocol(String dataProtocol) {
            this.putQueryParameter("DataProtocol", dataProtocol);
            this.dataProtocol = dataProtocol;
            return this;
        }

        /**
         * The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).
         * <p>
         * 
         * > If you leave this parameter empty, the usage data of all accelerated domain names in your Alibaba Cloud account is returned.
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
         * > The end time must be later than the start time. The maximum time range that can be specified is 31 days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the data that you want to query. Valid values:
         * <p>
         * 
         * *   **bps**: bandwidth
         * *   **traf**: traffic
         * *   **acc**: requests
         * 
         * > If you set this parameter to **acc**, the **Area** parameter is not supported.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * The time granularity of the data entries. Unit: seconds. Valid values: **300** (5 minutes), **3600** (1 hour), and **86400** (1 day).
         * <p>
         * 
         * *   If **Interval** is set to **300**, you can query usage data in the last 6 months. The maximum time range per query that can be specified is 3 days.
         * *   If **Interval** is set to **3600** or **86400**, you can query usage data of the previous year.
         * *   If you leave the **Interval** parameter empty, the maximum time range that you can query is 1 month. If you specify a time range of 1 to 3 days, the time interval between the entries that are returned is 1 hour. If you specify a time range of at least 4 days, the time interval between the entries that are returned is 1 day.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > Data is collected every 5 minutes.
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
         * *   **dynamic**: dynamic content
         * *   **all** (default): both static and dynamic content
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDomainUsageDataRequest build() {
            return new DescribeDomainUsageDataRequest(this);
        } 

    } 

}
