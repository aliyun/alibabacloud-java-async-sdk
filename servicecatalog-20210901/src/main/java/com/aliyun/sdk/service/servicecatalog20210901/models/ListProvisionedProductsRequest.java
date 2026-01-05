// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListProvisionedProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionedProductsRequest</p>
 */
public class ListProvisionedProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLevelFilter")
    private String accessLevelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
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
    public java.util.List<Filters> getFilters() {
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
        private java.util.List<Filters> filters; 
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
         * <p>The access filter. Valid values:</p>
         * <ul>
         * <li>User: queries the product instances that are created by the current requester. This is the default value.</li>
         * <li>Account: queries the product instances that belong to the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder accessLevelFilter(String accessLevelFilter) {
            this.putQueryParameter("AccessLevelFilter", accessLevelFilter);
            this.accessLevelFilter = accessLevelFilter;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The field that is used to sort the queried data.</p>
         * <p>Set the value to CreateTime, which specifies the time when the product instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li>Asc: the ascending order.</li>
         * <li>Desc (default): the descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
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

    /**
     * 
     * {@link ListProvisionedProductsRequest} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductsRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the filter condition. Valid values:</p>
             * <ul>
             * <li>ProvisionedProductName: performs exact matches by product instance name. Product instance names are not case-sensitive.</li>
             * <li>FullTextSearch: performs full-text searches by product instance name. Fuzzy match is supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ProvisionedProductName</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-ECS instance</p>
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
