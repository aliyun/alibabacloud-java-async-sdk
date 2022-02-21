// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStoreResponse} extends {@link TeaModel}
 *
 * <p>CreateStoreResponse</p>
 */
public class CreateStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStoreResponseBody body;

    private CreateStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStoreResponse create() {
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
    public CreateStoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStoreResponseBody body);

        @Override
        CreateStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStoreResponse response) {
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
        public Builder body(CreateStoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStoreResponse build() {
            return new CreateStoreResponse(this);
        } 

    } 

}
