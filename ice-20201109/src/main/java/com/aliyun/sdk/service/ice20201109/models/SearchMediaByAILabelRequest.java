// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaByAILabelRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByAILabelRequest</p>
 */
public class SearchMediaByAILabelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchingMode")
    private String matchingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultimodalSearchType")
    private String multimodalSearchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecificSearch")
    private Boolean specificSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private SearchMediaByAILabelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.matchingMode = builder.matchingMode;
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
     * @return matchingMode
     */
    public String getMatchingMode() {
        return this.matchingMode;
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
        private String matchingMode; 
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
            this.matchingMode = request.matchingMode;
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
         * MatchingMode.
         */
        public Builder matchingMode(String matchingMode) {
            this.putQueryParameter("MatchingMode", matchingMode);
            this.matchingMode = matchingMode;
            return this;
        }

        /**
         * <p>The ID of the media asset. This parameter is required if you want to query media asset clips.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The type of the media assets. Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>video</li>
         * <li>audio</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The type of query. Valid values:</p>
         * <ul>
         * <li>PersonName: queries media assets based on character names.</li>
         * <li>Ocr: queries media assets based on subtitles.</li>
         * <li>AiCategory: queries media assets based on AI categories.</li>
         * <li>FullSearch (default): queries all media assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ocr</p>
         */
        public Builder multimodalSearchType(String multimodalSearchType) {
            this.putQueryParameter("MultimodalSearchType", multimodalSearchType);
            this.multimodalSearchType = multimodalSearchType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the search library.</p>
         * 
         * <strong>example:</strong>
         * <p>test-1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        /**
         * <p>The sorting method of the results. Valid values:</p>
         * <ul>
         * <li>CreationTime:Desc (default): sorts results in reverse chronological order.</li>
         * <li>CreationTime:Asc: sorts results in chronological order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Specifies whether to query media asset clips. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder specificSearch(Boolean specificSearch) {
            this.putQueryParameter("SpecificSearch", specificSearch);
            this.specificSearch = specificSearch;
            return this;
        }

        /**
         * <p>The content that you want to query.</p>
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
