// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuctionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAuctionsRequest</p>
 */
public class QueryAuctionsRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 10)
    private Integer pageSize;

    @Body
    @NameInMap("Status")
    private String status;

    private QueryAuctionsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuctionsRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryAuctionsRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuctionsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.status = request.status;
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
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryAuctionsRequest build() {
            return new QueryAuctionsRequest(this);
        } 

    } 

}
