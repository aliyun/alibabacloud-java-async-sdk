// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidLiveCustomStreamRequest} extends {@link RequestModel}
 *
 * <p>ForbidLiveCustomStreamRequest</p>
 */
public class ForbidLiveCustomStreamRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Appid")
    private String appid;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("LiveStreamType")
    @Validation(required = true)
    private String liveStreamType;

    @Query
    @NameInMap("Needwm")
    private String needwm;

    @Query
    @NameInMap("Oneshot")
    private String oneshot;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Ratio")
    private String ratio;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResumeTime")
    private String resumeTime;

    @Query
    @NameInMap("Sphd")
    private String sphd;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    @Query
    @NameInMap("Styp")
    private String styp;

    private ForbidLiveCustomStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appid = builder.appid;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.needwm = builder.needwm;
        this.oneshot = builder.oneshot;
        this.ownerId = builder.ownerId;
        this.ratio = builder.ratio;
        this.regionId = builder.regionId;
        this.resumeTime = builder.resumeTime;
        this.sphd = builder.sphd;
        this.streamName = builder.streamName;
        this.styp = builder.styp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForbidLiveCustomStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appid
     */
    public String getAppid() {
        return this.appid;
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
     * @return needwm
     */
    public String getNeedwm() {
        return this.needwm;
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
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resumeTime
     */
    public String getResumeTime() {
        return this.resumeTime;
    }

    /**
     * @return sphd
     */
    public String getSphd() {
        return this.sphd;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return styp
     */
    public String getStyp() {
        return this.styp;
    }

    public static final class Builder extends Request.Builder<ForbidLiveCustomStreamRequest, Builder> {
        private String appName; 
        private String appid; 
        private String domainName; 
        private String liveStreamType; 
        private String needwm; 
        private String oneshot; 
        private Long ownerId; 
        private String ratio; 
        private String regionId; 
        private String resumeTime; 
        private String sphd; 
        private String streamName; 
        private String styp; 

        private Builder() {
            super();
        } 

        private Builder(ForbidLiveCustomStreamRequest response) {
            super(response);
            this.appName = response.appName;
            this.appid = response.appid;
            this.domainName = response.domainName;
            this.liveStreamType = response.liveStreamType;
            this.needwm = response.needwm;
            this.oneshot = response.oneshot;
            this.ownerId = response.ownerId;
            this.ratio = response.ratio;
            this.regionId = response.regionId;
            this.resumeTime = response.resumeTime;
            this.sphd = response.sphd;
            this.streamName = response.streamName;
            this.styp = response.styp;
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
         * Appid.
         */
        public Builder appid(String appid) {
            this.putQueryParameter("Appid", appid);
            this.appid = appid;
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
         * Needwm.
         */
        public Builder needwm(String needwm) {
            this.putQueryParameter("Needwm", needwm);
            this.needwm = needwm;
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
         * Ratio.
         */
        public Builder ratio(String ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
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
         * ResumeTime.
         */
        public Builder resumeTime(String resumeTime) {
            this.putQueryParameter("ResumeTime", resumeTime);
            this.resumeTime = resumeTime;
            return this;
        }

        /**
         * Sphd.
         */
        public Builder sphd(String sphd) {
            this.putQueryParameter("Sphd", sphd);
            this.sphd = sphd;
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

        /**
         * Styp.
         */
        public Builder styp(String styp) {
            this.putQueryParameter("Styp", styp);
            this.styp = styp;
            return this;
        }

        @Override
        public ForbidLiveCustomStreamRequest build() {
            return new ForbidLiveCustomStreamRequest(this);
        } 

    } 

}
