// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEdgeContainerAppsRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeContainerAppsRequest</p>
 */
public class ListEdgeContainerAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKey")
    private String orderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchType")
    private String searchType;

    private ListEdgeContainerAppsRequest(Builder builder) {
        super(builder);
        this.orderKey = builder.orderKey;
        this.orderType = builder.orderType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.searchType = builder.searchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderKey
     */
    public String getOrderKey() {
        return this.orderKey;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    public static final class Builder extends Request.Builder<ListEdgeContainerAppsRequest, Builder> {
        private String orderKey; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private String searchType; 

        private Builder() {
            super();
        } 

        private Builder(ListEdgeContainerAppsRequest request) {
            super(request);
            this.orderKey = request.orderKey;
            this.orderType = request.orderType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.searchType = request.searchType;
        } 

        /**
         * OrderKey.
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        @Override
        public ListEdgeContainerAppsRequest build() {
            return new ListEdgeContainerAppsRequest(this);
        } 

    } 

}
