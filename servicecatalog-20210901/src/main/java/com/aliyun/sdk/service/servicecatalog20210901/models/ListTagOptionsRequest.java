// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagOptionsRequest} extends {@link RequestModel}
 *
 * <p>ListTagOptionsRequest</p>
 */
public class ListTagOptionsRequest extends Request {
    @Query
    @NameInMap("Filters")
    private Filters filters;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    private ListTagOptionsRequest(Builder builder) {
        super(builder);
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagOptionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filters
     */
    public Filters getFilters() {
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

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListTagOptionsRequest, Builder> {
        private Filters filters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListTagOptionsRequest request) {
            super(request);
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * The filter condition.
         */
        public Builder filters(Filters filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information based on which you want to sort the query results.
         * <p>
         * 
         * Set the value to CreateTime, which specifies the creation time of tag options.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid values:
         * <p>
         * 
         * *   Asc: the ascending order
         * *   Desc (default): the descending order
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListTagOptionsRequest build() {
            return new ListTagOptionsRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("FullTextSearch")
        private String fullTextSearch;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.active = builder.active;
            this.fullTextSearch = builder.fullTextSearch;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return fullTextSearch
         */
        public String getFullTextSearch() {
            return this.fullTextSearch;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean active; 
            private String fullTextSearch; 
            private String key; 
            private String value; 

            /**
             * Specifies whether to enable the tag option. Valid values:
             * <p>
             * 
             * *   true (default)
             * *   false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The full-text search method.
             */
            public Builder fullTextSearch(String fullTextSearch) {
                this.fullTextSearch = fullTextSearch;
                return this;
            }

            /**
             * The key of the tag option.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag option.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
