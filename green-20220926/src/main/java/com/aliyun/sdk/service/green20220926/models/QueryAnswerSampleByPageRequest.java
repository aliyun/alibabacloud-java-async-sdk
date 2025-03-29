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
 * {@link QueryAnswerSampleByPageRequest} extends {@link RequestModel}
 *
 * <p>QueryAnswerSampleByPageRequest</p>
 */
public class QueryAnswerSampleByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private java.util.Map<String, String> sort;

    private QueryAnswerSampleByPageRequest(Builder builder) {
        super(builder);
        this.answer = builder.answer;
        this.currentPage = builder.currentPage;
        this.libId = builder.libId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAnswerSampleByPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
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

    public static final class Builder extends Request.Builder<QueryAnswerSampleByPageRequest, Builder> {
        private String answer; 
        private Integer currentPage; 
        private String libId; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.Map<String, String> sort; 

        private Builder() {
            super();
        } 

        private Builder(QueryAnswerSampleByPageRequest request) {
            super(request);
            this.answer = request.answer;
            this.currentPage = request.currentPage;
            this.libId = request.libId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sort = request.sort;
        } 

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.putQueryParameter("Answer", answer);
            this.answer = answer;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putQueryParameter("LibId", libId);
            this.libId = libId;
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
            this.putQueryParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        @Override
        public QueryAnswerSampleByPageRequest build() {
            return new QueryAnswerSampleByPageRequest(this);
        } 

    } 

}
