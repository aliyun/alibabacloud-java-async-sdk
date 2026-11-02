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
 * {@link ListLiveSnapshotTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveSnapshotTemplatesRequest</p>
 */
public class ListLiveSnapshotTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private java.util.List<String> templateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
    public java.util.List<String> getTemplateIds() {
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
        private java.util.List<String> templateIds; 
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
         * <p>The page number. Valid values: [1, n). Default value: 1.</p>
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
         * <p>The number of items per page. Valid values: [1, 100]. Default value: 10.</p>
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
         * <p>The search keyword. You can search by template ID or name. Fuzzy match is supported for template names.</p>
         * <ul>
         * <li>The maximum length is 128 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putQueryParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * <p>The sort order. By default, the results are sorted by CreateTime in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The template IDs used for the query.</p>
         * <ul>
         * <li>If SearchKeyWord is specified, this parameter does not take effect.</li>
         * <li>The maximum array length is 200.</li>
         * </ul>
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * <p>The templatetype. By default, all types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
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
