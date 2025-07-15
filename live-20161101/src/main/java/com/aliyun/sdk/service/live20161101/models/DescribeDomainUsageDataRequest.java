// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Long ownerId; 
        private String regionId; 
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
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
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
         * <li><strong>all</strong>: all regions</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the default value CN is used. Alibaba Cloud supports the following countries and regions outside the Chinese mainland: - Asia Pacific 1: Hong Kong (China), Macao (China), Taiwan (China), Japan, and Southeast Asia excluding Vietnam and Indonesia. - Asia Pacific 2: Indonesia, South Korea, and Vietnam. - Asia Pacific 3: Australia and New Zealand. - North America: US and Canada. - South America: Brazil. Europe: Ukraine, UK, France, Netherlands, Spain, Italy, Sweden, and Germany. - Middle East and Africa: South Africa, Oman, UAE, and Kuwait.</p>
         * </blockquote>
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
         * <li><strong>http</strong>: HTTP</li>
         * <li><strong>https</strong>: HTTPS</li>
         * <li><strong>quic</strong>: QUIC</li>
         * <li><strong>all</strong> (default): HTTP, HTTPS, and QUIC</li>
         * </ul>
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
         * <p>The domain name.</p>
         * <ul>
         * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
         * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
         * </ul>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>The end time must be later than the start time. The maximum time range that you can specify is <strong>31</strong> days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The category of the resource usage data to query. Valid values:</p>
         * <ul>
         * <li><strong>bps</strong>: streaming bandwidth</li>
         * <li><strong>traf</strong>: streaming traffic</li>
         * <li><strong>req_traf</strong>: stream ingest traffic if you set Type to push, or stream relay traffic if you set Type to push_proxy</li>
         * <li><strong>req_bps</strong>: stream ingest bandwidth if you set Type to push, or stream relay bandwidth if you set Type to push_proxy</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>traf</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The time interval between the data entries to return. Unit: seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
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
         * <p>The type of the resource usage data to query.</p>
         * <p>Valid values if you set <strong>Field</strong> to <strong>bps</strong> or <strong>traf</strong>:</p>
         * <ul>
         * <li><strong>rts</strong>: bandwidth or traffic for Real-Time Streaming (RTS)</li>
         * <li><strong>quic</strong>: bandwidth or traffic for QUIC</li>
         * <li><strong>all</strong>: all bandwidth or traffic</li>
         * </ul>
         * <p>Valid values if you set <strong>Field</strong> to <strong>req_traf</strong> or <strong>req_bps</strong>:</p>
         * <ul>
         * <li><strong>push</strong>: stream ingest bandwidth or traffic</li>
         * <li><strong>push_proxy</strong>: stream relay bandwidth or traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
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
