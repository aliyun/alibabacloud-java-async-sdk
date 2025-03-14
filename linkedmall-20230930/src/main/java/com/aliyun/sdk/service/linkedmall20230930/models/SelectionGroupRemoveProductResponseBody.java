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
 * {@link SelectionGroupRemoveProductResponseBody} extends {@link TeaModel}
 *
 * <p>SelectionGroupRemoveProductResponseBody</p>
 */
public class SelectionGroupRemoveProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("productIds")
    private java.util.List<String> productIds;

    private SelectionGroupRemoveProductResponseBody(Builder builder) {
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectionGroupRemoveProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public static final class Builder {
        private java.util.List<String> productIds; 

        private Builder() {
        } 

        private Builder(SelectionGroupRemoveProductResponseBody model) {
            this.productIds = model.productIds;
        } 

        /**
         * productIds.
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public SelectionGroupRemoveProductResponseBody build() {
            return new SelectionGroupRemoveProductResponseBody(this);
        } 

    } 

}
