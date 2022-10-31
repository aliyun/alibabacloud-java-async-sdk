// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistItemsRequest} extends {@link RequestModel}
 *
 * <p>ListPlaylistItemsRequest</p>
 */
public class ListPlaylistItemsRequest extends Request {
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

    @Query
    @NameInMap("ProgramItemIds")
    private String programItemIds;

    private ListPlaylistItemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.programItemIds = builder.programItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlaylistItemsRequest create() {
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

    /**
     * @return programItemIds
     */
    public String getProgramItemIds() {
        return this.programItemIds;
    }

    public static final class Builder extends Request.Builder<ListPlaylistItemsRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private String programId; 
        private String programItemIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPlaylistItemsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerId = request.ownerId;
            this.programId = request.programId;
            this.programItemIds = request.programItemIds;
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

        /**
         * ProgramItemIds.
         */
        public Builder programItemIds(String programItemIds) {
            this.putQueryParameter("ProgramItemIds", programItemIds);
            this.programItemIds = programItemIds;
            return this;
        }

        @Override
        public ListPlaylistItemsRequest build() {
            return new ListPlaylistItemsRequest(this);
        } 

    } 

}
