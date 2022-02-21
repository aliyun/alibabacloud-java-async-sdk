// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIndexTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteIndexTemplateResponse</p>
 */
public class DeleteIndexTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIndexTemplateResponseBody body;

    private DeleteIndexTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIndexTemplateResponse create() {
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
    public DeleteIndexTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIndexTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIndexTemplateResponseBody body);

        @Override
        DeleteIndexTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIndexTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIndexTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIndexTemplateResponse response) {
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
        public Builder body(DeleteIndexTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIndexTemplateResponse build() {
            return new DeleteIndexTemplateResponse(this);
        } 

    } 

}
