// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterEpisodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteCasterEpisodeRequest</p>
 */
public class DeleteCasterEpisodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("EpisodeId")
    @Validation(required = true)
    private String episodeId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteCasterEpisodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.episodeId = builder.episodeId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterEpisodeRequest create() {
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
     * @return episodeId
     */
    public String getEpisodeId() {
        return this.episodeId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteCasterEpisodeRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String episodeId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterEpisodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.episodeId = request.episodeId;
            this.ownerId = request.ownerId;
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
         * EpisodeId.
         */
        public Builder episodeId(String episodeId) {
            this.putQueryParameter("EpisodeId", episodeId);
            this.episodeId = episodeId;
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

        @Override
        public DeleteCasterEpisodeRequest build() {
            return new DeleteCasterEpisodeRequest(this);
        } 

    } 

}
