// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ListSelectionProductsRequest} extends {@link RequestModel}
 *
 * <p>ListSelectionProductsRequest</p>
 */
public class ListSelectionProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    private ListSelectionProductsRequest(Builder builder) {
        super(builder);
        this.cursor = builder.cursor;
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
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
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
        private String cursor; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String purchaserId; 

        private Builder() {
            super();
        } 

        private Builder(ListSelectionProductsRequest request) {
            super(request);
            this.cursor = request.cursor;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.purchaserId = request.purchaserId;
        } 

        /**
         * <p>The cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>134412333321</p>
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The current page number. Pages start from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the purchaser.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PID22000009</p>
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
