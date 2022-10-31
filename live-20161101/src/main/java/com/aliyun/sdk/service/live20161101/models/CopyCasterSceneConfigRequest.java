// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCasterSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>CopyCasterSceneConfigRequest</p>
 */
public class CopyCasterSceneConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("FromSceneId")
    @Validation(required = true)
    private String fromSceneId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ToSceneId")
    @Validation(required = true)
    private String toSceneId;

    private CopyCasterSceneConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.fromSceneId = builder.fromSceneId;
        this.ownerId = builder.ownerId;
        this.toSceneId = builder.toSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCasterSceneConfigRequest create() {
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
     * @return fromSceneId
     */
    public String getFromSceneId() {
        return this.fromSceneId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return toSceneId
     */
    public String getToSceneId() {
        return this.toSceneId;
    }

    public static final class Builder extends Request.Builder<CopyCasterSceneConfigRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String fromSceneId; 
        private Long ownerId; 
        private String toSceneId; 

        private Builder() {
            super();
        } 

        private Builder(CopyCasterSceneConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.fromSceneId = request.fromSceneId;
            this.ownerId = request.ownerId;
            this.toSceneId = request.toSceneId;
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
         * FromSceneId.
         */
        public Builder fromSceneId(String fromSceneId) {
            this.putQueryParameter("FromSceneId", fromSceneId);
            this.fromSceneId = fromSceneId;
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
         * ToSceneId.
         */
        public Builder toSceneId(String toSceneId) {
            this.putQueryParameter("ToSceneId", toSceneId);
            this.toSceneId = toSceneId;
            return this;
        }

        @Override
        public CopyCasterSceneConfigRequest build() {
            return new CopyCasterSceneConfigRequest(this);
        } 

    } 

}
