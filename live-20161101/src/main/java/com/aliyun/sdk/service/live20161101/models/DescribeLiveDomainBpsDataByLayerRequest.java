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
 * {@link DescribeLiveDomainBpsDataByLayerRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainBpsDataByLayerRequest</p>
 */
public class DescribeLiveDomainBpsDataByLayerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNameEn")
    private String ispNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Layer")
    private String layer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNameEn")
    private String locationNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainBpsDataByLayerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.layer = builder.layer;
        this.locationNameEn = builder.locationNameEn;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainBpsDataByLayerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return layer
     */
    public String getLayer() {
        return this.layer;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
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

    public static final class Builder extends Request.Builder<DescribeLiveDomainBpsDataByLayerRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private String ispNameEn; 
        private String layer; 
        private String locationNameEn; 
        private Long ownerId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainBpsDataByLayerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.layer = request.layer;
            this.locationNameEn = request.locationNameEn;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The streaming domain. You can specify multiple domain names by separating them with commas (,). If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>pull.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-16T16:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>300</strong></li>
         * <li><strong>3600</strong></li>
         * <li><strong>86400</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the time range specified by the StartTime and EndTime parameters is smaller than or equal to 3 days, the supported time granularities include 300, 3,600, and 86,400 seconds.</p>
         * </li>
         * <li><p>If the time range is larger than 3 days but smaller than or equal to 31 days, the supported time granularities include 3,600 and 86,400 seconds.</p>
         * </li>
         * <li><p>If the time range is larger than 31 days, the supported time granularity is 86,400 seconds.</p>
         * </li>
         * <li><p>If you specify an invalid value or do not specify this parameter, the default time granularity of 300 seconds is used.</p>
         * </li>
         * </ul>
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
         * <p>The name of the Internet service provider (ISP). If you do not specify this parameter, the data of all ISPs is returned.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query available regions and ISPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tele***</p>
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * <p>The layer at which you want to query the data. Valid values:</p>
         * <ul>
         * <li>IPv4 and IPv6 (network layer)</li>
         * <li>http, https, and quic (application layer)</li>
         * <li>all (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder layer(String layer) {
            this.putQueryParameter("Layer", layer);
            this.layer = layer;
            return this;
        }

        /**
         * <p>The name of the region. If you do not specify this parameter, the data of all regions is returned.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query available regions and ISPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
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
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be displayed in UTC.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the data of the last 24 hours is returned by default. The minimum time granularity is 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-03-15T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeLiveDomainBpsDataByLayerRequest build() {
            return new DescribeLiveDomainBpsDataByLayerRequest(this);
        } 

    } 

}
