// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteCasterSceneConfigRequest</p>
 */
public class DeleteCasterSceneConfigRequest extends Request {
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
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DeleteCasterSceneConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.sceneId = builder.sceneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterSceneConfigRequest create() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteCasterSceneConfigRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long ownerId; 
        private String sceneId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterSceneConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.sceneId = request.sceneId;
            this.type = request.type;
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
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
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

        @Override
        public DeleteCasterSceneConfigRequest build() {
            return new DeleteCasterSceneConfigRequest(this);
        } 

    } 

}
