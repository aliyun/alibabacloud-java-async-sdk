// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListVirtualResourceRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualResourceRequest</p>
 */
public class ListVirtualResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    private String virtualResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualResourceName")
    private String virtualResourceName;

    private ListVirtualResourceRequest(Builder builder) {
        super(builder);
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sort = builder.sort;
        this.virtualResourceId = builder.virtualResourceId;
        this.virtualResourceName = builder.virtualResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    /**
     * @return virtualResourceName
     */
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static final class Builder extends Request.Builder<ListVirtualResourceRequest, Builder> {
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sort; 
        private String virtualResourceId; 
        private String virtualResourceName; 

        private Builder() {
            super();
        } 

        private Builder(ListVirtualResourceRequest request) {
            super(request);
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sort = request.sort;
            this.virtualResourceId = request.virtualResourceId;
            this.virtualResourceName = request.virtualResourceName;
        } 

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.putQueryParameter("VirtualResourceId", virtualResourceId);
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        /**
         * <p>The name of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVirtualResource</p>
         */
        public Builder virtualResourceName(String virtualResourceName) {
            this.putQueryParameter("VirtualResourceName", virtualResourceName);
            this.virtualResourceName = virtualResourceName;
            return this;
        }

        @Override
        public ListVirtualResourceRequest build() {
            return new ListVirtualResourceRequest(this);
        } 

    } 

}
