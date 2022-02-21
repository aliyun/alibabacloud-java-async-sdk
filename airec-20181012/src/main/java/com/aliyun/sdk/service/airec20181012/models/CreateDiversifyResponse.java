// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiversifyResponse} extends {@link TeaModel}
 *
 * <p>CreateDiversifyResponse</p>
 */
public class CreateDiversifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiversifyResponseBody body;

    private CreateDiversifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiversifyResponse create() {
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
    public CreateDiversifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiversifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiversifyResponseBody body);

        @Override
        CreateDiversifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiversifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiversifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiversifyResponse response) {
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
        public Builder body(CreateDiversifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiversifyResponse build() {
            return new CreateDiversifyResponse(this);
        } 

    } 

}
