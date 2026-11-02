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
    @com.aliyun.core.annotation.NameInMap("CustomFilters")
    private String customFilters;

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
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UtcCreate")
    private String utcCreate;

    private SearchMediaByAILabelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customFilters = builder.customFilters;
        this.matchingMode = builder.matchingMode;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.multimodalSearchType = builder.multimodalSearchType;
        this.namespace = builder.namespace;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchLibName = builder.searchLibName;
        this.sortBy = builder.sortBy;
        this.specificSearch = builder.specificSearch;
        this.text = builder.text;
        this.utcCreate = builder.utcCreate;
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
     * @return customFilters
     */
    public String getCustomFilters() {
        return this.customFilters;
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    /**
     * @return utcCreate
     */
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public static final class Builder extends Request.Builder<SearchMediaByAILabelRequest, Builder> {
        private String regionId; 
        private String customFilters; 
        private String matchingMode; 
        private String mediaId; 
        private String mediaType; 
        private String multimodalSearchType; 
        private String namespace; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchLibName; 
        private String sortBy; 
        private Boolean specificSearch; 
        private String text; 
        private String utcCreate; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByAILabelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customFilters = request.customFilters;
            this.matchingMode = request.matchingMode;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.multimodalSearchType = request.multimodalSearchType;
            this.namespace = request.namespace;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchLibName = request.searchLibName;
            this.sortBy = request.sortBy;
            this.specificSearch = request.specificSearch;
            this.text = request.text;
            this.utcCreate = request.utcCreate;
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
         * <p>The custom filters. The value is a JSON string. Supported fields include the integer field intField1 and the string fields strField1 and strField2. You can select at most one match type for the same field. Filters for different fields use the AND logical operator.</p>
         * <ul>
         * <li>Exact match, such as {&quot;intField1&quot;:12,&quot;strField1&quot;:&quot;abc&quot;}.</li>
         * <li>Multi-value match, such as {&quot;intField1&quot;:[12,13],&quot;strField1&quot;:[&quot;abc&quot;,&quot;cd&quot;]}.</li>
         * <li>Range match, such as {&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13}}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13},&quot;strField2&quot;:[&quot;cd&quot;,&quot;de&quot;],&quot;strField1&quot;:&quot;abc&quot;}</p>
         */
        public Builder customFilters(String customFilters) {
            this.putQueryParameter("CustomFilters", customFilters);
            this.customFilters = customFilters;
            return this;
        }

        /**
         * <p>The matching mode. Default value: fuzzy. Valid values:</p>
         * <ul>
         * <li>fuzzy: fuzzy match.</li>
         * <li>precise: exact match. This mode takes effect only for newly added media assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fuzzy</p>
         */
        public Builder matchingMode(String matchingMode) {
            this.putQueryParameter("MatchingMode", matchingMode);
            this.matchingMode = matchingMode;
            return this;
        }

        /**
         * <p>The media asset ID. This parameter is required for precise search.</p>
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
         * <p>The media asset type. Valid values:</p>
         * <ul>
         * <li>image: images</li>
         * <li>video: videos</li>
         * <li>audio: audio</li>
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
         * <p>The multimodal search type. Default value: FullSearch. Valid values:</p>
         * <ul>
         * <li>PersonName: person name search</li>
         * <li>Ocr: subtitle search</li>
         * <li>AiCategory: AI categorization search</li>
         * <li>FullSearch: full text search</li>
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
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>name-1</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 50.</p>
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
         * <p>The sorting of query results. Valid values:</p>
         * <ul>
         * <li>CreationTime:Desc (default): sorts by creation time in descending order.</li>
         * <li>CreationTime:Asc: sorts by creation time in ascending order.</li>
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
         * <p>Specifies whether to perform a precise search. Valid values:</p>
         * <ul>
         * <li>true: performs a precise search.</li>
         * <li>false: performs a coarse search.</li>
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
         * <p>The search content.</p>
         * 
         * <strong>example:</strong>
         * <p>kite</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>The creation time, in milliseconds. gte indicates greater than or equal to, and lte indicates less than or equal to.</p>
         * <ul>
         * <li>Range match, such as {&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</p>
         */
        public Builder utcCreate(String utcCreate) {
            this.putQueryParameter("UtcCreate", utcCreate);
            this.utcCreate = utcCreate;
            return this;
        }

        @Override
        public SearchMediaByAILabelRequest build() {
            return new SearchMediaByAILabelRequest(this);
        } 

    } 

}
