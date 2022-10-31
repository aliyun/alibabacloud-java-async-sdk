// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidLiveStreamRequest} extends {@link RequestModel}
 *
 * <p>ForbidLiveStreamRequest</p>
 */
public class ForbidLiveStreamRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("LiveStreamType")
    @Validation(required = true)
    private String liveStreamType;

    @Query
    @NameInMap("Oneshot")
    private String oneshot;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResumeTime")
    private String resumeTime;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private ForbidLiveStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.oneshot = builder.oneshot;
        this.ownerId = builder.ownerId;
        this.resumeTime = builder.resumeTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForbidLiveStreamRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return liveStreamType
     */
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    /**
     * @return oneshot
     */
    public String getOneshot() {
        return this.oneshot;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resumeTime
     */
    public String getResumeTime() {
        return this.resumeTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<ForbidLiveStreamRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private String liveStreamType; 
        private String oneshot; 
        private Long ownerId; 
        private String resumeTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(ForbidLiveStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.liveStreamType = request.liveStreamType;
            this.oneshot = request.oneshot;
            this.ownerId = request.ownerId;
            this.resumeTime = request.resumeTime;
            this.streamName = request.streamName;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * LiveStreamType.
         */
        public Builder liveStreamType(String liveStreamType) {
            this.putQueryParameter("LiveStreamType", liveStreamType);
            this.liveStreamType = liveStreamType;
            return this;
        }

        /**
         * Oneshot.
         */
        public Builder oneshot(String oneshot) {
            this.putQueryParameter("Oneshot", oneshot);
            this.oneshot = oneshot;
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
         * ResumeTime.
         */
        public Builder resumeTime(String resumeTime) {
            this.putQueryParameter("ResumeTime", resumeTime);
            this.resumeTime = resumeTime;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public ForbidLiveStreamRequest build() {
            return new ForbidLiveStreamRequest(this);
        } 

    } 

}
