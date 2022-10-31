// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveProducerUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveProducerUsageDataRequest</p>
 */
public class DescribeLiveProducerUsageDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Instance")
    private String instance;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SplitBy")
    private String splitBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("app")
    private String app;

    private DescribeLiveProducerUsageDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.instance = builder.instance;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String domainName; 
        private String endTime; 
        private String instance; 
        private String interval; 
        private Long ownerId; 
        private String region; 
        private String splitBy; 
        private String startTime; 
        private String type; 
        private String app; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveProducerUsageDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.instance = request.instance;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
            this.type = request.type;
            this.app = request.app;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(String instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * Interval.
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SplitBy.
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * app.
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
