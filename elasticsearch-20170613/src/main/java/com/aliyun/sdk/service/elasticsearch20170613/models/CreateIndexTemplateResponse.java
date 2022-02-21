// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIndexTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateIndexTemplateResponse</p>
 */
public class CreateIndexTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIndexTemplateResponseBody body;

    private CreateIndexTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIndexTemplateResponse create() {
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
    public CreateIndexTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIndexTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIndexTemplateResponseBody body);

        @Override
        CreateIndexTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIndexTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIndexTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIndexTemplateResponse response) {
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
        public Builder body(CreateIndexTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIndexTemplateResponse build() {
            return new CreateIndexTemplateResponse(this);
        } 

    } 

}
