// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDetectPornDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDetectPornDataRequest</p>
 */
public class DescribeLiveDetectPornDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Fee")
    private String fee;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Scene")
    private String scene;

    @Query
    @NameInMap("SplitBy")
    private String splitBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Stream")
    private String stream;

    private DescribeLiveDetectPornDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.fee = builder.fee;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.scene = builder.scene;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDetectPornDataRequest create() {
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
     * @return app
     */
    public String getApp() {
        return this.app;
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
     * @return fee
     */
    public String getFee() {
        return this.fee;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
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
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDetectPornDataRequest, Builder> {
        private String regionId; 
        private String app; 
        private String domainName; 
        private String endTime; 
        private String fee; 
        private Long ownerId; 
        private String region; 
        private String scene; 
        private String splitBy; 
        private String startTime; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDetectPornDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.fee = request.fee;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.scene = request.scene;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
            this.stream = request.stream;
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
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
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
         * Fee.
         */
        public Builder fee(String fee) {
            this.putQueryParameter("Fee", fee);
            this.fee = fee;
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
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
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
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DescribeLiveDetectPornDataRequest build() {
            return new DescribeLiveDetectPornDataRequest(this);
        } 

    } 

}
