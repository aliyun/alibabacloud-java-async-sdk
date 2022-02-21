// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeprecatedTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteDeprecatedTemplateResponse</p>
 */
public class DeleteDeprecatedTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDeprecatedTemplateResponseBody body;

    private DeleteDeprecatedTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDeprecatedTemplateResponse create() {
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
    public DeleteDeprecatedTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDeprecatedTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDeprecatedTemplateResponseBody body);

        @Override
        DeleteDeprecatedTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDeprecatedTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDeprecatedTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDeprecatedTemplateResponse response) {
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
        public Builder body(DeleteDeprecatedTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDeprecatedTemplateResponse build() {
            return new DeleteDeprecatedTemplateResponse(this);
        } 

    } 

}
