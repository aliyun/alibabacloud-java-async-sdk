// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditPlaylistRequest} extends {@link RequestModel}
 *
 * <p>EditPlaylistRequest</p>
 */
public class EditPlaylistRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProgramConfig")
    private String programConfig;

    @Query
    @NameInMap("ProgramId")
    @Validation(required = true)
    private String programId;

    @Query
    @NameInMap("ProgramItems")
    @Validation(required = true)
    private String programItems;

    private EditPlaylistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.programConfig = builder.programConfig;
        this.programId = builder.programId;
        this.programItems = builder.programItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditPlaylistRequest create() {
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

    public static final class Builder extends Request.Builder<EditPlaylistRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private String programConfig; 
        private String programId; 
        private String programItems; 

        private Builder() {
            super();
        } 

        private Builder(EditPlaylistRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public EditPlaylistRequest build() {
            return new EditPlaylistRequest(this);
        } 

    } 

}
