// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteTemplateResponse</p>
 */
public class DeleteTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Status body;

    private DeleteTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTemplateResponse create() {
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
    public Status getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Status body);

        @Override
        DeleteTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Status body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTemplateResponse response) {
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
        public Builder body(Status body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTemplateResponse build() {
            return new DeleteTemplateResponse(this);
        } 

    } 

}
