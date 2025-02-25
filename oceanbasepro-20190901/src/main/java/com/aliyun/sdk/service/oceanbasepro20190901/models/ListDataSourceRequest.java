// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceRequest</p>
 */
public class ListDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maxLength = 150, minLength = 1)
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List < String > types;

    private ListDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.sortField = builder.sortField;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListDataSourceRequest, Builder> {
        private String regionId; 
        private String order; 
        private String pageNumber; 
        private String pageSize; 
        private String searchKey; 
        private String sortField; 
        private java.util.List < String > types; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.sortField = request.sortField;
            this.types = request.types;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            String typesShrink = shrink(types, "Types", "json");
            this.putBodyParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        @Override
        public ListDataSourceRequest build() {
            return new ListDataSourceRequest(this);
        } 

    } 

}
