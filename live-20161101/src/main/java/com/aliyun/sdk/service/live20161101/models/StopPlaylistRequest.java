// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPlaylistRequest} extends {@link RequestModel}
 *
 * <p>StopPlaylistRequest</p>
 */
public class StopPlaylistRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProgramId")
    @Validation(required = true)
    private String programId;

    private StopPlaylistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPlaylistRequest create() {
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

    public static final class Builder extends Request.Builder<StopPlaylistRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private String programId; 

        private Builder() {
            super();
        } 

        private Builder(StopPlaylistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerId = request.ownerId;
            this.programId = request.programId;
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

        @Override
        public StopPlaylistRequest build() {
            return new StopPlaylistRequest(this);
        } 

    } 

}
