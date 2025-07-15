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
 * {@link DescribeLiveDomainRecordUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainRecordUsageDataRequest</p>
 */
public class DescribeLiveDomainRecordUsageDataRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitBy")
    private String splitBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainRecordUsageDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainRecordUsageDataRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return splitBy
     */
    public String getSplitBy() {
        return this.splitBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainRecordUsageDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private String splitBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainRecordUsageDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The main streaming domain to query.</p>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC. Value requirements:</p>
         * <ul>
         * <li>The end time is later than the start time.</li>
         * <li>The time range between the start time and end time is up to 31 days. If the time range is more than 31 days, the request fails and an error is reported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>60</li>
         * <li>300</li>
         * <li>3600</li>
         * <li>86400</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter or specify an invalid value: The time granularity of the query for a time range that is less than or equal to 31 days is 300 seconds by default. The time granularity of the query for a time range that is more than 31 days is 86400 seconds by default.</p>
         * </blockquote>
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
         * <p>The ID of the region. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
         * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * <p>The key that is used to group data. Valid values:</p>
         * <ul>
         * <li><strong>domain</strong>: groups results by domain name.</li>
         * <li><strong>record_fmt</strong>: groups results by recording type.</li>
         * </ul>
         * <blockquote>
         * <p> You can select one option or both. If you want to select both options, separate them with a comma (,). The default value is <code>domain,record_fmt</code>. If you leave this parameter empty or set the value to <code>null</code>, this parameter is ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>domain,record_fmt</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <ul>
         * <li>The minimum data granularity is 5 minutes.</li>
         * <li>If you do not specify this parameter, the data in the last 24 hours is returned.</li>
         * </ul>
         * <blockquote>
         * <p>The earliest start time that you can specify is 90 days back from the current time, accurate to seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeLiveDomainRecordUsageDataRequest build() {
            return new DescribeLiveDomainRecordUsageDataRequest(this);
        } 

    } 

}
