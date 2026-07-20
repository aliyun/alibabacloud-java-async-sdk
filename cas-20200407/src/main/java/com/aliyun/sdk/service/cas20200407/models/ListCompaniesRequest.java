// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListCompaniesRequest} extends {@link RequestModel}
 *
 * <p>ListCompaniesRequest</p>
 */
public class ListCompaniesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListCompaniesRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompaniesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCompaniesRequest, Builder> {
        private Long companyId; 
        private Integer currentPage; 
        private String keyword; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCompaniesRequest request) {
            super(request);
            this.companyId = request.companyId;
            this.currentPage = request.currentPage;
            this.keyword = request.keyword;
            this.showSize = request.showSize;
        } 

        /**
         * CompanyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("CompanyId", companyId);
            this.companyId = companyId;
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
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCompaniesRequest build() {
            return new ListCompaniesRequest(this);
        } 

    } 

}
