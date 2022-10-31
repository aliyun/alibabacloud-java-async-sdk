// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamDelayConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamDelayConfigRequest</p>
 */
public class SetLiveStreamDelayConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FlvDelay")
    private Integer flvDelay;

    @Query
    @NameInMap("FlvLevel")
    private String flvLevel;

    @Query
    @NameInMap("HlsDelay")
    private Integer hlsDelay;

    @Query
    @NameInMap("HlsLevel")
    private String hlsLevel;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RtmpDelay")
    private Integer rtmpDelay;

    @Query
    @NameInMap("RtmpLevel")
    private String rtmpLevel;

    private SetLiveStreamDelayConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.flvDelay = builder.flvDelay;
        this.flvLevel = builder.flvLevel;
        this.hlsDelay = builder.hlsDelay;
        this.hlsLevel = builder.hlsLevel;
        this.ownerId = builder.ownerId;
        this.rtmpDelay = builder.rtmpDelay;
        this.rtmpLevel = builder.rtmpLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamDelayConfigRequest create() {
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
     * @return flvDelay
     */
    public Integer getFlvDelay() {
        return this.flvDelay;
    }

    /**
     * @return flvLevel
     */
    public String getFlvLevel() {
        return this.flvLevel;
    }

    /**
     * @return hlsDelay
     */
    public Integer getHlsDelay() {
        return this.hlsDelay;
    }

    /**
     * @return hlsLevel
     */
    public String getHlsLevel() {
        return this.hlsLevel;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return rtmpDelay
     */
    public Integer getRtmpDelay() {
        return this.rtmpDelay;
    }

    /**
     * @return rtmpLevel
     */
    public String getRtmpLevel() {
        return this.rtmpLevel;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamDelayConfigRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Integer flvDelay; 
        private String flvLevel; 
        private Integer hlsDelay; 
        private String hlsLevel; 
        private Long ownerId; 
        private Integer rtmpDelay; 
        private String rtmpLevel; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamDelayConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.flvDelay = request.flvDelay;
            this.flvLevel = request.flvLevel;
            this.hlsDelay = request.hlsDelay;
            this.hlsLevel = request.hlsLevel;
            this.ownerId = request.ownerId;
            this.rtmpDelay = request.rtmpDelay;
            this.rtmpLevel = request.rtmpLevel;
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
         * FlvDelay.
         */
        public Builder flvDelay(Integer flvDelay) {
            this.putQueryParameter("FlvDelay", flvDelay);
            this.flvDelay = flvDelay;
            return this;
        }

        /**
         * FlvLevel.
         */
        public Builder flvLevel(String flvLevel) {
            this.putQueryParameter("FlvLevel", flvLevel);
            this.flvLevel = flvLevel;
            return this;
        }

        /**
         * HlsDelay.
         */
        public Builder hlsDelay(Integer hlsDelay) {
            this.putQueryParameter("HlsDelay", hlsDelay);
            this.hlsDelay = hlsDelay;
            return this;
        }

        /**
         * HlsLevel.
         */
        public Builder hlsLevel(String hlsLevel) {
            this.putQueryParameter("HlsLevel", hlsLevel);
            this.hlsLevel = hlsLevel;
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
         * RtmpDelay.
         */
        public Builder rtmpDelay(Integer rtmpDelay) {
            this.putQueryParameter("RtmpDelay", rtmpDelay);
            this.rtmpDelay = rtmpDelay;
            return this;
        }

        /**
         * RtmpLevel.
         */
        public Builder rtmpLevel(String rtmpLevel) {
            this.putQueryParameter("RtmpLevel", rtmpLevel);
            this.rtmpLevel = rtmpLevel;
            return this;
        }

        @Override
        public SetLiveStreamDelayConfigRequest build() {
            return new SetLiveStreamDelayConfigRequest(this);
        } 

    } 

}
