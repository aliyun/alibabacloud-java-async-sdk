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
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

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

    private SearchMediaByMultimodalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaType = builder.mediaType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchLibName = builder.searchLibName;
        this.text = builder.text;
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
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

    public static final class Builder extends Request.Builder<SearchMediaByMultimodalRequest, Builder> {
        private String regionId; 
        private String mediaType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchLibName; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByMultimodalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaType = request.mediaType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchLibName = request.searchLibName;
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
         * <p>The type of the media assets.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>video (default)</li>
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
         * <p>The content that you want to query. You can describe the content in natural language.</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SearchMediaByMultimodalRequest build() {
            return new SearchMediaByMultimodalRequest(this);
        } 

    } 

}
