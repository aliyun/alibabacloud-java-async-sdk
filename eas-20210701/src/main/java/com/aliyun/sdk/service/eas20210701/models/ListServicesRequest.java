// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Sort")
    private String sort;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private String filter; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.filter = request.filter;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sort = request.sort;
        } 

        /**
         * ????????????????????????????????????????????????????????????
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * ???????????????????????????1???
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ???????????????????????????100???
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ???????????? ???????????????????????????????????????
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

}
