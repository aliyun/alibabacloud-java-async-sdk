// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStressResponse} extends {@link TeaModel}
 *
 * <p>CreateStressResponse</p>
 */
public class CreateStressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStressResponseBody body;

    private CreateStressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStressResponse create() {
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
    public CreateStressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStressResponseBody body);

        @Override
        CreateStressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStressResponse response) {
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
        public Builder body(CreateStressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStressResponse build() {
            return new CreateStressResponse(this);
        } 

    } 

}
