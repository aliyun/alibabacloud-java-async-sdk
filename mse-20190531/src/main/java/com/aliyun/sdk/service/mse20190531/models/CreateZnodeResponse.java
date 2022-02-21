// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateZnodeResponse} extends {@link TeaModel}
 *
 * <p>CreateZnodeResponse</p>
 */
public class CreateZnodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateZnodeResponseBody body;

    private CreateZnodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateZnodeResponse create() {
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
    public CreateZnodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateZnodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateZnodeResponseBody body);

        @Override
        CreateZnodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateZnodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateZnodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateZnodeResponse response) {
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
        public Builder body(CreateZnodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateZnodeResponse build() {
            return new CreateZnodeResponse(this);
        } 

    } 

}
