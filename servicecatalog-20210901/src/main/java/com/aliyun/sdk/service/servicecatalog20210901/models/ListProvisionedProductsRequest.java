// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductsRequest</p>
 */
public class ListProvisionedProductsRequest extends Request {
    @Query
    @NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @Query
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

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

    private ListProvisionedProductsRequest(Builder builder) {
        super(builder);
        this.accessLevelFilter = builder.accessLevelFilter;
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLevelFilter
     */
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    /**
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
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

    public static final class Builder extends Request.Builder<ListProvisionedProductsRequest, Builder> {
        private String accessLevelFilter; 
        private java.util.List < Filters> filters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListProvisionedProductsRequest request) {
            super(request);
            this.accessLevelFilter = request.accessLevelFilter;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * The access filter. Valid values:
         * <p>
         * 
         * *   User: queries the product instances that are created by the current requester. This is the default value.
         * *   Account: queries the product instances that belong to the current Alibaba Cloud account.
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * The filter conditions.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
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
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The field that is used to sort the queried data.
         * <p>
         * 
         * Set the value to CreateTime, which specifies the time when the product instance was created.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sorting method. Valid values:
         * <p>
         * 
         * *   Asc: the ascending order.
         * *   Desc (default): the descending order.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListProvisionedProductsRequest build() {
            return new ListProvisionedProductsRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
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
            private String key; 
            private String value; 

            /**
             * The name of the filter condition. Valid values:
             * <p>
             * 
             * *   ProvisionedProductName: performs exact matches by product instance name. Product instance names are not case-sensitive.
             * *   FullTextSearch: performs full-text searches by product instance name. Fuzzy match is supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the filter condition.
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
