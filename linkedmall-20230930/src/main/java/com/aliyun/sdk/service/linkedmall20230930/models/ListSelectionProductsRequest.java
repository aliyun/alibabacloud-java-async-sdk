// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSelectionProductsRequest} extends {@link RequestModel}
 *
 * <p>ListSelectionProductsRequest</p>
 */
public class ListSelectionProductsRequest extends Request {
    @Query
    @NameInMap("pageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("purchaserId")
    @Validation(required = true)
    private String purchaserId;

    private ListSelectionProductsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.purchaserId = builder.purchaserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSelectionProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public static final class Builder extends Request.Builder<ListSelectionProductsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String purchaserId; 

        private Builder() {
            super();
        } 

        private Builder(ListSelectionProductsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.purchaserId = request.purchaserId;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.putQueryParameter("purchaserId", purchaserId);
            this.purchaserId = purchaserId;
            return this;
        }

        @Override
        public ListSelectionProductsRequest build() {
            return new ListSelectionProductsRequest(this);
        } 

    } 

}
