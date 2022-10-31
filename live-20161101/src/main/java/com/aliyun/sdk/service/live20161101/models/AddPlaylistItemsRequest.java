// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPlaylistItemsRequest} extends {@link RequestModel}
 *
 * <p>AddPlaylistItemsRequest</p>
 */
public class AddPlaylistItemsRequest extends Request {
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
    @NameInMap("ProgramConfig")
    private String programConfig;

    @Query
    @NameInMap("ProgramId")
    private String programId;

    @Query
    @NameInMap("ProgramItems")
    @Validation(required = true)
    private String programItems;

    private AddPlaylistItemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.programConfig = builder.programConfig;
        this.programId = builder.programId;
        this.programItems = builder.programItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPlaylistItemsRequest create() {
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
     * @return programConfig
     */
    public String getProgramConfig() {
        return this.programConfig;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return programItems
     */
    public String getProgramItems() {
        return this.programItems;
    }

    public static final class Builder extends Request.Builder<AddPlaylistItemsRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long ownerId; 
        private String programConfig; 
        private String programId; 
        private String programItems; 

        private Builder() {
            super();
        } 

        private Builder(AddPlaylistItemsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.programConfig = request.programConfig;
            this.programId = request.programId;
            this.programItems = request.programItems;
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
         * ProgramConfig.
         */
        public Builder programConfig(String programConfig) {
            this.putQueryParameter("ProgramConfig", programConfig);
            this.programConfig = programConfig;
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
         * ProgramItems.
         */
        public Builder programItems(String programItems) {
            this.putQueryParameter("ProgramItems", programItems);
            this.programItems = programItems;
            return this;
        }

        @Override
        public AddPlaylistItemsRequest build() {
            return new AddPlaylistItemsRequest(this);
        } 

    } 

}
