// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGoodsShippingNoticeRequest} extends {@link RequestModel}
 *
 * <p>CreateGoodsShippingNoticeRequest</p>
 */
public class CreateGoodsShippingNoticeRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private GoodsShippingNoticeCreateCmd body;

    private CreateGoodsShippingNoticeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGoodsShippingNoticeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GoodsShippingNoticeCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateGoodsShippingNoticeRequest, Builder> {
        private GoodsShippingNoticeCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateGoodsShippingNoticeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(GoodsShippingNoticeCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateGoodsShippingNoticeRequest build() {
            return new CreateGoodsShippingNoticeRequest(this);
        } 

    } 

}
