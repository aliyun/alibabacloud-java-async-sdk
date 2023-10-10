// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListConfigTemplatesRequest</p>
 */
public class ListConfigTemplatesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private ListConfigTemplatesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.id = builder.id;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigTemplatesRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListConfigTemplatesRequest, Builder> {
        private Long currentPage; 
        private Long id; 
        private String name; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigTemplatesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.id = request.id;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of the page to return. Pages start from Page 1.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the configuration template.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the configuration template.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListConfigTemplatesRequest build() {
            return new ListConfigTemplatesRequest(this);
        } 

    } 

}
