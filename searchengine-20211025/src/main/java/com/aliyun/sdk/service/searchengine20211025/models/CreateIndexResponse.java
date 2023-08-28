// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIndexResponse} extends {@link TeaModel}
 *
 * <p>CreateIndexResponse</p>
 */
public class CreateIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIndexResponseBody body;

    private CreateIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIndexResponse create() {
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
    public CreateIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIndexResponseBody body);

        @Override
        CreateIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIndexResponse response) {
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
        public Builder body(CreateIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIndexResponse build() {
            return new CreateIndexResponse(this);
        } 

    } 

}
