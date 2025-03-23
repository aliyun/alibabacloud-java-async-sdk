// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Simple")
    private Boolean simple;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.productName = builder.productName;
        this.simple = builder.simple;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return simple
     */
    public Boolean getSimple() {
        return this.simple;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private Integer offset; 
        private String productName; 
        private Boolean simple; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.offset = request.offset;
            this.productName = request.productName;
            this.simple = request.simple;
            this.size = request.size;
        } 

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * Simple.
         */
        public Builder simple(Boolean simple) {
            this.putQueryParameter("Simple", simple);
            this.simple = simple;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
