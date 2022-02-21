// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePostPayOrderResponse} extends {@link TeaModel}
 *
 * <p>CreatePostPayOrderResponse</p>
 */
public class CreatePostPayOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePostPayOrderResponseBody body;

    private CreatePostPayOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePostPayOrderResponse create() {
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
    public CreatePostPayOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePostPayOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePostPayOrderResponseBody body);

        @Override
        CreatePostPayOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePostPayOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePostPayOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePostPayOrderResponse response) {
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
        public Builder body(CreatePostPayOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePostPayOrderResponse build() {
            return new CreatePostPayOrderResponse(this);
        } 

    } 

}
