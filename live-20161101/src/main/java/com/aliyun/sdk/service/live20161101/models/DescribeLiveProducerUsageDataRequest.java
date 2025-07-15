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
 * {@link DescribeLiveProducerUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveProducerUsageDataRequest</p>
 */
public class DescribeLiveProducerUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instance")
    private String instance;

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
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app")
    private String app;

    private DescribeLiveProducerUsageDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.instance = builder.instance;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.app = builder.app;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveProducerUsageDataRequest create() {
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
     * @return instance
     */
    public String getInstance() {
        return this.instance;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    public static final class Builder extends Request.Builder<DescribeLiveProducerUsageDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String instance; 
        private String interval; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private String splitBy; 
        private String startTime; 
        private String type; 
        private String app; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveProducerUsageDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.instance = request.instance;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
            this.type = request.type;
            this.app = request.app;
        } 

        /**
         * <p>The streaming domain of the production studio.</p>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The production studio instance that you want to query. You can specify one or more production studio instances. Separate multiple instances with commas (,).</p>
         * <blockquote>
         * <p> If you do not set this parameter, the usage data of all production studio instances is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a17d0184-462d-4630-b2a6-8c26dde2****</p>
         */
        public Builder instance(String instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * <p>The time granularity for a query. Valid values: 3600 and 86400. Unit: seconds.</p>
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
         * <p>The region in which the domain name resides. If you leave this parameter empty, the data of all regions is returned. You can specify multiple regions by separating them with commas (,).</p>
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
         * <p>The key that is used to group data. You can specify one or more keys. Separate multiple keys with commas (,). Valid values: domain, region, instance, and type. The data for a key that you specify by using the SplitBy parameter is returned by group.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the aggregated data is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of the production studio. You can specify one or more production studio types. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>slidelive</strong>: playlist-mode studio.</li>
         * <li><strong>universal</strong>: general studio.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not set this parameter, the usage data of all types of production studios is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>slidelive</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("app", app);
            this.app = app;
            return this;
        }

        @Override
        public DescribeLiveProducerUsageDataRequest build() {
            return new DescribeLiveProducerUsageDataRequest(this);
        } 

    } 

}
