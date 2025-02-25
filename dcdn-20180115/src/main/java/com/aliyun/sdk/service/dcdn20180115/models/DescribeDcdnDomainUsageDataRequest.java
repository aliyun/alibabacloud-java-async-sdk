// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainUsageDataRequest</p>
 */
public class DescribeDcdnDomainUsageDataRequest extends Request {
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

    private DescribeDcdnDomainUsageDataRequest(Builder builder) {
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

    public static DescribeDcdnDomainUsageDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainUsageDataRequest, Builder> {
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

        private Builder(DescribeDcdnDomainUsageDataRequest request) {
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
         * <p>The billable region. Valid values:</p>
         * <ul>
         * <li><strong>CN</strong>: Chinese mainland</li>
         * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
         * <li><strong>AP1</strong>: Asia Pacific 1</li>
         * <li><strong>AP2</strong>: Asia Pacific 2</li>
         * <li><strong>AP3</strong>: Asia Pacific 3</li>
         * <li><strong>NA</strong>: North America</li>
         * <li><strong>SA</strong>: South America</li>
         * <li><strong>EU</strong>: Europe</li>
         * <li><strong>MEAA</strong>: Middle East and Africa</li>
         * <li><strong>all</strong>: all the preceding billable regions</li>
         * </ul>
         * <p>Default value: <strong>CN</strong></p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>The protocol of the data to query. Valid values:</p>
         * <ul>
         * <li><strong>quic</strong>: Quick UDP Internet Connections (QUIC)</li>
         * <li><strong>https</strong>: HTTPS</li>
         * <li><strong>http</strong>: HTTP</li>
         * <li><strong>all</strong>: all the preceding protocols</li>
         * </ul>
         * <p>Default value: <strong>all</strong></p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder dataProtocol(String dataProtocol) {
            this.putQueryParameter("DataProtocol", dataProtocol);
            this.dataProtocol = dataProtocol;
            return this;
        }

        /**
         * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the usage data of all accelerated domain names that belong to your Alibaba Cloud account is returned.</p>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. The maximum time range that can be queried is 31 days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T22:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of data that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>bps</strong>: bandwidth</li>
         * <li><strong>traf</strong>: traffic</li>
         * <li><strong>acc</strong>: requests</li>
         * </ul>
         * <blockquote>
         * <p> <strong>acc</strong> does not support the <strong>Area</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bps</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The time interval between the data entries to return. Unit: seconds.</p>
         * <p>The time interval varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see <strong>Usage notes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The minimum time granularity at which the data is queried is 5 minutes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of the requests. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: static requests</li>
         * <li><strong>dynamic</strong>: dynamic requests</li>
         * <li><strong>all</strong>: all requests</li>
         * </ul>
         * <p>Default value: <strong>all</strong></p>
         * 
         * <strong>example:</strong>
         * <p>dynamic</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDcdnDomainUsageDataRequest build() {
            return new DescribeDcdnDomainUsageDataRequest(this);
        } 

    } 

}
