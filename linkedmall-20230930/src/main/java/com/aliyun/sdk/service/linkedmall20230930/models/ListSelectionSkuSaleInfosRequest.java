// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSelectionSkuSaleInfosRequest} extends {@link RequestModel}
 *
 * <p>ListSelectionSkuSaleInfosRequest</p>
 */
public class ListSelectionSkuSaleInfosRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private SkuSaleInfoListQuery body;

    private ListSelectionSkuSaleInfosRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSelectionSkuSaleInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SkuSaleInfoListQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListSelectionSkuSaleInfosRequest, Builder> {
        private SkuSaleInfoListQuery body; 

        private Builder() {
            super();
        } 

        private Builder(ListSelectionSkuSaleInfosRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SkuSaleInfoListQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListSelectionSkuSaleInfosRequest build() {
            return new ListSelectionSkuSaleInfosRequest(this);
        } 

    } 

}
