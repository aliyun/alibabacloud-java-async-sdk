// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveSnapshotTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveSnapshotTemplatesRequest</p>
 */
public class ListLiveSnapshotTemplatesRequest extends Request {
    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("TemplateIds")
    private java.util.List < String > templateIds;

    @Query
    @NameInMap("Type")
    private String type;

    private ListLiveSnapshotTemplatesRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchKeyWord = builder.searchKeyWord;
        this.sortBy = builder.sortBy;
        this.templateIds = builder.templateIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveSnapshotTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return searchKeyWord
     */
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return templateIds
     */
    public java.util.List < String > getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListLiveSnapshotTemplatesRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchKeyWord; 
        private String sortBy; 
        private java.util.List < String > templateIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveSnapshotTemplatesRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchKeyWord = request.searchKeyWord;
            this.sortBy = request.sortBy;
            this.templateIds = request.templateIds;
            this.type = request.type;
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
         * SearchKeyWord.
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putQueryParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
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
         * TemplateIds.
         */
        public Builder templateIds(java.util.List < String > templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListLiveSnapshotTemplatesRequest build() {
            return new ListLiveSnapshotTemplatesRequest(this);
        } 

    } 

}
