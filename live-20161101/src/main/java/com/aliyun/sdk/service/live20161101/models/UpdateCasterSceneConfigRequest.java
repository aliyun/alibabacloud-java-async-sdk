// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCasterSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCasterSceneConfigRequest</p>
 */
public class UpdateCasterSceneConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("ComponentId")
    private java.util.List < String > componentId;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private String layoutId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private UpdateCasterSceneConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCasterSceneConfigRequest create() {
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
     * @return componentId
     */
    public java.util.List < String > getComponentId() {
        return this.componentId;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateCasterSceneConfigRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private java.util.List < String > componentId; 
        private String layoutId; 
        private Long ownerId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCasterSceneConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.componentId = request.componentId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
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
         * ComponentId.
         */
        public Builder componentId(java.util.List < String > componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
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
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdateCasterSceneConfigRequest build() {
            return new UpdateCasterSceneConfigRequest(this);
        } 

    } 

}
