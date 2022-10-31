// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistRequest} extends {@link RequestModel}
 *
 * <p>ListPlaylistRequest</p>
 */
public class ListPlaylistRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProgramId")
    private String programId;

    private ListPlaylistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.programId = builder.programId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlaylistRequest create() {
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    public static final class Builder extends Request.Builder<ListPlaylistRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private Integer page; 
        private Integer pageSize; 
        private String programId; 

        private Builder() {
            super();
        } 

        private Builder(ListPlaylistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.pageSize = request.pageSize;
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
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListPlaylistRequest build() {
            return new ListPlaylistRequest(this);
        } 

    } 

}
