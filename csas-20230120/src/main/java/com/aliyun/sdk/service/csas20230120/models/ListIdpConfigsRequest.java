// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIdpConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListIdpConfigsRequest</p>
 */
public class ListIdpConfigsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("Include")
    private String include;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    private ListIdpConfigsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.include = builder.include;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdpConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListIdpConfigsRequest, Builder> {
        private Long currentPage; 
        private String include; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIdpConfigsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.include = request.include;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Include.
         */
        public Builder include(String include) {
            this.putQueryParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListIdpConfigsRequest build() {
            return new ListIdpConfigsRequest(this);
        } 

    } 

}
