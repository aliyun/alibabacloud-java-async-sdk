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
 * {@link SearchMediaByMultimodalRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByMultimodalRequest</p>
 */
public class SearchMediaByMultimodalRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFilters")
    private String customFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

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
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UtcCreate")
    private String utcCreate;

    private SearchMediaByMultimodalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customFilters = builder.customFilters;
        this.mediaType = builder.mediaType;
        this.namespace = builder.namespace;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchLibName = builder.searchLibName;
        this.text = builder.text;
        this.utcCreate = builder.utcCreate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByMultimodalRequest create() {
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
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

    public static final class Builder extends Request.Builder<SearchMediaByMultimodalRequest, Builder> {
        private String regionId; 
        private String customFilters; 
        private String mediaType; 
        private String namespace; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchLibName; 
        private String text; 
        private String utcCreate; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByMultimodalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customFilters = request.customFilters;
            this.mediaType = request.mediaType;
            this.namespace = request.namespace;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchLibName = request.searchLibName;
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
         * <p>The custom filters. The value is a JSON string. Supported fields include the integer field intField1 and the string fields strField1 and strField2. You can specify at most one match type for a single field. Filters for different fields are combined by using the AND operator. Examples:</p>
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
         * <p>The media asset type. Default value: video. Valid values:</p>
         * <ul>
         * <li>image: Image.</li>
         * <li>video: Video.</li>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search library.</p>
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
         * <p>The search content. It can be a natural language description.</p>
         * 
         * <strong>example:</strong>
         * <p>Two pandas are fighting</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>The creation time. The value is a timestamp in milliseconds. gte specifies greater than or equal to, and lte specifies less than or equal to. Example:</p>
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
        public SearchMediaByMultimodalRequest build() {
            return new SearchMediaByMultimodalRequest(this);
        } 

    } 

}
