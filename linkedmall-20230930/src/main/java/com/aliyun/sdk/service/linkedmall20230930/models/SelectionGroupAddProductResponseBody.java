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
 * {@link SelectionGroupAddProductResponseBody} extends {@link TeaModel}
 *
 * <p>SelectionGroupAddProductResponseBody</p>
 */
public class SelectionGroupAddProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("productIds")
    private java.util.List<String> productIds;

    private SelectionGroupAddProductResponseBody(Builder builder) {
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectionGroupAddProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public static final class Builder {
        private java.util.List<String> productIds; 

        /**
         * productIds.
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public SelectionGroupAddProductResponseBody build() {
            return new SelectionGroupAddProductResponseBody(this);
        } 

    } 

}
