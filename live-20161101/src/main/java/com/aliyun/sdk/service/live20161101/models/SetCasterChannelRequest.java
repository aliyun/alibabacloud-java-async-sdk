// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterChannelRequest} extends {@link RequestModel}
 *
 * <p>SetCasterChannelRequest</p>
 */
public class SetCasterChannelRequest extends Request {
    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("FaceBeauty")
    private String faceBeauty;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayStatus")
    private Integer playStatus;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("SeekOffset")
    private Integer seekOffset;

    private SetCasterChannelRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.channelId = builder.channelId;
        this.faceBeauty = builder.faceBeauty;
        this.ownerId = builder.ownerId;
        this.playStatus = builder.playStatus;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.seekOffset = builder.seekOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return faceBeauty
     */
    public String getFaceBeauty() {
        return this.faceBeauty;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playStatus
     */
    public Integer getPlayStatus() {
        return this.playStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return seekOffset
     */
    public Integer getSeekOffset() {
        return this.seekOffset;
    }

    public static final class Builder extends Request.Builder<SetCasterChannelRequest, Builder> {
        private String casterId; 
        private String channelId; 
        private String faceBeauty; 
        private Long ownerId; 
        private Integer playStatus; 
        private String regionId; 
        private String resourceId; 
        private Integer seekOffset; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterChannelRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.channelId = response.channelId;
            this.faceBeauty = response.faceBeauty;
            this.ownerId = response.ownerId;
            this.playStatus = response.playStatus;
            this.regionId = response.regionId;
            this.resourceId = response.resourceId;
            this.seekOffset = response.seekOffset;
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * FaceBeauty.
         */
        public Builder faceBeauty(String faceBeauty) {
            this.putQueryParameter("FaceBeauty", faceBeauty);
            this.faceBeauty = faceBeauty;
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
         * PlayStatus.
         */
        public Builder playStatus(Integer playStatus) {
            this.putQueryParameter("PlayStatus", playStatus);
            this.playStatus = playStatus;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * SeekOffset.
         */
        public Builder seekOffset(Integer seekOffset) {
            this.putQueryParameter("SeekOffset", seekOffset);
            this.seekOffset = seekOffset;
            return this;
        }

        @Override
        public SetCasterChannelRequest build() {
            return new SetCasterChannelRequest(this);
        } 

    } 

}
