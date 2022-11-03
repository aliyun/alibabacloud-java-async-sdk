// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderItemListResponse} extends {@link TeaModel}
 *
 * <p>GetOrderItemListResponse</p>
 */
public class GetOrderItemListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrderItemListResponseBody body;

    private GetOrderItemListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrderItemListResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetOrderItemListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrderItemListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrderItemListResponseBody body);

        @Override
        GetOrderItemListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrderItemListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrderItemListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrderItemListResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetOrderItemListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrderItemListResponse build() {
            return new GetOrderItemListResponse(this);
        } 

    } 

}
