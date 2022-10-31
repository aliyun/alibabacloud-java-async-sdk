// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EffectCasterVideoResourceRequest} extends {@link RequestModel}
 *
 * <p>EffectCasterVideoResourceRequest</p>
 */
public class EffectCasterVideoResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private EffectCasterVideoResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EffectCasterVideoResourceRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<EffectCasterVideoResourceRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long ownerId; 
        private String resourceId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(EffectCasterVideoResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.resourceId = request.resourceId;
            this.sceneId = request.sceneId;
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
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public EffectCasterVideoResourceRequest build() {
            return new EffectCasterVideoResourceRequest(this);
        } 

    } 

}
