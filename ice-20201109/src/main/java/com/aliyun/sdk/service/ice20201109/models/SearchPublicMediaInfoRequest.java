// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchPublicMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>SearchPublicMediaInfoRequest</p>
 */
public class SearchPublicMediaInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Authorized")
    private Boolean authorized;

    @Query
    @NameInMap("DynamicMetaDataMatchFields")
    private String dynamicMetaDataMatchFields;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("Favorite")
    private Boolean favorite;

    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    private SearchPublicMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorized = builder.authorized;
        this.dynamicMetaDataMatchFields = builder.dynamicMetaDataMatchFields;
        this.entityId = builder.entityId;
        this.favorite = builder.favorite;
        this.mediaIds = builder.mediaIds;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPublicMediaInfoRequest create() {
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
     * @return authorized
     */
    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * @return dynamicMetaDataMatchFields
     */
    public String getDynamicMetaDataMatchFields() {
        return this.dynamicMetaDataMatchFields;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return favorite
     */
    public Boolean getFavorite() {
        return this.favorite;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SearchPublicMediaInfoRequest, Builder> {
        private String regionId; 
        private Boolean authorized; 
        private String dynamicMetaDataMatchFields; 
        private String entityId; 
        private Boolean favorite; 
        private String mediaIds; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchPublicMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorized = request.authorized;
            this.dynamicMetaDataMatchFields = request.dynamicMetaDataMatchFields;
            this.entityId = request.entityId;
            this.favorite = request.favorite;
            this.mediaIds = request.mediaIds;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
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
         * Authorized.
         */
        public Builder authorized(Boolean authorized) {
            this.putQueryParameter("Authorized", authorized);
            this.authorized = authorized;
            return this;
        }

        /**
         * DynamicMetaDataMatchFields.
         */
        public Builder dynamicMetaDataMatchFields(String dynamicMetaDataMatchFields) {
            this.putQueryParameter("DynamicMetaDataMatchFields", dynamicMetaDataMatchFields);
            this.dynamicMetaDataMatchFields = dynamicMetaDataMatchFields;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * Favorite.
         */
        public Builder favorite(Boolean favorite) {
            this.putQueryParameter("Favorite", favorite);
            this.favorite = favorite;
            return this;
        }

        /**
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public SearchPublicMediaInfoRequest build() {
            return new SearchPublicMediaInfoRequest(this);
        } 

    } 

}
