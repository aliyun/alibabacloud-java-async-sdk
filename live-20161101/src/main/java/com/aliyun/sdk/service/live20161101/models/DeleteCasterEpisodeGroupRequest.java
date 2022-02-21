// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterEpisodeGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteCasterEpisodeGroupRequest</p>
 */
public class DeleteCasterEpisodeGroupRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProgramId")
    @Validation(required = true)
    private String programId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteCasterEpisodeGroupRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterEpisodeGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCasterEpisodeGroupRequest, Builder> {
        private Long ownerId; 
        private String programId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterEpisodeGroupRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.programId = response.programId;
            this.regionId = response.regionId;
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
         * ProgramId.
         */
        public Builder programId(String programId) {
            this.putQueryParameter("ProgramId", programId);
            this.programId = programId;
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
        public DeleteCasterEpisodeGroupRequest build() {
            return new DeleteCasterEpisodeGroupRequest(this);
        } 

    } 

}
