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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteCasterEpisodeRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.episodeId = builder.episodeId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCasterEpisodeRequest, Builder> {
        private String casterId; 
        private String episodeId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterEpisodeRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.episodeId = response.episodeId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCasterEpisodeRequest build() {
            return new DeleteCasterEpisodeRequest(this);
        } 

    } 

}
