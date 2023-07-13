// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateCmsOrderResponse</p>
 */
public class CreateCmsOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCmsOrderResponseBody body;

    private CreateCmsOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCmsOrderResponse create() {
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
    public CreateCmsOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCmsOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCmsOrderResponseBody body);

        @Override
        CreateCmsOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCmsOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCmsOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCmsOrderResponse response) {
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
        public Builder body(CreateCmsOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCmsOrderResponse build() {
            return new CreateCmsOrderResponse(this);
        } 

    } 

}
