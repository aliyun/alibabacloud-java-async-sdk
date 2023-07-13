// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsSmspackageOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateCmsSmspackageOrderResponse</p>
 */
public class CreateCmsSmspackageOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCmsSmspackageOrderResponseBody body;

    private CreateCmsSmspackageOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCmsSmspackageOrderResponse create() {
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
    public CreateCmsSmspackageOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCmsSmspackageOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCmsSmspackageOrderResponseBody body);

        @Override
        CreateCmsSmspackageOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCmsSmspackageOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCmsSmspackageOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCmsSmspackageOrderResponse response) {
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
        public Builder body(CreateCmsSmspackageOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCmsSmspackageOrderResponse build() {
            return new CreateCmsSmspackageOrderResponse(this);
        } 

    } 

}
