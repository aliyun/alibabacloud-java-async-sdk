// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterVideoResourceRequest} extends {@link RequestModel}
 *
 * <p>AddCasterVideoResourceRequest</p>
 */
public class AddCasterVideoResourceRequest extends Request {
    @Query
    @NameInMap("BeginOffset")
    private Integer beginOffset;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("EndOffset")
    private Integer endOffset;

    @Query
    @NameInMap("FixedDelayDuration")
    private Integer fixedDelayDuration;

    @Query
    @NameInMap("LiveStreamUrl")
    private String liveStreamUrl;

    @Query
    @NameInMap("LocationId")
    private String locationId;

    @Query
    @NameInMap("MaterialId")
    private String materialId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PtsCallbackInterval")
    private Integer ptsCallbackInterval;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepeatNum")
    @Validation(maximum = 60)
    private Integer repeatNum;

    @Query
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("StreamId")
    private String streamId;

    @Query
    @NameInMap("VodUrl")
    private String vodUrl;

    private AddCasterVideoResourceRequest(Builder builder) {
        super(builder);
        this.beginOffset = builder.beginOffset;
        this.casterId = builder.casterId;
        this.endOffset = builder.endOffset;
        this.fixedDelayDuration = builder.fixedDelayDuration;
        this.liveStreamUrl = builder.liveStreamUrl;
        this.locationId = builder.locationId;
        this.materialId = builder.materialId;
        this.ownerId = builder.ownerId;
        this.ptsCallbackInterval = builder.ptsCallbackInterval;
        this.regionId = builder.regionId;
        this.repeatNum = builder.repeatNum;
        this.resourceName = builder.resourceName;
        this.streamId = builder.streamId;
        this.vodUrl = builder.vodUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterVideoResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginOffset
     */
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return endOffset
     */
    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * @return fixedDelayDuration
     */
    public Integer getFixedDelayDuration() {
        return this.fixedDelayDuration;
    }

    /**
     * @return liveStreamUrl
     */
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    /**
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ptsCallbackInterval
     */
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatNum
     */
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    /**
     * @return vodUrl
     */
    public String getVodUrl() {
        return this.vodUrl;
    }

    public static final class Builder extends Request.Builder<AddCasterVideoResourceRequest, Builder> {
        private Integer beginOffset; 
        private String casterId; 
        private Integer endOffset; 
        private Integer fixedDelayDuration; 
        private String liveStreamUrl; 
        private String locationId; 
        private String materialId; 
        private Long ownerId; 
        private Integer ptsCallbackInterval; 
        private String regionId; 
        private Integer repeatNum; 
        private String resourceName; 
        private String streamId; 
        private String vodUrl; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterVideoResourceRequest response) {
            super(response);
            this.beginOffset = response.beginOffset;
            this.casterId = response.casterId;
            this.endOffset = response.endOffset;
            this.fixedDelayDuration = response.fixedDelayDuration;
            this.liveStreamUrl = response.liveStreamUrl;
            this.locationId = response.locationId;
            this.materialId = response.materialId;
            this.ownerId = response.ownerId;
            this.ptsCallbackInterval = response.ptsCallbackInterval;
            this.regionId = response.regionId;
            this.repeatNum = response.repeatNum;
            this.resourceName = response.resourceName;
            this.streamId = response.streamId;
            this.vodUrl = response.vodUrl;
        } 

        /**
         * BeginOffset.
         */
        public Builder beginOffset(Integer beginOffset) {
            this.putQueryParameter("BeginOffset", beginOffset);
            this.beginOffset = beginOffset;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * EndOffset.
         */
        public Builder endOffset(Integer endOffset) {
            this.putQueryParameter("EndOffset", endOffset);
            this.endOffset = endOffset;
            return this;
        }

        /**
         * FixedDelayDuration.
         */
        public Builder fixedDelayDuration(Integer fixedDelayDuration) {
            this.putQueryParameter("FixedDelayDuration", fixedDelayDuration);
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }

        /**
         * LiveStreamUrl.
         */
        public Builder liveStreamUrl(String liveStreamUrl) {
            this.putQueryParameter("LiveStreamUrl", liveStreamUrl);
            this.liveStreamUrl = liveStreamUrl;
            return this;
        }

        /**
         * LocationId.
         */
        public Builder locationId(String locationId) {
            this.putQueryParameter("LocationId", locationId);
            this.locationId = locationId;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
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
         * PtsCallbackInterval.
         */
        public Builder ptsCallbackInterval(Integer ptsCallbackInterval) {
            this.putQueryParameter("PtsCallbackInterval", ptsCallbackInterval);
            this.ptsCallbackInterval = ptsCallbackInterval;
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
         * RepeatNum.
         */
        public Builder repeatNum(Integer repeatNum) {
            this.putQueryParameter("RepeatNum", repeatNum);
            this.repeatNum = repeatNum;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.putQueryParameter("StreamId", streamId);
            this.streamId = streamId;
            return this;
        }

        /**
         * VodUrl.
         */
        public Builder vodUrl(String vodUrl) {
            this.putQueryParameter("VodUrl", vodUrl);
            this.vodUrl = vodUrl;
            return this;
        }

        @Override
        public AddCasterVideoResourceRequest build() {
            return new AddCasterVideoResourceRequest(this);
        } 

    } 

}
