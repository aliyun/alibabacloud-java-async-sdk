// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPlaylistRequest} extends {@link RequestModel}
 *
 * <p>StartPlaylistRequest</p>
 */
public class StartPlaylistRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProgramId")
    @Validation(required = true)
    private String programId;

    @Query
    @NameInMap("ResumeMode")
    private String resumeMode;

    @Query
    @NameInMap("StartItemId")
    private String startItemId;

    private StartPlaylistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.resumeMode = builder.resumeMode;
        this.startItemId = builder.startItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPlaylistRequest create() {
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
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
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
     * @return resumeMode
     */
    public String getResumeMode() {
        return this.resumeMode;
    }

    /**
     * @return startItemId
     */
    public String getStartItemId() {
        return this.startItemId;
    }

    public static final class Builder extends Request.Builder<StartPlaylistRequest, Builder> {
        private String regionId; 
        private Integer offset; 
        private Long ownerId; 
        private String programId; 
        private String resumeMode; 
        private String startItemId; 

        private Builder() {
            super();
        } 

        private Builder(StartPlaylistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.programId = request.programId;
            this.resumeMode = request.resumeMode;
            this.startItemId = request.startItemId;
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
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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

        /**
         * ResumeMode.
         */
        public Builder resumeMode(String resumeMode) {
            this.putQueryParameter("ResumeMode", resumeMode);
            this.resumeMode = resumeMode;
            return this;
        }

        /**
         * StartItemId.
         */
        public Builder startItemId(String startItemId) {
            this.putQueryParameter("StartItemId", startItemId);
            this.startItemId = startItemId;
            return this;
        }

        @Override
        public StartPlaylistRequest build() {
            return new StartPlaylistRequest(this);
        } 

    } 

}
