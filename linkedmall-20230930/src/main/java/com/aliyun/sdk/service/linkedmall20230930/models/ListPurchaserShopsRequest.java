// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPurchaserShopsRequest} extends {@link RequestModel}
 *
 * <p>ListPurchaserShopsRequest</p>
 */
public class ListPurchaserShopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListPurchaserShopsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPurchaserShopsRequest create() {
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

    public static final class Builder extends Request.Builder<ListPurchaserShopsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPurchaserShopsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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

        @Override
        public ListPurchaserShopsRequest build() {
            return new ListPurchaserShopsRequest(this);
        } 

    } 

}
