// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListKeywordsRequest} extends {@link RequestModel}
 *
 * <p>ListKeywordsRequest</p>
 */
public class ListKeywordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sort")
    private java.util.Map<String, String> sort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Word")
    private String word;

    private ListKeywordsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.libId = builder.libId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.word = builder.word;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeywordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sort
     */
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    /**
     * @return word
     */
    public String getWord() {
        return this.word;
    }

    public static final class Builder extends Request.Builder<ListKeywordsRequest, Builder> {
        private Integer currentPage; 
        private String libId; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.Map<String, String> sort; 
        private String word; 

        private Builder() {
            super();
        } 

        private Builder(ListKeywordsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.libId = request.libId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.word = request.word;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(java.util.Map<String, String> sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putBodyParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * Word.
         */
        public Builder word(String word) {
            this.putBodyParameter("Word", word);
            this.word = word;
            return this;
        }

        @Override
        public ListKeywordsRequest build() {
            return new ListKeywordsRequest(this);
        } 

    } 

}
