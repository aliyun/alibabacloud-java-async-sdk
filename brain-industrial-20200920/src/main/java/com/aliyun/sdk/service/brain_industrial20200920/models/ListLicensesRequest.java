// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link ListLicensesRequest} extends {@link RequestModel}
 *
 * <p>ListLicensesRequest</p>
 */
public class ListLicensesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryStr")
    private String queryStr;

    private ListLicensesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.queryStr = builder.queryStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLicensesRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryStr
     */
    public String getQueryStr() {
        return this.queryStr;
    }

    public static final class Builder extends Request.Builder<ListLicensesRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String queryStr; 

        private Builder() {
            super();
        } 

        private Builder(ListLicensesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.queryStr = request.queryStr;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryStr.
         */
        public Builder queryStr(String queryStr) {
            this.putBodyParameter("QueryStr", queryStr);
            this.queryStr = queryStr;
            return this;
        }

        @Override
        public ListLicensesRequest build() {
            return new ListLicensesRequest(this);
        } 

    } 

}
