// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSelectionProductSaleInfosRequest} extends {@link RequestModel}
 *
 * <p>ListSelectionProductSaleInfosRequest</p>
 */
public class ListSelectionProductSaleInfosRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private ProductSaleInfoListQuery body;

    private ListSelectionProductSaleInfosRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSelectionProductSaleInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ProductSaleInfoListQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListSelectionProductSaleInfosRequest, Builder> {
        private ProductSaleInfoListQuery body; 

        private Builder() {
            super();
        } 

        private Builder(ListSelectionProductSaleInfosRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ProductSaleInfoListQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListSelectionProductSaleInfosRequest build() {
            return new ListSelectionProductSaleInfosRequest(this);
        } 

    } 

}
