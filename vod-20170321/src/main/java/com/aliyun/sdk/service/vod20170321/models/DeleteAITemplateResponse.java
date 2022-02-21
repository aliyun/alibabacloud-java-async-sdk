// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAITemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteAITemplateResponse</p>
 */
public class DeleteAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAITemplateResponseBody body;

    private DeleteAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAITemplateResponse create() {
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
    public DeleteAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAITemplateResponseBody body);

        @Override
        DeleteAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAITemplateResponse response) {
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
        public Builder body(DeleteAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAITemplateResponse build() {
            return new DeleteAITemplateResponse(this);
        } 

    } 

}
