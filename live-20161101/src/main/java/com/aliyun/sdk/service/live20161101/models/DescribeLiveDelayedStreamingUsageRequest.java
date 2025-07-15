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
 * {@link DescribeLiveDelayedStreamingUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDelayedStreamingUsageRequest</p>
 */
public class DescribeLiveDelayedStreamingUsageRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    private DescribeLiveDelayedStreamingUsageRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDelayedStreamingUsageRequest create() {
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

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDelayedStreamingUsageRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private String splitBy; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDelayedStreamingUsageRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. We recommend that you specify a time range that is less than or equal to 10 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>300</li>
         * <li>3600</li>
         * <li>86400</li>
         * </ul>
         * <p>If you specify an invalid value or do not specify this parameter, the default value 3600 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
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
         * <p>The ID of the region. Separate multiple region IDs with commas (,). Valid values:</p>
         * <ul>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-shenzhen: China (Shenzhen)</li>
         * <li>cn-qingdao: China (Qingdao)</li>
         * <li>ap-southeast-1: Singapore</li>
         * <li>eu-central-1: Germany (Frankfurt)</li>
         * <li>ap-northeast-1: Japan (Tokyo)</li>
         * <li>ap-southeast-5: Indonesia (Jakarta)</li>
         * </ul>
         * <p>If you leave this parameter empty, data of all regions is aggregated and returned by default.</p>
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
         * <p>The key that is used to group data. If you leave this parameter empty, data is aggregated and returned. Valid values:</p>
         * <ul>
         * <li>domain: The DomainName parameter in the response takes effect only if SplitBy is set to domain.</li>
         * <li>region: The Region parameter in the response takes effect only if SplitBy is set to region.</li>
         * <li>stream: The StreamName parameter in the response takes effect only if SplitBy is set to stream.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if the parameter corresponding to the value of this parameter is not left empty. Otherwise, an error is returned. For example, you cannot set this parameter to domain if the DomainName parameter is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. By default, data in the last seven days is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the stream. Separate multiple stream names with commas (,). By default, data of all streams is aggregated and returned.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DescribeLiveDelayedStreamingUsageRequest build() {
            return new DescribeLiveDelayedStreamingUsageRequest(this);
        } 

    } 

}
