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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private EditPlaylistRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.programConfig = builder.programConfig;
        this.programId = builder.programId;
        this.programItems = builder.programItems;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EditPlaylistRequest, Builder> {
        private Long ownerId; 
        private String programConfig; 
        private String programId; 
        private String programItems; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EditPlaylistRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.programConfig = response.programConfig;
            this.programId = response.programId;
            this.programItems = response.programItems;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EditPlaylistRequest build() {
            return new EditPlaylistRequest(this);
        } 

    } 

}
