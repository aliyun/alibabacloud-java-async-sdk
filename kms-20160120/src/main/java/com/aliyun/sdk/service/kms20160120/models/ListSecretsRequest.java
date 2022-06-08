// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretsRequest</p>
 */
public class ListSecretsRequest extends Request {
    @Query
    @NameInMap("FetchTags")
    private String fetchTags;

    @Query
    @NameInMap("Filters")
    private String filters;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListSecretsRequest(Builder builder) {
        super(builder);
        this.fetchTags = builder.fetchTags;
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fetchTags
     */
    public String getFetchTags() {
        return this.fetchTags;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListSecretsRequest, Builder> {
        private String fetchTags; 
        private String filters; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretsRequest request) {
            super(request);
            this.fetchTags = request.fetchTags;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * FetchTags.
         */
        public Builder fetchTags(String fetchTags) {
            this.putQueryParameter("FetchTags", fetchTags);
            this.fetchTags = fetchTags;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListSecretsRequest build() {
            return new ListSecretsRequest(this);
        } 

    } 

}
