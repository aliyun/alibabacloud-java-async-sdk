// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterVideoResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterVideoResourceRequest</p>
 */
public class ModifyCasterVideoResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("LiveStreamUrl")
    private String liveStreamUrl;

    @Query
    @NameInMap("MaterialId")
    private String materialId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PtsCallbackInterval")
    private Integer ptsCallbackInterval;

    @Query
    @NameInMap("RepeatNum")
    @Validation(maximum = 60)
    private Integer repeatNum;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Query
    @NameInMap("VodUrl")
    private String vodUrl;

    private ModifyCasterVideoResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginOffset = builder.beginOffset;
        this.casterId = builder.casterId;
        this.endOffset = builder.endOffset;
        this.liveStreamUrl = builder.liveStreamUrl;
        this.materialId = builder.materialId;
        this.ownerId = builder.ownerId;
        this.ptsCallbackInterval = builder.ptsCallbackInterval;
        this.repeatNum = builder.repeatNum;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.vodUrl = builder.vodUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterVideoResourceRequest create() {
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
     * @return liveStreamUrl
     */
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
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
     * @return repeatNum
     */
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return vodUrl
     */
    public String getVodUrl() {
        return this.vodUrl;
    }

    public static final class Builder extends Request.Builder<ModifyCasterVideoResourceRequest, Builder> {
        private String regionId; 
        private Integer beginOffset; 
        private String casterId; 
        private Integer endOffset; 
        private String liveStreamUrl; 
        private String materialId; 
        private Long ownerId; 
        private Integer ptsCallbackInterval; 
        private Integer repeatNum; 
        private String resourceId; 
        private String resourceName; 
        private String vodUrl; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterVideoResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginOffset = request.beginOffset;
            this.casterId = request.casterId;
            this.endOffset = request.endOffset;
            this.liveStreamUrl = request.liveStreamUrl;
            this.materialId = request.materialId;
            this.ownerId = request.ownerId;
            this.ptsCallbackInterval = request.ptsCallbackInterval;
            this.repeatNum = request.repeatNum;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.vodUrl = request.vodUrl;
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
         * LiveStreamUrl.
         */
        public Builder liveStreamUrl(String liveStreamUrl) {
            this.putQueryParameter("LiveStreamUrl", liveStreamUrl);
            this.liveStreamUrl = liveStreamUrl;
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
         * RepeatNum.
         */
        public Builder repeatNum(Integer repeatNum) {
            this.putQueryParameter("RepeatNum", repeatNum);
            this.repeatNum = repeatNum;
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
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
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
        public ModifyCasterVideoResourceRequest build() {
            return new ModifyCasterVideoResourceRequest(this);
        } 

    } 

}
