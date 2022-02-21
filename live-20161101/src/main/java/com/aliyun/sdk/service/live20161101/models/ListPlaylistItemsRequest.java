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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListPlaylistItemsRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.programItemIds = builder.programItemIds;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListPlaylistItemsRequest, Builder> {
        private Long ownerId; 
        private String programId; 
        private String programItemIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListPlaylistItemsRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.programId = response.programId;
            this.programItemIds = response.programItemIds;
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
         * ProgramItemIds.
         */
        public Builder programItemIds(String programItemIds) {
            this.putQueryParameter("ProgramItemIds", programItemIds);
            this.programItemIds = programItemIds;
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
        public ListPlaylistItemsRequest build() {
            return new ListPlaylistItemsRequest(this);
        } 

    } 

}
