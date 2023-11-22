// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaByAILabelRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByAILabelRequest</p>
 */
public class SearchMediaByAILabelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    @Query
    @NameInMap("MultimodalSearchType")
    private String multimodalSearchType;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchLibName")
    private String searchLibName;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SpecificSearch")
    private Boolean specificSearch;

    @Query
    @NameInMap("Text")
    private String text;

    private SearchMediaByAILabelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.multimodalSearchType = builder.multimodalSearchType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchLibName = builder.searchLibName;
        this.sortBy = builder.sortBy;
        this.specificSearch = builder.specificSearch;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByAILabelRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return multimodalSearchType
     */
    public String getMultimodalSearchType() {
        return this.multimodalSearchType;
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
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return specificSearch
     */
    public Boolean getSpecificSearch() {
        return this.specificSearch;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SearchMediaByAILabelRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String mediaType; 
        private String multimodalSearchType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchLibName; 
        private String sortBy; 
        private Boolean specificSearch; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByAILabelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.multimodalSearchType = request.multimodalSearchType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchLibName = request.searchLibName;
            this.sortBy = request.sortBy;
            this.specificSearch = request.specificSearch;
            this.text = request.text;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * MultimodalSearchType.
         */
        public Builder multimodalSearchType(String multimodalSearchType) {
            this.putQueryParameter("MultimodalSearchType", multimodalSearchType);
            this.multimodalSearchType = multimodalSearchType;
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
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
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

        /**
         * SpecificSearch.
         */
        public Builder specificSearch(Boolean specificSearch) {
            this.putQueryParameter("SpecificSearch", specificSearch);
            this.specificSearch = specificSearch;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SearchMediaByAILabelRequest build() {
            return new SearchMediaByAILabelRequest(this);
        } 

    } 

}
